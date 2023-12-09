/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.utilities;

/**
 *
 * @author tezca
 */
public class ValidationUtilities {

    public static int checkEmailValid (String email){
        String emailRegex = "^[\\w]+([\\w.][\\w]+)*@[\\w]+(\\.\\w+)+$";
        String[] emailSplit = email.split("[@]", 2);
        if (email.matches(emailRegex) == false)
            return 2;
        if (emailSplit[0].length() < 6 || emailSplit[0].length() > 30)
            return 1;
        return 0;
    }
    
    public static boolean checkUsernameValid (String username){
        String regex = "^[a-zA-Z][\\w_]+[\\w][^_]$";
        return username.matches(regex);
    }
    
    public static boolean checkPasswordValid(String password){
        String regex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{8,20})";
        return password.matches(regex);
    }
    
    public static boolean checkNameOfUserValid(String name){
        String regex = "^[^@#$%!(){}\\[\\]-_+=]+( [^@#$%!(){}\\[\\]-_+=])*$";
        return name.matches(regex);
    }
    
    public static boolean checkNameCategoryValid(String groupName){
        String regex = "^[^@#$%!]+( [^@#$%!])*$";
        return groupName.matches(regex);
    }
}
