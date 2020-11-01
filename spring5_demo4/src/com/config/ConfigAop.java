package com.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


//完全使用注解开发
@Configuration
@ComponentScan(basePackages = {"com.aopanno"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}
