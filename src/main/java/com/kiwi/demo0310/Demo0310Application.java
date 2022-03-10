package com.kiwi.demo0310;

import com.kiwi.demo0310.model.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Users.class)
@MapperScan("com.kiwi.demo0310.mapper")
@SpringBootApplication
public class Demo0310Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo0310Application.class, args);
    }

}
