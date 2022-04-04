package top.radical.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import top.radical.boot.listener.MyEvent;
import top.radical.boot.listener.MyListener1;

/**
 * @author : radical
 * @description :启动主类
 * @data : 2022/4/4
 **/
@SpringBootApplication
@ServletComponentScan
public class InterceptorApplication {
    public static void main(String[] args) {
        //获取ConfigurableApplicationContext上下文
        ConfigurableApplicationContext context =  SpringApplication.run(InterceptorApplication.class,args);
        //装载监听
        context.addApplicationListener(new MyListener1());
        //发布事件
        context.publishEvent(new MyEvent("测试事件"));
    }
}

