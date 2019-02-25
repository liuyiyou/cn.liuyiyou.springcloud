package cn.liuyiou.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基础服务调用：被
 */
@RestController
@RequestMapping("/base")
public class BaseServiceController {

    private Logger logger = LoggerFactory.getLogger(BaseServiceController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    /**
     * 最简单的服务调用
     *
     * @return
     */
    @RequestMapping("/base-service")
    public String basService() {
        return "Base Service Has Been Called";
    }
}
