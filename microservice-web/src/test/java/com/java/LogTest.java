package com.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationWeb.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class LogTest {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Test
    public void test() throws Exception {

    }

}
