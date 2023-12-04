/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.utilities;

import java.security.MessageDigest;
import javax.xml.crypto.dsig.Transform;
import org.apache.tomcat.util.codec.binary.Base64;

/**
 *
 * @author tezca
 */
public class PasswordUtilities {
    //md5
    // sha-1 -> Thường được sử dụng
    public static String toSha1(String password){
        String salt = "f1nd1;2;ngn3fsvbakjvajdpqjw0";
        String result = null;
        password = password + salt;
        
        try{
            byte[] dataBytes = password.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            result = Base64.encodeBase64String(md.digest(dataBytes));
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
            
}
