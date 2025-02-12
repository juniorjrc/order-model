package com.juniorjrc.ordermodel.dto;

import com.juniorjrc.ordermodel.enums.OrderStatusEnum;

public record UpdateOrderStatusRequestDTO(
        OrderStatusEnum status,
        String message
) {
}
