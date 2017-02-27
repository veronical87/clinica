package PANTALLAS;
import CLASES.ClaseLocalidades;
import CLASES.JTextFieldToUpperCase;
import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Alta_Localidad extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    ClaseLocalidades alta_telefono=new ClaseLocalidades();  

    public Alta_Localidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);      
        jTextFieldLocalidad.setDocument(new JTextFieldToUpperCase()); 
        llenarComboMostrarProvincias();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TextField_CodArea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_Provincias = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldLocalidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRectTranslucido1.setPreferredSize(new java.awt.Dimension(393, 353));

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS CÓDIGO DE ÁREA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Localidad(*)");

        TextField_CodArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_CodAreaFocusLost(evt);
            }
        });
        TextField_CodArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_CodAreaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Código de Área(*)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Provincia(*)");

        jComboBox_Provincias.setEditable(true);
        jComboBox_Provincias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox_Provincias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Provincia" }));
        jComboBox_Provincias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox_ProvinciasFocusGained(evt);
            }
        });
        jComboBox_Provincias.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox_ProvinciasPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox_Provincias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_ProvinciasMouseClicked(evt);
            }
        });
        jComboBox_Provincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ProvinciasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Campos Obligatorios(*)");

        jTextFieldLocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLocalidadKeyTyped(evt);
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField_CodArea, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Provincias, 0, 238, Short.MAX_VALUE)
                            .addComponent(jTextFieldLocalidad))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_Provincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextField_CodArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOCALIDADES");
        jLabel1.setPreferredSize(new java.awt.Dimension(406, 300));

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
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int usuario,ROL; String Localidadcapturada;int tipo_telefono;String provinciaSelec;
    private void TextField_CodAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_CodAreaFocusLost
        if (TextField_CodArea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se Debe Ingresar un Código de Área", "Atención", JOptionPane.WARNING_MESSAGE);
            setBackground(Color.lightGray);
        }
    }//GEN-LAST:event_TextField_CodAreaFocusLost

    private void TextField_CodAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_CodAreaKeyTyped
        char caracter = evt.getKeyChar();
        if (Character.isAlphabetic(caracter)) {
            evt.consume();
        } else if (TextField_CodArea.getText().length() == 4) {
            evt.consume();
        } else if (TextField_CodArea.getText().length() > 0) {
            TextField_CodArea.setBackground(Color.white);
        }
    }//GEN-LAST:event_TextField_CodAreaKeyTyped

    private void jComboBox_ProvinciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_ProvinciasMouseClicked

    }//GEN-LAST:event_jComboBox_ProvinciasMouseClicked

    private void jComboBox_ProvinciasPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_ProvinciasPopupMenuWillBecomeVisible
     String combo=coincidencia;
        if(indice1==-1){
            BuscarCoincidenciasxProvincia(combo);
        }else{
            llenarComboMostrarProvincias();
        }
    }//GEN-LAST:event_jComboBox_ProvinciasPopupMenuWillBecomeVisible
String seleccion,coincidencia;int indice1;
    private void jComboBox_ProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ProvinciasActionPerformed
        seleccion = this.jComboBox_Provincias.getSelectedItem().toString();
        int indice=this.jComboBox_Provincias.getSelectedIndex();

        if(indice==-1){
            coincidencia=seleccion;
            BuscarCoincidenciasxProvincia(seleccion);
            indice1=indice;
        }else{
            BuscarIDProv(seleccion);
        }
    }//GEN-LAST:event_jComboBox_ProvinciasActionPerformed

    private void jComboBox_ProvinciasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox_ProvinciasFocusGained

    }//GEN-LAST:event_jComboBox_ProvinciasFocusGained

    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
     if(this.TextField_CodArea.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención",JOptionPane.WARNING_MESSAGE);
        }else{
       
             if(IDProvincia==0){
                   provinciaSelec = this.jComboBox_Provincias.getSelectedItem().toString();
               BuscarIDProv(provinciaSelec);
             }
       
            int codigo = Integer.parseInt(TextField_CodArea.getText());
            String lo=this.jTextFieldLocalidad.getText();
            int existe=alta_telefono.Agregar(lo,IDProvincia,codigo);
            if(existe==0){
                 JOptionPane.showMessageDialog(null,"Se Registró la Localidad"+ " "+lo+" " +"Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    enlace();
                }else{
                   JOptionPane.showMessageDialog(null,"La Localidad"+ " " +lo+ " " +"Ya se Encuentra Asociada a"+ " " +provinciaSelec,"Atención",JOptionPane.WARNING_MESSAGE);
                   jTextFieldLocalidad.requestFocus();
            }
        }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed
      dispose();
      enlace();
    }//GEN-LAST:event_buttonAction2ActionPerformed

    private void jTextFieldLocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLocalidadKeyTyped
      if(jTextFieldLocalidad.getText().length()==30){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldLocalidadKeyTyped

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
            java.util.logging.Logger.getLogger(Alta_Localidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_Localidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_Localidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_Localidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Alta_Localidad dialog = new Alta_Localidad(new javax.swing.JFrame(), true);
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
    public javax.swing.JTextField TextField_CodArea;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    public javax.swing.JComboBox jComboBox_Provincias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldLocalidad;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables


    private void llenarComboMostrarProvincias() {
        try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM provincia ORDER BY nombre ASC");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("nombre"));
            }
            rs.close();           
            this.jComboBox_Provincias.setModel(modeloCombo);

        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

private void enlace() {
      int L=0,ES=0,MOD=0,ELI=0;
      Gestión_Localidades tt=new Gestión_Localidades(new javax.swing.JFrame(), true);
      tt.IDROL=ROL;
      
      try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
             L=rs.getInt("L_LOCALIDAD");
             ES=rs.getInt("ESC_LOCALIDAD");
             MOD=rs.getInt("MOD_LOCALIDAD");
             ELI=rs.getInt("ELIM_LOCALIDAD");
          }                              
        }            
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
      
      if(L!=0 & ES!=0 & MOD!=0 & ELI!=0){
         tt.buttonTaskAGREGAR.setEnabled(true);
         tt.buttonTaskCERRAR.setEnabled(true);
         tt.buttonTaskELIMINAR.setEnabled(false);
         tt.buttonTaskMODIFICAR.setEnabled(false);
         tt.TABLA.setEnabled(true);
      }else if(ES!=0){
         tt.buttonTaskAGREGAR.setEnabled(true);
         tt.buttonTaskCERRAR.setEnabled(true);
         tt.buttonTaskELIMINAR.setEnabled(false);
         tt.buttonTaskMODIFICAR.setEnabled(false);
         tt.TABLA.setEnabled(false);
      }else if(MOD!=0){
         tt.buttonTaskAGREGAR.setEnabled(false);
         tt.buttonTaskCERRAR.setEnabled(true);
         tt.buttonTaskELIMINAR.setEnabled(false);
         tt.buttonTaskMODIFICAR.setEnabled(false);
         tt.TABLA.setEnabled(true);
      }else if(ELI!=0){
         tt.buttonTaskAGREGAR.setEnabled(false);
         tt.buttonTaskCERRAR.setEnabled(true);
         tt.buttonTaskELIMINAR.setEnabled(false);
         tt.buttonTaskMODIFICAR.setEnabled(false);
         tt.TABLA.setEnabled(true);
      }else{
         tt.buttonTaskAGREGAR.setEnabled(false);
         tt.buttonTaskCERRAR.setEnabled(true);
         tt.buttonTaskELIMINAR.setEnabled(false);
         tt.buttonTaskMODIFICAR.setEnabled(false);
         tt.TABLA.setEnabled(false);
      }
      tt.show();
      
    }   

    int IDProvincia;
    private void BuscarIDProv(String provinciaSelec) {
        String sSQL = "";        
        cn=cm.Conectar();
        sSQL = "SELECT id FROM provincia WHERE nombre LIKE '"+provinciaSelec+"%'";
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
              {
                IDProvincia=rs.getInt("id");
               }
             
             rs.close();
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }

   private void BuscarCoincidenciasxProvincia(String provinciaSelec) {
       try {            
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM provincia WHERE nombre LIKE '"+provinciaSelec+"%' ORDER BY nombre ASC");
                     
            while (rs.next()) {
               modeloCombo.addElement(rs.getString("nombre"));
            }
            rs.close();
            this.jComboBox_Provincias.setModel(modeloCombo);
        } catch (SQLException ex) {
            ex.getMessage();
        }  
    }
}
