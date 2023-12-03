/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author tezca
 */
public class Revenues {
    private int revenuesId;
    private int amount;
    private Timestamp dateTime;
    private String note;
    private int groupId;
    
    public Revenues() {
    }

    public Revenues(int revenuesId, int amount, Timestamp dateTime, String note, int groupId) {
        this.revenuesId = revenuesId;
        this.amount = amount;
        this.dateTime = dateTime;
        this.note = note;
        this.groupId = groupId;
    }

    public Revenues(int amount, Timestamp dateTime, String note, int groupId) {
        this.amount = amount;
        this.dateTime = dateTime;
        this.note = note;
        this.groupId = groupId;
    }   

    public int getRevenuesId() {
        return revenuesId;
    }

    public void setRevenuesId(int revenuesId) {
        this.revenuesId = revenuesId;
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Revenues{" + "revenuesId=" + revenuesId + ", amount=" + amount + ", dateTime=" + dateTime + ", note=" + note + ", groupId=" + groupId + '}';
    }
    
    
}
