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
import com.mycompany.certifakt.soporte.payload.dto.InfoDownloadDto;
import com.mycompany.certifakt.soporte.payload.dto.UserDto2;
import com.mycompany.certifakt.soporte.payload.request.SupportConsultRequest;
import com.mycompany.certifakt.soporte.validation.Validation;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

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
        comprobanteMap.put("Nota de credito", "07");
        comprobanteMap.put("Nota de debito", "08");
        guiaMap.put("Guia de remision remitente", "09");
        guiaMap.put("Guia de remision transportista", "31");
        
        initComponents();
        limitarTextField(txtComprobanteSerie, 4);
        limitarTextField(txtGuiaSerie, 4);
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
        btnDownloadPdf.setCursor(new Cursor(Cursor.HAND_CURSOR));
        /*3 part*/
        //Company
        btnCompany.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //Voucher
        btnVoucher.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //Guia
        btnGuia.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmbGuiaTipo.addItem("Guia de remision remitente");
        cmbGuiaTipo.addItem("Guia de remision transportista");
        
        //User
        btnUserConsultar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jtaToken.setEditable(false);
        btnAutoPaste.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnGenerarToken.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnUserEditar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.cargarTabla();
    
        //Descarga
        btnConsultarDescarga.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblCompanyError1 = new javax.swing.JLabel();
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
        lblVoucherError = new javax.swing.JLabel();
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
        lblGuiaError = new javax.swing.JLabel();
        lblGuia = new javax.swing.JLabel();
        jpTokens = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtUserId = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        lblTokens = new javax.swing.JLabel();
        btnGenerarToken = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaToken = new javax.swing.JTextArea();
        btnAutoPaste = new javax.swing.JButton();
        lblTokenError = new javax.swing.JLabel();
        lblGuia1 = new javax.swing.JLabel();
        jpUsers = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsers = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        lblTokens1 = new javax.swing.JLabel();
        txtUserRuc = new javax.swing.JTextField();
        btnUserConsultar = new javax.swing.JButton();
        lblUserError = new javax.swing.JLabel();
        btnUserEditar = new javax.swing.JButton();
        lblUsers = new javax.swing.JLabel();
        jpDownloads = new javax.swing.JPanel();
        lblUsers1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        lblTokens2 = new javax.swing.JLabel();
        txtRucDescarga = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtLinks = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblTotalDescargas = new javax.swing.JLabel();
        cbxDesdeAño = new javax.swing.JComboBox<>();
        cbxDesdeDia = new javax.swing.JComboBox<>();
        cbxDesdeMes = new javax.swing.JComboBox<>();
        cbxHastaDia = new javax.swing.JComboBox<>();
        cbxHastaMonth = new javax.swing.JComboBox<>();
        cbxHastaYear = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnConsultarDescarga = new javax.swing.JButton();
        cmbSize = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        txtEnvironment = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnCompanies = new javax.swing.JButton();
        btnVouchers = new javax.swing.JButton();
        btnGuias = new javax.swing.JButton();
        btnTokens = new javax.swing.JButton();
        btnUsers = new javax.swing.JToggleButton();
        btnDownloadPdf = new javax.swing.JToggleButton();

        jButton1.setText("jButton1");

        lblCompanyError1.setForeground(new java.awt.Color(255, 51, 51));
        lblCompanyError1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCompanyRuc.setToolTipText("");
        jPanel4.add(txtCompanyRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 810, 36));

        btnCompany.setBackground(new java.awt.Color(0, 102, 204));
        btnCompany.setForeground(new java.awt.Color(255, 255, 255));
        btnCompany.setText("Buscar");
        btnCompany.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompanyActionPerformed(evt);
            }
        });
        jPanel4.add(btnCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 90, 34));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(btnCompanyCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 50));

        lblCompanyError.setForeground(new java.awt.Color(255, 51, 51));
        lblCompanyError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lblCompanyError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 650, 50));
        jPanel4.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        javax.swing.GroupLayout jpÇlientsLayout = new javax.swing.GroupLayout(jpÇlients);
        jpÇlients.setLayout(jpÇlientsLayout);
        jpÇlientsLayout.setHorizontalGroup(
            jpÇlientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpÇlientsLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jpÇlientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jpÇlientsLayout.setVerticalGroup(
            jpÇlientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpÇlientsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblCompany)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jtpMenu.addTab("tab1", jpÇlients);

        jpVouchers.setBackground(new java.awt.Color(255, 255, 255));
        jpVouchers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoucher.setBackground(new java.awt.Color(0, 102, 204));
        btnVoucher.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblVoucherError.setForeground(new java.awt.Color(255, 51, 51));
        lblVoucherError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(lblVoucherError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbComprobanteTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtComprobanteRucEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(txtComprobanteSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtComprobanteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(129, 129, 129))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtComprobanteRucEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(cmbComprobanteTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtComprobanteNumero)
                            .addComponent(txtComprobanteSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblVoucherError, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpVouchers.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 850, 320));

        lblVoucher1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVoucher1.setForeground(new java.awt.Color(153, 153, 153));
        lblVoucher1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVoucher1.setText("Consulta comprobantes");
        jpVouchers.add(lblVoucher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 710, 30));

        jtpMenu.addTab("tab2", jpVouchers);

        jpGuias.setBackground(new java.awt.Color(255, 255, 255));
        jpGuias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
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

        btnGuia.setBackground(new java.awt.Color(0, 102, 204));
        btnGuia.setForeground(new java.awt.Color(255, 255, 255));
        btnGuia.setText("Consultar");
        btnGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiaActionPerformed(evt);
            }
        });

        lblGuiaError.setForeground(new java.awt.Color(255, 51, 51));
        lblGuiaError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(lblGuiaError, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblGuiaRuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGuiaTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGuiaSerieNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbGuiaTipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGuiaRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(txtGuiaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtGuiaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btnGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
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
                .addGap(46, 46, 46)
                .addComponent(btnGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGuiaError, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpGuias.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 850, 320));

        lblGuia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblGuia.setForeground(new java.awt.Color(153, 153, 153));
        lblGuia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGuia.setText("Consulta guias");
        jpGuias.add(lblGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 700, 30));

        jtpMenu.addTab("tab3", jpGuias);

        jpTokens.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 770, 40));

        jPanel10.setBackground(new java.awt.Color(0, 102, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        lblTokens.setBackground(new java.awt.Color(255, 255, 255));
        lblTokens.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTokens.setForeground(new java.awt.Color(255, 255, 255));
        lblTokens.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTokens.setText("Token");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTokens, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTokens)
                .addContainerGap())
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        btnGenerarToken.setBackground(new java.awt.Color(0, 102, 204));
        btnGenerarToken.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarToken.setText("Generar Token");
        btnGenerarToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarTokenActionPerformed(evt);
            }
        });
        jPanel6.add(btnGenerarToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, 32));

        jLabel5.setText("Token: ");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 50, 30));

        jtaToken.setColumns(20);
        jtaToken.setRows(5);
        jScrollPane2.setViewportView(jtaToken);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 760, 70));

        btnAutoPaste.setText("Copiar");
        btnAutoPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoPasteActionPerformed(evt);
            }
        });
        jPanel6.add(btnAutoPaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 90, -1));

        lblTokenError.setForeground(new java.awt.Color(255, 51, 51));
        lblTokenError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(lblTokenError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 770, 40));

        lblGuia1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblGuia1.setForeground(new java.awt.Color(153, 153, 153));
        lblGuia1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGuia1.setText("Obtener token");

        javax.swing.GroupLayout jpTokensLayout = new javax.swing.GroupLayout(jpTokens);
        jpTokens.setLayout(jpTokensLayout);
        jpTokensLayout.setHorizontalGroup(
            jpTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTokensLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGuia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jpTokensLayout.setVerticalGroup(
            jpTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTokensLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblGuia1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jtpMenu.addTab("tab4", jpTokens);

        jpUsers.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtUsers);

        jPanel11.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 830, 180));

        jPanel12.setBackground(new java.awt.Color(0, 102, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        lblTokens1.setBackground(new java.awt.Color(255, 255, 255));
        lblTokens1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTokens1.setForeground(new java.awt.Color(255, 255, 255));
        lblTokens1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTokens1.setText("Busqueda");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTokens1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTokens1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));
        jPanel11.add(txtUserRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 690, 30));

        btnUserConsultar.setBackground(new java.awt.Color(0, 102, 204));
        btnUserConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnUserConsultar.setText("Consultar");
        btnUserConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserConsultarActionPerformed(evt);
            }
        });
        jPanel11.add(btnUserConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 120, 30));

        lblUserError.setForeground(new java.awt.Color(255, 51, 51));
        lblUserError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(lblUserError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 760, 40));

        btnUserEditar.setText("E");
        btnUserEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserEditarActionPerformed(evt);
            }
        });
        jPanel11.add(btnUserEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 50, -1));

        lblUsers.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUsers.setForeground(new java.awt.Color(153, 153, 153));
        lblUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsers.setText("Consulta usuarios");

        javax.swing.GroupLayout jpUsersLayout = new javax.swing.GroupLayout(jpUsers);
        jpUsers.setLayout(jpUsersLayout);
        jpUsersLayout.setHorizontalGroup(
            jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsersLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jpUsersLayout.setVerticalGroup(
            jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUsersLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jtpMenu.addTab("tab5", jpUsers);

        jpDownloads.setBackground(new java.awt.Color(255, 255, 255));

        lblUsers1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUsers1.setForeground(new java.awt.Color(153, 153, 153));
        lblUsers1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsers1.setText("Descarga PDF");

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(0, 102, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        lblTokens2.setBackground(new java.awt.Color(255, 255, 255));
        lblTokens2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTokens2.setForeground(new java.awt.Color(255, 255, 255));
        lblTokens2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTokens2.setText("Busqueda");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTokens2, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTokens2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        txtRucDescarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucDescargaActionPerformed(evt);
            }
        });
        jPanel14.add(txtRucDescarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 580, 30));

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Empresa:");

        jLabel6.setText("INFORMACION:");

        jLabel9.setText("Links:");

        lblCliente.setForeground(new java.awt.Color(153, 153, 153));

        lblTotal.setForeground(new java.awt.Color(153, 153, 153));

        jLabel10.setText("Cantidad:");

        txtLinks.setColumns(20);
        txtLinks.setRows(5);
        jScrollPane3.setViewportView(txtLinks);

        jLabel11.setText("Total:");

        jLabel15.setText("Total descargas:");

        lblCantidad.setForeground(new java.awt.Color(153, 153, 153));

        lblTotalDescargas.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(lblTotalDescargas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalDescargas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addGap(24, 24, 24))
        );

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 830, 220));

        cbxDesdeAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jPanel14.add(cbxDesdeAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 100, 30));

        cbxDesdeDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel14.add(cbxDesdeDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 100, 30));

        cbxDesdeMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel14.add(cbxDesdeMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, 30));

        cbxHastaDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel14.add(cbxHastaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 100, 30));

        cbxHastaMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel14.add(cbxHastaMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 100, 30));

        cbxHastaYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jPanel14.add(cbxHastaYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 100, 30));

        jLabel7.setText("Hasta");
        jPanel14.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 60, 30));

        jLabel8.setText("Desde");
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 60, 30));

        btnConsultarDescarga.setBackground(new java.awt.Color(0, 102, 204));
        btnConsultarDescarga.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarDescarga.setText("Consultar");
        btnConsultarDescarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDescargaActionPerformed(evt);
            }
        });
        jPanel14.add(btnConsultarDescarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 120, 30));

        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25", "50", "100", "500" }));
        jPanel14.add(cmbSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 110, 30));

        javax.swing.GroupLayout jpDownloadsLayout = new javax.swing.GroupLayout(jpDownloads);
        jpDownloads.setLayout(jpDownloadsLayout);
        jpDownloadsLayout.setHorizontalGroup(
            jpDownloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDownloadsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpDownloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsers1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jpDownloadsLayout.setVerticalGroup(
            jpDownloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDownloadsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblUsers1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpMenu.addTab("tab6", jpDownloads);

        jPanel1.add(jtpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 910, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtEnvironment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEnvironment, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEnvironment, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnCerrarSesion))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 70));

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

        btnDownloadPdf.setText("Descarga PDF");
        btnDownloadPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDownloadPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVouchers, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompanies, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnUsers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTokens, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDownloadPdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(btnCompanies)
                .addGap(18, 18, 18)
                .addComponent(btnVouchers)
                .addGap(18, 18, 18)
                .addComponent(btnGuias)
                .addGap(18, 18, 18)
                .addComponent(btnTokens)
                .addGap(18, 18, 18)
                .addComponent(btnUsers)
                .addGap(18, 18, 18)
                .addComponent(btnDownloadPdf)
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 530));

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

    private void btnTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTokensActionPerformed
        jtpMenu.setSelectedIndex(3);
    }//GEN-LAST:event_btnTokensActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        jtpMenu.setSelectedIndex(4);
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        ConfigFile.eliminarCredenciales();
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnDownloadPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadPdfActionPerformed
        jtpMenu.setSelectedIndex(5);
    }//GEN-LAST:event_btnDownloadPdfActionPerformed

    private void btnUserEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserEditarActionPerformed
        int filaSeleccionada = jtUsers.getSelectedRow();

        if (filaSeleccionada != -1) {
            Long id = (Long) jtUsers.getValueAt(filaSeleccionada, 0);
            String dni = (String) jtUsers.getValueAt(filaSeleccionada, 1);
            Boolean estado = (Boolean) jtUsers.getValueAt(filaSeleccionada, 2);
            String fullName = (String) jtUsers.getValueAt(filaSeleccionada, 3);
            String password = (String) jtUsers.getValueAt(filaSeleccionada, 4);
            String typeUser = (String) jtUsers.getValueAt(filaSeleccionada, 5);
            String deLogin = (String) jtUsers.getValueAt(filaSeleccionada, 6);
            Boolean changePass = (Boolean) jtUsers.getValueAt(filaSeleccionada, 7);
            Boolean pdfUnico = (Boolean) jtUsers.getValueAt(filaSeleccionada, 8);

            UserDto2 userSelected = new UserDto2(id, dni, estado, fullName, password, typeUser, deLogin, changePass, pdfUnico);

            System.out.println("Usuario seleccionado: " + userSelected);
            UserView userView = new UserView(userSelected);
            userView.setVisible(true);
            userView.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para continuar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUserEditarActionPerformed

    private void btnUserConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserConsultarActionPerformed
        try {
            String ruc = txtUserRuc.getText();
            List<UserDto2> userList = CertifaktService.getUserList(ruc);
            Validation.validarString("Ruc", ruc);
            if(!userList.isEmpty()) {
                DefaultTableModel model = (DefaultTableModel) jtUsers.getModel();
                model.setRowCount(0);
                for (UserDto2 user : userList) {
                    Object[] fila = {user.getUserID(), user.getDni(), user.getEstado(), user.getFullName(), user.getPassword(), user.getTypeUser(), user.getDeLogin(),
                        user.getChangePass(), user.getPdfUnico()};
                    model.addRow(fila);
                }
            } else {
                DefaultTableModel model = (DefaultTableModel) jtUsers.getModel();
                model.setRowCount(0);
                lblUserError.setText("No existen usuarios asociados a la empresa en mención");
                JOptionPane.showMessageDialog(this, "No existen usuarios asociados a la empresa en mención: "+ruc,
                    "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            lblUserError.setText("Error en los datos: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            lblUserError.setText("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error al obtener los usuarios: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            lblUserError.setText("Error inesperado: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnUserConsultarActionPerformed

    private void btnAutoPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoPasteActionPerformed
        String texto = jtaToken.getText(); // Obtener texto del JTextField
        StringSelection stringSelection = new StringSelection(texto);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        btnAutoPaste.setText("Copiado");
    }//GEN-LAST:event_btnAutoPasteActionPerformed

    private void btnGenerarTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarTokenActionPerformed
        btnAutoPaste.setText("Copiar");
        try {
            Long userId = Long.valueOf(txtUserId.getText());
            Validation.validarString("Id de usuario",userId);

            Optional<String> optionalUserToken = CertifaktService.getUserToken(userId);
            if(optionalUserToken.isPresent()) {
                jtaToken.setText(optionalUserToken.get());
                lblTokenError.setText("");
            } else {
                lblTokenError.setText("No se pudo generar el token con id de usuario: "+userId);
                JOptionPane.showMessageDialog(this, "No se pudo generar token con id de usuario: "+userId,
                    "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            lblTokenError.setText("Error en los datos: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            lblTokenError.setText("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error al generar el token: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            lblTokenError.setText("Error inesperado: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarTokenActionPerformed

    private void btnGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiaActionPerformed
        try {
            SupportConsultRequest supportConsultRequest = new SupportConsultRequest();
            supportConsultRequest.setRucEmisor(txtGuiaRuc.getText());
            supportConsultRequest.setTipoComprobante(guiaMap.get((String) cmbGuiaTipo.getSelectedItem()));
            supportConsultRequest.setSerie(txtGuiaSerie.getText());
            supportConsultRequest.setNumero(txtGuiaNumero.getText().isEmpty() ? 0 : Integer.valueOf(txtGuiaNumero.getText().trim()));
            Validation.validarSolicitud(supportConsultRequest);

            Optional<GuiaDto> optionalGuiaDto = CertifaktService.getGuia(supportConsultRequest);
            if(optionalGuiaDto.isPresent()) {
                this.dispose();
                GuiaView guiaView = new GuiaView(optionalGuiaDto.get());
                guiaView.setVisible(true);
                guiaView.setLocationRelativeTo(null);
            } else {
                lblGuiaError.setText("No se encontró la guia "+supportConsultRequest.getSerie()+"-"+supportConsultRequest.getNumero());
                JOptionPane.showMessageDialog(this, "No se encontró la guia "+supportConsultRequest.getSerie()+"-"+supportConsultRequest.getNumero(),
                    "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IllegalArgumentException e) {
            lblGuiaError.setText("Error en los datos: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            lblGuiaError.setText("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error al obtener la guia: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            lblGuiaError.setText("Error inesperado: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuiaActionPerformed

    private void btnVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoucherActionPerformed
        try {
            SupportConsultRequest supportConsultRequest = new SupportConsultRequest();
            supportConsultRequest.setRucEmisor(txtComprobanteRucEmisor.getText().trim());
            supportConsultRequest.setTipoComprobante(comprobanteMap.get((String) cmbComprobanteTipo.getSelectedItem()));
            supportConsultRequest.setSerie(txtComprobanteSerie.getText().trim());
            supportConsultRequest.setNumero(txtComprobanteNumero.getText().isEmpty() ? 0 : Integer.valueOf(txtComprobanteNumero.getText().trim()));
            Validation.validarSolicitud(supportConsultRequest);

            Optional<PaymentVoucherDto> optionalPaymentVoucher = CertifaktService.getPaymentVoucher(supportConsultRequest);
            if(optionalPaymentVoucher.isPresent()) {
                this.dispose();
                PaymentVoucherView paymentVoucherView = new PaymentVoucherView(optionalPaymentVoucher.get());
                paymentVoucherView.setVisible(true);
                paymentVoucherView.setLocationRelativeTo(null);
            } else {
                lblCompanyError.setText("No se encontró el comprobante "+supportConsultRequest.getSerie()+"-"+supportConsultRequest.getNumero());
                JOptionPane.showMessageDialog(this, "No se encontró el comprobante "+supportConsultRequest.getSerie()+"-"+supportConsultRequest.getNumero(),
                    "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IllegalArgumentException e) {
            lblVoucherError.setText("Error en los datos: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            lblVoucherError.setText("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error al obtener el comprobante: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            lblVoucherError.setText("Error inesperado: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVoucherActionPerformed

    private void btnCompanyCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompanyCreateActionPerformed
        this.dispose();
        CreateCompanyView createCompanyView = new CreateCompanyView();
        createCompanyView.setVisible(true);
        createCompanyView.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCompanyCreateActionPerformed

    private void btnCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompanyActionPerformed
        try {
            Optional<CompanyDto> optionalCompany = CertifaktService.getCompany(txtCompanyRuc.getText());

            if (optionalCompany.isPresent()) {
                this.dispose();
                CompanyView companyView = new CompanyView(optionalCompany.get());
                companyView.setVisible(true);
                companyView.setLocationRelativeTo(null);
            } else {
                lblCompanyError.setText("La empresa con ruc: "+txtCompanyRuc.getText()+ " no esta registrado en certifakt");
                JOptionPane.showMessageDialog(this, "La empresa con ruc: "+txtCompanyRuc.getText()+ " no esta registrado en certifakt", "Información",
                    JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IllegalArgumentException e) {
            lblCompanyError.setText("Error en los datos: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            lblCompanyError.setText("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error al obtener la empresa: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            lblCompanyError.setText("Error inesperado: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCompanyActionPerformed

    private void btnConsultarDescargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDescargaActionPerformed
        txtLinks.setText("");
        try {
            Integer size = Integer.valueOf((String) cmbSize.getSelectedItem());
            System.out.println("SIZE: "+size);
            String desdeDay = (String) cbxDesdeDia.getSelectedItem();
            String desdeMonth = this.obtenerMes((String) cbxDesdeMes.getSelectedItem());
            String desdeYear = (String) cbxDesdeAño.getSelectedItem();
            
            String hastaDay = (String) cbxHastaDia.getSelectedItem();
            String hastaMonth = this.obtenerMes((String) cbxHastaMonth.getSelectedItem());
            String hastaYear = (String) cbxHastaYear.getSelectedItem();
            
            //Parameters
            String ruc = txtRucDescarga.getText();
            String fechaInicio = desdeYear+"-"+desdeMonth+"-"+desdeDay;
            String fechaFinal = hastaYear+"-"+hastaMonth+"-"+hastaDay;
            
            System.out.println("Fecha Inicio: "+fechaInicio);
            System.out.println("Fecha Final: "+fechaFinal);
            
            Validation.validarString("Ruc", ruc);
            
            Optional<InfoDownloadDto> optionalInfo = CertifaktService.consultDataToDownload(ruc, fechaInicio, fechaFinal, size);
            if(optionalInfo.isPresent()) {
                InfoDownloadDto info = optionalInfo.get();
                lblCliente.setText(info.getCliente());
                lblTotal.setText(String.valueOf(info.getTotal()));
                lblCantidad.setText(String.valueOf(info.getCantidad()));
                lblTotalDescargas.setText(String.valueOf(info.getTotalDescargas()));
                for (int i = 0; i < info.getLinksDescargas().size(); i++) {
                    txtLinks.append(info.getLinksDescargas().get(i) + "\n");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron datos del ruc: "+txtRucDescarga.getText()+ "", "Información",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IllegalArgumentException e) {  
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {    
            JOptionPane.showMessageDialog(this, "Error al obtener la data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarDescargaActionPerformed

    private void txtRucDescargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucDescargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucDescargaActionPerformed
    
    private String obtenerMes(String mes) {
        switch (mes) {
            case "Enero": return "01";
            case "Febrero": return "02";
            case "Marzo": return "03";
            case "Abril": return "04";
            case "Mayo": return "05";
            case "Junio": return "06";
            case "Julio": return "07";
            case "Agosto": return "08";
            case "Septiembre": return "09";
            case "Octubre": return "10";
            case "Noviembre": return "11";
            case "Diciembre": return "12";
            default: return "-1";
        }
    }
    
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
    private void cargarTabla() {
        DefaultTableModel model = (DefaultTableModel) jtUsers.getModel();
        String[] columnas = {"Id", "Dni", "Estado", "Nombre completo", "Contraseña", "T. Usuario", "Nombre de usuario", "C. Pass", "Pdf Unico"};
        for (String col : columnas) {
            model.addColumn(col);
        }
        int[] anchos = {50, 80, 80, 200, 150, 80, 250, 80, 80};

        for (int i = 0; i < columnas.length; i++) {
            jtUsers.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }
    
    public void limitarTextField(JTextField textField, int limite) {
    ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if ((fb.getDocument().getLength() + text.length() - length) <= limite) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        @Override
        public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
            if ((fb.getDocument().getLength() + text.length()) <= limite) {
                super.insertString(fb, offset, text, attr);
            }
        }
    });
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoPaste;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCompanies;
    private javax.swing.JButton btnCompany;
    private javax.swing.JButton btnCompanyCreate;
    private javax.swing.JButton btnConsultarDescarga;
    private javax.swing.JToggleButton btnDownloadPdf;
    private javax.swing.JButton btnGenerarToken;
    private javax.swing.JButton btnGuia;
    private javax.swing.JButton btnGuias;
    private javax.swing.JButton btnTokens;
    private javax.swing.JButton btnUserConsultar;
    private javax.swing.JButton btnUserEditar;
    private javax.swing.JToggleButton btnUsers;
    private javax.swing.JButton btnVoucher;
    private javax.swing.JButton btnVouchers;
    private javax.swing.JComboBox<String> cbxDesdeAño;
    private javax.swing.JComboBox<String> cbxDesdeDia;
    private javax.swing.JComboBox<String> cbxDesdeMes;
    private javax.swing.JComboBox<String> cbxHastaDia;
    private javax.swing.JComboBox<String> cbxHastaMonth;
    private javax.swing.JComboBox<String> cbxHastaYear;
    private javax.swing.JComboBox<String> cmbComprobanteTipo;
    private javax.swing.JComboBox<String> cmbGuiaTipo;
    private javax.swing.JComboBox<String> cmbSize;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpDownloads;
    private javax.swing.JPanel jpGuias;
    private javax.swing.JPanel jpTokens;
    private javax.swing.JPanel jpUsers;
    private javax.swing.JPanel jpVouchers;
    private javax.swing.JPanel jpÇlients;
    private javax.swing.JTable jtUsers;
    private javax.swing.JTextArea jtaToken;
    private javax.swing.JTabbedPane jtpMenu;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblCompanyError;
    private javax.swing.JLabel lblCompanyError1;
    private javax.swing.JLabel lblGuia;
    private javax.swing.JLabel lblGuia1;
    private javax.swing.JLabel lblGuiaError;
    private javax.swing.JLabel lblGuiaRuc;
    private javax.swing.JLabel lblGuiaSerieNumero;
    private javax.swing.JLabel lblGuiaTipo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTokenError;
    private javax.swing.JLabel lblTokens;
    private javax.swing.JLabel lblTokens1;
    private javax.swing.JLabel lblTokens2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalDescargas;
    private javax.swing.JLabel lblUserError;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JLabel lblUsers1;
    private javax.swing.JLabel lblVoucher1;
    private javax.swing.JLabel lblVoucherError;
    private javax.swing.JTextField txtCompanyRuc;
    private javax.swing.JTextField txtComprobanteNumero;
    private javax.swing.JTextField txtComprobanteRucEmisor;
    private javax.swing.JTextField txtComprobanteSerie;
    private javax.swing.JLabel txtEnvironment;
    private javax.swing.JTextField txtGuiaNumero;
    private javax.swing.JTextField txtGuiaRuc;
    private javax.swing.JTextField txtGuiaSerie;
    private javax.swing.JTextArea txtLinks;
    private javax.swing.JTextField txtRucDescarga;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserRuc;
    // End of variables declaration//GEN-END:variables
}
