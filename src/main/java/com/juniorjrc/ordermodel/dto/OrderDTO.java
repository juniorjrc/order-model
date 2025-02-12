package com.juniorjrc.ordermodel.dto;

import com.juniorjrc.ordermodel.enums.OrderStatusEnum;

import java.math.BigDecimal;
import java.util.List;

public record OrderDTO(
        Long id,
        String customerName,
        BigDecimal orderValue,
        BigDecimal orderFinalValue,
        OrderStatusEnum status,
        String errorDetails,
        List<ProductDTO> products
) {
}
