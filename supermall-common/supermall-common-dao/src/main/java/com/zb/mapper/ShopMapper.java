package com.zb.mapper;
import com.zb.pojo.Shop;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopMapper {

	public Shop getShopById(@Param(value = "id") Long id)throws Exception;

	public List<Shop>	getShopListByMap(Map<String,Object> param)throws Exception;

	public Integer getShopCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertShop(Shop shop)throws Exception;

	public Integer updateShop(Shop shop)throws Exception;

	public Integer deleteShopById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteShop(Map<String,List<String>> params);

}
