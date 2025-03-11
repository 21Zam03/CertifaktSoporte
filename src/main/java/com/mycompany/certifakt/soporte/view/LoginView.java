/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.certifakt.soporte.view;

import com.mycompany.certifakt.soporte.apiservice.CertifaktService;
import com.mycompany.certifakt.soporte.config.ConfigFile;
import java.awt.Color;
import javax.swing.ImageIcon;

public class LoginView extends javax.swing.JFrame {
    
    public LoginView() {
        initComponents();
        loadImageIcon();
        validateEnvironment();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEnvironmentChange = new javax.swing.JLabel();
        lblEnvironment = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setForeground(new java.awt.Color(153, 153, 153));
        txtUsername.setBorder(null);
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsernameMousePressed(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 180, 30));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setText("Iniciar Sesión");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 182, 30));

        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\certifakt-soporte\\src\\main\\resources\\images\\logo.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 80));

        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 180, 20));

        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, -1));

        jLabel4.setText("USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 180, -1));

        lblEnvironmentChange.setForeground(new java.awt.Color(0, 102, 255));
        lblEnvironmentChange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnvironmentChange.setText("¿Cambiar de ambiente?");
        lblEnvironmentChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEnvironmentChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEnvironmentChangeMouseClicked(evt);
            }
        });
        jPanel1.add(lblEnvironmentChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 180, -1));

        lblEnvironment.setForeground(new java.awt.Color(153, 153, 153));
        lblEnvironment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblEnvironment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 180, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 180, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsername.getText();
        char[] passwordLetters = txtPassword.getPassword();
        
        String password = new String(passwordLetters);
        
        Boolean isLogged = CertifaktService.login(username, password);
        
        if(isLogged != null && isLogged != false) {
            this.dispose();
            WelcomeView welcomeView = new WelcomeView();
            welcomeView.setVisible(true);
            welcomeView.setLocationRelativeTo(null);
        } else {
            lblError.setText("Credenciales incorrectas");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lblEnvironmentChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnvironmentChangeMouseClicked
        this.dispose();
        StartView startView = new StartView();
        startView.setVisible(true);
        startView.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblEnvironmentChangeMouseClicked

    private void txtUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMousePressed

    }//GEN-LAST:event_txtUsernameMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed

    }//GEN-LAST:event_txtPasswordMousePressed

    private void validateEnvironment() {
        String url = ConfigFile.obtenerUrl();
        if(url.contains("test")) {   
           lblEnvironment.setText("Ambiente de pruebas");
        } else {
            lblEnvironment.setText("Ambiente de producción");
        }
    }
    
    private void loadImageIcon() {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/images/icono.png"));
        this.setIconImage(imageIcon.getImage());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEnvironment;
    private javax.swing.JLabel lblEnvironmentChange;
    private javax.swing.JLabel lblError;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
