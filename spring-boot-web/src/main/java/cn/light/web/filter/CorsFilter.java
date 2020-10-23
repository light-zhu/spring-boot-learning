package cn.light.web.filter;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 解决跨域问题
 */
@WebFilter(
        filterName = "corsFilter",
        urlPatterns = {"/**"},
        initParams = {@WebInitParam(
                name = "allowOrigin",
                value = "*"
        ), @WebInitParam(
                name = "allowMethods",
                value = "GET,POST,PUT,DELETE,OPTIONS"
        ), @WebInitParam(
                name = "allowCredentials",
                value = "true"
        ), @WebInitParam(
                name = "allowHeaders",
                value = "Accept, Origin, X-Requested-With, Content-Type, Last-Modified, X-Token"
        ), @WebInitParam(
                name = "exposeHeaders",
                value = "Set-Cookies"
        )}
)
public class CorsFilter implements Filter {
    private String allowOrigin;
    private String allowMethods;
    private String allowCredentials;
    private String allowHeaders;
    private String exposeHeaders;

    public CorsFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.allowOrigin = filterConfig.getInitParameter("allowOrigin");
        this.allowMethods = filterConfig.getInitParameter("allowMethods");
        this.allowCredentials = filterConfig.getInitParameter("allowCredentials");
        this.allowHeaders = filterConfig.getInitParameter("allowHeaders");
        this.exposeHeaders = filterConfig.getInitParameter("exposeHeaders");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)res;
        if (this.allowOrigin != null && this.allowOrigin.length() > 0) {
            List<String> allowOriginList = Arrays.asList(this.allowOrigin.split(","));
            if (allowOriginList != null && allowOriginList.size() > 0) {
                String currentOrigin = request.getHeader("Origin");
                if (allowOriginList.contains(currentOrigin)) {
                    response.setHeader("Access-Control-Allow-Origin", currentOrigin);
                }
            }
        }

        if (this.allowMethods != null && this.allowMethods.length() > 0) {
            response.setHeader("Access-Control-Allow-Methods", this.allowMethods);
        }

        if (this.allowCredentials != null && this.allowCredentials.length() > 0) {
            response.setHeader("Access-Control-Allow-Credentials", this.allowCredentials);
        }

        if (this.allowHeaders != null && this.allowHeaders.length() > 0) {
            response.setHeader("Access-Control-Allow-Headers", this.allowHeaders);
        }

        if (this.exposeHeaders != null && this.exposeHeaders.length() > 0) {
            response.setHeader("Access-Control-Expose-Headers", this.exposeHeaders);
        }

        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {
    }
}
