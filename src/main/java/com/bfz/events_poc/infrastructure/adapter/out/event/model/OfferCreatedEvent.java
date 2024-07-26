package com.bfz.events_poc.infrastructure.adapter.out.event.model;

import lombok.Builder;

import java.util.UUID;

/**
 * @author bruferper
 */

@Builder
public record OfferCreatedEvent(
        UUID id,
        String name
) { }
