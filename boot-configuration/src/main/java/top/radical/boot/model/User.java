package top.radical.boot.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/14
 **/
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "user")
@PropertySource(value = {"classpath:user.properties"})

public class User {

    @Length(min = 2,max = 5,message = "用户名称长度必须在2-5位")
    private String name;


    private Integer age;

    private Book book;
}
