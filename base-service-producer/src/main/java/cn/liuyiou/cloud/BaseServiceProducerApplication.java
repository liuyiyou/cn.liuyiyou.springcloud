package cn.liuyiou.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BaseServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseServiceProducerApplication.class, args);
	}
}