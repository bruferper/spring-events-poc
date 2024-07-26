package com.bfz.events_poc.infrastructure.adapter.in.event.listener;

import com.bfz.events_poc.infrastructure.adapter.out.event.model.SystemBCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author bruferper
 */

@Component
public class OfferEventListener {

    @Async
    @EventListener
    void onSystemBCreated(SystemBCreatedEvent event) {
        System.out.println(String.format("Offer received an offer form System B -> COMPLETED"));
    }

}
