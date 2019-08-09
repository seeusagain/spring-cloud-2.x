package com.java.service;

import com.java.dto.ResultMsg;

/**
 * @author xulu
 * @date 2019/6/17 18:22
 * @description: feign远程调用
 */
public interface IFeignTestService {

  ResultMsg testFeign(String name);
}
