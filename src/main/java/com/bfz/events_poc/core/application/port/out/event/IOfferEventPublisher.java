package com.bfz.events_poc.core.application.port.out.event;

import com.bfz.events_poc.core.domain.model.Offer;

/**
 * @author bruferper
 */

public interface IOfferEventPublisher {

    void publishCreatedEvent(Offer offer);

}
