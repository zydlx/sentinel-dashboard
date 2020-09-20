package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 限流规则 拉取
 * @author 赵育冬
 */
@Component("flowRuleApolloProvider")
public class FlowRuleApolloProvider extends BaseApolloRuleProvider {

    @Override
    public List<FlowRuleEntity> getRules(String appName) throws Exception {
        return super.getRules(appName);
    }

    @Override
    protected String getDataId() {
        return ApolloConfigUtil.getFlowDataId();
    }

    @Override
    protected Class getRuleClazz() {
        return FlowRuleEntity.class;
    }
}