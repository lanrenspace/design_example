package com.lanrenspace.award.service;

import com.lanrenspace.award.entity.CouponResult;
import org.apache.log4j.Logger;

/**
 * @Author lanrenspace@163.com
 * @Description: 模拟优惠券奖品发放
 **/
public class CouponService {

    /**
     * log
     */
    private static final Logger logger = Logger.getLogger(CouponService.class);


    /**
     * 发放优惠券
     *
     * @param userId
     * @param couponNumber
     * @param uuid
     * @return
     */
    public CouponResult sendCoupon(String userId, String couponNumber, String uuid) {
        return new CouponResult();
    }
}
