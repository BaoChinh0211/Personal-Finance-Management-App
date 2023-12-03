/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.model;

/**
 *
 * @author tezca
 */
public class User {
    private int id;
    private String name;
    private String userName;
    private String password;
    private String email;

    public User() {
    }

    public User(int id, String name, String userName, String password, String email) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public User(String name, String userName, String password, String email) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password + ", email=" + email + '}';
    }  
}
