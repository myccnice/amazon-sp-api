package com.amazon.spapi.model.listingsitems;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.alibaba.fastjson.JSON;

import lombok.Data;

/**
 * @author xiongchaodu
 * @date 2023/02/23 9:58
 **/
public class Schedule extends ArrayList<Schedule.ScheduleObj> {

    private static final long serialVersionUID = 7185706845894736686L;

    @Data
    protected static class ScheduleObj {
        private String start_at;
        private String end_at;
        private BigDecimal value_with_tax;

        @Override
        public String toString() {
            return JSON.toJSONString(this);
        }
        
    }
}
