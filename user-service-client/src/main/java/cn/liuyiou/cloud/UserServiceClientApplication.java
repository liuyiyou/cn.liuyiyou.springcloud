package cn.liuyiou.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author liuyiyou
 */

/**
 * 因为UserService是单独编译一个jar包，所以在使用@EnableFeignClients注解时需要指定basePackages的值,否则报错
 * Consider defining a bean of type 'cn.liuyiou.cloud.service.api.Service' in your configuration.
 */
@EnableFeignClients(basePackages = "cn.liuyiou.cloud.service.api")
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceClientApplication.class, args);
    }
}
