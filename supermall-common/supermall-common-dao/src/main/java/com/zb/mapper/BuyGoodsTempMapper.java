package com.zb.mapper;

import com.zb.pojo.BuyGoodsTemp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuyGoodsTempMapper {
    public Integer addBuyGoodsTemp(BuyGoodsTemp buyGoodsTemp)throws Exception;

    public List<BuyGoodsTemp> getBuyGoodsTempByUserId(@Param("userId") Integer userId)throws Exception;

    public BuyGoodsTemp getBuyGoodsTempByUserIdAndGoodsId(@Param("userId") Integer userId,@Param("goodsId")Integer goodsId)throws Exception;

    public Integer updateBuyGoodsTemp(BuyGoodsTemp buyGoodsTemp)throws Exception;

    public Integer delBuyGoodsTemp(@Param("id") Integer id)throws Exception;
}
