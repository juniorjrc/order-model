package com.juniorjrc.ordermodel.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum SupplierEnum {

    AMBEV(BigDecimal.valueOf(10)),
    COCA_COLA(BigDecimal.valueOf(15)),
    HEINEKEN(BigDecimal.valueOf(15.5));

    private final BigDecimal supplierPercentage;
}
