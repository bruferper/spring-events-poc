package com.bfz.events_poc;

import com.bfz.events_poc.infrastructure.adapter.out.event.model.OfferCreatedEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EventsPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsPocApplication.class, args);
	}

	@EventListener
	void onOfferCreatedEvent(OfferCreatedEvent event) {
		System.out.println(String.format("Offer created with ID: %s and name: %s", event.id(), event.name()));
	}

}
