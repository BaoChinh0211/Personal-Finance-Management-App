/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.test;

import com.ptithcm.pe.util.PasswordHashing;

/**
 *
 * @author tezca
 */
public class TestHashingPassword {
    public static void main(String[] args) {
        System.out.println(PasswordHashing.toSha1("123456"));
    }
}
