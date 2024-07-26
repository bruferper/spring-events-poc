package com.bfz.events_poc.core.application.port.in.usecase;

import com.bfz.events_poc.core.domain.model.Offer;

/**
 * @author bruferper
 */

public interface IOfferService {

    void create(Offer offer);

}
