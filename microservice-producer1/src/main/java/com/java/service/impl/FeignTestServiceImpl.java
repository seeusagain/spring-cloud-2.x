package com.java.service.impl;

import com.java.dto.ResultMsg;
import com.java.service.IFeignTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author xulu
 * @date 2019/6/17 18:22
 * @description: TODO
 */
@Service
public class FeignTestServiceImpl implements IFeignTestService {

  private static Logger logger = LoggerFactory.getLogger(FeignTestServiceImpl.class);

  @Override
  public ResultMsg testFeign(String name) {
    logger.info("fei远程调用开始");
    return null;
  }
}
