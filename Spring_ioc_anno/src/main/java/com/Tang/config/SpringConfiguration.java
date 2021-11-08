package com.Tang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Tang
 * @date 2021/11/5 - 19:41
 */
//标志该类是Spring的核心配置类
@Configuration
//<context:component-scan base-package="com.Tang"/>
@ComponentScan("com.Tang")
//<context:property-placeholder location="jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {
}
