package cn.liuyiou.cloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
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
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    private EurekaClient eurekaClient;

    public String serviceUrl() {
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("eureka-server", false);
        return instance.getHomePageUrl();
    }

    @RequestMapping("/hello")
    public String index() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello,host:" + instance.getHost() + ",service_id:" + instance.getServiceId());
        return "Hello Spring Cloud" + "/hello,host:" + instance.getHost() + ",service_id:" + instance.getServiceId();
    }
}
