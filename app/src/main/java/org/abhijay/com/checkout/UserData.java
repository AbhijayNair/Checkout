package org.abhijay.com.checkout;

/**
 * Created by ABHIJAY on 20-12-2017.
 */

public class UserData {
    String uid;
    String name;
    String email;
    String event;
    String phone;
    String college;
    String payment;

    public UserData(String Uid,String Name,String Email,String Event,String Phone,String College,String Payment){
        uid = Uid;
        name = Name;
        email = Email;
        event = Event;
        phone = Phone;
        college = College;
        payment = Payment;

    }

    public String getUid(){
        return uid;
    }
    public void setUid(String uid){
        this.uid = uid;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEvent(){
        return event;
    }
    public void setEvent(String event){
        this.event = event;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getCollege(){
        return college;
    }
    public void setCollege(String college){
        this.college = college;
    }
    public String getPayment(){
        return payment;
    }
    public void setPayment(String payment){
        this.payment = payment;
    }

}
