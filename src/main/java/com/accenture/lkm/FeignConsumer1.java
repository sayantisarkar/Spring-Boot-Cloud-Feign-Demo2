package com.accenture.lkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignConsumer1 {

	public static void main(String[] args){
		SpringApplication.run(FeignConsumer1.class, args);
	}
}