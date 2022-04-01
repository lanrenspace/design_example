package com.lanrenspace.factorymethod.design;

import com.lanrenspace.award.entity.DeliverReq;
import com.lanrenspace.award.service.DeliverReqService;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * @Author lanrenspace@163.com
 * @Description: 实物奖品发放实现
 **/
public class GoodsCommodityService implements ICommodity {

    /**
     * logger
     */
    private static final Logger logger = Logger.getLogger(GoodsCommodityService.class);

    @Override
    public void sendCommodity(String userId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        logger.info("实物奖品发放开始，用户：{" + userId + "}");
        DeliverReqService deliverReqService = new DeliverReqService();
        deliverReqService.deliverGoods(new DeliverReq());
        logger.info("实物奖品发放结束，用户：{" + userId + "}");
    }
}
