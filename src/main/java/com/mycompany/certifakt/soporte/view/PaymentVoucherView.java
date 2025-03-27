/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.certifakt.soporte.view;

import com.mycompany.certifakt.soporte.apiservice.CertifaktService;
import com.mycompany.certifakt.soporte.payload.dto.PaymentVoucherDto;
import com.mycompany.certifakt.soporte.payload.request.PaymentVoucherRequest;
import com.mycompany.certifakt.soporte.payload.response.SupportResponse;
import java.awt.Cursor;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PaymentVoucherView extends javax.swing.JFrame {
    
    Map<String, String> tipoMap = new HashMap<>();
    private final Long paymentVoucherId;
    
    public PaymentVoucherView(PaymentVoucherDto paymentVoucher) {
        this.paymentVoucherId = paymentVoucher.getPaymentVoucherId();
        tipoMap.put("Factura", "01");
        tipoMap.put("Boleta", "03");
        tipoMap.put("Nota de credito", "07");
        tipoMap.put("Nota de debito", "08");
        initComponents();
        loadImageIcon();
        this.setResizable(false);
        txtSerie.setEditable(false);
        txtNumero.setEditable(false);
        txtSerie.setEditable(false);
        btnAtras.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmbTipo.addItem("Factura");
        cmbTipo.addItem("Boleta");
        cmbTipo.addItem("Nota de credito");
        cmbTipo.addItem("Nota de debito");
        
       
        cmbEstado.addItem("01");
        cmbEstado.addItem("02");
        cmbEstado.addItem("05");
        cmbEstado.addItem("06");
        cmbEstado.addItem("07");
        cmbEstado.addItem("08");
        cmbEstado.addItem("09");

        cmbEstadoSunat.addItem("N_ENV");
        cmbEstadoSunat.addItem("ACEPT");
        cmbEstadoSunat.addItem("RECHA");
        cmbEstadoSunat.addItem("ANULA");
        cmbEstadoSunat.setSelectedItem(paymentVoucher.getEstadoSunat());
        
        txtFechaEmision.setText(paymentVoucher.getFechaEmision());
        cmbTipo.setSelectedItem(this.obtenerTipo(paymentVoucher.getTipoComprobante()));
        txtSerie.setText(paymentVoucher.getSerie());
        txtNumero.setText(paymentVoucher.getNumero().toString());
        txtNumeroReceptor.setText(paymentVoucher.getNumDocIdentReceptor());
        txtDenominacionReceptor.setText(paymentVoucher.getDenominacionReceptor());
        txtMontoTotalVenta.setText(paymentVoucher.getMontoTotalVenta().toString());
        cmbEstado.setSelectedItem(paymentVoucher.getEstado());
        cmbEstadoSunat.setSelectedItem(paymentVoucher.getEstadoSunat());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtFechaEmision = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        txtNumeroReceptor = new javax.swing.JTextField();
        txtMontoTotalVenta = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbEstadoSunat = new javax.swing.JComboBox<>();
        lblSerie = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblNumDocIdentReceptor = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtDenominacionReceptor = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 280, -1));

        jLabel2.setText("Fecha Emisión:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 20));

        jPanel2.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 280, -1));

        jLabel3.setText("Tipo Comprobante:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 20));
        jPanel2.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 280, -1));
        jPanel2.add(txtNumeroReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 280, -1));
        jPanel2.add(txtMontoTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 270, -1));

        jPanel2.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 270, -1));

        jPanel2.add(cmbEstadoSunat, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 270, -1));

        lblSerie.setText("Serie:");
        jPanel2.add(lblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 20));

        jLabel5.setText("D. Receptor:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 120, 20));

        jLabel6.setText("MontoTotal:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 120, 20));

        jLabel7.setText("Estado:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 120, 20));

        jLabel8.setText("Estado Sunat:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 120, 20));

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
                .addContainerGap(572, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 40));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 960, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 960, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 960, 10));

        lblNumDocIdentReceptor.setText("N° Receptor:");
        jPanel2.add(lblNumDocIdentReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 20));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 960, 10));

        jLabel10.setText("Numero:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 20));
        jPanel2.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 280, -1));
        jPanel2.add(txtDenominacionReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 270, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 960, 300));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 100, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("08: Anulado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 110, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("01: No enviado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 120, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("02: Aceptado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 140, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("05: Rechazado");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 140, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("06: Error");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 140, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
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
            PaymentVoucherRequest paymentVoucherRequest = new PaymentVoucherRequest();
            paymentVoucherRequest.setPaymentVoucherId(paymentVoucherId);
            paymentVoucherRequest.setFechaEmision(txtFechaEmision.getText());
            paymentVoucherRequest.setTipoComprobante(String.valueOf(tipoMap.get(cmbTipo.getSelectedItem())));
            paymentVoucherRequest.setSerie(txtSerie.getText());
            paymentVoucherRequest.setNumero(Integer.valueOf(txtNumero.getText()));
            paymentVoucherRequest.setNumDocIdentReceptor(txtNumeroReceptor.getText());
            paymentVoucherRequest.setDenominacionReceptor(txtDenominacionReceptor.getText());
            paymentVoucherRequest.setMontoTotalVenta(Double.valueOf(txtMontoTotalVenta.getText()));
            paymentVoucherRequest.setEstado(String.valueOf(cmbEstado.getSelectedItem()));
            paymentVoucherRequest.setEstadoSunat(String.valueOf(cmbEstadoSunat.getSelectedItem()));
        
            Optional<SupportResponse> optionalSupportResponse = CertifaktService.updatePaymentVoucher(paymentVoucherRequest);
            if(optionalSupportResponse.isPresent()) {
                SupportResponse supportResponse = optionalSupportResponse.get();
                if(supportResponse.getIsSuccess() == true) {
                    JOptionPane.showMessageDialog(null, "Los datos se actualizaron correctamente.", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    WelcomeView welcomeView = new WelcomeView();
                    welcomeView.setVisible(true);
                    welcomeView.setLocationRelativeTo(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: La respuesta de la api es nula", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar los datos del comprobante: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    private void loadImageIcon() {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/images/icono.png"));
        this.setIconImage(imageIcon.getImage());
    }
    
    public String obtenerTipo(String codigo) {
        return switch (codigo) {
            case "01" -> "Factura";
            case "03" -> "Boleta";
            case "07" -> "Nota de credito";
            case "08" -> "Nota de debito";
            default -> "Desconocido";
        };
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbEstadoSunat;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblNumDocIdentReceptor;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JTextField txtDenominacionReceptor;
    private javax.swing.JTextField txtFechaEmision;
    private javax.swing.JTextField txtMontoTotalVenta;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroReceptor;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
