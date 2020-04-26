package com.whoami.validation;

import com.whoami.enums.StatusCode;
import org.springframework.util.ObjectUtils;

public class StatusUtils {

    public static int getResponseCode(final Object object) {
        return ObjectUtils.isEmpty(object) ? StatusCode.THIRDPARTY_FAILURE.getCode() : StatusCode.OK.getCode();
    }

    public static String getResponseMessage(final Object object)
    {
        return ObjectUtils.isEmpty(object) ? StatusCode.THIRDPARTY_FAILURE.getDescription() : StatusCode.OK.getDescription();
    }
}
