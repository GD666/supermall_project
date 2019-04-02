package com.zb.service;

import com.zb.pojo.Users;

public interface RpcUserService {

    //用户登录
    public Users getUserLogin(String phone, String password) throws Exception;

    //短信验证码登录
    public Users userLoginByMsg(String phone) throws Exception;

    //根据token返回当前用户对象
    public Users getCurrUser(String token) throws Exception;

    //修改密码
    public int updatePwd(String phone, String password) throws Exception;

    //用户注册
    public int register(String phone) throws Exception;
}
