package com.amazon.spapi.custom.constant;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 销售伙伴 API 端点
 * 销售伙伴 API 端点与特定 AWS 区域相关联。
 * AWS 区域非常重要，因为它是凭证范围的一部分，是在调用销售伙伴 API 时计算签名所必需的。
 * 有关更多信息，请参阅凭据范围。
 *
 * @author: wangpeng
 * @date: 2022年5月20日 上午11:19:07
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SpApiEndPoint {

    // 北美（加拿大、美国、墨西哥和巴西商城）
    NORTH_AMERICA("us-east-1", "https://sellingpartnerapi-na.amazon.com"),
    // 欧洲（西班牙、英国、法国、荷兰、德国、意大利、土耳其、阿联酋和印度商城）
    EUROPE("eu-west-1", "https://sellingpartnerapi-eu.amazon.com"),
    // 远东（新加坡、澳大利亚和日本商城）
    FAR_EAST("us-west-2", "https://sellingpartnerapi-fe.amazon.com");

    /**
     * AWS 区域
     */
    private String region;

    /**
     * 端点
     */
    private String endpoint;
}
