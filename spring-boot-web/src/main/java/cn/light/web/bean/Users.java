package cn.light.web.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p>Title:Users</p>
 * <p>Description: </p>
 *
 * @date 2020/10/22 17:00
 */
@Data
@Entity
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String passwordSalt;

    //Entity 中不映射成列的字段得加 @Transient 注解，不加注解也会映射成列
    @Transient
    private String others;

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
                ", others='" + others + '\'' +
                '}';
    }
}
