package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goodsquality implements Serializable {
    //商品属性id
    private Integer id;
    //商品分类id
    private Integer goodstypeId;
    //属性名称
    private String name;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setGoodstypeId (Integer  goodstypeId){
        this.goodstypeId=goodstypeId;
    }
    public  Integer getGoodstypeId(){
        return this.goodstypeId;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
}
