package top.radical.boot.jpa.service;

import org.springframework.data.domain.Page;
import top.radical.boot.jpa.entity.Book;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/19
 **/
public interface BookService {

    /**
     * 不带条件查询书
     * @param page
     * @param size
     * @return Page<Book>
     */
    Page<Book> findBookNoCriteria(Integer page , Integer size);

    /**
     * 带调价查询书
     * @param page
     * @param size
     * @param book
     * @return Page<Book>
     */
    Page<Book> findBookCriteria(Integer page , Integer size , Book book);
}
