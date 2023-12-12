/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ptithcm.pe.dao;

import java.util.ArrayList;

/**
 *
 * @author tezca
 * @param <T>
 */
public interface DAO<T> {
    public int insert(T t);
    
    public int update(T t);
    
    public int delete(T t);
    
    public ArrayList<T> selectAll();
    
    public T selectByName(String name);
    
    public T selectById(int id);
    
}
