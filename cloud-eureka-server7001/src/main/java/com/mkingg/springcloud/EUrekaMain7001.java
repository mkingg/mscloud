package com.mkingg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author mkingg
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EUrekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EUrekaMain7001.class, args);
    }
}
