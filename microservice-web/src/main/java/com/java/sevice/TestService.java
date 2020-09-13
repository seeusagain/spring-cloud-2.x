package com.java.sevice;

import org.springframework.stereotype.Service;

@Service
public class TestService {


    public void sleepAndRun() throws Exception {
        int i = 0;
        while (i < 1000) {
            int a = 1 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2;
            System.out.println("正在计算：" + a);
            Thread.sleep(10);
            i++;
        }
    }
}
