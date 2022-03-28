package top.radical.boot.orm.JavaBean;

import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

@Slf4j
class UserTest {
    @Test
    public void test1() {
        User user = new User();
        UserDto userDto = UserDto.builder()
                .user("wx")
                .password("123")
                .build();
        BeanUtils.copyProperties(userDto, user);
        System.out.println(user);
    }

    @Test
    public void test2() {
        UserDto userDto = UserDto.builder()
                .user("radical")
                .password("111")
                .build();
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        User user = mapper.map(userDto, User.class);
        System.out.println(user);
    }

    @Test
    public void test3() {
        TestA testA = new TestA("radical","2022-03-28 12:12:12");
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        TestB testB = mapper.map(testA,TestB.class);
        log.info(String.valueOf(testB));
    }

}