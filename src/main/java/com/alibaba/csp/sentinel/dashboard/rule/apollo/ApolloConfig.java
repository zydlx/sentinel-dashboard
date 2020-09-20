package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.ctrip.framework.apollo.openapi.client.ApolloOpenApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Apollo 配置类
 * @author 赵育冬
 */
@Configuration
public class ApolloConfig {
    @Bean
    public ApolloOpenApiClient apolloOpenApiClient() {
        ApolloOpenApiClient client = ApolloOpenApiClient.newBuilder()
                .withPortalUrl("http://localhost:8070")
                .withToken("c93cc5fc700ad21a1236ffc7d8c2417273404a4f")
                .build();
        return client;
    }
}
