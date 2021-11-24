package com.example.ferry.controller;

import com.example.ferry.model.User;
import com.example.ferry.service.FerryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ferrywebservice")
public class FerryController {

    @Autowired
    private FerryService ferryService;

    @GetMapping("/getmethod/{str}")
    public String getMessage(@PathVariable String str) {
        String str1 = "Ferry " + str;
        return str1;
    }

    @PostMapping("/saveuser")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User savedUser = ferryService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }

    @GetMapping("/getUserById")
    public User getUser(@RequestParam Integer userId) {
        User user = ferryService.getUserById(userId);
       return user;
    }

     @GetMapping("/getAllusers")
    public List<User> getAllusers() {

        List<User> users = ferryService.getAll();

        return users;

    }

    @PostMapping("/updateUser")
    public User updateUSer(@RequestParam Integer id, @RequestParam String contact) {

        User user = ferryService.updateUser(id,contact);

        return user;
    }

    @DeleteMapping("/deleteUser/{id}")
    public  boolean deleteUser(@PathVariable Integer id) {

        boolean result= ferryService.deleteUser(id);

        return result;
    }



}
