package top.radical.boot.jpa.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @author test
 * @TableName t_article
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 分类
     */
    private String category;

    /**
     * 作者id
     */
    private Integer userId;

    /**
     * 标题
     */
    private String title;

    /**
     * 封面图
     */
    private String cover;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 内容
     */
    private String content;

    /**
     * 文章url
     */
    private String url;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 总字数
     */
    private String totalWords;

    /**
     * 阅读时间
     */
    private Integer duration;

    /**
     * 浏览次数
     */
    private Integer pageView;

    @Serial
    private static final long serialVersionUID = 1L;
}