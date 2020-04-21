package com.java.sevice.estest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * index相当于db
 * type相当于table
 */
@Document(indexName = "basic_index",type = "user_info", shards = 3, replicas = 2)
public class UserInfoDTO {

    @Id
    private String userId;

    @Field(type = FieldType.Keyword)
    private String userName;

    @Field(type = FieldType.Keyword)
    private String nikeName;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String remarks;
}
