package cn.liuyiou.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 激活Eureka中的  DiscoveryClient 功能
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BaseConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
