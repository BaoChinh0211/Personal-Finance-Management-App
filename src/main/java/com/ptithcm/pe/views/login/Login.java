/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.pe.views.login;

import com.ptithcm.pe.PersonalFinanceManagement;
import com.ptithcm.pe.views.main.Main;
import com.ptithcm.pe.dao.UserDAO;
import com.ptithcm.pe.models.User;
import com.ptithcm.pe.utilities.Constraints;
import com.ptithcm.pe.utilities.PasswordUtilities;

import javax.swing.*;

/**
 *
 * @author tezca
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form LoginDialog
     */
    public Login() {
        initComponents();
        setSize(624, 475);
        
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(Login.NORMAL);
        txtUsername.setText("baochinh0211");
        txtPassword.setText("Chinh$0211");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnForgotPassword = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Constraints.TITLE_LOGIN);
        setPreferredSize(new java.awt.Dimension(600, 400));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 102, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText(Constraints.TITLE_LOGIN);
        lblTitle.setPreferredSize(new java.awt.Dimension(600, 50));

        lblUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_username32.png"))); // NOI18N
        lblUsername.setText("Tài khoản:");

        lblPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_password32.png"))); // NOI18N
        lblPassword.setText("Mật khẩu:");

        txtUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUsername.setPreferredSize(new java.awt.Dimension(325, 30));

        txtPassword.setPreferredSize(new java.awt.Dimension(325, 30));

        btnForgotPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnForgotPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_forgotPassword20.png"))); // NOI18N
        btnForgotPassword.setText("Quên mật khẩu");
        btnForgotPassword.setPreferredSize(new java.awt.Dimension(160, 30));
        btnForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Chưa có tài khoản?");

        btnRegister.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_register20.png"))); // NOI18N
        btnRegister.setText("Đăng ký");
        btnRegister.setPreferredSize(new java.awt.Dimension(125, 30));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_login20.png"))); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.setPreferredSize(new java.awt.Dimension(125, 35));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_exit20.png"))); // NOI18N
        btnClose.setText("Thoát");
        btnClose.setPreferredSize(new java.awt.Dimension(125, 35));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblUsername)
                                    .addGap(7, 7, 7)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String userName = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());
        String hashPassword = PasswordUtilities.toSha1(password);
        if (userName.isEmpty()){
            JOptionPane.showMessageDialog(this, Constraints.LOGIN_USERNAME_EMPTY, Constraints.LABEL_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (password.isEmpty()){
            JOptionPane.showMessageDialog(this, Constraints.LOGIN_PASSWORD_EMPTY, Constraints.LABEL_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (UserDAO.getInstance().login(userName, hashPassword) == 2){
            JOptionPane.showMessageDialog(this, Constraints.LOGIN_USERNAME_NOT_FOUND, Constraints.LABEL_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (UserDAO.getInstance().login(userName, hashPassword) == 1){
            JOptionPane.showMessageDialog(this, Constraints.LOGIN_PASSWORD_INCORRECT, Constraints.LABEL_ERROR, JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                JOptionPane.showMessageDialog(this, Constraints.LOGIN_SUCCESS, Constraints.LABEL_INFORMATION, JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new Main().setVisible(true);
            } catch (Exception ex){
                JOptionPane.showMessageDialog(this, Constraints.LOGIN_ERROR + ": " + ex.getMessage(), Constraints.LABEL_ERROR, JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn thoát", "Xác nhận thoát", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        this.dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPasswordActionPerformed
       this.dispose();
       new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_btnForgotPasswordActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
