package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.gateway.GatewayFlowRuleEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 网关流控规则 推送
 * @author 赵育冬
 */
@Component("gatewayFlowRuleApolloPublisher")
public class GatewayFlowRuleApolloPublisher extends BaseApolloRulePublisher {

    @Override
    public void publish(String app, Object rules) throws Exception {
        List<GatewayFlowRuleEntity> gatewayFlowRuleEntitys = (List<GatewayFlowRuleEntity>) rules;
        //去掉一些无用属性
        for (GatewayFlowRuleEntity gatewayFlowRuleEntity : gatewayFlowRuleEntitys) {
            gatewayFlowRuleEntity.setGmtCreate(null);
            gatewayFlowRuleEntity.setGmtModified(null);
            gatewayFlowRuleEntity.setIp(null);
            gatewayFlowRuleEntity.setPort(null);
        }

        super.publish(app, rules);
    }
    @Override
    protected String getDataId() {
        return ApolloConfigUtil.getFlowDataId();
    }
}
