package com.juniorjrc.ordermodel.dto;

public record OrderNotifierMessageDTO(
        OrderDTO orderDTO,
        String exchange,
        String queue
) {
}
