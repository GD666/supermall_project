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
    private Goods goods=new Goods();
    //商品属性内容
    private String value;
    //
    private Integer goodsqualityId;
    private Goodsquality goodsquality=new Goodsquality();

    private Integer goodstypeId;
    private Goodstype goodstype=new Goodstype();

    private Integer goodsimgId;
    private Goodsimg goodsimg=new Goodsimg();
    
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

    public Integer getGoodstypeId() {
        return goodstypeId;
    }

    public void setGoodstypeId(Integer goodstypeId) {
        this.goodstypeId = goodstypeId;
    }

    public Integer getGoodsimgId() {
        return goodsimgId;
    }

    public void setGoodsimgId(Integer goodsimgId) {
        this.goodsimgId = goodsimgId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Goodsquality getGoodsquality() {
        return goodsquality;
    }

    public void setGoodsquality(Goodsquality goodsquality) {
        this.goodsquality = goodsquality;
    }

    public Goodstype getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Goodstype goodstype) {
        this.goodstype = goodstype;
    }

    public Goodsimg getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(Goodsimg goodsimg) {
        this.goodsimg = goodsimg;
    }

}
