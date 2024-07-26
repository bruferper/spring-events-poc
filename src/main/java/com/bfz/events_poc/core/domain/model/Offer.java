package com.bfz.events_poc.core.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

/**
 * @author bruferper
 */

@Data
@Builder
public class Offer {

    private UUID id;
    private String name;

}
