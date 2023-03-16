package com.amazon.spapis;

import java.util.Arrays;
import java.util.List;

import com.amazon.spapi.custom.constant.MarketplaceId;
import com.amazon.spapi.custom.model.CredentialConfigDTO;
import com.amazon.spapi.custom.model.CredentialInfoDTO;


/**
 * SP-API通用工具类
 *
 * @author: wangpeng
 * @date: 2022年7月27日 下午3:45:17
 */
public class SpApiCommonUtil {

    private SpApiCommonUtil() {

    }

    /**
     * 从认证信息中获取marketplaceIds
     */
    public static List<String> getMarketplaceIds(CredentialInfoDTO credentialInfoDTO) {
        MarketplaceId marketplaceId = credentialInfoDTO.getMarketplaceId();
        return Arrays.asList(marketplaceId.getMarketplaceId());
    }

    public static CredentialInfoDTO getFixedCredentialInfo(String refreshToken, String country) {
        CredentialConfigDTO dto = new CredentialConfigDTO();
        dto.setAccessKeyId("AKIA2DLNGWT4VB2IDJFF");
        dto.setSecretKey("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");
        dto.setRoleArn("arn:aws:iam::694403118329:role/erp-role");
        dto.setClientId("amzn1.application-oa2-client.e015a393a2804d1cb3422eb20e17a732");
        dto.setClientSecret("0f7b6e86969a5d34ab8f3326cd786c8c0a14d7aa5cebcb27426ee4d90b2f06ee");
        dto.setRefreshToken(refreshToken);
        dto.setCountry(country);
        return CredentialInfoDTO.of(dto);
    }
}
