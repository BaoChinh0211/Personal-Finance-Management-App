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
public class Financial {
    private int financialId;
    private int amount;
    private Timestamp dateTime;
    private String note;
    private int categoryId;
    
    public Financial() {
    }

    public Financial(int financialId, int amount, Timestamp dateTime, String note, int categoryId) {
        this.financialId = financialId;
        this.amount = amount;
        this.dateTime = dateTime;
        this.note = note;
        this.categoryId = categoryId;
    }

    public Financial(int amount, Timestamp dateTime, String note, int categoryId) {
        this.amount = amount;
        this.dateTime = dateTime;
        this.note = note;
        this.categoryId = categoryId;
    }

    public int getFinancialId() {
        return financialId;
    }

    public void setFinancialId(int financialId) {
        this.financialId = financialId;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    
    
    
}
