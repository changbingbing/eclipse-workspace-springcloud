package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

//指定Service接口所在的包，开启OpenFeign客户端
@EnableFeignClients(basePackages = "com.example.demo.service")
@SpringCloudApplication
@EnableHystrixDashboard   // 开启Hystrix仪表盘功能
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
