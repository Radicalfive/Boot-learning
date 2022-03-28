package top.radical.boot.orm.mybatis.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serial;
import java.io.Serializable;

/**
 * 
 * @author radical
 * @TableName t_course_student
 */
@Data
@Alias("CourseStudent")
public class CourseStudent implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 学生id
     */
    private Integer studentId;

    @Serial
    private static final long serialVersionUID = 1L;
}