/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.pe.views.main;

import com.ptithcm.pe.utilities.TabbedPaneUtilities;
import com.ptithcm.pe.utilities.Constraints;
import com.ptithcm.pe.views.chart.ChartPanel;
//import com.ptithcm.pe.views.chart.ChartPanel;
import com.ptithcm.pe.views.expense.ListOfExpenses;
import com.ptithcm.pe.views.expense.ListOfExpenseCategories;
import com.ptithcm.pe.views.income.ListOfIncomeCategories;
import com.ptithcm.pe.views.income.ListOfIncome;
import com.ptithcm.pe.views.login.Login;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author tezca
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setSize(1000, 800);
        setDefaultCloseOperation(Main.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(Main.NORMAL);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnListOfExpenses = new javax.swing.JButton();
        btnListOfExpenseCategories = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnListOfIncomes = new javax.swing.JButton();
        btnListOfIncoeCategories = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnStatistic = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnCloseTab = new javax.swing.JButton();
        tabbedPane = new com.ptithcm.pe.utilities.tabbedPane.TabbedPaneCustom();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mniLogin = new javax.swing.JMenuItem();
        mniLogout = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniListOfExpenses = new javax.swing.JMenuItem();
        mniListOfExpenseCategories = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniListOfIncomes = new javax.swing.JMenuItem();
        mniListOfIncomeCategories = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniStatistics = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(com.ptithcm.pe.utilities.Constraints.TITLE_MAIN);

        jToolBar1.setRollover(true);

        btnListOfExpenses.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnListOfExpenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_payment32.png"))); // NOI18N
        btnListOfExpenses.setText(com.ptithcm.pe.utilities.Constraints.TITLE_LIST_OF_EXPENSES);
        btnListOfExpenses.setFocusable(false);
        btnListOfExpenses.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListOfExpenses.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListOfExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListOfExpensesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnListOfExpenses);

        btnListOfExpenseCategories.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnListOfExpenseCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_list32.png"))); // NOI18N
        btnListOfExpenseCategories.setText(com.ptithcm.pe.utilities.Constraints.TITLE_LIST_EXPENSE_CATEGORIES);
        btnListOfExpenseCategories.setFocusable(false);
        btnListOfExpenseCategories.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListOfExpenseCategories.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListOfExpenseCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListOfExpenseCategoriesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnListOfExpenseCategories);
        jToolBar1.add(jSeparator6);

        btnListOfIncomes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnListOfIncomes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_receipt32.png"))); // NOI18N
        btnListOfIncomes.setText(com.ptithcm.pe.utilities.Constraints.TITLE_LIST_OF_INCOMES);
        btnListOfIncomes.setFocusable(false);
        btnListOfIncomes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListOfIncomes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListOfIncomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListOfIncomesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnListOfIncomes);

        btnListOfIncoeCategories.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnListOfIncoeCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_addRec32.png"))); // NOI18N
        btnListOfIncoeCategories.setText(com.ptithcm.pe.utilities.Constraints.TITLE_LIST_INCOME_CATEGORIES);
        btnListOfIncoeCategories.setFocusable(false);
        btnListOfIncoeCategories.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListOfIncoeCategories.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListOfIncoeCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListOfIncoeCategoriesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnListOfIncoeCategories);
        jToolBar1.add(jSeparator7);

        btnStatistic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnStatistic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_statistic32.png"))); // NOI18N
        btnStatistic.setText(com.ptithcm.pe.utilities.Constraints.TITLE_CHART);
        btnStatistic.setFocusable(false);
        btnStatistic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStatistic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStatistic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticActionPerformed(evt);
            }
        });
        jToolBar1.add(btnStatistic);
        jToolBar1.add(jSeparator4);

        btnCloseTab.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCloseTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_close32.png"))); // NOI18N
        btnCloseTab.setText(com.ptithcm.pe.utilities.Constraints.TITLE_CLOSE_WINDOWS);
        btnCloseTab.setFocusable(false);
        btnCloseTab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCloseTab.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCloseTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseTabActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCloseTab);

        tabbedPane.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        tabbedPane.setSelectedColor(new java.awt.Color(50, 159, 242));
        tabbedPane.setUnselectedColor(new java.awt.Color(186, 215, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Giới thiệu", jPanel1);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(80, 30));

        menuFile.setText("File");
        menuFile.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mniLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_login20.png"))); // NOI18N
        mniLogin.setText(Constraints.TITLE_LOGOUT);
        menuFile.add(mniLogin);

        mniLogout.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_logout.png"))); // NOI18N
        mniLogout.setText(Constraints.TITLE_LOGOUT);
        mniLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogoutActionPerformed(evt);
            }
        });
        menuFile.add(mniLogout);
        menuFile.add(jSeparator5);

        mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_exit20.png"))); // NOI18N
        mniExit.setText(Constraints.TITLE_EXIT);
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        menuFile.add(mniExit);

        jMenuBar1.add(menuFile);

        jMenu2.setText("Manager");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mniListOfExpenses.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniListOfExpenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_payment32.png"))); // NOI18N
        mniListOfExpenses.setText(com.ptithcm.pe.utilities.Constraints.TITLE_LIST_OF_EXPENSES);
        mniListOfExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListOfExpensesActionPerformed(evt);
            }
        });
        jMenu2.add(mniListOfExpenses);

        mniListOfExpenseCategories.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniListOfExpenseCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_list32.png"))); // NOI18N
        mniListOfExpenseCategories.setText(com.ptithcm.pe.utilities.Constraints.TITLE_LIST_EXPENSE_CATEGORIES);
        mniListOfExpenseCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListOfExpenseCategoriesActionPerformed(evt);
            }
        });
        jMenu2.add(mniListOfExpenseCategories);
        jMenu2.add(jSeparator2);

        mniListOfIncomes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniListOfIncomes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_receipt32.png"))); // NOI18N
        mniListOfIncomes.setText(com.ptithcm.pe.utilities.Constraints.TITLE_LIST_OF_INCOMES);
        mniListOfIncomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListOfIncomesActionPerformed(evt);
            }
        });
        jMenu2.add(mniListOfIncomes);

        mniListOfIncomeCategories.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniListOfIncomeCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_addRec32.png"))); // NOI18N
        mniListOfIncomeCategories.setText(com.ptithcm.pe.utilities.Constraints.TITLE_LIST_INCOME_CATEGORIES);
        mniListOfIncomeCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListOfIncomeCategoriesActionPerformed(evt);
            }
        });
        jMenu2.add(mniListOfIncomeCategories);
        jMenu2.add(jSeparator3);

        mniStatistics.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_statistic32.png"))); // NOI18N
        mniStatistics.setText(com.ptithcm.pe.utilities.Constraints.TITLE_CHART);
        mniStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniStatisticsActionPerformed(evt);
            }
        });
        jMenu2.add(mniStatistics);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem1.setText("Content");
        jMenu3.add(jMenuItem1);
        jMenu3.add(jSeparator1);

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_aboutUs.png"))); // NOI18N
        jMenuItem2.setText("About Us");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // TODO add your handling code here:
        int confirmResult = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát chương trình không?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);

        if (confirmResult == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void btnListOfExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListOfExpensesActionPerformed
        showListOfExpenses();
    }//GEN-LAST:event_btnListOfExpensesActionPerformed

    private void btnListOfExpenseCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListOfExpenseCategoriesActionPerformed
        showListOfExpenseCategories();
    }//GEN-LAST:event_btnListOfExpenseCategoriesActionPerformed

    private void btnListOfIncomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListOfIncomesActionPerformed
        showListOfIncomes();
    }//GEN-LAST:event_btnListOfIncomesActionPerformed

    private void btnListOfIncoeCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListOfIncoeCategoriesActionPerformed
        showListOfIncomeCategories();
    }//GEN-LAST:event_btnListOfIncoeCategoriesActionPerformed

    private void btnStatisticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticActionPerformed
        showChart();
    }//GEN-LAST:event_btnStatisticActionPerformed

    private void btnCloseTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseTabActionPerformed
//        for (int i = 0; i < tabbedPane.getTabCount(); i++) {
//            if (!tabbedPane.getTitleAt(i).equals(Constraints.TITLE_HOME)) {
//                int selectedIndex = tabbedPane.getSelectedIndex();
//                if (selectedIndex != -1) {
//                    tabbedPane.removeTabAt(selectedIndex);
//                }
//            }
//        }
            int selectedIndex = tabbedPane.getSelectedIndex();
            if (!tabbedPane.getTitleAt(selectedIndex).equals(Constraints.TITLE_HOME)) {               
                if (selectedIndex != -1) {
                    tabbedPane.removeTabAt(selectedIndex);
                }
            }

    }//GEN-LAST:event_btnCloseTabActionPerformed

    private void mniStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniStatisticsActionPerformed
        showChart();
    }//GEN-LAST:event_mniStatisticsActionPerformed

    private void mniListOfIncomeCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListOfIncomeCategoriesActionPerformed
        showListOfIncomeCategories();
    }//GEN-LAST:event_mniListOfIncomeCategoriesActionPerformed

    private void mniListOfIncomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListOfIncomesActionPerformed
        showListOfIncomes();
    }//GEN-LAST:event_mniListOfIncomesActionPerformed

    private void mniListOfExpenseCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListOfExpenseCategoriesActionPerformed
        showListOfExpenseCategories();
    }//GEN-LAST:event_mniListOfExpenseCategoriesActionPerformed

    private void mniListOfExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListOfExpensesActionPerformed
        showListOfExpenses();
    }//GEN-LAST:event_mniListOfExpensesActionPerformed

    private void mniLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogoutActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn muốn đăng xuất?", Constraints.LABEL_CONFIRM, JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_mniLogoutActionPerformed

    private void showListOfExpenses() {
        boolean flag = TabbedPaneUtilities.checkTabbedExist(Constraints.TITLE_LIST_OF_EXPENSES, tabbedPane);
        if (flag == false) {
            ListOfExpenses list = new ListOfExpenses();
            TabbedPaneUtilities.createTab(tabbedPane, Constraints.TITLE_LIST_OF_EXPENSES, list);
        }
    }

    private void showListOfExpenseCategories() {
        boolean flag = TabbedPaneUtilities.checkTabbedExist(Constraints.TITLE_LIST_EXPENSE_CATEGORIES, tabbedPane);
        if (!flag) {
            ListOfExpenseCategories list = new ListOfExpenseCategories();
            TabbedPaneUtilities.createTab(tabbedPane, Constraints.TITLE_LIST_EXPENSE_CATEGORIES, list);
        }
    }

    private void showListOfIncomes() {
        boolean flag = TabbedPaneUtilities.checkTabbedExist(Constraints.TITLE_LIST_OF_INCOMES, tabbedPane);
        if (!flag) {
            ListOfIncome list = new ListOfIncome();
            TabbedPaneUtilities.createTab(tabbedPane, Constraints.TITLE_LIST_OF_INCOMES, list);
        }
    }

    private void showListOfIncomeCategories() {
        boolean flag = TabbedPaneUtilities.checkTabbedExist(Constraints.TITLE_LIST_INCOME_CATEGORIES, tabbedPane);
        if (flag == false) {
            ListOfIncomeCategories list = new ListOfIncomeCategories();
            TabbedPaneUtilities.createTab(tabbedPane, Constraints.TITLE_LIST_INCOME_CATEGORIES, list);
        }
    }

    private void showChart() {
        boolean flag = TabbedPaneUtilities.checkTabbedExist(Constraints.TITLE_CHART, tabbedPane);
        if (flag == false) {
            ChartPanel chart = new ChartPanel();
            TabbedPaneUtilities.createTab(tabbedPane, Constraints.TITLE_CHART, chart);
            chart.chart1.start();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseTab;
    private javax.swing.JButton btnListOfExpenseCategories;
    private javax.swing.JButton btnListOfExpenses;
    private javax.swing.JButton btnListOfIncoeCategories;
    private javax.swing.JButton btnListOfIncomes;
    private javax.swing.JButton btnStatistic;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniListOfExpenseCategories;
    private javax.swing.JMenuItem mniListOfExpenses;
    private javax.swing.JMenuItem mniListOfIncomeCategories;
    private javax.swing.JMenuItem mniListOfIncomes;
    private javax.swing.JMenuItem mniLogin;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JMenuItem mniStatistics;
    private com.ptithcm.pe.utilities.tabbedPane.TabbedPaneCustom tabbedPane;
    // End of variables declaration//GEN-END:variables
}
