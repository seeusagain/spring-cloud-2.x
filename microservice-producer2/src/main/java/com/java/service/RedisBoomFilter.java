package com.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Auth xulu
 * @Date 2020/8/24
 * @Desc TODO
 */
public class RedisBoomFilter {

    @Autowired
    private RedisTemplate redisTemplate;

    public void boolmFilter() {
//        this.redisTemplate.opsForValue().setBit();
    }

}
