package com.zb.service;

import com.zb.pojo.Users;

public interface RpcTokenSerivce {

    //
    public String gengeratToken(String userAgentString, Users qgUser)throws Exception;


    //
    public void saveToken(String token, Users user)throws Exception;

    public boolean validate(String userAgent, String token) throws Exception;


}
