package com.amazon.spapi.custom.model;

import java.util.UUID;

import com.amazon.spapi.SellingPartnerAPIAA.AWSAuthenticationCredentials;
import com.amazon.spapi.SellingPartnerAPIAA.AWSAuthenticationCredentialsProvider;
import com.amazon.spapi.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.spapi.custom.constant.MarketplaceId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 包含所有认证信息：AWS、provider、LWA以及后续需要的销售区域信息
 *
 * @author: wangpeng
 * @date: 2022年5月25日 下午5:23:07
 */
@Getter
@Setter
@AllArgsConstructor
public class CredentialInfoDTO {

    private AWSAuthenticationCredentials aws;

    private AWSAuthenticationCredentialsProvider provider;

    private LWAAuthorizationCredentials lwa;

    private MarketplaceId marketplaceId;

    public static CredentialInfoDTO of(CredentialConfigDTO config) {
        MarketplaceId mId = MarketplaceId.of(config.getCountry());

        AWSAuthenticationCredentials aws = AWSAuthenticationCredentials.builder()
                // 注册成为开发者时生成的AWS访问密钥ID
                .accessKeyId(config.getAccessKeyId())
                // 注册成为开发者时生成的AWS访问密钥
                .secretKey(config.getSecretKey())
                .region(mId.getEndPoint().getRegion())
                .build();

        AWSAuthenticationCredentialsProvider provider = AWSAuthenticationCredentialsProvider.builder()
                // 创建IAM职权的时候会生成这个ARN
                .roleArn(config.getRoleArn())
                // 唯一值，可以使用UUID
                .roleSessionName(UUID.randomUUID().toString())
                .build();

        LWAAuthorizationCredentials lwa = LWAAuthorizationCredentials.builder()
                // 查看开发者信息的时候可看到LWA的客户端编码
                .clientId(config.getClientId())
                // 查看开发者信息的时候可看到LWA的客户端秘钥
                .clientSecret(config.getClientSecret())
                // 根据上面的客户端编码和客户端秘钥请求客户端令牌
                .refreshToken(config.getRefreshToken())
                .endpoint("https://api.amazon.com/auth/o2/token")
                .build();

        return new CredentialInfoDTO(aws, provider, lwa, mId);
    }
}
