package com.devchronicles.observer2;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ejb.TransactionAttributeType;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventServiceName {
	
	@Inject
	@Named("Logging")
	private String messageA;
	
	@Inject
	@Named("Message")
	private String messageB;

	public void startService() {
		System.out.println("Start service call " + messageA);
		System.out.println("Start service call " + messageB);
	}
}
