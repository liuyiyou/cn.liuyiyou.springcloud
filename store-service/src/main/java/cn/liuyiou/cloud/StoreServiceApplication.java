package cn.liuyiou.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 激活Eureka中的  DiscoveryClient 功能
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class StoreServiceApplication {

	@GetMapping("/")
	public String home(){
		return "store success";
	}

	public static void main(String[] args) {
		SpringApplication.run(StoreServiceApplication.class, args);
	}
}
