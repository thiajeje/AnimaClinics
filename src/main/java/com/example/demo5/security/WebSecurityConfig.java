package com.example.demo5.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable().authorizeRequests()
                .antMatchers("/usuarios").permitAll()
                .antMatchers("/usuarios/*").permitAll()
                .antMatchers("/agendamentos").permitAll()
                .antMatchers("/agendamentos/*").permitAll()
                .antMatchers("/pacientes/*").permitAll()
                .antMatchers("/pacientes").permitAll()
                .antMatchers("/anamnese").permitAll()
                .antMatchers("/anamnese/*").permitAll()
                .anyRequest().authenticated();

        httpSecurity.headers().frameOptions().disable();
    }


}