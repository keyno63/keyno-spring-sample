package com.keyno.keynospringsample.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        String noneCheck = "/";
        http.csrf().requireCsrfProtectionMatcher(request -> {
            if (request.getMethod().equals("GET"))
                return false;
            final boolean ret = request.getRequestURI().startsWith(noneCheck);
            return !ret;
        });
    }
}

