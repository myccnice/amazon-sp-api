package com.amazon.spapi.model.listingsitems.attributes;

import java.util.List;

import com.alibaba.fastjson.JSON;

import lombok.Data;

/**
 * @author xiongchaodu
 * @date 2023/02/23 9:57
 **/
@Data
public class PurchasableOffer {

    private Time start_at;

    private Time end_at;
    /**
     * 实时货币
     */
    private String currency;

    /**
     * 原价
     */
    private List<Price> our_price;

    /**
     * 优惠价（销售价格）
     */
    private List<Price> discounted_price;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    @Data
    public static class Time {
        private String value;

        @Override
        public String toString() {
            return JSON.toJSONString(this);
        }
    }
}
