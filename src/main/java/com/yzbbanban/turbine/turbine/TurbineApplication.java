package com.yzbbanban.turbine.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class TurbineApplication {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(TurbineApplication.class).run(args);
		SpringApplication.run(TurbineApplication.class, args);
	}
}
