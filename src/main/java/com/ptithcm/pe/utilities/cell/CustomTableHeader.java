/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.utilities.cell;

import java.awt.Graphics;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author tezca
 */
public class CustomTableHeader extends JTableHeader{
    public CustomTableHeader(TableActionCellRender cellRenderer) {
        super();

        setReorderingAllowed(false); // Tắt khả năng di chuyển cột

        // Sử dụng renderer tùy chỉnh cho header
        setDefaultRenderer(cellRenderer);
    }

    // Ghi đè để căn giữa header
    @Override
    public void paintComponent(Graphics g) {
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        super.paintComponent(g);
    }
}
