package com.bfz.events_poc.core.application.port.in.usecase.impl;

import com.bfz.events_poc.core.application.port.in.usecase.ISystemAService;
import com.bfz.events_poc.core.application.port.out.event.ISystemAEventPublisher;
import com.bfz.events_poc.core.domain.model.Offer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author bruferper
 */

@Service
@RequiredArgsConstructor
public class SystemAServiceImpl implements ISystemAService {

    private final ISystemAEventPublisher systemAEventPublisher;

    @Override
    public void create() {
        try {
            Thread.sleep(2_000);
            // Other processing steps...
            systemAEventPublisher.publishCreatedEvent(Offer.builder().build());
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
