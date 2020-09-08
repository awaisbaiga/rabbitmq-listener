package com.example.demo.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Listner {

	
	
//	@RabbitListener(queues = "adminQueue")
	@RabbitListener(queues = "${javainuse.rabbitmq.queue1}")
	public void rMessage(String message) {

	
		System.out.println("Recieved Message From AdminQueue: " + message);	
	
	}
	
//	@RabbitListener(queues = "${javainuse.rabbitmq.{financeQueue}")
//	@RabbitListener(queues = "financeQueue")
	@RabbitListener(queues = "${javainuse.rabbitmq.queue2}")
	public void recievedMessage(String message) {

		System.out.println("Recieved Message From FinanceQueue: " + message);	
	
	}

	
//	@RabbitListener(queues = "marketingQueue")
	@RabbitListener(queues = "${javainuse.rabbitmq.queue3}")
	public void Message(String message) {

		System.out.println("Recieved Message From MarketingQueue: " + message);	
	
	}
		
	
	
	

}
