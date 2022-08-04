package com.amazon.spapi.custom.constant;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * marketplaceId 标识了请求的商城
 *
 * @author: wangpeng
 * @date: 2022年5月25日 下午4:43:20
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum MarketplaceId {

    /**
     * 销售区域隶属于北美的商城
     */
    // 美国站
    US(1, "ATVPDKIKX0DER", SpApiEndPoint.NORTH_AMERICA, "https://sellercentral.amazon.com"),
    // 加拿大站
    CA(2, "A2EUQ1WTGCTBG2", SpApiEndPoint.NORTH_AMERICA, "https://sellercentral.amazon.ca"),
    // 墨西哥
    MX(3, "A1AM78C64UM0Y8", SpApiEndPoint.NORTH_AMERICA, "https://sellercentral.amazon.com.mx"),
    // 巴西
    BR(13, "A2Q3Y263D00KWC", SpApiEndPoint.NORTH_AMERICA, "https://sellercentral.amazon.com.br"),

    /**
     * 销售区域隶属于欧洲的商城
     */
    // 英国
    GB(4, "A1F83G8C2ARO7P", SpApiEndPoint.EUROPE, "https://sellercentral-europe.amazon.com"),
    // 法国
    FR(5, "A13V1IB3VIYZZH", SpApiEndPoint.EUROPE, "https://sellercentral-europe.amazon.com"),
    // 意大利
    IT(6, "APJ6JRA9NG5V4", SpApiEndPoint.EUROPE, "https://sellercentral-europe.amazon.com"),
    // 西班牙
    ES(7, "A1RKKUPIHCS9HS", SpApiEndPoint.EUROPE, "https://sellercentral-europe.amazon.com"),
    // 德国
    DE(8, "A1PA6795UKMFR9", SpApiEndPoint.EUROPE, "https://sellercentral-europe.amazon.com"),
    // 印度
    IN(10, "A21TJRUUN4KGV", SpApiEndPoint.EUROPE, "https://sellercentral.amazon.in"),
    // 土耳其
    TR(21, "A33AVAJ2PDY3EV", SpApiEndPoint.EUROPE, "https://sellercentral.amazon.com.tr"),
    // 中东
    AE(20, "A2VIGQ35RCS4UG", SpApiEndPoint.EUROPE, "https://sellercentral.amazon.ae"),
    // 荷兰
    NL(22, "A1805IZSGTT6HS", SpApiEndPoint.EUROPE, "https://sellercentral.amazon.nl"),

    /**
     * 销售区域隶属于远东的商城
     */
    // 日本
    JP(9, "A1VC38T7YXB528", SpApiEndPoint.FAR_EAST, "https://sellercentral-japan.amazon.com"),
    AU(12, "A39IBJ37TRP1C6", SpApiEndPoint.FAR_EAST, "https://sellercentral.amazon.com.au");

    /**
     * 境通云ERP系统中定义的配置库的ATTR值
     * @see AWSOpeningStation
     */
    private int id;

    /**
     * 亚马逊定义的商城标示
     */
    private String marketplaceId;

    /**
     * 该站点所属的API 端点
     */
    private SpApiEndPoint endPoint;

    /**
     * 亚马逊卖家中心URL
     * https://developer-docs.amazon.com/sp-api/docs/seller-central-urls
     */
    private String sellerCentralURL;

    public static MarketplaceId of(int country) {
        for (MarketplaceId mi : MarketplaceId.values()) {
            if (country == mi.getId()) {
                return mi;
            }
        }
        return null;
    }

    public static MarketplaceId of(String country) {
        return of(Integer.valueOf(country));
    }
}
