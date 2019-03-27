package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Collectshops implements Serializable {
    //
    private Integer id;
    //
    private String userId;
    //
    private Integer shopId;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setUserId (String  userId){
        this.userId=userId;
    }
    public  String getUserId(){
        return this.userId;
    }
    public void setShopId (Integer  shopId){
        this.shopId=shopId;
    }
    public  Integer getShopId(){
        return this.shopId;
    }
}
