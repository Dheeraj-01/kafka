package com.producer.service;

import com.producer.config.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public Boolean updateLocation(String location){
        this.kafkaTemplate.send(Constants.LOCATION_TOPIC_NAME, location);
        System.out.println("Location Updated");
        return true;
    }
}
