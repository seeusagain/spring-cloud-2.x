package com.java.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulu
 * @date 2019/6/18 17:51
 * @description: 提供500错误，让网关重试
 */
@RestController
public class ErrorTestController {

  private static Logger logger = LoggerFactory.getLogger(ErrorTestController.class);

  @GetMapping(value = "/errorTest")
  public void errorTest() throws Exception {
    logger.info("报错测试_开始");
    throw new RuntimeException("手动报错");
  }
}
