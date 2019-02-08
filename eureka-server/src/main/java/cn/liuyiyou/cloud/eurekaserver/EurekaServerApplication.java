package cn.liuyiyou.cloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 该注解启动一个服务注册中心给其他应用进行对话
 */
@EnableEurekaServer
/**
 * 更加通用，如果使用了Consoule也能进行发现
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
