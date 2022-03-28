package top.radical.boot.orm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.radical.boot.orm.entity.Article;

import java.util.List;

/**
 * @author : radical
 * @description :JPA数据操作接口
 * @data : 2022/3/18
 **/
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    /**
     * 这个方法可以自动生成SQL语句
     *
     * @param author author
     * @return List<User>
     */
    List<Article> findByAuthor(String author);
}
