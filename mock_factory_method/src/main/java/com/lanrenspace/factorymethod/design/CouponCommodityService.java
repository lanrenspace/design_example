package com.lanrenspace.factorymethod.design;

import com.lanrenspace.award.service.CouponService;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * @Author lanrenspace@163.com
 * @Description: 优惠券发奖实现
 **/
public class CouponCommodityService implements ICommodity {


    /**
     * logger
     */
    private static final Logger logger = Logger.getLogger(CouponCommodityService.class);

    @Override
    public void sendCommodity(String userId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponService couponService = new CouponService();
        logger.info("优惠券发奖开始，用户：{" + userId + "}");
        couponService.sendCoupon(userId, "", bizId);
        logger.info("优惠券发奖完成，用户：{" + userId + "}");
    }
}
