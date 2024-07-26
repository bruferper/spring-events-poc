package com.bfz.events_poc.core.application.port.in.usecase.impl;

import com.bfz.events_poc.core.application.port.in.usecase.IOfferService;
import com.bfz.events_poc.core.application.port.out.event.IOfferEventPublisher;
import com.bfz.events_poc.core.domain.model.Offer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author bruferper
 */

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements IOfferService {

    private final IOfferEventPublisher eventPublisher;

    @Override
    public void create(Offer offer) {
        offer.setId(UUID.randomUUID());
        // Other processing steps...
        eventPublisher.publishCreatedEvent(offer);
    }

}
