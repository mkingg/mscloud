package com.mkingg.springcloud.service.impl;

import com.mkingg.springcloud.dao.PaymentDao;
import com.mkingg.springcloud.entities.Payment;
import com.mkingg.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author mkingg
 * @Description:
 * @create 2022/8/31 17:30
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
