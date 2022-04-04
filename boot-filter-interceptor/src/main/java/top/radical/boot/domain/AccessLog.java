package top.radical.boot.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author : radical
 * @description :
 * @data : 2022/4/4
 **/
@Data
public class AccessLog {
    /**
     * 访问者用户名
     */
    private String username;
    /**
     * 请求路径
     */
    private String uri;
    /**
     * 请求消耗时常
     */
    private Integer duration;
    /**
     * http方法
     */
    private String httpMethod;
    /**
     * 请求状态码
     */
    private Integer httpStatus;
    /**
     * 访问者ip
     */
    private String ip;
    /**
     * 此条记录的创建时间
     */
    private Date createTime;

    @Override
    public String toString() {
        return "AccessLog{" +
                "username='" + username + '\'' +
                ", uri='" + uri + '\'' +
                ", duration=" + duration +
                ", httpMethod='" + httpMethod + '\'' +
                ", httpStatus=" + httpStatus +
                ", ip='" + ip + '\'' +
                ", createTime=" + createTime +
                '}';
    }

}
