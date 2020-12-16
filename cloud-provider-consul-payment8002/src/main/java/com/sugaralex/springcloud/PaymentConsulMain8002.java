package com.sugaralex.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sugaralex
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulMain8002.class, args);
    }
}
