package cn.liuyiou.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
//@EnableFeignClients
@EnableFeignClients(basePackages = "cn.liuyiou.cloud.api")
public class FeighConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeighConsumerApplication.class, args);
    }



}
