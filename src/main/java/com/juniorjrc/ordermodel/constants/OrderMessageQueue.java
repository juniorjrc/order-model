package com.juniorjrc.ordermodel.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderMessageQueue {
    public static final String ORDER_PROCESSOR_QUEUE = "order-processor-queue";
    public static final String ORDER_SERVICE_EXCHANGE_NAME = "order-service-exchange";
    public static final String ORDER_NOTIFIER_QUEUE = "order-notifier-queue";
}
