package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Component
public class JavaMsgReceiver {
	  @JmsListener(destination = "java")
	  public void receiveJavaMessage(Article article) {
	    System.out.println("Received: " + article);
	  }
} 