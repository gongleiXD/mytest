package com.springboot;

import com.springboot.config.DBConfig1;
import com.springboot.config.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration(exclude={

        JpaRepositoriesAutoConfiguration.class//禁止springboot自动加载持久化bean

})
@ComponentScan(basePackages = "com.springboot")
//@EnableJpaRepositories(basePackages = {"com.springboot.test01.dao","com.springboot.test02.dao"})
@EnableConfigurationProperties({DBConfig1.class, DBConfig2.class})
@MapperScan(basePackages = {"com.springboot.test01.dao","com.springboot.test02.dao"})
@EntityScan(basePackages = "com.springboot.pojo")

public class App {

    public static void main(String[] args) {


        SpringApplication.run(App.class,args);
    }
}
