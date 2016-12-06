package PANTALLAS;

import CLASES.ClaseOperaciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Vero
 */
public class AltaCirugia extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    ClaseOperaciones cirugia=new ClaseOperaciones();
    Calendar Calendario = Calendar.getInstance();  
    DefaultTableModel modelo;
    public AltaCirugia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

      @SuppressWarnings("unchecked")int idusuario,idrol;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        jComboBoxDUEÑOS = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxMASCOTAS = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel16 = new javax.swing.JLabel();
        jComboBoxTIPOCONSULTA = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDIAGNOSTICO = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jDateChooserFECHATURNO = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttonActionVERIFICAR = new org.edisoncor.gui.button.ButtonAction();
        jFormattedTextFieldHORARIO = new javax.swing.JFormattedTextField();
        buttonActionCANCELAR = new org.edisoncor.gui.button.ButtonAction();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxMEDICAMENTOS = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jSpinnerCantMedicamento = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TABLA1 = new javax.swing.JTable();
        buttonTaskQUITAR = new org.edisoncor.gui.button.ButtonTask();
        jComboBoxCATEGORIAS = new javax.swing.JComboBox();
        jLabelCantiACTUAL = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        buttonTaskAGREGAR = new org.edisoncor.gui.button.ButtonTask();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCOMPOSICION = new javax.swing.JTextArea();
        jLabelVETERINARIO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("AltaCirugia");

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CIRUGIAS");

        jPanel1.setBackground(new java.awt.Color(141, 141, 175));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DETERMINAR ZONA DE OPERACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DETALLE DE LA CIRUGIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ZONAS", "SECCION"
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("(*)");

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

        jPanel2.setBackground(new java.awt.Color(141, 141, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DE LA MASCOTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPesoActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSituacionPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPesoActual1))
                    .addComponent(jLabelPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSituacionPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Concepto(*)");

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

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Observaciones(*)");

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
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jDateChooserFECHATURNO, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldHORARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(buttonActionVERIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonActionVERIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jFormattedTextFieldHORARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserFECHATURNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)))
        );

        buttonActionCANCELAR.setBackground(new java.awt.Color(204, 204, 255));
        buttonActionCANCELAR.setText("CANCELAR");
        buttonActionCANCELAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionCANCELARActionPerformed(evt);
            }
        });

        buttonActionGUARDAR.setBackground(new java.awt.Color(204, 204, 255));
        buttonActionGUARDAR.setText("GUARDAR");
        buttonActionGUARDAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionGUARDARActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(141, 141, 175));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "MEDICAMENTOS A RECETAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
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

        TABLA1.setModel(new javax.swing.table.DefaultTableModel(
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
        TABLA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLA1MouseClicked(evt);
            }
        });
        TABLA1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                TABLA1ComponentMoved(evt);
            }
        });
        jScrollPane4.setViewportView(TABLA1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jComboBoxMEDICAMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTaskQUITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCATEGORIAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxMEDICAMENTOS))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinnerCantMedicamento)
                        .addComponent(jLabel23))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelCantiACTUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskQUITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLabelVETERINARIO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelVETERINARIO.setForeground(new java.awt.Color(153, 0, 0));
        jLabelVETERINARIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVETERINARIO.setText("jLabel4");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("VETERINARIO");

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addComponent(jComboBoxDUEÑOS, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxMASCOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(31, 31, 31)
                                .addComponent(jComboBoxTIPOCONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelVETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(487, 487, 487))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelVETERINARIO))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxDUEÑOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxMASCOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBoxTIPOCONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked

    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TABLAComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLAComponentMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    SeccionesCirugia sc=new SeccionesCirugia(new javax.swing.JFrame(), true);
    sc.idespecie=idespecie;
    
    if(idespecie==1){
       sc.panelImage1.setIcon(new ImageIcon(getClass().getResource("/siluetadeperro.png")));
       sc.jRadioButtonCABEZAPERRO.setVisible(true);
       sc.jRadioButtonCUELLOPERRO.setVisible(true);
       sc.jRadioButtonPATASDELANTERASGATO.setVisible(true);
       sc.jRadioButtonATRAS.setVisible(true);
       sc.jRadioButtonTRONCO.setVisible(true);
       sc.jRadioButtonCABEZAGATO.setVisible(false);
       sc.jRadioButtonPATASDELANTERASGATO.setVisible(false);
       sc.jRadioButtonCUELLOGATO.setVisible(false);
    }else if(idespecie==2){
        sc.panelImage1.setIcon(new ImageIcon(getClass().getResource("/silueta de gato2.png")));
        sc.jRadioButtonCABEZAPERRO.setVisible(false);
        sc.jRadioButtonCUELLOPERRO.setVisible(false);
        sc.jRadioButtonCABEZAGATO.setVisible(true);
        sc.jRadioButtonPATASDELANTERASGATO.setVisible(true);
    }
    this.dispose();
    sc.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxDUEÑOSPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxDUEÑOSPopupMenuWillBecomeVisible
        LlenarComboDueños();
    }//GEN-LAST:event_jComboBoxDUEÑOSPopupMenuWillBecomeVisible

    private void jComboBoxDUEÑOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDUEÑOSActionPerformed
        String dueñoSelec = jComboBoxDUEÑOS.getSelectedItem().toString();
        int indice = jComboBoxDUEÑOS.getSelectedIndex();

        if (indice == -1) {
            BuscarCoincidenciasxDueño(dueñoSelec);
        }else{
            BuscarIDDueño(dueñoSelec);
            LlenarComboMascotas(IDPROPIETARIO);
            LimpiarCampos();
        }
    }//GEN-LAST:event_jComboBoxDUEÑOSActionPerformed

    private void jComboBoxMASCOTASPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxMASCOTASPopupMenuWillBecomeVisible
        this.LimpiarCampos();
    }//GEN-LAST:event_jComboBoxMASCOTASPopupMenuWillBecomeVisible

    private void jComboBoxMASCOTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMASCOTASActionPerformed
        String mascotaSelec = this.jComboBoxMASCOTAS.getSelectedItem().toString();
        BuscarDatosMascota(mascotaSelec);
    }//GEN-LAST:event_jComboBoxMASCOTASActionPerformed

    private void jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible
        LlenarComboTipoOperaciones();
    }//GEN-LAST:event_jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible

    private void jComboBoxTIPOCONSULTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTIPOCONSULTAActionPerformed
        String selec=jComboBoxTIPOCONSULTA.getModel().getSelectedItem().toString();
        BuscarIDTipoConsulta(selec);
        jTextAreaDIAGNOSTICO.requestFocus();
    }//GEN-LAST:event_jComboBoxTIPOCONSULTAActionPerformed

    private void jTextAreaDIAGNOSTICOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaDIAGNOSTICOFocusLost
        if(!jComboBoxTIPOCONSULTA.getModel().getSelectedItem().equals("") & !jTextAreaDIAGNOSTICO.getText().equals("")){
            String categoria= this.jComboBoxTIPOCONSULTA.getModel().getSelectedItem().toString();
            String diagnostico= this.jTextAreaDIAGNOSTICO.getText();
            String veterinario= this.jLabelVETERINARIO.getText();

            String nuevo="Tipo de Operacion "+categoria+"Diagnostico "+diagnostico;

            BuscarIDLocalidad();
            
            BuscarUsuario();
            BuscarIDVeterinario(veterinario);

            cirugia.insertarDatosOperaciones(IDFICHA,fechaActual,IDVETERINARIO,IDLOCALIDAD,IDTipoOperacion,diagnostico);
            cirugia.InsertarDatosAuditoria(fechaActual, hor, usuario,"CONSULTAS","ALTA","",nuevo);
        }else{
            JOptionPane.showMessageDialog(null,"Debe Completar los Campos Obligatorios","Atencion",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextAreaDIAGNOSTICOFocusLost

    private void jTextAreaDIAGNOSTICOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDIAGNOSTICOKeyTyped
        String diagnostico = this.jTextAreaDIAGNOSTICO.getText();
        if(diagnostico.length()>300){
            evt.consume();
        }
    }//GEN-LAST:event_jTextAreaDIAGNOSTICOKeyTyped

    private void buttonActionVERIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionVERIFICARActionPerformed
        String formato = "yyyy/MM/dd";
        java.sql.Date fechanacimiento=new Date(jDateChooserFECHATURNO.getDate().getYear(),jDateChooserFECHATURNO.getDate().getMonth(),jDateChooserFECHATURNO.getDate().getDate() );
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String dia = sdf.format(fechanacimiento);

        String hora=this.jFormattedTextFieldHORARIO.getText();

        int resultado =cirugia.VerificarfechaxConsulta(idusuario,IDTipoOperacion,dia,hora);
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
                cirugia.InsertarFechaxOperacion(idusuario,1,d,h);
            }
        }
    }//GEN-LAST:event_buttonActionVERIFICARActionPerformed

    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
        this.dispose();
        ENLACE();
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonActionCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionCANCELARActionPerformed
        this.dispose();
        ENLACE();
    }//GEN-LAST:event_buttonActionCANCELARActionPerformed

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

    private void TABLA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLA1MouseClicked
        buttonTaskQUITAR.setVisible(true);
        String id;

        int filasel = TABLA.getSelectedRow();
        modelo = (javax.swing.table.DefaultTableModel) TABLA.getModel();
        id = (String) modelo.getValueAt(filasel, 0);
        BuscarIDMedicamento(id);
    }//GEN-LAST:event_TABLA1MouseClicked

    private void TABLA1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TABLA1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLA1ComponentMoved

    private void buttonTaskQUITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskQUITARActionPerformed
        if(IDMEDICAMENTO!=0){
            int c =Integer.parseInt(String.valueOf(jSpinnerCantMedicamento.getModel().getValue()));
            BuscarIDConsulta();
            cirugia.quitarMedicamentoxOperacion(IDTipoOperacion,IDMEDICAMENTO,c);
            cirugia.actualizarStockMedicamento(IDMEDICAMENTO,c,1); // 1 INDICA SUMAR AL STOCK ACTUAL LA CANTIDAD
            limpiarTabla(TABLA);
            modelo = (DefaultTableModel) TABLA.getModel();
            cirugia.LlenarTablaMedicamento(modelo,IDFICHA);
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
            cirugia.agregarMedicamentoxOperacion(IDOperacion,IDMEDICAMENTO,c);
            cirugia.actualizarStockMedicamento(IDMEDICAMENTO,c,2); // 1 INDICA RESTAR AL STOCK ACTUAL LA CANTIDAD SOLICITADA
            limpiarTabla(TABLA);
            modelo = (DefaultTableModel) TABLA.getModel();
            cirugia.LlenarTablaMedicamento(modelo,IDOperacion);
            limpiarCamposMedicamento();
        }else{
            JOptionPane.showMessageDialog(null,"Debe Determinar los Datos del Medicamento a Indicar");
        }
    }//GEN-LAST:event_buttonTaskAGREGARActionPerformed

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
            java.util.logging.Logger.getLogger(AltaCirugia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaCirugia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaCirugia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaCirugia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AltaCirugia dialog = new AltaCirugia(new javax.swing.JFrame(), true);
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
    public javax.swing.JTable TABLA1;
    private org.edisoncor.gui.button.ButtonAction buttonActionCANCELAR;
    public org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    private org.edisoncor.gui.button.ButtonAction buttonActionVERIFICAR;
    private org.edisoncor.gui.button.ButtonTask buttonTaskAGREGAR;
    private org.edisoncor.gui.button.ButtonTask buttonTaskQUITAR;
    public javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxCATEGORIAS;
    private javax.swing.JComboBox jComboBoxDUEÑOS;
    private javax.swing.JComboBox jComboBoxMASCOTAS;
    private javax.swing.JComboBox jComboBoxMEDICAMENTOS;
    private javax.swing.JComboBox jComboBoxTIPOCONSULTA;
    private com.toedter.calendar.JDateChooser jDateChooserFECHATURNO;
    private javax.swing.JFormattedTextField jFormattedTextFieldHORARIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCantiACTUAL;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelEdad1;
    private javax.swing.JLabel jLabelEspecie;
    private javax.swing.JLabel jLabelPesoActual;
    private javax.swing.JLabel jLabelPesoActual1;
    private javax.swing.JLabel jLabelRaza;
    private javax.swing.JLabel jLabelSituacionPeso;
    public javax.swing.JLabel jLabelVETERINARIO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinnerCantMedicamento;
    private javax.swing.JTextArea jTextAreaCOMPOSICION;
    private javax.swing.JTextArea jTextAreaDIAGNOSTICO;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

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

 private void LlenarComboMascotas(int dueñoSelec) {
     try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT mascota FROM propietarios INNER JOIN fichamedica ON propietarios.id=fichamedica.idpropietario WHERE propietarios.id="+dueñoSelec);                     
        while (rs.next()) {
           modeloCombo.addElement(rs.getString("mascota"));
        }
        rs.close();
        jComboBoxMASCOTAS.setModel(modeloCombo);            
    } catch (SQLException ex) {
            ex.getMessage();
    } 
 }
String especie="";int edad,IDFICHA,idespecie;
private void BuscarDatosMascota(String mascotaSelec) {
   int pesoActual=0;String situacionpeso="",tiemponac="",raza="";
   try {          
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT fichamedica.id,edad,tiemponac,situacionpeso,especies.id,especies.nombre,kilaje,razas.nombre FROM fichamedica INNER JOIN razas ON fichamedica.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id WHERE mascota LIKE '"+mascotaSelec+"%'");                     
        while (rs.next()) {   
            IDFICHA=rs.getInt("id");
            situacionpeso=rs.getString("situacionpeso");
            especie=rs.getString("especies.nombre");
            edad=rs.getInt("edad");
            idespecie=rs.getInt("especies.id");
            tiemponac=rs.getString("tiemponac");
            pesoActual=rs.getInt("kilaje");
            raza=rs.getString("razas.nombre");
           }
           rs.close();
           
           this.jLabelEspecie.setText(especie);
           if(idespecie==1){
             jButton1.setIcon(new ImageIcon(getClass().getResource("/siluetadeperro.png")));
           }else if(idespecie==2){
              jButton1.setIcon(new ImageIcon(getClass().getResource("/silueta de gato2.png")));
           }
           switch (situacionpeso) {
           case "SOBREPESO":
               jLabelSituacionPeso.setForeground(Color.red);
               break;
           case "NORMAL":
               jLabelSituacionPeso.setForeground(Color.GREEN);
               break;
           case "PESO BAJO":
               jLabelSituacionPeso.setForeground(Color.ORANGE);
               break;
       }
           this.jLabelSituacionPeso.setText(situacionpeso);
           this.jLabelEdad.setText(String.valueOf(edad));
           this.jLabelEdad1.setText(tiemponac);
           this.jLabelPesoActual.setText(String.valueOf(pesoActual));
           this.jLabelRaza.setText(raza);
          
    
//           aca iria la busqueda de las vacunas faltantes.. y si fue desparasitado...
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
            ResultSet rs = st.executeQuery("SELECT nombre FROM tipooperacion WHERE idcategoria=2 ORDER BY nombre ASC");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("nombre"));
            }
            rs.close();
            this.jComboBoxTIPOCONSULTA.setModel(modeloCombo);
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
  int IDVETERINARIO;
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

String fechaActual,hor; int min,añoactual,mesactual,diaactual; 
void fecha(){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    añoactual = Calendario.get(Calendar.YEAR);
    mesactual = Calendario.get(Calendar.MONTH) + 1;
    diaactual = Calendario.get(Calendar.DAY_OF_MONTH);
    
    fechaActual=diaactual+"/"+mesactual+"/"+añoactual;    
 
//    f=new Date(Calendario.get(Calendar.YEAR),Calendario.get(Calendar.MONTH) + 1,Calendario.get(Calendar.DAY_OF_MONTH));
    int h=Calendario.get(Calendar.HOUR_OF_DAY);
    int minutos=Calendario.get(Calendar.MINUTE);        
    hor = String.valueOf(h+":"+minutos);
} 

private void ENLACE() {
  int L=0,ES=0,MOD=0,ELI=0;
  GestionCirugia esp=new GestionCirugia(new javax.swing.JFrame(), true);
  esp.IDROL=idrol; 
      try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+idrol;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {                                
              L=rs.getInt("L_CIRUGIA");
              ES=rs.getInt("ESC_CIRUGIA");
              MOD=rs.getInt("MOD_CIRUGIA");
              ELI=rs.getInt("ELIM_CIRUGIA");               
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

int IDMEDICAMENTO,cantactual;
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

 private void limpiarTabla(JTable tab) {
         while(tab.getRowCount()>0){//se recorren todas las filas
         ((javax.swing.table.DefaultTableModel) tab.getModel()).removeRow(0);
       }
    }
 
 private void limpiarCamposMedicamento() {
//      this.jTextAreaACCION.setText("");
      this.jTextAreaCOMPOSICION.setText("");
      this.jLabelCantiACTUAL.setText("");
      this.jSpinnerCantMedicamento.setValue(0);
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

}
