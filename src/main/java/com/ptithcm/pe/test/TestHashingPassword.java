/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.test;

import com.ptithcm.pe.utilities.PasswordUtilities;

/**
 *
 * @author tezca
 */
public class TestHashingPassword {
    public static void main(String[] args) {
        System.out.println(PasswordUtilities.toSha1("123456"));
    }
}
