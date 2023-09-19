package com.consumer.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    @KafkaListener(topics = Constants.LOCATION_TOPIC_NAME, groupId = Constants.GROUP_ID)
    public void updateLocation(String location){
        System.out.println("Updated Location = "+location);
    }
}
