package cn.light.mybatis;

import cn.light.mybatis.bean.Users;
import cn.light.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUser(){
        Users users = userService.getUserById(3L);
        System.out.println(users.toString());
    }

}
