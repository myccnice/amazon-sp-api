package com.amazon.spapi.custom.model;

import com.amazon.spapi.custom.constant.SpApiEndPoint;

import lombok.Getter;
import lombok.Setter;

/**
 * 授权资格配置DTO，包括AWS和LWA配置
 *
 * @author: wangpeng
 * @date: 2022年5月25日 下午4:28:31
 */
@Getter
@Setter
public class CredentialConfigDTO {

    /**
     * 店铺中country字段：即站点
     */
    private String country;

    /**
     * AWS访问密钥编码
     */
    private String accessKeyId;

    /**
     * AWS访问密钥
     */
    private String secretKey;

    /**
     * AWS区域
     */
    private SpApiEndPoint endPoint;

    /**
     * IAM职权ARN
     */
    private String roleArn;

    /**
     * LWA客户端编码
     */
    private String clientId;

    /**
     * LWA客户端秘钥
     */
    private String clientSecret;

    /**
     * LWA的refreshToken
     */
    private String refreshToken;
}
