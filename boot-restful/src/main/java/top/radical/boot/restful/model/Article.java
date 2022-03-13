package top.radical.boot.restful.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author : radical
 * @description :实体类
 * @data : 2022/3/10
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder(value = {"content", "title"})
public class Article {
    private Long id;

    //@JsonProperty("writer")

    private String author;
    private String title;
    private String content;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    private Date updateTime;

    private List<Reader> readerList;
}
