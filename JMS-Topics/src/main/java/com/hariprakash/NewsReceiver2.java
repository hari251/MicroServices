package com.hariprakash;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class NewsReceiver2 {
	@JmsListener(destination = "hariprakash", containerFactory = "jmsContainerFactory")
	public void receiveMessage(News news) {
		System.out.println("Receiver2: " + news);
	}
} 