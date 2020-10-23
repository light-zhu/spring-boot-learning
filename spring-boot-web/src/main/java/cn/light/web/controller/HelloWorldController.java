package cn.light.web.controller;

import cn.light.web.bean.Users;
import cn.light.web.util.LightProperties;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private LightProperties lightProperties;

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

    @RequestMapping("/getProperties")
    public String getProperties(){
        return lightProperties.getTitle();
    }





}
