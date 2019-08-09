package com.java.controller;

import com.java.dto.ResultMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulu
 * @date 2019/6/17 18:16
 * @description: 提供给gateway熔断测试接口
 */
@RestController
public class HystrixTestController {

  private static Logger logger = LoggerFactory.getLogger(HystrixTestController.class);

  @GetMapping(value = "/hystrixTest")
  public Object hystrixTest() throws Exception {
    logger.info("熔断测试_开始");
    Thread.sleep(2000);
    logger.info("熔断测试_完毕");
    return ResultMsg.ok("hystrix测试");
  }
}
