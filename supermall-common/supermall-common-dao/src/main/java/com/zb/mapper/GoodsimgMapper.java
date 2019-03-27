package com.zb.mapper;
import com.zb.pojo.Goodsimg;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsimgMapper {

	public Goodsimg getGoodsimgById(@Param(value = "id") Long id)throws Exception;

	public List<Goodsimg>	getGoodsimgListByMap(Map<String,Object> param)throws Exception;

	public Integer getGoodsimgCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGoodsimg(Goodsimg goodsimg)throws Exception;

	public Integer updateGoodsimg(Goodsimg goodsimg)throws Exception;

	public Integer deleteGoodsimgById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteGoodsimg(Map<String,List<String>> params);

}
