package com.java.sevice.estest;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserInfoRepo extends ElasticsearchRepository<UserInfoDTO, String> {
}
