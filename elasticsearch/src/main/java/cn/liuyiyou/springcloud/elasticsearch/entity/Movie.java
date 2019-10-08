package cn.liuyiyou.springcloud.elasticsearch.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author: liuyiyou.cn
 * @date: 2019/8/15
 * @version: V1.0
 */
@Data
@Accessors(chain = true)
public class Movie {

    private String title;
    private String director;
    private int year;
    private List<String> generes;


}
