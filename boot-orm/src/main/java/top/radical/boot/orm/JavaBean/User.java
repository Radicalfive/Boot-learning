package top.radical.boot.orm.JavaBean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/28
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String user;
    private String password;
    private String avatar;
}
