package com.hariprakash;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MsgReceiver2 {
	
	@JmsListener(destination = "jms", containerFactory = "jmsContainerFactory")
	public void receiveNews(Msg message) {
		System.out.println("Receiver6: " + message);
	}
} 