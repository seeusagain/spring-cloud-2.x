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
@Document(indexName = "basic_index", shards = 2, replicas = 1)
public class UserInfoDTO {

    @Id
    private String userId;

    @Field(type = FieldType.Keyword)
    private String userName;

    @Field(type = FieldType.Keyword)
    private String nikeName;

    /**
     * ik_max_word
     * 会将文本做最细粒度的拆分，比如会将“中华人民共和国人民大会堂”拆分为“中华人民共和国、中华人民、中华、华人、人民共和国、人民、共和国、大会堂、大会、会堂等词语。
     *
     * ik_smart
     * 会做最粗粒度的拆分，比如会将“中华人民共和国人民大会堂”拆分为中华人民共和国、人民大会堂。
     */
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String remarks;
}
