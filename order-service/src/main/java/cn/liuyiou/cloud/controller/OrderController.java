package cn.liuyiou.cloud.controller;

import cn.liuyiou.cloud.service.SubsService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单服务
 */
@RestController
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SubsService subsService;
//    @Autowired
//    private EurekaClient eurekaClient;

//    public String serviceUrl() {
//        InstanceInfo instance = eurekaClient.getNextServerFromEureka("eureka-server", false);
//        return instance.getHomePageUrl();
//    }

    @RequestMapping("/order")
    public String index() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello,host:" + instance.getHost() + ",service_id:" + instance.getServiceId());
        return "Hello Spring Cloud" + "/hello,host:" + instance.getHost() + ",service_id:" + instance.getServiceId();
    }

    @GetMapping("/subsAddSuccess")
    public String addSubsSuccess(){
       return subsService.addSubsSuccess();

    }

    @GetMapping("/subsAddFail")
    public String addSubsFail(){
        return subsService.addSubsFail();

    }

    @GetMapping("/subsAddFail2")
    public String addSubsFail2(){
        return subsService.addSubsFail2();

    }
}
