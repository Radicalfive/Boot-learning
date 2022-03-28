package top.radical.boot.orm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.radical.boot.orm.listener.DateBaseAuditListener;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/18
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EntityListeners(DateBaseAuditListener.class)
public class Article implements Serializable {

    @Serial
    private static final long serialVersionUID = -2631847427215494114L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String author;

    private String title;

    private String content;

    private String thumbnail;

    @Column(name="create_time",updatable = false)
    private Date createTime;

    private Date updateTime;
}
