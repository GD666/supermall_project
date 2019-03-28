package com.zb.service;

import com.zb.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface RpcGoodsService {
    public List<Goods> getGoodsListByMap(Map<String,Object> param)throws Exception;

    public Integer getGoodsCountByMap(Map<String,Object> param)throws Exception;
}
