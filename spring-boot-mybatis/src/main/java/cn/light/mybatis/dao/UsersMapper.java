package cn.light.mybatis.dao;

import cn.light.mybatis.bean.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>Title:UsersMapper</p>
 * <p>Description: </p>
 *
 * @date 2020/10/26 10:09
 */
@Mapper
public interface UsersMapper{
    Users getUserById(Long id);
}
