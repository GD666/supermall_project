package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Admin implements Serializable {
    //
    private Integer id;
    //
    private String name;
    //
    private String password;
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
    public void setPassword (String  password){
        this.password=password;
    }
    public  String getPassword(){
        return this.password;
    }
}
