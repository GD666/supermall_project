package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goods implements Serializable {
    //商品id
    private Integer id;
    //商品名称
    private String name;
    //商品小标题
    private String subtitle;
    //初始价格
    private Double originalprice;
    //优惠价格
    private Double promoteprice;
    //库存
    private Integer stock;
    //商品类型id
    private Integer goodstypeId;
    //创建日期
    private Date createdate;
    //更新日期
    private Date updatedate;
    //商铺id
    private Integer shopId;
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
    public void setSubtitle (String  subtitle){
        this.subtitle=subtitle;
    }
    public  String getSubtitle(){
        return this.subtitle;
    }
    public void setOriginalprice (Double  originalprice){
        this.originalprice=originalprice;
    }
    public  Double getOriginalprice(){
        return this.originalprice;
    }
    public void setPromoteprice (Double  promoteprice){
        this.promoteprice=promoteprice;
    }
    public  Double getPromoteprice(){
        return this.promoteprice;
    }
    public void setStock (Integer  stock){
        this.stock=stock;
    }
    public  Integer getStock(){
        return this.stock;
    }
    public void setGoodstypeId (Integer  goodstypeId){
        this.goodstypeId=goodstypeId;
    }
    public  Integer getGoodstypeId(){
        return this.goodstypeId;
    }
    public void setCreatedate (Date  createdate){
        this.createdate=createdate;
    }
    public  Date getCreatedate(){
        return this.createdate;
    }
    public void setUpdatedate (Date  updatedate){
        this.updatedate=updatedate;
    }
    public  Date getUpdatedate(){
        return this.updatedate;
    }
    public void setShopId (Integer  shopId){
        this.shopId=shopId;
    }
    public  Integer getShopId(){
        return this.shopId;
    }
}
