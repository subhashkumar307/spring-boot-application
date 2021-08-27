package com.innomatics.courseapi.controllers.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicControllers {
    // Needing the service to do the logical work (IoC - Inversion of Control)
    //@Autowired
    // private TopicService topicService;
    // http://localhost:8080/getAllTopics
    @RequestMapping(method = RequestMethod.GET, value = "getAllTopics")
    public List<Topic> getAllTopics() {
       return Arrays.asList(
               new Topic("spring", "Spring Boot Framework", "Adding Controllers"),
               new Topic("javaScript", "Dom Manipulation", "Methods - getElementById()"),
               new Topic("java", "Core Java", "Concepts of OOps"),
               new Topic("react", "Components", "Difference b/w class & Function based components")
       );
    }
}
