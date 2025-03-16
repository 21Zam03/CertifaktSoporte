/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.certifakt.soporte.view;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.mycompany.certifakt.soporte.apiservice.CertifaktService;
import com.mycompany.certifakt.soporte.config.ConfigFile;
import com.mycompany.certifakt.soporte.payload.dto.PaymentVoucherDto;
import com.mycompany.certifakt.soporte.payload.dto.CompanyDto;
import com.mycompany.certifakt.soporte.payload.dto.GuiaDto;
import com.mycompany.certifakt.soporte.payload.request.SupportConsultRequest;
import java.awt.Color;
import java.awt.Cursor;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class WelcomeView extends javax.swing.JFrame {
    
    Map<String, String> comprobanteMap = new HashMap<>();
    Map<String, String> guiaMap = new HashMap<>();
    
    public WelcomeView() {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            System.err.println("No se pudo aplicar el tema FlatLaf Cupertino Light");
        }
        comprobanteMap.put("Factura", "01");
        comprobanteMap.put("Boleta", "03");
        comprobanteMap.put("Nota de crédito", "07");
        comprobanteMap.put("Nota de débito", "08");
        guiaMap.put("Guia de remision remitente", "09");
        guiaMap.put("Guia de remision transportista", "31");
        
        initComponents();
        this.setResizable(false);
        loadImageIcon();
        postEnvironment();
        jtpMenu.setUI(null);
        cmbComprobanteTipo.addItem("Factura");
        cmbComprobanteTipo.addItem("Boleta");
        cmbComprobanteTipo.addItem("Nota de credito");
        cmbComprobanteTipo.addItem("Nota de debito");
        cmbComprobanteTipo.setSelectedIndex(0);
        
        
        /*1 part*/
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/images/logo.png"));
        lblLogo.setIcon(imageIcon);
        btnCerrarSesion.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCompanyCreate.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        /*2 part*/
        btnCompanies.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnVouchers.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnGuias.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnTokens.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnUsers.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        /*3 part*/
        //Company
        btnCompany.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //Voucher
        btnVoucher.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //Guia
        btnGuia.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmbGuiaTipo.addItem("Guia de remision remitente");
        cmbGuiaTipo.addItem("Guia de remision transportista");
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
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCompanyCreate = new javax.swing.JButton();
        lblCompanyError = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpVouchers = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        btnVoucher = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtComprobanteRucEmisor = new javax.swing.JTextField();
        cmbComprobanteTipo = new javax.swing.JComboBox<>();
        txtComprobanteSerie = new javax.swing.JTextField();
        txtComprobanteNumero = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        lblVoucher1 = new javax.swing.JLabel();
        jpGuias = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblGuiaSerieNumero = new javax.swing.JLabel();
        lblGuiaTipo = new javax.swing.JLabel();
        lblGuiaRuc = new javax.swing.JLabel();
        txtGuiaRuc = new javax.swing.JTextField();
        cmbGuiaTipo = new javax.swing.JComboBox<>();
        txtGuiaSerie = new javax.swing.JTextField();
        txtGuiaNumero = new javax.swing.JTextField();
        btnGuia = new javax.swing.JButton();
        lblGuia = new javax.swing.JLabel();
        jpTokens = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtUserId = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        lblTokens = new javax.swing.JLabel();
        btnGenerarToken = new javax.swing.JButton();
        jpUsers = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        lblTokens1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblUsers = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
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
        jtpMenu.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jtpMenu.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jtpMenu.setToolTipText("");

        jpÇlients.setBackground(new java.awt.Color(255, 255, 255));

        lblCompany.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCompany.setForeground(new java.awt.Color(153, 153, 153));
        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCompany.setText("Consulta Empresas");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCompanyRuc.setToolTipText("");
        jPanel4.add(txtCompanyRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 570, 36));

        btnCompany.setBackground(new java.awt.Color(0, 102, 204));
        btnCompany.setForeground(new java.awt.Color(255, 255, 255));
        btnCompany.setText("Buscar");
        btnCompany.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompanyActionPerformed(evt);
            }
        });
        jPanel4.add(btnCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 90, 34));

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busqueda");

        btnCompanyCreate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCompanyCreate.setText("+");
        btnCompanyCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompanyCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(btnCompanyCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompanyCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        lblCompanyError.setForeground(new java.awt.Color(255, 51, 51));
        lblCompanyError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lblCompanyError, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 333, 23));
        jPanel4.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        javax.swing.GroupLayout jpÇlientsLayout = new javax.swing.GroupLayout(jpÇlients);
        jpÇlients.setLayout(jpÇlientsLayout);
        jpÇlientsLayout.setHorizontalGroup(
            jpÇlientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpÇlientsLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jpÇlientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jpÇlientsLayout.setVerticalGroup(
            jpÇlientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpÇlientsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblCompany)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jtpMenu.addTab("tab1", jpÇlients);

        jpVouchers.setBackground(new java.awt.Color(255, 255, 255));
        jpVouchers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoucher.setText("Consultar");
        btnVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoucherActionPerformed(evt);
            }
        });

        jLabel12.setText("N° Ruc");

        jLabel13.setText("Tipo de comprobante");

        jLabel14.setText("Serie y numero");

        jPanel7.setBackground(new java.awt.Color(0, 102, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Busqueda");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(txtComprobanteSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtComprobanteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbComprobanteTipo, 0, 266, Short.MAX_VALUE)
                                .addComponent(txtComprobanteRucEmisor))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComprobanteRucEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbComprobanteTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtComprobanteNumero)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtComprobanteSerie)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jpVouchers.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 610, 300));

        lblVoucher1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVoucher1.setForeground(new java.awt.Color(153, 153, 153));
        lblVoucher1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVoucher1.setText("Consulta comprobantes");
        jpVouchers.add(lblVoucher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 290, 30));

        jtpMenu.addTab("tab2", jpVouchers);

        jpGuias.setBackground(new java.awt.Color(255, 255, 255));
        jpGuias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        jPanel8.setBackground(new java.awt.Color(0, 102, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblGuiaSerieNumero.setText("Serie y numero");

        lblGuiaTipo.setText("Tipo de comprobante");

        lblGuiaRuc.setText("N° Ruc");

        btnGuia.setText("Consultar");
        btnGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(btnGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblGuiaRuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGuiaTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGuiaSerieNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbGuiaTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(txtGuiaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGuiaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtGuiaRuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGuiaRuc)
                    .addComponent(txtGuiaRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGuiaTipo)
                    .addComponent(cmbGuiaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGuiaSerieNumero)
                    .addComponent(txtGuiaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGuiaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jpGuias.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 600, 290));

        lblGuia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGuia.setForeground(new java.awt.Color(153, 153, 153));
        lblGuia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGuia.setText("Consulta guias");
        jpGuias.add(lblGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 290, 30));

        jtpMenu.addTab("tab3", jpGuias);

        jpTokens.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 420, -1));

        jPanel10.setBackground(new java.awt.Color(0, 102, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        lblTokens.setBackground(new java.awt.Color(255, 255, 255));
        lblTokens.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTokens.setForeground(new java.awt.Color(255, 255, 255));
        lblTokens.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTokens.setText("Tokens");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTokens, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTokens)
                .addContainerGap())
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        btnGenerarToken.setText("Generar Token");
        btnGenerarToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarTokenActionPerformed(evt);
            }
        });
        jPanel6.add(btnGenerarToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, 32));

        javax.swing.GroupLayout jpTokensLayout = new javax.swing.GroupLayout(jpTokens);
        jpTokens.setLayout(jpTokensLayout);
        jpTokensLayout.setHorizontalGroup(
            jpTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTokensLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jpTokensLayout.setVerticalGroup(
            jpTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTokensLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jtpMenu.addTab("tab4", jpTokens);

        jpUsers.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel11.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 580, 145));

        jPanel12.setBackground(new java.awt.Color(0, 102, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        lblTokens1.setBackground(new java.awt.Color(255, 255, 255));
        lblTokens1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTokens1.setForeground(new java.awt.Color(255, 255, 255));
        lblTokens1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTokens1.setText("Usuarios");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTokens1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTokens1)
                .addContainerGap())
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));
        jPanel11.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 430, -1));

        jButton2.setText("Consultar");
        jPanel11.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 120, -1));

        jButton3.setText("Crear");
        jPanel11.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 90, 30));

        lblUsers.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsers.setForeground(new java.awt.Color(153, 153, 153));
        lblUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsers.setText("Consulta usuarios");

        javax.swing.GroupLayout jpUsersLayout = new javax.swing.GroupLayout(jpUsers);
        jpUsers.setLayout(jpUsersLayout);
        jpUsersLayout.setHorizontalGroup(
            jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsersLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpUsersLayout.setVerticalGroup(
            jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUsersLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jtpMenu.addTab("tab5", jpUsers);

        jPanel1.add(jtpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 660, 440));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        txtEnvironment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEnvironment, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnvironment, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrarSesion)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCompanies.setText("Empresas");
        btnCompanies.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCompanies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompaniesActionPerformed(evt);
            }
        });

        btnVouchers.setText("Comprobantes");
        btnVouchers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVouchers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVouchersActionPerformed(evt);
            }
        });

        btnGuias.setText("Guias");
        btnGuias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiasActionPerformed(evt);
            }
        });

        btnTokens.setText("Tokens");
        btnTokens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTokensActionPerformed(evt);
            }
        });

        btnUsers.setText("Usuarios");
        btnUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVouchers, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompanies, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnUsers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addComponent(btnTokens, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoucherActionPerformed
        SupportConsultRequest supportConsultRequest = new SupportConsultRequest();
        supportConsultRequest.setRucEmisor(txtComprobanteRucEmisor.getText());
        supportConsultRequest.setTipoComprobante(comprobanteMap.get((String) cmbComprobanteTipo.getSelectedItem()));
        supportConsultRequest.setSerie(txtComprobanteSerie.getText());
        supportConsultRequest.setNumero(Integer.valueOf(txtComprobanteNumero.getText()));
        PaymentVoucherDto paymentVoucher = CertifaktService.getPaymentVoucher(supportConsultRequest);
        
        System.out.println("PAYMENT VOUCHER: "+paymentVoucher);
        if(paymentVoucher != null) {
            this.dispose();
            PaymentVoucherView paymentVoucherView = new PaymentVoucherView(paymentVoucher);
            paymentVoucherView.setVisible(true);
            paymentVoucherView.setLocationRelativeTo(null);
        } else {
            lblError.setText("El comprobante no existe");
        }
    }//GEN-LAST:event_btnVoucherActionPerformed

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

    private void btnGenerarTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarTokenActionPerformed
        Long userId = Long.valueOf(txtUserId.getText());
        String userToken = CertifaktService.getUserToken(userId);
        if(userToken == null) {
            System.out.println("ERROR");
        } else {
            System.out.println("Token: "+userToken);
        }
    }//GEN-LAST:event_btnGenerarTokenActionPerformed

    private void btnGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiaActionPerformed
        SupportConsultRequest supportConsultRequest = new SupportConsultRequest();
        supportConsultRequest.setRucEmisor(txtGuiaRuc.getText());
        supportConsultRequest.setTipoComprobante(guiaMap.get((String) cmbGuiaTipo.getSelectedItem()));
        supportConsultRequest.setSerie(txtGuiaSerie.getText());
        supportConsultRequest.setNumero(Integer.valueOf(txtGuiaNumero.getText()));
        GuiaDto guiaDto = CertifaktService.getGuia(supportConsultRequest);
        
        System.out.println("GUIA: "+guiaDto.toString());
        if(guiaDto != null) {
            this.dispose();
            GuiaView guiaView = new GuiaView(guiaDto);
            guiaView.setVisible(true);
            guiaView.setLocationRelativeTo(null);
        } else {
            lblError.setText("La guia no existe");
        }
    }//GEN-LAST:event_btnGuiaActionPerformed

    private void btnCompanyCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompanyCreateActionPerformed
        this.dispose();
        CreateCompanyView createCompanyView = new CreateCompanyView();
        createCompanyView.setVisible(true);
        createCompanyView.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCompanyCreateActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        ConfigFile.eliminarCredenciales();
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed
    
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
    private javax.swing.JButton btnCompanyCreate;
    private javax.swing.JButton btnGenerarToken;
    private javax.swing.JButton btnGuia;
    private javax.swing.JButton btnGuias;
    private javax.swing.JButton btnTokens;
    private javax.swing.JToggleButton btnUsers;
    private javax.swing.JButton btnVoucher;
    private javax.swing.JButton btnVouchers;
    private javax.swing.JComboBox<String> cmbComprobanteTipo;
    private javax.swing.JComboBox<String> cmbGuiaTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpGuias;
    private javax.swing.JPanel jpTokens;
    private javax.swing.JPanel jpUsers;
    private javax.swing.JPanel jpVouchers;
    private javax.swing.JPanel jpÇlients;
    private javax.swing.JTabbedPane jtpMenu;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblCompanyError;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblGuia;
    private javax.swing.JLabel lblGuiaRuc;
    private javax.swing.JLabel lblGuiaSerieNumero;
    private javax.swing.JLabel lblGuiaTipo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTokens;
    private javax.swing.JLabel lblTokens1;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JLabel lblVoucher1;
    private javax.swing.JTextField txtCompanyRuc;
    private javax.swing.JTextField txtComprobanteNumero;
    private javax.swing.JTextField txtComprobanteRucEmisor;
    private javax.swing.JTextField txtComprobanteSerie;
    private javax.swing.JLabel txtEnvironment;
    private javax.swing.JTextField txtGuiaNumero;
    private javax.swing.JTextField txtGuiaRuc;
    private javax.swing.JTextField txtGuiaSerie;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
