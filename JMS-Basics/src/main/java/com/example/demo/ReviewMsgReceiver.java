package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Component
public class ReviewMsgReceiver {
	@JmsListener(destination = "review")
	public void reviewMessage(Article article) {
		System.out.println("Received: " + article);
	}
} 