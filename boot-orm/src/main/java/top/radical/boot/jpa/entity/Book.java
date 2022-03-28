package top.radical.boot.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : radical
 * @description :Book实体类
 * @data : 2022/3/19
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "t_book")
public class Book {
    @Id
    private Integer id;
    private String name;
    private String cover;
}
