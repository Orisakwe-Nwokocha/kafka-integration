package dev.orisha.kafka_tutorial.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {
        "dev.orisha.user_service.data.repositories",
        "dev.orisha.user_service.repository",
        "dev.orisha.user_service.security.data.repositories"
})
public class JpaConfig {
}
