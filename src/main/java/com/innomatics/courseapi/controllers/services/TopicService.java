
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

    public void updateTopic(String id, Topic topic) {
        // Go through each of the data
        for (int i =0; i<TOPICS.size(); i++) {
            Topic t = TOPICS.get(i);
            // If the accessing data's id is start to the id passed in
            if (t.getId().equals(id)) {
                TOPICS.set(i, topic);
                return;
            }
        }
    }

    public Topic deleteTopic(String id) {
        Topic temp = null;
        for (int i = 0; i < TOPICS.size(); i++) {
            Topic t = TOPICS.get(i);
            if (t.getId().equals(id)) {
                temp = t;
                TOPICS.remove(t);
            }
        }
        return temp;
    }
}