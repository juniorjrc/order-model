package com.juniorjrc.ordermodel.dto;

public record CreateNewOrderProductRequestDTO(
        Long productId,
        Integer quantity
) {
}
