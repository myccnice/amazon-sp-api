package com.amazon.spapi.custom.constant;

/**
 * 用于打印标签的页面类型。提交您的市场不支持的 PageType 值会返回错误。
 *
 * @author: wangpeng
 * @date: 2022年8月5日 下午4:10:44
 */
public enum PageType {
    /**
     * Two labels per US Letter label sheet.
     * This is the only valid value for Amazon-partnered shipments 
     * in the US that use United Parcel Service (UPS) as the carrier. 
     * Supported in Canada and the US.
     */
    PackageLabel_Letter_2,
    /**
     * Four labels per US Letter label sheet. 
     * This is the only valid value for non-Amazon-partnered shipments in the US.
     * Supported in Canada and the US.
     */
    PackageLabel_Letter_4,
    /**
     * Six labels per US Letter label sheet.
     * This is the only valid value for non-Amazon-partnered shipments in the US.
     * Supported in Canada and the US.
     */
    PackageLabel_Letter_6,
    /**
     * PackageLabel_Letter_6_CarrierLeft
     */
    PackageLabel_Letter_6_CarrierLeft,
    /**
     * Two labels per A4 label sheet.
     */
    PackageLabel_A4_2,
    /**
     * Four labels per A4 label sheet.
     */
    PackageLabel_A4_4,
    /**
     * One label per sheet of US Letter paper.
     * Only for non-Amazon-partnered shipments.
     */
    PackageLabel_Plain_Paper,
    /**
     * PackageLabel_Plain_Paper_CarrierBottom
     */
    PackageLabel_Plain_Paper_CarrierBottom,
    /**
     * For use of a thermal printer.
     * Supports Amazon-partnered shipments with UPS.
     */
    PackageLabel_Thermal,
    /**
     * For use of a thermal printer. Supports shipments with ATS.
     */
    PackageLabel_Thermal_Unified,
    /**
     * For use of a thermal printer. Supports non-Amazon-partnered shipments.
     */
    PackageLabel_Thermal_NonPCP,
    /**
     * For use of a thermal printer. Supports Amazon-partnered shipments with DHL.
     */
    PackageLabel_Thermal_No_Carrier_Rotation;
}
