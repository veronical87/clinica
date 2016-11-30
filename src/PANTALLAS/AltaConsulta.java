package PANTALLAS;

import CLASES.ClaseOperaciones;
import CLASES.ClaseFichasMedicas;
import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AltaConsulta extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd,cmd2;
    ClaseOperaciones consulta=new ClaseOperaciones();
    ClaseFichasMedicas ficha=new ClaseFichasMedicas();
    Calendar Calendario = Calendar.getInstance();  
    DefaultTableModel modelo;
    public AltaConsulta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);       
//        this.LlenarComboProvincias();        
        this.fecha();
        buttonTaskQUITAR.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelVETERINARIO = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxProvincias = new javax.swing.JComboBox();
        jComboBoxLOCALIDADES = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabelFECHA = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxMASCOTAS = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDIAGNOSTICO = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelTiempoDespar = new javax.swing.JLabel();
        jLabelOpcionDespar = new javax.swing.JLabel();
        jLabelTiempoDespar1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
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
        jComboBoxTIPOCONSULTA = new javax.swing.JComboBox();
        jComboBoxDUEÑOS = new javax.swing.JComboBox();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaACCION = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCOMPOSICION = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jDateChooserFECHATURNO = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttonActionVERIFICAR = new org.edisoncor.gui.button.ButtonAction();
        jFormattedTextFieldHORARIO = new javax.swing.JFormattedTextField();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonActionCANCELAR = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("AltaConsulta");

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTAS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("VETERINARIO");

        jLabelVETERINARIO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelVETERINARIO.setForeground(new java.awt.Color(153, 0, 0));
        jLabelVETERINARIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVETERINARIO.setText("jLabel4");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("LUGAR");

        jComboBoxProvincias.setEditable(true);
        jComboBoxProvincias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxProvincias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MISIONES" }));
        jComboBoxProvincias.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxProvinciasPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxProvincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProvinciasActionPerformed(evt);
            }
        });

        jComboBoxLOCALIDADES.setEditable(true);
        jComboBoxLOCALIDADES.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxLOCALIDADES.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "POSADAS" }));
        jComboBoxLOCALIDADES.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxLOCALIDADESPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxLOCALIDADES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLOCALIDADESActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("FECHA");

        jLabelFECHA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFECHA.setOpaque(true);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(141, 141, 175));

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS GENERALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Dueños(*)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Mascotas(*)");

        jComboBoxMASCOTAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxMASCOTAS.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxMASCOTASPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxMASCOTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMASCOTASActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Concepto(*)");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Diagnostico(*)");

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

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "VACUNAS COLOCADAS y/o  DESPARASITACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Desparasitado");

        jLabelTiempoDespar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabelOpcionDespar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabelTiempoDespar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTiempoDespar1.setText("Hace");

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
        jScrollPane6.setViewportView(jTableVACUNAS);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabelTiempoDespar1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOpcionDespar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTiempoDespar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOpcionDespar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTiempoDespar1)
                    .addComponent(jLabelTiempoDespar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ALERGIAS QUE PADECE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "VACUNAS PENDIENTES y/o DESPARASITACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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
        jLabel17.setText("Prox. Desparasitacion");

        jLabelProximaDESPAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelProximaDESPAR.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelProximaDESPAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabelProximaDESPAR, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "DATOS DE LA MASCOTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Edad");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Especie");

        jLabelEdad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabelEspecie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Peso Actual");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Situacion Peso");

        jLabelSituacionPeso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabelEdad1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabelPesoActual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabelPesoActual1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPesoActual1.setText("Kilos");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Raza");

        jLabelRaza.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPesoActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(44, 44, 44)
                        .addComponent(jLabelSituacionPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEdad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPesoActual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSituacionPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jComboBoxTIPOCONSULTA.setEditable(true);
        jComboBoxTIPOCONSULTA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxTIPOCONSULTA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Tipo de Concepto", " " }));
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

        jComboBoxDUEÑOS.setEditable(true);
        jComboBoxDUEÑOS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxDUEÑOS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Dueño" }));
        jComboBoxDUEÑOS.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxDUEÑOSPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxDUEÑOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDUEÑOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxDUEÑOS, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxMASCOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBoxTIPOCONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxMASCOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDUEÑOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBoxTIPOCONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(141, 141, 175));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "MEDICAMENTOS A UTILIZAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel5.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Categoria");

        jComboBoxMEDICAMENTOS.setEditable(true);
        jComboBoxMEDICAMENTOS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxMEDICAMENTOS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Medicamento" }));
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
                "Categoria", "Medicamento"
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonTaskQUITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/eliminar-icono-6226-32.png"))); // NOI18N
        buttonTaskQUITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskQUITARActionPerformed(evt);
            }
        });

        jComboBoxCATEGORIAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxCATEGORIAS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Categoria" }));
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

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Cant.Dosis");

        buttonTaskAGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/agregar-icono-5633-32.png"))); // NOI18N
        buttonTaskAGREGAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonTaskAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskAGREGARActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(141, 141, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ACCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTextAreaACCION.setEditable(false);
        jTextAreaACCION.setColumns(20);
        jTextAreaACCION.setRows(5);
        jScrollPane5.setViewportView(jTextAreaACCION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

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
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxCATEGORIAS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCantiACTUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerCantMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxMEDICAMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonTaskQUITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(3, 3, 3))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCATEGORIAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxMEDICAMENTOS))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinnerCantMedicamento)
                        .addComponent(jLabel23))
                    .addComponent(jLabelCantiACTUAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskQUITAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        jPanel9.setBackground(new java.awt.Color(141, 141, 175));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "PROXIMA VISITA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Fecha");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Hora");

        buttonActionVERIFICAR.setText("Verificar");
        buttonActionVERIFICAR.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        buttonActionVERIFICAR.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonActionVERIFICAR.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonActionVERIFICAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonActionVERIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionVERIFICARActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldHORARIO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldHORARIO.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jDateChooserFECHATURNO, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addComponent(jFormattedTextFieldHORARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonActionVERIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jFormattedTextFieldHORARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserFECHATURNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(buttonActionVERIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jTabbedPane1.addTab("DATOS GRALES. DE LA CONSULTA", jPanel1);

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

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(548, 548, 548)
                .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelVETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxLOCALIDADES, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelVETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel20)
                                .addComponent(jComboBoxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxLOCALIDADES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25))
                            .addComponent(jLabelFECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 int IDVETERINARIO;
    private void jComboBoxProvinciasPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxProvinciasPopupMenuWillBecomeVisible
        String combo=coincidencia;
        if(indice1==-1){
            BuscarCoincidenciasxProv(combo);

        }else{
            LlenarComboProvincias();
        }
    }//GEN-LAST:event_jComboBoxProvinciasPopupMenuWillBecomeVisible

    private void jComboBoxProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProvinciasActionPerformed
        provinciaselec = this.jComboBoxProvincias.getSelectedItem().toString();
        int indice=this.jComboBoxProvincias.getSelectedIndex();

        if(indice==-1){
            coincidencia=provinciaselec;
            BuscarCoincidenciasxProv(provinciaselec);
            indice1=indice;
        }else{
            BuscarIDProvincia(provinciaselec);
            llenarComboLocalidades(provinciaselec);
        }
    }//GEN-LAST:event_jComboBoxProvinciasActionPerformed

    private void jComboBoxLOCALIDADESPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxLOCALIDADESPopupMenuWillBecomeVisible
        llenarComboLocalidades(provinciaselec);
    }//GEN-LAST:event_jComboBoxLOCALIDADESPopupMenuWillBecomeVisible

    private void jComboBoxMASCOTASPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxMASCOTASPopupMenuWillBecomeVisible
        this.LimpiarCampos();
    }//GEN-LAST:event_jComboBoxMASCOTASPopupMenuWillBecomeVisible

    private void jComboBoxMASCOTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMASCOTASActionPerformed
        String mascotaSelec = this.jComboBoxMASCOTAS.getSelectedItem().toString();
        BuscarDatosMascota(mascotaSelec);        
    }//GEN-LAST:event_jComboBoxMASCOTASActionPerformed

    private void jTableVACUNASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVACUNASMouseClicked

    }//GEN-LAST:event_jTableVACUNASMouseClicked

    private void jTablePENDIENTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePENDIENTESMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablePENDIENTESMouseClicked

    private void jComboBoxMEDICAMENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMEDICAMENTOSActionPerformed
        String medicamento= jComboBoxMEDICAMENTOS.getSelectedItem().toString();
        int indice = this.jComboBoxMEDICAMENTOS.getSelectedIndex();
        
        if (indice == -1) {
            BuscarCoincidenciasxMEDICAMENTO(medicamento);
        }else{
            BuscarDatosMedicamento(medicamento);
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
    id = (String) modelo.getValueAt(filasel, 0);
    BuscarIDMedicamento(id);   
    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TABLAComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLAComponentMoved

    private void buttonTaskQUITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskQUITARActionPerformed
        if(IDMEDICAMENTO!=0){
           int c =Integer.parseInt(String.valueOf(jSpinnerCantMedicamento.getModel().getValue()));        
            BuscarIDConsulta();
            consulta.quitarMedicamentoxOperacion(IDTipoOperacion,IDMEDICAMENTO,c);
            consulta.actualizarStockMedicamento(IDMEDICAMENTO,c,1); // 1 INDICA SUMAR AL STOCK ACTUAL LA CANTIDAD
            limpiarTabla(TABLA);
            modelo = (DefaultTableModel) TABLA.getModel();
            consulta.LlenarTablaMedicamento(modelo,IDFICHA);   
        }else{
            JOptionPane.showMessageDialog(null,"Debe Seleccionar un Ítem de la Lista","Información",JOptionPane.INFORMATION_MESSAGE);
        }             
    }//GEN-LAST:event_buttonTaskQUITARActionPerformed

    private void jComboBoxCATEGORIASPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCATEGORIASPopupMenuWillBecomeVisible
        this.LlenarComboCategoriaMedicamentos();
    }//GEN-LAST:event_jComboBoxCATEGORIASPopupMenuWillBecomeVisible

    private void jComboBoxCATEGORIASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCATEGORIASActionPerformed
     String categoria= jComboBoxCATEGORIAS.getSelectedItem().toString();
        BuscarIDCategoria(categoria);
        BuscarMedicamentosxCategoria(categoria);
    }//GEN-LAST:event_jComboBoxCATEGORIASActionPerformed

    private void buttonTaskAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARActionPerformed
        int c =Integer.parseInt(String.valueOf(jSpinnerCantMedicamento.getModel().getValue()));   
//        String medicameno=this.jComboBoxMEDICAMENTOS.getModel().getSelectedItem().toString();
        
        if(c!=0 || !jComboBoxMEDICAMENTOS.getModel().getSelectedItem().equals("Seleccionar Medicamento")){
            BuscarIDConsulta();
            consulta.agregarMedicamentoxOperacion(IDOperacion,IDMEDICAMENTO,IDTipoOperacion,c);
            consulta.actualizarStockMedicamento(IDMEDICAMENTO,c,2); // 1 INDICA RESTAR AL STOCK ACTUAL LA CANTIDAD SOLICITADA
            limpiarTabla(TABLA);
            modelo = (DefaultTableModel) TABLA.getModel();
            consulta.LlenarTablaMedicamento(modelo,IDOperacion);   
            limpiarCamposMedicamento();
        }else{
           JOptionPane.showMessageDialog(null,"Debe Determinar los Datos del Medicamento a Indicar");
        }        
    }//GEN-LAST:event_buttonTaskAGREGARActionPerformed

    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
        this.dispose();
        ENLACE();
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonActionCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionCANCELARActionPerformed
        this.dispose();
        ENLACE();
    }//GEN-LAST:event_buttonActionCANCELARActionPerformed

    private void jTextAreaDIAGNOSTICOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaDIAGNOSTICOFocusLost
    if(!jComboBoxTIPOCONSULTA.getModel().getSelectedItem().equals("") & !jTextAreaDIAGNOSTICO.getText().equals("")){  
        String categoria= this.jComboBoxTIPOCONSULTA.getModel().getSelectedItem().toString();
        String diagnostico= this.jTextAreaDIAGNOSTICO.getText();
        String veterinario= this.jLabelVETERINARIO.getText();
        String localidad= this.jComboBoxLOCALIDADES.getModel().getSelectedItem().toString();
        String nuevo="Tipo de Operacion "+categoria+"Diagnostico "+diagnostico;
        if(IDLOCALIDAD==0){
          this.BuscarIDLocalidad(localidad);
        } 
        this.BuscarUsuario();
        this.BuscarIDVeterinario(veterinario);
        
        consulta.insertarDatosOperaciones(IDFICHA,fechaActual,IDVETERINARIO,IDLOCALIDAD,IDTipoOperacion,diagnostico);
        consulta.InsertarDatosAuditoria(fechaActual, hor, usuario,"CONSULTAS","ALTA","",nuevo);      
    }else{
        JOptionPane.showMessageDialog(null,"Debe Completar los Campos Obligatorios","Atencion",JOptionPane.WARNING_MESSAGE);        
      }       
    }//GEN-LAST:event_jTextAreaDIAGNOSTICOFocusLost

    private void buttonActionVERIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionVERIFICARActionPerformed
        String formato = "yyyy/MM/dd";
        java.sql.Date fechanacimiento=new Date(jDateChooserFECHATURNO.getDate().getYear(),jDateChooserFECHATURNO.getDate().getMonth(),jDateChooserFECHATURNO.getDate().getDate() );
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String dia = sdf.format(fechanacimiento);
       
        String hora=this.jFormattedTextFieldHORARIO.getText();
        
        int resultado =consulta.VerificarfechaxConsulta(idusuario,IDTipoOperacion,dia,hora);
//////        VERIFICAR QUE SI NO HAY VINCULO CON EL DIA, SI HAY CON EL HORARIO....        
        if(resultado!=0){
           JOptionPane.showMessageDialog(null,"La Fecha y Hora Seleccionados se Encuentran Ocupados","Informacion",JOptionPane.INFORMATION_MESSAGE);
           jFormattedTextFieldHORARIO.setSelectedTextColor(Color.DARK_GRAY);
        }else{
          if(JOptionPane.showConfirmDialog(null,"La Fecha y Hora Seleccionados se Encuentran Disponibles,¿Desea Confirmar el Turno?", "Consulta", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            fechanacimiento=new Date(jDateChooserFECHATURNO.getDate().getYear(),jDateChooserFECHATURNO.getDate().getMonth(),jDateChooserFECHATURNO.getDate().getDate() );
                       
            String h=this.jFormattedTextFieldHORARIO.getText();
            String d = sdf.format(fechanacimiento);
            fecha();              
            consulta.InsertarFechaxOperacion(idusuario,1,d,h);
          }
        }
    }//GEN-LAST:event_buttonActionVERIFICARActionPerformed

    private void jComboBoxLOCALIDADESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLOCALIDADESActionPerformed
       String localidad=jComboBoxLOCALIDADES.getModel().getSelectedItem().toString();       
       BuscarIDLocalidad(localidad);
    }//GEN-LAST:event_jComboBoxLOCALIDADESActionPerformed

    private void jComboBoxTIPOCONSULTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTIPOCONSULTAActionPerformed
     String selec=jComboBoxTIPOCONSULTA.getModel().getSelectedItem().toString();
     BuscarIDTipoConsulta(selec);
     jTextAreaDIAGNOSTICO.requestFocus();
    }//GEN-LAST:event_jComboBoxTIPOCONSULTAActionPerformed

    private void jComboBoxDUEÑOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDUEÑOSActionPerformed
     String dueñoSelec = jComboBoxDUEÑOS.getSelectedItem().toString();
        int indice = jComboBoxDUEÑOS.getSelectedIndex();

        if (indice == -1) {
            BuscarCoincidenciasxDueño(dueñoSelec);
        }else{
            BuscarIDDueño(dueñoSelec);
            LlenarComboMascotas(dueñoSelec);
            LimpiarCampos();
        }
    }//GEN-LAST:event_jComboBoxDUEÑOSActionPerformed

    private void jComboBoxDUEÑOSPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxDUEÑOSPopupMenuWillBecomeVisible
       LlenarComboDueños();
    }//GEN-LAST:event_jComboBoxDUEÑOSPopupMenuWillBecomeVisible

    private void jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible
      LlenarComboTipoOperaciones();
    }//GEN-LAST:event_jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible

    private void jTextAreaDIAGNOSTICOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDIAGNOSTICOKeyTyped
       String diagnostico = this.jTextAreaDIAGNOSTICO.getText();
       if(diagnostico.length()>300){
           evt.consume();           
       }
    }//GEN-LAST:event_jTextAreaDIAGNOSTICOKeyTyped
int idusuario,idrol;String provinciaselec,coincidencia;int indice1;
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
            java.util.logging.Logger.getLogger(AltaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AltaConsulta dialog = new AltaConsulta(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBoxCATEGORIAS;
    private javax.swing.JComboBox jComboBoxDUEÑOS;
    private javax.swing.JComboBox jComboBoxLOCALIDADES;
    private javax.swing.JComboBox jComboBoxMASCOTAS;
    private javax.swing.JComboBox jComboBoxMEDICAMENTOS;
    private javax.swing.JComboBox jComboBoxProvincias;
    private javax.swing.JComboBox jComboBoxTIPOCONSULTA;
    private com.toedter.calendar.JDateChooser jDateChooserFECHATURNO;
    private javax.swing.JFormattedTextField jFormattedTextFieldHORARIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCantiACTUAL;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelEdad1;
    private javax.swing.JLabel jLabelEspecie;
    private javax.swing.JLabel jLabelFECHA;
    private javax.swing.JLabel jLabelOpcionDespar;
    private javax.swing.JLabel jLabelPesoActual;
    private javax.swing.JLabel jLabelPesoActual1;
    private javax.swing.JLabel jLabelProximaDESPAR;
    private javax.swing.JLabel jLabelRaza;
    private javax.swing.JLabel jLabelSituacionPeso;
    private javax.swing.JLabel jLabelTiempoDespar;
    private javax.swing.JLabel jLabelTiempoDespar1;
    public javax.swing.JLabel jLabelVETERINARIO;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSpinner jSpinnerCantMedicamento;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablePENDIENTES;
    private javax.swing.JTable jTableVACUNAS;
    private javax.swing.JTextArea jTextAreaACCION;
    private javax.swing.JTextArea jTextAreaALERGIAS;
    private javax.swing.JTextArea jTextAreaCOMPOSICION;
    private javax.swing.JTextArea jTextAreaDIAGNOSTICO;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables


String fechaActual,hor; int min,añoactual,mesactual,diaactual; 
void fecha(){                                                                                                                                                                                                                                                                                                                                                                                                                                       
    añoactual = Calendario.get(Calendar.YEAR);
    mesactual = Calendario.get(Calendar.MONTH) + 1;
    diaactual = Calendario.get(Calendar.DAY_OF_MONTH);
    
    fechaActual=diaactual+"/"+mesactual+"/"+añoactual;
    
    this.jLabelFECHA.setText(fechaActual);
//    f=new Date(Calendario.get(Calendar.YEAR),Calendario.get(Calendar.MONTH) + 1,Calendario.get(Calendar.DAY_OF_MONTH));
    int h=Calendario.get(Calendar.HOUR_OF_DAY);
    int minutos=Calendario.get(Calendar.MINUTE);        
    hor = String.valueOf(h+":"+minutos);
}
      
  String usuario; 
  private void BuscarUsuario() {
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
  
    private void LlenarComboDueños() {
      try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT apellido,coma,nombre FROM propietarios");                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("apellido")+rs.getString("coma")+rs.getString("nombre"));
            }
            rs.close();
            jComboBoxDUEÑOS.setModel(modeloCombo);            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    private void BuscarCoincidenciasxDueño(String dueñoSelec) {
       try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT apellido,coma,nombre FROM propietarios WHERE apellido LIKE '"+dueñoSelec+"%'");                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("apellido")+rs.getString("coma")+rs.getString("nombre"));
            }
            rs.close();
            jComboBoxDUEÑOS.setModel(modeloCombo);            
        } catch (SQLException ex) {
            ex.getMessage();
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

 private void LlenarComboMascotas(String dueñoSelec) {
     try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT mascota FROM propietarios INNER JOIN fichamedica ON propietarios.id=fichamedica.id WHERE CONCAT(apellido,coma,nombre) LIKE '"+dueñoSelec+"%'");                     
        while (rs.next()) {
           modeloCombo.addElement(rs.getString("mascota"));
        }
        rs.close();
        jComboBoxMASCOTAS.setModel(modeloCombo);            
    } catch (SQLException ex) {
            ex.getMessage();
    } 
 }
String especie="",cumpleaños="";int edad,IDFICHA,idespecie;
private void BuscarDatosMascota(String mascotaSelec) {      
   int pesoActual=0;String situacionpeso="",tiemponac="",raza="";
   try {          
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT fichamedica.id,edad,tiemponac,situacionpeso,especies.id,especies.nombre,kilaje,razas.nombre,cumpleaños FROM fichamedica INNER JOIN razas ON fichamedica.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id WHERE mascota LIKE '"+mascotaSelec+"%'");                     
        while (rs.next()) {   
            IDFICHA=rs.getInt("fichamedica.id");
            situacionpeso=rs.getString("situacionpeso");
            especie=rs.getString("especies.nombre");
            edad=rs.getInt("edad");
            cumpleaños=rs.getString("cumpleaños");
            idespecie=rs.getInt("especies.id");
            tiemponac=rs.getString("tiemponac");
            pesoActual=rs.getInt("kilaje");
            raza=rs.getString("razas.nombre");
           }
           rs.close();           
           this.jLabelEspecie.setText(especie);
           switch (situacionpeso) {
           case "SOBREPESO":
               jLabelSituacionPeso.setForeground(new Color(204,0,0));
               break;
           case "NORMAL":
               jLabelSituacionPeso.setForeground(new Color(0,97,51));
               break;
           case "PESO BAJO":
               jLabelSituacionPeso.setForeground(new Color(255,102,0));
               break;
       }
           this.jLabelSituacionPeso.setText(situacionpeso);
           this.jLabelEdad.setText(String.valueOf(edad));
           this.jLabelEdad1.setText(tiemponac);
           this.jLabelPesoActual.setText(String.valueOf(pesoActual));
           this.jLabelRaza.setText(raza);
           
           BuscarDatosHISTORIAL(IDFICHA);        
            
           int cantidad=consulta.CantVacunas(IDHISTORIAL);
            LlenarTablaVacunas(IDHISTORIAL);
           if(cantidad==0){
             BuscarVacunasPendientes(idespecie,edad,tiemponac); 
           }else{
             if(tiemponac.equals("DIAS")& edad<100 & edad<40){
                 JOptionPane.showMessageDialog(null,"La Edad para Recomendar Vacunas,Debe ser Superior a 45 DIAS","Informacion",JOptionPane.INFORMATION_MESSAGE);
             }else{
                 LlenarTablaPENDIENTES(IDHISTORIAL);
                }             
           }
    } catch (SQLException ex) {
            System.out.print(ex);
    }  
}

private void LlenarComboCategoriaMedicamentos() {
   try {            
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT nombre FROM categoriamedicamento ORDER BY nombre ASC");                     
    while (rs.next()) {
       modeloCombo.addElement(rs.getString("nombre"));
    }
    rs.close();
    jComboBoxCATEGORIAS.setModel(modeloCombo);            
} catch (SQLException ex) {
        ex.getMessage();
} 
 }

private void LimpiarCampos() {
   this.jLabelEdad.setText("");
   this.jLabelPesoActual.setText("");
   this.jLabelEdad1.setText("");
   this.jLabelEspecie.setText("");
   this.jLabelSituacionPeso.setText("");
   this.jLabelRaza.setText("");
   this.jLabelOpcionDespar.setText("");
   
   this.jLabelRaza.setText("");
   this.jLabelTiempoDespar.setText("");
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
int IDHISTORIAL;
private void BuscarDatosHISTORIAL(int IDFICHA) {
  int opcionDesparasitado=0;String tiempodespar="",alergias="";
   try {          
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT id,opcionvacunas,opcionDesparasitado,DATE_FORMAT(fechadespar,'%d/%m/%Y') AS fecha,alergias FROM historialclinico WHERE idficha="+IDFICHA);                     
        while (rs.next()) {   
            IDHISTORIAL=rs.getInt("id");  
            opcionDesparasitado=rs.getInt("opcionDesparasitado"); 
            
            tiempodespar=rs.getString("fecha"); 
            alergias=rs.getString("alergias"); 
           }
           rs.close();
           fecha();
           if(opcionDesparasitado==1){ 
//              int dia=Integer.parseInt(tiempodespar.substring(0,2)); 
              int mes=Integer.parseInt(tiempodespar.substring(3,5)); 
              int año=Integer.parseInt(tiempodespar.substring(6,10)); 
              mes=mes+6;             
             
             if(mes>12){
                mes=mes-6;
                añoactual=añoactual+1;
                String proxdespar=diaactual+"/"+mes+"/"+añoactual;       
                jLabelProximaDESPAR.setText(proxdespar);                               
             }else{
                if(año==añoactual){
                   String proxdespar=diaactual+"/"+mes+"/"+añoactual;       
                   jLabelProximaDESPAR.setText(proxdespar);
                }else{
                   String proxdespar=diaactual+1+"/"+mes+"/"+añoactual;       
                   jLabelProximaDESPAR.setText(proxdespar);
                }
             }           
              jLabelOpcionDespar.setText("Si");
              jLabelTiempoDespar.setText(tiempodespar);        
           }else{              
              jLabelProximaDESPAR.setText(fechaActual);            
            
              this.jLabelOpcionDespar.setText("");
              this.jLabelTiempoDespar.setText("");
           }
           
           this.jTextAreaALERGIAS.setText(alergias);
           
    } catch (SQLException ex) {
            ex.getMessage();
    }  
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
     String   sSQL = "SELECT id,accion,composicion,cantactual FROM medicamentos WHERE nombre LIKE '"+medicamento+"%'";
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
            {
               IDMEDICAMENTO=rs.getInt("id");
               accion=rs.getString("accion");
               composicion=rs.getString("composicion");
               cantactual=rs.getInt("cantactual");
            }
            jTextAreaCOMPOSICION.setText(composicion);
            jTextAreaACCION.setText(accion);
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
      this.jTextAreaACCION.setText("");
      this.jTextAreaCOMPOSICION.setText("");
      this.jLabelCantiACTUAL.setText("");
      this.jSpinnerCantMedicamento.setValue(0);
    }
    

 private void BuscarVacunasPendientes(int especie,int edad,String tiemponac) {
    String[] titulos = {"Vacuna Pendiente","Tipo"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    String sSQL = "";
    String[] registro = new String[2];
        
        if(tiemponac.equals("DIAS")& edad<100 & edad<40){
           JOptionPane.showMessageDialog(null,"La Edad para Recomendar Vacunas,Debe ser Superior a 45 DIAS","Informacion",JOptionPane.INFORMATION_MESSAGE);
        }else{
           if(tiemponac.equals("DIAS")){
              sSQL ="SELECT nombre FROM controlvacunas WHERE idespecie="+especie; 
            }else if(tiemponac.equals("DIAS")& edad<100){
               sSQL ="SELECT nombre FROM controlvacunas WHERE idespecie="+especie; 
            }else if(tiemponac.equals("DIAS") || tiemponac.equals("MESES") || tiemponac.equals("AÑOS")){
               sSQL ="SELECT nombre, condicion FROM controlvacunas WHERE idespecie="+especie;  
            }
        }
        
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
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           } 
    }
 
  private void BuscarCoincidenciasxProv(String seleccion) {
      try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM  provincia WHERE nombre LIKE '"+seleccion+"%' ORDER BY nombre ASC");

        while (rs.next()) {
            modeloCombo.addElement(rs.getString("nombre"));
        }
        rs.close();
        this.jComboBoxProvincias.setModel(modeloCombo);
    } catch (SQLException ex) {
        ex.getMessage();
    }    
    }
   
   private void LlenarComboProvincias() {
    try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM provincia ORDER BY nombre ASC");

        while (rs.next()) {
            modeloCombo.addElement(rs.getString("nombre"));
        }
        rs.close();
        this.jComboBoxProvincias.setModel(modeloCombo);
        
    } catch (SQLException ex) {
        ex.getMessage();
    }  
    }
   
   int IDProvincia;
 private void BuscarIDProvincia(String seleccion) {
     try {            
        
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT id FROM provincia WHERE nombre LIKE '"+seleccion+"%'");

        while (rs.next()) {
           IDProvincia=rs.getInt("id");
        }
        rs.close();        
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
 
 private void limpiarTabla(JTable tab) {
         while(tab.getRowCount()>0){//se recorren todas las filas
         ((javax.swing.table.DefaultTableModel) tab.getModel()).removeRow(0);
       }
    }
 
private void llenarComboLocalidades(String seleccion) {
       try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT localidades.nombre FROM provincia INNER JOIN localidades ON provincia.id=localidades.idprovincia WHERE provincia.nombre LIKE '"+seleccion+"%' ORDER BY localidades.nombre ASC ");

        while (rs.next()) {
            modeloCombo.addElement(rs.getString("localidades.nombre"));
        }
        rs.close();
        this.jComboBoxLOCALIDADES.setModel(modeloCombo);
        
    } catch (SQLException ex) {
        ex.getMessage();
    } 
}

 private void LlenarTablaVacunas(int IDHISTORIAL) {
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

private void BuscarIDMedicamento(String medicamento) {
  try {       
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT id FROM medicamentos WHERE nombre LIKE '"+medicamento+"%'");

    while (rs.next()) {
       IDMEDICAMENTO=rs.getInt("id");           
    }
    rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();  
   }
}

int IDLOCALIDAD; 
private void BuscarIDLocalidad(String localidad) {
 try {       
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT id FROM LOCALIDADES WHERE nombre LIKE '"+localidad+"%'");

    while (rs.next()) {
       IDLOCALIDAD=rs.getInt("id");           
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

private void LlenarTablaPENDIENTES(int IDHISTORIAL) {
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
        } catch (Exception e) {
            System.out.print(e);
        }
    }

}

