package com.zb.mapper;
import com.zb.pojo.Goodsqualityvalue;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsqualityvalueMapper {

	public Goodsqualityvalue getGoodsqualityvalueById(@Param(value = "id") Long id)throws Exception;

	public List<Goodsqualityvalue>	getGoodsqualityvalueListByMap(Map<String,Object> param)throws Exception;

	public Integer getGoodsqualityvalueCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGoodsqualityvalue(Goodsqualityvalue goodsqualityvalue)throws Exception;

	public Integer updateGoodsqualityvalue(Goodsqualityvalue goodsqualityvalue)throws Exception;

	public Integer deleteGoodsqualityvalueById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteGoodsqualityvalue(Map<String,List<String>> params);

	//主界面收索分页查询
	public List<Goodsqualityvalue> getGoodsqualityvalueByMap(Map<String,Object> param)throws Exception;

	public Integer getCountByMap(Map<String,Object> param)throws Exception;
}
