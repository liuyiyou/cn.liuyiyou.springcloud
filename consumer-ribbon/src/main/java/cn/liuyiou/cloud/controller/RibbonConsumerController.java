package cn.liuyiou.cloud.controller;

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
    private RestTemplate restTemplate;

    @GetMapping("/ribbon-base")
    public String ribbonBase() {
        String uri = "http://SERVER-PRODUCER/base/base-service";
        logger.info("url::{}", uri);
        String result = restTemplate.getForEntity(uri, String.class).getBody();
        return result;
    }
}
