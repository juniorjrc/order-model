package com.juniorjrc.ordermodel.dto;

public record OrderMessageDTO(
        Long orderId,
        String exchange,
        String queue
) {
}
