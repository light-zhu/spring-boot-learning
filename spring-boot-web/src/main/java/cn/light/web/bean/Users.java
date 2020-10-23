package cn.light.web.bean;

import lombok.Data;

/**
 * <p>Title:Users</p>
 * <p>Description: </p>
 *
 * @date 2020/10/22 17:00
 */
@Data
public class Users {

    private Long id;
    private String username;
    private String password;
    private String passwordSalt;
}
