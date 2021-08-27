package com.innomatics.courseapi.controllers.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllers {

    // Localhost: 8080/
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String sayHello() {
        return "Welcome to the SpringBoot Application!!";
    }

}
