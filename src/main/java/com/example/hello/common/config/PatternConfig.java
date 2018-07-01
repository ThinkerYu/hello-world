package com.example.hello.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 重置DispatcherServlet的URL映射
 * @author guweiyu
 */
@Configuration
public class PatternConfig {

    @Value("${pattern.servlet-url-pattern}")
    private String servletUrlPattern;

    @Bean
    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
        registration.getUrlMappings().clear();
        registration.addUrlMappings(servletUrlPattern);
        return registration;
    }

}