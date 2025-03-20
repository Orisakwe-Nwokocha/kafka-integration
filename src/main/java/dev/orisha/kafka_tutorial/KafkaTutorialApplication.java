package dev.orisha.kafka_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTutorialApplication.class, args);
		System.out.println("Classpath: " + System.getProperty("java.class.path"));
	}

}
