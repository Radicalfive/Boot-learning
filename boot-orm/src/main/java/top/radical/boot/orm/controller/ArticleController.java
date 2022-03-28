package top.radical.boot.orm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.radical.boot.orm.common.AjaxResponse;
import top.radical.boot.orm.service.impl.ArticleJpaServiceImpl;

import javax.annotation.Resource;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/18
 **/
@RestController
@RequestMapping(value = "/api/v1/articles")
public class ArticleController {

    @Resource
    private ArticleJpaServiceImpl articleJpaService;

    /**
     * 查询所有
     * @return
     */
    @GetMapping(value = "/all")
    public AjaxResponse selectAll(){
        return AjaxResponse.success(articleJpaService.selectAll());
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public AjaxResponse findById(@PathVariable int id){
        return AjaxResponse.success(articleJpaService.findById(id));
    }
}
