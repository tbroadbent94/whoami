package com.whoami.service;

import com.whoami.request.PersonRequest;
import com.whoami.response.Person;

public interface WhoAmIService {

    Person getWhoIAm(PersonRequest personRequest);
}
