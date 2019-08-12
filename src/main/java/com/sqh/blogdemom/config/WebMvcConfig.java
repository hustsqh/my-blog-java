package com.sqh.blogdemom.config;

import com.sqh.blogdemom.web.controller.interceptor.InstallInterceptor;
import com.sqh.blogdemom.web.controller.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;
    @Autowired
    private InstallInterceptor installInterceptor;
}
