package com.zb.mapper;
import com.zb.pojo.Users;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {

	public Users getUsersById(@Param(value = "id") Long id)throws Exception;

	public List<Users>	getUsersListByMap(Map<String, Object> param)throws Exception;

	public Integer getUsersCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertUsers(Users users)throws Exception;

	public Integer updateUsers(Users users)throws Exception;

	public Integer deleteUsersById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteUsers(Map<String, List<String>> params);

	//修改密码
	public int updatePwd(@Param("phone") String phone, @Param("password") String password) throws Exception;

	//注册账号通过id
	public int register(String phone) throws Exception;

}
