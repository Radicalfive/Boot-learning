package top.radical.boot.orm.common;

import lombok.Data;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/10
 **/
@Data
public class AjaxResponse {
    /**
     * 请求是否处理成功
     */
    private boolean isok;
    /**
     * 请求响应状态码（200、400、500）
     */
    private int code;
    /**
     * 请求结果描述信息
     */
    private String message;
    /**
     * 请求结果数据（通常⽤于查询操作）
     */
    private Object data;

    private AjaxResponse(){}

    /**
     * 请求成功的响应，不带查询数据（⽤于删除、修改、新增接⼝）
     * @return
     */
    public static AjaxResponse success(){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功!");
        return ajaxResponse;
    }

    /**
     * 请求成功的响应，带有查询数据（⽤于数据查询接⼝）
     * @param obj
     * @return
     */
    public static AjaxResponse success(Object obj){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功!");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }

    /**
     * 请求成功的响应，带有查询数据（⽤于数据查询接⼝）
     * @param obj
     * @param message
     * @return
     */
    public static AjaxResponse success(Object obj,String message){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }

    public static AjaxResponse failure() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(false);
        ajaxResponse.setCode(400);
        ajaxResponse.setMessage("请求响应失败!");
        return ajaxResponse;
    }
}
