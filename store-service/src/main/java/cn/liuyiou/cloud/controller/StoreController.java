package cn.liuyiou.cloud.controller;

import cn.liuyiou.cloud.service.StoreService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: liuyiyou
 * Date: 2017/9/21
 * Time: 下午1:34
 */
@RestController
public class StoreController {

    private Logger logger = LoggerFactory.getLogger(StoreController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private StoreService storeService;

    public String serviceUrl() {
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("eureka-server", false);
        return instance.getHomePageUrl();
    }

    @GetMapping("/decreaseSkuSuccess")
    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String decreaseSkuSuccess(){
        storeService.addSuucess();
        return "success";
    }

    @GetMapping("/decreaseSkuFail")
    public String decreaseSkuFail(){
        storeService.addFail();
        return "success";
    }


    private String helloFallBack(){
        return "error";
    }

    @RequestMapping("/store")
    public String index() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello,host:" + instance.getHost() + ",service_id:" + instance.getServiceId());
        return "Hello Spring Cloud" + "/hello,host:" + instance.getHost() + ",service_id:" + instance.getServiceId();
    }


}
