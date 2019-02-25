package cn.liuyiou.cloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: liuyiyou.cn
 * @date: 2019/2/25
 * @version: V1.0
 */

@FeignClient(name = "server-producer",value = "server-producer")
public interface FeighClient {

    @RequestMapping(method = RequestMethod.GET, value = "/feigh-service")
    String feighService();
}
