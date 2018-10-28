package com.HotelReservation.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class CardInfo{
    public Integer CardNumber;
    public String Name;
    public String Expiration;
    public int CSV;

    public CardInfo(){

    }
    public CardInfo(Integer CardNumber, String Name, String Expiration, int CSV){
        this.CardNumber = CardNumber;
        this.Name = Name;
        this.Expiration = Expiration;
        this.CSV = CSV;
    }

    public Integer getCardNumber(){
        return this.CardNumber;
    }
    public void setCardNumber(Integer CardNumber){
        this.CardNumber = CardNumber;
    }

    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public String getExpiration(){
        return this.Expiration;
    }
    public void setExpiration(String Expiration){
        this.Expiration = Expiration; 
    } 

    public int getCSV(){
        return this.CSV;
    }
    public void setCSV(int CSV){
        this.CSV = CSV;
    }
}