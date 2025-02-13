package com.juniorjrc.ordermodel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static com.juniorjrc.ordermodel.enums.OrderServiceExceptionEnum.ORDER_SERVICE_NOT_FOUND;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderServiceNotFoundException extends OrderServiceException {

    public OrderServiceNotFoundException(final String message) {
        super(ORDER_SERVICE_NOT_FOUND, message, HttpStatus.NOT_FOUND);
    }
}
