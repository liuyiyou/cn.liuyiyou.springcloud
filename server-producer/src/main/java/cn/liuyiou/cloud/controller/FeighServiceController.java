package cn.liuyiou.cloud.controller;

import cn.liuyiou.cloud.api.FeighClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuyiyou.cn
 * @date: 2019/2/25
 * @version: V1.0
 */
@RestController
public class FeighServiceController implements FeighClient {

    private Logger logger = LoggerFactory.getLogger(FeighServiceController.class);
    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/feigh-service")
    public String feighService() {
        logger.info("base-service");
        return "feigh-service  Has Been Called";
    }
}
