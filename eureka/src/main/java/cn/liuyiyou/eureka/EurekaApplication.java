package cn.liuyiyou.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

	EurekaDiscoveryClient eurekaDiscoveryClient;
	public static void main(String[] args) {

		SpringApplication.run(EurekaApplication.class, args);
	}
}
