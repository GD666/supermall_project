package com.zb.mapper;
import com.zb.pojo.Trade;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TradeMapper {

	public Trade getTradeById(@Param(value = "id") Long id)throws Exception;

	public List<Trade>	getTradeListByMap(Map<String,Object> param)throws Exception;

	public Integer getTradeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertTrade(Trade trade)throws Exception;

	public Integer updateTrade(Trade trade)throws Exception;

	public Integer deleteTradeById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteTrade(Map<String,List<String>> params);

}
