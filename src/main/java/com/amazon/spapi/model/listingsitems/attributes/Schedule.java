package com.amazon.spapi.model.listingsitems.attributes;

import java.math.BigDecimal;

import com.alibaba.fastjson.JSON;

import lombok.Data;

/**
 * @author xiongchaodu
 * @date 2023/02/23 9:58
 **/
@Data
public class Schedule {

    private String start_at;
    private String end_at;
    private BigDecimal value_with_tax;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
