package cn.light.web.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.servlet.*;
import java.io.IOException;

/**
 * <p>Title:WebConfigration</p>
 * <p>Description: </p>
 *
 * @date 2020/10/22 17:14
 */
@Configuration
@Slf4j
public class WebConfigration {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("MyFilter");
        registration.setOrder(1);
        return registration;
    }

    public class MyFilter implements Filter {

        @Override
        public void init(FilterConfig filterConfig) throws ServletException {
            log.debug("init MyFilter");
            log.debug("filterName:"+filterConfig.getFilterName());
            log.debug("paramName:"+filterConfig.getInitParameter("paramName"));
        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            log.debug("doFilter MyFilter");
            filterChain.doFilter(servletRequest,servletResponse);
        }

        @Override
        public void destroy() {
            log.debug("destroy MyFilter");
        }
    }

}
