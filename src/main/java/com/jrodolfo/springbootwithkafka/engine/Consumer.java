package com.jrodolfo.springbootwithkafka.engine;

import com.jrodolfo.springbootwithkafka.model.Topic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class Consumer {

    @KafkaListener(topics = Topic.Constants.TOPIC_01_VALUE, groupId = "my-first-application")
    public void consume(String message) throws IOException {
        log.info(String.format("#### -> Consumed message -> %s", message));
    }
}
