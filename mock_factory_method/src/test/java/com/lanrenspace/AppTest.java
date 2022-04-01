package com.lanrenspace;

import static org.junit.Assert.assertTrue;

import com.lanrenspace.factorymethod.PrizeController;
import com.lanrenspace.factorymethod.design.ICommodity;
import com.lanrenspace.factorymethod.design.StoreFactory;
import com.lanrenspace.factorymethod.entity.AwardReq;
import com.lanrenspace.factorymethod.entity.AwardRes;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * logger
     */
    private static final Logger logger = Logger.getLogger(AppTest.class);

    /**
     * 测试常规发奖实现
     */
    @Test
    public void test_prize_awardToUser() {
        PrizeController prizeController = new PrizeController();
        System.out.println("\r\n模拟发放优惠券测试\r\n");
        AwardRes awardRes = prizeController.awardToUser(new AwardReq(1));
        logger.info("测试结果：{" + awardRes.getMsg() + "}");

        System.out.println("\r\n模拟发放实物商品测试\r\n");
        awardRes = prizeController.awardToUser(new AwardReq(2));
        logger.info("测试结果：{" + awardRes.getMsg() + "}");

        System.out.println("\r\n模拟发放爱奇艺电子券测试\r\n");
        awardRes = prizeController.awardToUser(new AwardReq(3));
        logger.info("测试结果：{" + awardRes.getMsg() + "}");
    }


    /**
     * 测试工厂方法模式发奖
     */
    @Test
    public void test_design_commodity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();
        // 优惠券
        ICommodity commodityService = storeFactory.getCommodityService(1);
        commodityService.sendCommodity("10002", "", "", null);
        // 实物
        commodityService = storeFactory.getCommodityService(2);
        commodityService.sendCommodity("10002", "", "", null);
        // 爱奇艺电子卡
        commodityService = storeFactory.getCommodityService(3);
        commodityService.sendCommodity("10002", "", "", null);

    }
}
