package com.example.demo;

import com.example.lbRules.MyRules;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 14298
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MyRules.class)
public class CloudConsumerOrder80Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerOrder80Application.class, args);
	}

}
