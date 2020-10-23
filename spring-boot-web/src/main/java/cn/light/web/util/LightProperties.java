package cn.light.web.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Title:LightProperties</p>
 * <p>Description: </p>
 *
 * @date 2020/10/23 10:38
 */
@Configuration
@Data
public class LightProperties {

    @Value("${light.title}")
    public  String title;
    @Value("${light.content}")
    public  String content;
}
