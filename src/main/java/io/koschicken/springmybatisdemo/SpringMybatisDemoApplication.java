package io.koschicken.springmybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.koschicken.springmybatisdemo.mapper")
public class SpringMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisDemoApplication.class, args);
    }
}
