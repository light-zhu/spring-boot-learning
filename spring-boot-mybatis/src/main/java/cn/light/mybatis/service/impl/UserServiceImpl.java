package cn.light.mybatis.service.impl;

import cn.light.mybatis.bean.Users;
import cn.light.mybatis.dao.UsersMapper;
import cn.light.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>Title:UserServiceImpl</p>
 * <p>Description: </p>
 *
 * @date 2020/10/26 10:12
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users getUserById(Long id) {
        return usersMapper.getUserById(id);
    }
}
