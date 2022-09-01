package com.mkingg.springcloud.service;

import com.mkingg.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author mkingg
 * @Description:
 * @create 2022/8/31 17:30
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
