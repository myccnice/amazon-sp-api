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
        dto.setAccessKeyId("AKIA2DLNGWT4VB2IDJFF");
        dto.setSecretKey("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");
        dto.setRoleArn("arn:aws:iam::694403118329:role/erp-role");
        dto.setClientId("amzn1.application-oa2-client.e015a393a2804d1cb3422eb20e17a732");
        dto.setClientSecret("c860f12fde8b962b3e94328e4c8d26ea9f9801ebfa7e66a2e75e1ad7c068a708");
        dto.setRefreshToken("Atzr|IwEBIBhkwi9WBvVpjR6TXFYbqOpE30x5VqVlv-seLLRYjkJ-nrRnpKOYl8H7G4oogdxxLkF4Tek_st15yXyytohwrDnxcMHuXgzRlbm27cyoJWsXi7_36Ts5yd46B1TOu5zt2IXBgY0o-iTHYNpAPEk5C-B5jTNbSHhDSh8Q5ahByfcu1Nn8LwgfStVhVVauJC3uVHvfnaLpZ0_A1wn3nveWwIjt4XGPvI-yGfnf1ggKD_H9s8yZFhsoBT0HNgyHxbSC-BRoLcB0BmRRI7BQJ4_3u2iK8nkGCJYXvNwlzV4V-Wnzp6s6cGV8LVcEeGZq4BZB-pk");
        dto.setCountry(String.valueOf(MarketplaceId.US.getId()));
        return dto;
    }

    protected CredentialInfoDTO getCredentialInfoDTO() {
        return CredentialInfoDTO.of(getJingTongYunConfig());
    }
}
