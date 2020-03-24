package cn.hcy.newsproj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableCaching //开启注解缓存
@EnableTransactionManagement  //开启事务注解
@MapperScan(value = "cn.hcy.newsproj.mapper")
@SpringBootApplication
public class NewsprojApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsprojApplication.class, args);
    }

}
