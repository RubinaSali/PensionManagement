package com.wipro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PersonalDetailMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(PersonalDetailMicroservice.class, args);
	}

}
