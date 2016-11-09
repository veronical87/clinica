package PANTALLAS;

import CLASES.ClaseMedicamentos;
import CLASES.ClaseUsuarios;
import CLASES.Clase_Personas;
import CLASES.JTextFieldToUpperCase;
import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Alta_Usuario extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    DefaultTableModel modelo;
    CallableStatement cmd;
    ClaseUsuarios claseusu=new ClaseUsuarios();
 
    Clase_Personas PERSONA=new Clase_Personas();
    Calendar Calendario = Calendar.getInstance();
    public Alta_Usuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.TextField_nom.setDocument(new JTextFieldToUpperCase());
        apellido.setDocument(new JTextFieldToUpperCase());
        this.TextField_usuario.setDocument(new JTextFieldToUpperCase());         
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextField_nom = new javax.swing.JTextField();
        TextField_direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTextFieldCorreo = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        TextFieldnumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TextFieldcodigo = new javax.swing.JTextField();
        jComboBox_TELEFONOS = new javax.swing.JComboBox();
        jComboBox_Localidades = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxProvincias = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        PanelUsuario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TextField_usuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboTipoUsu = new javax.swing.JComboBox();
        LLAMAR_PANTALLAROL = new javax.swing.JButton();
        TextField_contraseña = new javax.swing.JPasswordField();
        TextField_contraseña2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("AltaUsuario");

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jPanel5.setBackground(new java.awt.Color(141, 141, 175));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS PERSONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Apellido(*)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nombres(*)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Domicilio(*)");

        TextField_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_nomActionPerformed(evt);
            }
        });
        TextField_nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_nomKeyTyped(evt);
            }
        });

        TextField_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_direccionActionPerformed(evt);
            }
        });
        TextField_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_direccionKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("E-mail");

        JTextFieldCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextFieldCorreoFocusLost(evt);
            }
        });
        JTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldCorreoActionPerformed(evt);
            }
        });
        JTextFieldCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldCorreoKeyTyped(evt);
            }
        });

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });

        TextFieldnumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldnumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldnumeroFocusLost(evt);
            }
        });
        TextFieldnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldnumeroKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel11.setText("-");

        TextFieldcodigo.setEditable(false);
        TextFieldcodigo.setSelectionColor(new java.awt.Color(255, 255, 255));
        TextFieldcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldcodigoKeyTyped(evt);
            }
        });

        jComboBox_TELEFONOS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox_TELEFONOS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        jComboBox_TELEFONOS.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox_TELEFONOSPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox_TELEFONOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TELEFONOSActionPerformed(evt);
            }
        });

        jComboBox_Localidades.setEditable(true);
        jComboBox_Localidades.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox_Localidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una Localidad" }));
        jComboBox_Localidades.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox_LocalidadesPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox_Localidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_LocalidadesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Localidad(*)");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Provincia(*)");

        jLabel13.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel13.setText("*");

        jComboBoxProvincias.setEditable(true);
        jComboBoxProvincias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxProvincias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una Provincia" }));
        jComboBoxProvincias.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxProvinciasPopupMenuWillBecomeInvisible(evt);
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

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Campos Obligatorios(*)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(37, 37, 37))
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jComboBox_TELEFONOS, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(36, 36, 36)))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(71, 71, 71)))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(60, 60, 60)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(TextFieldcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(TextFieldnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextField_direccion)
                            .addComponent(jComboBox_Localidades, 0, 231, Short.MAX_VALUE)
                            .addComponent(jComboBoxProvincias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextField_nom)
                            .addComponent(JTextFieldCorreo)
                            .addComponent(apellido, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(46, 46, 46))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextField_nom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBoxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox_Localidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_TELEFONOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(TextFieldcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(TextFieldnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        PanelUsuario.setBackground(new java.awt.Color(141, 141, 175));
        PanelUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        PanelUsuario.setPreferredSize(new java.awt.Dimension(400, 150));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Usuario(*)");

        TextField_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_usuarioFocusLost(evt);
            }
        });
        TextField_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_usuarioActionPerformed(evt);
            }
        });
        TextField_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_usuarioKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Contraseña(*)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Repetir Contraseña");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Tipo de Rol(*)");

        comboTipoUsu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        comboTipoUsu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Tipo de Rol" }));
        comboTipoUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboTipoUsuFocusGained(evt);
            }
        });
        comboTipoUsu.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboTipoUsuPopupMenuWillBecomeVisible(evt);
            }
        });
        comboTipoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoUsuActionPerformed(evt);
            }
        });

        LLAMAR_PANTALLAROL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LLAMAR_PANTALLAROL.setText("...");
        LLAMAR_PANTALLAROL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LLAMAR_PANTALLAROL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LLAMAR_PANTALLAROLFocusLost(evt);
            }
        });
        LLAMAR_PANTALLAROL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LLAMAR_PANTALLAROLActionPerformed(evt);
            }
        });

        TextField_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_contraseñaKeyTyped(evt);
            }
        });

        TextField_contraseña2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_contraseña2FocusLost(evt);
            }
        });
        TextField_contraseña2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_contraseña2ActionPerformed(evt);
            }
        });
        TextField_contraseña2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_contraseña2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(24, 24, 24)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addComponent(comboTipoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LLAMAR_PANTALLAROL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_contraseña)
                            .addComponent(TextField_usuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextField_contraseña2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LLAMAR_PANTALLAROL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextField_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextField_contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIOS");

        buttonActionGUARDAR.setText("GUARDAR");
        buttonActionGUARDAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionGUARDARActionPerformed(evt);
            }
        });

        buttonAction2.setText("CANCELAR");
        buttonAction2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonAction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction2ActionPerformed(evt);
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
                        .addComponent(jLabel1))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public int idusuario,ROL;
boolean acceso; //esta variable es usada para cuando se registra un nuevo usuario desde el ingreso del sistema, si es TRUE
    private void TextField_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_nomActionPerformed
        TextField_nom.transferFocus();
    }//GEN-LAST:event_TextField_nomActionPerformed

    private void TextField_nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_nomKeyTyped
        char codigo=evt.getKeyChar();

        if(!Character.isAlphabetic(codigo)){
            if(Character.isSpace(codigo)){
                evt.setKeyCode(KeyEvent.VK_SPACE);
            }else{
                evt.consume();}
        }else if(this.TextField_nom.getText().length()==50){
            evt.consume();
        }
    }//GEN-LAST:event_TextField_nomKeyTyped

    private void TextField_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_direccionActionPerformed
        TextField_direccion.transferFocus();
    }//GEN-LAST:event_TextField_direccionActionPerformed

    private void TextField_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_direccionKeyTyped
        if (TextField_direccion.getText().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_TextField_direccionKeyTyped

    private void JTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldCorreoActionPerformed

    }//GEN-LAST:event_JTextFieldCorreoActionPerformed

    private void JTextFieldCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextFieldCorreoFocusLost
        String correo = JTextFieldCorreo.getText();
        if (isEmail(correo)) {

        } else {
            JOptionPane.showMessageDialog(null, "El E-mail Ingresado está Incorrecto", "Atención", JOptionPane.WARNING_MESSAGE);
            JTextFieldCorreo.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_JTextFieldCorreoFocusLost

    private void JTextFieldCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldCorreoKeyTyped
        if (JTextFieldCorreo.getText().length() > 0) {
            JTextFieldCorreo.setBackground(Color.white);
        }
        if (JTextFieldCorreo.getText().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextFieldCorreoKeyTyped

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        char codigo=evt.getKeyChar();

        if(!Character.isAlphabetic(codigo)){
            if(Character.isSpace(codigo)){
                evt.setKeyCode(KeyEvent.VK_SPACE);
            }else{
                evt.consume();}
        }else if(apellido.getText().length()==50){
            evt.consume();
        }
    }//GEN-LAST:event_apellidoKeyTyped

    private void TextFieldnumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldnumeroFocusGained

    }//GEN-LAST:event_TextFieldnumeroFocusGained

    private void TextFieldnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldnumeroKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        } else {
            if (TextFieldnumero.getText().length() == 6) {
                evt.consume();
                this.JTextFieldCorreo.requestFocus();
            }
        }
    }//GEN-LAST:event_TextFieldnumeroKeyTyped

    private void TextFieldcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldcodigoKeyTyped
        //        char c = evt.getKeyChar();
        //        if (Character.isLetter(c)) {
            //            evt.consume();
            //        } else {
            //            if (TextFieldcodigo.getText().length() == 5) {
                //                evt.consume();
                //            }
            //        }
    }//GEN-LAST:event_TextFieldcodigoKeyTyped

    private void jComboBox_TELEFONOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TELEFONOSActionPerformed
        String captura=jComboBox_TELEFONOS.getSelectedItem().toString();
        BuscarIDTipoTelefono(captura);
        this.TextFieldnumero.requestFocus();
    }//GEN-LAST:event_jComboBox_TELEFONOSActionPerformed

    private void jComboBox_LocalidadesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_LocalidadesPopupMenuWillBecomeVisible
         this.jComboBox_Localidades.setSelectedItem("");
        String captura=String.valueOf(this.jComboBoxProvincias.getModel().getSelectedItem());       
        this.BuscarLocalidadesxPROVINCIA(captura);
    }//GEN-LAST:event_jComboBox_LocalidadesPopupMenuWillBecomeVisible

    private void jComboBox_LocalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_LocalidadesActionPerformed
        String localidad = this.jComboBox_Localidades.getSelectedItem().toString();
        int indice=Integer.parseInt(String.valueOf(this.jComboBox_Localidades.getSelectedIndex()));
        if(indice==-1){
            this.BuscarCoincidenciasxLocalidad(localidad,IDProvincia);
        }else{
            BuscarIDLocalidad(localidad);
        }
    }//GEN-LAST:event_jComboBox_LocalidadesActionPerformed

    private void jComboBoxProvinciasPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxProvinciasPopupMenuWillBecomeVisible
        LlenarComboProvincias();  
    }//GEN-LAST:event_jComboBoxProvinciasPopupMenuWillBecomeVisible
String seleccion,con,con2;
    private void jComboBoxProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProvinciasActionPerformed
        seleccion = this.jComboBoxProvincias.getSelectedItem().toString();
        int indice=this.jComboBoxProvincias.getSelectedIndex();

        if(indice==-1){
            BuscarCoincidenciasxProv(seleccion);
        }else{
            BuscarIDProvincia(seleccion);
        }
    }//GEN-LAST:event_jComboBoxProvinciasActionPerformed

    private void TextField_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_usuarioActionPerformed

    private void TextField_usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_usuarioFocusLost
    String usuario=this.TextField_usuario.getText();
    int resultado=claseusu.BuscarCoincidencias(usuario);
    if(resultado!=0){
        JOptionPane.showMessageDialog(null,"El Nombre de Usuario Se Encuentra Registrado, ingrese otro","Información",JOptionPane.INFORMATION_MESSAGE);
        TextField_usuario.setText("");
        TextField_usuario.requestFocus();
        }
    }//GEN-LAST:event_TextField_usuarioFocusLost

    private void TextField_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_usuarioKeyTyped
        if (TextField_usuario.getText().length() == 30) {
            evt.consume();
        }else{
            TextField_usuario.setBackground(Color.white);
        }
    }//GEN-LAST:event_TextField_usuarioKeyTyped

    private void comboTipoUsuPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboTipoUsuPopupMenuWillBecomeVisible
    llenarcomboTipoRol();
    }//GEN-LAST:event_comboTipoUsuPopupMenuWillBecomeVisible

    private void comboTipoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoUsuActionPerformed
        String h = comboTipoUsu.getSelectedItem().toString();
        BuscarTipoUsuario(h);
    }//GEN-LAST:event_comboTipoUsuActionPerformed

    private void comboTipoUsuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboTipoUsuFocusGained

    }//GEN-LAST:event_comboTipoUsuFocusGained

    private void LLAMAR_PANTALLAROLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LLAMAR_PANTALLAROLActionPerformed
        Alta_TipoRol atp=new Alta_TipoRol(new javax.swing.JFrame(), true);
        atp.bandera=true;
        dispose();
        atp.show();
    }//GEN-LAST:event_LLAMAR_PANTALLAROLActionPerformed

    private void LLAMAR_PANTALLAROLFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LLAMAR_PANTALLAROLFocusLost
        llenarcomboTipoRol();
    }//GEN-LAST:event_LLAMAR_PANTALLAROLFocusLost

    private void TextField_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_contraseñaKeyTyped
        if (TextField_contraseña.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_TextField_contraseñaKeyTyped

    private void TextField_contraseña2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_contraseña2ActionPerformed

    }//GEN-LAST:event_TextField_contraseña2ActionPerformed
String cont2;
    private void TextField_contraseña2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_contraseña2FocusLost
        con = TextField_contraseña.getText();
        cont2=this.TextField_contraseña2.getText();
        if(con.equals(cont2)){
        }else{
            JOptionPane.showMessageDialog(null, "Las Contraseñas no Coinciden","Atención",JOptionPane.WARNING_MESSAGE);
            this.TextField_contraseña.setText("");
            TextField_contraseña.requestFocus();
            TextField_contraseña2.setText("");
        }
    }//GEN-LAST:event_TextField_contraseña2FocusLost

    private void TextField_contraseña2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_contraseña2KeyTyped
        if (TextField_contraseña2.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_TextField_contraseña2KeyTyped

    private void jComboBox_TELEFONOSPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_TELEFONOSPopupMenuWillBecomeVisible
      LlenarComboTelefonos();
    }//GEN-LAST:event_jComboBox_TELEFONOSPopupMenuWillBecomeVisible

    private void jComboBoxProvinciasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxProvinciasPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProvinciasPopupMenuWillBecomeInvisible

    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
     if(this.TextField_usuario.getText().equals("") || this.TextField_contraseña.getText().equals("") || this.TextField_contraseña2.getText().equals("")||this.apellido.getText().equals("") || this.TextField_nom.getText().equals("") || this.TextField_direccion.getText().equals("")|| this.TextFieldnumero.getText().equals("") || this.TextFieldcodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención",JOptionPane.WARNING_MESSAGE);
        }else{
            String usuario,a,N,direc,cod,correo;int num;
            usuario = TextField_usuario.getText();
            int resultado=claseusu.BuscarCoincidencias(usuario);
            if(resultado==0){                
                con = TextField_contraseña.getText();
                a=apellido.getText();
                N=TextField_nom.getText();
                direc=TextField_direccion.getText();
                cod=this.TextFieldcodigo.getText();
                num=Integer.parseInt(TextFieldnumero.getText());
                correo=JTextFieldCorreo.getText();
                BuscarUsuario();
                fecha();

                if(idtipo==0){
                    BuscarPrimerRol();
                }

                if(IDTIPOTELEFONO==0){
                    BuscarPrimerTipoTelefono();
                }
               
                String datoNuevo="Usuario:"+usuario+",Apellidos,Nombres:"+a+","+N+",Localidad:"+locSeleccionada+",Dirección:"+direc+"Teléfono:"+cod+"-"+num+",E-mail:"+correo;
                PERSONA.InsertarPersona(direc,IDTIPOTELEFONO,num,ID_LOCALIDAD,correo,1,fechaActual,hor,usu,"USUARIOS",datoNuevo);
               
                BuscarIDPersona();
                int salida=claseusu.AgregarUsuario(a,N,usuario,con,IDPERSONA,idtipo);
                
                if(salida==0){
                JOptionPane.showMessageDialog(null,"Se Registró el Usuario" +" "+TextField_usuario.getText()+" "+ "Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
                
                if(acceso==true){
                   dispose();
                   IngresoSistema i=new IngresoSistema();
                   i.show();
                }else{
                   dispose();
                   ENLACE(ROL);
                }
              }                
            }
        }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed
       dispose();
       ENLACE(ROL);
    }//GEN-LAST:event_buttonAction2ActionPerformed

    private void TextFieldnumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldnumeroFocusLost
     if(TextFieldnumero.getText().length() < 6){
          JOptionPane.showMessageDialog(null, "La Cantidad de Digitos es Menor a 6","Atención", JOptionPane.WARNING_MESSAGE);
          TextFieldnumero.requestFocus();
        }
    }//GEN-LAST:event_TextFieldnumeroFocusLost

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
            java.util.logging.Logger.getLogger(Alta_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Alta_Usuario dialog = new Alta_Usuario(new javax.swing.JFrame(), true);
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
    public javax.swing.JTextField JTextFieldCorreo;
    public javax.swing.JButton LLAMAR_PANTALLAROL;
    public javax.swing.JPanel PanelUsuario;
    public javax.swing.JPasswordField TextField_contraseña;
    public javax.swing.JPasswordField TextField_contraseña2;
    public javax.swing.JTextField TextField_direccion;
    public javax.swing.JTextField TextField_nom;
    public javax.swing.JTextField TextField_usuario;
    public javax.swing.JTextField TextFieldcodigo;
    public javax.swing.JTextField TextFieldnumero;
    public javax.swing.JTextField apellido;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    public javax.swing.JComboBox comboTipoUsu;
    public javax.swing.JComboBox jComboBoxProvincias;
    public javax.swing.JComboBox jComboBox_Localidades;
    public javax.swing.JComboBox jComboBox_TELEFONOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables


    int idtipo;String rol;
    private void BuscarTipoUsuario(String h) {
         try {
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre,id FROM roles WHERE nombre LIKE '"+h+"%'");
                   
            while (rs.next()) {
                rol=rs.getString("nombre");
               idtipo=rs.getInt("id");            
            }
            rs.close();
            TextField_usuario.requestFocus();            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
    
     private void BuscarPrimerRol() {
         try {
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT  MIN(id)AS id FROM roles");
                   
            while (rs.next()) {
                idtipo=rs.getInt("id");            
            }
            rs.close();
            TextField_usuario.requestFocus();            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }   
    
    private void llenarcomboTipoRol() {
        try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM roles");                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("nombre"));
            }
            rs.close();
            comboTipoUsu.setModel(modeloCombo);            
        } catch (SQLException ex) {
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

  
  String fechaActual,hor; int d,a,min;
  void fecha(){             
    int año = Calendario.get(Calendar.YEAR);
    int mes = Calendario.get(Calendar.MONTH) + 1; 
    int dia = Calendario.get(Calendar.DAY_OF_MONTH);
//    f=new Date(Calendario.get(Calendar.YEAR),Calendario.get(Calendar.MONTH) + 1,Calendario.get(Calendar.DAY_OF_MONTH));
    fechaActual=año+"/"+mes+"/"+dia;
    int h=Calendario.get(Calendar.HOUR_OF_DAY);
    int minutos=Calendario.get(Calendar.MINUTE);        
    hor = String.valueOf(h+":"+minutos);
  
  }  

  int ID_LOCALIDAD;String locSeleccionada;
    private void BuscarIDLocalidad(String localidad) {
        int COD_AREA=0;
        try {
             cn=cm.Conectar();
             Statement st=(Statement)cn.createStatement();
             ResultSet rs=st.executeQuery("SELECT codigo,localidades.id,localidades.nombre FROM localidades WHERE nombre LIKE '"+localidad+"%'");
             while(rs.next()){
                  COD_AREA=rs.getInt("codigo");
                  ID_LOCALIDAD=rs.getInt("localidades.id");
                  locSeleccionada=rs.getString("localidades.nombre");
                }
             TextFieldcodigo.setText(String.valueOf(COD_AREA));
             rs.close();             
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void ENLACE(int rol) {
        int L_USU = 0, ES_USU = 0, MOD_USU = 0, ELI_USU = 0;
        GestionUsuarios usu=new GestionUsuarios(new javax.swing.JFrame(), true);
        usu.IDROL=rol;
        try {
            cn = cm.Conectar();
            String sql = "SELECT * FROM permisos WHERE idrol="+rol;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                L_USU = rs.getInt("L_USUARIO");
                ES_USU = rs.getInt("ESC_USUARIO");
                MOD_USU = rs.getInt("MOD_USUARIO");
                ELI_USU = rs.getInt("ELIM_USUARIO");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        if(L_USU != 0 & ES_USU!=0 & MOD_USU!=0 & ELI_USU!=0){
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(true);           
            usu.buttonTaskMODIFICAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(true);            
        }else   if (L_USU != 0) {
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(false);           
            usu.buttonTaskMODIFICAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(false);            
        }else if (ES_USU != 0) {
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(false);            
            usu.buttonTaskMODIFICAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(true);            
        }else if (MOD_USU != 0) {
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(true);           
            usu.buttonTaskMODIFICAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(false);           
        }else if (ELI_USU != 0) {
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(true);           
            usu.buttonTaskMODIFICAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(false);           
        }else{
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(false);
            usu.buttonTaskMODIFICAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(false);           
        }
        usu.show();
    }

    int IDPERSONA;
    private void BuscarIDPersona() {
      try {
             cn=cm.Conectar();
             Statement st=(Statement)cn.createStatement();
             ResultSet rs=st.executeQuery("SELECT MAX(id) AS id FROM personas");
             while(rs.next()){
                  IDPERSONA=rs.getInt("id");
                }
             rs.close();             
        } catch (Exception ex) {
            ex.getMessage();
        }  
    }
 
    int IDTIPOTELEFONO;
    private void BuscarPrimerTipoTelefono() {
         try {
             cn=cm.Conectar();
             Statement st=(Statement)cn.createStatement();
             ResultSet rs=st.executeQuery("SELECT MIN(id) AS id FROM tipotelefono");
             while(rs.next()){
                  IDTIPOTELEFONO=rs.getInt("id");
                }
             rs.close();             
        } catch (Exception ex) {
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
            this.jComboBox_TELEFONOS.setModel(modeloCombo);
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    
    private void BuscarIDTipoTelefono(String captura) {
         try {
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT id FROM tipotelefono WHERE nombre LIKE '"+captura+"%'");                    
            while (rs.next()) {
              IDTIPOTELEFONO=rs.getInt("id");
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
        this.jComboBox_Localidades.setModel(modeloCombo);
    } catch (SQLException ex) {
        ex.getMessage();
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

   
}
