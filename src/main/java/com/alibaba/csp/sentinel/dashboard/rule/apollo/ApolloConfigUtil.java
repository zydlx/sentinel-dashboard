package com.alibaba.csp.sentinel.dashboard.rule.apollo;

/**
 * @author 赵育冬
 */

public final class ApolloConfigUtil {
    /**
     * 流控规则id
     */
    public static final String FLOW_DATA_ID_POSTFIX = "sentinel-flow-rules";
    /**
     * 降级规则id
     */
    public static final String DEGRADE_DATA_ID_POSTFIX = "sentinel-degrade-rules";
    /**
     * 热点规则id
     */
    public static final String PARAM_FLOW_DATA_ID_POSTFIX = "sentinel-param-flow-rules";
    /**
     * 系统规则id
     */
    public static final String SYSTEM_DATA_ID_POSTFIX = "sentinel-system-rules";
    /**
     * 授权规则id
     */
    public static final String AUTHORITY_DATA_ID_POSTFIX = "sentinel-authority-rules";
    /**
     * 规则存储nameSpace
     */
    public static final String NAMESPACE_NAME = "application";

    private ApolloConfigUtil() {
    }

    public static String getFlowDataId() {
        return FLOW_DATA_ID_POSTFIX;
    }

    public static String getDegradeDataId() {
        return DEGRADE_DATA_ID_POSTFIX;
    }

    public static String getParamFlowDataId() {
        return PARAM_FLOW_DATA_ID_POSTFIX;
    }

    public static String getSystemDataId() {
        return SYSTEM_DATA_ID_POSTFIX;
    }

    public static String getAuthorityDataId() {
        return AUTHORITY_DATA_ID_POSTFIX;
    }
    public static String getNamespaceName() {
        return NAMESPACE_NAME;
    }
}