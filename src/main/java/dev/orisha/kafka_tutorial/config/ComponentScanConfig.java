package dev.orisha.kafka_tutorial.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"dev.orisha.user_service", "com.example.demo"})
public class ComponentScanConfig {
}
