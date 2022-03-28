package top.radical.boot.orm.mybatis.mapper;

import top.radical.boot.orm.mybatis.domain.Clazz;

/**
* @author test
* @description 针对表【t_clazz】的数据库操作Mapper
* @createDate 2022-03-28 20:00:37
* @Entity Clazz
*/
public interface ClazzMapper {

    /**
     * 根据班级id查询班级信息
     *
     * @param clazzId 班级id
     * @return 班级信息（关联查询出所有学生）
     */
    Clazz findOneByMany(int clazzId);

    /**
     * 根据班级id查询班级信息
     *
     * @param clazzId 班级id
     * @return 班级信息（关联查询出所有的学生，班级老师的信息）
     */
    Clazz getClazz(int clazzId);

}




