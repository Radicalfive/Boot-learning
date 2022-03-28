package top.radical.boot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import top.radical.boot.jpa.entity.Book;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/19
 **/
public interface BookRepository extends JpaRepository<Book,Integer>, JpaSpecificationExecutor<Book> {

}
