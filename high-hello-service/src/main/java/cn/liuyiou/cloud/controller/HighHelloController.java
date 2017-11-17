package cn.liuyiou.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: liuyiyou
 * Date: 2017/9/21
 * Time: 下午1:34
 */
@RestController
public class HighHelloController {

    private Logger logger = LoggerFactory.getLogger(HighHelloController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/high-hello")
    public String index() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello,host:" + instance.getHost() + ",service_id:" + instance.getServiceId());
        return "Hello Spring Cloud" + "/hello,host:" + instance.getHost() + ",service_id:" + instance.getServiceId();
    }
}
