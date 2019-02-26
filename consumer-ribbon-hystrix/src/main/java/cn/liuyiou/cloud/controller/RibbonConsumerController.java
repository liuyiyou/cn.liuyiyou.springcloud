package cn.liuyiou.cloud.controller;

import cn.liuyiou.cloud.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * User: liuyiyou
 * Date: 2017/9/21
 * Time: 下午1:34
 */
@RestController
public class RibbonConsumerController {

    private Logger logger = LoggerFactory.getLogger(RibbonConsumerController.class);

    @Autowired
    private HelloService helloService;


    @GetMapping("/ribbon-consumer")
    public String helloRibbon() {
        return helloService.helloRibbon();
    }
}
