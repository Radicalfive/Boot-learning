package top.radical.boot.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author : radical
 * @description :
 * @data : 2022/4/4
 **/
//@WebFilter(filterName = "customFilter",urlPatterns = {"/*"})
@Slf4j
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("customFilter 初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("customFilter 请求处理之前 doFilter方法之前过滤请求");
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("customFilter 请求处理之后");
    }

    @Override
    public void destroy() {
        log.info("customFilter 销毁");
    }
}

