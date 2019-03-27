package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Users implements Serializable {
    //
    private Integer id;
    //
    private String phone;
    //
    private String password;
    //
    private String userId;
    //
    private String realName;
    //
    private Date createdTime;
    //
    private Date updatedTime;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setPassword (String  password){
        this.password=password;
    }
    public  String getPassword(){
        return this.password;
    }
    public void setUserId (String  userId){
        this.userId=userId;
    }
    public  String getUserId(){
        return this.userId;
    }
    public void setRealName (String  realName){
        this.realName=realName;
    }
    public  String getRealName(){
        return this.realName;
    }
    public void setCreatedTime (Date  createdTime){
        this.createdTime=createdTime;
    }
    public  Date getCreatedTime(){
        return this.createdTime;
    }
    public void setUpdatedTime (Date  updatedTime){
        this.updatedTime=updatedTime;
    }
    public  Date getUpdatedTime(){
        return this.updatedTime;
    }
}
