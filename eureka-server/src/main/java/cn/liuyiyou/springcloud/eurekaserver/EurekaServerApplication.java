package cn.liuyiyou.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 该注解启动一个服务注册中心给其他应用进行对话
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	EurekaDiscoveryClient eurekaDiscoveryClient;


	public static void main(String[] args) {

		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
