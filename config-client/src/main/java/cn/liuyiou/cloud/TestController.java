package cn.liuyiou.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuyiyou
 * @date: 2017/11/21
 * Time: 下午5:51
 */

@RefreshScope
@RestController
public class TestController {


    @Autowired
    private Environment environment;

    @RequestMapping("/from")
    public String from (){
        return environment.getProperty("from","undefined");
    }
}
