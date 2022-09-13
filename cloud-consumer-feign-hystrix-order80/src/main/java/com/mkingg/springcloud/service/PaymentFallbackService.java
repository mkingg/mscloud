package com.mkingg.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @auther: mkingg
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfoOK(Integer id) {
        return "***********PaymentFallbackService\tpaymentInfoOK";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "***********PaymentFallbackService\tpaymentInfoTimeOut";
    }
}
