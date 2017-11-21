package cn.liuyiou.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @author: liuyiyou
 * @date: 2017/11/17
 * Time: 上午11:20
 */
@Service
public class HelloService {


    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloRibbon() {
        return restTemplate.getForEntity("http://BASE-SERVICE-PRODUCER/base-service", String.class).getBody();
    }


    private String helloFallBack(){
        return "error";
    }
}
