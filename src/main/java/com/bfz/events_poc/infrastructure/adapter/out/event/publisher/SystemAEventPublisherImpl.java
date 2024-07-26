package com.bfz.events_poc.infrastructure.adapter.out.event.publisher;

import com.bfz.events_poc.core.application.port.out.event.ISystemAEventPublisher;
import com.bfz.events_poc.core.domain.model.Offer;
import com.bfz.events_poc.infrastructure.adapter.out.event.model.SystemACreatedEvent;
import com.bfz.events_poc.infrastructure.adapter.out.event.provider.spring.SpringEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author bruferper
 */

@Service
@RequiredArgsConstructor
public class SystemAEventPublisherImpl implements ISystemAEventPublisher {

    private final SpringEventPublisher springEventPublisher;

    @Override
    public void publishCreatedEvent(Offer offer) {
        springEventPublisher.publishEvent(SystemACreatedEvent.builder().build());
    }

}
