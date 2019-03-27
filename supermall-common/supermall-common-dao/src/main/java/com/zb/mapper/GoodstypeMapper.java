package com.zb.mapper;
import com.zb.pojo.Goodstype;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodstypeMapper {

	public Goodstype getGoodstypeById(@Param(value = "id") Long id)throws Exception;

	public List<Goodstype>	getGoodstypeListByMap(Map<String,Object> param)throws Exception;

	public Integer getGoodstypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGoodstype(Goodstype goodstype)throws Exception;

	public Integer updateGoodstype(Goodstype goodstype)throws Exception;

	public Integer deleteGoodstypeById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteGoodstype(Map<String,List<String>> params);

}
