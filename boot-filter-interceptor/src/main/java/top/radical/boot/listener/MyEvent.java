package top.radical.boot.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @author : radical
 * @description :
 * @data : 2022/4/4
 **/
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}