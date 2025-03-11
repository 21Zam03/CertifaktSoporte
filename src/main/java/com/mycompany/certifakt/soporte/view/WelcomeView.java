/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.certifakt.soporte.view;

import com.mycompany.certifakt.soporte.apiservice.CertifaktService;
import com.mycompany.certifakt.soporte.config.ConfigFile;
import com.mycompany.certifakt.soporte.payload.PaymentVoucher;
import com.mycompany.certifakt.soporte.payload.dto.CompanyDto;
import com.mycompany.certifakt.soporte.payload.response.CompanyResponse;
import com.mycompany.certifakt.soporte.payload.request.SupportConsultRequest;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class WelcomeView extends javax.swing.JFrame {
    
    Map<String, String> comprobanteMap = new HashMap<>();
    
    public WelcomeView() {
        comprobanteMap.put("Factura", "01");
        comprobanteMap.put("Boleta", "03");
        comprobanteMap.put("Nota de crédito", "07");
        comprobanteMap.put("Nota de débito", "08");
        initComponents();
        loadImageIcon();
        postEnvironment();
        jtpMenu.setUI(null);
        cmbComprobanteTipo.addItem("Factura");
        cmbComprobanteTipo.addItem("Boleta");
        cmbComprobanteTipo.addItem("Nota de credito");
        cmbComprobanteTipo.addItem("Nota de debito");
        cmbComprobanteTipo.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtpMenu = new javax.swing.JTabbedPane();
        jpÇlients = new javax.swing.JPanel();
        lblCompany = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtCompanyRuc = new javax.swing.JTextField();
        btnCompany = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCompanyError = new javax.swing.JLabel();
        jpVouchers = new javax.swing.JPanel();
        txtComprobanteRucEmisor = new javax.swing.JTextField();
        cmbComprobanteTipo = new javax.swing.JComboBox<>();
        txtComprobanteSerie = new javax.swing.JTextField();
        txtComprobanteNumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnConsult = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        lblVoucher = new javax.swing.JLabel();
        jpGuias = new javax.swing.JPanel();
        lblVoucher1 = new javax.swing.JLabel();
        jpTokens = new javax.swing.JPanel();
        jpUsers = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        txtEnvironment = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCompanies = new javax.swing.JButton();
        btnVouchers = new javax.swing.JButton();
        btnGuias = new javax.swing.JButton();
        btnTokens = new javax.swing.JButton();
        btnUsers = new javax.swing.JToggleButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtpMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jpÇlients.setBackground(new java.awt.Color(255, 255, 255));

        lblCompany.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompany.setText("Consulta Empresas");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCompanyRuc.setToolTipText("");
        jPanel4.add(txtCompanyRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 500, 36));

        btnCompany.setText("Consultar");
        btnCompany.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompanyActionPerformed(evt);
            }
        });
        jPanel4.add(btnCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 107, 34));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 80, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ruc");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 80, 30));

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Criterios de busqueda");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 40));

        lblCompanyError.setForeground(new java.awt.Color(255, 51, 51));
        lblCompanyError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lblCompanyError, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 333, 23));

        javax.swing.GroupLayout jpÇlientsLayout = new javax.swing.GroupLayout(jpÇlients);
        jpÇlients.setLayout(jpÇlientsLayout);
        jpÇlientsLayout.setHorizontalGroup(
            jpÇlientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpÇlientsLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jpÇlientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jpÇlientsLayout.setVerticalGroup(
            jpÇlientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpÇlientsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCompany)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jtpMenu.addTab("tab1", jpÇlients);

        jpVouchers.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("N° Ruc");

        jLabel13.setText("Tipo de comprobante");

        jLabel14.setText("Serie y numero");

        btnConsult.setText("Consultar");
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });

        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblVoucher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVoucher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoucher.setText("Comprobantes Electrónicos");

        javax.swing.GroupLayout jpVouchersLayout = new javax.swing.GroupLayout(jpVouchers);
        jpVouchers.setLayout(jpVouchersLayout);
        jpVouchersLayout.setHorizontalGroup(
            jpVouchersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVouchersLayout.createSequentialGroup()
                .addGroup(jpVouchersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVouchersLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jpVouchersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpVouchersLayout.createSequentialGroup()
                                .addGroup(jpVouchersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jpVouchersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbComprobanteTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComprobanteRucEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpVouchersLayout.createSequentialGroup()
                                        .addComponent(txtComprobanteSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtComprobanteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpVouchersLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jpVouchersLayout.setVerticalGroup(
            jpVouchersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVouchersLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblVoucher)
                .addGap(46, 46, 46)
                .addGroup(jpVouchersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComprobanteRucEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jpVouchersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbComprobanteTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jpVouchersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComprobanteSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComprobanteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(36, 36, 36)
                .addComponent(btnConsult)
                .addGap(18, 18, 18)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jtpMenu.addTab("tab2", jpVouchers);

        jpGuias.setBackground(new java.awt.Color(255, 255, 255));

        lblVoucher1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVoucher1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoucher1.setText("Guías");

        javax.swing.GroupLayout jpGuiasLayout = new javax.swing.GroupLayout(jpGuias);
        jpGuias.setLayout(jpGuiasLayout);
        jpGuiasLayout.setHorizontalGroup(
            jpGuiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGuiasLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(lblVoucher1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jpGuiasLayout.setVerticalGroup(
            jpGuiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGuiasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblVoucher1)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        jtpMenu.addTab("tab3", jpGuias);

        javax.swing.GroupLayout jpTokensLayout = new javax.swing.GroupLayout(jpTokens);
        jpTokens.setLayout(jpTokensLayout);
        jpTokensLayout.setHorizontalGroup(
            jpTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        jpTokensLayout.setVerticalGroup(
            jpTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        jtpMenu.addTab("tab4", jpTokens);

        javax.swing.GroupLayout jpUsersLayout = new javax.swing.GroupLayout(jpUsers);
        jpUsers.setLayout(jpUsersLayout);
        jpUsersLayout.setHorizontalGroup(
            jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        jpUsersLayout.setVerticalGroup(
            jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        jtpMenu.addTab("tab5", jpUsers);

        jPanel1.add(jtpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 640, 430));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\certifakt-soporte\\src\\main\\resources\\images\\logo.png")); // NOI18N

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtEnvironment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEnvironment, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCerrarSesion)
                            .addComponent(txtEnvironment, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCompanies.setText("Empresas");
        btnCompanies.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompanies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompaniesActionPerformed(evt);
            }
        });

        btnVouchers.setText("Comprobantes");
        btnVouchers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVouchers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVouchersActionPerformed(evt);
            }
        });

        btnGuias.setText("Guias");
        btnGuias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiasActionPerformed(evt);
            }
        });

        btnTokens.setText("Tokens");
        btnTokens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTokensActionPerformed(evt);
            }
        });

        btnUsers.setText("Usuarios");
        btnUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVouchers, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCompanies, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTokens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(btnCompanies)
                .addGap(18, 18, 18)
                .addComponent(btnVouchers)
                .addGap(18, 18, 18)
                .addComponent(btnGuias)
                .addGap(18, 18, 18)
                .addComponent(btnTokens)
                .addGap(18, 18, 18)
                .addComponent(btnUsers)
                .addGap(50, 50, 50))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompaniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompaniesActionPerformed
       jtpMenu.setSelectedIndex(0);
    }//GEN-LAST:event_btnCompaniesActionPerformed

    private void btnVouchersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVouchersActionPerformed
        jtpMenu.setSelectedIndex(1);
    }//GEN-LAST:event_btnVouchersActionPerformed

    private void btnGuiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiasActionPerformed
        jtpMenu.setSelectedIndex(2);
    }//GEN-LAST:event_btnGuiasActionPerformed

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        SupportConsultRequest supportConsultRequest = new SupportConsultRequest();
        supportConsultRequest.setRucEmisor(txtComprobanteRucEmisor.getText());
        supportConsultRequest.setTipoComprobante(comprobanteMap.get((String) cmbComprobanteTipo.getSelectedItem()));
        supportConsultRequest.setSerie(txtComprobanteSerie.getText());
        supportConsultRequest.setNumero(Integer.valueOf(txtComprobanteNumero.getText()));
        PaymentVoucher paymentVoucher = CertifaktService.getPaymentVoucher(supportConsultRequest);
        System.out.println("PAYMENT VOUCHER: "+paymentVoucher);
        if(paymentVoucher != null) {
            this.dispose();
            PaymentVoucherView paymentVoucherView = new PaymentVoucherView(paymentVoucher);
            paymentVoucherView.setVisible(true);
            paymentVoucherView.setLocationRelativeTo(null);
        } else {
            lblError.setText("El comprobante no existe");
        }
    }//GEN-LAST:event_btnConsultActionPerformed

    private void btnTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTokensActionPerformed
        jtpMenu.setSelectedIndex(3);
    }//GEN-LAST:event_btnTokensActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        jtpMenu.setSelectedIndex(4);
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompanyActionPerformed
        CompanyDto company = CertifaktService.getCompany(txtCompanyRuc.getText());
        if(company != null) {
            this.dispose();
            CompanyView companyView = new CompanyView(company);
            companyView.setVisible(true);
            companyView.setLocationRelativeTo(null);
        } else {
            lblCompanyError.setText("La empresa no esta registrada en certifakt");
        }
    }//GEN-LAST:event_btnCompanyActionPerformed
    
    private void postEnvironment() {
        String url = ConfigFile.obtenerUrl();
        if(url.contains("test")) {
            txtEnvironment.setText("Ambiente de pruebas");
        } else {
            txtEnvironment.setText("Ambiente de producción");
        }
        
    }
    
    private void loadImageIcon() {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/images/icono.png"));
        this.setIconImage(imageIcon.getImage());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCompanies;
    private javax.swing.JButton btnCompany;
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnGuias;
    private javax.swing.JButton btnTokens;
    private javax.swing.JToggleButton btnUsers;
    private javax.swing.JButton btnVouchers;
    private javax.swing.JComboBox<String> cmbComprobanteTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jpGuias;
    private javax.swing.JPanel jpTokens;
    private javax.swing.JPanel jpUsers;
    private javax.swing.JPanel jpVouchers;
    private javax.swing.JPanel jpÇlients;
    private javax.swing.JTabbedPane jtpMenu;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblCompanyError;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblVoucher;
    private javax.swing.JLabel lblVoucher1;
    private javax.swing.JTextField txtCompanyRuc;
    private javax.swing.JTextField txtComprobanteNumero;
    private javax.swing.JTextField txtComprobanteRucEmisor;
    private javax.swing.JTextField txtComprobanteSerie;
    private javax.swing.JLabel txtEnvironment;
    // End of variables declaration//GEN-END:variables
}
