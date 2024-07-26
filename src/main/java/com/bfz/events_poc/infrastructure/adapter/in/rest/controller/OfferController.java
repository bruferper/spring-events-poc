package com.bfz.events_poc.infrastructure.adapter.in.rest.controller;

import com.bfz.events_poc.core.application.port.in.usecase.IOfferService;
import com.bfz.events_poc.core.domain.model.Offer;
import com.bfz.events_poc.infrastructure.adapter.in.rest.dto.OfferRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bruferper
 */

@RestController
@RequestMapping("/offers")
@RequiredArgsConstructor
public class OfferController {

    private final IOfferService offerService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody OfferRequestDto request) {
        offerService.create(Offer.builder().name(request.name()).build());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
