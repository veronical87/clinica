package PANTALLAS;

import CLASES.Clase_Roles;
import CLASES.JTextFieldToUpperCase;
import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Alta_TipoRol extends javax.swing.JDialog {

    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    DefaultTableModel modelo;
    CallableStatement cmd;
    Clase_Roles u=new Clase_Roles();
    public Alta_TipoRol(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        nom.setDocument(new JTextFieldToUpperCase());
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRectTranslucido1.setPreferredSize(new java.awt.Dimension(405, 423));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIPOS DE ROLES");

        jPanel5.setBackground(new java.awt.Color(141, 141, 175));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DEL ROL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tipo de Rol(*)");

        nom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomFocusLost(evt);
            }
        });
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Campos Obligatorios(*)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
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
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int IDROL;
    private void nomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusLost

    }//GEN-LAST:event_nomFocusLost

    private void nomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyReleased

    }//GEN-LAST:event_nomKeyReleased

    private void nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyTyped
        if (this.nom.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_nomKeyTyped
boolean bandera;
    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
     if(nom.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención",JOptionPane.WARNING_MESSAGE);
            nom.requestFocus();
        }else{ 
           String nombre = nom.getText();                 
           int h=u.Agregar(nombre);
            if(h==0){           
                if(bandera==true){
                    JOptionPane.showMessageDialog(null, "Se Registró el Rol" + " " + nombre + " " + "Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    Alta_Usuario g=new Alta_Usuario(new javax.swing.JFrame(), true);
                    g.comboTipoUsu.getModel().setSelectedItem(nombre);
                    g.show();
                }else{
                    JOptionPane.showMessageDialog(null, "Se Registró el Rol" +" "+ nombre +" "+ "Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    ENLACE();
                }
            
        }else{
            JOptionPane.showMessageDialog(null,"El Rol"+" "+nombre+" "+ "Se Encuentra Registrado","Información", JOptionPane.INFORMATION_MESSAGE);
            nom.setText("");
           }
        }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed
       dispose();
       ENLACE();
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
            java.util.logging.Logger.getLogger(Alta_TipoRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_TipoRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_TipoRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_TipoRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Alta_TipoRol dialog = new Alta_TipoRol(new javax.swing.JFrame(), true);
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
    public org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField nom;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables


    private void ENLACE() {         
        int L_ROL = 0, ES_ROL = 0, MOD_ROL = 0, ELI_ROL = 0;
        Gestión_de_Tipos_Roles tr=new Gestión_de_Tipos_Roles(new javax.swing.JFrame(), true);
        
        try {
            cn = cm.Conectar();
            String sql = "SELECT * FROM permisos WHERE idrol="+IDROL;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                L_ROL = rs.getInt("L_TIPOROL");
                ES_ROL = rs.getInt("ESC_TIPOROL");
                MOD_ROL = rs.getInt("MOD_TIPOROL");
                ELI_ROL = rs.getInt("ELIM_TIPOROL");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

         if( L_ROL !=0 & ES_ROL!=0 & MOD_ROL!=0 & ELI_ROL !=0){
            tr.buttonTaskAGREGAR.setEnabled(true);          
            tr.buttonTaskELIMINAR.setEnabled(false);
            tr.buttonTaskMODIFICAR.setEnabled(false);
            tr.TABLA.setEnabled(true);             
            tr.buttonTaskCERRAR.setEnabled(true);
            
        }else  if (L_ROL != 0) {
            tr.buttonTaskCERRAR.setEnabled(true);
            tr.buttonTaskELIMINAR.setEnabled(false);
            tr.buttonTaskMODIFICAR.setEnabled(false);
            tr.TABLA.setEnabled(false);
        }else  if (ES_ROL != 0) {
            tr.buttonTaskAGREGAR.setEnabled(true);            
            tr.buttonTaskCERRAR.setEnabled(true);
            tr.buttonTaskELIMINAR.setEnabled(false);
            tr.buttonTaskMODIFICAR.setEnabled(false);
            tr.TABLA.setEnabled(false);
        }else   if (MOD_ROL != 0) {
            tr.buttonTaskAGREGAR.setEnabled(false);
            tr.buttonTaskCERRAR.setEnabled(true);
            tr.buttonTaskELIMINAR.setEnabled(false);
            tr.buttonTaskMODIFICAR.setEnabled(false);
            tr.TABLA.setEnabled(true);
        }else  if (ELI_ROL != 0) {
            tr.buttonTaskAGREGAR.setEnabled(false);           
            tr.buttonTaskCERRAR.setEnabled(true);
            tr.buttonTaskELIMINAR.setEnabled(true);
            tr.buttonTaskMODIFICAR.setEnabled(false);
            tr.TABLA.setEnabled(true);
        }else{
            tr.buttonTaskAGREGAR.setEnabled(false);           
            tr.buttonTaskCERRAR.setEnabled(true);
            tr.buttonTaskELIMINAR.setEnabled(false);
            tr.buttonTaskMODIFICAR.setEnabled(false);
            tr.TABLA.setEnabled(false);
        }
        tr.show();
    
    }
}
