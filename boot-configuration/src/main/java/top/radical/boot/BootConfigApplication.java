package top.radical.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author : radical
 * @description :启动主类
 * @data : 2022/3/14
 **/
@Slf4j
@SpringBootApplication
@ImportResource(locations = {"classpath:bean.xml"})
public class BootConfigApplication {
    public static void main(String[] args) {

        SpringApplication.run(BootConfigApplication.class, args);
        log.info("服务启动成功");
    }
}
