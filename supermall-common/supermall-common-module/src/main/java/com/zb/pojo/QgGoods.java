package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class QgGoods implements Serializable {
    //
    private Integer id;
    //抢购商品名称
    private String name;
    //抢购商品图片
    private String img;
    //初始价格
    private Double originalprice;
    //库存
    private Integer stock;
    //
    private Date createdTime;
    //
    private Date updatedTime;
    //商品id
    private String goodsId;
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
    public void setImg (String  img){
        this.img=img;
    }
    public  String getImg(){
        return this.img;
    }
    public void setOriginalprice (Double  originalprice){
        this.originalprice=originalprice;
    }
    public  Double getOriginalprice(){
        return this.originalprice;
    }
    public void setStock (Integer  stock){
        this.stock=stock;
    }
    public  Integer getStock(){
        return this.stock;
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
    public void setGoodsId (String  goodsId){
        this.goodsId=goodsId;
    }
    public  String getGoodsId(){
        return this.goodsId;
    }
}
