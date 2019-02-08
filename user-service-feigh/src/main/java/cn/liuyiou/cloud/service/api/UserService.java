package cn.liuyiou.cloud.service.api;

import cn.liuyiou.cloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: liuyiyou
 * @date: 2017/11/26
 * Time: 下午8:25
 */
@FeignClient("USER-SERVICE")
public interface UserService {


    @RequestMapping("add-user")
    String addUser();

    @RequestMapping("list-user")
    List<User> listUser();

    @RequestMapping("delete-user")
    boolean deleteUser();


    @RequestMapping("update-user")
    String updateUser();

}
