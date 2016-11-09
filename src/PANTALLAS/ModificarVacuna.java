package PANTALLAS;

import CLASES.ClaseVacunas;
import Conexion.ConexionMySQL;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
public class ModificarVacuna extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;    
    Calendar Calendario = Calendar.getInstance();  
    ClaseVacunas vacuna=new ClaseVacunas();
    public ModificarVacuna(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_Especies = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldVacuna = new javax.swing.JTextField();
        jRadioButtonOptativo = new javax.swing.JRadioButton();
        jRadioButtonObligatorio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jSpinner1 = new javax.swing.JSpinner();
        jRadioButtonRefuerzo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRectTranslucido1.setPreferredSize(new java.awt.Dimension(393, 353));

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DE VACUNACION POR ESPECIE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre(*)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Condición(*)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tipo de Especie(*)");

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Campos Obligatorios(*)");

        jTextFieldVacuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldVacunaKeyTyped(evt);
            }
        });

        jRadioButtonOptativo.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButtonOptativo);
        jRadioButtonOptativo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonOptativo.setText("Optativo");

        jRadioButtonObligatorio.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButtonObligatorio);
        jRadioButtonObligatorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonObligatorio.setText("Obligatorio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Edad para la Dosis(*)");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DIAS", "MESES", "AÑOS" }));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), null, Integer.valueOf(80), Integer.valueOf(1)));

        jRadioButtonRefuerzo.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButtonRefuerzo);
        jRadioButtonRefuerzo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonRefuerzo.setText("Refuerzo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jComboBox_Especies, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextFieldVacuna)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButtonOptativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinner1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(jRadioButtonObligatorio)
                                .addGap(8, 8, 8)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButtonRefuerzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(5, 5, 5))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_Especies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonOptativo)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButtonObligatorio)
                    .addComponent(jRadioButtonRefuerzo))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VACUNACION POR ESPECIE");
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
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int idrol,IDVacuna;boolean banderaEspecie;
    private void jComboBox_EspeciesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox_EspeciesFocusGained

    }//GEN-LAST:event_jComboBox_EspeciesFocusGained

    private void jComboBox_EspeciesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_EspeciesPopupMenuWillBecomeVisible
        this.llenarComboMostrarEspecies();
    }//GEN-LAST:event_jComboBox_EspeciesPopupMenuWillBecomeVisible

    private void jComboBox_EspeciesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_EspeciesMouseClicked

    }//GEN-LAST:event_jComboBox_EspeciesMouseClicked
String especieSelec;
    private void jComboBox_EspeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_EspeciesActionPerformed
        especieSelec = this.jComboBox_Especies.getSelectedItem().toString();
        int indice = this.jComboBox_Especies.getSelectedIndex();
        this.jTextFieldVacuna.setText("");
        this.jTextFieldVacuna.setText("");
        if (indice == -1) {
            BuscarCoincidenciasxEspecie(especieSelec);
        }else{
            BuscarIDEspecie(especieSelec);
        }
    }//GEN-LAST:event_jComboBox_EspeciesActionPerformed

    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
        if(this.jTextFieldVacuna.getText().equals("")& jComboBox_Especies.getModel().getSelectedItem().equals("Seleccionar Especie")& this.jSpinner1.getModel().getValue().equals(0)){
            JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención",JOptionPane.WARNING_MESSAGE);
        }else{
            if(IDEspecie==0){
                especieSelec = this.jComboBox_Especies.getSelectedItem().toString();
                BuscarIDEspecie(especieSelec);
            }

            int años = Integer.valueOf(String.valueOf(jSpinner1.getModel().getValue()));
            String tiempo=String.valueOf(this.jComboBox1.getModel().getSelectedItem());
            String nombre=this.jTextFieldVacuna.getText();
            String condicion="";
            if(this.jRadioButtonObligatorio.isSelected()){
               condicion="OBLIGATORIO";
            }else if(this.jRadioButtonOptativo.isSelected()){
              condicion="OPTATIVO";
            }else if(this.jRadioButtonRefuerzo.isSelected()){
              condicion="REFUERZO";
            }
            vacuna.ModificarVacuna(IDVacuna,nombre,años,tiempo,IDEspecie,condicion);
           
            JOptionPane.showMessageDialog(null,"Se Guardaron los Cambios Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            ENLACE();            
        }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed
        dispose();
        ENLACE();
    }//GEN-LAST:event_buttonAction2ActionPerformed

    private void jTextFieldVacunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVacunaKeyTyped
      if(jTextFieldVacuna.getText().length()>30){
        evt.consume();
      }
    }//GEN-LAST:event_jTextFieldVacunaKeyTyped

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
            java.util.logging.Logger.getLogger(ModificarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarVacuna dialog = new ModificarVacuna(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox jComboBox1;
    public javax.swing.JComboBox jComboBox_Especies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JRadioButton jRadioButtonObligatorio;
    public javax.swing.JRadioButton jRadioButtonOptativo;
    public javax.swing.JRadioButton jRadioButtonRefuerzo;
    public javax.swing.JSpinner jSpinner1;
    public javax.swing.JTextField jTextFieldVacuna;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

       private void ENLACE() {
     int L=0,ES=0,MOD=0,ELI=0;
      GestionVacunas tt=new GestionVacunas(new javax.swing.JFrame(), true);
      tt.IDROL=idrol;
      
      try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE idrol="+idrol;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
             L=rs.getInt("L_VACUNA");
             ES=rs.getInt("ESC_VACUNA");
             MOD=rs.getInt("MOD_VACUNA");
             ELI=rs.getInt("ELIM_VACUNA");
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
            this.jComboBox_Especies.setModel(modeloCombo);
        } catch (SQLException ex) {
            ex.getMessage();
        } 
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
            this.jComboBox_Especies.setModel(modeloCombo);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    int IDEspecie;
    private void BuscarIDEspecie(String especieSelec) {
        try {            
           
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT id FROM especies WHERE nombre LIKE '"+especieSelec+"%' ORDER BY nombre ASC");
                     
            while (rs.next()) {
               IDEspecie=rs.getInt("id");
            }
            rs.close();
           
        } catch (SQLException ex) {
            ex.getMessage();
        } 
    }
}
