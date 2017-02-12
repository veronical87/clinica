package PANTALLAS;

import CLASES.ClaseFichasMedicas;
import CLASES.Clase_Personas;
import CLASES.JTextFieldToUpperCase;
import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.JFileChooser;
import java.io.File;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import CLASES.ClaseVacunas;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFormattedTextField;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ModificarFicha extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    ClaseFichasMedicas ficha=new ClaseFichasMedicas();
    Clase_Personas persona=new Clase_Personas();
    ClaseVacunas vacuna=new ClaseVacunas();
    Calendar Calendario = Calendar.getInstance(); 
    GregorianCalendar hoy = new GregorianCalendar();  
    private java.sql.Date fechanacimiento,fechavacunacion;   
    DefaultTableModel modelo,modelo2;
    private String opcionCastrado;
    private String opcionVacunas;
    private String opcionParasitos;
    private String opcionDesparasitado;
    private String opcionPreñada;
    public ModificarFicha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);   
        initComponents();
        setLocationRelativeTo(null);
        jTabbedPane1.setEnabledAt(1,false);
        jDateChooser1.setMaxSelectableDate(hoy.getTime());
        this.jDateChooserFECHADESPAR.setMaxSelectableDate(hoy.getTime());
        this.jDateChooserFECHAVACUNACIO.setMaxSelectableDate(hoy.getTime());
        this.jTextAreaMedicamentos.setEnabled(false);
        this.jTextAreaParasitos.setEnabled(false);
        this.jComboBoxOpcion2Parasitos.setEnabled(false);
        
        this.jTextField_Apellido.setDocument(new JTextFieldToUpperCase());   
        this.jTextField_Nombre.setDocument(new JTextFieldToUpperCase()); 
        this.jTextFieldMASCOTA.setDocument(new JTextFieldToUpperCase()); 
//        BloqueoDatosMascota();
        buttonTaskEDITARMASCOTA.setVisible(false);
        this.buttonTaskAGREGARMASCOTA.setEnabled(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Apellido = new javax.swing.JTextField();
        jTextField_Nombre = new javax.swing.JTextField();
        jComboBoxProvincias = new javax.swing.JComboBox();
        jComboBoxLocalidades = new javax.swing.JComboBox();
        jComboBoxTipotelefono = new javax.swing.JComboBox();
        jTextFieldNroTelefono = new javax.swing.JTextField();
        jTextFieldCodigoArea = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldDomicilio = new javax.swing.JTextField();
        jTextFieldcorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        TextFieldNroDocumento = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldMASCOTA = new javax.swing.JTextField();
        jComboBoxSEXO = new javax.swing.JComboBox();
        jComboBoxESPECIE = new javax.swing.JComboBox();
        jComboBoxRAZA = new javax.swing.JComboBox();
        buttonActionSELECCIONARIMAGEN = new org.edisoncor.gui.button.ButtonAction();
        jLabelMostrarImagen = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboBoxTAMANO = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabelEDAD = new javax.swing.JLabel();
        jLabelEDADMASCOTA1 = new javax.swing.JLabel();
        jLabelTiempoTranscurrido = new javax.swing.JLabel();
        jLabelSITUACIONPESO = new javax.swing.JLabel();
        jLabelSituacionPeso2 = new javax.swing.JLabel();
        jComboBoxPELAJE = new javax.swing.JComboBox();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        buttonTaskAGREGARMASCOTA = new org.edisoncor.gui.button.ButtonTask();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        buttonTaskEDITARMASCOTA = new org.edisoncor.gui.button.ButtonTask();
        jPanel10 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldNroHistorial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextFieldMascotaHC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldDueñoHC = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxOpcionVacunas = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jComboBoxVACUNAS = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jDateChooserFECHAVACUNACIO = new com.toedter.calendar.JDateChooser();
        buttonTaskAgregarVacuna = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskQuitarVacuna = new org.edisoncor.gui.button.ButtonTask();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVACUNAS = new javax.swing.JTable();
        jLabelPreñada1 = new javax.swing.JLabel();
        jComboBoxOpcionCastrado = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jComboBoxOpcionProblemasResp = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jComboBoxOpcionDesparasitado = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jDateChooserFECHADESPAR = new com.toedter.calendar.JDateChooser();
        jLabelPreñada = new javax.swing.JLabel();
        jComboBoxOpcionPreñada = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jSpinnerCantVecesPreñada = new javax.swing.JSpinner();
        jRadioButtonVecesPreñada = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jComboBoxOpcionParasitos = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jComboBoxOpcion2Parasitos = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaParasitos = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        jComboBoxOpcionAlergias = new javax.swing.JComboBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaMedicamentos = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jComboBoxAfecciones = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableAFECCION = new javax.swing.JTable();
        buttonTaskAgregarAFECCION = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskQuitarAFECCION = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskGUARDARHC = new org.edisoncor.gui.button.ButtonTask();
        buttonActionCANCELAR = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Modifica Ficha");

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATOS GENERALES");

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(900, 550));

        jPanel1.setBackground(new java.awt.Color(141, 141, 175));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS PROPIETARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Apellido(*)");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nombres(*)");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Domicilio(*)");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 267, 76, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Tipo de Telefono(*)");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 195, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Provincia(*)");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 129, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Localidad(*)");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 162, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nro. de Telefono(*) ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 234, -1, -1));

        jTextField_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ApellidoKeyTyped(evt);
            }
        });
        jPanel3.add(jTextField_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 27, 210, -1));

        jTextField_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_NombreKeyTyped(evt);
            }
        });
        jPanel3.add(jTextField_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 60, 210, -1));

        jComboBoxProvincias.setEditable(true);
        jComboBoxProvincias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxProvincias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Provincia" }));
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
        jPanel3.add(jComboBoxProvincias, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 126, 210, -1));

        jComboBoxLocalidades.setEditable(true);
        jComboBoxLocalidades.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxLocalidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Localidad" }));
        jComboBoxLocalidades.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxLocalidadesPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxLocalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLocalidadesActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxLocalidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 159, 210, -1));

        jComboBoxTipotelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxTipotelefono.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Tipo Telefono" }));
        jComboBoxTipotelefono.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxTipotelefonoPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxTipotelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipotelefonoActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxTipotelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 192, 210, -1));

        jTextFieldNroTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNroTelefonoFocusLost(evt);
            }
        });
        jTextFieldNroTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNroTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldNroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 231, 104, -1));

        jTextFieldCodigoArea.setEditable(false);
        jPanel3.add(jTextFieldCodigoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 231, 79, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("-");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 13, -1));

        jTextFieldDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDomicilioKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 264, 210, -1));

        jTextFieldcorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldcorreoFocusLost(evt);
            }
        });
        jTextFieldcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldcorreoKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 297, 210, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("E-mail(*)");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 300, 76, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Nro. de Doc(*)");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 96, -1, -1));

        TextFieldNroDocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldNroDocumentoFocusLost(evt);
            }
        });
        TextFieldNroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNroDocumentoActionPerformed(evt);
            }
        });
        TextFieldNroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldNroDocumentoKeyTyped(evt);
            }
        });
        jPanel3.add(TextFieldNroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 93, 136, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Campos Obligatorios(*)");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 360));

        jPanel4.setBackground(new java.awt.Color(141, 141, 175));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS MASCOTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Nombre(*)");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, 66, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Sexo(*)");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 96, 59, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 0));
        jLabel19.setText("Ingrese todos los digitos del N°");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 180, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Especie(*)");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 130, 60, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Raza(*)");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 203, -1, -1));

        jTextFieldMASCOTA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldMASCOTAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldMASCOTAFocusLost(evt);
            }
        });
        jTextFieldMASCOTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMASCOTAActionPerformed(evt);
            }
        });
        jTextFieldMASCOTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMASCOTAKeyTyped(evt);
            }
        });
        jPanel4.add(jTextFieldMASCOTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 27, 118, -1));

        jComboBoxSEXO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxSEXO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "HEMBRA", "MACHO" }));
        jComboBoxSEXO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxSEXOFocusGained(evt);
            }
        });
        jComboBoxSEXO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSEXOActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBoxSEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 93, 118, -1));

        jComboBoxESPECIE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxESPECIE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jComboBoxESPECIE.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxESPECIEPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxESPECIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxESPECIEActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBoxESPECIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 130, 116, -1));

        jComboBoxRAZA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxRAZA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Raza" }));
        jComboBoxRAZA.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxRAZAPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxRAZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRAZAActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBoxRAZA, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 200, 234, -1));

        buttonActionSELECCIONARIMAGEN.setBackground(new java.awt.Color(204, 204, 255));
        buttonActionSELECCIONARIMAGEN.setText(" Seleccionar Imagen de Raza");
        buttonActionSELECCIONARIMAGEN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonActionSELECCIONARIMAGEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionSELECCIONARIMAGENActionPerformed(evt);
            }
        });
        jPanel4.add(buttonActionSELECCIONARIMAGEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 301, 228, 29));

        jLabelMostrarImagen.setOpaque(true);
        jPanel4.add(jLabelMostrarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 27, 129, 94));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Tamaño(*)");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 170, -1, -1));

        jComboBoxTAMANO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxTAMANO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Tamaño", "PEQUEÑO", "MEDIANO", "GRANDE" }));
        jComboBoxTAMANO.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxTAMANOPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxTAMANO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTAMANOActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBoxTAMANO, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 167, 234, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Pelaje(*)");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 236, 66, -1));

        jLabelEDAD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEDAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEDAD.setOpaque(true);
        jPanel4.add(jLabelEDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 23, 20));

        jLabelEDADMASCOTA1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEDADMASCOTA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEDADMASCOTA1.setText("Fecha Nacimiento(*)");
        jPanel4.add(jLabelEDADMASCOTA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 60, -1, 20));

        jLabelTiempoTranscurrido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTiempoTranscurrido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTiempoTranscurrido.setOpaque(true);
        jPanel4.add(jLabelTiempoTranscurrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 50, 20));

        jLabelSITUACIONPESO.setBackground(new java.awt.Color(204, 204, 204));
        jLabelSITUACIONPESO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSITUACIONPESO.setOpaque(true);
        jPanel4.add(jLabelSITUACIONPESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 290, 22));

        jLabelSituacionPeso2.setBackground(new java.awt.Color(204, 204, 204));
        jLabelSituacionPeso2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabelSituacionPeso2.setOpaque(true);
        jPanel4.add(jLabelSituacionPeso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 290, 21));

        jComboBoxPELAJE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxPELAJE.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxPELAJEPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxPELAJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPELAJEActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBoxPELAJE, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 233, 234, -1));

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField2FocusLost(evt);
            }
        });
        jFormattedTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField2KeyTyped(evt);
            }
        });
        jPanel4.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 266, 80, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Peso Actual(*)");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 269, 86, -1));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 60, -1, -1));
        jDateChooser1.getDateEditor().addPropertyChangeListener(new java.beans.PropertyChangeListener(){
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calculoEDAD();

            }
        });

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 560, 361));

        buttonTaskAGREGARMASCOTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/agregar-icono-5633-32.png"))); // NOI18N
        buttonTaskAGREGARMASCOTA.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskAGREGARMASCOTA.setCategorySmallFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        buttonTaskAGREGARMASCOTA.setDescription("..");
        buttonTaskAGREGARMASCOTA.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        buttonTaskAGREGARMASCOTA.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonTaskAGREGARMASCOTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskAGREGARMASCOTAActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTaskAGREGARMASCOTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, 51, 79));

        jPanel5.setBackground(new java.awt.Color(141, 141, 175));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "LISTA MASCOTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MASCOTA", "SEXO", "ESPECIE", "RAZA", "SITUACION PESO"
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TABLAMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(TABLA);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 367, 1019, -1));

        buttonTaskEDITARMASCOTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/editar-lapiz-escribir-icono-4987-48.png"))); // NOI18N
        buttonTaskEDITARMASCOTA.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskEDITARMASCOTA.setCategorySmallFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        buttonTaskEDITARMASCOTA.setDescription("..");
        buttonTaskEDITARMASCOTA.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        buttonTaskEDITARMASCOTA.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonTaskEDITARMASCOTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskEDITARMASCOTAActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTaskEDITARMASCOTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 50, 60));

        jTabbedPane1.addTab("FICHA MÉDICA", new javax.swing.ImageIcon(getClass().getResource("/ICONOS/kde-archivo-txt-icono-7701-32.png")), jPanel1); // NOI18N

        jPanel10.setBackground(new java.awt.Color(141, 141, 175));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), ".."));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(141, 141, 175));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2)));

        jTextFieldNroHistorial.setEditable(false);
        jTextFieldNroHistorial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNroHistorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Nro. de Historial ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(35, 35, 35)
                .addComponent(jTextFieldNroHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNroHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jPanel10.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, -1, -1));

        jPanel7.setBackground(new java.awt.Color(141, 141, 175));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2)));

        jTextFieldMascotaHC.setEditable(false);
        jTextFieldMascotaHC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldMascotaHC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMascotaHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMascotaHCActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Mascota");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Dueño");

        jTextFieldDueñoHC.setEditable(false);
        jTextFieldDueñoHC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldDueñoHC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDueñoHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDueñoHCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMascotaHC, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDueñoHC, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMascotaHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldDueñoHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel10.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 16, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("¿Posee vacunas?(*) ");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 298, -1, -1));

        jComboBoxOpcionVacunas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionVacunas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionVacunasActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxOpcionVacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 295, 54, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("¿Cuáles?(*)");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 295, -1, 20));

        jComboBoxVACUNAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVACUNASActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxVACUNAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 296, 91, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Fecha(*)");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 295, -1, 20));
        jPanel10.add(jDateChooserFECHAVACUNACIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 296, -1, -1));

        buttonTaskAgregarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/Add.png"))); // NOI18N
        buttonTaskAgregarVacuna.setCategoryFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        buttonTaskAgregarVacuna.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskAgregarVacuna.setDescription("..");
        buttonTaskAgregarVacuna.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        buttonTaskAgregarVacuna.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonTaskAgregarVacuna.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonTaskAgregarVacuna.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonTaskAgregarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskAgregarVacunaActionPerformed(evt);
            }
        });
        jPanel10.add(buttonTaskAgregarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 286, 33, 30));

        buttonTaskQuitarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/Delete.png"))); // NOI18N
        buttonTaskQuitarVacuna.setCategoryFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        buttonTaskQuitarVacuna.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskQuitarVacuna.setDescription("..");
        buttonTaskQuitarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskQuitarVacunaActionPerformed(evt);
            }
        });
        jPanel10.add(buttonTaskQuitarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 322, 33, 25));

        jTableVACUNAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Vacuna Colocada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVACUNAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVACUNASMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableVACUNAS);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 286, 267, 61));

        jLabelPreñada1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPreñada1.setText("¿Esta Castrado/a?(*) ");
        jPanel10.add(jLabelPreñada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 71, 142, -1));

        jComboBoxOpcionCastrado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionCastrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionCastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionCastradoActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxOpcionCastrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 71, 55, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("¿Tuvo o Tiene Problemas Respiratorios?(*) ");
        jPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 108, -1, -1));

        jComboBoxOpcionProblemasResp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionProblemasResp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionProblemasResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionProblemasRespActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxOpcionProblemasResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 104, 54, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("¿Fue Desparasitado?(*) ");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 209, -1, -1));

        jComboBoxOpcionDesparasitado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionDesparasitado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionDesparasitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionDesparasitadoActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxOpcionDesparasitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 206, 54, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Última Desparasitación(*)");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 206, -1, 20));
        jPanel10.add(jDateChooserFECHADESPAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 206, 68, -1));

        jLabelPreñada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPreñada.setText("¿Estuvo Preñada?(*) ");
        jPanel10.add(jLabelPreñada, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 146, 142, -1));

        jComboBoxOpcionPreñada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionPreñada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionPreñada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionPreñadaActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxOpcionPreñada, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 137, 54, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("¿Cuántas Veces?");
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 137, 110, 20));

        jSpinnerCantVecesPreñada.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        jPanel10.add(jSpinnerCantVecesPreñada, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 143, 52, -1));

        jRadioButtonVecesPreñada.setBackground(new java.awt.Color(141, 141, 175));
        jRadioButtonVecesPreñada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonVecesPreñada.setText("Más de 3");
        jRadioButtonVecesPreñada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVecesPreñadaActionPerformed(evt);
            }
        });
        jPanel10.add(jRadioButtonVecesPreñada, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 143, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("¿Tuvo Parásitos?(*) ");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 176, -1, -1));

        jComboBoxOpcionParasitos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionParasitos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionParasitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionParasitosActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxOpcionParasitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 173, 52, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("¿Recientemente?");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 173, 114, 20));

        jComboBoxOpcion2Parasitos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcion2Parasitos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcion2Parasitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcion2ParasitosActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxOpcion2Parasitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 173, 55, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Parásitos que tuvo");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 206, -1, 20));

        jTextAreaParasitos.setColumns(20);
        jTextAreaParasitos.setRows(5);
        jTextAreaParasitos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaParasitosKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(jTextAreaParasitos);

        jPanel10.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 206, 278, 30));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("¿Es Alérgico a algún medicamento?(*) ");
        jPanel10.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 245, -1, -1));

        jComboBoxOpcionAlergias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionAlergias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionAlergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionAlergiasActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxOpcionAlergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 239, 54, -1));

        jTextAreaMedicamentos.setColumns(20);
        jTextAreaMedicamentos.setRows(5);
        jTextAreaMedicamentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaMedicamentosKeyTyped(evt);
            }
        });
        jScrollPane6.setViewportView(jTextAreaMedicamentos);

        jPanel10.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 238, 270, 30));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("¿Cual?");
        jPanel10.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 243, -1, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Indicar si tuvo algún tipo de Afección");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 372, -1, -1));

        jComboBoxAfecciones.setEditable(true);
        jComboBoxAfecciones.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxAfecciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Afección" }));
        jComboBoxAfecciones.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxAfeccionesPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxAfecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAfeccionesActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxAfecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 370, 227, -1));

        jTableAFECCION.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Afección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAFECCION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAFECCIONMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableAFECCION);

        jPanel10.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 360, 267, 66));

        buttonTaskAgregarAFECCION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/Add.png"))); // NOI18N
        buttonTaskAgregarAFECCION.setCategoryFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        buttonTaskAgregarAFECCION.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskAgregarAFECCION.setDescription("..");
        buttonTaskAgregarAFECCION.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        buttonTaskAgregarAFECCION.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonTaskAgregarAFECCION.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonTaskAgregarAFECCION.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonTaskAgregarAFECCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskAgregarAFECCIONActionPerformed(evt);
            }
        });
        jPanel10.add(buttonTaskAgregarAFECCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 360, 33, 30));

        buttonTaskQuitarAFECCION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/Delete.png"))); // NOI18N
        buttonTaskQuitarAFECCION.setCategoryFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        buttonTaskQuitarAFECCION.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskQuitarAFECCION.setDescription("..");
        buttonTaskQuitarAFECCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskQuitarAFECCIONActionPerformed(evt);
            }
        });
        jPanel10.add(buttonTaskQuitarAFECCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 396, 33, 25));

        buttonTaskGUARDARHC.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskGUARDARHC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/agregar-icono-5633-32.png"))); // NOI18N
        buttonTaskGUARDARHC.setText("GUARDAR");
        buttonTaskGUARDARHC.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskGUARDARHC.setCategorySmallFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        buttonTaskGUARDARHC.setDescription("..");
        buttonTaskGUARDARHC.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        buttonTaskGUARDARHC.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonTaskGUARDARHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskGUARDARHCActionPerformed(evt);
            }
        });
        jPanel10.add(buttonTaskGUARDARHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 432, 167, 56));

        jTabbedPane1.addTab("HISTORIAL CLÍNICO", new javax.swing.ImageIcon(getClass().getResource("/ICONOS/agregar-carpetas-de-archivo-a-manila-icono-8443-32.png")), jPanel10); // NOI18N

        buttonActionCANCELAR.setBackground(new java.awt.Color(204, 204, 255));
        buttonActionCANCELAR.setText("CANCELAR");
        buttonActionCANCELAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
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
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int IDROL,IDUSUARIO;String datoImagen;String opcionAlergias="";String opcionProbResp="";String  seleccionTamaño;String opcionAfecciones;
String seleccion,coincidencia;int indice1;String seleccionEspecie;boolean SituacionHistorial;int resultadomes; String situacionpeso,opcionMayora3; boolean FichaRealizada=false;
int resultado;int resultadoaño,sumardias;String apellidoSelec,nombreSelec,domicilioSelec,tipotelefonoSelec,correoSelec;int nrotelSelec;
    private void jTextField_ApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ApellidoKeyPressed

    }//GEN-LAST:event_jTextField_ApellidoKeyPressed

    private void jTextField_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ApellidoKeyTyped
        char codigo = evt.getKeyChar();

        if (!Character.isAlphabetic(codigo)) {
            if (Character.isSpace(codigo)) {
                evt.setKeyCode(KeyEvent.VK_SPACE);
            } else {
                evt.consume();
            }
        } else if (this.jTextField_Apellido.getText().length()==50) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_ApellidoKeyTyped

    private void jTextField_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NombreKeyTyped
        char codigo = evt.getKeyChar();

        if (!Character.isAlphabetic(codigo)) {
            if (Character.isSpace(codigo)) {
                evt.setKeyCode(KeyEvent.VK_SPACE);
            } else {
                evt.consume();
            }
        } else if (this.jTextField_Nombre.getText().length()==25) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_NombreKeyTyped

    private void jComboBoxProvinciasPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxProvinciasPopupMenuWillBecomeVisible
        String combo=coincidencia;
        if(indice1==-1){
            BuscarCoincidenciasxProv(combo);
        }else{
            LlenarComboProvincias();
        }
    }//GEN-LAST:event_jComboBoxProvinciasPopupMenuWillBecomeVisible

    private void jComboBoxProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProvinciasActionPerformed
        seleccion = this.jComboBoxProvincias.getSelectedItem().toString();
        int indice=this.jComboBoxProvincias.getSelectedIndex();

        if(indice==-1){
            coincidencia=seleccion;
            BuscarCoincidenciasxProv(seleccion);
            indice1=indice;
        }else{
            BuscarIDProvincia(seleccion);

        }
    }//GEN-LAST:event_jComboBoxProvinciasActionPerformed

    private void jComboBoxLocalidadesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxLocalidadesPopupMenuWillBecomeVisible
        BuscarLocalidadesxPROVINCIA(seleccion);
    }//GEN-LAST:event_jComboBoxLocalidadesPopupMenuWillBecomeVisible

    private void jComboBoxLocalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLocalidadesActionPerformed
        String localidad = this.jComboBoxLocalidades.getSelectedItem().toString();
        int indice=Integer.parseInt(String.valueOf(this.jComboBoxLocalidades.getSelectedIndex()));
        if(indice==-1){
            BuscarCoincidenciasxLocalidad(localidad,IDProvincia);
        }else{
            BuscarIDLocalidad(localidad);
        }
    }//GEN-LAST:event_jComboBoxLocalidadesActionPerformed

    private void jComboBoxTipotelefonoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTipotelefonoPopupMenuWillBecomeVisible
        LlenarComboTelefonos();
    }//GEN-LAST:event_jComboBoxTipotelefonoPopupMenuWillBecomeVisible

    private void jComboBoxTipotelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipotelefonoActionPerformed
        String captura=String.valueOf(this.jComboBoxTipotelefono.getModel().getSelectedItem());
        BuscarIDTIpoTelefono(captura);
        jTextFieldNroTelefono.requestFocus();
    }//GEN-LAST:event_jComboBoxTipotelefonoActionPerformed

    private void jTextFieldNroTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNroTelefonoFocusLost
        if(jTextFieldNroTelefono.getText().length()<6){
            JOptionPane.showMessageDialog(null,"Faltan Digitos en el Nro. de Telefono","Informacion", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNroTelefono.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldNroTelefonoFocusLost

    private void jTextFieldNroTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNroTelefonoKeyTyped
        char codigo = evt.getKeyChar();
        if (!Character.isDigit(codigo)) {
            evt.consume();
        } else if (jTextFieldNroTelefono.getText().length()==6) {
            evt.consume();
            this.jTextFieldDomicilio.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldNroTelefonoKeyTyped

    private void jTextFieldDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDomicilioKeyTyped
        char codigo = evt.getKeyChar();
        if(Character.isAlphabetic(codigo)){
            if (this.jTextFieldDomicilio.getText().length()==50) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextFieldDomicilioKeyTyped

    private void jTextFieldcorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldcorreoFocusLost
        String correo = this.jTextFieldcorreo.getText();
        if (!isEmail(correo)) {
            JOptionPane.showMessageDialog(null,"El E-mail Ingresado está Incorrecto", "Atención", JOptionPane.WARNING_MESSAGE);
            jTextFieldcorreo.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldcorreoFocusLost

    private void jTextFieldcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldcorreoKeyTyped
        if (jTextFieldcorreo.getText().length() == 40) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldcorreoKeyTyped

    private void TextFieldNroDocumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldNroDocumentoFocusLost
        if(this.TextFieldNroDocumento.getText().length()<8){
            JOptionPane.showMessageDialog(null,"Faltan Dígitos al N° de DNI","Atención",JOptionPane.WARNING_MESSAGE);
            TextFieldNroDocumento.requestFocus();
        }
    }//GEN-LAST:event_TextFieldNroDocumentoFocusLost

    private void TextFieldNroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNroDocumentoActionPerformed
        int dni=Integer.parseInt(TextFieldNroDocumento.getText());
        int salida=ficha.VerificarDNI(dni);

        if(salida!=0){
            JOptionPane.showMessageDialog(null,"El DNI Se Encuentra Registrado","Atención", JOptionPane.WARNING_MESSAGE);
            TextFieldNroDocumento.setText("");
            TextFieldNroDocumento.requestFocus();
        }
    }//GEN-LAST:event_TextFieldNroDocumentoActionPerformed

    private void TextFieldNroDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldNroDocumentoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        } else {
            if (this.TextFieldNroDocumento.getText().length() == 8) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_TextFieldNroDocumentoKeyTyped

    private void jTextFieldMASCOTAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMASCOTAFocusGained

    }//GEN-LAST:event_jTextFieldMASCOTAFocusGained

    private void jTextFieldMASCOTAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMASCOTAFocusLost
        String mascota=this.jTextFieldMASCOTA.getText();
        int salida = ficha.VerificarMascota(idPropietario,mascota);
        String   apellido = this.jTextField_Apellido.getText();
        String   propietario = apellido+","+jTextField_Nombre.getText();

        if (salida !=0) {
            JOptionPane.showMessageDialog(null,"La Mascota"+" "+mascota+" "+", perteneciente a, "+propietario+" se Encuentra Registrada","Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jTextFieldMASCOTAFocusLost

    private void jTextFieldMASCOTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMASCOTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMASCOTAActionPerformed

    private void jTextFieldMASCOTAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMASCOTAKeyTyped
        char codigo = evt.getKeyChar();

        if (!Character.isAlphabetic(codigo)) {
            if (Character.isSpace(codigo)) {
                evt.setKeyCode(KeyEvent.VK_SPACE);
            } else {
                evt.consume();
            }
        } else if (this.jTextFieldMASCOTA.getText().length()==25) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMASCOTAKeyTyped

    private void jComboBoxSEXOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxSEXOFocusGained

    }//GEN-LAST:event_jComboBoxSEXOFocusGained

    private void jComboBoxSEXOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSEXOActionPerformed

    }//GEN-LAST:event_jComboBoxSEXOActionPerformed

    private void jComboBoxESPECIEPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxESPECIEPopupMenuWillBecomeVisible
        LlenarComboEspecies();
    }//GEN-LAST:event_jComboBoxESPECIEPopupMenuWillBecomeVisible

    private void jComboBoxESPECIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxESPECIEActionPerformed
        seleccionEspecie = String.valueOf(jComboBoxESPECIE.getSelectedItem());
        BuscarIDEspecie(seleccionEspecie);
    }//GEN-LAST:event_jComboBoxESPECIEActionPerformed

    private void jComboBoxRAZAPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxRAZAPopupMenuWillBecomeVisible
        LlenarComboRazas(seleccionEspecie,seleccionTamaño);
    }//GEN-LAST:event_jComboBoxRAZAPopupMenuWillBecomeVisible

    private void jComboBoxRAZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRAZAActionPerformed
        String seleccionRaza = this.jComboBoxRAZA.getSelectedItem().toString();
        int indice=this.jComboBoxRAZA.getSelectedIndex();

        if(indice==-1){
            coincidencia=seleccionRaza;
            BuscarCoincidenciasxRaza(seleccionRaza);
            indice1=indice;
        }else{
            BuscarIDRaza(seleccionRaza);
            LlenarComboTipoPelajexRaza(seleccionRaza);
        }
    }//GEN-LAST:event_jComboBoxRAZAActionPerformed

    private void buttonActionSELECCIONARIMAGENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionSELECCIONARIMAGENActionPerformed
        JFileChooser archivo= new JFileChooser();
        archivo.setDialogTitle("Seleccionar Imagen");

        File ruta= new File("C:/Users/Vero/Documents/NetBeansProjects/ClinicaVet/src/ICONOS/Imagenes-Razas");
        archivo.setCurrentDirectory(ruta);
        int ventana= archivo.showOpenDialog(null);
        if(ventana==JFileChooser.APPROVE_OPTION){
            File file=archivo.getSelectedFile();
            datoImagen=String.valueOf(file);
            Image im= getToolkit().getImage(datoImagen);
            im=im.getScaledInstance(120,110, Image.SCALE_SMOOTH);
            jLabelMostrarImagen.setIcon(new ImageIcon(im));
            jLabelMostrarImagen.setVisible(true);
        }
    }//GEN-LAST:event_buttonActionSELECCIONARIMAGENActionPerformed

    private void jComboBoxTAMANOPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTAMANOPopupMenuWillBecomeVisible
        this.LlenarComboTamaños();
    }//GEN-LAST:event_jComboBoxTAMANOPopupMenuWillBecomeVisible

    private void jComboBoxTAMANOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTAMANOActionPerformed
        seleccionTamaño = jComboBoxTAMANO.getSelectedItem().toString();
        int indice = jComboBoxTAMANO.getSelectedIndex();

        if(indice==-1){
            BuscarTamaño(seleccionTamaño);
        }else{
            BuscarIDTamaño(seleccionTamaño);
        }

        LlenarComboRazas(seleccionEspecie,seleccionTamaño);
    }//GEN-LAST:event_jComboBoxTAMANOActionPerformed

    private void jComboBoxPELAJEPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxPELAJEPopupMenuWillBecomeVisible
        String seleccionRaza = this.jComboBoxRAZA.getSelectedItem().toString();
        LlenarComboTipoPelajexRaza(seleccionRaza);
    }//GEN-LAST:event_jComboBoxPELAJEPopupMenuWillBecomeVisible

    private void jComboBoxPELAJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPELAJEActionPerformed
        String seleccionPelaje = jComboBoxPELAJE.getSelectedItem().toString();
        BuscarIDPelaje(seleccionPelaje,idraza);
    }//GEN-LAST:event_jComboBoxPELAJEActionPerformed

    private void jFormattedTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField2FocusLost
        if(jFormattedTextField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Debe Determinar Cuanto Pesa la Mascota","Atención", JOptionPane.WARNING_MESSAGE);
        }else{
            String sexo =String.valueOf(this.jComboBoxSEXO.getModel().getSelectedItem());
            String c=String.valueOf(jFormattedTextField2.getText());
            Double PESOACTUAL =Double.parseDouble(c);
            if(idraza==0){
                String raza =String.valueOf(jComboBoxRAZA.getModel().getSelectedItem());
                BuscarIDRaza(raza);
            }
            DatosRaza(idraza);
            this.jLabelSITUACIONPESO.setText("");
            this.jLabelSituacionPeso2.setText("");
            controlPeso(sexo, PESOACTUAL);
        }
    }//GEN-LAST:event_jFormattedTextField2FocusLost

    private void jFormattedTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField2KeyTyped
        char codigo = evt.getKeyChar();

        if (!Character.isDigit(codigo)){
            evt.consume();
        }else{
            if (this.jFormattedTextField2.getText().length()==6) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jFormattedTextField2KeyTyped

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange

    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void buttonTaskAGREGARMASCOTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARMASCOTAActionPerformed
        if("".equals(this.jTextField_Apellido.getText()) || "".equals(this.jTextField_Nombre.getText()) || "".equals(this.jTextFieldDomicilio.getText()) || "".equals(this.jTextFieldCodigoArea.getText()) || "".equals(jTextFieldNroTelefono.getText())|| jTextFieldcorreo.getText().equals("")|| jTextFieldMASCOTA.getText().equals("")||jDateChooser1.getDate()==null || jComboBoxSEXO.getModel().getSelectedItem().equals("Seleccionar")||this.jComboBoxPELAJE.getModel().getSelectedItem().equals("")||this.jFormattedTextField2.getText().equals("")||jComboBoxTAMANO.getModel().getSelectedItem().equals("Seleccionar Tamaño")|| jComboBoxESPECIE.getModel().getSelectedItem().equals("Seleccionar") || jFormattedTextField2.getText().equals(" . ")){
            JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención", JOptionPane.WARNING_MESSAGE);
        }else{
            InsertarDatosDueño();
            //////      SECCION INSERCION DE MASCOTA

            String nombre=this.jTextFieldMASCOTA.getText();
            String sexo=String.valueOf(jComboBoxSEXO.getModel().getSelectedItem());
            String pelaje=String.valueOf(jComboBoxPELAJE.getModel().getSelectedItem());
            double kilaje=Double.parseDouble(this.jFormattedTextField2.getText());
            int edad=Integer.valueOf(this.jLabelEDAD.getText());
            //     String tamano = String.valueOf(jComboBoxTAMANO.getModel().getSelectedItem());
            String apellido = this.jTextField_Apellido.getText()+",";
            String propietario = this.jTextField_Nombre.getText();
            String tiemponac=jLabelTiempoTranscurrido.getText();
            String raza = String.valueOf(jComboBoxRAZA.getModel().getSelectedItem());
            String especie = String.valueOf(jComboBoxESPECIE.getModel().getSelectedItem());

            if(seleccionTamaño.equals("")){
                BuscarIDTamaño(seleccionTamaño);
            }

            BuscarUsuario();
            fecha();

            String formato ="yyyy/MM/dd";
            fechanacimiento= new Date(this.jDateChooser1.getDate().getYear(), jDateChooser1.getDate().getMonth(), jDateChooser1.getDate().getDate());
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String fechaNacimiento=sdf.format(fechanacimiento);
            String nuevo="Propietario:"+apellido+","+propietario+";"+"Mascota:"+""+nombre;

            BuscarIDPropietario(DNI);

            if(idraza==0){
                this.BuscarIDRaza(raza);
            }
            if(IDPelaje==0){
                BuscarIDPelaje(pelaje,idraza);
            }
            if(idEspecie==0){
                this.BuscarIDEspecie(especie);
            }
            if(datoImagen == null){
                if (idEspecie==1){
                    datoImagen="C:/Users/Vero/Documents/NetBeansProjects/ClinicaVet/src/ICONOS/Imagenes-Razas/silueta perro.jpg";

                }else if (idEspecie==2){
                    datoImagen="C:/Users/Vero/Documents/NetBeansProjects/ClinicaVet/src/ICONOS/Imagenes-Razas/silueta gato.jpg";
                }
            }else{
                //            JFileChooser archivo= new JFileChooser();
                //            File file=archivo.getSelectedFile();
                //            datoImagen=String.valueOf(file);
                Image im= getToolkit().getImage(datoImagen);
                im=im.getScaledInstance(110,110, Image.SCALE_DEFAULT);
                jLabelMostrarImagen.setIcon(new ImageIcon(im));
            }
            ficha.AgregarDatosMascota(idPropietario,fechaActual,nombre,fechaNacimiento,IDPelaje,sexo,kilaje,edad,tiemponac,situacionpeso,datoImagen);
            ficha.InsertarDatosAuditoria(fechaActual,hor,usu,"FICHAS MEDICAS","ALTA","",nuevo);
            limpiarTabla(TABLA);
            modelo = (DefaultTableModel) TABLA.getModel();
            ficha.LlenarTablaDatosMascotas(modelo,idPropietario);

            limpiarCampos();
            jTextFieldMASCOTA.requestFocus();
            GenerarNumeroHistorial();
            BuscarIDFicha();

            if(JOptionPane.showConfirmDialog(null,"¿Desea Realizar el Historial Clinico de la Mascota"+" "+jTextFieldMASCOTA.getText()+"?","Consulta",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                jTabbedPane1.setEnabledAt(1,true);
                jTabbedPane1.setSelectedIndex(1);                 
                this.jTabbedPane1.setEnabledAt(0,false);
                jTextFieldDueñoHC.setText(apellido+propietario);
                jTextFieldMascotaHC.setText(nombre);
                llenarComboAfecciones();

                if("HEMBRA".equals(sexo)){
                    jComboBoxOpcionPreñada.setVisible(true);
                    jLabelPreñada.setVisible(true);
                    jLabel34.setVisible(true);
                    jSpinnerCantVecesPreñada.setVisible(true);
                    jRadioButtonVecesPreñada.setVisible(true);
                }else{
                    jComboBoxOpcionPreñada.setVisible(false);
                    jLabelPreñada.setVisible(false);
                    jLabel34.setVisible(false);
                    jSpinnerCantVecesPreñada.setVisible(false);
                    jRadioButtonVecesPreñada.setVisible(false);
                }
            }
            FichaRealizada=true;
            ficha.agregarHistorial(idFicha,nroHistorial,"","","","","","","","","",0,"","","NO REALIZADO");
        }
    }//GEN-LAST:event_buttonTaskAGREGARMASCOTAActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        String id;
        jLabelMostrarImagen.setVisible(true);
        int filasel = TABLA.getSelectedRow();
        modelo = (javax.swing.table.DefaultTableModel) TABLA.getModel();
        id = (String) modelo.getValueAt(filasel, 0);
        BuscarDatosMascota(id);      
    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLAMouseEntered

    private void jTextFieldMascotaHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMascotaHCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMascotaHCActionPerformed

    private void jTextFieldDueñoHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDueñoHCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDueñoHCActionPerformed

    private void jComboBoxOpcionVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionVacunasActionPerformed
        String captura=String.valueOf(jComboBoxOpcionVacunas.getModel().getSelectedItem());

        if(captura.equals("Si")){
            opcionVacunas="Si";
            this.jComboBoxVACUNAS.setEnabled(true);
            this.jDateChooserFECHAVACUNACIO.setEnabled(true);
            buttonTaskAgregarVacuna.setEnabled(true);
            buttonTaskQuitarVacuna.setEnabled(false);
            this.jTableVACUNAS.setEnabled(true);
            LlenarComboVacunas(idEspecie);
        }else{
            opcionVacunas="No";
            jComboBoxVACUNAS.setEnabled(false);
            this.jDateChooserFECHAVACUNACIO.setEnabled(false);
            buttonTaskAgregarVacuna.setEnabled(false);
            this.jTableVACUNAS.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxOpcionVacunasActionPerformed

    private void jComboBoxVACUNASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVACUNASActionPerformed
        String vacuna=String.valueOf(this.jComboBoxVACUNAS.getModel().getSelectedItem());
        BuscarIDVacuna(vacuna);
    }//GEN-LAST:event_jComboBoxVACUNASActionPerformed
boolean bandera;
    private void buttonTaskAgregarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAgregarVacunaActionPerformed
        fecha();
        //    BuscarIDFicha();
        String formato = "yyyy/MM/dd";
        fechavacunacion=new Date( this.jDateChooserFECHAVACUNACIO.getDate().getYear(), jDateChooserFECHAVACUNACIO.getDate().getMonth(),jDateChooserFECHAVACUNACIO.getDate().getDate() );
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String d = sdf.format(fechavacunacion);
        ////    BEFORE SIGNIFICA ANTES
        ////    AFTER---DESPUES
        if(fechavacunacion.before(fechanacimiento)  || fechavacunacion.equals(fechanacimiento)){  ////no corresponde porque como minimo debe tener 45 dias para su primer vacunacion
            JOptionPane.showMessageDialog(null,"La Fecha de Vacunacion no Puede ser Menor a la Fecha de Nacimiento","Informacion", JOptionPane.INFORMATION_MESSAGE);
            jDateChooserFECHAVACUNACIO.setDate(null);
        }else if(fechavacunacion.after(fechanacimiento)){
            if(bandera==false){
                vacuna.CargarVacunasPendientesxHistorial(nroHistorial,idEspecie);
            }
            if(IDVacuna==0){
                String vacuna=this.jComboBoxVACUNAS.getModel().getSelectedItem().toString();
                BuscarIDVacuna(vacuna);
            }
            //        BuscarIDFicha();
            //        ficha.agregarHistorial(idFicha,nroHistorial,"","","","","","","","","","","");

            int salida=ficha.agregarVacunaxMascota(nroHistorial,IDVacuna,d);
            if(salida==0){
                vacuna.ActualizarVacunaPendiente(nroHistorial,IDVacuna,"COLOCADO");
                limpiarTabla(jTableVACUNAS);
                modelo = (DefaultTableModel) jTableVACUNAS.getModel();
                LlenarTablaVacunas(nroHistorial);
                bandera=true;
                jDateChooserFECHAVACUNACIO.setDate(null);
            }else{
                JOptionPane.showMessageDialog(null,"La Vacuna se Encuentra Registrada","Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"La Fecha de Vacunacion no Puede ser Menor a la Fecha de Nacimiento","Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskAgregarVacunaActionPerformed

    private void buttonTaskQuitarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskQuitarVacunaActionPerformed
        vacuna.ActualizarVacunaPendiente(nroHistorial,IDVacuna,"NO COLOCADO");
        ficha.QuitarVacunaxMascota(IDVacunaxMascota);
        limpiarTabla(jTableVACUNAS);
        modelo = (DefaultTableModel) jTableVACUNAS.getModel();
        LlenarTablaVacunas(idFicha);
    }//GEN-LAST:event_buttonTaskQuitarVacunaActionPerformed

    private void jTableVACUNASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVACUNASMouseClicked
        buttonTaskQuitarVacuna.setEnabled(true);
        String id;
        int filasel = this.jTableVACUNAS.getSelectedRow();
        modelo = (javax.swing.table.DefaultTableModel) jTableVACUNAS.getModel();
        id = (String) modelo.getValueAt(filasel, 0);
        BuscarIDVacunaxMascota(id);
    }//GEN-LAST:event_jTableVACUNASMouseClicked

    private void jComboBoxOpcionCastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionCastradoActionPerformed
        String captura=String.valueOf(jComboBoxOpcionCastrado.getModel().getSelectedItem());
        if(captura.equals("Si")){
            opcionCastrado="Si";
        }else{
            opcionCastrado="No";
        }
    }//GEN-LAST:event_jComboBoxOpcionCastradoActionPerformed

    private void jComboBoxOpcionProblemasRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionProblemasRespActionPerformed
        String captura=String.valueOf(this.jComboBoxOpcionProblemasResp.getModel().getSelectedItem());

        if(captura.equals("Si")){
            opcionProbResp="Si";
        }else{
            opcionProbResp="No";
        }
    }//GEN-LAST:event_jComboBoxOpcionProblemasRespActionPerformed

    private void jComboBoxOpcionDesparasitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionDesparasitadoActionPerformed
        String captura=String.valueOf(this.jComboBoxOpcionDesparasitado.getModel().getSelectedItem());

        if(captura.equals("Si")){
            opcionDesparasitado="Si";
            jDateChooserFECHADESPAR.setEnabled(true);
            jTextAreaParasitos.setEnabled(true);

        }else{
            opcionDesparasitado="No";
            jDateChooserFECHADESPAR.setDateFormatString("");
            jDateChooserFECHADESPAR.setEnabled(false);
            jTextAreaParasitos.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxOpcionDesparasitadoActionPerformed

    private void jComboBoxOpcionPreñadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionPreñadaActionPerformed
        String captura=String.valueOf(jComboBoxOpcionPreñada.getModel().getSelectedItem());

        if(captura.equals("Si")){
            opcionPreñada="Si";
        }else{
            opcionPreñada="No";
        }
    }//GEN-LAST:event_jComboBoxOpcionPreñadaActionPerformed

    private void jRadioButtonVecesPreñadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVecesPreñadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonVecesPreñadaActionPerformed

    private void jComboBoxOpcionParasitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionParasitosActionPerformed
        String captura=String.valueOf(this.jComboBoxOpcionParasitos.getModel().getSelectedItem());

        if(captura.equals("Si")){
            opcionParasitos="Si";
            this.jComboBoxOpcion2Parasitos.setEnabled(true);
        }else{
            opcionParasitos="No";
            jComboBoxOpcion2Parasitos.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxOpcionParasitosActionPerformed

    private void jComboBoxOpcion2ParasitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcion2ParasitosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOpcion2ParasitosActionPerformed

    private void jTextAreaParasitosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaParasitosKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        } else {
            if (this.jTextAreaParasitos.getText().length() == 80) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextAreaParasitosKeyTyped

    private void jComboBoxOpcionAlergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionAlergiasActionPerformed
        String captura=String.valueOf(this.jComboBoxOpcionAlergias.getModel().getSelectedItem());

        if(captura.equals("Si")){
            opcionAlergias="Si";
            this.jTextAreaMedicamentos.setEnabled(true);
            jTextAreaMedicamentos.requestFocus();
        }else{
            opcionAlergias="No";
            jTextAreaMedicamentos.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxOpcionAlergiasActionPerformed

    private void jTextAreaMedicamentosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaMedicamentosKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        } else {
            if (this.jTextAreaMedicamentos.getText().length() == 150) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextAreaMedicamentosKeyTyped

    private void jComboBoxAfeccionesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxAfeccionesPopupMenuWillBecomeVisible
        this.llenarComboAfecciones();
    }//GEN-LAST:event_jComboBoxAfeccionesPopupMenuWillBecomeVisible

    private void jComboBoxAfeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAfeccionesActionPerformed
        String afeccion = this.jComboBoxAfecciones.getSelectedItem().toString();
        int indice = this.jComboBoxAfecciones.getSelectedIndex();
        if (indice == -1) {
            BuscarCoincidenciasxAfeccion(afeccion);
        }else{
            BuscarIDAfeccion(afeccion);
        }
    }//GEN-LAST:event_jComboBoxAfeccionesActionPerformed

    private void jTableAFECCIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAFECCIONMouseClicked
        buttonTaskQuitarAFECCION.setEnabled(true);
        String id;
        int filasel = this.jTableAFECCION.getSelectedRow();
        modelo = (javax.swing.table.DefaultTableModel) jTableAFECCION.getModel();
        id = (String) modelo.getValueAt(filasel, 0);
        BuscarIDAfeccion(id);
    }//GEN-LAST:event_jTableAFECCIONMouseClicked

    private void buttonTaskAgregarAFECCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAgregarAFECCIONActionPerformed
        if(IDAfeccion==0){
            JOptionPane.showMessageDialog(null,"Debe Seleccionar una Afección","Atención", JOptionPane.WARNING_MESSAGE);
        }else{
            BuscarIDHistorial();
            int salidaficha = ficha.agregarAfeccionxHC(idHistorial,IDAfeccion);
            if(salidaficha==0){
                limpiarTabla(jTableAFECCION);
                modelo = (DefaultTableModel) jTableAFECCION.getModel();
                ficha.LlenarTablaAFECCIONES(modelo,idHistorial);
            }else{
                JOptionPane.showMessageDialog(null,"Esta Asociada la Afeccion a la Ficha Actual","Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonTaskAgregarAFECCIONActionPerformed

    private void buttonTaskQuitarAFECCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskQuitarAFECCIONActionPerformed
        if(IDAfeccion==0){
            JOptionPane.showMessageDialog(null,"Debe Determinar una Afección","Atención", JOptionPane.WARNING_MESSAGE);
        }else{
            BuscarIDHistorial();
            ficha.quitarAfeccionxHC(idHistorial,IDAfeccion);
            limpiarTabla(jTableAFECCION);
            modelo = (DefaultTableModel) jTableAFECCION.getModel();
            ficha.LlenarTablaAFECCIONES(modelo,idHistorial);
        }
    }//GEN-LAST:event_buttonTaskQuitarAFECCIONActionPerformed

    private void buttonTaskGUARDARHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskGUARDARHCActionPerformed
        java.sql.Date fechaDespar;String d = null;
        if(FichaRealizada == true){
            int cantidadVeces=0;
            String formato = "yyyy/MM/dd";
            if(!jDateChooserFECHADESPAR.getDate().toString().isEmpty()){
                fechaDespar=new Date( this.jDateChooserFECHADESPAR.getDate().getYear(), jDateChooserFECHADESPAR.getDate().getMonth(),jDateChooserFECHADESPAR.getDate().getDate() );
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                d = sdf.format(fechaDespar);
                ////    BEFORE SIGNIFICA ANTES
                ////    AFTER---DESPUES
                if(fechaDespar.before(fechanacimiento)  || fechaDespar.equals(fechanacimiento)){  ////no corresponde porque como minimo debe tener 45 dias para su primer vacunacion
                    JOptionPane.showMessageDialog(null,"La Fecha de Desparasitación no Puede ser Menor o Igual a la Fecha de Nacimiento","Informacion", JOptionPane.INFORMATION_MESSAGE);
                    jDateChooserFECHADESPAR.setDate(null);
                }
            }else{
                jDateChooserFECHADESPAR.setDate(null);
            }

            //      String nombremascota=jTextFieldMascotaHC.getText();
            String parasitos=String.valueOf(jTextAreaParasitos.getText());
            if(parasitos.isEmpty()){
                parasitos="Ninguno";
            }
            String alergias=String.valueOf(jTextAreaMedicamentos.getText());
            if(alergias.isEmpty()){
                alergias="Ninguno";
            }

            if(this.jComboBoxOpcionVacunas.getModel().getSelectedItem().equals("Si")){
                opcionVacunas="Si";
            }else{
                opcionVacunas="No";
            }
            if(jComboBoxOpcionParasitos.getModel().getSelectedItem().equals("Si")){
                opcionParasitos="Si";
            }else{
                opcionParasitos="No";
            }

            if(this.jComboBoxOpcionAlergias.getModel().getSelectedItem().equals("Si")){
                opcionAlergias="Si";
            }else{
                opcionAlergias="No";
            }
            if(jComboBoxOpcionDesparasitado.getModel().getSelectedItem().equals("Si")){
                opcionDesparasitado="Si";
            }else{
                opcionDesparasitado="No";
            }
            if(jComboBoxOpcionProblemasResp.getModel().getSelectedItem().equals("Si")){
                opcionProbResp="Si";
            }else{
                opcionProbResp="No";
            }
            if(jComboBoxOpcionPreñada.getModel().getSelectedItem().equals("Si")){
                opcionPreñada="Si";
                jSpinnerCantVecesPreñada.setEnabled(true);
                jRadioButtonVecesPreñada.setEnabled(true);

                if(jRadioButtonVecesPreñada.isSelected()){
                    opcionMayora3="Si";
                }else{
                    opcionMayora3="No";
                }

                cantidadVeces=Integer.parseInt(String.valueOf(jSpinnerCantVecesPreñada.getValue()));
                if(cantidadVeces==0){
                    cantidadVeces=0;
                }
            }else{
                opcionPreñada="No";
                jSpinnerCantVecesPreñada.setEnabled(false);
                jRadioButtonVecesPreñada.setEnabled(false);
            }

            BuscarUsuario();
            fecha();
            String nuevo="Nro.Historial:"+nroHistorial+"Propietario:"+nombredueño+";"+"Mascota:"+""+nombremascota;

            ficha.ModificarHistorial(nroHistorial,opcionVacunas,opcionParasitos,parasitos,opcionAlergias,alergias,opcionDesparasitado,d,opcionProbResp,opcionPreñada,cantidadVeces,opcionMayora3,opcionCastrado,"REALIZADO");
            ficha.InsertarDatosAuditoria(fechaActual,hor,usu,"HISTORIAL CLINICO","ALTA","",nuevo);
            JOptionPane.showMessageDialog(null,"Se Guardaron los Datos Correctamente","Información", JOptionPane.INFORMATION_MESSAGE);
        }

        if(JOptionPane.showConfirmDialog(null,"¿Desea Registrar los Datos de otra Mascota?","Consulta",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            jTabbedPane1.setEnabledAt(0,true);
            jTabbedPane1.setEnabledAt(1,false);
            jTabbedPane1.setSelectedIndex(0);
            FichaRealizada=false;
            limpiarCampos();
        }else{
            jTabbedPane1.setEnabledAt(0,true);
            jTabbedPane1.setEnabledAt(1,false);
            jTabbedPane1.setSelectedIndex(0);
            limpiarCampos();
            GenerarReporte();
            ENLACE(IDROL);
        }
        LimpiarHC();
    }//GEN-LAST:event_buttonTaskGUARDARHCActionPerformed

    private void buttonActionCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionCANCELARActionPerformed
        dispose();
        ENLACE(IDROL);
    }//GEN-LAST:event_buttonActionCANCELARActionPerformed

    private void buttonTaskEDITARMASCOTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskEDITARMASCOTAActionPerformed
        if("".equals(this.jTextField_Apellido.getText()) || "".equals(this.jTextField_Nombre.getText()) || "".equals(this.jTextFieldDomicilio.getText()) || "".equals(this.jTextFieldCodigoArea.getText()) || "".equals(jTextFieldNroTelefono.getText())|| jTextFieldcorreo.getText().equals("")|| jTextFieldMASCOTA.getText().equals("")||jDateChooser1.getDate()==null || jComboBoxSEXO.getModel().getSelectedItem().equals("Seleccionar")|| this.jComboBoxPELAJE.getModel().getSelectedItem().equals("")||this.jFormattedTextField2.getText().equals("")||jComboBoxTAMANO.getModel().getSelectedItem().equals("Seleccionar Tamaño")|| jComboBoxESPECIE.getModel().getSelectedItem().equals("Seleccionar")){
            JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención", JOptionPane.WARNING_MESSAGE);
        }else{
            ModificarDatosDueño();
            //////////////        SECCION MASCOTA
            String nombremascota=this.jTextFieldMASCOTA.getText();
            String sexo=String.valueOf(jComboBoxSEXO.getModel().getSelectedItem());
            //            String pelaje=String.valueOf(jTextFieldPELAJE.getText());
            double kilaje=Double.valueOf(jFormattedTextField2.getText());
            int edad=Integer.valueOf(this.jLabelEDAD.getText());
            //        String tamano = String.valueOf(jComboBoxTAMANO.getModel().getSelectedItem());
            String tiemponac=jLabelTiempoTranscurrido.getText();
            String raza = String.valueOf(jComboBoxRAZA.getModel().getSelectedItem());
            String especie = String.valueOf(jComboBoxESPECIE.getModel().getSelectedItem());
            String apellido = this.jTextField_Apellido.getText();
            String nombre = this.jTextField_Nombre.getText();

            BuscarUsuario();
            fecha();

            if(jDateChooser1.getDate()!=null ){
                String formato ="yyyy/MM/dd";
                fechanacimiento= new Date(this.jDateChooser1.getDate().getYear(), jDateChooser1.getDate().getMonth(), jDateChooser1.getDate().getDate());
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                String fechaNacimiento=sdf.format(fechanacimiento);
                String anterior="Propietario:"+apellido+","+nombre+";"+"Mascota:"+""+nombremascota;
                String nuevo="Propietario:"+apellido+","+nombre+";"+"Mascota:"+""+nombremascota;

                if(idraza==0){
                    this.BuscarIDRaza(raza);
                }

                if(idEspecie==0){
                    this.BuscarIDEspecie(especie);
                }

                if(datoImagen == null){
                    if (idEspecie==1){
                        datoImagen="C:/Users/Vero/Documents/NetBeansProjects/ClinicaVet/src/ICONOS/Imagenes-Razas/silueta perro.jpg";

                    }else if (idEspecie==2){
                        datoImagen="C:/Users/Vero/Documents/NetBeansProjects/ClinicaVet/src/ICONOS/Imagenes-Razas/silueta gato.jpg";
                    }
                }else{
                    //            JFileChooser archivo= new JFileChooser();
                    //            File file=archivo.getSelectedFile();
                    //            datoImagen=String.valueOf(file);
                    Image im= getToolkit().getImage(datoImagen);
                    im=im.getScaledInstance(110,110, Image.SCALE_DEFAULT);
                    //            jLabelMostrarImagen.setIcon(new ImageIcon(im));
                }

                ficha.ModificarDatosMascota(idFicha,idPropietario,nombremascota,fechaNacimiento,IDPelaje,sexo,kilaje,edad,tiemponac,situacionpeso,datoImagen);
                ficha.InsertarDatosAuditoria(fechaActual,hor,usu,"FICHAS MEDICAS","MODIFICACION",anterior,nuevo);
                limpiarTabla(TABLA);
                modelo = (DefaultTableModel) TABLA.getModel();
                ficha.LlenarTablaDatosMascotas(modelo,idPropietario);
                limpiarCampos();
                jTabbedPane1.setEnabledAt(1,false);
                buttonTaskEDITARMASCOTA.setVisible(false);
                buttonTaskAGREGARMASCOTA.setVisible(true);
                MODIFICARHISTORIAL();
            }
        }
    }//GEN-LAST:event_buttonTaskEDITARMASCOTAActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarFicha dialog = new ModificarFicha(new javax.swing.JFrame(), true);
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
    public javax.swing.JTextField TextFieldNroDocumento;
    private org.edisoncor.gui.button.ButtonAction buttonActionCANCELAR;
    private org.edisoncor.gui.button.ButtonAction buttonActionSELECCIONARIMAGEN;
    private org.edisoncor.gui.button.ButtonTask buttonTaskAGREGARMASCOTA;
    private org.edisoncor.gui.button.ButtonTask buttonTaskAgregarAFECCION;
    private org.edisoncor.gui.button.ButtonTask buttonTaskAgregarVacuna;
    private org.edisoncor.gui.button.ButtonTask buttonTaskEDITARMASCOTA;
    private org.edisoncor.gui.button.ButtonTask buttonTaskGUARDARHC;
    private org.edisoncor.gui.button.ButtonTask buttonTaskQuitarAFECCION;
    private org.edisoncor.gui.button.ButtonTask buttonTaskQuitarVacuna;
    private javax.swing.JComboBox jComboBoxAfecciones;
    private javax.swing.JComboBox jComboBoxESPECIE;
    private javax.swing.JComboBox jComboBoxLocalidades;
    public javax.swing.JComboBox jComboBoxOpcion2Parasitos;
    public javax.swing.JComboBox jComboBoxOpcionAlergias;
    public javax.swing.JComboBox jComboBoxOpcionCastrado;
    public javax.swing.JComboBox jComboBoxOpcionDesparasitado;
    public javax.swing.JComboBox jComboBoxOpcionParasitos;
    public javax.swing.JComboBox jComboBoxOpcionPreñada;
    public javax.swing.JComboBox jComboBoxOpcionProblemasResp;
    public javax.swing.JComboBox jComboBoxOpcionVacunas;
    private javax.swing.JComboBox jComboBoxPELAJE;
    private javax.swing.JComboBox jComboBoxProvincias;
    private javax.swing.JComboBox jComboBoxRAZA;
    private javax.swing.JComboBox jComboBoxSEXO;
    private javax.swing.JComboBox jComboBoxTAMANO;
    private javax.swing.JComboBox jComboBoxTipotelefono;
    private javax.swing.JComboBox jComboBoxVACUNAS;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooserFECHADESPAR;
    private com.toedter.calendar.JDateChooser jDateChooserFECHAVACUNACIO;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEDAD;
    public javax.swing.JLabel jLabelEDADMASCOTA1;
    private javax.swing.JLabel jLabelMostrarImagen;
    private javax.swing.JLabel jLabelPreñada;
    private javax.swing.JLabel jLabelPreñada1;
    private javax.swing.JLabel jLabelSITUACIONPESO;
    private javax.swing.JLabel jLabelSituacionPeso2;
    private javax.swing.JLabel jLabelTiempoTranscurrido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButtonVecesPreñada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinnerCantVecesPreñada;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAFECCION;
    private javax.swing.JTable jTableVACUNAS;
    public javax.swing.JTextArea jTextAreaMedicamentos;
    public javax.swing.JTextArea jTextAreaParasitos;
    private javax.swing.JTextField jTextFieldCodigoArea;
    private javax.swing.JTextField jTextFieldDomicilio;
    public javax.swing.JTextField jTextFieldDueñoHC;
    private javax.swing.JTextField jTextFieldMASCOTA;
    public javax.swing.JTextField jTextFieldMascotaHC;
    public javax.swing.JTextField jTextFieldNroHistorial;
    private javax.swing.JTextField jTextFieldNroTelefono;
    private javax.swing.JTextField jTextField_Apellido;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextFieldcorreo;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

public void calculoEDAD(){
    try {
       if(!(jTextField_Apellido.getText().equals("")) & (this.jTextField_Nombre.getText().equals(""))){
     JOptionPane.showMessageDialog(null,"Los Datos del Propietario No Pueden estar Vacios","Atencion",JOptionPane.WARNING_MESSAGE);
}else if(!(jTextField_Apellido.getText().equals("")) & !(this.jTextField_Nombre.getText().equals(""))){ 
     String formato = "yyyy/MM/dd";
     fechanacimiento=new Date(jDateChooser1.getDate().getYear(), jDateChooser1.getDate().getMonth(),jDateChooser1.getDate().getDate() );
     SimpleDateFormat sdf = new SimpleDateFormat(formato);     
     String d = sdf.format(fechanacimiento);
     
     fecha();    
     
     int añoactual =hoy.get(Calendar.YEAR);          
     int selecaño= jDateChooser1.getJCalendar().getYearChooser().getYear();
     int mesactual=hoy.get(Calendar.MONTH)+1;
     int messelec= jDateChooser1.getJCalendar().getMonthChooser().getMonth()+1;
     int contar=0;
     int dia= Calendario.get(Calendar.DAY_OF_MONTH);                
     int diaselec= jDateChooser1.getJCalendar().getDayChooser().getDay();
     int mes= jDateChooser1.getJCalendar().getMonthChooser().getMonth()+1; 
     int añobisiesto =2016+4;
     
     if(d.equals(fechaActual)){
         JOptionPane.showMessageDialog(null,"La Fecha de Nacimiento Debe Ser Distinta a la Fecha Actual","Atencion",JOptionPane.WARNING_MESSAGE);
         jDateChooser1.setCalendar(null); 
     }else{             
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
                jLabelEDAD.setText(String.valueOf(contar));  
                jLabelTiempoTranscurrido.setText("DIAS");
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
         jLabelEDAD.setText(String.valueOf(sumardias));  
         jLabelTiempoTranscurrido.setText("DIAS");
      }else if(resultadomes<12){
         jLabelEDAD.setText(String.valueOf(resultadomes));
         jLabelTiempoTranscurrido.setText("MESES");
         }                 
                
}else if(resultadoaño==1 & messelec==mesactual){  // // // // año anterior del corriente año.....
        // // //esto quiere decir que pase a mostrar años
           jLabelEDAD.setText(String.valueOf(resultadoaño)); 
           jLabelTiempoTranscurrido.setText("AÑO"); 
           
}else if(resultadoaño==1 & messelec<=3){
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
    jLabelEDAD.setText(String.valueOf(contador));
    jLabelTiempoTranscurrido.setText("MESES");
        
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
         jLabelEDAD.setText(String.valueOf(sumardias));  
         jLabelTiempoTranscurrido.setText("DIAS"); 
         
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
        jLabelEDAD.setText(String.valueOf(contador));
        jLabelTiempoTranscurrido.setText("MESES");
       }         
      }else{
         jLabelEDAD.setText(String.valueOf(resultadoaño)); 
         jLabelTiempoTranscurrido.setText("AÑOS"); 
      } 
     }
    } 
 } catch (Exception e) {
     System.out.print(e);
    }
     

}
private void BuscarCoincidenciasxLocalidad(String localidad,int idprov) {
    try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT localidades.nombre FROM localidades INNER JOIN provincia ON localidades.idprovincia=provincia.id WHERE provincia.id='"+idprov+"' AND localidades.nombre LIKE '"+localidad+"%' ORDER BY localidades.nombre ASC");

        while (rs.next()) {
            modeloCombo.addElement(rs.getString("localidades.nombre"));
        }
        rs.close();
        this.jComboBoxLocalidades.setModel(modeloCombo);
    } catch (SQLException ex) {
        ex.getMessage();
    }  
    }

private void limpiarTabla(JTable tab) {
         while(tab.getRowCount()>0){//se recorren todas las filas
         ((javax.swing.table.DefaultTableModel) tab.getModel()).removeRow(0);
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
 
 private void BuscarLocalidadesxPROVINCIA(String seleccion) {
        try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT localidades.nombre FROM localidades INNER JOIN provincia ON localidades.idprovincia=provincia.id WHERE provincia.nombre LIKE '"+seleccion+"%' ORDER BY localidades.nombre ASC");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("localidades.nombre"));
            }
            rs.close();
            this.jComboBoxLocalidades.setModel(modeloCombo);
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
 
  int ID_LOCALIDAD;String locSeleccionada;
    private void BuscarIDLocalidad(String localidad) {
        int COD_AREA=0;
        try {
             cn=cm.Conectar();
             Statement st=(Statement)cn.createStatement();
             ResultSet rs=st.executeQuery("SELECT codigo,localidades.id,localidades.nombre FROM localidades  WHERE localidades.nombre LIKE '"+localidad+"%'");
             while(rs.next()){
                  COD_AREA=rs.getInt("codigo");
                  ID_LOCALIDAD=rs.getInt("localidades.id");
                  locSeleccionada=rs.getString("localidades.nombre");
                }
             jTextFieldCodigoArea.setText(String.valueOf(COD_AREA));
             rs.close();             
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    
String usu;
private void BuscarUsuario() {
        String sSQL = "";       
        cn=cm.Conectar();
        
        sSQL = "SELECT usuario FROM usuarios WHERE id="+IDUSUARIO;
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
            {
                usu=rs.getString("usuario");                
            }
        
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
   }


int idtipotelefono;
 private void BuscarIDTIpoTelefono(String captura) {
     try {            
        
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT id FROM tipotelefono WHERE  nombre LIKE '"+captura+"%'");

        while (rs.next()) {
            idtipotelefono=rs.getInt("id");
        }
        rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();
    }
    }
 
 String fechaActual,hor;int añoactual,mesactual;
   void fecha(){           
    int h,minutos;String mesac;
    añoactual = Calendario.get(Calendar.YEAR);
    mesactual = Calendario.get(Calendar.MONTH) + 1; 
    int dia = Calendario.get(Calendar.DAY_OF_MONTH);     
    
    if(mesactual<10){
       mesac ="0"+mesactual;
       fechaActual=añoactual+"/"+mesac+"/"+dia;
    }else{
        fechaActual=añoactual+"/"+mesactual+"/"+dia;
    }
   
     h=Calendario.get(Calendar.HOUR_OF_DAY);
     minutos=Calendario.get(Calendar.MINUTE);   
//     segundos=Calendario.get(Calendar.SECOND);
    hor = String.valueOf(h+":"+minutos);  
  }
  
int idpersona;
private void BuscarIDPersona() {
    try {         
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT MAX(id) AS id FROM personas");

        while (rs.next()) {
          idpersona=rs.getInt("id");
        }
        rs.close();        
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
 
     private void LlenarComboTelefonos() {
        try {           
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM tipotelefono ORDER BY nombre ASC");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("nombre"));
            }
            rs.close();
            jComboBoxTipotelefono.setModel(modeloCombo);
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    private void LlenarComboEspecies() {
      try {           
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM especies ORDER BY nombre ASC");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("nombre"));
            }
            rs.close();
            jComboBoxESPECIE.setModel(modeloCombo);
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    private void LlenarComboRazas(String seleccionEspecie,String seleccionTamaño) {
       try {           
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT razas.nombre FROM razas INNER JOIN especies ON especies.id=razas.idespecie INNER JOIN TAMAÑOS ON razas.idtamano=tamaños.id  WHERE especies.nombre LIKE '"+seleccionEspecie+"%' AND tamaños.nombre LIKE '"+seleccionTamaño+"%' ORDER BY razas.nombre ASC");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("razas.nombre"));
            }
            rs.close();
            this.jComboBoxRAZA.setModel(modeloCombo);
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }


private void BuscarCoincidenciasxRaza(String seleccion) {
     try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM razas WHERE nombre LIKE '"+seleccion+"%' ORDER BY nombre ASC");

        while (rs.next()) {
            modeloCombo.addElement(rs.getString("nombre"));
        }
        rs.close();
        this.jComboBoxRAZA.setModel(modeloCombo);
    } catch (SQLException ex) {
        ex.getMessage();
    }
}

int idEspecie;
private void BuscarIDEspecie(String seleccion) {
      try {        
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT id FROM especies WHERE  nombre LIKE '"+seleccion+"%'");

        while (rs.next()) {
            idEspecie=rs.getInt("id");
        }
        rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();
    }
}
    int idraza;
private void BuscarIDRaza(String seleccion) {
     try {           
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT id FROM razas WHERE  nombre LIKE '"+seleccion+"%'");

        while (rs.next()) {
            idraza=rs.getInt("id");            
        }
        rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();
  
   }
}
    
    public boolean isEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;        
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        }else{
            return false;
        }        
    }
    
private void ENLACE(int IDROL) {
int ESC=0,LEC=0,MOD=0,ELI=0;
GestionFichas g=new GestionFichas(new javax.swing.JFrame(), true);
g.IDROL=IDROL;
  try
    {
    cn=cm.Conectar();
    String sql="SELECT * FROM permisos WHERE idrol="+IDROL;
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery(sql);

    while(rs.next()){
            LEC=rs.getInt("L_FICHAMEDICA");
            ESC=rs.getInt("ESC_FICHAMEDICA");
            MOD=rs.getInt("MOD_FICHAMEDICA");
            ELI=rs.getInt("ELIM_FICHAMEDICA");
        }                              
   }catch (SQLException ex){
          JOptionPane.showMessageDialog(null, ex);
        }
        
        if(LEC!=0 & ESC!=0 & MOD!=0 & ELI!=0){
          g.buttonTaskAGREGAR.setEnabled(true);
          g.buttonTaskELIMINAR.setEnabled(false);
          g.buttonTaskMODIFICAR.setEnabled(false);
          g.TABLA.setEnabled(true);
        }else if(MOD!=0){
          g.buttonTaskAGREGAR.setEnabled(false);
          g.buttonTaskELIMINAR.setEnabled(false);
          g.buttonTaskMODIFICAR.setEnabled(true);
          g.TABLA.setEnabled(true);
        }else if(ELI!=0){
          g.buttonTaskAGREGAR.setEnabled(false);
          g.buttonTaskELIMINAR.setEnabled(true);
          g.buttonTaskMODIFICAR.setEnabled(false);
          g.TABLA.setEnabled(true);
        }else {
          g.buttonTaskAGREGAR.setEnabled(true);
          g.buttonTaskELIMINAR.setEnabled(false);
          g.buttonTaskMODIFICAR.setEnabled(false);
          g.TABLA.setEnabled(false);          
        }  
        this.dispose();
        g.show();
    }

int idPropietario;
private void BuscarIDPropietario(int dni) {
  try {       
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT id FROM propietarios WHERE dni="+dni);

    while (rs.next()) {
       idPropietario=rs.getInt("id");
    }
    rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();  
   } 
 }

int DNI;
private void InsertarDatosDueño() {
  if(bandera==true){
     String   apellido = this.jTextField_Apellido.getText();
     String   nombre = this.jTextField_Nombre.getText();
     String   direccion = this.jTextFieldDomicilio.getText();
     int numerotel= Integer.valueOf(jTextFieldNroTelefono.getText());
     String  tipotel = String.valueOf(jComboBoxTipotelefono.getModel().getSelectedItem());
     String  correo = String.valueOf(this.jTextFieldcorreo.getText());
     DNI= Integer.valueOf(TextFieldNroDocumento.getText());

     String nuevo = "Propietario:" + apellido +","+nombre+","+"DNI:"+DNI+",Dirección:"+ direccion +"Teléfono:" + numerotel+ ",E-mail:" + correo;
     BuscarUsuario();
     fecha();
     if(idtipotelefono==0){
        BuscarIDTIpoTelefono(tipotel);
     }     
     if(ID_LOCALIDAD==0){
        BuscarIDLocalidad(tipotel);
     }

     persona.InsertarPersona(direccion,idtipotelefono,numerotel,ID_LOCALIDAD, correo, 3, fechaActual,hor, usu,"PROPIETARIOS", nuevo);
     BuscarIDPersona();
     int salida=ficha.AgregarPropietario(apellido,nombre,DNI,idpersona);
     if(salida==0){
        System.out.println("se registro el propietario");
     }      
    bandera=false;        
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

String nombredueño,nombremascota;
private void BuscarDatosMascota(String mascota) {
  java.sql.Date fechanac = null;int edad=0;String sexo= null,pelaje= null,tiemponac= null,tamano= null,especie= null,raza= null;double kilaje=0;
    try {
       cn=cm.Conectar();
       Statement st = (Statement) cn.createStatement(); 
       ResultSet rs = st.executeQuery("SELECT CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,fichamedica.id,mascota FROM fichamedica INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario WHERE fichamedica.mascota LIKE '"+mascota+"%' AND idpropietario="+idPropietario); 
            while (rs.next()) {
              nombredueño=rs.getString("dueño");
              nombremascota=rs.getString("mascota");
              edad=rs.getInt("edad");
              fechanac=rs.getDate("cumpleaños");

              tiemponac=rs.getString("tiemponac");
              pelaje=rs.getString("pelajexraza.NOMBRE");
              sexo=rs.getString("sexo");
              kilaje=rs.getDouble("kilaje");
              tamano=rs.getString("tamaños.nombre");
              especie=rs.getString("especies.nombre");
              raza=rs.getString("razas.nombre");
              datoImagen=rs.getString("direimagen");
              idraza=rs.getInt("razas.id");
              idFicha=rs.getInt("fichamedica.id");
            }
            rs.close();
            if("HEMBRA".equals(sexo)){
               jComboBoxOpcionPreñada.setVisible(true);
               jLabelPreñada.setVisible(true);
            }else{
                jComboBoxOpcionPreñada.setVisible(false);
                jLabelPreñada.setVisible(false);
               }
            this.jTextFieldMASCOTA.setText(nombremascota);
            this.jDateChooser1.setDate(fechanac);
            this.jLabelEDAD.setText(String.valueOf(edad));
            this.jLabelTiempoTranscurrido.setText(tiemponac);
            this.jComboBoxSEXO.getModel().setSelectedItem(sexo);
            jComboBoxTAMANO.getModel().setSelectedItem(tamano);
            jComboBoxESPECIE.getModel().setSelectedItem(especie); 
            jComboBoxRAZA.getModel().setSelectedItem(raza);                     
            jComboBoxPELAJE.getModel().setSelectedItem(pelaje); 
            jFormattedTextField2.setText(String.valueOf(kilaje));
            controlPeso(sexo, kilaje);
//            JFileChooser archivo= new JFileChooser();
//            File file=archivo.getSelectedFile();
//            datoImagen=String.valueOf(file);
            Image im= getToolkit().getImage(datoImagen);
            im=im.getScaledInstance(110,110, Image.SCALE_DEFAULT);
            jLabelMostrarImagen.setIcon(new ImageIcon(im));
            BuscarDatosHistorial(idFicha);
           
        } catch (SQLException e) {
           System.out.print(e.getMessage());
        }        
    }


int nroHistorial;
private void GenerarNumeroHistorial() {  
    try {
       cn=cm.Conectar();
       Statement st = (Statement) cn.createStatement(); 
       ResultSet rs = st.executeQuery("SELECT COUNT(*)AS nro FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id"); 
            while (rs.next()) {
              nroHistorial=rs.getInt("nro")+1;
            }
            rs.close(); 
            this.jTextFieldNroHistorial.setText(String.valueOf(nroHistorial));                       
        } catch (SQLException e) {
           System.out.print(e.getMessage());
        }
    }

int idFicha;java.sql.Date diaRegistro;
private void BuscarIDFicha() {
   try {       
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT MAX(fecha) AS fechaactual,MAX(id) AS id FROM fichamedica");

    while (rs.next()) {
       idFicha=rs.getInt("id");
       diaRegistro=rs.getDate("fechaactual");       
    }
    rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();  
   }     
}


private void limpiarCampos() {
    jTextFieldMASCOTA.setText("");
    jTextFieldMASCOTA.requestFocus();
    this.jLabelEDAD.setText("");
    this.LlenarComboEspecies();    
    this.jComboBoxSEXO.getModel().setSelectedItem("Seleccionar");
    this.jComboBoxRAZA.getModel().setSelectedItem("Seleccionar");
    this.jComboBoxPELAJE.getModel().setSelectedItem("Seleccionar");
    this.jComboBoxTAMANO.getModel().setSelectedItem("Seleccionar");
    jFormattedTextField2.setText("");
    this.jLabelTiempoTranscurrido.setText("");
    this.jLabelSITUACIONPESO.setText("");  
    this.jLabelSituacionPeso2.setText("");
    this.jLabelMostrarImagen.setVisible(false);
    this.jComboBoxESPECIE.getModel().setSelectedItem("Seleccionar");
    this.jLabelSITUACIONPESO.setText("");
    this.jLabelSituacionPeso2.setText("");
//    this.jDateChooser1.setDate(null);
    jDateChooser1.setDate(null);         
   }

   
 private void LlenarComboVacunas(int idespecie) {
   try {            
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT DISTINCT nombre FROM controlvacunas WHERE idespecie='"+idespecie+"' ORDER BY nombre ASC");

    while (rs.next()) {
        modeloCombo.addElement(rs.getString("nombre"));
    }
        rs.close();
        this.jComboBoxVACUNAS.setModel(modeloCombo);
    } catch (SQLException ex) {
        ex.getMessage();
    }
 }

int IDVacuna;
private void BuscarIDVacuna(String vacuna) {
   try {   
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT id FROM controlvacunas WHERE nombre LIKE '"+vacuna+"%'");

    while (rs.next()) {
        IDVacuna=rs.getInt("id");
    }
        rs.close();
        
    } catch (SQLException ex) {
        ex.getMessage();
    }   
    } 

int IDVacunaxMascota;
 private void BuscarIDVacunaxMascota(String id) {
   try {   
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT vacunasxmascota.id FROM vacunasxmascota INNER JOIN controlvacunas ON vacunasxmascota.idvacuna=controlvacunas.id WHERE nombre LIKE '"+id+"%'");

    while (rs.next()) {
        IDVacunaxMascota=rs.getInt("vacunasxmascota.id");
    }
        rs.close();
        
    } catch (SQLException ex) {
        ex.getMessage();
    } 
    
    }

 private void llenarComboAfecciones() {
   try {            
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT DISTINCT nombre FROM afecciones ORDER BY nombre ASC");

    while (rs.next()) {
        modeloCombo.addElement(rs.getString("nombre"));
    }
        rs.close();
        this.jComboBoxAfecciones.setModel(modeloCombo);
    } catch (SQLException ex) {
        ex.getMessage();
    }  
    }

private void BuscarCoincidenciasxAfeccion(String afeccion) {
  try {            
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT DISTINCT nombre FROM afecciones WHERE nombre LIKE '"+afeccion+"%' ORDER BY nombre ASC");

    while (rs.next()) {
        modeloCombo.addElement(rs.getString("nombre"));
    }
        rs.close();
        this.jComboBoxAfecciones.setModel(modeloCombo);
    } catch (SQLException ex) {
        ex.getMessage();
    } 
    }
int IDAfeccion;
private void BuscarIDAfeccion(String afeccion) {
   try { 
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT id FROM afecciones WHERE nombre LIKE '"+afeccion+"%'");

    while (rs.next()) {
       IDAfeccion=rs.getInt("id");
    }
    rs.close();       
    } catch (SQLException ex) {
        ex.getMessage();
    } 
    }

private void LlenarComboTamaños() {
      try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM tamaños ORDER BY nombre DESC");

        while (rs.next()) {
           modeloCombo.addElement(rs.getString("nombre"));
        }
        rs.close();
        jComboBoxTAMANO.setModel(modeloCombo);
    } catch (SQLException ex) {
        ex.getMessage();
    }
}

 private void BuscarTamaño(String tamaño) {
       try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM tamaños WHERE nombre LIKE '"+tamaño+"%' ORDER BY nombre ASC");

        while (rs.next()) {
           modeloCombo.addElement(rs.getString("nombre"));
        }
        rs.close();
        jComboBoxTAMANO.setModel(modeloCombo);
    } catch (SQLException ex) {
        ex.getMessage();
    }
    }

    int IDTamaño;
    private void BuscarIDTamaño(String tamaño) {
       String sSQL = "";        
        cn=cm.Conectar();
        sSQL = "SELECT id FROM tamaños WHERE nombre LIKE '"+tamaño+"%'";
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
              {
                IDTamaño=rs.getInt("id");
               }
             
             rs.close();
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }
    
private void controlPeso(String sexo,double PESOACTUAL) {
 if(resultadoaño==0 & resultadomes<1){ 
    switch (seleccionTamaño) {
             case "PEQUEÑO":                 
                     if(PESOACTUAL<0.2){
                        situacionpeso="PESO BAJO"; 
                        jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso); 
                        jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de los 200 grs.");                                                                                
                 }else if(PESOACTUAL>0.300){
                    situacionpeso="SOBREPESO";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso); 
                    jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de los 300 grs.");
                 }else if(PESOACTUAL>0.200 & PESOACTUAL<0.300 || PESOACTUAL==0.300){
                     situacionpeso="NORMAL";       
                     jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso); 
                 }             
                 break;
                 case "MEDIANO":
                  if(PESOACTUAL<0.300){
                    situacionpeso="PESO BAJO";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                    jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de los 300 grs.");
                  }else if(PESOACTUAL>0.500){
                      situacionpeso="SOBREPESO";
                      jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                      jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de los 5 grs.");
                 }else if(PESOACTUAL>0.300 & PESOACTUAL<0.500 || PESOACTUAL==0.500){
                     situacionpeso="NORMAL";                 
                     jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                 }
                 break;
             case "GRANDE":
                 if(PESOACTUAL<0.400){
                    situacionpeso="PESO BAJO";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                    jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de los 400 grs.");
                 }else if(PESOACTUAL>0.400 & PESOACTUAL<0.600 || PESOACTUAL==0.600){
                     situacionpeso="NORMAL";       
                     jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                 }else if(PESOACTUAL>0.600){
                     situacionpeso="SOBREPESO";
                      jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                      jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de los 600 grs.");
                 }              
                    
                 break;
         }
 }else if(resultadoaño==0 || resultadoaño==1 & resultadomes<12){    
     switch (seleccionTamaño) {
             case "PEQUEÑO":
                 if(PESOACTUAL<1){
                     if(PESOACTUAL<0.2){
                        situacionpeso="PESO BAJO"; 
                        jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso); 
                        jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de los 200grs.");                                                                                
                 }else if(PESOACTUAL>0.300){
                    situacionpeso="SOBREPESO";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso); 
                    jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de los 300 grs.");
                 }else if(PESOACTUAL>0.200 & PESOACTUAL<0.300 || PESOACTUAL==0.300){
                     situacionpeso="NORMAL";       
                     jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso); 
                 }             
                 break;
                 }case "MEDIANO":
                  if(PESOACTUAL<02.00){
                    situacionpeso="PESO BAJO";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                    jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de los 2 kilos");
                  }else if(PESOACTUAL>05.00){
                      situacionpeso="SOBREPESO";
                      jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                      jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de los 5 kilos");
                 }else if(PESOACTUAL>02.00 & PESOACTUAL<05.00 || PESOACTUAL==05.00){
                     situacionpeso="NORMAL";                 
                     jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                 }
                 break;
             case "GRANDE":
                 if(PESOACTUAL<05.00){
                    situacionpeso="PESO BAJO";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                    jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de los 5 kilos");
                 }else if(PESOACTUAL>05.00 & PESOACTUAL<13 || PESOACTUAL==13){
                     situacionpeso="NORMAL";       
                     jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                 }else if(PESOACTUAL>13){
                     situacionpeso="SOBREPESO";
                      jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                      jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de los 13 kilos");
                 }              
                    
                 break;
         }    
  }else if(resultadoaño!=0 & resultadomes<12){
      if(sexo.equals("HEMBRA")){
          if(PESOACTUAL<pesominhembra){
               situacionpeso="PESO BAJO"; 
               jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
               this.jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de "+pesominhembra+" Kilos");
           }else if(PESOACTUAL>pesomaxhembra){               
               situacionpeso="SOBREPESO";
               jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
               jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de "+pesomaxhembra+" Kilos");
           }else{
               situacionpeso="NORMAL";   
               jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
           }
       
    }else if(sexo.equals("MACHO")){ 
       if(PESOACTUAL<pesominmacho){
           situacionpeso="PESO BAJO";
           jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
           jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de "+pesominmacho+" Kilos");
       }else if(PESOACTUAL>pesomaxmacho){           
           situacionpeso="SOBREPESO"; 
           jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
           jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de "+pesomaxmacho+" Kilos");
       }else {
           situacionpeso="NORMAL"; 
           jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
       }
    }            
  }
  
   switch (situacionpeso) {
   case "SOBREPESO":
       jLabelSITUACIONPESO.setForeground(new Color(204,0,0));
       break;
   case "NORMAL":
       jLabelSITUACIONPESO.setForeground(new Color(0,97,51));
       break;
   case "PESO BAJO":
       jLabelSITUACIONPESO.setForeground(new Color(255,102,0));
       break;
       }
    }

private void LimpiarHC() {
   this.jTextAreaMedicamentos.setText("");
   this.jComboBoxOpcionVacunas.getModel().setSelectedItem("No");
   this.jComboBoxVACUNAS.getModel().setSelectedItem("Seleccionar");
   this.jTextAreaParasitos.setText("");      
   this.jComboBoxOpcion2Parasitos.getModel().setSelectedItem("No");
   this.jDateChooserFECHADESPAR.setDate(null);
   this.jDateChooserFECHAVACUNACIO.setDate(null);
   this.jComboBoxOpcionParasitos.setSelectedItem("No");
   this.jComboBoxOpcionAlergias.getModel().setSelectedItem("No");
   this.jComboBoxOpcionDesparasitado.setSelectedItem("No");
   
   this.jComboBoxOpcionPreñada.setSelectedItem("No");
   this.jComboBoxOpcionProblemasResp.setSelectedItem("No");      
   jTabbedPane1.setEnabledAt(1,false);
   jTabbedPane1.setSelectedIndex(0);      
   jTextFieldNroHistorial.setText("");
   limpiarTabla(jTableAFECCION);
   limpiarTabla(jTableVACUNAS);
   this.jSpinnerCantVecesPreñada.setValue(0);
   this.jRadioButtonVecesPreñada.setSelected(false);
   this.jComboBoxAfecciones.getModel().setSelectedItem("Seleccionar Afección");
}

    int IDPelaje;
    private void BuscarIDPelaje(String seleccionPelaje,int idraza) {
       cn=cm.Conectar();
       String sSQL = "SELECT id FROM pelajexraza WHERE nombre LIKE '"+seleccionPelaje+"' AND idraza="+idraza;
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
              {
                IDPelaje=rs.getInt("id");
               }
             
             rs.close();
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }

    private void LlenarComboTipoPelajexRaza(String seleccionraza) {
        try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT pelajexraza.nombre FROM pelajexraza INNER JOIN razas ON pelajexraza.idraza=razas.id WHERE razas.nombre LIKE '"+seleccionraza+"%' ORDER BY pelajexraza.nombre ASC");

            while (rs.next()) {
               modeloCombo.addElement(rs.getString("pelajexraza.nombre"));
            }
            rs.close();
            jComboBoxPELAJE.setModel(modeloCombo);
        }catch (SQLException ex) {
           ex.getMessage();
        }
    }

    private void GenerarReporte() {
        try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteFicha.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
             Map parametro=new HashMap();
             parametro.clear();
             parametro.put("DNI",DNI);
             
             JasperPrint print=JasperFillManager.fillReport(reportes,parametro,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    private void buscarNroHistorial(int idFicha) {
        int nro = 0;
        cn=cm.Conectar();
        String sSQL = "SELECT nrohistorial FROM historialclinico WHERE idficha="+idFicha;
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
              {
                nro=rs.getInt("nrohistorial");
               }
             
             rs.close();
             jTextFieldNroHistorial.setText(String.valueOf(nro));
            }        
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }   

int idHistorial;
private void BuscarIDHistorial() {
 try {       
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT MAX(historialclinico.id) AS id FROM historialclinico");

    while (rs.next()) {
       idHistorial=rs.getInt("id");       
    }
    rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();  
   }
    }

 private void TipoTelefonoDefecto() {
   try {           
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM tipotelefono WHERE id=1");

        while (rs.next()) {
           modeloCombo.addElement(rs.getString("nombre"));
        }
        rs.close();
        jComboBoxTipotelefono.setModel(modeloCombo);

    }catch (SQLException ex) {
        ex.getMessage();
    }    
    }

// String SITUACION;
// private void buscarSituacionHC(int nroHistorial) {
//  try {       
//        cn=cm.Conectar();
//        Statement st = (Statement) cn.createStatement();
//        ResultSet rs = st.executeQuery("SELECT situacion FROM historialclinico WHERE nrohistorial="+nroHistorial);
//
//        while (rs.next()) {
//          SITUACION=rs.getString("situacion");
//        }
//        rs.close();
//        
//
//    }catch (SQLException ex) {
//        ex.getMessage();
//    } 
// }
 
 public void LlenarTablaVacunas(int nroHistorial) {
   String[] titulos = {"Fecha","Vacuna Colocada"};
   modelo = new javax.swing.table.DefaultTableModel(null,titulos);
   cn=cm.Conectar();
   try{
        String sSQL="SELECT controlvacunas.nombre,DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha FROM controlvacunas INNER JOIN vacunasxmascota ON controlvacunas.id=vacunasxmascota.idvacuna WHERE vacunasxmascota.idHISTORIAL='"+nroHistorial+"' ORDER BY fecha ASC";
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
        String[] registro = new String[2];
        while(rs.next()){//aca se lee el maximo de filas
            
            registro[0]=rs.getString("fecha");
            registro[1]=rs.getString("controlvacunas.nombre");
            modelo.addRow(registro);
            limpiarTabla(jTableVACUNAS); 
        }
       jTableVACUNAS.setModel(modelo); 
       FORMATO_TABLA();
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      } 
    }
 
 public void FORMATO_TABLA(){
   jTableVACUNAS.getColumnModel().getColumn(0).setPreferredWidth(10);
   jTableVACUNAS.getColumnModel().getColumn(1).setPreferredWidth(80);       
    }

 private void ModificarDatosDueño() {
     String   apellido = this.jTextField_Apellido.getText();
     String   nombre = this.jTextField_Nombre.getText();
     String   direccion = this.jTextFieldDomicilio.getText();
     int numerotel= Integer.valueOf(jTextFieldNroTelefono.getText());
     String  tipotel = String.valueOf(jComboBoxTipotelefono.getModel().getSelectedItem());
     String  correo = String.valueOf(this.jTextFieldcorreo.getText());
     DNI= Integer.valueOf(TextFieldNroDocumento.getText());
     String localidad = jComboBoxLocalidades.getSelectedItem().toString();
     
     BuscarUsuario();
     fecha();
     if(idtipotelefono==0){
        BuscarIDTIpoTelefono(tipotel);
     }     
     if(ID_LOCALIDAD==0){
        BuscarIDLocalidad(localidad);
     }
          String anterior="Propietario:"+apellidoSelec+","+nombreSelec+";"+"Domicilio:"+""+domicilioSelec+";"+"Tipo de Telefono:"+""+tipotelefonoSelec+";"+"Nro. de Tel."+""+nrotelSelec;
          String nuevo="Propietario:"+apellido+","+nombre+";"+"Domicilio:"+""+direccion+";"+"Tipo de Telefono:"+""+tipotel+";"+"Nro. de Tel."+""+numerotel;
          ficha.ModificarPropietario(idPropietario, apellido, nombre);
          persona.ModificarPersona(idpersona,direccion,idtipotelefono,numerotel,ID_LOCALIDAD, correo,fechaActual,hor, usu,"PROPIETARIOS",anterior,nuevo);
    }

    private void MODIFICARHISTORIAL() {
        int cantidadVeces=0;java.sql.Date fechaDespar;String d = null;
        String formato = "yyyy/MM/dd";
        if(!jDateChooserFECHADESPAR.getDate().toString().isEmpty()){
            fechaDespar=new Date( this.jDateChooserFECHADESPAR.getDate().getYear(), jDateChooserFECHADESPAR.getDate().getMonth(),jDateChooserFECHADESPAR.getDate().getDate() );
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            d = sdf.format(fechaDespar);
        ////    BEFORE SIGNIFICA ANTES
        ////    AFTER---DESPUES
           if(fechaDespar.before(fechanacimiento)  || fechaDespar.equals(fechanacimiento)){  ////no corresponde porque como minimo debe tener 45 dias para su primer vacunacion
           JOptionPane.showMessageDialog(null,"La Fecha de Desparasitación no Puede ser Menor o Igual a la Fecha de Nacimiento","Informacion", JOptionPane.INFORMATION_MESSAGE);
           jDateChooserFECHADESPAR.setDate(null);
            }
        }else{
           jDateChooserFECHADESPAR.setDate(null);
        }
        
//      String nombremascota=jTextFieldMascotaHC.getText();      
      String parasitos=String.valueOf(jTextAreaParasitos.getText());
      if(parasitos.isEmpty()){
          parasitos="Ninguno";
        }
      String alergias=String.valueOf(jTextAreaMedicamentos.getText());
      if(alergias.isEmpty()){
          alergias="Ninguno";
        }
      
       
      
      if(this.jComboBoxOpcionVacunas.getModel().getSelectedItem().equals("Si")){
             opcionVacunas="Si";        
        }else{
              opcionVacunas="No";
            }
     if(jComboBoxOpcionParasitos.getModel().getSelectedItem().equals("Si")){
           opcionParasitos="Si";
        }else{
           opcionParasitos="No";
        }
            
       if(this.jComboBoxOpcionAlergias.getModel().getSelectedItem().equals("Si")){
          opcionAlergias="Si";         
        }else{
            opcionAlergias="No"; 
        }
       if(jComboBoxOpcionDesparasitado.getModel().getSelectedItem().equals("Si")){
           opcionDesparasitado="Si";
        }else{
           opcionDesparasitado="No";
        }
        if(jComboBoxOpcionProblemasResp.getModel().getSelectedItem().equals("Si")){
          opcionProbResp="Si";
        }else{
           opcionProbResp="No";
        }
       if(jComboBoxOpcionPreñada.getModel().getSelectedItem().equals("Si")){
          opcionPreñada="Si";
          jSpinnerCantVecesPreñada.setEnabled(true);
          jRadioButtonVecesPreñada.setEnabled(true);
      
          if(jRadioButtonVecesPreñada.isSelected()){
            opcionMayora3="Si";
          }else{
            opcionMayora3="No";
          }
          
          cantidadVeces=Integer.parseInt(String.valueOf(jSpinnerCantVecesPreñada.getValue()));
          if(cantidadVeces==0){
             cantidadVeces=0;
          }
        }else{
          opcionPreñada="No";
          jSpinnerCantVecesPreñada.setEnabled(false);
          jRadioButtonVecesPreñada.setEnabled(false);
        } 
       
          BuscarUsuario();
          fecha();          
          String nuevo="Nro.Historial:"+nroHistorial+"Propietario:"+nombredueño+";"+"Mascota:"+""+nombremascota; 
         
          ficha.ModificarHistorial(nroHistorial,opcionVacunas,opcionParasitos,parasitos,opcionAlergias,alergias,opcionDesparasitado,d,opcionProbResp,opcionPreñada,cantidadVeces,opcionMayora3,opcionCastrado,"REALIZADO");
          ficha.InsertarDatosAuditoria(fechaActual,hor,usu,"HISTORIAL CLINICO","MODIFICAR",nuevo,nuevo);
        
          JOptionPane.showMessageDialog(null,"Se Guardaron los Datos Correctamente","Información", JOptionPane.INFORMATION_MESSAGE);  
  
   if(JOptionPane.showConfirmDialog(null,"¿Desea Registrar los Datos de otra Mascota?","Consulta",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
        jTabbedPane1.setEnabledAt(0,true);
        jTabbedPane1.setEnabledAt(1,false);
        jTabbedPane1.setSelectedIndex(0);
        FichaRealizada=false;
        limpiarCampos();
      }else{
        jTabbedPane1.setEnabledAt(0,true);
        jTabbedPane1.setEnabledAt(1,false);
        jTabbedPane1.setSelectedIndex(0);           
        limpiarCampos();
        GenerarReporte(); 
        ENLACE(IDROL);
    } 
    LimpiarHC();
       
    }

    private void BuscarDatosHistorial(int idFicha) {
     String nombremascota = null,parasitos= null,alergias= null;java.sql.Date tiempodespar= null;int opcionAfecciones=0,nrohistorial=0,opcionvacunas=0,opcionparasitos=0,opcionalergias=0,opciondesparasitado=0,opcioncastrado=0,opcionproblemasresp=0,opcionpreñada=0;
    try {
       cn=cm.Conectar();
       Statement st = (Statement) cn.createStatement(); 
       ResultSet rs = st.executeQuery("SELECT CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,fichamedica.mascota,nrohistorial,opcionvacunas,opcionparasitos,parasitos,opcionalergias,alergias,opciondesparasitado,fechadespar,opcionproblemasresp,opcionpreñada,opcionCastrado,opcionAfecciones FROM propietarios INNER JOIN fichamedica ON propietarios.id=fichamedica.idpropietario INNER JOIN historialclinico ON historialclinico.idficha=fichamedica.id WHERE historialclinico.idficha="+idFicha); 
            while (rs.next()) {
              nombredueño=rs.getString("dueño");
              nombremascota=rs.getString("mascota");
              nrohistorial=rs.getInt("nrohistorial");
              opcionvacunas=rs.getInt("opcionvacunas");
              opcioncastrado=rs.getInt("opcionCastrado");
              opcionparasitos=rs.getInt("opcionparasitos");
              parasitos=rs.getString("parasitos");
              opcionalergias=rs.getInt("opcionalergias");
              alergias=rs.getString("alergias");
              opciondesparasitado=rs.getInt("opciondesparasitado");
              opcionAfecciones=rs.getInt("opcionAfecciones");
              tiempodespar=rs.getDate("fechadespar");
              opcionproblemasresp=rs.getInt("opcionproblemasresp");
              opcionpreñada=rs.getInt("opcionpreñada");
          
            }
            rs.close();            
            this.jTextFieldMascotaHC.setText(nombremascota);
            this.jTextFieldDueñoHC.setText(nombredueño);
            this.jTextFieldNroHistorial.setText(String.valueOf(nrohistorial));
            
            if(opcionAfecciones!=0){               
               limpiarTabla(jTableAFECCION);
               modelo = (DefaultTableModel) jTableAFECCION.getModel();
               ficha.LlenarTablaAFECCIONES(modelo,idFicha);
            }else{
               jComboBoxAfecciones.getModel().setSelectedItem("Seleccionar Afección"); 
               limpiarTabla(jTableAFECCION);
            }
            
            if(opcionvacunas==1){
               jComboBoxOpcionVacunas.getModel().setSelectedItem("Si");  
               this.jComboBoxVACUNAS.setEnabled(true);
               this.jDateChooserFECHAVACUNACIO.setEnabled(true);
               this.buttonTaskAgregarVacuna.setEnabled(true);
               this.buttonTaskQuitarVacuna.setEnabled(false);               
               limpiarTabla(jTableVACUNAS);
               modelo = (DefaultTableModel) jTableVACUNAS.getModel();
               LlenarTablaVacunas(idFicha);
            }else{
               jComboBoxOpcionVacunas.getModel().setSelectedItem("No");
               this.jComboBoxVACUNAS.setEnabled(false);
               this.jDateChooserFECHAVACUNACIO.setEnabled(false);
               this.buttonTaskAgregarVacuna.setEnabled(false);
               this.buttonTaskQuitarVacuna.setEnabled(false);
            }
            if(opcionparasitos==1){
               this.jComboBoxOpcionParasitos.getModel().setSelectedItem("Si");
               this.jComboBoxOpcion2Parasitos.getModel().setSelectedItem("Si");
               this.jTextAreaParasitos.setText(parasitos);
               this.jDateChooserFECHADESPAR.setDate(tiempodespar);
            }else{
               this.jComboBoxOpcionParasitos.getModel().setSelectedItem("No");
               this.jComboBoxOpcion2Parasitos.getModel().setSelectedItem("No");
               this.jTextAreaParasitos.setText("");
            }
            
            if(opcionalergias==1){
               this.jComboBoxOpcionAlergias.getModel().setSelectedItem("Si");
               this.jTextAreaMedicamentos.setText(alergias);
            }else{
               this.jComboBoxOpcionAlergias.getModel().setSelectedItem("No");
               this.jTextAreaMedicamentos.setText("");
            }
            if(opciondesparasitado==1){
               this.jComboBoxOpcionDesparasitado.getModel().setSelectedItem("Si");
               this.jDateChooserFECHADESPAR.setEnabled(true);
            }else{
               this.jComboBoxOpcionDesparasitado.getModel().setSelectedItem("No");
               jDateChooserFECHADESPAR.setEnabled(false);
            }
            if(opcionproblemasresp==1){
              this.jComboBoxOpcionProblemasResp.getModel().setSelectedItem("Si");
            }else{
               jComboBoxOpcionProblemasResp.getModel().setSelectedItem("No");
            }
            if(opcionpreñada==1){
              this.jComboBoxOpcionPreñada.getModel().setSelectedItem("Si");
            }else{
               jComboBoxOpcionPreñada.getModel().setSelectedItem("No");
            }
            
            if(opcioncastrado==1){
              this.jComboBoxOpcionCastrado.getModel().setSelectedItem("Si");
            }else{
               jComboBoxOpcionCastrado.getModel().setSelectedItem("No");
            }
           
        } catch (SQLException e) {
           System.out.print(e.getMessage());
        }       
    }
}

