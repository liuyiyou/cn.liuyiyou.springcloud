package cn.liuyiou.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringCloudApplication
public class RibbonConsumer {

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumer.class, args);
	}


	@Bean
	/**
	 * 开启客户端负载均衡
	 */
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
