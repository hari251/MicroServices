package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

		Article javaArticle = new Article(101, "Hari Prakash");
		jmsTemplate.convertAndSend("java", javaArticle);

		Article springArticle = new Article(102);
		jmsTemplate.convertAndSend("spring", springArticle);
		
	}
} 