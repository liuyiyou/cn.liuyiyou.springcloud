package cn.liuyiou.cloud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class SubsService {

    private Logger logger = LoggerFactory.getLogger(SubsService.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RestTemplate restTemplate;


    @Transactional(rollbackFor = Exception.class)
    public String addSubsSuccess() {

        addSubs();
        String result = restTemplate.getForEntity("http://STORE-SERVICE/decreaseSkuSuccess", String.class).getBody();
        if ("success".equals(result)) {
            return "subsAdd Success";
        } else {
            return "subsAdd Fail";
        }
    }


    @Transactional(rollbackFor = Exception.class)
    public String addSubsFail() {
        addSubs();
        String result = restTemplate.getForEntity("http://STORE-SERVICE/decreaseSkuFail", String.class).getBody();
        if ("success".equals(result)) {
            return "subsAdd Success";
        } else {
            return "subsAdd Fail";
        }
    }


    @Transactional(rollbackFor = Exception.class)
    public String addSubsFail2() {
        String result = restTemplate.getForEntity("http://STORE-SERVICE/decreaseSkuSuccess", String.class).getBody();
        addSubs();
        int i = 1/0;
        if ("success".equals(result)) {
            return "subsAdd Success";
        } else {
            return "subsAdd Fail";
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public int addSubs() {
        logger.info("subsAdd");
        jdbcTemplate.execute("INSERT  INTO t_subs(amount,name) VALUES (50,'SubsA')");
        return 1;
    }
}
