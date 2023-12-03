/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ptithcm.pe;

/**
 *
 * @author tezca
 */
public class PersonalExpenditure {
    private int userId;
    private PersonalExpenditure() {
    }
 
    public static PersonalExpenditure getInstance() {
        return SingletonHelper.INSTANCE;
    }
 
    private static class SingletonHelper {
        private static final PersonalExpenditure INSTANCE = new PersonalExpenditure();
    }
    
    public synchronized int getUserId() {
        return userId;
    }

    public synchronized void setUserId(int userId) {
        this.userId = userId;
    }
}
