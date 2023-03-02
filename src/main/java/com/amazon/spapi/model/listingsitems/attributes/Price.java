package com.amazon.spapi.model.listingsitems.attributes;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.List;

/**
 * @author xiongchaodu
 * @date 2023/02/27 11:45
 **/
@Data
public class Price {

    private List<Schedule> schedule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
