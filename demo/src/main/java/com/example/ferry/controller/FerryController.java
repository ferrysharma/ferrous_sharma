package com.example.ferry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ferrywebservice")
public class FerryController {

    @GetMapping("/getmethod/{str}")
    public String getMessage(@PathVariable String str){

        String str1 = "Ferry "+str;

        return str1;
    }

}
