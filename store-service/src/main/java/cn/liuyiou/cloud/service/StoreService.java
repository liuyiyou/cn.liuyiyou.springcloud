package cn.liuyiou.cloud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StoreService {

    private Logger logger = LoggerFactory.getLogger(StoreService.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Transactional(rollbackFor = Exception.class)
    public String addSuucess() {
        jdbcTemplate.execute("INSERT  INTO t_store (prod_id,store) VALUES (1001,40)");
        return "success";

    }


    @Transactional(rollbackFor = Exception.class)
    public String addFail() {
        jdbcTemplate.execute("INSERT  INTO t_store (prod_id,store) VALUES (1001,40)");
        int i = 1/0;
        return "fail";

    }
}
