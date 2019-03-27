package com.zb.mapper;
import com.zb.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

	public Admin getAdminById(@Param(value = "id") Long id)throws Exception;

	public List<Admin>	getAdminListByMap(Map<String,Object> param)throws Exception;

	public Integer getAdminCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertAdmin(Admin admin)throws Exception;

	public Integer updateAdmin(Admin admin)throws Exception;

	public Integer deleteAdminById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteAdmin(Map<String,List<String>> params);

}
