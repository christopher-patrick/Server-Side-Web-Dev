package edu.cpp.allservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class AllServiceApplication {
	// @Bean to a method means it returns a bean to be managed by Spring context.
	@Bean
	public RestTemplate restTemplate() {
// RestTemplate is the central Spring class for client-side HTTP access.
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(AllServiceApplication.class, args);
	}
}