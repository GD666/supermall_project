package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Orders implements Serializable {
    //
    private Integer id;
    //库存id
    private String stockId;
    //商品id
    private Integer goodsId;
    //用户id
    private String userId;
    //地址
    private String address;
    //收件人
    private String receiver;
    //邮编
    private String post;
    //手机号
    private String phone;
    //备注
    private String usermessage;
    //创建日期
    private Date createdate;
    //发货时间
    private Date deliverydate;
    //状态(0：待支付 1：支付成功 2:支付失败)
    private Integer status;
    //数量
    private Integer num;
    //总金额
    private Double amount;
    //阿里支付交易号
    private String aliTradeNo;
    //业务订单号
    private String orderNo;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setStockId (String  stockId){
        this.stockId=stockId;
    }
    public  String getStockId(){
        return this.stockId;
    }
    public void setGoodsId (Integer  goodsId){
        this.goodsId=goodsId;
    }
    public  Integer getGoodsId(){
        return this.goodsId;
    }
    public void setUserId (String  userId){
        this.userId=userId;
    }
    public  String getUserId(){
        return this.userId;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setReceiver (String  receiver){
        this.receiver=receiver;
    }
    public  String getReceiver(){
        return this.receiver;
    }
    public void setPost (String  post){
        this.post=post;
    }
    public  String getPost(){
        return this.post;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setUsermessage (String  usermessage){
        this.usermessage=usermessage;
    }
    public  String getUsermessage(){
        return this.usermessage;
    }
    public void setCreatedate (Date  createdate){
        this.createdate=createdate;
    }
    public  Date getCreatedate(){
        return this.createdate;
    }
    public void setDeliverydate (Date  deliverydate){
        this.deliverydate=deliverydate;
    }
    public  Date getDeliverydate(){
        return this.deliverydate;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
    public void setNum (Integer  num){
        this.num=num;
    }
    public  Integer getNum(){
        return this.num;
    }
    public void setAmount (Double  amount){
        this.amount=amount;
    }
    public  Double getAmount(){
        return this.amount;
    }
    public void setAliTradeNo (String  aliTradeNo){
        this.aliTradeNo=aliTradeNo;
    }
    public  String getAliTradeNo(){
        return this.aliTradeNo;
    }
    public void setOrderNo (String  orderNo){
        this.orderNo=orderNo;
    }
    public  String getOrderNo(){
        return this.orderNo;
    }
}
