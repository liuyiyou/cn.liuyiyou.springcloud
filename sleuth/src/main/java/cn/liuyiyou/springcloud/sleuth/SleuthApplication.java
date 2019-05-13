package cn.liuyiyou.springcloud.sleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SleuthApplication {


    private static Logger log = LoggerFactory.getLogger(SleuthApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(SleuthApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        log.info("Handling home");
        return "Hello World";
    }

}
