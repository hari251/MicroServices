package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class SpringMsgReceiver {
	@JmsListener(destination = "spring")
	@SendTo("review")
	public Article receiveSpringMessage(Article article) {
		article.setText("Spring JMS Test");
		return article;
	}
}