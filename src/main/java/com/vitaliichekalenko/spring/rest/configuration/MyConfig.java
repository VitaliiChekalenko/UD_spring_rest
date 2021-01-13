package com.vitaliichekalenko.spring.rest.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.vitaliichekalenko.spring.rest")
@EnableWebMvc
public class MyConfig {



}
