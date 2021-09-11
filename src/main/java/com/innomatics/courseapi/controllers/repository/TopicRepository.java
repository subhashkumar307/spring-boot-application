package com.innomatics.courseapi.controllers.repository;

import com.innomatics.courseapi.controllers.topic.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
