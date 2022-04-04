package top.radical.boot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * @author : radical
 * @description :自定义事件监听器方式3:在application.properties中配置监听
 * @data : 2022/4/4
 **/
@Slf4j
public class MyListener3 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 监听到事件源: %s.",MyListener3.class.getName(),event.getSource()));
    }
}

