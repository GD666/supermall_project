package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Collectgoods implements Serializable {
    //
    private Integer id;
    //
    private String userId;
    //
    private Integer goodsId;
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
    public void setGoodsId (Integer  goodsId){
        this.goodsId=goodsId;
    }
    public  Integer getGoodsId(){
        return this.goodsId;
    }
}
