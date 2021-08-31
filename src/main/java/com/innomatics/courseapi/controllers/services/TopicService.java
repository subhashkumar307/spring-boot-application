
package com.innomatics.courseapi.controllers.services;
import org.springframework.stereotype.Service;

import com.innomatics.courseapi.controllers.topic.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    // Singleton - Block of data
    private List<Topic> TOPICS = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Boot Framework", "Adding Controllers"),
            new Topic("javaScript", "Dom Manipulation", "Methods - getElementById()"),
            new Topic("java", "Core Java", "Concepts of OOps"),
            new Topic("react", "Components", "Difference b/w class & Function based components")
    ));
    // Logical Part of the App
    public List<Topic> getAllTopic() {
        return TOPICS;
    }

    public Topic getTopic(String id) {
       return TOPICS.stream().filter(t ->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        TOPICS.add(topic);
    }
}