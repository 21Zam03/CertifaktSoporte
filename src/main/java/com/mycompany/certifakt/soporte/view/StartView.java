/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.certifakt.soporte.view;

import com.mycompany.certifakt.soporte.config.ConfigFile;
import javax.swing.ImageIcon;

public class StartView extends javax.swing.JFrame {

    public StartView() {
        initComponents();
        loadImageIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGoToTestEnvironment = new javax.swing.JButton();
        btnGoToProductionEnvironment = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\certifakt-soporte\\src\\main\\resources\\images\\logo.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 80));

        btnGoToTestEnvironment.setText("TEST");
        btnGoToTestEnvironment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoToTestEnvironment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToTestEnvironmentActionPerformed(evt);
            }
        });
        jPanel1.add(btnGoToTestEnvironment, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 110, -1));

        btnGoToProductionEnvironment.setText("PROD");
        btnGoToProductionEnvironment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoToProductionEnvironment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToProductionEnvironmentActionPerformed(evt);
            }
        });
        jPanel1.add(btnGoToProductionEnvironment, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 110, -1));

        jLabel2.setText("Escoga el ambiente que desea");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToTestEnvironmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToTestEnvironmentActionPerformed
        ConfigFile.guardarUrl("https://apitest.certifakt.com/");
        this.dispose();
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnGoToTestEnvironmentActionPerformed

    private void btnGoToProductionEnvironmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToProductionEnvironmentActionPerformed
        ConfigFile.guardarUrl("https://api.certifakt.com/");
        this.dispose();
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnGoToProductionEnvironmentActionPerformed
    
    private void loadImageIcon() {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/images/icono.png"));
        this.setIconImage(imageIcon.getImage());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoToProductionEnvironment;
    private javax.swing.JButton btnGoToTestEnvironment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
