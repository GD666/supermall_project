package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goodsqualityvalue implements Serializable {
    //
    private Integer id;
    //
    private Integer goodsId;
    //商品属性内容
    private String value;
    //
    private Integer goodsqualityId;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setGoodsId (Integer  goodsId){
        this.goodsId=goodsId;
    }
    public  Integer getGoodsId(){
        return this.goodsId;
    }
    public void setValue (String  value){
        this.value=value;
    }
    public  String getValue(){
        return this.value;
    }
    public void setGoodsqualityId (Integer  goodsqualityId){
        this.goodsqualityId=goodsqualityId;
    }
    public  Integer getGoodsqualityId(){
        return this.goodsqualityId;
    }
}
