/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.certifakt.soporte.view;

import com.mycompany.certifakt.soporte.payload.PaymentVoucher;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class PaymentVoucherView extends javax.swing.JFrame {
    
    Map<String, String> tipoMap = new HashMap<>();
    
    public PaymentVoucherView(PaymentVoucher paymentVoucher) {
        tipoMap.put("01", "Factura");
        tipoMap.put("03", "Boleta");
        tipoMap.put("07", "Nota de crédito");
        tipoMap.put("08", "Nota de debito");
        initComponents();
        loadImageIcon();
        cmbTipo.addItem("Factura");
        cmbTipo.addItem("Boleta");
        cmbTipo.addItem("Nota de credito");
        cmbTipo.addItem("Nota de debito");
        cmbTipo.setSelectedItem(paymentVoucher.getTipoComprobante());
        cmbEstado.addItem("01");
        cmbEstado.addItem("02");
        cmbEstado.addItem("05");
        cmbEstado.addItem("08");
        cmbEstado.setSelectedItem(paymentVoucher.getEstado());
        cmbEstadoSunat.addItem("N_ENV");
        cmbEstadoSunat.addItem("ACEPT");
        cmbEstadoSunat.addItem("RECHA");
        cmbEstadoSunat.addItem("ANULA");
        cmbEstadoSunat.setSelectedItem(paymentVoucher.getEstadoSunat());
        txtFechaEmision.setText(paymentVoucher.getFechaEmision());
        txtNumero.setText(paymentVoucher.getNumero());
        txtReceptor.setText(paymentVoucher.getReceptor());
        txtMontoTotalVenta.setText(paymentVoucher.getMontoTotalVenta().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFechaEmision = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtReceptor = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        txtMontoTotalVenta = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbEstadoSunat = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Comprobante electrónico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 30));
        jPanel1.add(txtFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 210, -1));
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 210, -1));
        jPanel1.add(txtReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 210, -1));

        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 210, -1));
        jPanel1.add(txtMontoTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 210, -1));

        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 210, -1));

        jPanel1.add(cmbEstadoSunat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 210, -1));

        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        jLabel2.setText("Fecha Emisión:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel3.setText("Tipo Comprobante:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel4.setText("Numero:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel5.setText("Receptor:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel6.setText("MontoTotal:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel7.setText("Estado:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel8.setText("Estado Sunat:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
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
    
    private void loadImageIcon() {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/images/icono.png"));
        this.setIconImage(imageIcon.getImage());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbEstadoSunat;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFechaEmision;
    private javax.swing.JTextField txtMontoTotalVenta;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtReceptor;
    // End of variables declaration//GEN-END:variables
}
