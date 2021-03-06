package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_ok(Integer id) {
        return "---- paymentInfo_ok";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "--- paymentInfo_timeout";
    }
}
