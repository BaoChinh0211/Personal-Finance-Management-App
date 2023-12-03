package com.ptithcm.pe.test;

import com.ptithcm.pe.util.CheckValidated;
import com.ptithcm.pe.util.PasswordHashing;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.RandomStringUtils;

public class TestInsert {
    public static void main(String[] args) {
        String name1 = "@TrongHieu123";
        String name2 = "Ngusadsa21321h";
        String name3 = "Nguy()d";
        String name4 = "Chính";
        
        
        System.out.println(RandomStringUtils.randomAlphanumeric(6));
//        System.out.println("Name 2: " + CheckValidated.checkNameOfUserValid(name2));
//        System.out.println("Name 3: " + CheckValidated.checkNameOfUserValid(name3));
//        System.out.println("Name 4: " + CheckValidated.checkNameOfUserValid(name4));
    }
    
    
    
    
}
