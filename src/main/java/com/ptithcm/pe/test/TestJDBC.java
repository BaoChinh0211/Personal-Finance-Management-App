/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.test;

import com.ptithcm.pe.database.DatabaseHelper;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author tezca
 */
public class TestJDBC {
    public static void main(String[] args) throws SQLException{
        Connection connection = DatabaseHelper.openConnection();
        DatabaseHelper.printInfo(connection);
    }
}
