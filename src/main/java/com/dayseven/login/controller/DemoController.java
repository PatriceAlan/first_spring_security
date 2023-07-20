package com.dayseven.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/")
public class DemoController {

    @GetMapping("/protected")
    public String helloSecure(){
        return "hello there, but very secure !";
    }

    @GetMapping("/public")
        public String helloUnsecure(){
            return "hello there, but not very secure !";
        }
    @GetMapping("/user")
    public String helloUser(){
        return "hello there, to my authenticated users !";
    }
    @GetMapping("/admin")
    public String helloAdmin(){
        return "hello there, to my verified Admin !";
    }


}
