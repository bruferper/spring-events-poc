package com.bfz.events_poc.core.application.port.out.event;

import com.bfz.events_poc.core.domain.model.Offer;

/**
 * @author bruferper
 */

public interface ISystemBEventPublisher {

    void publishCreatedEvent(Offer offer);

}
