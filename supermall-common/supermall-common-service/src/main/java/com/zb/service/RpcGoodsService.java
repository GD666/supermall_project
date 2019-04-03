package com.zb.service;

import com.zb.pojo.BuyGoodsTemp;
import com.zb.pojo.Goods;
import com.zb.pojo.Goodsqualityvalue;

import java.util.List;
import java.util.Map;

public interface RpcGoodsService {
    public List<Goodsqualityvalue> getGoodsListByMap(Map<String,Object> param)throws Exception;

    public Integer getGoodsCountByMap(Map<String,Object> param)throws Exception;

   public Goods getGoodsById(Integer id)throws Exception;

   public Integer addBuyGoodsTemp(BuyGoodsTemp buyGoodsTemp)throws Exception;

   public List<BuyGoodsTemp> getBuyGoodsTempByUserId(Integer userId)throws Exception;

    public BuyGoodsTemp getBuyGoodsTempByUserIdAndGoodsId(Integer userId,Integer goodsId)throws Exception;

    public Integer updateBuyGoodsTemp(BuyGoodsTemp buyGoodsTemp)throws Exception;

    public Integer delBuyGoodsTemp(Integer id)throws Exception;
}
