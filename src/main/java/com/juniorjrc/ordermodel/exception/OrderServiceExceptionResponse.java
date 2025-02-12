package com.juniorjrc.ordermodel.exception;

import java.util.Map;

public record OrderServiceExceptionResponse(
        String code,
        String message,
        String details,
        Map<String, String> errors
) {
}
