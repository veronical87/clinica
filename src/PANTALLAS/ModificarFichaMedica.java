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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ModificarFichaMedica extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    ClaseFichasMedicas ficha=new ClaseFichasMedicas();  
    Clase_Personas persona=new Clase_Personas();
    GregorianCalendar hoy = new GregorianCalendar();  
    DefaultTableModel modelo;
    private java.sql.Date y;
    Calendar Calendario = Calendar.getInstance(); 
    public ModificarFichaMedica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);       
        initComponents();
        setLocationRelativeTo(null);
        jTabbedPane1.setEnabledAt(1,false);
        jDateChooser.setMaxSelectableDate(hoy.getTime());
        
        this.jTextAreaMedicamentos.setEnabled(false);
        this.jTextAreaParasitos.setEnabled(false);
        this.jComboBoxOpcion2Parasitos.setEnabled(false);
        this.jSpinnerTiempoDesparasitacion.setEnabled(false);
        this.jComboBoxTiempoDesparasitado.setEnabled(false);
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
        jComboBoxProvincias = new javax.swing.JComboBox();
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
        jTextFieldPELAJE = new javax.swing.JTextField();
        jLabelEDAD = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabelEDADMASCOTA1 = new javax.swing.JLabel();
        jLabelTiempoTranscurrido = new javax.swing.JLabel();
        jFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabelSITUACIONPESO = new javax.swing.JLabel();
        jLabelSituacionPeso2 = new javax.swing.JLabel();
        buttonTaskAGREGARMASCOTA = new org.edisoncor.gui.button.ButtonTask();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBoxOpcionParasitos = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jComboBoxOpcion2Parasitos = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaParasitos = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jComboBoxOpcionDesparasitado = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jSpinnerTiempoDesparasitacion = new javax.swing.JSpinner();
        jComboBoxTiempoDesparasitado = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jComboBoxOpcionProblemasResp = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jComboBoxOpcionAlergias = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaMedicamentos = new javax.swing.JTextArea();
        jLabelPreñada = new javax.swing.JLabel();
        jComboBoxOpcionPreñada = new javax.swing.JComboBox();
        jComboBoxVACUNAS = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jDateChooserFECHAVACUNACIO = new com.toedter.calendar.JDateChooser();
        buttonTaskAgregarVacuna = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskQuitarVacuna = new org.edisoncor.gui.button.ButtonTask();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVACUNAS = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jComboBoxAfecciones = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableAFECCION = new javax.swing.JTable();
        buttonTaskAgregarAFECCION = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskQuitarAFECCION = new org.edisoncor.gui.button.ButtonTask();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonAction4 = new org.edisoncor.gui.button.ButtonAction();
        jLabelVETERINARIO = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        buttonTaskEDITARMASCOTA = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FICHA MEDICA");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(900, 550));

        jPanel1.setBackground(new java.awt.Color(141, 141, 175));

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS PROPIETARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Apellido(*)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nombres(*)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Domicilio(*)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("*Tipo de Telefono");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Provincia(*)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Localidad(*)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nro. de Telefono(*) ");

        jTextField_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ApellidoKeyTyped(evt);
            }
        });

        jTextField_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_NombreKeyTyped(evt);
            }
        });

        jComboBoxLocalidades.setEditable(true);
        jComboBoxLocalidades.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        jTextFieldCodigoArea.setEditable(false);
        jTextFieldCodigoArea.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setText("-");

        jTextFieldDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDomicilioKeyTyped(evt);
            }
        });

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

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("E-mail(*)");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Nro. de Doc(*)");

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

        jComboBoxProvincias.setEditable(true);
        jComboBoxProvincias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jTextField_Apellido)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextFieldCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldDomicilio)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel22)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldNroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxLocalidades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipotelefono, 0, 210, Short.MAX_VALUE)
                            .addComponent(jTextFieldcorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxProvincias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(TextFieldNroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxTipotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldNroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(141, 141, 175));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS MASCOTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Nombre(*)");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Sexo(*)");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Peso Actual(*)");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Especie(*)");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Raza(*)");

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

        jComboBoxRAZA.setEditable(true);
        jComboBoxRAZA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        buttonActionSELECCIONARIMAGEN.setBackground(new java.awt.Color(204, 204, 255));
        buttonActionSELECCIONARIMAGEN.setText("Seleccionar Imagen de Raza");
        buttonActionSELECCIONARIMAGEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionSELECCIONARIMAGENActionPerformed(evt);
            }
        });

        jLabelMostrarImagen.setOpaque(true);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Tamaño(*)");

        jComboBoxTAMANO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxTAMANO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Tamaño", "PEQUEÑO", "MEDIANO", "GRANDE" }));
        jComboBoxTAMANO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTAMANOActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Pelaje(*)");

        jTextFieldPELAJE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPELAJEKeyTyped(evt);
            }
        });

        jLabelEDAD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEDAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEDAD.setOpaque(true);

        jDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooserFocusLost(evt);
            }
        });
        jDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserPropertyChange(evt);
            }
        });

        jLabelEDADMASCOTA1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEDADMASCOTA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEDADMASCOTA1.setText("Fecha Nacimiento(*)");

        jLabelTiempoTranscurrido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTiempoTranscurrido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTiempoTranscurrido.setOpaque(true);

        jFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));
        jFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldFocusLost(evt);
            }
        });
        jFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldActionPerformed(evt);
            }
        });
        jFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Ingresar con Punto");

        jLabelSITUACIONPESO.setBackground(new java.awt.Color(204, 204, 204));
        jLabelSITUACIONPESO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSITUACIONPESO.setOpaque(true);

        jLabelSituacionPeso2.setBackground(new java.awt.Color(204, 204, 204));
        jLabelSituacionPeso2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabelSituacionPeso2.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxRAZA, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPELAJE, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)))
                        .addGap(150, 150, 150))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxESPECIE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(57, 57, 57)
                                .addComponent(jComboBoxTAMANO, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(buttonActionSELECCIONARIMAGEN, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelSituacionPeso2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(jLabelSITUACIONPESO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEDADMASCOTA1)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldMASCOTA, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelEDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelTiempoTranscurrido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMostrarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextFieldMASCOTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelEDADMASCOTA1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEDAD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTiempoTranscurrido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jComboBoxSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelMostrarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBoxESPECIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jComboBoxTAMANO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jComboBoxRAZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldPELAJE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelSITUACIONPESO, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSituacionPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonActionSELECCIONARIMAGEN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        buttonTaskAGREGARMASCOTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/agregar-icono-5633-32.png"))); // NOI18N
        buttonTaskAGREGARMASCOTA.setCategoryFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonTaskAGREGARMASCOTA.setCategorySmallFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskAGREGARMASCOTA.setDescription("..");
        buttonTaskAGREGARMASCOTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskAGREGARMASCOTAActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTaskAGREGARMASCOTA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(buttonTaskAGREGARMASCOTA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("DATOS GENERALES", new javax.swing.ImageIcon(getClass().getResource("/ICONOS/kde-archivo-txt-icono-7701-32.png")), jPanel1); // NOI18N

        jPanel2.setBackground(new java.awt.Color(141, 141, 175));

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
                .addComponent(jTextFieldDueñoHC)
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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("¿La mascota posee vacunas?(*) ");

        jComboBoxOpcionVacunas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionVacunas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionVacunasActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("¿Cuáles?");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("¿Tuvo Parasitos?(*) ");

        jComboBoxOpcionParasitos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionParasitos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionParasitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionParasitosActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("¿Recientemente?");

        jComboBoxOpcion2Parasitos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcion2Parasitos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcion2Parasitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcion2ParasitosActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("¿Cuáles?");

        jTextAreaParasitos.setColumns(20);
        jTextAreaParasitos.setRows(5);
        jTextAreaParasitos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaParasitosKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(jTextAreaParasitos);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("¿Fue Desparasitado?(*) ");

        jComboBoxOpcionDesparasitado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionDesparasitado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionDesparasitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionDesparasitadoActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("¿Hace cuanto?");

        jSpinnerTiempoDesparasitacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSpinnerTiempoDesparasitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinnerTiempoDesparasitacionMouseClicked(evt);
            }
        });

        jComboBoxTiempoDesparasitado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxTiempoDesparasitado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dias", "semanas", "meses", "años", " " }));
        jComboBoxTiempoDesparasitado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxTiempoDesparasitadoFocusLost(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("¿Tuvo Problemas Respiratorios?(*) ");

        jComboBoxOpcionProblemasResp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionProblemasResp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionProblemasResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionProblemasRespActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("¿Es Alergico a algun medicamento?(*) ");

        jComboBoxOpcionAlergias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionAlergias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionAlergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionAlergiasActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("¿Cual?");

        jTextAreaMedicamentos.setColumns(20);
        jTextAreaMedicamentos.setRows(5);
        jTextAreaMedicamentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaMedicamentosKeyTyped(evt);
            }
        });
        jScrollPane6.setViewportView(jTextAreaMedicamentos);

        jLabelPreñada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPreñada.setText("¿Estuvo Preñada?(*) ");

        jComboBoxOpcionPreñada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxOpcionPreñada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        jComboBoxOpcionPreñada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionPreñadaActionPerformed(evt);
            }
        });

        jComboBoxVACUNAS.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxVACUNASPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxVACUNAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVACUNASActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Fecha(*)");

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

        buttonTaskQuitarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/Delete.png"))); // NOI18N
        buttonTaskQuitarVacuna.setCategoryFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        buttonTaskQuitarVacuna.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskQuitarVacuna.setDescription("..");
        buttonTaskQuitarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskQuitarVacunaActionPerformed(evt);
            }
        });

        jTableVACUNAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vacuna", "Fecha"
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

        jPanel9.setBackground(new java.awt.Color(141, 141, 175));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "AFECCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jComboBoxAfecciones.setEditable(true);
        jComboBoxAfecciones.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxAfecciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Afeccion" }));
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

        jTableAFECCION.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Afeccion"
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

        buttonTaskQuitarAFECCION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/Delete.png"))); // NOI18N
        buttonTaskQuitarAFECCION.setCategoryFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        buttonTaskQuitarAFECCION.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskQuitarAFECCION.setDescription("..");
        buttonTaskQuitarAFECCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskQuitarAFECCIONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxAfecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonTaskAgregarAFECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskQuitarAFECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(buttonTaskAgregarAFECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonTaskQuitarAFECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jComboBoxAfecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(59, 59, 59)
                        .addComponent(jComboBoxOpcionVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxVACUNAS, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserFECHAVACUNACIO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonTaskQuitarVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTaskAgregarVacuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel25))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBoxOpcionParasitos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel26)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxOpcion2Parasitos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBoxOpcionAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel41)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPreñada)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jComboBoxOpcionPreñada, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel38)
                                            .addGap(37, 37, 37)
                                            .addComponent(jComboBoxOpcionProblemasResp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(107, 107, 107)
                                .addComponent(jComboBoxOpcionDesparasitado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerTiempoDesparasitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxTiempoDesparasitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jComboBoxOpcionVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooserFECHAVACUNACIO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxVACUNAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonTaskAgregarVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonTaskQuitarVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jComboBoxOpcionParasitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxOpcion2Parasitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel40)
                                .addComponent(jComboBoxOpcionAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jComboBoxOpcionDesparasitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTiempoDesparasitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTiempoDesparasitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jComboBoxOpcionProblemasResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPreñada)
                    .addComponent(jComboBoxOpcionPreñada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("HISTORIAL CLINICO", new javax.swing.ImageIcon(getClass().getResource("/ICONOS/agregar-carpetas-de-archivo-a-manila-icono-8443-32.png")), jPanel2); // NOI18N

        buttonActionGUARDAR.setText("GUARDAR");
        buttonActionGUARDAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionGUARDARActionPerformed(evt);
            }
        });

        buttonAction4.setText("CANCELAR");
        buttonAction4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonAction4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction4ActionPerformed(evt);
            }
        });

        jLabelVETERINARIO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelVETERINARIO.setForeground(new java.awt.Color(153, 0, 0));
        jLabelVETERINARIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVETERINARIO.setText("jLabel4");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("VETERINARIO");

        buttonTaskEDITARMASCOTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/kde-archivo-txt-icono-7701-32.png"))); // NOI18N
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

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelVETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(buttonAction4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(397, 397, 397))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonTaskEDITARMASCOTA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelVETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))))
                .addGap(233, 233, 233)
                .addComponent(buttonTaskEDITARMASCOTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                    .addContainerGap(74, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(81, 81, 81)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int idFicha,idPropietario,idpersona;String datoImagen;
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
String seleccionprov,coincidencia;int indice1;boolean banderaProvincia,banderaLocalidad;
    private void jComboBoxLocalidadesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxLocalidadesPopupMenuWillBecomeVisible
     seleccionprov = jComboBoxProvincias.getSelectedItem().toString();
     BuscarLocalidadesxPROVINCIA(seleccionprov);
     banderaLocalidad=true;
    }//GEN-LAST:event_jComboBoxLocalidadesPopupMenuWillBecomeVisible

    private void jComboBoxLocalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLocalidadesActionPerformed
      if(banderaLocalidad==true){
        String localidad = this.jComboBoxLocalidades.getSelectedItem().toString();
        int indice=Integer.parseInt(String.valueOf(this.jComboBoxLocalidades.getSelectedIndex()));
        if(indice==-1){
            BuscarCoincidenciasxLocalidad(localidad,IDProvincia);
        }else{
            BuscarIDLocalidad(localidad);
        }
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
        }
    }//GEN-LAST:event_jTextFieldNroTelefonoKeyTyped

    private void jTextFieldDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDomicilioKeyTyped
        char codigo = evt.getKeyChar();
        if(Character.isAlphabetic(codigo)){
            if (this.jTextField_Nombre.getText().length()==50) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextFieldDomicilioKeyTyped

    private void jTextFieldcorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldcorreoFocusLost
        String correo = this.jTextFieldcorreo.getText();
        if (isEmail(correo)) {

        } else {
            JOptionPane.showMessageDialog(null, "El E-mail Ingresado está Incorrecto", "Atención", JOptionPane.WARNING_MESSAGE);
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
int resultadoaño,resultadomes,resultadofinal;String seleccionEspecie; boolean banderaRaza;String situacionpeso;String seleccionTamaño;String apellidoSelec,nombreSelec,domicilioSelec,tipotelefonoSelec,correoSelec;int nrotelSelec;
    private void buttonTaskAGREGARMASCOTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARMASCOTAActionPerformed
   if("".equals(this.jTextField_Apellido.getText()) || "".equals(this.jTextField_Nombre.getText()) || "".equals(this.jTextFieldDomicilio.getText()) || "".equals(this.jTextFieldCodigoArea.getText()) || "".equals(jTextFieldNroTelefono.getText())|| jTextFieldcorreo.getText().equals("")|| jTextFieldMASCOTA.getText().equals("")||jDateChooser.getDate()==null || jComboBoxSEXO.getModel().getSelectedItem().equals("Seleccionar")||jTextFieldPELAJE.getText().equals("")||this.jFormattedTextField.getText().equals("")||jComboBoxTAMANO.getModel().getSelectedItem().equals("Seleccionar Tamaño")|| jComboBoxESPECIE.getModel().getSelectedItem().equals("Seleccionar")){
       JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención", JOptionPane.WARNING_MESSAGE);
    }else{        
        ModificarDatosDueño();   
//////////////        SECCION MASCOTA
        String nombremascota=this.jTextFieldMASCOTA.getText();
        String sexo=String.valueOf(jComboBoxSEXO.getModel().getSelectedItem());
        String pelaje=String.valueOf(jTextFieldPELAJE.getText());
        double kilaje=Double.valueOf(jFormattedTextField.getText());
        int edad=Integer.valueOf(this.jLabelEDAD.getText());
//        String tamano = String.valueOf(jComboBoxTAMANO.getModel().getSelectedItem());        
        String tiemponac=jLabelTiempoTranscurrido.getText();
        String raza = String.valueOf(jComboBoxRAZA.getModel().getSelectedItem());
        String especie = String.valueOf(jComboBoxESPECIE.getModel().getSelectedItem());
        String apellido = this.jTextField_Apellido.getText();
        String nombre = this.jTextField_Nombre.getText();
        
        BuscarUsuario();
        fecha();

        if(jDateChooser.getDate()!=null ){
            String formato ="yyyy/MM/dd";
            y= new Date(this.jDateChooser.getDate().getYear(), jDateChooser.getDate().getMonth(), jDateChooser.getDate().getDate());
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String fechaNacimiento=sdf.format(y);
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
            ficha.AgregarDatosMascota(idPropietario,fechaActual,nombremascota,fechaNacimiento,idraza,sexo,pelaje,kilaje,edad,tiemponac,situacionpeso,datoImagen);
            ficha.InsertarDatosAuditoria(fechaActual,hor,usu,"FICHAS MEDICAS","ALTA","",nuevo);
            limpiarTabla(TABLA);
            modelo = (DefaultTableModel) TABLA.getModel();
            ficha.LlenarTablaDatosMascotas(modelo,idPropietario);
            limpiarCampos();
        }
   }
    }//GEN-LAST:event_buttonTaskAGREGARMASCOTAActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
    jTabbedPane1.setEnabledAt(1,true);
    buttonTaskEDITARMASCOTA.setEnabled(true);
    buttonTaskEDITARMASCOTA.setVisible(true);
    buttonTaskAGREGARMASCOTA.setVisible(false);
//    DesBloqueoDatosMascota();
    String id;
    int filasel = TABLA.getSelectedRow();
    modelo = (javax.swing.table.DefaultTableModel) TABLA.getModel();
    id = (String) modelo.getValueAt(filasel, 0);
    BuscarDatosMascota(id);
    }//GEN-LAST:event_TABLAMouseClicked
int opcionVacunas;int opcionParasitos;int opcionDesparasitado;int opcionProbResp;int opcionSarna;int opcionParvovirus;int opcionLeishmaniasis;int opcionMoquillo;int opcionGusanoCorazon;int opcionAlergias;int opcionPreñada;
    private void jComboBoxProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProvinciasActionPerformed
     if(banderaProvincia==true){
        seleccionprov = this.jComboBoxProvincias.getSelectedItem().toString();
        int indice=this.jComboBoxProvincias.getSelectedIndex();

        if(indice==-1){
            coincidencia=seleccionprov;
            BuscarCoincidenciasxProv(seleccionprov);
            indice1=indice;
        }else{
            BuscarIDProvincia(seleccionprov);

        }        
    }
    }//GEN-LAST:event_jComboBoxProvinciasActionPerformed

    private void jComboBoxProvinciasPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxProvinciasPopupMenuWillBecomeVisible
    String combo= String.valueOf(jComboBoxProvincias.getModel().getSelectedItem());
    
     if(indice1==-1){
        BuscarCoincidenciasxProv(combo);
        }else{
            LlenarComboProvincias();
        }     
     banderaProvincia=true;
    }//GEN-LAST:event_jComboBoxProvinciasPopupMenuWillBecomeVisible

    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
    int nrohistorial =Integer.valueOf(this.jTextFieldNroHistorial.getText());
    String nombremascota=this.jTextFieldMascotaHC.getText();
   
    String parasitos=String.valueOf(this.jTextAreaParasitos.getText());
    String alergias=String.valueOf(this.jTextAreaMedicamentos.getText());
    int tiempodespar =Integer.valueOf(String.valueOf(jSpinnerTiempoDesparasitacion.getModel().getValue()));
    String tiempodesparcombo=String.valueOf(this.jComboBoxTiempoDesparasitado.getModel().getSelectedItem());
    String nuevo="Nro.Historial:"+nrohistorial+"Propietario:"+nombredueño+";"+"Mascota:"+""+nombremascota;
  
    BuscarUsuario();
    fecha();
    ficha.ModificarHistorial(nrohistorial,opcionVacunas,opcionParasitos,parasitos,opcionAlergias,alergias,opcionDesparasitado,tiempodespar,tiempodesparcombo,opcionProbResp,opcionPreñada);
    ficha.InsertarDatosAuditoria(fechaActual,hor,usu,"HISTORIAL CLINICO","MODIFICAR","",nuevo);
    JOptionPane.showMessageDialog(null,"Se Guardaron los Datos Correctamente","Informacion", JOptionPane.INFORMATION_MESSAGE);
    LimpiarHC();
    ENLACE(idrol);
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonAction4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction4ActionPerformed
        ENLACE(idrol);
    }//GEN-LAST:event_buttonAction4ActionPerformed

    private void jComboBoxOpcionPreñadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionPreñadaActionPerformed
        String captura=String.valueOf(jComboBoxOpcionPreñada.getModel().getSelectedItem());

        if(captura.equals("Si")){
            opcionPreñada=1;
        }else{
            opcionPreñada=2;
        }
    }//GEN-LAST:event_jComboBoxOpcionPreñadaActionPerformed

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

    private void jComboBoxOpcionAlergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionAlergiasActionPerformed
        String captura=String.valueOf(this.jComboBoxOpcionAlergias.getModel().getSelectedItem());

        if(captura.equals("Si")){
            opcionAlergias=1;
            this.jTextAreaMedicamentos.setEnabled(true);
            jTextAreaMedicamentos.requestFocus();
        }else{
            opcionAlergias=2;
            jTextAreaMedicamentos.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxOpcionAlergiasActionPerformed

    private void jComboBoxOpcionProblemasRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionProblemasRespActionPerformed
        String captura=String.valueOf(this.jComboBoxOpcionProblemasResp.getModel().getSelectedItem());

        if(captura.equals("Si")){
            opcionProbResp=1;

        }else{
            opcionProbResp=2;

        }
    }//GEN-LAST:event_jComboBoxOpcionProblemasRespActionPerformed

    private void jComboBoxTiempoDesparasitadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxTiempoDesparasitadoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTiempoDesparasitadoFocusLost

    private void jSpinnerTiempoDesparasitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinnerTiempoDesparasitacionMouseClicked

    }//GEN-LAST:event_jSpinnerTiempoDesparasitacionMouseClicked

    private void jComboBoxOpcionDesparasitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionDesparasitadoActionPerformed
        String captura=String.valueOf(this.jComboBoxOpcionDesparasitado.getModel().getSelectedItem());

        if(captura.equals("Si")){
            opcionDesparasitado=1;
            this.jSpinnerTiempoDesparasitacion.setEnabled(true);
            this.jComboBoxTiempoDesparasitado.setEnabled(true);
        }else{
            opcionDesparasitado=2;
            jSpinnerTiempoDesparasitacion.setEnabled(false);
            jComboBoxTiempoDesparasitado.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxOpcionDesparasitadoActionPerformed

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

    private void jComboBoxOpcion2ParasitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcion2ParasitosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOpcion2ParasitosActionPerformed

    private void jComboBoxOpcionParasitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionParasitosActionPerformed
        String captura=String.valueOf(this.jComboBoxOpcionParasitos.getModel().getSelectedItem());

        if(captura.equals("Si")){
            opcionParasitos=1;
            this.jTextAreaParasitos.setEnabled(true);
            this.jComboBoxOpcion2Parasitos.setEnabled(true);
            jTextAreaParasitos.requestFocus();
        }else{
            opcionParasitos=2;
            jTextAreaParasitos.setEnabled(false);
            jComboBoxOpcion2Parasitos.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxOpcionParasitosActionPerformed

    private void jComboBoxOpcionVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionVacunasActionPerformed
         String captura=String.valueOf(jComboBoxOpcionVacunas.getModel().getSelectedItem());
                
        if(captura.equals("Si")){
            opcionVacunas=1;
           this.jComboBoxVACUNAS.setEnabled(true);
           this.jDateChooserFECHAVACUNACIO.setEnabled(true);
           buttonTaskAgregarVacuna.setEnabled(true);
           buttonTaskQuitarVacuna.setEnabled(false);
           this.jTableVACUNAS.setEnabled(true);
           
        }else{
           opcionVacunas=2;
           jComboBoxVACUNAS.setEnabled(false);
           this.jDateChooserFECHAVACUNACIO.setEnabled(false);
           buttonTaskAgregarVacuna.setEnabled(false);           
           this.jTableVACUNAS.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxOpcionVacunasActionPerformed

    private void jTextFieldDueñoHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDueñoHCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDueñoHCActionPerformed

    private void jTextFieldMascotaHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMascotaHCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMascotaHCActionPerformed

    private void jComboBoxVACUNASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVACUNASActionPerformed
        String vacuna=String.valueOf(this.jComboBoxVACUNAS.getModel().getSelectedItem());
        BuscarIDVacuna(vacuna);
    }//GEN-LAST:event_jComboBoxVACUNASActionPerformed

    private void buttonTaskAgregarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAgregarVacunaActionPerformed
        String formato = "yyyy/MM/dd";
        Date desde=new Date( this.jDateChooserFECHAVACUNACIO.getDate().getYear(), jDateChooserFECHAVACUNACIO.getDate().getMonth(),jDateChooserFECHAVACUNACIO.getDate().getDate() );
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String d = sdf.format(desde);
        BuscarIDFicha();
        ficha.agregarVacunaxMascota(idFicha,IDVacuna,d);
        limpiarTabla(jTableVACUNAS);
        modelo = (DefaultTableModel) jTableVACUNAS.getModel();
        ficha.LlenarTablaVacunas(modelo,idFicha);
    }//GEN-LAST:event_buttonTaskAgregarVacunaActionPerformed

    private void buttonTaskQuitarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskQuitarVacunaActionPerformed
        ficha.QuitarVacunaxMascota(IDVacunaxMascota);
        limpiarTabla(jTableVACUNAS);
        modelo = (DefaultTableModel) jTableVACUNAS.getModel();
        ficha.LlenarTablaVacunas(modelo,idFicha);
    }//GEN-LAST:event_buttonTaskQuitarVacunaActionPerformed

    private void jTableVACUNASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVACUNASMouseClicked
        buttonTaskQuitarVacuna.setEnabled(true);
        String id;
        int filasel = this.jTableVACUNAS.getSelectedRow();
        modelo = (javax.swing.table.DefaultTableModel) jTableVACUNAS.getModel();
        id = (String) modelo.getValueAt(filasel, 0);
        BuscarIDVacunaxMascota(id);
    }//GEN-LAST:event_jTableVACUNASMouseClicked

    private void jComboBoxVACUNASPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxVACUNASPopupMenuWillBecomeVisible
     LlenarComboVacunas();
    }//GEN-LAST:event_jComboBoxVACUNASPopupMenuWillBecomeVisible

    private void jDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserPropertyChange
        if(!jTextField_Apellido.getText().isEmpty()){
            if(jDateChooser.getDate()==null){
            JOptionPane.showMessageDialog(null, "La Fecha de Nacimiento No Puede estar Vacio","Atencion",JOptionPane.WARNING_MESSAGE);
        }else{
//            int resultadoaño;
            int añoactual =hoy.get(Calendar.YEAR);
            int selecaño= jDateChooser.getJCalendar().getYearChooser().getYear();
            resultadoaño=añoactual-selecaño;

            if(resultadoaño==0){    // SI EL RESULTADO ES 0, QUIERE DECIR QUE NACIO EN EL CORRIENTE AÑO
                int mesactual=hoy.get(Calendar.MONTH)+1;
                int messelec= jDateChooser.getJCalendar().getMonthChooser().getMonth()+1;
                if(messelec<mesactual){
                    resultadomes=mesactual-messelec;
                }else{
                    resultadomes=messelec-mesactual;
                }

                if(resultadomes<2 || resultadomes==2){
                    int contar=0,sumardias=0;
                    int dia= Calendario.get(Calendar.DAY_OF_MONTH);
                    int diaselec= jDateChooser.getJCalendar().getDayChooser().getDay();
                    int mes= jDateChooser.getJCalendar().getMonthChooser().getMonth()+1;

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
                        if(mes==2 & añoactual==2016){
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

            }else{
                jLabelEDAD.setText(String.valueOf(resultadoaño));
                jLabelTiempoTranscurrido.setText("AÑOS");
            }
        }
        }
       
    }//GEN-LAST:event_jDateChooserPropertyChange

    private void jDateChooserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserFocusLost

    }//GEN-LAST:event_jDateChooserFocusLost

    private void jTextFieldPELAJEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPELAJEKeyTyped
        char codigo = evt.getKeyChar();
        if (Character.isDigit(codigo)) {
            evt.consume();
        }else if(Character.isAlphabetic(codigo)){
            if (this.jTextField_Nombre.getText().length()==100) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextFieldPELAJEKeyTyped

    private void jComboBoxTAMANOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTAMANOActionPerformed
  seleccionTamaño = this.jComboBoxTAMANO.getSelectedItem().toString();   
  int indice = jComboBoxTAMANO.getSelectedIndex();
         
    if(indice==-1){
        BuscarTamaño(seleccionTamaño);           
    }else{
        BuscarIDTamaño(seleccionTamaño);
    }    
        LlenarComboRazas(seleccionEspecie,seleccionTamaño);
    }//GEN-LAST:event_jComboBoxTAMANOActionPerformed

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

        }
    }//GEN-LAST:event_buttonActionSELECCIONARIMAGENActionPerformed

    private void jComboBoxRAZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRAZAActionPerformed
     String  seleccionraza = String.valueOf(jComboBoxRAZA.getModel().getSelectedItem());
        if(banderaRaza==true){           
            BuscarIDRaza(seleccionraza);
        }else{
           this.BuscarCoincidenciasxRaza(seleccionraza);
        }
    }//GEN-LAST:event_jComboBoxRAZAActionPerformed

    private void jComboBoxRAZAPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxRAZAPopupMenuWillBecomeVisible
        LlenarComboRazas(seleccionEspecie,seleccionTamaño);
        banderaRaza=true;
    }//GEN-LAST:event_jComboBoxRAZAPopupMenuWillBecomeVisible

    private void jComboBoxESPECIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxESPECIEActionPerformed
        seleccionEspecie = String.valueOf(jComboBoxESPECIE.getSelectedItem());
        int indice=this.jComboBoxESPECIE.getSelectedIndex();

        if(indice==-1){
            coincidencia=seleccionEspecie;
            BuscarCoincidenciasxEspecie(seleccionEspecie);
            indice1=indice;
        }else{
            BuscarIDEspecie(seleccionEspecie);
            LlenarComboRazas(seleccionEspecie,seleccionTamaño);
        }
    }//GEN-LAST:event_jComboBoxESPECIEActionPerformed

    private void jComboBoxESPECIEPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxESPECIEPopupMenuWillBecomeVisible
        LlenarComboEspecies();
    }//GEN-LAST:event_jComboBoxESPECIEPopupMenuWillBecomeVisible

    private void jComboBoxSEXOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSEXOActionPerformed

    }//GEN-LAST:event_jComboBoxSEXOActionPerformed

    private void jComboBoxSEXOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxSEXOFocusGained

    }//GEN-LAST:event_jComboBoxSEXOFocusGained

    private void jTextFieldMASCOTAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMASCOTAKeyTyped
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
    }//GEN-LAST:event_jTextFieldMASCOTAKeyTyped

    private void jTextFieldMASCOTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMASCOTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMASCOTAActionPerformed

    private void jTextFieldMASCOTAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMASCOTAFocusLost
        String nl = System.getProperty("line.separator");
        if("".equals(this.jTextField_Apellido.getText()) || "".equals(this.jTextField_Nombre.getText()) || "".equals(this.jTextFieldDomicilio.getText()) || "".equals(this.jTextFieldCodigoArea.getText()) || "".equals(this.jTextFieldNroTelefono.getText())){
            JOptionPane.showMessageDialog(null,"Debe Completar todos los Campos Obligatorios del Dueño antes"+nl+"de Comenzar con los Datos de la Mascota","Atención", JOptionPane.WARNING_MESSAGE);
        }else{
            String nombre=this.jTextFieldMASCOTA.getText();
            int salida = ficha.VerificarMascota(idPropietario,nombre);
            String   apellido = this.jTextField_Apellido.getText();
            String   propietario = apellido+","+jTextField_Nombre.getText();
            if (salida !=0) {
                JOptionPane.showMessageDialog(null,"La Mascota"+" "+nombre+" "+", perteneciente a, "+propietario+" se Encuentra Registrada","Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldMASCOTAFocusLost

    private void jTextFieldMASCOTAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMASCOTAFocusGained

    }//GEN-LAST:event_jTextFieldMASCOTAFocusGained

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
        ficha.agregarAfeccionxFicha(idFicha,IDAfeccion);
        limpiarTabla(jTableAFECCION);
        modelo = (DefaultTableModel) jTableAFECCION.getModel();
        ficha.LlenarTablaAFECCIONES(modelo,idFicha);
    }//GEN-LAST:event_buttonTaskAgregarAFECCIONActionPerformed

    private void buttonTaskQuitarAFECCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskQuitarAFECCIONActionPerformed
        ficha.quitarAfeccionxFicha(idFicha,IDAfeccion);
        limpiarTabla(jTableAFECCION);
        modelo = (DefaultTableModel) jTableAFECCION.getModel();
        ficha.LlenarTablaAFECCIONES(modelo,idFicha);
    }//GEN-LAST:event_buttonTaskQuitarAFECCIONActionPerformed

    private void jFormattedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldFocusLost
        String sexo =String.valueOf(this.jComboBoxSEXO.getModel().getSelectedItem());
        String c=String.valueOf(jFormattedTextField.getText());
        Double PESOACTUAL =Double.parseDouble(c);
        DatosRaza(idraza);

        //      String cambio="0"+PESOACTUAL;

        if(resultadoaño!=0){
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
        }else if(resultadomes>2 || resultadomes<12){
            switch (seleccionTamaño) {
                case "PEQUEÑO":
                if(PESOACTUAL<1){
                    if(PESOACTUAL<0.20){
                        situacionpeso="PESO BAJO";
                        jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                        jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de los 200grs.");
                    }
                }else if(PESOACTUAL>0.20 & PESOACTUAL<03.00 || PESOACTUAL==03.00){
                    situacionpeso="NORMAL";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                }else if(PESOACTUAL>03.00){
                    situacionpeso="SOBREPESO";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                    jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de los 3 kilos");
                }

                break;
                case "MEDIANO":
                if(PESOACTUAL<02.00){
                    situacionpeso="PESO BAJO";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                    jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de los 2 kilos");
                }else if(PESOACTUAL>02.00 & PESOACTUAL<05.00 || PESOACTUAL==05.00){
                    situacionpeso="NORMAL";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                }else if(PESOACTUAL>05.00){
                    situacionpeso="SOBREPESO";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                    jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de los 5 kilos");
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
    }//GEN-LAST:event_jFormattedTextFieldFocusLost

    private void jFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldActionPerformed

    private void jFormattedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldKeyTyped
        if(jFormattedTextField.getText().length()>5){
            evt.consume();
        }
    }//GEN-LAST:event_jFormattedTextFieldKeyTyped

    private void TABLAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLAMouseEntered

    private void buttonTaskEDITARMASCOTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskEDITARMASCOTAActionPerformed
  if("".equals(this.jTextField_Apellido.getText()) || "".equals(this.jTextField_Nombre.getText()) || "".equals(this.jTextFieldDomicilio.getText()) || "".equals(this.jTextFieldCodigoArea.getText()) || "".equals(jTextFieldNroTelefono.getText())|| jTextFieldcorreo.getText().equals("")|| jTextFieldMASCOTA.getText().equals("")||jDateChooser.getDate()==null || jComboBoxSEXO.getModel().getSelectedItem().equals("Seleccionar")||jTextFieldPELAJE.getText().equals("")||this.jFormattedTextField.getText().equals("")||jComboBoxTAMANO.getModel().getSelectedItem().equals("Seleccionar Tamaño")|| jComboBoxESPECIE.getModel().getSelectedItem().equals("Seleccionar")){
       JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención", JOptionPane.WARNING_MESSAGE);
    }else{        
        ModificarDatosDueño();   
//////////////        SECCION MASCOTA
        String nombremascota=this.jTextFieldMASCOTA.getText();
        String sexo=String.valueOf(jComboBoxSEXO.getModel().getSelectedItem());
        String pelaje=String.valueOf(jTextFieldPELAJE.getText());
        double kilaje=Double.valueOf(jFormattedTextField.getText());
        int edad=Integer.valueOf(this.jLabelEDAD.getText());
//        String tamano = String.valueOf(jComboBoxTAMANO.getModel().getSelectedItem());        
        String tiemponac=jLabelTiempoTranscurrido.getText();
        String raza = String.valueOf(jComboBoxRAZA.getModel().getSelectedItem());
        String especie = String.valueOf(jComboBoxESPECIE.getModel().getSelectedItem());
        String apellido = this.jTextField_Apellido.getText();
        String nombre = this.jTextField_Nombre.getText();
        
        BuscarUsuario();
        fecha();

        if(jDateChooser.getDate()!=null ){
            String formato ="yyyy/MM/dd";
            y= new Date(this.jDateChooser.getDate().getYear(), jDateChooser.getDate().getMonth(), jDateChooser.getDate().getDate());
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String fechaNacimiento=sdf.format(y);
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

            ficha.ModificarDatosMascota(idFicha,idPropietario,nombremascota,fechaNacimiento,idraza,sexo,pelaje,kilaje,edad,tiemponac,situacionpeso,datoImagen);
            ficha.InsertarDatosAuditoria(fechaActual,hor,usu,"FICHAS MEDICAS","MODIFICACION",anterior,nuevo);
            limpiarTabla(TABLA);
            modelo = (DefaultTableModel) TABLA.getModel();
            ficha.LlenarTablaDatosMascotas(modelo,idPropietario);
            limpiarCampos();
            jTabbedPane1.setEnabledAt(1,false);
            buttonTaskEDITARMASCOTA.setVisible(false);
            buttonTaskAGREGARMASCOTA.setVisible(true);
        }
        JOptionPane.showMessageDialog(null,"Se Guardaron los Cambios Correctamente","Información", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_buttonTaskEDITARMASCOTAActionPerformed
int idrol,idusuario;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {    /**
     * @param args the command line arguments
     */
    
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
            java.util.logging.Logger.getLogger(ModificarFichaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarFichaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarFichaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarFichaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                ModificarFichaMedica dialog = new ModificarFichaMedica(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonAction buttonAction4;
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    public org.edisoncor.gui.button.ButtonAction buttonActionSELECCIONARIMAGEN;
    public org.edisoncor.gui.button.ButtonTask buttonTaskAGREGARMASCOTA;
    private org.edisoncor.gui.button.ButtonTask buttonTaskAgregarAFECCION;
    private org.edisoncor.gui.button.ButtonTask buttonTaskAgregarVacuna;
    private org.edisoncor.gui.button.ButtonTask buttonTaskEDITARMASCOTA;
    private org.edisoncor.gui.button.ButtonTask buttonTaskQuitarAFECCION;
    private org.edisoncor.gui.button.ButtonTask buttonTaskQuitarVacuna;
    private javax.swing.JComboBox jComboBoxAfecciones;
    public javax.swing.JComboBox jComboBoxESPECIE;
    public javax.swing.JComboBox jComboBoxLocalidades;
    public javax.swing.JComboBox jComboBoxOpcion2Parasitos;
    public javax.swing.JComboBox jComboBoxOpcionAlergias;
    public javax.swing.JComboBox jComboBoxOpcionDesparasitado;
    public javax.swing.JComboBox jComboBoxOpcionParasitos;
    public javax.swing.JComboBox jComboBoxOpcionPreñada;
    public javax.swing.JComboBox jComboBoxOpcionProblemasResp;
    public javax.swing.JComboBox jComboBoxOpcionVacunas;
    public javax.swing.JComboBox jComboBoxProvincias;
    public javax.swing.JComboBox jComboBoxRAZA;
    public javax.swing.JComboBox jComboBoxSEXO;
    public javax.swing.JComboBox jComboBoxTAMANO;
    public javax.swing.JComboBox jComboBoxTiempoDesparasitado;
    public javax.swing.JComboBox jComboBoxTipotelefono;
    private javax.swing.JComboBox jComboBoxVACUNAS;
    public com.toedter.calendar.JDateChooser jDateChooser;
    private com.toedter.calendar.JDateChooser jDateChooserFECHAVACUNACIO;
    public javax.swing.JFormattedTextField jFormattedTextField;
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
    public javax.swing.JLabel jLabelSITUACIONPESO;
    public javax.swing.JLabel jLabelSituacionPeso2;
    private javax.swing.JLabel jLabelTiempoTranscurrido;
    public javax.swing.JLabel jLabelVETERINARIO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JSpinner jSpinnerTiempoDesparasitacion;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAFECCION;
    private javax.swing.JTable jTableVACUNAS;
    public javax.swing.JTextArea jTextAreaMedicamentos;
    public javax.swing.JTextArea jTextAreaParasitos;
    public javax.swing.JTextField jTextFieldCodigoArea;
    public javax.swing.JTextField jTextFieldDomicilio;
    public javax.swing.JTextField jTextFieldDueñoHC;
    public javax.swing.JTextField jTextFieldMASCOTA;
    public javax.swing.JTextField jTextFieldMascotaHC;
    public javax.swing.JTextField jTextFieldNroHistorial;
    public javax.swing.JTextField jTextFieldNroTelefono;
    public javax.swing.JTextField jTextFieldPELAJE;
    public javax.swing.JTextField jTextField_Apellido;
    public javax.swing.JTextField jTextField_Nombre;
    public javax.swing.JTextField jTextFieldcorreo;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

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
        
        sSQL = "SELECT usuario FROM usuarios WHERE id="+idusuario;
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
 
 String fechaActual,hor;  
  void fecha(){   
    int año = Calendario.get(Calendar.YEAR);
    int mes = Calendario.get(Calendar.MONTH) + 1; 
    int dia = Calendario.get(Calendar.DAY_OF_MONTH);  
//    f=new java.sql.Date(Calendario.get(Calendar.YEAR),Calendario.get(Calendar.MONTH),Calendario.get(Calendar.DAY_OF_MONTH));
    fechaActual=año+"/"+mes+"/"+dia;
    int h=Calendario.get(Calendar.HOUR_OF_DAY);
    int minutos=Calendario.get(Calendar.MINUTE);        
    hor = String.valueOf(h+":"+minutos);  
  }
  
//int idpersona;
//private void BuscarIDPersona() {
//    try {         
//        cn=cm.Conectar();
//        Statement st = (Statement) cn.createStatement();
//        ResultSet rs = st.executeQuery("SELECT MAX(id) AS id FROM personas");
//
//        while (rs.next()) {
//          idpersona=rs.getInt("id");
//        }
//        rs.close();        
//            
//        } catch (SQLException ex) {
//            ex.getMessage();
//        }
//    }
 
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

private void BuscarCoincidenciasxEspecie(String seleccion) {
     try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM especies WHERE nombre LIKE '"+seleccion+"%' ORDER BY nombre ASC");

        while (rs.next()) {
            modeloCombo.addElement(rs.getString("nombre"));
        }
        rs.close();
        this.jComboBoxESPECIE.setModel(modeloCombo);
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
          g.buttonTaskAGREGAR.setEnabled(false);
          g.buttonTaskELIMINAR.setEnabled(false);
          g.buttonTaskMODIFICAR.setEnabled(false);
          g.TABLA.setEnabled(false);          
        }  
        this.dispose();
        g.show();
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

String nombredueño;
private void BuscarDatosMascota(String mascota) {
  java.sql.Date fechanac = null;int edad=0;String nombremascota = null,sexo= null,pelaje= null,tiemponac= null,tamano= null,especie= null,raza= null;double kilaje=0;
    try {
       cn=cm.Conectar();
       Statement st = (Statement) cn.createStatement(); 
       ResultSet rs = st.executeQuery("SELECT CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,fichamedica.id,fichamedica.mascota,cumpleaños,pelaje,kilaje,edad,tiemponac,tamaños.nombre,sexo,especies.nombre,razas.nombre,razas.id,direimagen FROM propietarios INNER JOIN fichamedica ON propietarios.id=fichamedica.idpropietario INNER JOIN razas ON fichamedica.idraza=razas.id INNER JOIN especies ON especies.id=razas.idespecie INNER JOIN tamaños ON razas.idtamano=tamaños.id WHERE fichamedica.mascota LIKE '"+mascota+"%'"); 
            while (rs.next()) {
              nombredueño=rs.getString("dueño");
              nombremascota=rs.getString("mascota");
              edad=rs.getInt("edad");
              fechanac=rs.getDate("cumpleaños");
              tiemponac=rs.getString("tiemponac");
              pelaje=rs.getString("pelaje");
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
            this.jTextFieldMASCOTA.setText(nombremascota);
            this.jDateChooser.setDate(fechanac);
            this.jLabelEDAD.setText(String.valueOf(edad));
            this.jLabelTiempoTranscurrido.setText(tiemponac);
            this.jComboBoxSEXO.getModel().setSelectedItem(sexo);
            jComboBoxTAMANO.getModel().setSelectedItem(tamano);
            jComboBoxESPECIE.getModel().setSelectedItem(especie); 
            jComboBoxRAZA.setSelectedItem(raza);                     
            jTextFieldPELAJE.setText(pelaje); 
            this.jFormattedTextField.setText(String.valueOf(kilaje));
            controlPeso(sexo, kilaje);
//            JFileChooser archivo= new JFileChooser();
//            File file=archivo.getSelectedFile();
//            datoImagen=String.valueOf(file);
            Image im= getToolkit().getImage(datoImagen);
            im=im.getScaledInstance(110,110, Image.SCALE_DEFAULT);
            jLabelMostrarImagen.setIcon(new ImageIcon(im));
            
            if("Hembra".equals(sexo)){
               jComboBoxOpcionPreñada.setVisible(true);
               jLabelPreñada.setVisible(true);
            }else{
                jComboBoxOpcionPreñada.setVisible(false);
                jLabelPreñada.setVisible(false);
               }
            BuscarDatosHistorial(idFicha);
            this.jTextFieldMascotaHC.setText(nombremascota);
            this.jTextFieldDueñoHC.setText(nombredueño);
           
        } catch (SQLException e) {
           System.out.print(e.getMessage());
        }        
    }

 private void limpiarCampos() {
   this.jTextFieldMASCOTA.setText("");
   this.jLabelEDAD.setText("");
   this.jComboBoxESPECIE.getModel().setSelectedItem("Seleccionar");
   this.jComboBoxSEXO.getModel().setSelectedItem("");
   this.jComboBoxRAZA.getModel().setSelectedItem("Seleccionar");
   this.jTextFieldPELAJE.setText("");
   this.jFormattedTextField.setText("");
   this.jComboBoxTAMANO.getModel().setSelectedItem("Seleccionar Tipo Tamaño");
   this.jLabelTiempoTranscurrido.setText("");
   this.jDateChooser.setDateFormatString(null);         
//   this.jDateChooser.setDateFormatString("yyyy/MM/dd");
   this.jLabelSITUACIONPESO.setText("");  
   this.jLabelSituacionPeso2.setText("");
   this.jLabelMostrarImagen.setVisible(false);   
   }

     private void LimpiarHC() {
       this.jTextAreaMedicamentos.setText("");
       this.jTextAreaParasitos.setText("");      
       this.jComboBoxOpcion2Parasitos.getModel().setSelectedItem("No");
       this.jComboBoxOpcionParasitos.setSelectedItem("No");
       this.jComboBoxOpcionAlergias.getModel().setSelectedItem("No");
       this.jComboBoxOpcionDesparasitado.setSelectedItem("No");
       this.jSpinnerTiempoDesparasitacion.setValue(0);
       this.jComboBoxTiempoDesparasitado.setSelectedItem("dias");
       this.jComboBoxOpcionPreñada.setSelectedItem("No");
       this.jComboBoxOpcionProblemasResp.setSelectedItem("No");      
       jTabbedPane1.setEnabledAt(1,false);
       jTabbedPane1.setSelectedIndex(0);      
       this.jTextFieldNroHistorial.setText("");
    }

    private void ModificarDatosDueño() {
         String   apellido = this.jTextField_Apellido.getText();
         String   nombre = this.jTextField_Nombre.getText();
         String   direccion = this.jTextFieldDomicilio.getText();
         int numerotel= Integer.valueOf(jTextFieldNroTelefono.getText());
         String  tipotel = String.valueOf(jComboBoxTipotelefono.getModel().getSelectedItem());
         String  correo = String.valueOf(this.jTextFieldcorreo.getText());
         int dni= Integer.valueOf(TextFieldNroDocumento.getText());
         String localidad = jComboBoxLocalidades.getSelectedItem().toString();
         
         String anterior = "Propietario:" + apellidoSelec +","+nombreSelec+","+"DNI:"+dni+",Dirección:"+ domicilioSelec +"Tipo de Teléfono:" + tipotelefonoSelec+ ",Nro. Telefono:" + nrotelSelec+ ",E-mail:" +correoSelec;
         String nuevo = "Propietario:" + apellido +","+nombre+","+"DNI:"+dni+",Dirección:"+ direccion +"Teléfono:" + numerotel+ ",E-mail:" + correo;
         
         BuscarUsuario();
         fecha();
         if(idtipotelefono==0){
            BuscarIDTIpoTelefono(tipotel);
         }     
         if(ID_LOCALIDAD==0){
            BuscarIDLocalidad(localidad);
         }
         
          String anteriorprop="Propietario:"+apellidoSelec+","+nombreSelec+";"+"Domicilio:"+""+domicilioSelec+";"+"Tipo de Telefono:"+""+tipotelefonoSelec+";"+"Nro. de Tel."+""+nrotelSelec;
          String nuevoprop="Propietario:"+apellido+","+nombre+";"+"Domicilio:"+""+direccion+";"+"Tipo de Telefono:"+""+tipotel+";"+"Nro. de Tel."+""+numerotel;
          ficha.ModificarPropietario(idPropietario, apellido, nombre);
          persona.ModificarPersona(idpersona,direccion,idtipotelefono,numerotel,ID_LOCALIDAD, correo,fechaActual,hor, usu,"PROPIETARIOS",anteriorprop,nuevoprop);
//            
         ficha.InsertarDatosAuditoria(fechaActual,hor,usu,"PROPIETARIOS","MODIFICACION",anterior,nuevo);      
    }

   private void DesBloqueoDatosMascota() {
        buttonTaskAGREGARMASCOTA.setEnabled(true);
        jTextFieldMASCOTA.setEnabled(true);
        jComboBoxESPECIE.setEnabled(true);
        jComboBoxRAZA.setEnabled(true);
        jComboBoxSEXO.setEnabled(true);
        jComboBoxTAMANO.setEnabled(true);
        jTextFieldPELAJE.setEnabled(true);
        this.jFormattedTextField.setEnabled(true);
        jDateChooser.setEnabled(true);
        buttonActionSELECCIONARIMAGEN.setEnabled(true);
        jLabelMostrarImagen.setVisible(true);
    }

    private void BuscarDatosHistorial(int idFicha) {
        String nombremascota = null,parasitos= null,alergias= null,tiempodespar= null;int nrohistorial=0,opcionvacunas=0,opcionparasitos=0,opcionalergias=0,opciondesparasitado=0,cantdespar=0,opcionproblemasresp=0,opcionpreñada=0;
    try {
       cn=cm.Conectar();
       Statement st = (Statement) cn.createStatement(); 
       ResultSet rs = st.executeQuery("SELECT CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,fichamedica.mascota,nrohistorial,opcionvacunas,opcionparasitos,parasitos,opcionalergias,alergias,opciondesparasitado,cantdespar,tiempodespar,opcionproblemasresp,opcionpreñada FROM propietarios INNER JOIN fichamedica ON propietarios.id=fichamedica.idpropietario INNER JOIN historialclinico ON historialclinico.idficha=fichamedica.id WHERE historialclinico.idficha="+idFicha); 
            while (rs.next()) {
              nombredueño=rs.getString("dueño");
              nombremascota=rs.getString("mascota");
              nrohistorial=rs.getInt("nrohistorial");
              opcionvacunas=rs.getInt("opcionvacunas");
             
              opcionparasitos=rs.getInt("opcionparasitos");
              parasitos=rs.getString("parasitos");
              opcionalergias=rs.getInt("opcionalergias");
              alergias=rs.getString("alergias");
              opciondesparasitado=rs.getInt("opciondesparasitado");
              cantdespar=rs.getInt("cantdespar");
              tiempodespar=rs.getString("tiempodespar");
              opcionproblemasresp=rs.getInt("opcionproblemasresp");
              opcionpreñada=rs.getInt("opcionpreñada");
             
            }
            rs.close();
            
            this.jTextFieldMascotaHC.setText(nombremascota);
            this.jTextFieldDueñoHC.setText(nombredueño);
            this.jTextFieldNroHistorial.setText(String.valueOf(nrohistorial));
            
            if(opcionvacunas==1){
               jComboBoxOpcionVacunas.getModel().setSelectedItem("Si");  
               this.jComboBoxVACUNAS.setEnabled(true);
               this.jDateChooserFECHAVACUNACIO.setEnabled(true);
               this.buttonTaskAgregarVacuna.setEnabled(true);
               this.buttonTaskQuitarVacuna.setEnabled(false);               
               limpiarTabla(jTableVACUNAS);
               modelo = (DefaultTableModel) jTableVACUNAS.getModel();
               ficha.LlenarTablaVacunas(modelo,idFicha);
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
               this.jSpinnerTiempoDesparasitacion.getModel().setValue(cantdespar);
               this.jComboBoxTiempoDesparasitado.getModel().setSelectedItem(tiempodespar);
            }else{
               this.jComboBoxOpcionDesparasitado.getModel().setSelectedItem("No");
               this.jSpinnerTiempoDesparasitacion.getModel().setValue(0);
               this.jComboBoxTiempoDesparasitado.getModel().setSelectedItem("");
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
           
        } catch (SQLException e) {
           System.out.print(e.getMessage());
        }       
    }
    
private void LlenarComboVacunas() {
   try {            
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT DISTINCT nombre FROM controlvacunas ORDER BY nombre ASC");

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
 
 
private void BuscarIDFicha() {
   try {       
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT MAX(id) AS id FROM fichamedica");

    while (rs.next()) {
       idFicha=rs.getInt("id");
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

private void controlPeso(String sexo,double PESOACTUAL) {
   if(resultadoaño!=0){
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
  }else if(resultadomes>2 || resultadomes<12){
     switch (seleccionTamaño) {
             case "PEQUEÑO":
                 if(PESOACTUAL<1){
                     if(PESOACTUAL<0.20){
                        situacionpeso="PESO BAJO"; 
                        jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso); 
                        jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de los 200grs.");
                     }                                                           
                 }else if(PESOACTUAL>0.20 & PESOACTUAL<03.00 || PESOACTUAL==03.00){
                     situacionpeso="NORMAL";       
                     jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso); 
                 }else if(PESOACTUAL>03.00){
                    situacionpeso="SOBREPESO";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso); 
                    jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de los 3 kilos");
                 }
              
                 break;
          case "MEDIANO":
                  if(PESOACTUAL<02.00){
                    situacionpeso="PESO BAJO";
                    jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                    jLabelSituacionPeso2.setText("Su Peso Debe estar Por Encima de los 2 kilos");
                  }else if(PESOACTUAL>02.00 & PESOACTUAL<05.00 || PESOACTUAL==05.00){
                     situacionpeso="NORMAL";                 
                     jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                 }else if(PESOACTUAL>05.00){
                      situacionpeso="SOBREPESO";
                      jLabelSITUACIONPESO.setText("La Situacion del Peso de la Mascota es "+situacionpeso);
                      jLabelSituacionPeso2.setText("Su Peso Debe estar Por Debajo de los 5 kilos");
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

}
