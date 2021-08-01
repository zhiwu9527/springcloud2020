package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author 14298
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicatin7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicatin7002.class, args);
    }
}
