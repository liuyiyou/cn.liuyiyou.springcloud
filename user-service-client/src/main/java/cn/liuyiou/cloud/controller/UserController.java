//package cn.liuyiou.cloud.controller;
//
//import cn.liuyiou.cloud.model.User;
//import cn.liuyiou.cloud.service.api.UserService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//
///**
// * User: liuyiyou
// * Date: 2017/9/21
// * Time: 下午1:34
// */
//@RestController
//public class UserController {
//
//    private Logger logger = LoggerFactory.getLogger(UserController.class);
//
//
//    @Autowired
//    private UserService userService;
//
//    public UserController() {
//        logger.info("userservice In Construct {}", userService);
//    }
//
//
//    @PostConstruct
//    public void printService(){
//        logger.info("userservice In PostConstruct::{}", userService);
//    }
//
//    @RequestMapping("/add-user")
//    public String saveUser() {
//        return userService.addUser();
//    }
//
//    @RequestMapping("/list-user")
//    public List<User> getUser() {
//        logger.info("userservice In Method ::{}", userService);
//        List<User> userList = userService.listUser();
//        return userList;
//    }
//
//
//    @RequestMapping("/edit-user")
//    public String editUser() {
//        return userService.updateUser();
//    }
//
//
//    @RequestMapping("/delete-user")
//    public Boolean deleteUser() {
//        return userService.deleteUser();
//    }
//}
