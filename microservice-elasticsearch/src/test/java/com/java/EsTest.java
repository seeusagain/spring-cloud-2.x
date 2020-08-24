package com.java;

import com.java.sevice.estest.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationElasticSearch.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class EsTest {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void test() throws Exception {
        this.userInfoService.addToEs();
    }

}
