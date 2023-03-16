package com.amazon.spapis;


import java.util.List;

import org.junit.Ignore;

import com.amazon.spapi.api.ListingsApi;
import com.amazon.spapi.custom.model.CredentialInfoDTO;

/**
 * 亚马逊SP-API基础测试类
 * @author chenhongzhi
 * @date 2023/1/17 10:44
 */
public class AmazonBaseSpApiTest {
    public static String sellerId= "AN2WR6HSTE77I";
    
    protected static String refreshToken =
            // AMSUUS
            "Atzr|IwEBIDIYAr9VG58mbdn9Szybikh5w0uzH7XOzzDNYA_6SI4xJVUAxLYn3RPT41COLf-vKzmZTLZYApDTYaigukPjCiPVweZhtwVEcILUEWcCzc7gPwFcQmTcXXZhvXLrmsB9OopNYbLPJvXjjbr3bkhLbkTLBhmNlCN5Ybrdw7jlR1Wa9hWU54KN_qCRaU6nCl1M2MhM_AjhcxAPl8V0-WHJPPctv1AhzjjXOGG_h0A1o92N11_-WAZt8zGSXO-kHPvPY9424uHYlHr_-KLqHAQuusXHTumFAXGpcRwS26hVyIm1mSzcPqPYOigF_LnqNRWDqhE";

    // 店铺所对应的country字段
    protected static String country =
            "1";

    protected static CredentialInfoDTO credential = SpApiCommonUtil.getFixedCredentialInfo(refreshToken, country);

    protected static String endPoint = credential.getMarketplaceId().getEndPoint().getEndpoint();
    
    protected static List<String> marketPlaceIds = SpApiCommonUtil.getMarketplaceIds(credential);
    

    
    static ListingsApi listingApi = new ListingsApi.Builder()
            .awsAuthenticationCredentials(credential.getAws())
            .lwaAuthorizationCredentials(credential.getLwa())
            .awsAuthenticationCredentialsProvider(credential.getProvider())
            .endpoint(credential.getMarketplaceId().getEndPoint().getEndpoint())
            .build();  
    
}
