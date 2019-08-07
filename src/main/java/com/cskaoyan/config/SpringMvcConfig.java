package com.cskaoyan.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan(value = "com.cskaoyan.controller",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class))
public class SpringMvcConfig implements WebMvcConfigurer {

}
