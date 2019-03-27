package com.zb.mapper;
import com.zb.pojo.Goodsquality;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsqualityMapper {

	public Goodsquality getGoodsqualityById(@Param(value = "id") Long id)throws Exception;

	public List<Goodsquality>	getGoodsqualityListByMap(Map<String,Object> param)throws Exception;

	public Integer getGoodsqualityCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGoodsquality(Goodsquality goodsquality)throws Exception;

	public Integer updateGoodsquality(Goodsquality goodsquality)throws Exception;

	public Integer deleteGoodsqualityById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteGoodsquality(Map<String,List<String>> params);

}
