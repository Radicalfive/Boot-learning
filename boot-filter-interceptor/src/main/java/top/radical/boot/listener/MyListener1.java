package top.radical.boot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * @author : radical
 * @description :自定义事件监听器方式1:实现ApplicationListener接口
 * @data : 2022/4/4
 **/
@Slf4j
public class MyListener1 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 监听到事件源: %s.", MyListener1.class.getName(), event.getSource()));
    }
}

