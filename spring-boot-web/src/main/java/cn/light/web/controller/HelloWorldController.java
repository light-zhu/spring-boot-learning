package cn.light.web.controller;

import cn.light.web.bean.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title:WebController</p>
 * <p>Description: </p>
 *
 * @date 2020/10/22 16:23
 */
//使用RestController注解 默认返回数据为JSON格式
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String getHello() {
        return "Hello World2";
    }

    @RequestMapping("/getUsers")
    public Users getUsers(){
        Users users = new Users();
        users.setId(1L);
        users.setUsername("Tom");
        users.setPassword("123456");
        users.setPasswordSalt("aac");
        return users;
    }



}
