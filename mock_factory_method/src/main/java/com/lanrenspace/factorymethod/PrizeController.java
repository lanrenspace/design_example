package com.lanrenspace.factorymethod;

import com.lanrenspace.award.entity.DeliverReq;
import com.lanrenspace.award.service.CouponService;
import com.lanrenspace.award.service.DeliverReqService;
import com.lanrenspace.award.service.IQiYiCardService;
import com.lanrenspace.factorymethod.entity.AwardReq;
import com.lanrenspace.factorymethod.entity.AwardRes;
import org.apache.log4j.Logger;

/**
 * @Author lanrenspace@163.com
 * @Description: 常规if else 方式实现
 **/
public class PrizeController {

    /**
     * log
     */
    private static final Logger logger = Logger.getLogger(PrizeController.class);


    /**
     * 发奖
     *
     * @param awardReq
     * @return
     */
    public AwardRes awardToUser(AwardReq awardReq) {
        AwardRes awardRes = null;
        logger.info("奖品发放开始，用户：{" + awardReq.getUserId() + "} 奖品类型：{" + awardReq.getAwardType() + "}");
        if (1 == awardReq.getAwardType()) {
            CouponService couponService = new CouponService();
            couponService.sendCoupon(awardReq.getUserId(), "", "");
            awardRes = new AwardRes();
        } else if (2 == awardReq.getAwardType()) {
            DeliverReqService deliverReqService = new DeliverReqService();
            deliverReqService.deliverGoods(new DeliverReq());
            awardRes = new AwardRes();
        } else if (3 == awardReq.getAwardType()) {
            IQiYiCardService iQiYiCardService = new IQiYiCardService();
            iQiYiCardService.grantToken("", awardReq.getUserId());
            awardRes = new AwardRes();
        }
        logger.info("奖品发放完成，用户：{" + awardReq.getUserId() + "}");
        return awardRes;
    }
}
