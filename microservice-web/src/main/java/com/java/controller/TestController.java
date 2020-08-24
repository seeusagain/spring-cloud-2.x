package com.java.controller;

import com.java.dto.ResultMsg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author xulu
 * @date 2019/6/13 16:26
 * @description: TODO
 */
@RestController
@Api(tags = "提供测试接口")
public class TestController {

  @ApiOperation(value = "提供测试界面", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  @GetMapping(value = "/index")
  public Object def() {
    return new ModelAndView("index");
  }


  @ApiOperation(value = "提供测试接口", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  @GetMapping(value = "/")
  public Object msg() {
    return ResultMsg.ok("欢迎访问WEB接口");
  }
}
