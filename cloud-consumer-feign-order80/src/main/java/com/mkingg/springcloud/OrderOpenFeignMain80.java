package com.mkingg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther: mkingg
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignMain80.class, args);
    }
}
