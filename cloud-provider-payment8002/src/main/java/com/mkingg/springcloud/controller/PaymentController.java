package com.mkingg.springcloud.controller;

import com.mkingg.springcloud.entities.CommonResult;
import com.mkingg.springcloud.entities.Payment;
import com.mkingg.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author mkingg
 * @Description:
 * @create 2022/8/31 17:32
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入操作返回结构：" + result);
        if (result > 0) {
            return new CommonResult<>(200, "插入成功,服务端口：" + serverPort, result);
        } else {
            return new CommonResult<>(444, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果：" + payment);
        if (payment != null) {
            return new CommonResult<>(200, "^_^查询成功,服务端口：" + serverPort, payment);
        } else {
            return new CommonResult<>(444, "查询失败，查询ID：" + id, null);
        }
    }

}
