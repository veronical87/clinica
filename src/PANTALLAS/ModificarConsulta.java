package PANTALLAS;

import CLASES.JCMail;
import CLASES.ClaseOperaciones;
import CLASES.ClaseFichasMedicas;
import CLASES.ClaseVacunas;
import CLASES.HILOS;
import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ModificarConsulta extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
     private java.util.Date desde,hasta;
    CallableStatement cmd,cmd2;
    ClaseOperaciones consulta=new ClaseOperaciones();
    ClaseFichasMedicas ficha=new ClaseFichasMedicas();
    Calendar Calendario = Calendar.getInstance();  
    DefaultTableModel modelo;
    JCMail mail = new JCMail();
    GregorianCalendar hoy = new GregorianCalendar(); 
    ClaseVacunas vacuna=new ClaseVacunas();
    public ModificarConsulta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); 
        buttonTaskQUITAR.setVisible(false);
        jLabelVETERINARIO.setVisible(false);         
        buttonActionVERIFICAR.setEnabled(false);
        this.jDateChooserFECHATURNO.setMaxSelectableDate(hoy.getTime()); 
//        this.jSpinnerHORA.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jLabelVETERINARIO = new javax.swing.JLabel();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonActionCANCELAR = new org.edisoncor.gui.button.ButtonAction();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelTiempoDespar = new javax.swing.JLabel();
        jLabelOpcionDespar = new javax.swing.JLabel();
        jLabelTiempoDespar1 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableVACUNAS = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaALERGIAS = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTablePENDIENTES = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabelProximaDESPAR = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelEspecie = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabelSituacionPeso = new javax.swing.JLabel();
        jLabelEdad1 = new javax.swing.JLabel();
        jLabelPesoActual = new javax.swing.JLabel();
        jLabelPesoActual1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelRaza = new javax.swing.JLabel();
        jLabelPesoActual2 = new javax.swing.JLabel();
        jLabelSEXO = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelMASCOTA = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxMEDICAMENTOS = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jSpinnerCantMedicamento = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        buttonTaskQUITAR = new org.edisoncor.gui.button.ButtonTask();
        jComboBoxCATEGORIAS = new javax.swing.JComboBox();
        jLabelCantiACTUAL = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        buttonTaskAGREGAR = new org.edisoncor.gui.button.ButtonTask();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCOMPOSICION = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTIPOCONSULTA = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDIAGNOSTICO = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jDateChooserFECHATURNO = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttonActionVERIFICAR = new org.edisoncor.gui.button.ButtonAction();
        jComboBoxHORA = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabelDUEÑO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MODIFICAR CONSULTA");

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTAS");

        jLabelVETERINARIO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelVETERINARIO.setForeground(new java.awt.Color(153, 0, 0));
        jLabelVETERINARIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVETERINARIO.setText("jLabel4");

        buttonActionGUARDAR.setText("GUARDAR");
        buttonActionGUARDAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionGUARDAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonActionGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionGUARDARActionPerformed(evt);
            }
        });

        buttonActionCANCELAR.setText("CANCELAR");
        buttonActionCANCELAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionCANCELAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonActionCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionCANCELARActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(141, 141, 175));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DE LA MASCOTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 300));

        jPanel6.setBackground(new java.awt.Color(141, 141, 175));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "LISTADO DE VACUNAS COLOCADAS y/o  DESPARASITACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Desparasitado");

        jLabelTiempoDespar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTiempoDespar.setForeground(new java.awt.Color(153, 0, 0));
        jLabelTiempoDespar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTiempoDespar.setOpaque(true);

        jLabelOpcionDespar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelOpcionDespar.setForeground(new java.awt.Color(153, 0, 0));
        jLabelOpcionDespar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOpcionDespar.setOpaque(true);

        jLabelTiempoDespar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTiempoDespar1.setText("Fecha");

        jTableVACUNAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Vacuna"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVACUNAS.setEnabled(false);
        jTableVACUNAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVACUNASMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTableVACUNAS);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelTiempoDespar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTiempoDespar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(42, 42, 42)
                        .addComponent(jLabelOpcionDespar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOpcionDespar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTiempoDespar1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTiempoDespar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(141, 141, 175));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ALERGIAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTextAreaALERGIAS.setEditable(false);
        jTextAreaALERGIAS.setColumns(20);
        jTextAreaALERGIAS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextAreaALERGIAS.setRows(5);
        jTextAreaALERGIAS.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaALERGIAS.setEnabled(false);
        jScrollPane7.setViewportView(jTextAreaALERGIAS);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(141, 141, 175));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "LISTADO VACUNAS PENDIENTES y/o DESPARASITACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTablePENDIENTES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vacuna", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePENDIENTES.setEnabled(false);
        jTablePENDIENTES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePENDIENTESMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTablePENDIENTES);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Prox. Desparasitación");

        jLabelProximaDESPAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelProximaDESPAR.setForeground(new java.awt.Color(153, 0, 0));
        jLabelProximaDESPAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProximaDESPAR.setOpaque(true);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelProximaDESPAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabelProximaDESPAR, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(141, 141, 175));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "DATOS DE LA MASCOTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Edad");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Especie");

        jLabelEdad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEdad.setOpaque(true);

        jLabelEspecie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspecie.setOpaque(true);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Peso Actual");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Situación Peso");

        jLabelSituacionPeso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSituacionPeso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSituacionPeso.setOpaque(true);

        jLabelEdad1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEdad1.setOpaque(true);

        jLabelPesoActual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPesoActual.setOpaque(true);

        jLabelPesoActual1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPesoActual1.setText("Kilos");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Raza");

        jLabelRaza.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRaza.setOpaque(true);

        jLabelPesoActual2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPesoActual2.setText("Sexo");

        jLabelSEXO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSEXO.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelPesoActual2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPesoActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabelEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSituacionPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEdad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelSEXO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPesoActual2)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPesoActual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelSituacionPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Seleccione una Mascota(*)");

        jLabelMASCOTA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMASCOTA.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(jLabelMASCOTA, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(jLabelMASCOTA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(141, 141, 175));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "MEDICAMENTOS A RECETAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel5.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Categoría");

        jComboBoxMEDICAMENTOS.setEditable(true);
        jComboBoxMEDICAMENTOS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxMEDICAMENTOS.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxMEDICAMENTOSPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxMEDICAMENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMEDICAMENTOSActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Cant.Actual");

        jSpinnerCantMedicamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSpinnerCantMedicamento.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinnerCantMedicamento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jSpinnerCantMedicamentoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jSpinnerCantMedicamento.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCantMedicamentoStateChanged(evt);
            }
        });
        jSpinnerCantMedicamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jSpinnerCantMedicamentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jSpinnerCantMedicamentoFocusLost(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(141, 141, 175));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "LISTA DE MEDICAMENTOS A RECETAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoría", "Medicamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        buttonTaskQUITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/eliminar-icono-6226-32.png"))); // NOI18N
        buttonTaskQUITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskQUITARActionPerformed(evt);
            }
        });

        jComboBoxCATEGORIAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxCATEGORIAS.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxCATEGORIASPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxCATEGORIAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCATEGORIASActionPerformed(evt);
            }
        });

        jLabelCantiACTUAL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCantiACTUAL.setForeground(new java.awt.Color(153, 0, 0));
        jLabelCantiACTUAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantiACTUAL.setOpaque(true);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Cant.Dosis");

        buttonTaskAGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/agregar-icono-5633-32.png"))); // NOI18N
        buttonTaskAGREGAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonTaskAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskAGREGARActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(141, 141, 175));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "COMPOSICION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTextAreaCOMPOSICION.setEditable(false);
        jTextAreaCOMPOSICION.setColumns(20);
        jTextAreaCOMPOSICION.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCOMPOSICION);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCATEGORIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBoxMEDICAMENTOS, 0, 260, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(10, 10, 10)
                                .addComponent(jLabelCantiACTUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerCantMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(514, 514, 514)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonTaskQUITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13))
                    .addComponent(jComboBoxCATEGORIAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMEDICAMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCantiACTUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCantMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(buttonTaskQUITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("DUEÑO");

        jComboBoxTIPOCONSULTA.setEditable(true);
        jComboBoxTIPOCONSULTA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxTIPOCONSULTA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Concepto" }));
        jComboBoxTIPOCONSULTA.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxTIPOCONSULTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTIPOCONSULTAActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Diagnóstico y Tratamiento(*)");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Concepto(*)");

        jTextAreaDIAGNOSTICO.setColumns(20);
        jTextAreaDIAGNOSTICO.setRows(5);
        jTextAreaDIAGNOSTICO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAreaDIAGNOSTICOFocusLost(evt);
            }
        });
        jTextAreaDIAGNOSTICO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaDIAGNOSTICOKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaDIAGNOSTICO);

        jPanel9.setBackground(new java.awt.Color(141, 141, 175));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "PRÓXIMA ATENCIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Fecha");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Hora");

        buttonActionVERIFICAR.setText("Verificar");
        buttonActionVERIFICAR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        buttonActionVERIFICAR.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonActionVERIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionVERIFICARActionPerformed(evt);
            }
        });

        jComboBoxHORA.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxHORAPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxHORA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHORAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jDateChooserFECHATURNO, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addComponent(jComboBoxHORA, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(buttonActionVERIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(buttonActionVERIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDateChooserFECHATURNO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                .addComponent(jComboBoxHORA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("*Campos Obligatorios");

        jLabelDUEÑO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDUEÑO.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDUEÑO, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(969, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTIPOCONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDUEÑO, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel16))
                            .addComponent(jComboBoxTIPOCONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(496, 496, 496)
                        .addComponent(jLabelVETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelVETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 548, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                    .addContainerGap(69, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int IDVETERINARIO,idrol,idusuario,idOPERACION;boolean banderaDueño,banderaOPERACION;String MASCOTA,DUEÑO,fechaTURNOAnterior;
    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
        if(!jComboBoxTIPOCONSULTA.getModel().getSelectedItem().equals("") & !jTextAreaDIAGNOSTICO.getText().equals("") || !jComboBoxMEDICAMENTOS.getModel().getSelectedItem().equals("Seleccionar Medicamento")){
            String categoria= this.jComboBoxTIPOCONSULTA.getModel().getSelectedItem().toString();
            String diagnostico= this.jTextAreaDIAGNOSTICO.getText();
            String veterinario= this.jLabelVETERINARIO.getText();
            String nuevo="Tipo de Operación "+categoria+"Diagnóstico "+diagnostico+"Veterinario "+veterinario;
            String anterior="Tipo de Operación "+categoria+"Diagnóstico "+diagnostico+"Veterinario "+veterinario;
           
            this.fecha();
            this.BuscarUsuario();
            this.BuscarIDConsulta();
            this.BuscarIDLocalidad();
            BuscarIDVeterinario(veterinario);

            if(IDTipoOperacion==0){
                this.BuscarIDTipoConsulta(categoria);
            }
           consulta.modificarDatosOperaciones(IDFICHA,fechaActual,IDVETERINARIO,IDLOCALIDAD,IDTipoOperacion,"");
           consulta.InsertarDatosAuditoria(fechaActual,hor,usuario,"CONSULTAS","MODIFICAR",anterior,nuevo);
           dispose();
           ENLACE();
   
        }else{
            JOptionPane.showMessageDialog(null,"Debe Completar los Campos Obligatorios","Atención",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonActionCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionCANCELARActionPerformed
        dispose();
        ENLACE();
    }//GEN-LAST:event_buttonActionCANCELARActionPerformed

    private void jTableVACUNASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVACUNASMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableVACUNASMouseClicked

    private void jTablePENDIENTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePENDIENTESMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablePENDIENTESMouseClicked

    private void jComboBoxMEDICAMENTOSPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxMEDICAMENTOSPopupMenuWillBecomeVisible
        String combo=coincidencia;
        String categoria = jComboBoxCATEGORIAS.getSelectedItem().toString();

        if(indice1==-1){
            BuscarCoincidenciasxMEDICAMENTO(combo);
        }else{
            BuscarMedicamentosxCategoria(categoria);
        }
    }//GEN-LAST:event_jComboBoxMEDICAMENTOSPopupMenuWillBecomeVisible

    private void jComboBoxMEDICAMENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMEDICAMENTOSActionPerformed
        medicamentoselec= jComboBoxMEDICAMENTOS.getSelectedItem().toString();
        int indice = this.jComboBoxMEDICAMENTOS.getSelectedIndex();

        if (indice == -1) {
            coincidencia=medicamentoselec;
            BuscarCoincidenciasxMEDICAMENTO(medicamentoselec);
        }else{
            BuscarDatosMedicamento(medicamentoselec);
        }
    }//GEN-LAST:event_jComboBoxMEDICAMENTOSActionPerformed

    private void jSpinnerCantMedicamentoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSpinnerCantMedicamentoAncestorAdded

    }//GEN-LAST:event_jSpinnerCantMedicamentoAncestorAdded

    private void jSpinnerCantMedicamentoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCantMedicamentoStateChanged
        int cantSelec=Integer.parseInt(String.valueOf(jSpinnerCantMedicamento.getModel().getValue()));
        int salida=cantactual-cantSelec;

        if(cantSelec<cantactual){
            jLabelCantiACTUAL.setText(String.valueOf(salida));
        }else if(cantSelec>cantactual){
            JOptionPane.showMessageDialog(null,"La Cant. Solicitada Supera la Cant. Disponible","Informacion", JOptionPane.INFORMATION_MESSAGE);
            jLabelCantiACTUAL.setText("");
            jSpinnerCantMedicamento.setValue(0);
        }else if(cantSelec==cantactual){
            if(JOptionPane.showConfirmDialog(null,"La Cant. Solicitada es Igual a la Cant. Disponible,¿Desea Dejar en Cero el Stock del Medicamento Solicitado?","Consulta",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                jLabelCantiACTUAL.setText(String.valueOf(salida));
                jSpinnerCantMedicamento.setEnabled(false);
                jLabelCantiACTUAL.setForeground(new Color(204,0,0));
            }
        }
    }//GEN-LAST:event_jSpinnerCantMedicamentoStateChanged

    private void jSpinnerCantMedicamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSpinnerCantMedicamentoFocusGained

    }//GEN-LAST:event_jSpinnerCantMedicamentoFocusGained

    private void jSpinnerCantMedicamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSpinnerCantMedicamentoFocusLost

    }//GEN-LAST:event_jSpinnerCantMedicamentoFocusLost

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        buttonTaskQUITAR.setVisible(true);
        String id;

        int filasel = TABLA.getSelectedRow();
        modelo = (javax.swing.table.DefaultTableModel) TABLA.getModel();
        id = (String) modelo.getValueAt(filasel, 1);
        BuscarMedicamento(id);
    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TABLAComponentMoved
        // TODO add your handling cgimenaode here:
    }//GEN-LAST:event_TABLAComponentMoved

    private void buttonTaskQUITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskQUITARActionPerformed
     if(IDMEDICAMENTO!=0){
        BuscarIDConsulta();
        consulta.quitarMedicamentoxOperacion(IDMEDICAMENTO,IDOperacion);
        consulta.actualizarStockMedicamento(IDMEDICAMENTO,cantMedicamento,1); // 1 INDICA SUMAR AL STOCK ACTUAL LA CANTIDAD
       
        LlenarTablaMedicamento(IDOperacion);  
        
        if (IDTipoOperacion==3){  
            this.BuscarIDVACUNAxMedicamento(IDMEDICAMENTO);
            ficha.QuitarVacunaxMascota(IDHISTORIAL,IDVacuna);          
            LlenarTablaVacunas(IDHISTORIAL);
            BuscarVacunaxHistorial(IDVacuna,IDHISTORIAL);
            if(resultado==0){
              vacuna.InsertarVACUNAPENDIENTE(IDHISTORIAL,IDVacuna);
            }else{
               vacuna.ActualizarVacunaPendiente(IDHISTORIAL, IDVacuna,"NO COLOCADO");
            }
                       
            LlenarTablaPENDIENTES(IDHISTORIAL);                
        }
    }else{
        JOptionPane.showMessageDialog(null,"Debe Seleccionar un Ítem de la Lista","Información",JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_buttonTaskQUITARActionPerformed

    private void jComboBoxCATEGORIASPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCATEGORIASPopupMenuWillBecomeVisible
//        this.LlenarComboCategoriaMedicamento(IDTipoOperacion);        
    }//GEN-LAST:event_jComboBoxCATEGORIASPopupMenuWillBecomeVisible

    private void jComboBoxCATEGORIASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCATEGORIASActionPerformed
        String categoria= jComboBoxCATEGORIAS.getSelectedItem().toString();
        BuscarIDCategoria(categoria);

        BuscarMedicamentosxCategoria(categoria);
    }//GEN-LAST:event_jComboBoxCATEGORIASActionPerformed
boolean OperacionRegistrada;
    private void buttonTaskAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARActionPerformed
    String selec=String.valueOf(jComboBoxTIPOCONSULTA.getModel().getSelectedItem());
    String vet=this.jLabelVETERINARIO.getText();        
    this.BuscarIDLocalidad();
    this.BuscarIDVeterinario(vet);
    this.BuscarIDFICHA(MASCOTA);
    this.BuscarDatosHISTORIAL(IDFICHA);
    this.fecha();
    
    if(IDTipoOperacion==0){
        this.BuscarIDTipoConsulta(selec);
    }
    int c =Integer.parseInt(String.valueOf(jSpinnerCantMedicamento.getModel().getValue()));
    if (c!=0)  {
        BuscarIDConsulta();
        consulta.agregarMedicamentoxOperacion(IDOperacion,IDMEDICAMENTO,c);
        consulta.actualizarStockMedicamento(IDMEDICAMENTO,c,2); // 1 INDICA RESTAR AL STOCK ACTUAL LA CANTIDAD SOLICITADA
        limpiarTabla(TABLA);
        LlenarTablaMedicamento(IDOperacion);
        BuscarIDVACUNAxMedicamento(IDMEDICAMENTO);
        
        if (IDTipoOperacion==3)  {
            int salida=ficha.agregarVacunaxMascota(IDHISTORIAL,IDVacuna,fechaActual);
            if(salida==0){
                limpiarTabla(jTableVACUNAS);
                LlenarTablaVacunas(IDHISTORIAL);

                vacuna.ActualizarVacunaPendiente(IDHISTORIAL,IDVacuna,"COLOCADO");
                limpiarTabla(jTablePENDIENTES);
                modelo = (DefaultTableModel) jTablePENDIENTES.getModel();
                LlenarTablaPENDIENTES(IDHISTORIAL);                        
             }
        }
        limpiarCamposMedicamento();
    }else{
        JOptionPane.showMessageDialog(null,"Debe indicar la Cantidad del Medicamento","Atención",JOptionPane.WARNING_MESSAGE);
    }
        
    }//GEN-LAST:event_buttonTaskAGREGARActionPerformed

    private void jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible
        LlenarComboTipoOperaciones();
    }//GEN-LAST:event_jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible

    private void jComboBoxTIPOCONSULTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTIPOCONSULTAActionPerformed
        String selec=jComboBoxTIPOCONSULTA.getModel().getSelectedItem().toString();
        BuscarIDTipoConsulta(selec);
        this.LlenarComboCategoriaMedicamento(IDTipoOperacion);
    }//GEN-LAST:event_jComboBoxTIPOCONSULTAActionPerformed

    private void jTextAreaDIAGNOSTICOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaDIAGNOSTICOFocusLost

    }//GEN-LAST:event_jTextAreaDIAGNOSTICOFocusLost

    private void jTextAreaDIAGNOSTICOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDIAGNOSTICOKeyTyped
        String diagnostico = this.jTextAreaDIAGNOSTICO.getText();
        if(diagnostico.length()>300){
            evt.consume();
        }
    }//GEN-LAST:event_jTextAreaDIAGNOSTICOKeyTyped

    private void buttonActionVERIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionVERIFICARActionPerformed
        String formato = "yyyy/MM/dd";
        java.sql.Date fechaturno=new Date(jDateChooserFECHATURNO.getDate().getYear(),jDateChooserFECHATURNO.getDate().getMonth(),jDateChooserFECHATURNO.getDate().getDate() );
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String dia = sdf.format(fechaturno);
        String hora=String.valueOf(jComboBoxHORA.getModel().getSelectedItem());
        
        if(dia.equals("")){
           JOptionPane.showMessageDialog(null,"Debe Determinar una Fecha y Hora","Información",JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(!dia.equals(fechaTURNOAnterior)){
               if(JOptionPane.showConfirmDialog(null,"¿Desea la Fecha de la Próxima Atención?", "Consulta", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                   String vet=this.jLabelVETERINARIO.getText();
                   this.BuscarIDVeterinario(vet);
                   GenerarNroOperacion();
                   this.BuscarIDConsulta();
                   int resultado =consulta.VerificarfechaxConsulta(NrofechaXOperacion,IDVETERINARIO,IDOperacion,dia,hora);
            //////        VERIFICAR QUE SI NO HAY VINCULO CON EL DIA, SI HAY CON EL HORARIO....
                   if(resultado!=0){
                      JOptionPane.showMessageDialog(null,"La Fecha y Hora Seleccionados se Encuentran Ocupados","Información",JOptionPane.INFORMATION_MESSAGE);
                   }else{
                        if(JOptionPane.showConfirmDialog(null,"La Fecha y Hora Seleccionados se Encuentran Disponibles,¿Desea Confirmar?", "Consulta", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                            JOptionPane.showMessageDialog(null,"Se Registró la Próxima Fecha a ser Atendido","Información",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            consulta.CancelarVisita(NrofechaXOperacion);
                          }               
                      }
            }else{
                consulta.CancelarVisita(NrofechaXOperacion);
               }
            
            }
        }
    }//GEN-LAST:event_buttonActionVERIFICARActionPerformed

    private void jComboBoxHORAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHORAActionPerformed
//      String seleccion = String.valueOf(this.jComboBoxHORA.getModel().getSelectedItem());      
//      BuscarIDHORA(seleccion);
        
    }//GEN-LAST:event_jComboBoxHORAActionPerformed

    private void jComboBoxHORAPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxHORAPopupMenuWillBecomeVisible
        LlenarComboHORA();
        this.buttonActionVERIFICAR.setEnabled(true);
    }//GEN-LAST:event_jComboBoxHORAPopupMenuWillBecomeVisible
String coincidencia,medicamentoselec; int indice1;
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
            java.util.logging.Logger.getLogger(ModificarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                ModificarConsulta dialog = new ModificarConsulta(new javax.swing.JFrame(), true);
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
    public javax.swing.JTable TABLA;
    private org.edisoncor.gui.button.ButtonAction buttonActionCANCELAR;
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    private org.edisoncor.gui.button.ButtonAction buttonActionVERIFICAR;
    private org.edisoncor.gui.button.ButtonTask buttonTaskAGREGAR;
    private org.edisoncor.gui.button.ButtonTask buttonTaskQUITAR;
    public javax.swing.JComboBox jComboBoxCATEGORIAS;
    public javax.swing.JComboBox jComboBoxHORA;
    private javax.swing.JComboBox jComboBoxMEDICAMENTOS;
    public javax.swing.JComboBox jComboBoxTIPOCONSULTA;
    public com.toedter.calendar.JDateChooser jDateChooserFECHATURNO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCantiACTUAL;
    public javax.swing.JLabel jLabelDUEÑO;
    public javax.swing.JLabel jLabelEdad;
    public javax.swing.JLabel jLabelEdad1;
    public javax.swing.JLabel jLabelEspecie;
    public javax.swing.JLabel jLabelMASCOTA;
    public javax.swing.JLabel jLabelOpcionDespar;
    public javax.swing.JLabel jLabelPesoActual;
    private javax.swing.JLabel jLabelPesoActual1;
    private javax.swing.JLabel jLabelPesoActual2;
    public javax.swing.JLabel jLabelProximaDESPAR;
    public javax.swing.JLabel jLabelRaza;
    public javax.swing.JLabel jLabelSEXO;
    public javax.swing.JLabel jLabelSituacionPeso;
    public javax.swing.JLabel jLabelTiempoDespar;
    private javax.swing.JLabel jLabelTiempoDespar1;
    public javax.swing.JLabel jLabelVETERINARIO;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
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
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinnerCantMedicamento;
    private javax.swing.JTable jTablePENDIENTES;
    private javax.swing.JTable jTableVACUNAS;
    private javax.swing.JTextArea jTextAreaALERGIAS;
    private javax.swing.JTextArea jTextAreaCOMPOSICION;
    public javax.swing.JTextArea jTextAreaDIAGNOSTICO;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

String fechaActual,hor; int min,añoactual,mesactual,diaactual; 
void fecha(){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    añoactual = Calendario.get(Calendar.YEAR);
    mesactual = Calendario.get(Calendar.MONTH) + 1;
    diaactual = Calendario.get(Calendar.DAY_OF_MONTH);
    
    fechaActual=añoactual+"/"+mesactual+"/"+diaactual;    
 
//    f=new Date(Calendario.get(Calendar.YEAR),Calendario.get(Calendar.MONTH) + 1,Calendario.get(Calendar.DAY_OF_MONTH));
    int h=Calendario.get(Calendar.HOUR_OF_DAY);
    int minutos=Calendario.get(Calendar.MINUTE);        
    hor = String.valueOf(h+":"+minutos);
}
      
  String usuario; 
  private void BuscarUsuario(){
     cn=cm.Conectar();
     String   sSQL = "SELECT usuario FROM usuarios WHERE id="+idusuario;
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
            {
               usuario=rs.getString("usuario");      
            }
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
  
private void BuscarIDVeterinario(String vet) {
 cn=cm.Conectar();
 String   sSQL = "SELECT id FROM veterinarios WHERE CONCAT(apellido,nombre) LIKE '"+vet+"%'";
    try
    {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        while(rs.next())
        {
          IDVETERINARIO=rs.getInt("id");      
        }
        }
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(null, ex);
    }
}
  
    int IDPROPIETARIO;
    private void BuscarIDDueño(String dueñoSelec) {
        try {           
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT id FROM propietarios WHERE CONCAT(apellido,coma,nombre) LIKE '"+dueñoSelec+"%'");                     
            while (rs.next()) {
               IDPROPIETARIO=rs.getInt("id");
            }
            rs.close();
                    
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

 
private void LlenarComboCategoriaMedicamento(int IDTipoOperacion) {
   try {            
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT DISTINCT categoriamedicamento.nombre FROM categoriamedicamento INNER JOIN medicamentos ON categoriamedicamento.id=medicamentos.idcategoria INNER JOIN medicamentoxespecieyoperacion ON medicamentos.id=medicamentoxespecieyoperacion.idmedicamento WHERE medicamentoxespecieyoperacion.idtipoop='"+IDTipoOperacion+"' ORDER BY categoriamedicamento.nombre ASC");                     
    while (rs.next()) {
       modeloCombo.addElement(rs.getString("categoriamedicamento.nombre"));
    }
    rs.close();
    jComboBoxCATEGORIAS.setModel(modeloCombo);            
} catch (SQLException ex) {
        ex.getMessage();
} 
 }

private void ENLACE() {
  int L=0,ES=0,MOD=0,ELI=0;
  Consultas esp=new Consultas(new javax.swing.JFrame(), true);
  esp.IDROL=idrol; 
      try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+idrol;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {                                
              L=rs.getInt("L_CONSULTA");
              ES=rs.getInt("ESC_CONSULTA");
              MOD=rs.getInt("MOD_CONSULTA");
              ELI=rs.getInt("ELIM_CONSULTA");               
            }                              
        }catch (SQLException ex)
          {
            JOptionPane.showMessageDialog(null, ex);
          }    
          
      if(L!=0 & ES!=0 & MOD!=0 & ELI!=0){
         esp.buttonTaskAGREGAR.setEnabled(true);         
         esp.buttonTaskELIMINAR.setEnabled(false);
         esp.buttonTaskMODIFICAR.setEnabled(false);
         esp.TABLA.setEnabled(true); 
         esp.buttonTaskCERRAR.setEnabled(true);
      }else if(L!=0){
         esp.buttonTaskAGREGAR.setEnabled(false);
         esp.buttonTaskELIMINAR.setEnabled(false);
         esp.buttonTaskMODIFICAR.setEnabled(false);
         esp.TABLA.setEnabled(false);
         esp.buttonTaskCERRAR.setEnabled(true);
      }else if(ES!=0){
         esp.buttonTaskAGREGAR.setEnabled(true);
         esp.buttonTaskELIMINAR.setEnabled(false);
         esp.buttonTaskMODIFICAR.setEnabled(false);
         esp.TABLA.setEnabled(false);
         esp.buttonTaskCERRAR.setEnabled(true);
      }else if(MOD!=0){
         esp.buttonTaskAGREGAR.setEnabled(false);
         esp.buttonTaskELIMINAR.setEnabled(false);
         esp.buttonTaskMODIFICAR.setEnabled(false);
         esp.TABLA.setEnabled(true);
         esp.buttonTaskCERRAR.setEnabled(true);
      }else  if(ELI!=0){
         esp.buttonTaskAGREGAR.setEnabled(false);
         esp.buttonTaskELIMINAR.setEnabled(false);
         esp.buttonTaskMODIFICAR.setEnabled(false);
         esp.TABLA.setEnabled(true);
         esp.buttonTaskCERRAR.setEnabled(true);
      }else {
         esp.buttonTaskAGREGAR.setEnabled(false);
         esp.buttonTaskELIMINAR.setEnabled(false);
         esp.buttonTaskMODIFICAR.setEnabled(false);
         esp.TABLA.setEnabled(false);
         esp.buttonTaskCERRAR.setEnabled(true);
      }
        esp.show();
    }
int IDCATEGORIA;
    private void BuscarIDCategoria(String categoria) {
     cn=cm.Conectar();
     String   sSQL = "SELECT id FROM categoriamedicamento WHERE nombre LIKE '"+categoria+"%'";
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
            {
              IDCATEGORIA=rs.getInt("id");
            }
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
int cantactual=0,IDMEDICAMENTO;
private void BuscarDatosMedicamento(String medicamento) {
     String accion="",composicion="";
     cn=cm.Conectar();
     String   sSQL = "SELECT id,nombre,accion,composicion,cantactual FROM medicamentos WHERE nombre LIKE '"+medicamento+"%'";
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
            {
               IDMEDICAMENTO=rs.getInt("id");
//               accion=rs.getString("accion");
               composicion=rs.getString("composicion");
               cantactual=rs.getInt("cantactual");
            }
            jTextAreaCOMPOSICION.setText(composicion);
//            jTextAreaACCION.setText(accion);
            jLabelCantiACTUAL.setText(String.valueOf(cantactual));
            }        
        
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

private void BuscarMedicamentosxCategoria(String categoria) {
    try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT medicamentos.nombre FROM medicamentos INNER JOIN categoriamedicamento ON categoriamedicamento.id=medicamentos.idcategoria WHERE categoriamedicamento.nombre LIKE '"+categoria+"%'");                     
        while (rs.next()) {
           modeloCombo.addElement(rs.getString("medicamentos.nombre"));
        }
        rs.close();
        jComboBoxMEDICAMENTOS.setModel(modeloCombo);            
      }catch (SQLException ex) {
        ex.getMessage();
       }  
}

    private void limpiarCamposMedicamento() {
//      this.jTextAreaACCION.setText("");
      this.jComboBoxCATEGORIAS.getModel().setSelectedItem("Seleccione");
      this.jComboBoxMEDICAMENTOS.getModel().setSelectedItem("Seleccione");
      this.jTextAreaCOMPOSICION.setText("");
//    
      this.jSpinnerCantMedicamento.getModel().setValue(0);
      jLabelCantiACTUAL.setText("");
    }
    

 public void BuscarVacunasPendientes(int especie) {
    String[] titulos = {"Vacuna Pendiente","Tipo"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    String sSQL = "";
    String[] registro = new String[2];
    
    sSQL ="SELECT nombre, condicion FROM controlvacunas WHERE idespecie="+especie; 
                
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("nombre");    
               registro[1]=rs.getString("condicion"); 
               modelo.addRow(registro);
               limpiarTabla(jTablePENDIENTES); 
               }            
              jTablePENDIENTES.setModel(modelo);  
              this.FORMATO_TABLAPENDIENTES();
            }         
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           } 
    }
 
 private void limpiarTabla(JTable tab) {
         while(tab.getRowCount()>0){//se recorren todas las filas
         ((javax.swing.table.DefaultTableModel) tab.getModel()).removeRow(0);
       }
    }
 
 public void LlenarTablaVacunas(int IDHISTORIAL) {
    String[] titulos = {"Fecha","Vacuna"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    String sSQL = "";
    String[] registro = new String[2];
    sSQL="SELECT controlvacunas.nombre,DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha FROM controlvacunas INNER JOIN vacunasxmascota ON controlvacunas.id=vacunasxmascota.idvacuna WHERE vacunasxmascota.IDHISTORIAL="+IDHISTORIAL;
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
               registro[0]=rs.getString("fecha");
               registro[1]=rs.getString("controlvacunas.nombre");
               modelo.addRow(registro);
               limpiarTabla(jTableVACUNAS); 
               }
            
                jTableVACUNAS.setModel(modelo); 
               FORMATO_TABLAVACUNAS();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }    
    }
 
 
 int IDOperacion;
 private void BuscarIDConsulta() {
  try {       
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT MAX(id) AS id FROM operaciones");

    while (rs.next()) {
       IDOperacion=rs.getInt("id");           
    }
    rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();  
   }        
}

private void BuscarCoincidenciasxMEDICAMENTO(String medicamento) {
      try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM medicamentos WHERE nombre LIKE '"+medicamento+"%' ORDER BY nombre ASC");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("nombre"));
            }
            rs.close();
            this.jComboBoxMEDICAMENTOS.setModel(modeloCombo);
        } catch (SQLException ex) {
            ex.getMessage();
        }  
    }

int cantMedicamento;
private void BuscarMedicamento(String medicamento) {
  try {       
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT idmedicamento,cantidad FROM medicamentos INNER JOIN medicamentosxoperacion ON medicamentos.id=medicamentosxoperacion.idmedicamento WHERE nombre LIKE '"+medicamento+"%' AND medicamentosxoperacion.idoperacion="+IDOperacion);

    while (rs.next()) {
       IDMEDICAMENTO=rs.getInt("idmedicamento"); 
       cantMedicamento=rs.getInt("cantidad"); 
    }
    rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();  
   }
}


int IDLOCALIDAD; 
private void BuscarIDLocalidad() {
 try {       
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT idlocalidad FROM logoclinica");

    while (rs.next()) {
       IDLOCALIDAD=rs.getInt("idlocalidad");           
    }
    rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();  
   }
}

int IDTipoOperacion;
private void BuscarIDTipoConsulta(String selec) {
 try {       
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT id FROM tipooperacion WHERE nombre LIKE '"+selec+"%'");

    while (rs.next()) {
       IDTipoOperacion=rs.getInt("id");           
    }
    rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();  
   } 
}

 private void LlenarComboTipoOperaciones() {
      try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM tipooperacion WHERE idcategoria=1 ORDER BY nombre ASC");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("nombre"));
            }
            rs.close();
            this.jComboBoxTIPOCONSULTA.setModel(modeloCombo);
        } catch (SQLException ex) {
            ex.getMessage();
        }   
 }

public void LlenarTablaPENDIENTES(int IDHISTORIAL) {
    String[] titulos = {"Fecha","Tipo"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    String sSQL;
    String[] registro = new String[2];
    sSQL ="SELECT nombre,condicion,situacion FROM vacunaspendientes INNER JOIN controlvacunas ON vacunaspendientes.idvacuna=controlvacunas.id WHERE situacion LIKE 'NO COLOCADO' AND idhistorial="+IDHISTORIAL; 
    try {
        cmd=cn.prepareCall(sSQL);          
        ResultSet rs=cmd.executeQuery();
                        
        while(rs.next()){             
               registro[0]=rs.getString("nombre");
               registro[1]=rs.getString("condicion");
               modelo.addRow(registro);
               limpiarTabla(jTablePENDIENTES);        
             }
        jTablePENDIENTES.setModel(modelo);
        this.FORMATO_TABLAPENDIENTES();
        } catch (Exception e) {
            System.out.print(e);
        }
    }

   

 public void EnvioCorreoPropietarios(String dueño) {         
  fecha();  String ubicacion = null;   
  if(mesactual==2 || mesactual==12 & diaactual<=4){
          String vacuna,condicion,elemento;
          ArrayList list = new ArrayList();
          FileWriter fw = null;
//          String elemento;     
          this.BuscarIDDueño(dueño);
          obtenerCantidadFichas(IDPROPIETARIO);
             ////se crea el archivoo
          int idficha=1;
         
          while(idficha<=cantidadFichas){               
               obtenerCorreo(idficha);  ////  obtengo e-mail del dueño de la ficha seleccionada que corresponde a una mascota
               BuscarDatosHISTORIAL(idficha);  ////obtengo id de historial y datos de desparasitacion
               buscarUltimadesparasitacion(IDHISTORIAL); 
               
               int cantVacunas=consulta.CantVacunas(IDHISTORIAL);
              
               if(cantVacunas==0){   ////aca se tendria que registrar en el txt las vacunas faltantes                
                   try {
                        cn = cm.Conectar();
                        Statement st = (Statement) cn.createStatement();
                        ResultSet rs = st.executeQuery("SELECT nombre,condicion,vacunaspendientes.situacion FROM fichamedica INNER JOIN historialclinico ON fichamedica.id=historialclinico.idficha INNER JOIN vacunaspendientes ON historialclinico.id=vacunaspendientes.idhistorial INNER JOIN controlvacunas ON vacunaspendientes.idvacuna=controlvacunas.id WHERE vacunaspendientes.situacion LIKE 'NO COLOCADO' AND idpropietario="+IDPROPIETARIO);
                        while (rs.next()) {
                            vacuna = rs.getString("nombre");
                            condicion =rs.getString("condicion");
                            list.add("Vacuna:"+ vacuna+",Condicion:"+condicion);
                        }
                        if(rs.next()==false){
                           list.add("Fecha de Proxima Desparacitacion:"+fecha);
                        }
                       
                        try {
                            ubicacion=System.getProperty("user.dir")+"\\Vacunaciones y Desparasitacion Pendientes.txt";
                            fw = new FileWriter(ubicacion);
                            for (int i = 0; i < list.size(); i++) {
                                if (i >=0) {
                                    //nueva línea
                                    fw.write(System.getProperty("line.separator"));
                                    fw.write(System.getProperty("line.separator"));
                                }
                                elemento = (String) list.get(i);
                                fw.write(elemento);
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        } 
            
                        finally {
                            if (fw != null) {
                                try {
                                    fw.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                fw = null;
                            }
                        }
           } catch (Exception ex) {
            ex.getMessage();
                    }
                           
     }else{
        list.add("Fecha de Proxima Desparacitacion:"+fecha);
        try {
            ubicacion=System.getProperty("user.dir")+"\\Vacunaciones y Desparasitacion Pendientes.txt";
            fw = new FileWriter(ubicacion);
            for (int i = 0; i < list.size(); i++) {
                if (i >=0) {
                    //nueva línea
                    fw.write(System.getProperty("line.separator"));
                    fw.write(System.getProperty("line.separator"));
                }
                elemento = (String) list.get(i);
                fw.write(elemento);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }             
        finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                fw = null;
            }
        }
           
  }                
                  //////////////////////////////// Envio de datos
        String var = "429Fernet123";
        char cad[];
        cad = var.toCharArray() ;
        mail.setFrom("gonzalezveronical87@gmail.com");
        mail.setPassword(cad);        
        mail.setTo(correo);
        mail.setSubject("RECORDATORIO DE VACUNACIONES Y DESPARASITACION");        
        mail.SEND();
        
        idficha=idficha+1;
        File fichero = new File(ubicacion);
        fichero.delete();
          }
         
        }
    }
 
 
int cantidadFichas;
private void obtenerCantidadFichas(int propietario) {
  try {             
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT COUNT(id) AS cantidad FROM fichamedica WHERE idpropietario="+propietario);

        while (rs.next()) {
           cantidadFichas=rs.getInt("cantidad");
        }
        rs.close();

    } catch (SQLException ex) {
        ex.getMessage();
    }   
    }

String correo;
    private void obtenerCorreo(int idficha) {
        try {             
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT email FROM personas INNER JOIN propietarios ON personas.id=propietarios.idpersona INNER JOIN fichamedica ON propietarios.id=fichamedica.idpropietario WHERE fichamedica.id="+idficha);

        while (rs.next()) {
           correo=rs.getString("email");
        }
        rs.close();

    } catch (SQLException ex) {
        ex.getMessage();
    }    
    
    }

int IDHISTORIAL,NroHistorial;
private void BuscarDatosHISTORIAL(int IDFICHA) {
  String tiempodespar="",alergias="",opcionDesparasitado="";
  
  try {          
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT id,nrohistorial,opcionDesparasitado,DATE_FORMAT(fechadespar,'%d/%m/%Y') AS fecha,alergias FROM historialclinico WHERE idficha="+IDFICHA);                     
        while (rs.next()) {   
            IDHISTORIAL=rs.getInt("id");  
            NroHistorial=rs.getInt("nrohistorial"); 
            opcionDesparasitado= rs.getString("opcionDesparasitado");             
            tiempodespar=rs.getString("fecha"); 
            alergias=rs.getString("alergias"); 
           }
           rs.close();
           this.jTextAreaALERGIAS.setText(alergias);
           
           fecha();           
           String proxdespar = "";
           
           if (opcionDesparasitado.equals("No")||opcionDesparasitado.equals("") ){ 
              jLabelOpcionDespar.setText("No");
              jLabelTiempoDespar.setText("Ninguna");
             
              proxdespar=diaactual+3+"/"+mesactual+"/"+añoactual; 
              
           }else if(opcionDesparasitado.equals("Si")){ 
              int dia=Integer.parseInt(tiempodespar.substring(0,2)); 
              int mes=Integer.parseInt(tiempodespar.substring(3,5)); 
              int año=1+Integer.parseInt(tiempodespar.substring(6,10)); 
              
               
             if(mes==12){
                proxdespar=dia+"/"+06+"/"+añoactual+1;       
                              
             }else if(mes <6 || mes==6){
                 mes=mes+6;
                 proxdespar=dia+"/"+mes+"/"+añoactual;       
                
             }else if(mes>6 & mes<12){
                 if(mes==7) {
                     proxdespar=dia+"/"+01+"/"+año;       
                     
                 }else if(mes==8){
                     proxdespar=dia+"/"+02+"/"+año;       
                     
                 }else if(mes==9){
                     proxdespar=dia+"/"+03+"/"+año;       
                  
                 }else if(mes==10){
                     proxdespar=dia+"/"+04+"/"+año;       
                     
                 }else if(mes==11){
                     proxdespar=dia+"/"+05+"/"+año;       
                     
                 }
             }
                  
              jLabelOpcionDespar.setText("Si");
              jLabelTiempoDespar.setText(tiempodespar);        
           }
           
           jLabelProximaDESPAR.setText(proxdespar);           
    } catch (SQLException ex) {
            ex.getMessage();
    }  
    }

String fecha;
private void buscarUltimadesparasitacion(int idhistorial) {
  int opcionDesparasitado = 0; String proxdespar = null;
  try {             
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT opcionDesparasitado,DATE_FORMAT(fechadespar,'%d/%m/%Y') AS fecha FROM historialclinico WHERE id="+idhistorial);

    while (rs.next()) {
       fecha=rs.getString("fecha");
       opcionDesparasitado=rs.getInt("opcionDesparasitado");
    }
    rs.close();
         if(opcionDesparasitado==1){ 
              int mes=Integer.parseInt(fecha.substring(3,5)); 
              int año=Integer.parseInt(fecha.substring(6,10)); 
              mes=mes+6;             
             
             if(mes>12){
                mes=mes-6;
                añoactual=añoactual+1;
                proxdespar=diaactual+"/"+mes+"/"+añoactual;       
                fecha=proxdespar;                               
             }else{
                if(año==añoactual){
                   proxdespar=diaactual+"/"+mes+"/"+añoactual;       
                   fecha=proxdespar;
                }else{
                   proxdespar=diaactual+1+"/"+mes+"/"+añoactual;       
                   fecha=proxdespar;
                }
             }                 
           }else{
             proxdespar=diaactual+3+"/"+mesactual+"/"+añoactual;
             fecha=proxdespar;   
    }
} catch (SQLException ex) {
    ex.getMessage();
}           
}

public void LlenarTablaMedicamento(int IDTipoOperacion) {
    String[] titulos = {"Categoría","Medicamento"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    String[] registro = new String[2];
    try{
       String sSQL="SELECT medicamentos.nombre,categoriamedicamento.nombre FROM medicamentos INNER JOIN categoriamedicamento ON categoriamedicamento.id=medicamentos.idcategoria INNER JOIN medicamentosxoperacion ON medicamentos.id=medicamentosxoperacion.idmedicamento WHERE idoperacion='"+IDTipoOperacion+"' ORDER BY categoriamedicamento.nombre  ASC";
       Statement st = (Statement) cn.createStatement();
       ResultSet rs = st.executeQuery(sSQL);       
       
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("categoriamedicamento.nombre");
            registro[1]=rs.getString("medicamentos.nombre");
            modelo.addRow(registro);
            limpiarTabla(TABLA); 
        }
        TABLA.setModel(modelo);
        FORMATO_TABLAMEDICAMENTOS();
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }   
    }

private void FORMATO_TABLAVACUNAS(){
   jTableVACUNAS.getColumnModel().getColumn(0).setPreferredWidth(50);
   jTableVACUNAS.getColumnModel().getColumn(1).setPreferredWidth(130);
    }
private void FORMATO_TABLAPENDIENTES(){
   jTablePENDIENTES.getColumnModel().getColumn(0).setPreferredWidth(80);
   jTablePENDIENTES.getColumnModel().getColumn(1).setPreferredWidth(40);
    }
private void FORMATO_TABLAMEDICAMENTOS(){
   jTablePENDIENTES.getColumnModel().getColumn(0).setPreferredWidth(50);
   jTablePENDIENTES.getColumnModel().getColumn(1).setPreferredWidth(130);
    }

  
  int IDFICHA;
  private void BuscarIDFICHA(String mascotaSelec) {
     try {             
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT id FROM fichamedica WHERE mascota LIKE '"+mascotaSelec+"%'");

        while (rs.next()) {
           IDFICHA=rs.getInt("id");
        }
        rs.close();

    } catch (SQLException ex) {
        ex.getMessage();
    }   
}
  
  int IDVacuna;
    private void BuscarIDVACUNAxMedicamento(int IDMEDICAMENTO) {
       try {   
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT idcontrolvacuna FROM tipovacuna WHERE idmedicamento="+IDMEDICAMENTO);

        while (rs.next()) {
            IDVacuna=rs.getInt("idcontrolvacuna");
        }
            rs.close();        
    } catch (SQLException ex) {
        ex.getMessage();
    }  
    }

//    private void BuscarIDHORA(String seleccion) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    private void LlenarComboHORA() {
       try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT hora,minutos FROM horarios");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("hora")+":"+rs.getString("minutos"));
            }
            rs.close();
            this.jComboBoxHORA.setModel(modeloCombo);
        } catch (SQLException ex) {
            ex.getMessage();
        }  
    }
    
int NrofechaXOperacion;
private void GenerarNroOperacion() {
    cn=cm.Conectar();   
    try{
       String sSQL="SELECT COUNT(nro) AS nro FROM fechasxoperacion";
       Statement st = (Statement) cn.createStatement();
       ResultSet rs = st.executeQuery(sSQL);       
       
        while(rs.next()){//aca se lee el maximo de filas
            NrofechaXOperacion=rs.getInt("nro")+1;                              
        }
       
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }  
    }

int resultado;
private void BuscarVacunaxHistorial(int vacuna,int historial) {
   cn=cm.Conectar();   
    try{
       String sSQL="SELECT idvacuna FROM vacunaspendientes WHERE idvacuna='"+vacuna+"' AND idhistorial="+historial;
       Statement st = (Statement) cn.createStatement();
       ResultSet rs = st.executeQuery(sSQL);       
       
        while(rs.next()){//aca se lee el maximo de filas
            resultado=rs.getInt("idvacuna");                              
        }
       
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      } 
}

}
