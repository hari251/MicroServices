package com.hariprakash;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class NewsReceiver1 {
	
	@JmsListener(destination = "hariprakash", containerFactory = "jmsContainerFactory")
	public void receiveNews(News news) {
		System.out.println("Receiver1: " + news);
	}
} 