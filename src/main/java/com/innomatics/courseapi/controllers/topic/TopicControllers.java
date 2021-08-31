package com.innomatics.courseapi.controllers.topic;

import com.innomatics.courseapi.controllers.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TopicControllers {
    // Needing the service to do the logical work (IoC - Inversion of Control)
    @Autowired
    private TopicService topicService;
    // method = GET http://localhost:8080/topics
    @RequestMapping(method = RequestMethod.GET, value = "/topics")
    public List<Topic> getAllTopics() {
       return topicService.getAllTopic();
    }

    // method = GET http://localhost:8080/topic/id
    @RequestMapping(method = RequestMethod.GET, value = "/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    // method = POST http://localhost:8080/topics
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public Topic addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
        return topic;
    }

    // method = PUT http://localhost:8080/topics/id
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
        return topic;
    }

    // method = DELETE http://localhost:8080/topic/id
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public Topic deleteTopic(@PathVariable String id) {
        return topicService.deleteTopic(id);
    }
}
