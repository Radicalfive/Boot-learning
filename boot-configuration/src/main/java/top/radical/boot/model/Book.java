package top.radical.boot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/14
 **/
@Data
public class Book {


    private String name;


    @Max(value = 100,message = "价格不得超过100元")
    private Integer price;

    @Past(message = "时间错误")
    @JsonFormat(pattern = "yyy-MM-dd HH:mm:ss",timezone = "GMT-8")
    private Date pastTime;
}
