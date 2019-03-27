package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Seller implements Serializable {
    //
    private Integer id;
    //
    private String phone;
    //
    private String password;
    //
    private String sellerId;
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
    public void setSellerId (String  sellerId){
        this.sellerId=sellerId;
    }
    public  String getSellerId(){
        return this.sellerId;
    }
}
