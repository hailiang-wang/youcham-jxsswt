package io.youcham.modules.sys.casshiro;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author gongtao
 * @version 2018-07-05 15:30
 **/
public class CallbackFilter extends io.buji.pac4j.filter.CallbackFilter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        super.doFilter(servletRequest, servletResponse, filterChain);
    }
}
