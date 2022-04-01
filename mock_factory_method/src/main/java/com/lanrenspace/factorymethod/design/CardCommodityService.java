package com.lanrenspace.factorymethod.design;

import com.lanrenspace.award.service.IQiYiCardService;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * @Author lanrenspace@163.com
 * @Description: 爱奇艺兑换卡奖品实现
 **/
public class CardCommodityService implements ICommodity {

    /**
     * logger
     */
    private static final Logger logger = Logger.getLogger(CardCommodityService.class);

    @Override
    public void sendCommodity(String userId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        logger.info("爱奇艺兑换卡发奖开始，用户：{" + userId + "}");
        IQiYiCardService iQiYiCardService = new IQiYiCardService();
        iQiYiCardService.grantToken(userId, "");
        logger.info("爱奇艺兑换卡发奖结束，用户：{" + userId + "}");
    }
}
