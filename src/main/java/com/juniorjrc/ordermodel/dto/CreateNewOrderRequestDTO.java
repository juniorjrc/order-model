package com.juniorjrc.ordermodel.dto;

import java.util.List;

public record CreateNewOrderRequestDTO(
        Long customerId,
        String checksum,
        List<CreatesNewOrderProductRequestDTO> products
) {
}
