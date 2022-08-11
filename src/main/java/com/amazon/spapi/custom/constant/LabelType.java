package com.amazon.spapi.custom.constant;

/**
 * The type of labels requested.
 *
 * @author: wangpeng
 * @date: 2022年8月5日 下午4:19:25
 */
public enum LabelType {

    /**
     * This option is provided only for shipments where 2D Barcodes will be applied to all packages.
     * Amazon strongly recommends using the UNIQUE option to get package labels instead of the BARCODE_2D option.
     */
    BARCODE_2D,
    /**
     * Document data for printing unique shipping labels and carrier labels for an inbound shipment.
     */
    UNIQUE,
    /**
     * Document data for printing pallet labels for a Less Than Truckload/Full Truckload (LTL/FTL) inbound shipment.
     */
    PALLET;
}
