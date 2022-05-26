package com.amazon.spapi.custom.constant;

/**
 * marketplaceId 标识了请求的商城
 *
 * @author: wangpeng
 * @date: 2022年5月25日 下午4:43:20
 */
public enum MarketplaceId {

    /**
     * 销售区域隶属于北美的商城
     */
    // 美国站
    US(1, "ATVPDKIKX0DER", SpApiEndPoint.NORTH_AMERICA),
    // 加拿大站
    CA(2, "A2EUQ1WTGCTBG2", SpApiEndPoint.NORTH_AMERICA),
    // 墨西哥
    MX(3, "A1AM78C64UM0Y8", SpApiEndPoint.NORTH_AMERICA),
    // 巴西
    BR(13, "A2Q3Y263D00KWC", SpApiEndPoint.NORTH_AMERICA),

    /**
     * 销售区域隶属于欧洲的商城
     */
    GB(4, "A1F83G8C2ARO7P", SpApiEndPoint.EUROPE),
    FR(5, "A13V1IB3VIYZZH", SpApiEndPoint.EUROPE),
    IT(6, "APJ6JRA9NG5V4", SpApiEndPoint.EUROPE),
    ES(7, "A1RKKUPIHCS9HS", SpApiEndPoint.EUROPE),
    DE(8, "A1PA6795UKMFR9", SpApiEndPoint.EUROPE),
    IN(10, "A21TJRUUN4KGV", SpApiEndPoint.EUROPE),
    TR(21, "A33AVAJ2PDY3EV", SpApiEndPoint.EUROPE),
    AE(20, "A2VIGQ35RCS4UG", SpApiEndPoint.EUROPE),
    NL(22, "A1805IZSGTT6HS", SpApiEndPoint.EUROPE),

    /**
     * 销售区域隶属于远东的商城
     */
    JP(9, "A1VC38T7YXB528", SpApiEndPoint.FAR_EAST),
    AU(12, "A39IBJ37TRP1C6", SpApiEndPoint.FAR_EAST);

    /**
     * 境通云ERP系统中定义的配置库的attr值
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

    private MarketplaceId(int id, String marketplaceId, SpApiEndPoint endPoint) {
        this.id = id;
        this.marketplaceId = marketplaceId;
        this.endPoint = endPoint;
    }

    public int getId() {
        return id;
    }

    public String getMarketplaceId() {
        return marketplaceId;
    }

    public SpApiEndPoint getEndPoint() {
        return endPoint;
    }

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
