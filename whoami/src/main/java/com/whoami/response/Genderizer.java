package com.whoami.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Genderizer {
    private String name;
    private String gender;
    private float probability;
    private int count;
}
