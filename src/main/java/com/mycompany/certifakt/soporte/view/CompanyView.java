/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.certifakt.soporte.view;

import com.mycompany.certifakt.soporte.apiservice.CertifaktService;
import com.mycompany.certifakt.soporte.payload.dto.CompanyDto;
import com.mycompany.certifakt.soporte.payload.request.CompanyRequest;
import java.awt.Cursor;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CompanyView extends javax.swing.JFrame {

    Map<String, String> tipoOse = new HashMap<>();
        
    public CompanyView(CompanyDto company) {
        tipoOse.put("Certicom", "10");
        tipoOse.put("Blizlink", "12");
        initComponents();
        this.setResizable(false);
        loadImageIcon();
        
        btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmbOse.addItem("Certicom");
        cmbOse.addItem("Blizlink");
        txtRuc.setText(company.getRuc());
        txtNombreComercial.setText(company.getNombreComercial());
        txtRazonSocial.setText(company.getRazonSocial());
        txtDireccion.setText(company.getDireccion());
        txtCorreo.setText(company.getEmail());
        ckbEnvioAutomatico.setSelected(company.getEnvioAutomaticoSunat());
        ckbEstado.setSelected("A".equals(company.getEstado()));
        txtTelefono.setText(company.getTelefono());
        cmbOse.setSelectedItem(company.getOseId() == 10 ? "Certicom" : "Blizlink");
        ckbVerGuia.setSelected(company.getViewGuia());
        ckbVerOtroComprobante.setSelected(company.getViewOtroComprobante());
        ckbVerCotizacion.setSelected(company.getViewCotizacion());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreComercial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbOse = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        lblVerGuia = new javax.swing.JLabel();
        ckbVerGuia = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblVerOtroComprobante = new javax.swing.JLabel();
        ckbVerOtroComprobante = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblVerCotizacion = new javax.swing.JLabel();
        ckbVerCotizacion = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        ckbEnvioAutomatico = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        ckbEstado = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Numero de RUC:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 30));
        jPanel2.add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 180, -1));

        jLabel9.setText("Telefono:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 150, -1));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 170, -1));

        jLabel3.setText("Nombre comercial:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, -1));
        jPanel2.add(txtNombreComercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 180, -1));

        jLabel10.setText("Ose:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 150, -1));

        jPanel2.add(cmbOse, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 170, -1));

        jLabel4.setText("Razón social:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, -1));
        jPanel2.add(txtRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 180, -1));

        lblVerGuia.setText("Ver guia:");
        jPanel2.add(lblVerGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 150, -1));
        jPanel2.add(ckbVerGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        jLabel5.setText("Direccion:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, -1));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 180, -1));

        lblVerOtroComprobante.setText("Ver otro comprobante:");
        jPanel2.add(lblVerOtroComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 160, -1));
        jPanel2.add(ckbVerOtroComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        jLabel6.setText("Correo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, -1));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 180, -1));

        lblVerCotizacion.setText("Ver cotizacion:");
        jPanel2.add(lblVerCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 160, -1));
        jPanel2.add(ckbVerCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        jLabel7.setText("Envio automatico sunat:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, -1));
        jPanel2.add(ckbEnvioAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel8.setText("Estado:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 160, -1));
        jPanel2.add(ckbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Resultado de la busqueda");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 770, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 770, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 770, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 770, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 770, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 770, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 770, 330));

        btnCerrar.setBackground(new java.awt.Color(204, 51, 0));
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Volver");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 30));

        btnGuardar.setBackground(new java.awt.Color(0, 102, 204));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        CompanyRequest companyRequest = new CompanyRequest();
        companyRequest.setRuc(txtRuc.getText());
        companyRequest.setNombreComercial(txtNombreComercial.getText());
        companyRequest.setRazonSocial(txtRazonSocial.getText());
        companyRequest.setDireccion(txtDireccion.getText());
        companyRequest.setEmail(txtCorreo.getText());
        companyRequest.setEnvioAutomaticoSunat(ckbEnvioAutomatico.isSelected());
        companyRequest.setEstado(ckbEstado.isSelected() == true ? "A" : "D");
        companyRequest.setTelefono(txtTelefono.getText());
        companyRequest.setOseId(Integer.valueOf(tipoOse.get(cmbOse.getSelectedItem())));
        companyRequest.setViewGuia(ckbVerGuia.isSelected());
        companyRequest.setViewOtroComprobante(ckbVerOtroComprobante.isSelected());
        companyRequest.setViewCotizacion(ckbVerCotizacion.isSelected());

        Boolean isUpdated = CertifaktService.updateCompany(companyRequest);
        if(isUpdated != null && isUpdated == true) {
            JOptionPane.showMessageDialog(null, "Los datos se actualizaron correctamente.", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            WelcomeView welcomeView = new WelcomeView();
            welcomeView.setVisible(true);
            welcomeView.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
        WelcomeView welcomeView = new WelcomeView();
        welcomeView.setVisible(true);
        welcomeView.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCerrarActionPerformed
    
    private void loadImageIcon() {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/images/icono.png"));
        this.setIconImage(imageIcon.getImage());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox ckbEnvioAutomatico;
    private javax.swing.JCheckBox ckbEstado;
    private javax.swing.JCheckBox ckbVerCotizacion;
    private javax.swing.JCheckBox ckbVerGuia;
    private javax.swing.JCheckBox ckbVerOtroComprobante;
    private javax.swing.JComboBox<String> cmbOse;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblVerCotizacion;
    private javax.swing.JLabel lblVerGuia;
    private javax.swing.JLabel lblVerOtroComprobante;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreComercial;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
