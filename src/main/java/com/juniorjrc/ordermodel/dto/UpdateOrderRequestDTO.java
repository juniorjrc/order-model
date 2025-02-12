package com.juniorjrc.ordermodel.dto;

import com.juniorjrc.ordermodel.enums.OrderStatusEnum;

import java.math.BigDecimal;

public record UpdateOrderRequestDTO(
        Long orderId,
        BigDecimal orderValue,
        BigDecimal orderFinalValue,
        OrderStatusEnum status
) {
}
