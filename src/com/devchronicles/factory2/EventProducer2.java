package com.devchronicles.factory2;

import javax.enterprise.inject.Produces;

import com.devchronicles.observer2.MyEvent;


public class EventProducer2 {
	@Produces
	@MyEvent(MyEvent.Type.LOGGING)
	public String messageAFactory() {
		return "A message";
	}

	@Produces
	@MyEvent(MyEvent.Type.MESSAGE)
	public String messageBFactory() {
		return "Another message";
	}
}
