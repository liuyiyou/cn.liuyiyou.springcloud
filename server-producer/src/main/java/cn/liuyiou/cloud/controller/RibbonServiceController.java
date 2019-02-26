package cn.liuyiou.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: liuyiyou.cn
 * @date: 2019/2/25
 * @version: V1.0
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonServiceController {

    private Logger logger = LoggerFactory.getLogger(RibbonServiceController.class);

    private static AtomicInteger count = new AtomicInteger(0);

    @RequestMapping("/ribbon-service")
    public String basService() {
        logger.info(count.incrementAndGet() + "次访问 ribbon-service");
        return "ribbon-service Service Has Been Called";
    }
}
