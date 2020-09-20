package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.gateway.GatewayFlowRuleEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 网关限流 规则 拉取
 * @author 赵育冬
 */
@Component("gatewayFlowRuleApolloProvider")
public class GatewayFlowRuleApolloProvider extends BaseApolloRuleProvider {

    @Override
    public List<GatewayFlowRuleEntity> getRules(String appName) throws Exception {
        return super.getRules(appName);
    }
    @Override
    protected String getDataId() {
        return ApolloConfigUtil.getFlowDataId();
    }

    @Override
    protected Class getRuleClazz() {
        return GatewayFlowRuleEntity.class;
    }
}
