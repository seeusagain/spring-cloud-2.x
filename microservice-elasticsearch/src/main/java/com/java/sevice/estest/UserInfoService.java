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

    /**
     * 每隔五秒日志一把
     *
     * @throws InterruptedException
     */
    public void addToEs() {
        for (int i = 0; i < 100; i++) {
            List<UserInfoDTO> users = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                UserInfoDTO userInfoDTO = new UserInfoDTO(IdGeneratorUtils.getSerialNo(),
                        "名称" + i + j, "nikeName" + i + j, "i love dog");
                users.add(userInfoDTO);
            }
            this.userInfoRepo.saveAll(users);
            LOG.info("单词添加成功 " + i);
        }
    }

}
