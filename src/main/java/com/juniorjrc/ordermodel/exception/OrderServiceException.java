package com.juniorjrc.ordermodel.exception;

import com.juniorjrc.ordermodel.enums.OrderServiceExceptionEnum;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class OrderServiceException extends RuntimeException {

    private final OrderServiceExceptionEnum code;
    private final HttpStatus status;

    protected OrderServiceException(OrderServiceExceptionEnum code, String message, HttpStatus status) {
        super(message);
        this.code = code;
        this.status = status;
    }
}
