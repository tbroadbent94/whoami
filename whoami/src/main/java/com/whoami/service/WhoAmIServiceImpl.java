package com.whoami.service;

import com.whoami.request.PersonRequest;
import com.whoami.response.Agify;
import com.whoami.response.Genderizer;
import com.whoami.response.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

@Service
@Slf4j
@Qualifier("whoamiservice")
public class WhoAmIServiceImpl implements WhoAmIService {

    private final String genderizeUrl = "https://api.genderize.io?name=";
    private final String agifyUrl = "https://api.agify.io?name=";


    @Override
    public Person getWhoIAm(PersonRequest personRequest)
    {
        log.info("Initialising Person Object");
        Person person = new Person();

        person.setAge(Optional.ofNullable(returnMyAge(personRequest.getFirst_name()).getAge()).orElse(new Random().nextInt()));
        person.setCountry_code(Optional.ofNullable(personRequest.getCountry_code()).orElse(""));
        person.setGender(Optional.ofNullable(returnMyGender(personRequest.getFirst_name()).getGender()).orElse(""));
        person.setName(Optional.ofNullable(personRequest.getFirst_name()).orElse(""));

        return person;
    }

    private Genderizer returnMyGender(String name)
    {
        log.info("Calling to Genderize.io...");
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity(httpHeaders);

        ResponseEntity<Genderizer> responseEntity = restTemplate.exchange(genderizeUrl+name, HttpMethod.GET, entity, Genderizer.class);
        Genderizer g = responseEntity.getBody();

        return g;
    }

    private Agify returnMyAge(String name)
    {
        log.info("Calling to Agify.io");
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity(httpHeaders);

        ResponseEntity<Agify> responseEntity = restTemplate.exchange(agifyUrl+name, HttpMethod.GET, entity, Agify.class);
        Agify a = responseEntity.getBody();

        return a;

    }

}
