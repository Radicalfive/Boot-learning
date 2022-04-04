package top.radical.boot.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.radical.boot.template.entity.Article;

import java.util.Arrays;
import java.util.List;

/**
 * @author : radical
 * @description :
 * @data : 2022/4/4
 **/
@Controller
@RequestMapping("/template")
public class TemplateController {

    @GetMapping("/freemarker")
    public String index(Model model) {
        List<Article> articles = Arrays.asList(
                new Article(1, "radical", "java"),
                new Article(2, "tom", "javaScript"),
                new Article(3, "jack", "SpringBoot")
        );
        model.addAttribute("articles", articles);
        System.out.println(articles);
        // 模版名称，实际的目录为:resources/templates/freemarker-demo.ftl
        return "freemarker-demo";
    }

    @GetMapping("/thymeleaf")
    public String thymeleafIndex(Model model) {
        List<Article> articles = Arrays.asList(
                new Article(1, "jack", "Java"),
                new Article(2, "tom", "Spring"),
                new Article(3, "radical", "SpringBoot")
        );
        model.addAttribute("articles", articles);
        return "thymeleaf-demo";
    }
}
