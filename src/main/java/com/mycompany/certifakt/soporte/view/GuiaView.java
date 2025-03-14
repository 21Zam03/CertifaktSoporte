/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.certifakt.soporte.view;

import com.mycompany.certifakt.soporte.payload.request.GuiaRequest;
import com.mycompany.certifakt.soporte.payload.dto.GuiaDto;
import javax.swing.ImageIcon;


public class GuiaView extends javax.swing.JFrame {
    
    private final Long guiaId;
    
    public GuiaView(GuiaDto guiaDto) {
        this.guiaId = guiaDto.getGuiaId();
        initComponents();
        loadImageIcon();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
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
        jSeparator6 = new javax.swing.JSeparator();
        lblNumDocIdentReceptor1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblNumDocIdentReceptor2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 100, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 100, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 180, -1));

        jLabel2.setText("Fecha Emisión:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 20));

        jPanel2.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 180, -1));

        jLabel3.setText("Tipo Comprobante:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 20));
        jPanel2.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 180, -1));
        jPanel2.add(txtNumeroReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 180, -1));
        jPanel2.add(txtMontoTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 210, -1));

        jPanel2.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 210, -1));

        jPanel2.add(cmbEstadoSunat, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 210, -1));

        lblSerie.setText("Serie:");
        jPanel2.add(lblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 20));

        jLabel5.setText("D. Remitente");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, 20));

        jLabel6.setText("MontoTotal:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 120, 20));

        jLabel7.setText("Estado:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 120, 20));

        jLabel8.setText("Estado Sunat:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 120, 20));

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
                .addContainerGap(372, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 40));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 760, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 770, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 760, 10));

        lblNumDocIdentReceptor.setText("D° Receptor");
        jPanel2.add(lblNumDocIdentReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 110, 20));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 760, 10));

        jLabel10.setText("Numero:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 20));
        jPanel2.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 180, -1));
        jPanel2.add(txtDenominacionReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 180, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 760, 10));

        lblNumDocIdentReceptor1.setText("N° Remitente");
        jPanel2.add(lblNumDocIdentReceptor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 20));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 210, -1));

        lblNumDocIdentReceptor2.setText("N° Receptor");
        jPanel2.add(lblNumDocIdentReceptor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 110, 20));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 210, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 760, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        /*Servicio de guardar*/

        GuiaRequest guiaRequest = new GuiaRequest();
        guiaRequest.setGuiaId(guiaId);
        guiaRequest.setFechaEmision(txtFechaEmision.getText());
        guiaRequest.setTipoComprobante(String.valueOf(cmbTipo.getSelectedItem()));
        guiaRequest.setSerie(txtSerie.getText());
        guiaRequest.setNumero(Integer.valueOf(txtNumero.getText()));
        
        //guiaRequest.setNumDocIdentReceptor(txtNumeroReceptor.getText());
        //paymentVoucherRequest.setDenominacionReceptor(txtDenominacionReceptor.getText());
        
        //paymentVoucherRequest.setMontoTotalVenta(Double.valueOf(txtMontoTotalVenta.getText()));
        //paymentVoucherRequest.setEstado(String.valueOf(cmbEstado.getSelectedItem()));
        //paymentVoucherRequest.setEstadoSunat(String.valueOf(cmbEstadoSunat.getSelectedItem()));

        /*
        System.out.println("Voucher: "+ paymentVoucherRequest.toString());

        Boolean isUpdated = CertifaktService.updatePaymentVoucher(paymentVoucherRequest);
        if(isUpdated != null && isUpdated == true) {
            JOptionPane.showMessageDialog(null, "Los datos se actualizaron correctamente.", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            WelcomeView welcomeView = new WelcomeView();
            welcomeView.setVisible(true);
            welcomeView.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_btnGuardarActionPerformed

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblNumDocIdentReceptor;
    private javax.swing.JLabel lblNumDocIdentReceptor1;
    private javax.swing.JLabel lblNumDocIdentReceptor2;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JTextField txtDenominacionReceptor;
    private javax.swing.JTextField txtFechaEmision;
    private javax.swing.JTextField txtMontoTotalVenta;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroReceptor;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
