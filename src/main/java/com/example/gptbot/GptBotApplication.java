package com.example.gptbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GptBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(GptBotApplication.class, args);
	}

}
