package cn.liuyiou.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author liuyiyou.cn
 *         声明式服务调用
 */

@EnableDiscoveryClient
@SpringBootApplication
public class UserServiceFeighApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceFeighApiApplication.class, args);
    }


}
