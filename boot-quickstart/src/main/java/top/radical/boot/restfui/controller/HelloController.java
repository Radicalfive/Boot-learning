package top.radical.boot.restfui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/7
 **/
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String getHello() {
        return "hello world 1111";
    }
}
