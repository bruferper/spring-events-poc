package com.bfz.events_poc.infrastructure.adapter.in.event.listener;

import com.bfz.events_poc.core.application.port.in.usecase.ISystemAService;
import com.bfz.events_poc.core.application.port.out.event.ISystemAEventPublisher;
import com.bfz.events_poc.infrastructure.adapter.out.event.model.OfferCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author bruferper
 */

@Component
@RequiredArgsConstructor
public class SystemAEventListener {

    private final ISystemAService systemAService;

    @Async
    @EventListener
    void onOfferCreatedEvent(OfferCreatedEvent event) {
        System.out.println(String.format("System A received an offer from Main"));
        systemAService.create();
    }

}
