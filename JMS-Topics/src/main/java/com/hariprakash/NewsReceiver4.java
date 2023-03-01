package com.hariprakash;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class NewsReceiver4 {
	
	@JmsListener(destination = "hariprakash", containerFactory = "jmsContainerFactory")
	public void receiveMessage(News news) {
		System.out.println("Receiver4: " + news);
	}
} 