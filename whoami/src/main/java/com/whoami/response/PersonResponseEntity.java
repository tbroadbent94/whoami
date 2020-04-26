package com.whoami.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class PersonResponseEntity {

    private int code;
    private String message;
    private Object person;
}
