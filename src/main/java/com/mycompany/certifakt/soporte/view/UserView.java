  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.certifakt.soporte.view;

import com.mycompany.certifakt.soporte.apiservice.CertifaktService;
import com.mycompany.certifakt.soporte.payload.dto.UserDto2;
import com.mycompany.certifakt.soporte.payload.request.UserRequest;
import com.mycompany.certifakt.soporte.payload.response.SupportResponse;
import java.awt.Cursor;
import java.io.IOException;
import java.util.Optional;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UserView extends javax.swing.JFrame {
    
    private final Long userId;
    private final String typeUser;
    private final Boolean changePass;
    private final UserDto2 userDto2;
    
    public UserView(UserDto2 userDto2) {
        this.userDto2 = userDto2;
        this.userId = userDto2.getUserID();
        this.typeUser = userDto2.getTypeUser();
        this.changePass = userDto2.getChangePass();
        initComponents();
        lblUser.setText("Id Usuario: "+ this.userId);
        loadImageIcon();
        this.setResizable(false);
        btnAtras.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ckbEstado.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ckbPdfUnico.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnChangePassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        txtDni.setText(userDto2.getDni());
        ckbEstado.setSelected(userDto2.getEstado());
        txtFullName.setText(userDto2.getFullName());
        txtNombreUsuario.setText(userDto2.getDeLogin());
        ckbPdfUnico.setSelected(userDto2.getPdfUnico());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lblSerie = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblNumDocIdentReceptor2 = new javax.swing.JLabel();
        txtFechaEmision1 = new javax.swing.JTextField();
        lblNumDocIdentReceptor3 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        ckbPdfUnico = new javax.swing.JCheckBox();
        ckbEstado = new javax.swing.JCheckBox();

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 100, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 100, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 280, -1));

        jLabel2.setText("Dni:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 20));

        jLabel3.setText("Estado:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 20));
        jPanel2.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 280, -1));

        lblSerie.setText("Nombre Completo:");
        jPanel2.add(lblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 20));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("ID usuario:");

        btnChangePassword.setText("Cambiar contraseña");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnChangePassword))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 40));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 960, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 960, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 760, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 760, 10));

        lblNumDocIdentReceptor2.setText("Pdf Unico:");
        jPanel2.add(lblNumDocIdentReceptor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 150, 20));
        jPanel2.add(txtFechaEmision1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 180, -1));

        lblNumDocIdentReceptor3.setText("Nombre de usuario:");
        jPanel2.add(lblNumDocIdentReceptor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 150, 20));

        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 270, -1));
        jPanel2.add(ckbPdfUnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));
        jPanel2.add(ckbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 960, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        WelcomeView welcomeView = new WelcomeView();
        welcomeView.setVisible(true);
        welcomeView.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            UserRequest userRequest = new UserRequest();
            userRequest.setUserID(userId);
            userRequest.setDni(txtDni.getText());
            userRequest.setEstado(ckbEstado.isSelected());
            userRequest.setFullName(txtFullName.getText());
            //userRequest.setPassword(txtPassword.getText());
            userRequest.setTypeUser(typeUser);
            userRequest.setDeLogin(txtNombreUsuario.getText());
            userRequest.setChangePass(changePass);
            userRequest.setPdfUnico(ckbPdfUnico.isSelected());
            System.out.println("User to edit: "+ userRequest.toString());

            Optional<SupportResponse> optionalSupportResponse = CertifaktService.updateUser(userRequest);

            if(optionalSupportResponse.isPresent()) {
                SupportResponse supportResponse = optionalSupportResponse.get();
                if (supportResponse.getIsSuccess() == true) {
                    JOptionPane.showMessageDialog(null, supportResponse.getMessage(), "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    WelcomeView welcomeView = new WelcomeView();
                    welcomeView.setVisible(true);
                    welcomeView.setLocationRelativeTo(null);
                } else {
                    JOptionPane.showMessageDialog(null, supportResponse.getMessage(), "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: La respuesta de la api es nula", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar los datos del usuario " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        this.dispose();
        PasswordChangeView passwordChangeView = new PasswordChangeView(this.userDto2);
        passwordChangeView.setVisible(true);
        passwordChangeView.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void loadImageIcon() {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/images/icono.png"));
        this.setIconImage(imageIcon.getImage());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox ckbEstado;
    private javax.swing.JCheckBox ckbPdfUnico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblNumDocIdentReceptor2;
    private javax.swing.JLabel lblNumDocIdentReceptor3;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaEmision1;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
