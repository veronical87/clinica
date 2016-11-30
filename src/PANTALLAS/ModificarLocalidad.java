package PANTALLAS;

import CLASES.ClaseLocalidades;
import CLASES.JTextFieldToUpperCase;
import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
public class ModificarLocalidad extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    ClaseLocalidades lo=new ClaseLocalidades(); 
    public ModificarLocalidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        JTextFieldNombre.setDocument(new JTextFieldToUpperCase());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JTextFieldNombre = new javax.swing.JTextField();
        ComboBoxProvincias = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextField_CodArea = new javax.swing.JTextField();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRectTranslucido1.setPreferredSize(new java.awt.Dimension(393, 356));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOCALIDADES");

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS LOCALIDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        JTextFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextFieldNombreFocusLost(evt);
            }
        });
        JTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldNombreKeyTyped(evt);
            }
        });

        ComboBoxProvincias.setEditable(true);
        ComboBoxProvincias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ComboBoxProvinciasFocusGained(evt);
            }
        });
        ComboBoxProvincias.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                ComboBoxProvinciasPopupMenuWillBecomeVisible(evt);
            }
        });
        ComboBoxProvincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxProvinciasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Provincia(*)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Localidad(*)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Campos Obligatorios(*)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Código de Área(*)");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxProvincias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTextFieldNombre)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TextField_CodArea, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ComboBoxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextField_CodArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel9)
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
                        .addContainerGap()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
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
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int usuario,rol,IDLOC;
    private void JTextFieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextFieldNombreFocusLost

    }//GEN-LAST:event_JTextFieldNombreFocusLost

    private void JTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNombreKeyTyped
        if(JTextFieldNombre.getText().length()==30){
            evt.consume();
        }
    }//GEN-LAST:event_JTextFieldNombreKeyTyped

    private void ComboBoxProvinciasPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ComboBoxProvinciasPopupMenuWillBecomeVisible
        llenarComboProvincias();
        banderaProvincia = false;
    }//GEN-LAST:event_ComboBoxProvinciasPopupMenuWillBecomeVisible
boolean banderaProvincia;
    private void ComboBoxProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxProvinciasActionPerformed
    String captura= ComboBoxProvincias.getSelectedItem().toString();
    int indice = this.ComboBoxProvincias.getSelectedIndex();        
        
       if(banderaProvincia == false){
          if (indice == -1){
            BuscarCoincidencias(captura);
          }else{
            BuscarIDProvincia(captura);
          }
          JTextFieldNombre.requestFocus();
       }        
    }//GEN-LAST:event_ComboBoxProvinciasActionPerformed

    private void ComboBoxProvinciasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComboBoxProvinciasFocusGained

    }//GEN-LAST:event_ComboBoxProvinciasFocusGained

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

    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
       if(JTextFieldNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención",JOptionPane.WARNING_MESSAGE);
        }else{
            String nombre = JTextFieldNombre.getText().trim();
            int existe=lo.BuscarCoincidencias(nombre,IDProv);
            int codigo= Integer.parseInt(TextField_CodArea.getText());
            
            if(existe!=0){    
                JOptionPane.showMessageDialog(null,"Ya Existe la Localidad"+""+nombre+","+"en la Provincia"+""+NombreProv);
                JTextFieldNombre.setText("");
            }else{
                if(IDProv==0){
                    BuscarIDProvincia(nombre);
                    lo.ModificarLocalidad(IDLOC,nombre,IDProv,codigo);
                    JOptionPane.showMessageDialog(null,"Se Guardaron los Cambios Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    enlace();
                }else{
                    lo.ModificarLocalidad(IDLOC,nombre,IDProv,codigo);
                    JOptionPane.showMessageDialog(null,"Se Guardaron los Cambios Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    enlace();
                }
            }
        }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed
       dispose();
        enlace();
    }//GEN-LAST:event_buttonAction2ActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarLocalidad dialog = new ModificarLocalidad(new javax.swing.JFrame(), true);
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
    public javax.swing.JComboBox ComboBoxProvincias;
    public javax.swing.JTextField JTextFieldNombre;
    public javax.swing.JTextField TextField_CodArea;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

private void enlace() {
   int L_LOC=0,ES_LOC=0,MOD_LOC=0,ELI_LOC=0;
   Gestión_Localidades loc=new Gestión_Localidades(new javax.swing.JFrame(),true);
   loc.IDROL=rol;
   try
      {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE idrol="+rol;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            L_LOC=rs.getInt("L_LOCALIDAD");
            ES_LOC=rs.getInt("ESC_LOCALIDAD");
            MOD_LOC=rs.getInt("MOD_LOCALIDAD");
            ELI_LOC=rs.getInt("ELIM_LOCALIDAD");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
     if(L_LOC!=0 & ES_LOC!=0 & MOD_LOC!=0 & ELI_LOC!=0){
        loc.buttonTaskAGREGAR.setEnabled(true);       
        loc.buttonTaskELIMINAR.setEnabled(false);
        loc.buttonTaskMODIFICAR.setEnabled(false);
        loc.TABLA.setEnabled(true);        
     }else  if(L_LOC!=0){
        loc.buttonTaskAGREGAR.setEnabled(false);
        loc.buttonTaskELIMINAR.setEnabled(false);
        loc.buttonTaskMODIFICAR.setEnabled(false);
        loc.TABLA.setEnabled(false);        
     }else  if(ES_LOC!=0){
        loc.buttonTaskAGREGAR.setEnabled(true);
        loc.buttonTaskELIMINAR.setEnabled(false);
        loc.buttonTaskMODIFICAR.setEnabled(false);
        loc.TABLA.setEnabled(false);  
     }else  if(MOD_LOC!=0){
        loc.buttonTaskAGREGAR.setEnabled(false);       
        loc.buttonTaskELIMINAR.setEnabled(false);
        loc.buttonTaskMODIFICAR.setEnabled(false);
        loc.TABLA.setEnabled(true); 
     }else if(ELI_LOC!=0){
        loc.buttonTaskAGREGAR.setEnabled(false);        
        loc.buttonTaskMODIFICAR.setEnabled(false);
        loc.TABLA.setEnabled(true);       
        loc.buttonTaskELIMINAR.setEnabled(false);
     }else{
        loc.buttonTaskAGREGAR.setEnabled(false);        
        loc.buttonTaskMODIFICAR.setEnabled(false);
        loc.TABLA.setEnabled(false);       
        loc.buttonTaskELIMINAR.setEnabled(false);
     }  
        loc.show();
    }

 int IDProv;String NombreProv;
    private void BuscarIDProvincia(String nombre){
      try {
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT id,nombre FROM provincia WHERE nombre LIKE '"+nombre+"%'");
                     
            while (rs.next()) {
               IDProv=rs.getInt("id");  
               NombreProv=rs.getString("nombre");
            }
            rs.close();
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
    
    private void llenarComboProvincias(){
        try {
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM provincia ORDER BY nombre ASC");
                     
            while (rs.next()) {               
               modeloCombo.addElement(rs.getString("nombre"));               
            }
            rs.close();
            ComboBoxProvincias.setModel(modeloCombo);
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    private void BuscarCoincidencias(String captura) {
        try {
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM provincia WHERE nombre LIKE '"+captura+"%' ORDER BY nombre ASC");
                     
            while (rs.next()) {               
               modeloCombo.addElement(rs.getString("nombre"));               
            }
            rs.close();
            ComboBoxProvincias.setModel(modeloCombo);
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
}
