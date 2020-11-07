package com.conpany.project;

import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author wangtao
 * @date 2020/11/7 20:47
 * @desc
 */
public class ElasticSearchConfigTest extends Tester{
    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Test
    public void Test() throws IOException {
        CreateIndexRequest request = new CreateIndexRequest("wangtao");
        CreateIndexResponse createIndexResponse =
                restHighLevelClient.indices().create(request, RequestOptions.DEFAULT);
        System.out.println(createIndexResponse);
    }

}
