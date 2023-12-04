/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.utilities;

import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author tezca
 */
public class TabbedPaneUtilities {

    public static boolean checkTabbedExist(String title, JTabbedPane tab) {
        for (int i = 0; i < tab.getTabCount(); i++) {
            if (tab.getTitleAt(i).equals(title)) {
                // Nếu tồn tại, chuyển đến tab đó và đặt cờ là true
                tab.setSelectedIndex(i);
                return true;
            }
        }
        return false;
    }
    
    public static void createTab(JTabbedPane tab, String title, Component component){
        tab.addTab(title, component);
        tab.setSelectedIndex(tab.getTabCount() - 1);
    }
   
}
