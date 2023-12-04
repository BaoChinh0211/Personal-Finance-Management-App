/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ptithcm.pe;

/**
 *
 * @author tezca
 */
public class PersonalFinanceManagement {
    private int userId;
    private PersonalFinanceManagement() {
    }
 
    public static PersonalFinanceManagement getInstance() {
        return SingletonHelper.INSTANCE;
    }
 
    private static class SingletonHelper {
        private static final PersonalFinanceManagement INSTANCE = new PersonalFinanceManagement();
    }
    
    public synchronized int getUserId() {
        return userId;
    }

    public synchronized void setUserId(int userId) {
        this.userId = userId;
    }
}
