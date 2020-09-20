package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 限流规则  推送
 * @author 赵育冬
 */
@Component("flowRuleApolloPublisher")
public class FlowRuleApolloPublisher extends BaseApolloRulePublisher {

    @Override
    public void publish(String app, Object rules) throws Exception {
        List<FlowRuleEntity> flowRuleEntityList = (List<FlowRuleEntity>) rules;
        //去掉一些无用属性
        for (FlowRuleEntity flowRuleEntity : flowRuleEntityList) {
            flowRuleEntity.setGmtCreate(null);
            flowRuleEntity.setGmtModified(null);
            flowRuleEntity.setIp(null);
            flowRuleEntity.setPort(null);
        }

        super.publish(app, rules);
    }
    @Override
    protected String getDataId() {
        return ApolloConfigUtil.getFlowDataId();
    }
}