package com.juniorjrc.ordermodel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static com.juniorjrc.ordermodel.enums.OrderServiceExceptionEnum.ORDER_SERVICE_INTERNAL_SERVER_ERROR;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class OrderServiceInternalServerErrorException extends OrderServiceException {

    public OrderServiceInternalServerErrorException(final String message) {
        super(ORDER_SERVICE_INTERNAL_SERVER_ERROR, message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
