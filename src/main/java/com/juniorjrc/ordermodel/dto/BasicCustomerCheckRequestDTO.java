package com.juniorjrc.ordermodel.dto;

public record BasicCustomerCheckRequestDTO(
        Long customerId,
        String checksum
) {
}
