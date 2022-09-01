package com.mkingg.springcloud.controller;

import com.mkingg.springcloud.entities.CommonResult;
import com.mkingg.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author mkingg
 * @Description:
 */
@RestController
@Slf4j
public class OrderController {

    // public static final String PAYMENTSRV = "http://localhost:8001";
    public static final String PAYMENTSRV = "http://cloud-payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(PAYMENTSRV + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id){
        return restTemplate.getForObject(PAYMENTSRV + "/payment/get/" + id, CommonResult.class, id);
    }
}
