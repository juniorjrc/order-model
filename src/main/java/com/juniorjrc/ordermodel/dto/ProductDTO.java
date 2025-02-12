package com.juniorjrc.ordermodel.dto;

import java.math.BigDecimal;

public record ProductDTO(
        Long id,
        String name,
        BigDecimal productValue,
        BigDecimal finalProductValue,
        String supplierName
) {
}
