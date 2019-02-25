package cn.liuyiou.cloud.controller;

import cn.liuyiou.cloud.api.FeighClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuyiyou.cn
 * @date: 2019/2/25
 * @version: V1.0
 */
@RestController()
@RequestMapping("/feigh")
public class FeighServiceController {

    @Autowired
    private FeighClient feighClient;

    @RequestMapping("/feigh-service")
    public String feighService() {
        return feighClient.feighService();
    }
}
