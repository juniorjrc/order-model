package com.juniorjrc.ordermodel.dto;

public record CreatesNewOrderProductRequestDTO(
        Long productId,
        Integer quantity
) {
}
