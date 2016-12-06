package PANTALLAS;

import CLASES.ClaseUsuarios;
import CLASES.ClaseVeterinarios;
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
import javax.swing.JOptionPane;

public class AltaVeterinario extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    ClaseVeterinarios vet=new ClaseVeterinarios();
    Clase_Personas persona=new Clase_Personas();
    ClaseUsuarios usuario=new ClaseUsuarios();
    Calendar Calendario = Calendar.getInstance(); 
    public AltaVeterinario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.jTextField_Apellido.setDocument(new JTextFieldToUpperCase());   
        this.jTextField_Nombre.setDocument(new JTextFieldToUpperCase()); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Apellido = new javax.swing.JTextField();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Matricula = new javax.swing.JTextField();
        jComboBoxProvincias = new javax.swing.JComboBox();
        jComboBoxLocalidades = new javax.swing.JComboBox();
        jTextFieldNroTelefono = new javax.swing.JTextField();
        jComboBoxTipotelefono = new javax.swing.JComboBox();
        jTextFieldCodigoArea = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldcorreo = new javax.swing.JTextField();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonActionGUARDAR1 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VETERINARIOS");

        jPanel2.setBackground(new java.awt.Color(141, 141, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS ODONTOLOGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(433, 360));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Apellido(*)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tipo de Teléfono(*)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Campos Obligatorios(*)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Nro. de Teléfono(*)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Nro. de Matrícula(*)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nombre(*)");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Provincia(*)");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Localidad(*)");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");

        jTextField_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ApellidoKeyTyped(evt);
            }
        });

        jTextField_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_NombreKeyTyped(evt);
            }
        });

        jTextField_Matricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_MatriculaFocusLost(evt);
            }
        });
        jTextField_Matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_MatriculaKeyTyped(evt);
            }
        });

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

        jTextFieldNroTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNroTelefonoKeyTyped(evt);
            }
        });

        jComboBoxTipotelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxTipotelefono.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Tipo de  Teléfono" }));
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

        jTextFieldCodigoArea.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("E-mail");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85)
                                    .addComponent(jTextField_Nombre))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(85, 85, 85)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxProvincias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_Apellido)
                                        .addComponent(jComboBoxLocalidades, 0, 249, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addComponent(jComboBoxTipotelefono, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldcorreo))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBoxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTipotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(25, 25, 25))
        );

        buttonActionGUARDAR.setText("GUARDAR");
        buttonActionGUARDAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionGUARDARActionPerformed(evt);
            }
        });

        buttonActionGUARDAR1.setText("CANCELAR");
        buttonActionGUARDAR1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionGUARDAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionGUARDAR1ActionPerformed(evt);
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
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(buttonActionGUARDAR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActionGUARDAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
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
int IDUSUARIO,IDROL;boolean bandera=true;
    private void jTextField_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ApellidoKeyTyped
        char codigo = evt.getKeyChar();

        if (!Character.isAlphabetic(codigo)) {
            if (Character.isSpace(codigo)) {
                evt.setKeyCode(KeyEvent.VK_SPACE);
            } else {
                evt.consume();
            }
        } else if (this.jTextField_Apellido.getText().length()==40) {
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
        } else if (this.jTextField_Nombre.getText().length()==40) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_NombreKeyTyped

    private void jTextField_MatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_MatriculaFocusLost
        int nro =Integer.parseInt(jTextField_Matricula.getText());
        int salida = vet.BuscarCoincidenciasxVeterinario(nro);
        if (salida !=0){
            JOptionPane.showMessageDialog(null,"La Matricula Se Encuentra Registrada","Atención",JOptionPane.WARNING_MESSAGE);
            jTextField_Matricula.setText("");
            jTextField_Matricula.requestFocus();
        }
    }//GEN-LAST:event_jTextField_MatriculaFocusLost

    private void jTextField_MatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MatriculaKeyTyped
        char codigo = evt.getKeyChar();

        if (Character.isAlphabetic(codigo)) {
            evt.consume();
        }else {
            if(this.jTextField_Matricula.getText().length()==6) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextField_MatriculaKeyTyped
String seleccion,coincidencia;int indice1;
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

    private void jTextFieldNroTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNroTelefonoKeyTyped
        char codigo = evt.getKeyChar();
        if (Character.isAlphabetic(codigo)) {
            if (Character.isSpace(codigo)) {
                evt.setKeyCode(KeyEvent.VK_SPACE);
            } else {
                evt.consume();
            }
        } else if (this.jTextFieldNroTelefono.getText().length()==6) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNroTelefonoKeyTyped

    private void jComboBoxTipotelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipotelefonoActionPerformed
        String captura=String.valueOf(this.jComboBoxTipotelefono.getModel().getSelectedItem());
        BuscarIDTIpoTelefono(captura);
        jTextFieldNroTelefono.requestFocus();
    }//GEN-LAST:event_jComboBoxTipotelefonoActionPerformed
String s;
    private void jTextFieldcorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldcorreoFocusLost
       String correo = this.jTextFieldcorreo.getText();
        if (isEmail(correo)) {

        } else {
            JOptionPane.showMessageDialog(null, "El E-mail Ingresado está Incorrecto", "Atención", JOptionPane.WARNING_MESSAGE);
            jTextFieldcorreo.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_jTextFieldcorreoFocusLost

    private void jTextFieldcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldcorreoKeyTyped
  if (jTextFieldcorreo.getText().length() > 0) {
            jTextFieldcorreo.setBackground(Color.white);
        }
        if (jTextFieldcorreo.getText().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldcorreoKeyTyped

    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
     if(jTextField_Apellido.getText().equals("")|| jTextField_Nombre.getText().equals("") || jTextFieldCodigoArea.getText().equals("") || jTextField_Matricula.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios", "Atención", JOptionPane.WARNING_MESSAGE);
        }else{
            int matricula =Integer.parseInt(this.jTextField_Matricula.getText());
            int n=Integer.parseInt(this.jTextFieldNroTelefono.getText());
            s= this.jTextField_Apellido.getText()+",";
            String h=this.jTextField_Nombre.getText();
            String correo=this.jTextFieldcorreo.getText();
            String vete=s+h;
            String mat=jTextField_Matricula.getText();
            String tipo=String.valueOf(jComboBoxTipotelefono.getModel().getSelectedItem());
            String nuevo= "Veterinario:" + s + "," + h+""+"Matricula:"+""+matricula;
            BuscarUsuario();
            fecha();
            if(idtipotelefono==0){
                BuscarIDTIpoTelefono(tipo);
            }
            persona.InsertarPersona("",idtipotelefono,n,ID_LOCALIDAD,correo,2,fechaActual,hor,usu,"VETERINARIOS",nuevo);
            BuscarIDPersona();  
            vet.agregarVeterinario(s,h, matricula,idpersona);
            usuario.AgregarUsuario(s,h,vete,mat,idpersona,2);
            JOptionPane.showMessageDialog(null,"Los Datos del Veterinario"+" "+vete+ " "+ "Se Guardaron Correctamente","Información", JOptionPane.INFORMATION_MESSAGE);
            enlace();
           
        }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonActionGUARDAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDAR1ActionPerformed
        dispose();
        enlace();
    }//GEN-LAST:event_buttonActionGUARDAR1ActionPerformed

    private void jComboBoxTipotelefonoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTipotelefonoPopupMenuWillBecomeVisible
       LlenarComboTelefonos();
    }//GEN-LAST:event_jComboBoxTipotelefonoPopupMenuWillBecomeVisible

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
            java.util.logging.Logger.getLogger(AltaVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                AltaVeterinario dialog = new AltaVeterinario(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR1;
    private javax.swing.JComboBox jComboBoxLocalidades;
    private javax.swing.JComboBox jComboBoxProvincias;
    private javax.swing.JComboBox jComboBoxTipotelefono;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCodigoArea;
    private javax.swing.JTextField jTextFieldNroTelefono;
    private javax.swing.JTextField jTextField_Apellido;
    private javax.swing.JTextField jTextField_Matricula;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextFieldcorreo;
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
 
private void enlace() {
this.dispose();
int L= 0, ES= 0, MOD= 0, ELI= 0;
GestionVeterinarios art = new GestionVeterinarios(new javax.swing.JFrame(), true);       
art.IDROL=IDROL;  
art.bandera=true;
try {
    cn = cm.Conectar();
    String sql = "SELECT * FROM permisos WHERE idrol="+IDROL;
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery(sql);

    while (rs.next()) {
         L=rs.getInt("L_VETERINARIO");
         ES=rs.getInt("ESC_VETERINARIO");
         MOD=rs.getInt("MOD_VETERINARIO");
         ELI=rs.getInt("ELIM_VETERINARIO");
         
    }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }

    if (L != 0 & ES != 0 & MOD != 0 & ELI != 0) {
        art.buttonTaskSALIR.setEnabled(true);
        art.TABLA.setEnabled(true);
        art.buttonTaskAGREGAR.setEnabled(true);
        art.buttonTaskBORRAR.setEnabled(false);
        art.buttonTaskEDITAR.setEnabled(false);
    } else if (L!= 0) {
        art.buttonTaskSALIR.setEnabled(true);
        art.TABLA.setEnabled(false);
        art.buttonTaskAGREGAR.setEnabled(false);
        art.buttonTaskBORRAR.setEnabled(false);
        art.buttonTaskEDITAR.setEnabled(false);
    } else if (ES!= 0) {
        art.buttonTaskSALIR.setEnabled(true);
        art.TABLA.setEnabled(false);
        art.buttonTaskAGREGAR.setEnabled(true);
        art.buttonTaskBORRAR.setEnabled(false);
        art.buttonTaskEDITAR.setEnabled(false);
    } else if (MOD!= 0) {
        art.buttonTaskSALIR.setEnabled(true);
        art.TABLA.setEnabled(true);
        art.buttonTaskAGREGAR.setEnabled(false);
        art.buttonTaskBORRAR.setEnabled(false);
        art.buttonTaskEDITAR.setEnabled(false);
    } else if (ELI!= 0) {
        art.buttonTaskSALIR.setEnabled(true);
        art.TABLA.setEnabled(true);
        art.buttonTaskAGREGAR.setEnabled(false);
        art.buttonTaskBORRAR.setEnabled(false);
        art.buttonTaskEDITAR.setEnabled(false);
    } else {
        art.TABLA.setEnabled(false);
        art.buttonTaskSALIR.setEnabled(true);
        art.buttonTaskAGREGAR.setEnabled(false);
        art.buttonTaskBORRAR.setEnabled(false);
        art.buttonTaskEDITAR.setEnabled(false);
    }
    art.show();
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
 
}
