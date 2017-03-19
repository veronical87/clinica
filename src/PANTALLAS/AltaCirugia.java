package PANTALLAS;

import CLASES.ClaseOperaciones;
import CLASES.ClaseFichasMedicas;
import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class AltaCirugia extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();   
    CallableStatement cmd,cmd2;
    ClaseOperaciones consulta=new ClaseOperaciones();
    ClaseFichasMedicas ficha=new ClaseFichasMedicas();
    Calendar Calendario = Calendar.getInstance();  
    DefaultTableModel modelo;
    GregorianCalendar hoy = new GregorianCalendar();    
    public AltaCirugia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); 
        buttonTaskQUITAR.setVisible(false);
        jLabelVETERINARIO.setVisible(true); 
        buttonTaskAGREGAR.setToolTipText("Guardar");
        buttonTaskQUITAR.setToolTipText("Quitar");
        jDateChooserFECHATURNO.setMinSelectableDate(hoy.getTime()); 
        this.jComboBoxMASCOTAS.setEnabled(false);
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
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaALERGIAS = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelEspecie = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelEdad1 = new javax.swing.JLabel();
        jLabelPesoActual = new javax.swing.JLabel();
        jLabelPesoActual1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelRaza = new javax.swing.JLabel();
        jLabelPesoActual2 = new javax.swing.JLabel();
        jLabelSEXO = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxMASCOTAS = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextAreaSituacionPeso = new javax.swing.JTextArea();
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
        jComboBoxDUEÑOS = new javax.swing.JComboBox();
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
        jPanel1 = new javax.swing.JPanel();
        jButtonSECCIONES = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TABLADETALLE = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Alta Cirugía");

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CIRUGÍAS");

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

        jPanel8.setBackground(new java.awt.Color(141, 141, 175));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "ALERGIAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(141, 141, 175));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "DATOS DE LA MASCOTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Edad");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Especie");

        jLabelEdad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEdad.setOpaque(true);

        jLabelEspecie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspecie.setOpaque(true);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Peso Actual");

        jLabelEdad1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEdad1.setOpaque(true);

        jLabelPesoActual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPesoActual.setForeground(new java.awt.Color(153, 0, 0));
        jLabelPesoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesoActual.setOpaque(true);

        jLabelPesoActual1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPesoActual1.setForeground(new java.awt.Color(153, 0, 0));
        jLabelPesoActual1.setText("Kilos");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Raza");

        jLabelRaza.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRaza.setOpaque(true);

        jLabelPesoActual2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPesoActual2.setText("Sexo");

        jLabelSEXO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSEXO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSEXO.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelEdad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelPesoActual2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPesoActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jLabelPesoActual2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabelEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPesoActual1)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Seleccione una Mascota(*)");

        jComboBoxMASCOTAS.setBackground(new java.awt.Color(153, 153, 255));
        jComboBoxMASCOTAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxMASCOTAS.setForeground(new java.awt.Color(0, 102, 102));
        jComboBoxMASCOTAS.setOpaque(false);
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

        jPanel10.setBackground(new java.awt.Color(141, 141, 175));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "SITUACIÓN DEL  PESO DE LA MASCOTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTextAreaSituacionPeso.setEditable(false);
        jTextAreaSituacionPeso.setColumns(20);
        jTextAreaSituacionPeso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextAreaSituacionPeso.setRows(5);
        jTextAreaSituacionPeso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane8.setViewportView(jTextAreaSituacionPeso);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMASCOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMASCOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(141, 141, 175));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "MEDICAMENTOS A RECETAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Categoría");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, -1, -1));

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
        jPanel5.add(jComboBoxMEDICAMENTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 16, 260, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Cant.Actual");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 47, -1, 21));

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
        jPanel5.add(jSpinnerCantMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 47, 47, -1));

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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 150, 520, -1));

        buttonTaskQUITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/eliminar-icono-6226-32.png"))); // NOI18N
        buttonTaskQUITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskQUITARActionPerformed(evt);
            }
        });
        jPanel5.add(buttonTaskQUITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 211, 40, 46));

        jComboBoxCATEGORIAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxCATEGORIAS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Categoría" }));
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
        jPanel5.add(jComboBoxCATEGORIAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 16, 205, -1));

        jLabelCantiACTUAL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCantiACTUAL.setForeground(new java.awt.Color(153, 0, 0));
        jLabelCantiACTUAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantiACTUAL.setOpaque(true);
        jPanel5.add(jLabelCantiACTUAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 47, 40, 19));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Cant.Dosis");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 47, -1, 21));

        buttonTaskAGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/agregar-icono-5633-32.png"))); // NOI18N
        buttonTaskAGREGAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonTaskAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskAGREGARActionPerformed(evt);
            }
        });
        jPanel5.add(buttonTaskAGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 40, 49));

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 74, 520, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Seleccionar Dueño  (*)");

        jComboBoxDUEÑOS.setEditable(true);
        jComboBoxDUEÑOS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxDUEÑOS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Cliente" }));
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

        jComboBoxHORA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxHORA.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxHORAPopupMenuWillBecomeVisible(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jDateChooserFECHATURNO, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxHORA, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(buttonActionVERIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buttonActionVERIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDateChooserFECHATURNO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxHORA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );

        jPanel1.setBackground(new java.awt.Color(141, 141, 175));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "INDIQUE LA SECCIÓN A OPERAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButtonSECCIONES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSECCIONESActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonSECCIONES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonSECCIONES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(141, 141, 175));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "DETALLE DE LA OPERACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        TABLADETALLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ZONA", "SECCIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLADETALLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLADETALLEMouseClicked(evt);
            }
        });
        TABLADETALLE.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                TABLADETALLEComponentMoved(evt);
            }
        });
        jScrollPane4.setViewportView(TABLADETALLE);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxDUEÑOS, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTIPOCONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel12)
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDUEÑOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel16))
                            .addComponent(jComboBoxTIPOCONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addGap(518, 518, 518)
                        .addComponent(jLabelVETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(524, 524, 524)
                .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int idrol,idusuario,CABEZA,CUELLO,ATRAS,ADELANTE,TRONCO;String veterinario;
    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
  if(!jComboBoxTIPOCONSULTA.getModel().getSelectedItem().equals("Seleccione Concepto") & !jTextAreaDIAGNOSTICO.getText().equals("") || !jComboBoxMEDICAMENTOS.getModel().getSelectedItem().equals("")){
        String categoria= this.jComboBoxTIPOCONSULTA.getModel().getSelectedItem().toString();
        String diagnostico= this.jTextAreaDIAGNOSTICO.getText();
        veterinario= this.jLabelVETERINARIO.getText();
        String nuevo="Tipo de Operación "+categoria+"Diagnóstico "+diagnostico+"Veterinario "+veterinario;
//        this.BuscarDatosMascota(mascotaSelec,IDPROPIETARIO);   
        this.BuscarIDTipoConsulta(categoria);
        this.fecha();
        this.BuscarUsuario();
        this.BuscarIDConsulta();
        this.BuscarIDLocalidad();
        this.BuscarIDVeterinario(veterinario);

        consulta.modificarDatosOperaciones(IDOperacion, fechaActual, IDVETERINARIO, IDLOCALIDAD, IDTipoOperacion, diagnostico);
        consulta.InsertarDatosAuditoria(fechaActual,hor,usuario,"CIRUGIAS","ALTA","",nuevo);
                       
        if(idespecie==1){           
           if(ATRAS!=0){
              ReporteCirugiaPERROATRAS(IDOperacion,usuario);
           }else if(CABEZA!=0){
              ReporteCirugiaPERROCABEZA(IDOperacion,usuario);
           }else if(CUELLO!=0){
              ReporteCirugiaPERROCUELLO(IDOperacion,usuario);
           }else if(ADELANTE!=0){
              ReporteCirugiaPERROADELANTE(IDOperacion,usuario);
           }else if(TRONCO!=0){
              ReporteCirugiaPERROTRONCO(IDOperacion,usuario);
           }        
        }else if(idespecie==2){
           if(ATRAS!=0){
              ReporteCirugiaFELINAATRAS(IDOperacion,usuario);
           }else if(CABEZA!=0){
              ReporteCirugiaFELINACABEZA(IDOperacion,usuario);
           }else if(CUELLO!=0){
              ReporteCirugiaFELINACUELLO(IDOperacion,usuario);
           }else if(ADELANTE!=0){
              ReporteCirugiaFELINAADELANTE(IDOperacion,usuario);
           }else if(TRONCO!=0){
              ReporteCirugiaFELINATRONCO(IDOperacion,usuario);
           }
        }
        dispose();
        ENLACE();            
    }else{
        JOptionPane.showMessageDialog(null,"Debe Completar los Campos Obligatorios","Atención",JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonActionCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionCANCELARActionPerformed
        this.dispose();
        ENLACE();
    }//GEN-LAST:event_buttonActionCANCELARActionPerformed

    private void jComboBoxMASCOTASPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxMASCOTASPopupMenuWillBecomeVisible
        LlenarComboMascotas(IDPROPIETARIO);
    }//GEN-LAST:event_jComboBoxMASCOTASPopupMenuWillBecomeVisible
String mascotaSelec;boolean banderamascota;
    private void jComboBoxMASCOTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMASCOTASActionPerformed
       if(banderamascota==true){
       
       }else{
         mascotaSelec =String.valueOf(jComboBoxMASCOTAS.getSelectedItem());
         BuscarDatosMascota(mascotaSelec,IDPROPIETARIO);
       }              
    }//GEN-LAST:event_jComboBoxMASCOTASActionPerformed

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
            this.BuscarIDMedicamento(medicamentoselec);
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
            //            int c =Integer.parseInt(String.valueOf(jSpinnerCantMedicamento.getModel().getValue()));
            BuscarIDConsulta();
            consulta.quitarMedicamentoxOperacion(IDMEDICAMENTO,IDTipoOperacion);
            consulta.actualizarStockMedicamento(IDMEDICAMENTO,cantMedicamento,1); // 1 INDICA SUMAR AL STOCK ACTUAL LA CANTIDAD
            limpiarTabla(TABLA);

            LlenarTablaMedicamento(IDTipoOperacion);
        }else{
            JOptionPane.showMessageDialog(null,"Debe Seleccionar un Ítem de la Lista","Información",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskQUITARActionPerformed

    private void jComboBoxCATEGORIASPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCATEGORIASPopupMenuWillBecomeVisible
        this.LlenarComboCategoriaMedicamentos(IDTipoOperacion);
    }//GEN-LAST:event_jComboBoxCATEGORIASPopupMenuWillBecomeVisible

    private void jComboBoxCATEGORIASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCATEGORIASActionPerformed
        String categoria= jComboBoxCATEGORIAS.getSelectedItem().toString();
        BuscarIDCategoria(categoria);
        BuscarMedicamentosxCategoria(categoria);
    }//GEN-LAST:event_jComboBoxCATEGORIASActionPerformed

    private void buttonTaskAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARActionPerformed
    int c =Integer.parseInt(String.valueOf(jSpinnerCantMedicamento.getModel().getValue()));
    if (c!=0)  {
        BuscarIDConsulta();
        consulta.agregarMedicamentoxOperacion(IDOperacion,IDMEDICAMENTO,c);
        consulta.actualizarStockMedicamento(IDMEDICAMENTO,c,2); // 1 INDICA RESTAR AL STOCK ACTUAL LA CANTIDAD SOLICITADA
        limpiarTabla(TABLA);
        LlenarTablaMedicamento(IDOperacion);  
        limpiarCamposMedicamento();
    }else{
        JOptionPane.showMessageDialog(null,"Debe indicar la Cantidad del Medicamento","Atención",JOptionPane.WARNING_MESSAGE);
    }        
    }//GEN-LAST:event_buttonTaskAGREGARActionPerformed

    private void jComboBoxDUEÑOSPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxDUEÑOSPopupMenuWillBecomeVisible
        LlenarComboDueños();
    }//GEN-LAST:event_jComboBoxDUEÑOSPopupMenuWillBecomeVisible
String dueñoSelec;boolean banderaDueño;
    private void jComboBoxDUEÑOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDUEÑOSActionPerformed
      if(banderaDueño==true){
      
      }else{
            this.jComboBoxMASCOTAS.setEnabled(true);
           dueñoSelec = jComboBoxDUEÑOS.getSelectedItem().toString();
            //        EnvioCorreoPropietarios(dueñoSelec);
            int indice = jComboBoxDUEÑOS.getSelectedIndex();

            if (indice == -1) {
                BuscarCoincidenciasxDueño(dueñoSelec);
            }else{
                BuscarIDDueño(dueñoSelec);
                LlenarComboMascotas(IDPROPIETARIO);
                LimpiarCamposDATOSMASCOTA();
            }
      }        
    }//GEN-LAST:event_jComboBoxDUEÑOSActionPerformed

    private void jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible
        LlenarComboTipoOperaciones();
    }//GEN-LAST:event_jComboBoxTIPOCONSULTAPopupMenuWillBecomeVisible

    private void jComboBoxTIPOCONSULTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTIPOCONSULTAActionPerformed
        String selec=jComboBoxTIPOCONSULTA.getModel().getSelectedItem().toString();
        BuscarIDTipoConsulta(selec);
        HabilitarSeccionOperacion();
        LlenarComboCategoriaMedicamentos(IDTipoOperacion);
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
        }
    }//GEN-LAST:event_buttonActionVERIFICARActionPerformed

    private void jButtonSECCIONESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSECCIONESActionPerformed
      fecha(); 
      veterinario=this.jLabelVETERINARIO.getText();
      BuscarIDVeterinario(veterinario);      
      BuscarIDLocalidad();
      consulta.insertarDatosOperaciones(IDFICHA,fechaActual,IDVETERINARIO, IDLOCALIDAD,4,"",2);
      BuscarIDConsulta();
      SeccionesCirugia sc=new SeccionesCirugia(new javax.swing.JFrame(), true);
      sc.idespecie=idespecie;
      sc.idficha=IDFICHA;
      sc.dueño=dueñoSelec;
      sc.mascota=mascotaSelec;
      sc.IDOperacion=IDOperacion;
      sc.IDDUEÑO=IDPROPIETARIO;
      sc.IDVETERINARIO=IDVETERINARIO;
      sc.veterinario=veterinario;
      sc.IMAGEN(idespecie);
      dispose();
      sc.show();
    }//GEN-LAST:event_jButtonSECCIONESActionPerformed

    private void TABLADETALLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLADETALLEMouseClicked

    }//GEN-LAST:event_TABLADETALLEMouseClicked

    private void TABLADETALLEComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TABLADETALLEComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLADETALLEComponentMoved

    private void jComboBoxHORAPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxHORAPopupMenuWillBecomeVisible
         LlenarComboHORA();
    }//GEN-LAST:event_jComboBoxHORAPopupMenuWillBecomeVisible
int indice1;String medicamentoselec,coincidencia;boolean OperacionRegistrada;
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
    public javax.swing.JTable TABLADETALLE;
    private org.edisoncor.gui.button.ButtonAction buttonActionCANCELAR;
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    private org.edisoncor.gui.button.ButtonAction buttonActionVERIFICAR;
    private org.edisoncor.gui.button.ButtonTask buttonTaskAGREGAR;
    private org.edisoncor.gui.button.ButtonTask buttonTaskQUITAR;
    public javax.swing.JButton jButtonSECCIONES;
    private javax.swing.JComboBox jComboBoxCATEGORIAS;
    public javax.swing.JComboBox jComboBoxDUEÑOS;
    private javax.swing.JComboBox jComboBoxHORA;
    public javax.swing.JComboBox jComboBoxMASCOTAS;
    private javax.swing.JComboBox jComboBoxMEDICAMENTOS;
    public javax.swing.JComboBox jComboBoxTIPOCONSULTA;
    private com.toedter.calendar.JDateChooser jDateChooserFECHATURNO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JLabel jLabelPesoActual2;
    private javax.swing.JLabel jLabelRaza;
    private javax.swing.JLabel jLabelSEXO;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSpinner jSpinnerCantMedicamento;
    private javax.swing.JTextArea jTextAreaALERGIAS;
    private javax.swing.JTextArea jTextAreaCOMPOSICION;
    private javax.swing.JTextArea jTextAreaDIAGNOSTICO;
    private javax.swing.JTextArea jTextAreaSituacionPeso;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

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
  public void BuscarIDVeterinario(String vet) {
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
    
    fechaActual=añoactual+"/"+mesactual+"/"+diaactual;    
 
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

private void LlenarComboCategoriaMedicamentos(int IDTipoOperacion) {
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

 private void limpiarTabla(JTable tab) {
         while(tab.getRowCount()>0){//se recorren todas las filas
         ((javax.swing.table.DefaultTableModel) tab.getModel()).removeRow(0);
       }
    }
 
 private void limpiarCamposMedicamento() {
      this.jComboBoxCATEGORIAS.getModel().setSelectedItem("Seleccione");
      this.jComboBoxMEDICAMENTOS.getModel().setSelectedItem("Seleccione");
      this.jTextAreaCOMPOSICION.setText("");
      this.jLabelCantiACTUAL.setText("");
      this.jSpinnerCantMedicamento.getModel().setValue(0);
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
    
 private void MostrarPrimerConcepto() {
   try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM tipooperacion WHERE idcategoria=2");

        while (rs.next()) {
           modeloCombo.addElement(rs.getString("nombre"));
        }
        rs.close();
        this.jComboBoxTIPOCONSULTA.setModel(modeloCombo);
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

private void FORMATO_TABLAMEDICAMENTOS(){
   TABLA.getColumnModel().getColumn(0).setPreferredWidth(50);
   TABLA.getColumnModel().getColumn(1).setPreferredWidth(130);
    }
 
 private void LimpiarCamposDATOSMASCOTA() {
   this.jLabelEdad.setText("");
   this.jLabelPesoActual.setText("");
   this.jLabelEdad1.setText("");
   this.jLabelEspecie.setText("");
    this.jLabelRaza.setText("");
   this.jTextAreaSituacionPeso.setText("");
   this.jLabelRaza.setText("");  
   jTextAreaALERGIAS.setText("");
   this.jLabelSEXO.setText("");
   this.jButtonSECCIONES.setText("");
   this.jButtonSECCIONES.setIcon(null);
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
String especie="",cumpleaños="",situacionpeso,tiemponac,seleccionTamaño;int edad,IDFICHA,idespecie,IDRAZA;
public void BuscarDatosMascota(String mascotaSelec,int dueño) {         
 int pesoActual=0;String raza="",sexo="",datoImagen;
 try {          
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT fichamedica.id,mascota,sexo,edad,tiemponac,situacionpeso,especies.id,especies.nombre,kilaje,razas.id,razas.nombre,cumpleaños,tamaños.nombre FROM fichamedica INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON pelajexraza.idraza=razas.id INNER JOIN especies ON especies.id=razas.idespecie INNER JOIN tamaños ON razas.idtamano=tamaños.id WHERE mascota LIKE '"+mascotaSelec+"%' AND fichamedica.idpropietario="+dueño);                     
        while (rs.next()) {   
            IDFICHA=rs.getInt("fichamedica.id");
            situacionpeso=rs.getString("situacionpeso");
            especie=rs.getString("especies.nombre");
            edad=rs.getInt("edad");
            cumpleaños=rs.getString("cumpleaños");
            idespecie=rs.getInt("especies.id");
            IDRAZA=rs.getInt("razas.id");
            tiemponac=rs.getString("tiemponac");
            pesoActual=rs.getInt("kilaje");
            raza=rs.getString("razas.nombre");
            sexo=rs.getString("sexo");
            seleccionTamaño=rs.getString("tamaños.nombre");
           }
           rs.close();           
           this.jLabelEspecie.setText(especie);
           this.jLabelSEXO.setText(sexo);
           
           if(idespecie==1){         
             datoImagen="/src/siluetadeperro.png";
           }else{
              datoImagen="/src/silueta de gato.png";
          }
           ImageIcon image = new ImageIcon(System.getProperty("user.dir")+datoImagen);
           this.jButtonSECCIONES.setIcon(image);
           calculoEDAD();
           this.jLabelPesoActual.setText(String.valueOf(pesoActual));
           this.jLabelRaza.setText(raza);
           this.DatosRaza(IDRAZA);
           this.controlPeso(sexo,pesoActual);
           
           BuscarDatosHISTORIAL(IDFICHA); 
           
    } catch (SQLException ex) {
            System.out.print(ex);
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
 
 private void InhabilitarSeccionOperacion() {
       this.jComboBoxCATEGORIAS.setEnabled(false);
       this.jComboBoxMEDICAMENTOS.setEnabled(false);
       this.jComboBoxTIPOCONSULTA.setEnabled(false);
       this.jSpinnerCantMedicamento.setEnabled(false);
       this.jTextAreaDIAGNOSTICO.setEnabled(false);
       this.jTextAreaCOMPOSICION.setEnabled(false);
       this.TABLA.setEnabled(false);
       this.buttonTaskAGREGAR.setEnabled(false);
       this.jDateChooserFECHATURNO.setEnabled(false);
       this.jComboBoxHORA.setEnabled(false);
       this.buttonActionVERIFICAR.setEnabled(false);
    }
    
    private void HabilitarSeccionOperacion() {
       this.jTextAreaCOMPOSICION.setEnabled(true);
       this.jTextAreaDIAGNOSTICO.setEnabled(true);
       this.jComboBoxMEDICAMENTOS.setEnabled(true);
       this.jComboBoxCATEGORIAS.setEnabled(true);
       this.jSpinnerCantMedicamento.setEnabled(true);
       this.TABLA.setEnabled(true);
       this.buttonTaskAGREGAR.setEnabled(true);
       this.jDateChooserFECHATURNO.setEnabled(true);
       this.jComboBoxHORA.setEnabled(true);
       this.buttonActionVERIFICAR.setEnabled(true);
    }

 
 private void BuscarDatosHISTORIAL(int IDFICHA) {
   String alergias = null;
   cn=cm.Conectar();   
    try{
       String sSQL="SELECT alergias FROM historialclinico WHERE idficha="+IDFICHA;
       Statement st = (Statement) cn.createStatement();
       ResultSet rs = st.executeQuery(sSQL);       
       
        while(rs.next()){//aca se lee el maximo de filas
            alergias=rs.getString("alergias");                              
        }
       this.jTextAreaALERGIAS.setText(alergias);
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }  
    }
 
 int resultadoaño,resultadomes;
 public void calculoEDAD(){
    String fechanacimiento;int sumardias;
    
    try {
         fechanacimiento=cumpleaños;
         fecha();    
     
     int añoactual =hoy.get(Calendar.YEAR);          
     int selecaño= Integer.parseInt(fechanacimiento.substring(0,4));
     
     int mesactual=hoy.get(Calendar.MONTH)+1;
     int messelec= Integer.parseInt(fechanacimiento.substring(5,7));
     int contar=0;
     int dia= Calendario.get(Calendar.DAY_OF_MONTH);                
     int diaselec= Integer.parseInt(fechanacimiento.substring(8,10));
     
     int mes= Integer.parseInt(fechanacimiento.substring(5,7));
     int añobisiesto =2016+4;
     
     resultadoaño=añoactual-selecaño;
     if(resultadoaño==0){    // SI EL RESULTADO ES 0, QUIERE DECIR QUE NACIO EN EL CORRIENTE AÑO
        if(messelec==mesactual){
           resultadomes=0;
        }else if(messelec<mesactual){
           resultadomes=mesactual-messelec;
        }else{
           resultadomes=messelec-mesactual;
        }

          if(resultadomes==0){
              int dias=diaselec;
                while(dias!=dia){
                   dias++;
                   contar++;
                } 
                jLabelEdad.setText(String.valueOf(contar));  
                jLabelEdad1.setText("DIAS");
                edad=contar;
                tiemponac="DIAS";
                
                ficha.ActualizarFechaNac(IDFICHA, edad, tiemponac);
          }else if(resultadomes<2 || resultadomes==2){       
                if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                      while(diaselec!=31){
                         diaselec++;
                         contar++;
                      }
                      mes++;
                      sumardias=contar;
                      contar=0;
                     
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                      }else{
                        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                            while(contar!=31){
    //                         diaselec++;
                             contar++;
                             }
                        }else{
                            while(contar!=30){
    //                         diaselec++;
                             contar++;
                             }
                        }
                      mes++;
                      sumardias=sumardias+contar;
                      contar=0;
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                       sumardias=sumardias+contar;
                      }                      
                   }          
                }else{
                   if(mes==2 & añoactual==añobisiesto){
                    while(diaselec!=29){
                         diaselec++;
                         contar++;
                      }
                      mes++;
                      sumardias=contar;
                      contar=0;
                     
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                      }else{
                        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                            while(contar!=31){
    //                         diaselec++;
                             contar++;
                             }
                        }else{
                            while(contar!=30){
    //                         diaselec++;
                             contar++;
                             }
                        }
                      mes++;
                      sumardias=sumardias+contar;
                      contar=0;
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                       sumardias=sumardias+contar;
                      }
                     
                   }
                       
                   }else if(mes==2){
                         while(diaselec!=28){
                         diaselec++;
                         contar++;
                      }
                      mes++;
                      sumardias=contar;
                      contar=0;
                     
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                      }else{
                        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                            while(contar!=31){
    //                         diaselec++;
                             contar++;
                             }
                        }else{
                            while(contar!=30){
    //                         diaselec++;
                             contar++;
                             }
                        }
                      mes++;
                      sumardias=sumardias+contar;
                      contar=0;
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                       sumardias=sumardias+contar;
                      }                     
                   }
                   }else{
                     while(diaselec!=30){
                         diaselec++;
                         contar++;
                      }
                      mes++;
                      sumardias=contar;
                      contar=0;
                     
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                         sumardias=sumardias+contar;
                      }else{
                        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                            while(contar!=31){
    //                         diaselec++;
                             contar++;
                             }
                        }else{
                            while(contar!=30){
    //                         diaselec++;
                             contar++;
                             }
                        }
                      mes++;
                      sumardias=sumardias+contar;
                      contar=0;
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                       sumardias=sumardias+contar;
                      }                  
                      
                   }              
            }
                   }                  
         jLabelEdad.setText(String.valueOf(sumardias));  
         jLabelEdad1.setText("DIAS");
         edad=sumardias;
         tiemponac="DIAS";
         ficha.ActualizarFechaNac(IDFICHA, edad, tiemponac);
      }else if(resultadomes<12){
         jLabelEdad.setText(String.valueOf(resultadomes));
         jLabelEdad1.setText("MESES");
         edad=resultadomes;
         tiemponac="MESES";
         ficha.ActualizarFechaNac(IDFICHA, edad, tiemponac);
         }                 
                
}else if(resultadoaño==1 & messelec==mesactual){  // // // // año anterior del corriente año.....
        // // //esto quiere decir que pase a mostrar años
           jLabelEdad.setText(String.valueOf(resultadoaño)); 
           jLabelEdad1.setText("AÑO"); 
           edad=resultadoaño;
           tiemponac="AÑO";
           ficha.ActualizarFechaNac(IDFICHA, edad, tiemponac);
}else if(resultadoaño==1 & messelec>3){
    int contador=0;
    int contarmes=0;
          
    contarmes=messelec;
          
    while(contarmes!=mesactual){ 
       if(contarmes!=12){
          contador++;
          contarmes++;
       }else{
          contador++;
          contarmes=1;
       }                  
     }                 
    jLabelEdad.setText(String.valueOf(contador));
    jLabelEdad1.setText("MESES");
    edad=contador;
    tiemponac="MESES";
    ficha.ActualizarFechaNac(IDFICHA, edad, tiemponac); 
}else  if(resultadoaño==1 || resultadoaño<1){        
   if(messelec<mesactual){
         resultadomes=mesactual-messelec;
      }else{
         resultadomes=messelec-mesactual;
      }
     
     if(resultadomes<2 || resultadomes==2){       
         if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
             while(diaselec!=31){
                 diaselec++;
                 contar++;
              }
              mes++;
              sumardias=contar;
              contar=0;

              if(mes==mesactual){
                 while(contar!=dia){
                 contar++;
                 }
              }else{
                if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                        while(contar!=31){
//                         diaselec++;
                         contar++;
                         }
                    }else{
                        while(contar!=30){
//                         diaselec++;
                         contar++;
                         }
                    }
                  mes++;
                  sumardias=sumardias+contar;
                  contar=0;
                  if(mes==mesactual){
                     while(contar!=dia){
                     contar++;
                     }
                   sumardias=sumardias+contar;
                  }

               }                 
                   
                }else{
                   if(mes==2 & añoactual==añobisiesto){
                    while(diaselec!=29){
                         diaselec++;
                         contar++;
                      }
                      mes++;
                      sumardias=contar;
                      contar=0;
                     
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                      }else{
                        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                            while(contar!=31){
    //                         diaselec++;
                             contar++;
                             }
                        }else{
                            while(contar!=30){
    //                         diaselec++;
                             contar++;
                             }
                        }
                      mes++;
                      sumardias=sumardias+contar;
                      contar=0;
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                       sumardias=sumardias+contar;
                      }
                     
                   }
                       
                   }else if(mes==2){
                         while(diaselec!=28){
                         diaselec++;
                         contar++;
                      }
                      mes++;
                      sumardias=contar;
                      contar=0;
                     
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                      }else{
                        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                            while(contar!=31){
    //                         diaselec++;
                             contar++;
                             }
                        }else{
                            while(contar!=30){
    //                         diaselec++;
                             contar++;
                             }
                        }
                      mes++;
                      sumardias=sumardias+contar;
                      contar=0;
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                       sumardias=sumardias+contar;
                      }                     
                   }
                   }else{
                     while(diaselec!=30){
                         diaselec++;
                         contar++;
                      }
                      mes++;
                      sumardias=contar;
                      contar=0;
                     
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                         sumardias=sumardias+contar;
                      }else{
                        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                            while(contar!=31){
    //                         diaselec++;
                             contar++;
                             }
                        }else{
                            while(contar!=30){
    //                         diaselec++;
                             contar++;
                             }
                        }
                      mes++;
                      sumardias=sumardias+contar;
                      contar=0;
                      if(mes==mesactual){
                         while(contar!=dia){
                         contar++;
                         }
                       sumardias=sumardias+contar;
                      }                  
                      
                   }              
            }
         }                  
         jLabelEdad.setText(String.valueOf(sumardias));  
         jLabelEdad1.setText("DIAS"); 
         edad=sumardias;
         tiemponac="DIAS";
         ficha.ActualizarFechaNac(IDFICHA, edad, tiemponac);
      }else if(resultadomes<12){
          int contador=0;
          int contarmes=0;
          
          contarmes=messelec;
          
          while(contarmes!=mesactual){ 
               if(contarmes!=12){
                  contador++;
                  contarmes++;
               }else{
                  contador++;
                  contarmes=1;
               }                  
            }                 
        this.jLabelEdad.setText(String.valueOf(contador));
        jLabelEdad1.setText("MESES");
        edad=contador;
        tiemponac="MESES";
        ficha.ActualizarFechaNac(IDFICHA, edad, tiemponac);
       }         
      }else{
         jLabelEdad.setText(String.valueOf(resultadoaño)); 
         jLabelEdad1.setText("AÑOS");
         edad=resultadoaño;
         tiemponac="AÑOS";
         ficha.ActualizarFechaNac(IDFICHA, edad, tiemponac);
      }     
 } catch (Exception e) {
     System.out.print(e);
    }
}
 
 public void LlenarTablaSecciones(int IDOperacion) {
    String[] titulos = {"ZONA","SECCIÓN"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    String[] registro = new String[2];
        try{
        String sql="SELECT zonas.nombre,secciones.nombre FROM zonas INNER JOIN secciones ON zonas.id=secciones.idzona INNER JOIN seccionesaoperar ON secciones.id=seccionesaoperar.idseccion INNER JOIN operaciones ON seccionesaoperar.idoperacion=operaciones.id WHERE seccionesaoperar.idoperacion='"+IDOperacion+"' ORDER BY secciones.nombre ASC";
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql); 
        
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("zonas.nombre");
            registro[1]=rs.getString("secciones.nombre");
            modelo.addRow(registro);
            limpiarTabla(TABLADETALLE);  
        }
        TABLADETALLE.setModel(modelo);
//      cmd.close();
//      cn.close() 
        FORMATO_TABLA();
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }
    
private void FORMATO_TABLA(){
TABLADETALLE.getColumnModel().getColumn(0).setPreferredWidth(80);
TABLADETALLE.getColumnModel().getColumn(1).setPreferredWidth(100);
}

private void controlPeso(String sexo,double PESOACTUAL) {
 if(resultadoaño==0 & resultadomes<1){ 
    switch (seleccionTamaño) {
             case "PEQUEÑO":                 
                if(PESOACTUAL<0.2){
                        situacionpeso="PESO BAJO"; 
                        jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Encima de los 200 grs."); 
                 }else if(PESOACTUAL>0.300){
                    situacionpeso="SOBREPESO";
                     jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Debajo de los 300 grs."); 
                 }else if(PESOACTUAL>0.200 & PESOACTUAL<0.300 || PESOACTUAL==0.300){
                     situacionpeso="NORMAL";       
                     jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso);                      
                 }             
                 break;
                 case "MEDIANO":
                  if(PESOACTUAL<0.300){
                    situacionpeso="PESO BAJO";
                    jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Encima de los 300 grs.");
                 
                  }else if(PESOACTUAL>0.500){
                      situacionpeso="SOBREPESO";
                      jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Debajo de los 500 grs.");
                      
                 }else if(PESOACTUAL>0.300 & PESOACTUAL<0.500 || PESOACTUAL==0.500){
                     situacionpeso="NORMAL";                 
                     jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                 }
                 break;
             case "GRANDE":
                 if(PESOACTUAL<0.400){
                    situacionpeso="PESO BAJO";
                    jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Encima de los 400 grs.");
                   
                 }else if(PESOACTUAL>0.400 & PESOACTUAL<0.600 || PESOACTUAL==0.600){
                     situacionpeso="NORMAL";       
                     jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                 }else if(PESOACTUAL>0.600){
                     situacionpeso="SOBREPESO";
                      jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Debajo de los 600 grs.");
                 }              
                    
                 break;
         }
 }else if(resultadoaño==0 || resultadoaño==1 & resultadomes<12){    
     switch (seleccionTamaño) {
             case "PEQUEÑO":
                 if(PESOACTUAL<1){
                     if(PESOACTUAL<0.2){
                        situacionpeso="PESO BAJO"; 
                        jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Encima de los 200grs."); 
                                                                                                   
                 }else if(PESOACTUAL>0.300){
                    situacionpeso="SOBREPESO";
                    jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Debajo de los 300 grs."); 
                  
                 }else if(PESOACTUAL>0.200 & PESOACTUAL<0.300 || PESOACTUAL==0.300){
                     situacionpeso="NORMAL";       
                     jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso); 
                 }             
                 break;
                 }case "MEDIANO":
                  if(PESOACTUAL<02.00){
                    situacionpeso="PESO BAJO";
                    jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Encima de los 2 kilos");
                 
                  }else if(PESOACTUAL>05.00){
                      situacionpeso="SOBREPESO";
                      jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Debajo de los 5 kilos");
                  
                 }else if(PESOACTUAL>02.00 & PESOACTUAL<05.00 || PESOACTUAL==05.00){
                     situacionpeso="NORMAL";                 
                     jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                 }
                 break;
             case "GRANDE":
                 if(PESOACTUAL<05.00){
                    situacionpeso="PESO BAJO";
                    jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Encima de los 5 kilos");
                   
                 }else if(PESOACTUAL>05.00 & PESOACTUAL<13 || PESOACTUAL==13){
                     situacionpeso="NORMAL";       
                     jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                 }else if(PESOACTUAL>13){
                     situacionpeso="SOBREPESO";
                      jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Debajo de los 13 kilos");
                      
                 }              
                    
                 break;
         }    
  }else if(resultadoaño!=0 & resultadomes<12){
      if(sexo.equals("HEMBRA")){
          if(PESOACTUAL<pesominhembra){
               situacionpeso="PESO BAJO"; 
               jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Encima de "+pesominhembra+" Kilos");
             
           }else if(PESOACTUAL>pesomaxhembra){               
               situacionpeso="SOBREPESO";
               jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Debajo de "+pesomaxhembra+" Kilos");
               
           }else{
               situacionpeso="NORMAL";   
               jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
           }
       
    }else if(sexo.equals("MACHO")){ 
       if(PESOACTUAL<pesominmacho){
           situacionpeso="PESO BAJO";
           jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Encima de "+pesominmacho+" Kilos");
          
       }else if(PESOACTUAL>pesomaxmacho){           
           situacionpeso="SOBREPESO"; 
           jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso+"\n Su Peso Debe estar Por Debajo de "+pesomaxmacho+" Kilos");
           
       }else {
           situacionpeso="NORMAL"; 
           jTextAreaSituacionPeso.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
       }
    }            
  }
  
   switch (situacionpeso) {
   case "SOBREPESO":
       jTextAreaSituacionPeso.setForeground(new Color(204,0,0));
       break;
   case "NORMAL":
       jTextAreaSituacionPeso.setForeground(new Color(0,97,51));
       break;
   case "PESO BAJO":
       jTextAreaSituacionPeso.setForeground(new Color(255,102,0));
       break;
       }
    }

int pesominhembra,pesomaxhembra,pesominmacho,pesomaxmacho;
private void DatosRaza(int idraza) {   
      try {       
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT pesominhembra,pesomaxhembra,pesominmacho,pesomaxmacho FROM razas WHERE id="+idraza);

        while (rs.next()) {
          pesominhembra=rs.getInt("pesominhembra");
          pesomaxhembra=rs.getInt("pesomaxhembra");
          pesominmacho=rs.getInt("pesominmacho");
          pesomaxmacho=rs.getInt("pesomaxmacho");
        }
        rs.close();         

        } catch (SQLException ex) {
          ex.getMessage();  
        } 
    }

    private void ReporteCirugiaPERROATRAS(int IDOperacion,String USUARIOACTUAL) {
      try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteCirugia-PERRO-ATRAS.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("IDOPERACION",IDOperacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    private void ReporteCirugiaPERROCABEZA(int IDOperacion,String USUARIOACTUAL) {
      try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteCirugiaPERRO-CABEZA.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("IDOPERACION",IDOperacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

  private void ReporteCirugiaPERROCUELLO(int IDOperacion,String USUARIOACTUAL) {
      try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteCirugia-PERRO-CUELLO.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("IDOPERACION",IDOperacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
               
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    }

    private void ReporteCirugiaPERROADELANTE(int IDOperacion,String USUARIOACTUAL) {
       try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteCirugia-PERRO-ADELANTE.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("IDOPERACION",IDOperacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
               
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    private void ReporteCirugiaPERROTRONCO(int IDOperacion,String USUARIOACTUAL) {
      try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteCirugiaPERRO-TRONCO.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("IDOPERACION",IDOperacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
               
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    private void ReporteCirugiaFELINAATRAS(int IDOperacion,String USUARIOACTUAL) {
       try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteCirugiaGATO-ATRAS.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("IDOPERACION",IDOperacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);    
             
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }    
    }

    private void ReporteCirugiaFELINACABEZA(int IDOperacion,String USUARIOACTUAL) {
      try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteCirugiaGATO-CABEZA.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("IDOPERACION",IDOperacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);   
             
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

 private void ReporteCirugiaFELINACUELLO(int IDOperacion,String USUARIOACTUAL) {
     try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteCirugiaGATO-CUELLO.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("IDOPERACION",IDOperacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);  
             
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
  }

    private void ReporteCirugiaFELINAADELANTE(int IDOperacion,String USUARIOACTUAL) {
      try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteCirugiaGATO-ADELANTE.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("IDOPERACION",IDOperacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL);
             
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void ReporteCirugiaFELINATRONCO(int IDOperacion,String USUARIOACTUAL) {
      try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteCirugiaGATO-TRONCO.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("IDOPERACION",IDOperacion);
             parametro.put("USUARIOACTUAL",USUARIOACTUAL); 
             
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
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
}
