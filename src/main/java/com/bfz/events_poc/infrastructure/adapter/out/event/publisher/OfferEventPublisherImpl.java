package com.bfz.events_poc.infrastructure.adapter.out.event.publisher;

import com.bfz.events_poc.core.application.port.out.event.IOfferEventPublisher;
import com.bfz.events_poc.core.domain.model.Offer;
import com.bfz.events_poc.infrastructure.adapter.out.event.model.OfferCreatedEvent;
import com.bfz.events_poc.infrastructure.adapter.out.event.provider.spring.SpringEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author bruferper
 */

@Service
@RequiredArgsConstructor
public class OfferEventPublisherImpl implements IOfferEventPublisher {

    private final SpringEventPublisher springEventPublisher;

    @Override
    public void publishCreatedEvent(Offer offer) {
        OfferCreatedEvent event = OfferCreatedEvent.builder()
                .id(offer.getId())
                .name(offer.getName())
                .build();
        springEventPublisher.publishEvent(event);
    }

}
