package com.lanrenspace.factorymethod.design;

import java.util.Map;

/**
 * @Description: 定义发奖接口
 */
public interface ICommodity {

    /**
     * 发奖
     * @param userId 用户id
     * @param commodityId 奖品ID
     * @param bizId 业务ID
     * @param extMap 扩展参数
     * @throws Exception
     */
    void sendCommodity(String userId, String commodityId, String bizId, Map<String,String> extMap) throws Exception;
}
