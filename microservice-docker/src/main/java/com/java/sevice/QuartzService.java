package com.java.sevice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class QuartzService {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 每隔五秒日志一把
     *
     * @throws InterruptedException
     */
    @Scheduled(cron = "*/5 * * * * ?")
    public void test() {
        LOG.info("这是一个info级别的日志:{} ", sdf.format(new Date()));
        LOG.error("这是一个info级别的日志:{} ", sdf.format(new Date()));
    }

}
