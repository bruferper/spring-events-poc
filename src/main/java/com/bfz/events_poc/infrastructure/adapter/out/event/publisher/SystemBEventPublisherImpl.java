package com.bfz.events_poc.infrastructure.adapter.out.event.publisher;

import com.bfz.events_poc.core.application.port.out.event.ISystemBEventPublisher;
import com.bfz.events_poc.core.domain.model.Offer;
import com.bfz.events_poc.infrastructure.adapter.out.event.model.SystemBCreatedEvent;
import com.bfz.events_poc.infrastructure.adapter.out.event.provider.spring.SpringEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author bruferper
 */

@Service
@RequiredArgsConstructor
public class SystemBEventPublisherImpl implements ISystemBEventPublisher {

    private final SpringEventPublisher springEventPublisher;

    @Override
    public void publishCreatedEvent(Offer offer) {
        springEventPublisher.publishEvent(SystemBCreatedEvent.builder().build());
    }

}
