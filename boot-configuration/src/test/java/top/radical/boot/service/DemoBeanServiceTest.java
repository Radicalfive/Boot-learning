package top.radical.boot.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
@ExtendWith(SpringExtension.class)
class DemoBeanServiceTest {
    // 注入Spring上下文环境
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    void DemoBeanService() {
        DemoBeanService tbs1 = (DemoBeanService) ioc.getBean("demoBeanService");

        log.info(tbs1.getDemo());

        assertEquals("23", tbs1.getDemo());
    }

}