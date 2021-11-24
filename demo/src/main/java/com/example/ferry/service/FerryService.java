package com.example.ferry.service;

import com.example.ferry.model.User;
import com.example.ferry.repository.FerryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FerryService {


    @Autowired
    private FerryRepository ferryRepository;

    public User saveUser(User user) {

        ferryRepository.save(user);

        return user;
    }

    public User getUserById(Integer userId) {
        return ferryRepository.findById(userId).get();
    }

    public List<User> getAll() {

        return ferryRepository.findAll();
    }


    public User updateUser(Integer id, String contact) {

        User user = getUserById(id);

        user.setContact(contact);

        return saveUser(user);


    }

    public boolean deleteUser(Integer id) {

          ferryRepository.deleteById(id);

          return !ferryRepository.existsById(id);

    }
}
