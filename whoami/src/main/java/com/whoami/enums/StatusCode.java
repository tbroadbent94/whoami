package com.whoami.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum StatusCode {

    OK(1, HttpStatus.OK.name(), "Success"),
    THIRDPARTY_FAILURE(2, HttpStatus.FAILED_DEPENDENCY.name(), "An error has occured with a third party api");

    private int code;
    private String name;
    private String description;
}
