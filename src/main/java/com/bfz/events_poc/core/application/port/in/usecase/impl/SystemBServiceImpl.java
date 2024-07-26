package com.bfz.events_poc.core.application.port.in.usecase.impl;

import com.bfz.events_poc.core.application.port.in.usecase.ISystemBService;
import com.bfz.events_poc.core.application.port.out.event.ISystemBEventPublisher;
import com.bfz.events_poc.core.domain.model.Offer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author bruferper
 */

@Service
@RequiredArgsConstructor
public class SystemBServiceImpl implements ISystemBService {

    private final ISystemBEventPublisher systemBEventPublisher;

    @Override
    public void create() {
        try {
            Thread.sleep(2_000);
            // Other processing steps...
            systemBEventPublisher.publishCreatedEvent(Offer.builder().build());
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
