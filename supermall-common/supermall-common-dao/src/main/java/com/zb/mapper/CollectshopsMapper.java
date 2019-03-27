package com.zb.mapper;
import com.zb.pojo.Collectshops;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollectshopsMapper {

	public Collectshops getCollectshopsById(@Param(value = "id") Long id)throws Exception;

	public List<Collectshops>	getCollectshopsListByMap(Map<String,Object> param)throws Exception;

	public Integer getCollectshopsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCollectshops(Collectshops collectshops)throws Exception;

	public Integer updateCollectshops(Collectshops collectshops)throws Exception;

	public Integer deleteCollectshopsById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCollectshops(Map<String,List<String>> params);

}
