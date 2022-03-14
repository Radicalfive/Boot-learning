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
// 配置整体前缀
@ConfigurationProperties(prefix = "family")
@PropertySource(value = {"classpath:family.properties"})
public class Family {

    @Length(min = 5, max = 20, message = "家庭名称长度必须在5-20位之间")
    private String familyName;

    private Father father;

    private Mother mother;

    private Child child;
}
