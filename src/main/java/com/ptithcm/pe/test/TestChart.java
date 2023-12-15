/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.test;

import com.ptithcm.pe.models.ChartBar;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tezca
 */
public class TestChart {
    public static void main(String[] args) {
        List<ChartBar> chartBars =  ChartBar.getInstance().getData(2023);
        System.out.println("Hello");
        System.out.println(chartBars.size());
        for (ChartBar chartBar : chartBars) {
            System.out.println("Hello");
            System.out.println(chartBar.toString());
        }
    }         
}
