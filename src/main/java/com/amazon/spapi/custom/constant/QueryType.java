package com.amazon.spapi.custom.constant;

/**
 * QueryType
 * https://developer-docs.amazon.com/sp-api/docs/fulfillment-inbound-api-v0-reference#querytype-subgroup-1
 *
 * @author: wangpeng
 * @date: 2022年8月9日 上午11:00:13
 */
public enum QueryType {

    /**
     * For use with the operation(s): getShipments
     *
     * Returns shipments based on the shipment information
     * provided by the ShipmentStatusList or ShipmentIdList parameters.
     */
    SHIPMENT,

    /**
     * For use with the operation(s): getShipments, getShipmentItems
     *
     * Returns shipments based on the date range information
     * provided by the LastUpdatedAfter and LastUpdatedBefore parameters.
     */
    DATE_RANGE,
    
    /**
     * For use with the operation(s): getShipments, getShipmentItems
     *
     * Returns shipments by using NextToken to continue returning items
     * specified in a previous request.
     */
    NEXT_TOKEN;
}
