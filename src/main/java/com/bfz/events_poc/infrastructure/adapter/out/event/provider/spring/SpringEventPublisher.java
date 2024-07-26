package com.bfz.events_poc.infrastructure.adapter.out.event.provider.spring;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author bruferper
 */

@Component
@RequiredArgsConstructor
public class SpringEventPublisher implements ApplicationEventPublisher {

    private final ApplicationEventPublisher eventPublisher;

    @Override
    public void publishEvent(Object event) {
        eventPublisher.publishEvent(event);
    }

}
