package dev.orisha.kafka_tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class KafkaAppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
