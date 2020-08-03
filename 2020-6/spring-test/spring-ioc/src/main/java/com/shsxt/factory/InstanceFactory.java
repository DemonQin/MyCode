package com.shsxt.factory;

import com.shsxt.service.GoodsService;

public class InstanceFactory {

    public GoodsService getGoodsService(){
        /**
         * 业务逻辑
         */
       GoodsService goodsService= new GoodsService();
        /**
         * 业务处理
         */
        return  goodsService;
    }
}
