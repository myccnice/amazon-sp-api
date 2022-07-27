package com.amazon.spapi.api;

import org.junit.jupiter.api.Test;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.custom.model.CredentialInfoDTO;
import com.amazon.spapi.model.orders.GetOrderResponse;
import com.amazon.spapi.model.orders.Order;

/**
 * API tests for OrdersV0Api
 *
 * @author: wangpeng
 * @date: 2022年5月25日 下午6:00:53
 */
public class OrdersApiTest extends BaseTest {

    private OrdersV0Api getApi() {
        CredentialInfoDTO credential = getCredentialInfoDTO();
        return new OrdersV0Api.Builder()
                .awsAuthenticationCredentials(credential.getAws())
                .lwaAuthorizationCredentials(credential.getLwa())
                .awsAuthenticationCredentialsProvider(credential.getProvider())
                .endpoint(credential.getMarketplaceId().getEndPoint().getEndpoint())
                .build();
    }

    @Test
    public void getOrder() {
        OrdersV0Api api = getApi();
        try {
            GetOrderResponse order = api.getOrder("1233");
            Order payload = order.getPayload();
            if (payload == null) {
                System.out.println("dddd");
            }
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}
