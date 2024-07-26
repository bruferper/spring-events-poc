package com.bfz.events_poc.infrastructure.adapter.in.event.listener;

import com.bfz.events_poc.core.application.port.in.usecase.ISystemBService;
import com.bfz.events_poc.infrastructure.adapter.out.event.model.OfferCreatedEvent;
import com.bfz.events_poc.infrastructure.adapter.out.event.model.SystemACreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author bruferper
 */

@Component
@RequiredArgsConstructor
public class SystemBEventListener {

    private final ISystemBService systemBService;

    @Async
    @EventListener
    void onOfferCreatedEvent(SystemACreatedEvent event) {
        System.out.println(String.format("System B received an offer form System A"));
        systemBService.create();
    }

}
