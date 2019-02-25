package cn.liuyiou.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * User: liuyiyou
 * Date: 2017/9/21
 * Time: 下午1:34
 */
@RestController
public class BaseConsumerController {

    private Logger logger = LoggerFactory.getLogger(BaseConsumerController.class);
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String index() {
        return "Hello Spring Cloud";
    }

    /**
     * 如果没有在RestTemplate上加上@LoadBanance注解，是不能通过 serviceId+方法名进行调用的 。
     * restTemplate.getForEntity("http://HELLO-SERVICE/base", String.class).getBody();  会报错，找不到host
     *
     * @return
     */
    @GetMapping("/base")
    public String baseSerivce() {
        List<String> services = discoveryClient.getServices();
        if (!services.isEmpty()) {
            ServiceInstance instance = discoveryClient.getInstances("SERVER-PRODUCER").get(0);
            String uri = "http://" + instance.getHost() + ":" + instance.getPort() + "/base-service";
            logger.info("url::{}", uri);
            String result = restTemplate.getForEntity(uri, String.class).getBody();
            return result;
        } else {
            return "no service";
        }
    }

    /**
     * 加上 @LoadBalanced 注解后
     *
     * @return
     */
    @GetMapping("/ribbon-base")
    public String ribbonBase() {
        List<String> services = discoveryClient.getServices();
        if (!services.isEmpty()) {
            String uri = "http://SERVER-PRODUCER/base-service";
            logger.info("url::{}", uri);
            String result = restTemplate.getForEntity(uri, String.class).getBody();
            return result;
        } else {
            return "no service";
        }
    }
}
