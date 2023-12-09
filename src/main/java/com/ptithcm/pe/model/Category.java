/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.model;

/**
 *
 * @author tezca
 */
public class Category {
    private int categoryId;
    private String categoryName;
    private boolean categoryType;
    private int userId;

    public Category() {
    }

    public Category(int categoryId, String categoryName, boolean categoryType, int userId) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryType = categoryType;
        this.userId = userId;
    }

    public Category(String categoryName, boolean categoryType, int userId) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
        this.userId = userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isCategoryType() {
        return categoryType;
    }

    public void setCategoryType(boolean categoryType) {
        this.categoryType = categoryType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                ", userId=" + userId +
                '}';
    }
}
