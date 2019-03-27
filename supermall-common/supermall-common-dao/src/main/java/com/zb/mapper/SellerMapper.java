package com.zb.mapper;
import com.zb.pojo.Seller;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellerMapper {

	public Seller getSellerById(@Param(value = "id") Long id)throws Exception;

	public List<Seller>	getSellerListByMap(Map<String,Object> param)throws Exception;

	public Integer getSellerCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertSeller(Seller seller)throws Exception;

	public Integer updateSeller(Seller seller)throws Exception;

	public Integer deleteSellerById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteSeller(Map<String,List<String>> params);

}
