package top.radical.boot.model;

import lombok.Data;

import java.util.List;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/14
 **/
@Data
public class Child{
    private String name;

    private Integer age;

    private List<Friend> friends;
}
