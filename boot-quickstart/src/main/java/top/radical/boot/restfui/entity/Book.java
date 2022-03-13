package top.radical.boot.restfui.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/7
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
public class Book {
    private Integer id;
    private String name;

    private static Logger logger = LoggerFactory.getLogger(Book.class);

}
