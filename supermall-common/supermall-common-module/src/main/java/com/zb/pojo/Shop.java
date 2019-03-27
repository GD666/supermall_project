package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Shop implements Serializable {
    //商铺id
    private Integer id;
    //店铺名称
    private String name;
    //商家id
    private String sellerId;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void setSellerId (String  sellerId){
        this.sellerId=sellerId;
    }
    public  String getSellerId(){
        return this.sellerId;
    }
}
