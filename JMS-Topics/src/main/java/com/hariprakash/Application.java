package com.hariprakash;

import javax.jms.JMSException;
import javax.jms.Topic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
@SpringBootApplication
public class Application {
	public static void main(String[] args) throws JmsException, JMSException {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
		Topic springTopic1 = jmsTemplate.getConnectionFactory().createConnection()
				.createSession().createTopic("hariprakash");
		Topic springTopic2 = jmsTemplate.getConnectionFactory().createConnection()
				.createSession().createTopic("jms");
			
			News news = new News(100, "Recieved Msg Succesfully! Topic_name--> hariprakash");
			jmsTemplate.convertAndSend(springTopic1, news);

			
		    Msg message = new Msg("Connection Established! Topic_name--> jms");
		    jmsTemplate.convertAndSend(springTopic2, message);
			 
		
	}
} 