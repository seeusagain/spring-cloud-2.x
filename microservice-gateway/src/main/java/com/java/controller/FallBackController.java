package com.java.controller;

import com.java.dto.ResultMsg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulu
 * @date 2019/6/18 11:10
 * @description: 熔断降级接口
 */
@RestController
public class FallBackController {

  @RequestMapping("/fallback")
  public ResultMsg fallback() {
    return ResultMsg.error("访问超时");
  }
}
