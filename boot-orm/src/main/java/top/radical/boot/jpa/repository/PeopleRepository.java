package top.radical.boot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.radical.boot.jpa.entity.People;

import java.util.List;

/**
 * @author : radical
 * @description :
 * @data : 2022/3/19
 **/
public interface PeopleRepository extends JpaRepository<People,Integer> {

    /**
     * 查找全部
     * @return find,read,get
     */
    @Override
    List<People> findAll();

    /**
     * 根据firstName查找
     * @param firstName firstName
     * @return
     */
    List<People> findByFirstName(String firstName);

    /**
     * 根据firstName和lastName查找(两者必须在数据库有)
     * @param firstName
     * @param lastName
     * @return
     */
    People findByFirstNameAndLastName(String firstName, String lastName);

    /**
     * 根据firstName或lastName查找(两者其一有就行)
     * @param lastName lastName
     * @param firstName firstName
     * @return
     */
    People findByLastNameOrFirstName(String lastName, String firstName);

    /**
     * 根据firstName查找它是否存在数据库里
     * @param firstName firstName
     * @return
     */
    People findByFirstNameIs(String firstName);

    /**
     * 根据firstName查找它是否存在数据库里
     * @param firstName firstName
     * @return
     */
    People findByFirstNameEquals(String firstName);
}
