package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goodsimg implements Serializable {
    //商品图片id
    private Integer id;
    //商品id
    private Integer goodsId;
    //商品图片地址
    private String imgs;
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
    public void setImgs (String  imgs){
        this.imgs=imgs;
    }
    public  String getImgs(){
        return this.imgs;
    }
}
