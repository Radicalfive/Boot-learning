package top.radical.boot.orm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : radical
 * @description :启动主类
 * @data : 2022/3/18
 **/
@SpringBootApplication
@MapperScan(basePackages = {"top.radical.boot.orm.mybatis.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
