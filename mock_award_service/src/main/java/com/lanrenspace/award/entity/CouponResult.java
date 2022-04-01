package com.lanrenspace.award.entity;

import java.io.Serializable;

/**
 * @Author lanrenspace@163.com
 * @Description: 模拟优惠券奖品发放成功返回信息
 **/
public class CouponResult implements Serializable {

    /**
     * 优惠券ID
     */
    private Long couponId;

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }
}
