package cn.light.mybatis.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Title:Users</p>
 * <p>Description: </p>
 *
 * @date 2020/10/22 17:00
 */
@Data
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String username;
    private String password;
    private String passwordSalt;

    public Users(){}

    public Users(String username, String password, String passwordSalt) {
        super();
        this.username = username;
        this.password = password;
        this.passwordSalt = passwordSalt;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", passwordSalt='" + passwordSalt + '\'' +

                '}';
    }
}
