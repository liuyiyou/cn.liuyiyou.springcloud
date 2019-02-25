//package cn.liuyiou.cloud.service.impl;
//
//import cn.liuyiou.cloud.model.User;
//import cn.liuyiou.cloud.service.api.UserService;
//import com.google.common.collect.Lists;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import java.util.List;
//
///**
// * @author: liuyiyou
// * @date: 2017/11/26
// * Time: 下午8:41
// */
//
///**
// * 该注解必须是  @RestController  不能是@Service
// */
//@RestController
//public class UserServiceImpl implements UserService {
//
////    @RequestMapping("add-user")
//    @Override
//    public String addUser() {
//        return "add User Has Been Called";
//    }
//
////    @RequestMapping("list-user")
//    @Override
//    public List<User> listUser() {
//        return Lists.newArrayList(new User() {{
//            setId(1);
//            setAge(18);
//            setName("lyy");
//        }}, new User() {{
//            setId(2);
//            setAge(18);
//            setName("yi");
//        }}, new User() {{
//            setId(1);
//            setAge(18);
//            setName("you");
//        }});
//    }
//
////    @RequestMapping("delete-user")
//    @Override
//    public boolean deleteUser() {
//        return true;
//    }
//
////    @RequestMapping("update-user")
//    @Override
//    public String updateUser() {
//        return "update User Has Been Called";
//    }
//}
