package com.juniorjrc.ordermodel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static com.juniorjrc.ordermodel.enums.OrderServiceExceptionEnum.ORDER_SERVICE_BAD_REQUEST;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OrderServiceBadRequestException extends OrderServiceException {

    public OrderServiceBadRequestException(final String message) {
        super(ORDER_SERVICE_BAD_REQUEST, message, HttpStatus.BAD_REQUEST);
    }
}
