package top.radical.boot.jpa.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.radical.boot.jpa.entity.People;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
class PeopleRepositoryTest {

    @Resource
    private PeopleRepository peopleRepository;

    @Test
    void findAll() {
        List<People> peopleList = peopleRepository.findAll();
        assertEquals(4,peopleList.size());
    }

    @Test
    void findByFirstName() {
        List<People> peopleList = peopleRepository.findByFirstName("ma");
        assertEquals(2,peopleList.size());
    }
}