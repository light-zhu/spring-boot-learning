package cn.light.web.jpa;

import cn.light.web.bean.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>Title:UsersRepository</p>
 * <p>Description: </p>
 *
 * @date 2020/10/23 14:22
 */
public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByUsername(String name);
}
