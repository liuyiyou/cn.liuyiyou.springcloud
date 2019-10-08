package cn.liuyiyou.springcloud.elasticsearch.search;

import cn.liuyiyou.springcloud.elasticsearch.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.GetQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuyiyou.cn
 * @date: 2019/8/15
 * @version: V1.0
 */
@RestController
public class SearchController {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @GetMapping("/")
    public Movie test(){
        GetQuery getQuery = new GetQuery();
        getQuery.setId("1");
        Movie movie = elasticsearchTemplate.queryForObject(getQuery, Movie.class);
        return movie;
    }
}
