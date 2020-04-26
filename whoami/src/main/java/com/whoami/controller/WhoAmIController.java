package com.whoami.controller;

import com.whoami.request.PersonRequest;
import com.whoami.response.Person;
import com.whoami.response.PersonResponseEntity;
import com.whoami.service.WhoAmIService;
import com.whoami.validation.StatusUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@Slf4j
@RequestMapping("/whoami")
public class WhoAmIController {

    private WhoAmIService service;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public PersonResponseEntity returnWhoIAm(@RequestBody PersonRequest personRequest)
    {
        log.info("Requesting person...");

        Person person = service.getWhoIAm(personRequest);

        return new PersonResponseEntity(StatusUtils.getResponseCode(person), StatusUtils.getResponseMessage(person), person);
    }
}
