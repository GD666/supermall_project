package com.zb.service;

import com.zb.pojo.Users;

public interface RpcTokenSerivce {

    //
    public String gengeratToken(String userAgentString, Users qgUser);


    //
    public void saveToken(String token, Users user);

    public boolean validate(String userAgent, String token) throws Exception;


}
