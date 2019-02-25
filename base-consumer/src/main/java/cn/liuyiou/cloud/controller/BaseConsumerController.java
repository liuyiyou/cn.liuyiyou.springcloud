package cn.liuyiou.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: liuyiyou
 * Date: 2017/9/21
 * Time: 下午1:34
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/hello")
    public String index() {
        return "Hello Spring Cloud";
    }

    @GetMapping("/base")
    public String baseSerivce() {
        List<String> services = discoveryClient.getServices();
        if (!services.isEmpty()) {
            ServiceInstance instance = discoveryClient.getInstances(services.get(0)).get(0);
            String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/" + instance.getServiceId();
            return url;
        } else {
           return "no service";
        }
    }
}
