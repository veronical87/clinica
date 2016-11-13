package PANTALLAS;

import CLASES.ClaseRazas;
import CLASES.JTextFieldToUpperCase;
import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AltaRaza extends javax.swing.JDialog{
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    ClaseRazas raza=new ClaseRazas();
    public AltaRaza(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);  
        this.JTextFieldNombre.setDocument(new JTextFieldToUpperCase()); 
        this.jTextFieldMAX_HEMBRA.setEnabled(false);
        this.jTextFieldMIN_HEMBRA.setEnabled(false);
        jTextFieldMIN_MACHO.setEnabled(false);
        this.jTextFieldMAX_MACHO.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_Especies = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldMIN_HEMBRA = new javax.swing.JTextField();
        jRadioButtonMACHO = new javax.swing.JRadioButton();
        jTextFieldMIN_MACHO = new javax.swing.JTextField();
        jTextFieldMAX_HEMBRA = new javax.swing.JTextField();
        jTextFieldMAX_MACHO = new javax.swing.JTextField();
        jRadioButtonHEMBRA = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTAMAÑO = new javax.swing.JComboBox();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRectTranslucido1.setPreferredSize(new java.awt.Dimension(389, 433));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RAZAS");

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS RAZAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Especie(*)");

        JTextFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextFieldNombreFocusLost(evt);
            }
        });
        JTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNombreActionPerformed(evt);
            }
        });
        JTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldNombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("*Campos Obligatorios");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Raza(*)");

        jComboBox_Especies.setEditable(true);
        jComboBox_Especies.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox_Especies.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Especie" }));
        jComboBox_Especies.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox_EspeciesFocusGained(evt);
            }
        });
        jComboBox_Especies.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox_EspeciesPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox_Especies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_EspeciesMouseClicked(evt);
            }
        });
        jComboBox_Especies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_EspeciesActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ESTANDARES DE PESO IDEAL(*)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTextFieldMIN_HEMBRA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldMIN_HEMBRA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMIN_HEMBRA.setText("MIN");
        jTextFieldMIN_HEMBRA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMIN_HEMBRAKeyTyped(evt);
            }
        });

        buttonGroup1.add(jRadioButtonMACHO);
        jRadioButtonMACHO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonMACHO.setText("MACHO");
        jRadioButtonMACHO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jRadioButtonMACHOFocusGained(evt);
            }
        });
        jRadioButtonMACHO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMACHOActionPerformed(evt);
            }
        });

        jTextFieldMIN_MACHO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldMIN_MACHO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMIN_MACHO.setText("MIN");
        jTextFieldMIN_MACHO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMIN_MACHOKeyTyped(evt);
            }
        });

        jTextFieldMAX_HEMBRA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldMAX_HEMBRA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMAX_HEMBRA.setText("MAX");
        jTextFieldMAX_HEMBRA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldMAX_HEMBRAFocusLost(evt);
            }
        });
        jTextFieldMAX_HEMBRA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMAX_HEMBRAKeyTyped(evt);
            }
        });

        jTextFieldMAX_MACHO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldMAX_MACHO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMAX_MACHO.setText("MAX");
        jTextFieldMAX_MACHO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldMAX_MACHOFocusLost(evt);
            }
        });
        jTextFieldMAX_MACHO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMAX_MACHOKeyTyped(evt);
            }
        });

        buttonGroup1.add(jRadioButtonHEMBRA);
        jRadioButtonHEMBRA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonHEMBRA.setText("HEMBRA");
        jRadioButtonHEMBRA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButtonHEMBRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHEMBRAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonHEMBRA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldMAX_HEMBRA, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jTextFieldMIN_HEMBRA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jRadioButtonMACHO)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldMAX_MACHO, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jTextFieldMIN_MACHO))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMIN_HEMBRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMIN_MACHO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonMACHO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonHEMBRA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMAX_HEMBRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMAX_MACHO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Tamaño(*)");

        jComboBoxTAMAÑO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxTAMAÑO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Tamaño" }));
        jComboBoxTAMAÑO.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxTAMAÑOPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxTAMAÑO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTAMAÑOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTextFieldNombre)
                                    .addComponent(jComboBox_Especies, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTAMAÑO, 0, 190, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_Especies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTAMAÑO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap())
        );

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
                        .addGap(63, 63, 63)
                        .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int idusuario,idrol;
    private void JTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNombreActionPerformed

    }//GEN-LAST:event_JTextFieldNombreActionPerformed

    private void JTextFieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextFieldNombreFocusLost

    }//GEN-LAST:event_JTextFieldNombreFocusLost

    private void JTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNombreKeyTyped
        char codigo=evt.getKeyChar();

        if(!Character.isAlphabetic(codigo)){
            if(Character.isSpace(codigo)){
                evt.setKeyCode(KeyEvent.VK_SPACE);
            }else{
                evt.consume();}
        }else if(JTextFieldNombre.getText().length()==40){
            evt.consume();
        }
    }//GEN-LAST:event_JTextFieldNombreKeyTyped

    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
    String nombre = JTextFieldNombre.getText();
    int minhembra = Integer.valueOf(jTextFieldMIN_HEMBRA.getText());
    int maxhembra = Integer.valueOf(jTextFieldMAX_HEMBRA.getText());
    int minmacho = Integer.valueOf(jTextFieldMIN_MACHO.getText());
    int maxmacho = Integer.valueOf(jTextFieldMAX_MACHO.getText());
    String tamaño=String.valueOf(this.jComboBoxTAMAÑO.getModel().getSelectedItem());
    
    if(tamaño.equals("")){
      BuscarIDTamaño(tamaño);
    }
        
   if(nombre.equals("")|| minhembra==0|| minmacho==0 || maxhembra==0 || maxmacho==0 || tamaño.equals("Seleccionar Tamaño")){
             JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención",JOptionPane.WARNING_MESSAGE);
        }else{
            if(minhembra == 0 || maxhembra== 0 || minmacho== 0 || maxmacho== 0){
              JOptionPane.showMessageDialog(null,"Los Campos No Pueden ser Nulos", "Atención", JOptionPane.WARNING_MESSAGE);
              jTextFieldMIN_HEMBRA.setEnabled(true);
              jTextFieldMIN_HEMBRA.requestFocus();
          }else{
              if(minhembra<maxhembra){
                  int encontrada = raza.AgregarRaza(nombre,IDEspecie,IDTamaño,minhembra,maxhembra,minmacho,maxmacho);             
               
                if(encontrada == 0) {//SI ES NULL NO EXISTE
                    JTextFieldNombre.setText("");
                    JTextFieldNombre.requestFocus();
                    jTextFieldMIN_HEMBRA.setText("");
                    jTextFieldMAX_HEMBRA.setText("");
                    jTextFieldMIN_MACHO.setText("");
                    jTextFieldMAX_MACHO.setText("");

                    JOptionPane.showMessageDialog(null, "La Raza" + " " + JTextFieldNombre.getText()+ " " + "Ya Existe, Por Favor Ingrese Otra", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.jRadioButtonHEMBRA.setSelected(false);
                    this.jRadioButtonMACHO.setSelected(false);
                    JTextFieldNombre.setText("");
                    JTextFieldNombre.requestFocus();
                    jTextFieldMIN_HEMBRA.setText("");
                    jTextFieldMAX_HEMBRA.setText("");
                    jTextFieldMIN_MACHO.setText("");
                    jTextFieldMAX_MACHO.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "La Raza" + " " + JTextFieldNombre.getText()+ " " + "se Registró Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    enlace();
                   }
              }
               
          }
     }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed
     dispose();
     enlace();
    }//GEN-LAST:event_buttonAction2ActionPerformed
String especieSelec;
    private void jComboBox_EspeciesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox_EspeciesFocusGained

    }//GEN-LAST:event_jComboBox_EspeciesFocusGained

    private void jComboBox_EspeciesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_EspeciesPopupMenuWillBecomeVisible
     llenarComboMostrarEspecies();
    }//GEN-LAST:event_jComboBox_EspeciesPopupMenuWillBecomeVisible

    private void jComboBox_EspeciesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_EspeciesMouseClicked

    }//GEN-LAST:event_jComboBox_EspeciesMouseClicked
String coincidencia;int indice1;
    private void jComboBox_EspeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_EspeciesActionPerformed
        especieSelec = this.jComboBox_Especies.getSelectedItem().toString();
        int indice = this.jComboBox_Especies.getSelectedIndex();
        JTextFieldNombre.setText("");        
        JTextFieldNombre.requestFocus();
        
        if(indice==-1){
            coincidencia=especieSelec;
            BuscarCoincidenciasxEspecie(especieSelec);
            indice1=indice;
        }else{
            BuscarIDEspecie(especieSelec);
        }
    }//GEN-LAST:event_jComboBox_EspeciesActionPerformed

    private void jRadioButtonHEMBRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHEMBRAActionPerformed
        jTextFieldMIN_HEMBRA.setText("");
        jTextFieldMAX_HEMBRA.setText("");
      
        this.jTextFieldMIN_HEMBRA.requestFocus();
       this.jTextFieldMAX_HEMBRA.setEnabled(true);
        this.jTextFieldMIN_HEMBRA.setEnabled(true);
        jTextFieldMIN_MACHO.setEnabled(false);
        this.jTextFieldMAX_MACHO.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonHEMBRAActionPerformed

    private void jRadioButtonMACHOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMACHOActionPerformed
    jTextFieldMIN_MACHO.setText("");
    jTextFieldMAX_MACHO.setText("");
    jTextFieldMIN_MACHO.requestFocus();
  
    this.jTextFieldMAX_HEMBRA.setEnabled(false);
    this.jTextFieldMIN_HEMBRA.setEnabled(false);
    jTextFieldMIN_MACHO.setEnabled(true);
    this.jTextFieldMAX_MACHO.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonMACHOActionPerformed

    private void jTextFieldMAX_HEMBRAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMAX_HEMBRAFocusLost
     
    }//GEN-LAST:event_jTextFieldMAX_HEMBRAFocusLost

    private void jTextFieldMAX_MACHOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMAX_MACHOFocusLost
      int minhembra = Integer.valueOf(jTextFieldMIN_MACHO.getText());
      int maxhembra = Integer.valueOf(jTextFieldMAX_MACHO.getText());
      
      if(minhembra==0 || maxhembra==0){
         JOptionPane.showMessageDialog(null,"Los Campos No Pueden ser Nulos", "Atención", JOptionPane.WARNING_MESSAGE);
         jTextFieldMIN_MACHO.requestFocus();
      }
      if(minhembra>maxhembra){
         JOptionPane.showMessageDialog(null,"El Peso Minimo No Debe Superior al Maximo", "Atención", JOptionPane.WARNING_MESSAGE);
         jTextFieldMIN_MACHO.setText("");
      }
    }//GEN-LAST:event_jTextFieldMAX_MACHOFocusLost

    private void jTextFieldMIN_HEMBRAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMIN_HEMBRAKeyTyped
         char codigo=evt.getKeyChar();

         if(!Character.isDigit(codigo)){
            evt.consume();
        }else if(jTextFieldMIN_HEMBRA.getText().length()==3){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMIN_HEMBRAKeyTyped

    private void jTextFieldMAX_HEMBRAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMAX_HEMBRAKeyTyped
        char codigo=evt.getKeyChar();

        if(!Character.isDigit(codigo)){
            evt.consume();
        }else if(jTextFieldMAX_HEMBRA.getText().length()==3){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMAX_HEMBRAKeyTyped

    private void jTextFieldMIN_MACHOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMIN_MACHOKeyTyped
       char codigo=evt.getKeyChar();

        if(!Character.isDigit(codigo)){
            evt.consume();
        }else if(jTextFieldMIN_MACHO.getText().length()==3){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMIN_MACHOKeyTyped

    private void jTextFieldMAX_MACHOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMAX_MACHOKeyTyped
      char codigo=evt.getKeyChar();

        if(!Character.isDigit(codigo)){
            evt.consume();
        }else if(jTextFieldMAX_MACHO.getText().length()==3){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMAX_MACHOKeyTyped

    private void jRadioButtonMACHOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButtonMACHOFocusGained
     int minhembra = Integer.valueOf(jTextFieldMIN_HEMBRA.getText());
      int maxhembra = Integer.valueOf(jTextFieldMAX_HEMBRA.getText());
      if(minhembra==0 || maxhembra==0){
         JOptionPane.showMessageDialog(null,"Los Campos No Pueden ser Nulos", "Atención", JOptionPane.WARNING_MESSAGE);
         jTextFieldMIN_HEMBRA.requestFocus();
      }
      if(minhembra>maxhembra){
         JOptionPane.showMessageDialog(null,"El Peso Minimo No Debe Superior al Maximo", "Atención", JOptionPane.WARNING_MESSAGE);
         jTextFieldMIN_HEMBRA.setText("");
      }
    }//GEN-LAST:event_jRadioButtonMACHOFocusGained

    private void jComboBoxTAMAÑOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTAMAÑOActionPerformed
       String tamaño = jComboBoxTAMAÑO.getSelectedItem().toString();
       int indice = jComboBoxTAMAÑO.getSelectedIndex();
         
        if(indice==-1){
            BuscarTamaño(tamaño);           
        }else{
            BuscarIDTamaño(tamaño);
        }      
    }//GEN-LAST:event_jComboBoxTAMAÑOActionPerformed

    private void jComboBoxTAMAÑOPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTAMAÑOPopupMenuWillBecomeVisible
       LlenarComboTamaños();
    }//GEN-LAST:event_jComboBoxTAMAÑOPopupMenuWillBecomeVisible

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
            java.util.logging.Logger.getLogger(AltaRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaRaza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                AltaRaza dialog = new AltaRaza(new javax.swing.JFrame(), true);
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
    public javax.swing.JTextField JTextFieldNombre;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jComboBoxTAMAÑO;
    public javax.swing.JComboBox jComboBox_Especies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JRadioButton jRadioButtonHEMBRA;
    public javax.swing.JRadioButton jRadioButtonMACHO;
    public javax.swing.JTextField jTextFieldMAX_HEMBRA;
    public javax.swing.JTextField jTextFieldMAX_MACHO;
    public javax.swing.JTextField jTextFieldMIN_HEMBRA;
    public javax.swing.JTextField jTextFieldMIN_MACHO;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

private void enlace() {
  int L=0,ES=0,MOD=0,ELI=0;
  GestionRazas esp=new GestionRazas(new javax.swing.JFrame(), true);
  esp.IDROL=idrol; 
      try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+idrol;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {                                
              L=rs.getInt("L_RAZA");
              ES=rs.getInt("ESC_RAZA");
              MOD=rs.getInt("MOD_RAZA");
              ELI=rs.getInt("ELIM_RAZA");               
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

 private void llenarComboMostrarEspecies() {
        try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM especies ORDER BY nombre ASC");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("nombre"));
            }
            rs.close();           
            jComboBox_Especies.setModel(modeloCombo);

        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

private void BuscarCoincidenciasxEspecie(String especieSelec) {
    try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM especies WHERE nombre LIKE '"+especieSelec+"%' ORDER BY nombre ASC");

        while (rs.next()) {
           modeloCombo.addElement(rs.getString("nombre"));
        }
        rs.close();
        jComboBox_Especies.setModel(modeloCombo);
    } catch (SQLException ex) {
        ex.getMessage();
    }
    }

   int IDEspecie;
   private void BuscarIDEspecie(String especieSelec) {
        String sSQL = "";        
        cn=cm.Conectar();
        sSQL = "SELECT id FROM especies WHERE nombre LIKE '"+especieSelec+"%'";
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
              {
                IDEspecie=rs.getInt("id");
               }
             
             rs.close();
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }

private void LlenarComboTamaños() {
      try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM tamaños ORDER BY nombre ASC");

        while (rs.next()) {
           modeloCombo.addElement(rs.getString("nombre"));
        }
        rs.close();
        jComboBoxTAMAÑO.setModel(modeloCombo);
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
        jComboBoxTAMAÑO.setModel(modeloCombo);
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
