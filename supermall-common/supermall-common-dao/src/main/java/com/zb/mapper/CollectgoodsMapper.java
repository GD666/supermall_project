package com.zb.mapper;
import com.zb.pojo.Collectgoods;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollectgoodsMapper {

	public Collectgoods getCollectgoodsById(@Param(value = "id") Long id)throws Exception;

	public List<Collectgoods>	getCollectgoodsListByMap(Map<String,Object> param)throws Exception;

	public Integer getCollectgoodsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCollectgoods(Collectgoods collectgoods)throws Exception;

	public Integer updateCollectgoods(Collectgoods collectgoods)throws Exception;

	public Integer deleteCollectgoodsById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCollectgoods(Map<String,List<String>> params);

}
