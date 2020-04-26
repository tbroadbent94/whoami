package com.whoami.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Person implements Serializable {

    private String name;
    private String gender;
    private int age;
    private String country_code;
}

