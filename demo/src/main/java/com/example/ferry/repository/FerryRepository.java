package com.example.ferry.repository;

import com.example.ferry.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FerryRepository extends JpaRepository<User, Integer> {

}
