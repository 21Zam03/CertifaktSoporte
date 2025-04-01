/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.certifakt.soporte.view;

import com.mycompany.certifakt.soporte.apiservice.CertifaktService;
import com.mycompany.certifakt.soporte.payload.request.GuiaRequest;
import com.mycompany.certifakt.soporte.payload.dto.GuiaDto;
import com.mycompany.certifakt.soporte.payload.response.SupportResponse;
import java.awt.Cursor;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class GuiaView extends javax.swing.JFrame {
    
    Map<String, String> tipoMap = new HashMap<>();
    private final Long guiaId;
    
    public GuiaView(GuiaDto guiaDto) {
        this.guiaId = guiaDto.getGuiaId();
        tipoMap.put("Guia de remision remitente", "09");
        tipoMap.put("Guia de remision transportista", "31");
        initComponents();
        loadImageIcon();
        this.setResizable(false);
        btnAtras.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        txtSerie.setEditable(false);
        txtNumero.setEditable(false);
        
        cmbTipo.addItem("Guia de remision remitente");
        cmbTipo.addItem("Guia de remision transportista");
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
        
        /*SETEAMOS LOS DATOS*/
        txtFechaEmision.setText(guiaDto.getFechaEmision());
        cmbTipo.setSelectedItem("09".equals(guiaDto.getTipoComprobante())? "Guia de remision remitente" : "Guia de remision transportista");
        txtSerie.setText(guiaDto.getSerie());
        txtNumero.setText(String.valueOf(guiaDto.getNumero()));
        txtNumeroRemitente.setText(guiaDto.getNumDocumIdentRemit());
        txtDenominacionRemitente.setText(guiaDto.getDenominacionRemit());
        txtNumeroReceptor.setText(guiaDto.getNumDocumIdentDestin());
        txtDenominacionReceptor.setText(guiaDto.getDenominacionDestin());
        txtPesoTotal.setText(String.valueOf(guiaDto.getPesoTotal()));
        cmbEstado.setSelectedItem(guiaDto.getEstado());
        cmbEstadoSunat.setSelectedItem(guiaDto.getEstadoSunat());
        txtCodigoRespuesta.setText(guiaDto.getCodigoRespuestaSunat());
        txtMensajeRespuesta.setText(guiaDto.getMensajeRespuesta());
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
        txtNumeroRemitente = new javax.swing.JTextField();
        txtPesoTotal = new javax.swing.JTextField();
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
        txtDenominacionRemitente = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblNumDocIdentReceptor1 = new javax.swing.JLabel();
        txtNumeroReceptor = new javax.swing.JTextField();
        lblNumDocIdentReceptor2 = new javax.swing.JLabel();
        txtDenominacionReceptor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensajeRespuesta = new javax.swing.JTextArea();
        jSeparator7 = new javax.swing.JSeparator();
        txtCodigoRespuesta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 100, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 100, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 270, -1));

        jLabel2.setText("Fecha Emisión:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 20));

        jPanel2.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 270, -1));

        jLabel3.setText("Tipo Comprobante:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 20));
        jPanel2.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 270, -1));
        jPanel2.add(txtNumeroRemitente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 270, -1));
        jPanel2.add(txtPesoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 280, -1));

        jPanel2.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 280, -1));

        jPanel2.add(cmbEstadoSunat, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 280, -1));

        lblSerie.setText("Serie:");
        jPanel2.add(lblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 20));

        jLabel5.setText("D. Remitente");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, 20));

        jLabel6.setText("Peso Total:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 120, 20));

        jLabel7.setText("Estado:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 120, 20));

        jLabel8.setText("Estado Sunat:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 120, 20));

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
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 960, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 960, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 960, 10));

        lblNumDocIdentReceptor.setText("D° Receptor");
        jPanel2.add(lblNumDocIdentReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 130, 20));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 960, 10));

        jLabel10.setText("Numero:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 20));
        jPanel2.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 270, -1));
        jPanel2.add(txtDenominacionRemitente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 270, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 960, 10));

        lblNumDocIdentReceptor1.setText("N° Remitente");
        jPanel2.add(lblNumDocIdentReceptor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, 20));
        jPanel2.add(txtNumeroReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 270, -1));

        lblNumDocIdentReceptor2.setText("N° Receptor");
        jPanel2.add(lblNumDocIdentReceptor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, 20));
        jPanel2.add(txtDenominacionReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 280, -1));

        jLabel1.setText("Codigo Sunat:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 130, -1));

        jLabel15.setText("Mensaje respuesta:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 130, -1));

        txtMensajeRespuesta.setColumns(20);
        txtMensajeRespuesta.setRows(5);
        jScrollPane1.setViewportView(txtMensajeRespuesta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 280, 60));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 960, 10));
        jPanel2.add(txtCodigoRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 280, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 960, 440));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("08: Anulado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 110, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("06: Error");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 140, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("05: Rechazado");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 140, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("02: Aceptado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 140, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("01: No enviado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 120, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            GuiaRequest guiaRequest = new GuiaRequest();
            guiaRequest.setGuiaId(guiaId);
            guiaRequest.setFechaEmision(txtFechaEmision.getText());
            guiaRequest.setTipoComprobante(String.valueOf(tipoMap.get(cmbTipo.getSelectedItem())));
            guiaRequest.setSerie(txtSerie.getText());
            guiaRequest.setNumero(Integer.valueOf(txtNumero.getText()));
            guiaRequest.setNumDocumIdentRemit(txtNumeroRemitente.getText());
            guiaRequest.setDenominacionRemit(txtDenominacionRemitente.getText());
            guiaRequest.setNumDocumIdentDestin(txtNumeroReceptor.getText());
            guiaRequest.setDenominacionDestin(txtDenominacionReceptor.getText());
            guiaRequest.setPesoTotal(Double.valueOf(txtPesoTotal.getText()));
            guiaRequest.setEstado(String.valueOf(cmbEstado.getSelectedItem()));
            guiaRequest.setEstadoSunat(String.valueOf(cmbEstadoSunat.getSelectedItem()));

            Optional<SupportResponse> optionalSupportResponse = CertifaktService.updateGuia(guiaRequest);
            
            if(optionalSupportResponse.isPresent()) {
                SupportResponse supportResponse = optionalSupportResponse.get();
                if(supportResponse.getIsSuccess() == true) {
                    JOptionPane.showMessageDialog(null, "Los datos se actualizaron correctamente.", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    WelcomeView welcomeView = new WelcomeView();
                    welcomeView.setVisible(true);
                    welcomeView.setLocationRelativeTo(null);
                } else {
                    JOptionPane.showMessageDialog(null, supportResponse.getMessage(), "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error en los datos ingresados: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar los datos de la guia: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblNumDocIdentReceptor;
    private javax.swing.JLabel lblNumDocIdentReceptor1;
    private javax.swing.JLabel lblNumDocIdentReceptor2;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JTextField txtCodigoRespuesta;
    private javax.swing.JTextField txtDenominacionReceptor;
    private javax.swing.JTextField txtDenominacionRemitente;
    private javax.swing.JTextField txtFechaEmision;
    private javax.swing.JTextArea txtMensajeRespuesta;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroReceptor;
    private javax.swing.JTextField txtNumeroRemitente;
    private javax.swing.JTextField txtPesoTotal;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
