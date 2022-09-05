package com.mkingg.springcloud;

import com.mkingg.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author mkingg
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="cloud-payment-service", configuration = MySelfRule.class)
public class MainApp80 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp80.class, args);
    }
}
