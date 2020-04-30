package com.java.sevice.estest;

import com.java.utils.IdGeneratorUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoService {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserInfoRepo userInfoRepo;

    private static final List<String> TEST_LIST;

    static {
        TEST_LIST = new ArrayList<>();
        TEST_LIST.add("芦叶满汀洲");
        TEST_LIST.add("寒沙带浅流");
        TEST_LIST.add("二十年重过南楼");
        TEST_LIST.add("叶下系船尤未稳，能几日，又中秋");
        TEST_LIST.add("黄鹤断矶头");
        TEST_LIST.add("故人曾到否");
        TEST_LIST.add("旧江山浑是新惆");
        TEST_LIST.add("欲买桂花同载酒，终不似，少年游");

        TEST_LIST.add("where there is a river,there is a city");
        TEST_LIST.add("there is a city");
        TEST_LIST.add("i don't love city,i love countryside");
    }

    /**
     * 每隔五秒日志一把
     *
     * @throws InterruptedException
     */
    public void addToEs() {
        List<UserInfoDTO> users = new ArrayList<>();
        TEST_LIST.stream().forEach(item -> {
            UserInfoDTO userInfoDTO = new UserInfoDTO(IdGeneratorUtils.getSerialNo(), "name", "nikeName", item);
            users.add(userInfoDTO);

        });
        this.userInfoRepo.saveAll(users);
    }

}
