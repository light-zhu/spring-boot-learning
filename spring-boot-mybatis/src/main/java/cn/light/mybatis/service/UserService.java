package cn.light.mybatis.service;

import cn.light.mybatis.bean.Users;

/**
 * <p>Title:UserService</p>
 * <p>Description: </p>
 *
 * @date 2020/10/26 10:11
 */
public interface UserService {
    Users getUserById(Long id);
}