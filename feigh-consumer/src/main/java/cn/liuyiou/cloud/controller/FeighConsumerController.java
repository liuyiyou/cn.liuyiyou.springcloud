package cn.liuyiou.cloud.controller;

import cn.liuyiou.cloud.api.FeighClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: liuyiyou
 * Date: 2017/9/21
 * Time: 下午1:34
 */
@RestController
public class FeighConsumerController {

    @Autowired
    private FeighClient feighClient;

    @GetMapping("/feigh-service")
    public String ribbonBase() {
        System.out.println("feighClient::" + feighClient);
        return feighClient.feighService();
    }

}
