package PANTALLAS;
import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
//import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.*;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Auditoria extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    DefaultTableModel modelo;
    CallableStatement cmd;
    private Date desde,hasta;
    GregorianCalendar hoy = new GregorianCalendar();
 
    public Auditoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hoy.add(Calendar.DAY_OF_YEAR, 0);
        jDateChooser_Desde.setMaxSelectableDate(hoy.getTime());
        this.jDateChooser_Hasta.setMaxSelectableDate(hoy.getTime());      
        this.setLocationRelativeTo(null); 
    }

  
    @SuppressWarnings("unchecked")int usuarioActual;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ComboBoxUsuarios = new javax.swing.JComboBox();
        ComboBoxTablas = new javax.swing.JComboBox();
        ComboBoxOperaciones = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser_Desde = new com.toedter.calendar.JDateChooser();
        jDateChooser_Hasta = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        buttonTaskFILTRARDatos = new org.edisoncor.gui.button.ButtonTask();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        buttonTaskCANCELAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskGenerarReporte = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AUDITORÍA");

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "BÚSQUEDAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        ComboBoxUsuarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR USUARIO" }));
        ComboBoxUsuarios.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                ComboBoxUsuariosPopupMenuWillBecomeVisible(evt);
            }
        });
        ComboBoxUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxUsuariosActionPerformed(evt);
            }
        });

        ComboBoxTablas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR TABLA" }));
        ComboBoxTablas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                ComboBoxTablasPopupMenuWillBecomeVisible(evt);
            }
        });
        ComboBoxTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTablasActionPerformed(evt);
            }
        });

        ComboBoxOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR OPERACION", "ALTA", "MODIFICACION", "BAJA" }));
        ComboBoxOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxOperacionesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tipo de Operación");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Tabla");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Desde");

        jDateChooser_Desde.setFocusable(false);
        jDateChooser_Desde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_DesdeMouseClicked(evt);
            }
        });

        jDateChooser_Hasta.setFocusable(false);
        jDateChooser_Hasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_HastaMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Hasta");

        jCheckBox1.setBackground(new java.awt.Color(141, 141, 175));
        jCheckBox1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jCheckBox1.setText("Ver Todos");
        jCheckBox1.setBorder(null);
        jCheckBox1.setBorderPainted(true);
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        buttonTaskFILTRARDatos.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskFILTRARDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/guardar-la-aplicacion-de-busqueda-x-icono-9699-32.png"))); // NOI18N
        buttonTaskFILTRARDatos.setText("FILTRAR DATOS");
        buttonTaskFILTRARDatos.setCategoryFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonTaskFILTRARDatos.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskFILTRARDatos.setDefaultCapable(false);
        buttonTaskFILTRARDatos.setDescription("..");
        buttonTaskFILTRARDatos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        buttonTaskFILTRARDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskFILTRARDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jDateChooser_Desde, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addComponent(ComboBoxUsuarios, 0, 209, Short.MAX_VALUE)
                    .addComponent(ComboBoxOperaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBoxTablas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addComponent(buttonTaskFILTRARDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jDateChooser_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jDateChooser_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(buttonTaskFILTRARDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(14, 14, 14))
        );

        jPanel4.setBackground(new java.awt.Color(141, 141, 175));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "LISTA DE OPERACIONES REALIZADAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Usuario", "Tabla", "Tipo de Operación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAMouseClicked(evt);
            }
        });
        TABLA.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                TABLAComponentMoved(evt);
            }
        });
        jScrollPane3.setViewportView(TABLA);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );

        buttonTaskCANCELAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskCANCELAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/rescindir-rojo-icono-6989-32.png"))); // NOI18N
        buttonTaskCANCELAR.setText("CANCELAR");
        buttonTaskCANCELAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskCANCELAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskCANCELAR.setDefaultCapable(false);
        buttonTaskCANCELAR.setDescription("..");
        buttonTaskCANCELAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskCANCELARActionPerformed(evt);
            }
        });

        buttonTaskGenerarReporte.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/kde-archivo-txt-icono-7701-48.png"))); // NOI18N
        buttonTaskGenerarReporte.setText("GENERAR REPORTE");
        buttonTaskGenerarReporte.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskGenerarReporte.setDefaultCapable(false);
        buttonTaskGenerarReporte.setDescription("..");
        buttonTaskGenerarReporte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskGenerarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(buttonTaskGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(buttonTaskCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTaskGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String usuarioCapturado,TablaCapturada,Operacioncapturada;
    private void ComboBoxUsuariosPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ComboBoxUsuariosPopupMenuWillBecomeVisible
        LlenarComboUsuarios();
    }//GEN-LAST:event_ComboBoxUsuariosPopupMenuWillBecomeVisible

    private void ComboBoxUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxUsuariosActionPerformed
    
    }//GEN-LAST:event_ComboBoxUsuariosActionPerformed

    private void ComboBoxTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTablasActionPerformed
    
    }//GEN-LAST:event_ComboBoxTablasActionPerformed

    private void ComboBoxOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxOperacionesActionPerformed

    }//GEN-LAST:event_ComboBoxOperacionesActionPerformed

    private void jDateChooser_DesdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_DesdeMouseClicked
        // TODO add your handling code here:
        GregorianCalendar dia = new GregorianCalendar();
        dia.setTime(desde);
        dia.add(Calendar.DAY_OF_YEAR, 1);
        jDateChooser_Desde.setDateFormatString("dd/MM/yyyy");
        jDateChooser_Desde.setMinSelectableDate(dia.getTime());
    }//GEN-LAST:event_jDateChooser_DesdeMouseClicked

    private void jDateChooser_HastaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_HastaMouseClicked
        GregorianCalendar dia = new GregorianCalendar();
        dia.setTime(hasta);
        dia.add(Calendar.DAY_OF_YEAR, 1);
        jDateChooser_Hasta.setMinSelectableDate(dia.getTime());
    }//GEN-LAST:event_jDateChooser_HastaMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(this.jCheckBox1.isSelected()){
            MostrarTodos();
        }else{
            limpiarTabla(TABLA);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void buttonTaskFILTRARDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskFILTRARDatosActionPerformed
    Operacioncapturada = ComboBoxOperaciones.getSelectedItem().toString();
    TablaCapturada = ComboBoxTablas.getSelectedItem().toString();
    usuarioCapturado = ComboBoxUsuarios.getSelectedItem().toString();

    if((jDateChooser_Desde.getDate()==null & jDateChooser_Hasta.getDate()==null)){
        if(Operacioncapturada.equals("Seleccione Tipo de Operación") & usuarioCapturado.equals("") & TablaCapturada.equals("Seleccione Tabla")){
            JOptionPane.showMessageDialog(null, "Debe Seleccionar alguno de los Tipos de Búsqueda", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    if((jDateChooser_Desde.getDate()==null & jDateChooser_Hasta.getDate()==null)){
        if (!Operacioncapturada.equals("SELECCIONAR OPERACION") & usuarioCapturado.equals("SELECCIONAR USUARIO") & TablaCapturada.equals("SELECCIONAR TABLA")) {
            ListarOperaciones(Operacioncapturada);
        }else if (Operacioncapturada.equals("SELECCIONAR OPERACION") & usuarioCapturado.equals("SELECCIONAR USUARIO") & !TablaCapturada.equals("SELECCIONAR TABLA")) {
            ListarTablas(TablaCapturada);
        }else if (Operacioncapturada.equals("SELECCIONAR OPERACION") & !usuarioCapturado.equals("SELECCIONAR USUARIO") & TablaCapturada.equals("SELECCIONAR TABLA")) {
            ListarUsuarios(usuarioCapturado);
        }else if (!Operacioncapturada.equals("SELECCIONAR OPERACION") & !usuarioCapturado.equals("SELECCIONAR USUARIO") & TablaCapturada.equals("SELECCIONAR TABLA")) {
            ListarOperacionxUsuario(Operacioncapturada,usuarioCapturado);
        }else if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & usuarioCapturado.equals("SELECCIONAR USUARIO") & !TablaCapturada.equals("SELECCIONAR TABLA")){
            ListarOperacionesxTabla(Operacioncapturada,TablaCapturada);
        }else if(Operacioncapturada.equals("SELECCIONAR OPERACION") & !usuarioCapturado.equals("SELECCIONAR USUARIO") & !TablaCapturada.equals("SELECCIONAR TABLA")){
            ListarUsuariosxTabla(usuarioCapturado,TablaCapturada);
        }else if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & !usuarioCapturado.equals("SELECCIONAR USUARIO") & !TablaCapturada.equals("SELECCIONAR TABLA")){
            ListarxOperacionUsuarioyTabla(Operacioncapturada,usuarioCapturado,TablaCapturada);
        }
    }else{
            String formato = "yyyy/MM/dd";
            desde=new Date( this.jDateChooser_Desde.getDate().getYear(), jDateChooser_Desde.getDate().getMonth(),jDateChooser_Desde.getDate().getDate() );
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String d = sdf.format(desde);

            hasta=new Date( jDateChooser_Hasta.getDate().getYear(), jDateChooser_Hasta.getDate().getMonth(),jDateChooser_Hasta.getDate().getDate() );
            String h = sdf.format(hasta);

            if (!Operacioncapturada.equals("SELECCIONAR OPERACION")& !usuarioCapturado.equals("SELECCIONAR USUARIO") & !TablaCapturada.equals("SELECCIONAR TABLA")) {
                ListarDatosxCriterios(d,h,Operacioncapturada,usuarioCapturado,TablaCapturada);    //este toque el codigo...probarlo!!
            }else if (Operacioncapturada.equals("SELECCIONAR OPERACION") & usuarioCapturado.equals("SELECCIONAR USUARIO") & TablaCapturada.equals("SELECCIONAR TABLA")) {
                ListarDatosxFechas(d, h);
            }else if (!Operacioncapturada.equals("SELECCIONAR OPERACION") & usuarioCapturado.equals("SELECCIONAR USUARIO") & TablaCapturada.equals("SELECCIONAR TABLA")) {
                ListarDatosOperacionesxFechas(Operacioncapturada, d, h);
            }else if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & !usuarioCapturado.equals("SELECCIONAR USUARIO") & TablaCapturada.equals("SELECCIONAR TABLA")){
                ListarOperacionesxUsuarioentreFechas(d,h,Operacioncapturada,usuarioCapturado);
            }else if(Operacioncapturada.equals("SELECCIONAR OPERACION") & !usuarioCapturado.equals("SELECCIONAR USUARIO") & !TablaCapturada.equals("SELECCIONAR TABLA")){
                ListarUsuarioxFechas(d,h,usuarioCapturado);
            }else if(Operacioncapturada.equals("SELECCIONAR OPERACION") & !usuarioCapturado.equals("SELECCIONAR USUARIO") & !TablaCapturada.equals("SELECCIONAR TABLA")){
                ListarUsuariosxTabla(d,h,usuarioCapturado,TablaCapturada);
            }else if(Operacioncapturada.equals("SELECCIONAR OPERACION") & usuarioCapturado.equals("SELECCIONAR USUARIO") & !TablaCapturada.equals("SELECCIONAR TABLA")){
                ListarTablaxFechas(d,h,TablaCapturada);
            }else if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & usuarioCapturado.equals("SELECCIONAR USUARIO") & !TablaCapturada.equals("SELECCIONAR TABLA")){
                ListarOperacionyTablaxFechas(d,h,Operacioncapturada,TablaCapturada);
            }
        }
    }//GEN-LAST:event_buttonTaskFILTRARDatosActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        
    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TABLAComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLAComponentMoved

    private void buttonTaskCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskCANCELARActionPerformed
        dispose();
    }//GEN-LAST:event_buttonTaskCANCELARActionPerformed

    private void buttonTaskGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskGenerarReporteActionPerformed
    Operacioncapturada = ComboBoxOperaciones.getSelectedItem().toString();
    TablaCapturada = ComboBoxTablas.getSelectedItem().toString();
    usuarioCapturado = ComboBoxUsuarios.getSelectedItem().toString();
    BuscarUsuario();
    BuscarDatosClinica();
    if(jDateChooser_Desde.getDate()==null & jDateChooser_Hasta.getDate()==null & Operacioncapturada.equals("SELECCIONAR OPERACION") & TablaCapturada.equals("SELECCIONAR TABLA") & usuarioCapturado.equals("SELECCIONAR USUARIO")){
         ReporteGral();            
         }else if(jDateChooser_Desde.getDate()!=null & jDateChooser_Hasta.getDate()!=null){
            String formato = "yyyy/MM/dd";
            desde=new Date( this.jDateChooser_Desde.getDate().getYear(), jDateChooser_Desde.getDate().getMonth(),jDateChooser_Desde.getDate().getDate() );
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String d = sdf.format(desde);

            hasta=new Date( jDateChooser_Hasta.getDate().getYear(), jDateChooser_Hasta.getDate().getMonth(),jDateChooser_Hasta.getDate().getDate() );
            String h = sdf.format(hasta);

            if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & !TablaCapturada.equals("SELECCIONAR TABLA") & !usuarioCapturado.equals("SELECCIONAR USUARIO")){
                Reporte_AuditoriaxTodos(d,h,Operacioncapturada,TablaCapturada,usuarioCapturado,USUARIOACTUAL,clinica,imagen);
            }else if(Operacioncapturada.equals("SELECCIONAR OPERACION") & TablaCapturada.equals("SELECCIONAR TABLA") & usuarioCapturado.equals("SELECCIONAR USUARIO")){
                GenerarReportexFechas(d,h,USUARIOACTUAL,clinica,imagen);
            }else if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & TablaCapturada.equals("SELECCIONAR TABLA") & usuarioCapturado.equals("SELECCIONAR USUARIO")){
                Reporte_AuditoriaxFechasyOperacion(d,h,Operacioncapturada,USUARIOACTUAL,clinica,imagen);
            }else if(Operacioncapturada.equals("SELECCIONAR OPERACION") & !TablaCapturada.equals("SELECCIONAR TABLA") & usuarioCapturado.equals("SELECCIONAR USUARIO")){
                Reporte_AuditoriaxFechasyTabla(d,h,TablaCapturada,USUARIOACTUAL,clinica,imagen);
            }else if(Operacioncapturada.equals("SELECCIONAR OPERACION") & TablaCapturada.equals("SELECCIONAR TABLA") & !usuarioCapturado.equals("SELECCIONAR USUARIO")){
                Reporte_AuditoriaxFechasyUsuario(d,h,usuarioCapturado,USUARIOACTUAL,clinica,imagen);
            }else if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & !TablaCapturada.equals("SELECCIONAR TABLA") & usuarioCapturado.equals("SELECCIONAR USUARIO")){
                Reporte_AuditoriaFechasxOperacionyTabla(d,h,Operacioncapturada,TablaCapturada,USUARIOACTUAL,clinica,imagen);
            }else if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & TablaCapturada.equals("SELECCIONAR TABLA") & !usuarioCapturado.equals("SELECCIONAR USUARIO")){
                Reporte_AuditoriaFechasxOperacionyUsuario(d,h,Operacioncapturada,usuarioCapturado,USUARIOACTUAL,clinica,imagen);
            }else if(Operacioncapturada.equals("SELECCIONAR OPERACION") & !TablaCapturada.equals("SELECCIONAR TABLA") & !usuarioCapturado.equals("SELECCIONAR USUARIO")){
                Reporte_AuditoriaFechasxTablayUsuario(d,h,TablaCapturada,usuarioCapturado,USUARIOACTUAL,clinica,imagen);
            }
        }else if(jDateChooser_Desde.getDate()==null & jDateChooser_Hasta.getDate()==null){
            if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & !TablaCapturada.equals("SELECCIONAR TABLA") & !usuarioCapturado.equals("SELECCIONAR USUARIO")){
                ReporteAuditoriaxOperacionyTablayUsuario(Operacioncapturada,TablaCapturada,usuarioCapturado,USUARIOACTUAL,clinica,imagen);
            }else if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & !TablaCapturada.equals("SELECCIONAR TABLA") & usuarioCapturado.equals("SELECCIONAR USUARIO")){
                ReporteAuditoriaxOperacionyTabla(Operacioncapturada,TablaCapturada,USUARIOACTUAL,clinica,imagen);
            }else if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & TablaCapturada.equals("SELECCIONAR TABLA") & !usuarioCapturado.equals("SELECCIONAR USUARIO")){
                ReporteAuditoriaxOperacionyUsuario(Operacioncapturada,usuarioCapturado,USUARIOACTUAL,clinica,imagen);
            }else if(Operacioncapturada.equals("SELECCIONAR OPERACION") & !TablaCapturada.equals("SELECCIONAR TABLA") & !usuarioCapturado.equals("SELECCIONAR USUARIO")){
                ReporteAuditoriaxTablayUsuario(TablaCapturada,usuarioCapturado,USUARIOACTUAL,clinica,imagen);
            }else if(!Operacioncapturada.equals("SELECCIONAR OPERACION") & TablaCapturada.equals("SELECCIONAR TABLA") & usuarioCapturado.equals("SELECCIONAR USUARIO")){
                GenerarReportexOperacion(Operacioncapturada,USUARIOACTUAL,clinica,imagen);
            }else if(Operacioncapturada.equals("SELECCIONAR OPERACION") & !TablaCapturada.equals("SELECCIONAR TABLA") & usuarioCapturado.equals("SELECCIONAR USUARIO")){
                GenerarReportexTabla(TablaCapturada,USUARIOACTUAL,clinica,imagen);
            }else if(Operacioncapturada.equals("SELECCIONAR OPERACION") & TablaCapturada.equals("SELECCIONAR TABLA") & !usuarioCapturado.equals("SELECCIONAR USUARIO")){
                GenerarReportexUsuario(usuarioCapturado,USUARIOACTUAL,clinica,imagen);
            }
        }
    this.dispose();
    }//GEN-LAST:event_buttonTaskGenerarReporteActionPerformed

    private void ComboBoxTablasPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ComboBoxTablasPopupMenuWillBecomeVisible
         LlenarComboTablas();
    }//GEN-LAST:event_ComboBoxTablasPopupMenuWillBecomeVisible

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Auditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Auditoria dialog = new Auditoria(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox ComboBoxOperaciones;
    public javax.swing.JComboBox ComboBoxTablas;
    public javax.swing.JComboBox ComboBoxUsuarios;
    private javax.swing.JTable TABLA;
    private org.edisoncor.gui.button.ButtonTask buttonTaskCANCELAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskFILTRARDatos;
    public org.edisoncor.gui.button.ButtonTask buttonTaskGenerarReporte;
    public javax.swing.JCheckBox jCheckBox1;
    public com.toedter.calendar.JDateChooser jDateChooser_Desde;
    public com.toedter.calendar.JDateChooser jDateChooser_Hasta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

private void LlenarComboUsuarios() {
        try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT usuario FROM usuarios");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("usuario"));
            }
            rs.close();
            ComboBoxUsuarios.setModel(modeloCombo);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

  
    private void LlenarComboTablas() {
        try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT tipotabla FROM auditoria");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("tipotabla"));
            }
            rs.close();
            ComboBoxTablas.setModel(modeloCombo);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    private void LlenarComboOperaciones() {
        try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT tipooperacion FROM auditoria");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("tipooperacion"));
            }
            rs.close();
            this.ComboBoxOperaciones.setModel(modeloCombo);
            ComboBoxOperaciones.getModel().setSelectedItem("Seleccione");            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
    
     private void ListarUsuarios(String captura) {
        String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE usuario LIKE '"+captura+"%'";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void limpiarTabla(JTable tab) {
        while(tab.getRowCount()>0){//se recorren todas las filas
         ((DefaultTableModel) TABLA.getModel()).removeRow(0);
       }
    }

    private void ListarTablas(String captura) {
        String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE tipotabla LIKE '"+captura+"%'";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void ListarOperaciones(String captura) {
        String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE tipooperacion LIKE '"+captura+"%'";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void ListarDatosxCriterios(String desde,String hasta, String Operacioncapturada, String usuarioCapturado, String TablaCapturada) {
        String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+desde+"%' AND '"+hasta+"%' AND tipooperacion LIKE '"+Operacioncapturada+"%' AND usuario LIKE '"+usuarioCapturado+"%' AND tipotabla LIKE '"+TablaCapturada+"%' ORDER BY usuario ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void ListarDatosxFechas(String d, String h) {
        String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' ORDER BY fecha ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void ListarDatosOperacionesxFechas(String Operacioncapturada, String d, String h) {
        String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE tipooperacion LIKE '"+Operacioncapturada+"%' AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' ORDER BY tipooperacion ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void ListarOperacionxUsuario(String Operacioncapturada, String usuarioCapturado) {
        String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE tipooperacion LIKE '"+Operacioncapturada+"%' AND usuario LIKE '"+usuarioCapturado+"%' ORDER BY usuario ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void ListarOperacionesxTabla(String Operacioncapturada, String TablaCapturada) {
         String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE tipooperacion LIKE '"+Operacioncapturada+"%' AND tipotabla LIKE '"+TablaCapturada+"%' ORDER BY tipotabla ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void ListarUsuarioxFechas(String d, String h, String usuarioCapturado) {
        String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE usuario LIKE '"+usuarioCapturado+"%' AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' ORDER BY usuario ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void ListarUsuariosxTabla(String usuarioCapturado, String TablaCapturada) {
         String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE usuario LIKE '"+usuarioCapturado+"%' AND tipotabla LIKE '"+TablaCapturada+"%' ORDER BY tipotabla ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void ListarOperacionesxUsuarioentreFechas(String d, String h, String Operacioncapturada, String usuarioCapturado) {
        String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE usuario LIKE '"+usuarioCapturado+"%' AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND tipooperacion LIKE '"+Operacioncapturada+"%' ORDER BY usuario ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void MostrarTodos() {
        String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria ORDER BY fecha ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }
    
private void ListarUsuariosxTabla(String d, String h, String usuarioCapturado, String TablaCapturada) {
   String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE usuario LIKE '"+usuarioCapturado+"%' AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND tipotabla LIKE '"+TablaCapturada+"%' ORDER BY usuario ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }     
    }
    
private void ListarTablaxFechas(String d, String h, String TablaCapturada) {
   String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND tipotabla LIKE '"+TablaCapturada+"%' ORDER BY usuario ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }  
    }

 private void ListarOperacionyTablaxFechas(String d, String h, String Operacioncapturada, String TablaCapturada) {
     String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[5];
        sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND tipotabla LIKE '"+TablaCapturada+"%' AND tipooperacion LIKE '"+Operacioncapturada+"%' ORDER BY usuario ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("hora");
               registro[2]=rs.getString("usuario");
               registro[3]=rs.getString("tipotabla");
               registro[4]=rs.getString("tipooperacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
               }
            
                TABLA.setModel(modelo);  
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }     
    }

 
private void ListarxOperacionUsuarioyTabla(String Operacioncapturada, String usuarioCapturado, String TablaCapturada) {
    String[] titulos = {"Fecha","Hora","Usuario","Tabla","Tipo de Operación"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    String sSQL = "";
    String[] registro = new String[5];
    sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,hora,usuario,tipotabla,tipooperacion FROM auditoria WHERE usuario LIKE '"+usuarioCapturado+"%' AND tipotabla LIKE '"+TablaCapturada+"%' AND tipooperacion LIKE '"+Operacioncapturada+"%' ORDER BY usuario ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        while(rs.next())
           {
           registro[0]=rs.getString("fecha");
           registro[1]=rs.getString("hora");
           registro[2]=rs.getString("usuario");
           registro[3]=rs.getString("tipotabla");
           registro[4]=rs.getString("tipooperacion");
           modelo.addRow(registro);
           limpiarTabla(TABLA); 
           }

            TABLA.setModel(modelo);  
        }
    catch (SQLException ex)
       {
        JOptionPane.showMessageDialog(null, ex);
       }      
}
 
////////// REPORTES.....
 
 
private void Reporte_AuditoriaxTodos(String desde, String hasta, String operacion, String tabla, String usuario,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
       try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteAuditoriaTodosCriterios.jasper";
//            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("desde",desde);
             parametro.put("hasta",hasta);
             parametro.put("operacion",operacion);
             parametro.put("tabla", tabla);
             parametro.put("usuario",usuario);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
  
   private void Reporte_AuditoriaxFechasyOperacion(String desde, String hasta, String operacion,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
        try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteFechasxOperacion.jasper";
//            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("desde",desde);
             parametro.put("hasta",hasta);
             parametro.put("operacion",operacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }  
    }
   
 private void Reporte_AuditoriaxFechasyTabla(String desde, String hasta, String tabla,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
       try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteFechasxTabla.jasper";
//            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("desde",desde);
             parametro.put("hasta",hasta);
             parametro.put("tabla",tabla);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }  
    }
 
  private void Reporte_AuditoriaxFechasyUsuario(String desde, String hasta, String usuario,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
        try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteFechasxUsuario.jasper";
//            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("desde",desde);
             parametro.put("hasta",hasta);
             parametro.put("usuario",usuario);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
  
   private void Reporte_AuditoriaFechasxOperacionyTabla(String desde,String hasta, String operacion, String tabla,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
          try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/Reporte_AuditoriaxOperacionyTablaentreFechas.jasper";
//            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("desde",desde);
             parametro.put("hasta",hasta);             
             parametro.put("tabla",tabla);
             parametro.put("operacion",operacion);      
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
   
    private void Reporte_AuditoriaFechasxOperacionyUsuario(String desde,String hasta, String operacion, String usuario,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
       try {           
            String ubicacion=System.getProperty("user.dir")+"/src/Reportes/ReporteFechasOpUsu.jasper";
//            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("desde",desde);
             parametro.put("hasta",hasta);
             parametro.put("operacion",operacion);
             parametro.put("usuario",usuario);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    private void Reporte_AuditoriaFechasxTablayUsuario(String desde, String hasta, String tabla, String usuario,String USUARIOACTUAL,String CLINICA, String IMAGEN) {
           try {           
            String ubicacion=System.getProperty("user.dir")+"/src/Reportes/Reporte_AuditoriaxTablayUsuarioentreFechas.jasper";
//            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("desde",desde);
             parametro.put("hasta",hasta);
             parametro.put("tabla",tabla);
             parametro.put("usuario",usuario);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    private void ReporteAuditoriaxOperacionyTablayUsuario(String operacion, String tabla, String usuario,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
             try {           
            String ubicacion=System.getProperty("user.dir")+"/src/Reportes/Reporte_AuditoriaxOperacionyTablayUsuario.jasper";
//            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("operacion",operacion);
             parametro.put("tabla", tabla);
             parametro.put("usuario",usuario);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }       
    }

    private void ReporteAuditoriaxOperacionyTabla(String operacion, String tabla,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
           try {           
            String ubicacion=System.getProperty("user.dir")+"/src/Reportes/Reporte_AuditoriaxOperacionyTabla.jasper";
//            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("operacion",operacion);
             parametro.put("tabla",tabla);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    private void ReporteAuditoriaxOperacionyUsuario(String operacion,String usuario,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
           try {           
             String ubicacion=System.getProperty("user.dir")+"/src/Reportes/Reporte_AuditoriaxOperacionyUsuario.jasper";
//             JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("operacion",operacion);
             parametro.put("usuario",usuario);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    private void ReporteAuditoriaxTablayUsuario(String tabla, String usuario,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
           try {           
            String ubicacion=System.getProperty("user.dir")+"/src/Reportes/Reporte_AuditoriaxTablayUsuario.jasper";
//            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("tabla",tabla);
             parametro.put("usuario",usuario);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

   private void GenerarReportexOperacion(String operacion,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
        try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/Reporte_AuditoriaxOperacion.jasper";
//            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("operacion",operacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(ubicacion,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void GenerarReportexTabla(String tabla,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
         try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReportexTabla.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
             
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("tabla",tabla);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void GenerarReportexFechas(String desde,String hasta,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
          try {           
            String ubicacion=System.getProperty("user.dir")+"/src/Reportes/ReporteFechas.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("desde",desde);
             parametro.put("hasta",hasta);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void GenerarReportexUsuario(String usuario,String USUARIOACTUAL,String CLINICA,String IMAGEN) {
         try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReportexUsuario.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("usuario",usuario);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",CLINICA);
             parametro.put("IMAGEN",IMAGEN);
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }     

    private void ReporteGral() {
       try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteGral.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             parametro.put("CLINICA",clinica);
             parametro.put("IMAGEN",imagen);
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

  String USUARIOACTUAL; 
  private void BuscarUsuario(){
     cn=cm.Conectar();
     String   sSQL = "SELECT usuario FROM usuarios WHERE id="+usuarioActual;
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
            {
               USUARIOACTUAL=rs.getString("usuario");      
            }
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

  String imagen,clinica;
    private void BuscarDatosClinica() {
     cn=cm.Conectar();
     String   sSQL = "SELECT nombre,direimagen FROM logoclinica";
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
            {
               clinica=rs.getString("nombre");  
               imagen=rs.getString("direimagen");
            }
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }  
    }
    
}
