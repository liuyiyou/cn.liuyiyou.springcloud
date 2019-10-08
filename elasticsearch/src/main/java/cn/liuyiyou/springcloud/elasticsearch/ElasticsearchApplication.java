package cn.liuyiyou.springcloud.elasticsearch;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.TransportAddress;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.elasticsearch.jest.JestAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.util.List;

@SpringBootApplication
public class ElasticsearchApplication {

//
//    @Bean
//    public ElasticsearchTemplate elasticsearchTemplate(){
//        return new ElasticsearchTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchApplication.class, args);
    }

}
