package com.lanrenspace.factorymethod.design;

import com.lanrenspace.award.service.IQiYiCardService;

/**
 * @Author lanrenspace@163.com
 * @Description: 创建商铺工厂
 **/
public class StoreFactory {


    /**
     * 获取具体的奖品
     *
     * @param commodityType
     * @return
     */
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }
        ICommodity commodity = null;
        switch (commodityType) {
            case 1:
                commodity = new CouponCommodityService();
                break;
            case 2:
                commodity = new GoodsCommodityService();
                break;
            case 3:
                commodity = new CardCommodityService();
                break;
            default:
        }
        return commodity;
    }
}
