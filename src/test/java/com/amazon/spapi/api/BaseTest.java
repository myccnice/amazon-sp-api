package com.amazon.spapi.api;

import com.amazon.spapi.custom.constant.MarketplaceId;
import com.amazon.spapi.custom.model.CredentialConfigDTO;
import com.amazon.spapi.custom.model.CredentialInfoDTO;

/**
 * 测试基类
 *
 * @author: wangpeng
 * @date: 2022年5月25日 下午5:52:14
 */
public class BaseTest {

    protected CredentialConfigDTO getJingTongYunConfig() {
        CredentialConfigDTO dto = new CredentialConfigDTO();
        dto.setAccessKeyId("AKIA2DLNGWT4ZVTYO2IT");
        dto.setSecretKey("xxx");
        dto.setRoleArn("arn:aws:iam::694403118329:role/iam_role");
        dto.setClientId("amzn1.application-oa2-client.10212ced02014df1a79a783777a3fcf3");
        dto.setClientSecret("18e5aff8a6a5d2d94a54fb4c5e4b11cd657a1880485ec81d4aeaa6721c2ba3c7");
        dto.setRefreshToken("xxx");
        dto.setCountry(String.valueOf(MarketplaceId.US.getId()));
        return dto;
    }

    protected CredentialInfoDTO getCredentialInfoDTO() {
        return CredentialInfoDTO.of(getJingTongYunConfig());
    }
}
