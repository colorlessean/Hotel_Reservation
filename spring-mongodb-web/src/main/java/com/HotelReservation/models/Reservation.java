package com.HotelReservation.models;

import java.sql.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Reservation {
    @Id
    public ObjectId _id;

    public String GuestName;
    public int PhoneNumber;
    public Date date;
    public String SuiteType;

    public CardInfo cardInfo;

    public Reservation() {}

    public Reservation(ObjectId _id, String GuestName, int PhoneNumber, Date date, String SuiteType, CardInfo cardInfo) {
        this._id = _id;
        this.GuestName = GuestName;
        this.PhoneNumber = PhoneNumber;
        this.date = date;
        this.SuiteType = SuiteType;
        this.cardInfo = cardInfo;
    }

    public String get_id() {
        return _id.toHexString();
    }
    //should not be able to set id so do not include set id

    //GuestName Getter and Setter
    public String getGuestName() {
        return GuestName;
    }
    public void setGuestName(String GuestName) {
        this.GuestName = GuestName;
    }

    //PhoneNumber getter and setter
    public int getPhoneNumber() {
        return this.PhoneNumber;
    }
    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
    //date getter and setter
    public Date getDate(){
        return this.date;
    }
    public void setDate(Date date){
        this.date = date;
    }

    //date getter and setter
    public String getSuiteType(){
        return this.SuiteType;
    }
    public void setSuiteType(String SuiteType){
        this.SuiteType = SuiteType;
    }

    //cardInfo getter and setter
    public CardInfo getcardInfo(){
        return this.cardInfo;
    }
    public void setcardInfo(CardInfo cardInfo){
        this.cardInfo = cardInfo;
    }
}