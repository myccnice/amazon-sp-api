package com.amazon.spapi.model.listingsitems;

import java.util.ArrayList;

import com.alibaba.fastjson.JSON;

import lombok.Data;

/**
 * @author xiongchaodu
 * @date 2023/02/23 9:57
 **/
public class PurchasableOffer extends ArrayList<PurchasableOffer.PurchasableOfferItem> {

    private static final long serialVersionUID = 3704947783009012223L;

    @Data
    public static class PurchasableOfferItem {

        private Time start_at;

        private Time end_at;
        /**
         * 实时货币
         */
        private String currency;

        /**
         * 原价
         */
        private Price our_price;

        /**
         * 优惠价（销售价格）
         */
        private Price discounted_price;

        @Override
        public String toString() {
            return JSON.toJSONString(this);
        }

        public static class Price extends ArrayList<Price.PriceItem> {

            private static final long serialVersionUID = -3825731126637673106L;

            @Data
            public static class PriceItem {
                private Schedule schedule;

                @Override
                public String toString() {
                    return JSON.toJSONString(this);
                }
            }
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
}
