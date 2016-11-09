package PANTALLAS;

import CLASES.ClaseProvincias;
import CLASES.JTextFieldToUpperCase;
import Conexion.ConexionMySQL;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class AltaProvincia extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    ClaseProvincias pro=new ClaseProvincias();
      
    boolean bandera=false; 
    public AltaProvincia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.nom.setDocument(new JTextFieldToUpperCase());   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonActionCANCELAR = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRectTranslucido1.setPreferredSize(new java.awt.Dimension(353, 393));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROVINCIAS");

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS PROVINCIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Provincia(*)");

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        nom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomFocusLost(evt);
            }
        });
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("*Campos Obligatorios");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonActionGUARDAR.setText("GUARDAR");
        buttonActionGUARDAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionGUARDARActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 223, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int idusuario,idrol;
    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed

    }//GEN-LAST:event_nomActionPerformed

    private void nomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusLost

    }//GEN-LAST:event_nomFocusLost

    private void nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyTyped
        char codigo=evt.getKeyChar();

        if(!Character.isAlphabetic(codigo)){
            if(Character.isSpace(codigo)){
                evt.setKeyCode(KeyEvent.VK_SPACE);
            }else{
                evt.consume();}
        }else if(nom.getText().length()==30){
            evt.consume();
        }
    }//GEN-LAST:event_nomKeyTyped
String NUEVAprovincia;
    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
     if(nom.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención",JOptionPane.WARNING_MESSAGE);
          nom.requestFocus();
        }else{
            String nombre = nom.getText();
            String encontrada = pro.AgregarProvincia(nombre);
            if(encontrada != null) {//SI ES NULL NO EXISTE          
                JOptionPane.showMessageDialog(null,"La Provincia" + " " + nom.getText()+ " " + "Se Encuentra Registrada", "Información", JOptionPane.INFORMATION_MESSAGE);
                nom.setText(""); 
        }else{
           JOptionPane.showMessageDialog(null, "La Provincia" + " " + nom.getText()+ " " + "se Registró Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
           if(bandera==false){
                dispose();
                enlace();
            }else{
                BuscarUltimo();
                Alta_Localidad al=new Alta_Localidad(new javax.swing.JFrame(), true);
                al.jComboBox_Provincias.getModel().setSelectedItem(nombre);
                al.IDProvincia=idProvincia;
                dispose();
                al.show();
            }

            }
        }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonActionCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionCANCELARActionPerformed
      dispose();
      enlace();
    }//GEN-LAST:event_buttonActionCANCELARActionPerformed

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
            java.util.logging.Logger.getLogger(AltaProvincia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaProvincia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaProvincia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaProvincia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AltaProvincia dialog = new AltaProvincia(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonAction buttonActionCANCELAR;
    public org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField nom;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables


private void enlace() {
  int L_PROVINC=0,ES_PROVINC=0,MOD_PROVINC=0,ELI_PROVINC=0;
  Gestión_Provincias provin=new Gestión_Provincias(new javax.swing.JFrame(), true);
  provin.IDROL=idrol;
 
      try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+idrol;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {                                
              L_PROVINC=rs.getInt("L_PROVINCIA");
              ES_PROVINC=rs.getInt("ESC_PROVINCIA");
              MOD_PROVINC=rs.getInt("MOD_PROVINCIA");
              ELI_PROVINC=rs.getInt("ELIM_PROVINCIA");               
            }                              
        }catch (SQLException ex)
          {
            JOptionPane.showMessageDialog(null, ex);
          }    
          
      if(L_PROVINC!=0 & ES_PROVINC!=0 & MOD_PROVINC!=0 & ELI_PROVINC!=0){
         provin.buttonTaskAGREGAR.setEnabled(true);         
         provin.buttonTaskELIMINAR.setEnabled(false);
         provin.buttonTaskMODIFICAR.setEnabled(false);
         provin.TABLA.setEnabled(true); 
         provin.buttonTaskCERRAR.setEnabled(true);
      }else if(L_PROVINC!=0){
         provin.buttonTaskAGREGAR.setEnabled(false);
         provin.buttonTaskELIMINAR.setEnabled(false);
         provin.buttonTaskMODIFICAR.setEnabled(false);
         provin.TABLA.setEnabled(false);
         provin.buttonTaskCERRAR.setEnabled(true);
      }else if(ES_PROVINC!=0){
         provin.buttonTaskAGREGAR.setEnabled(true);
         provin.buttonTaskELIMINAR.setEnabled(false);
         provin.buttonTaskMODIFICAR.setEnabled(false);
         provin.TABLA.setEnabled(false);
         provin.buttonTaskCERRAR.setEnabled(true);
      }else if(MOD_PROVINC!=0){
         provin.buttonTaskAGREGAR.setEnabled(false);
         provin.buttonTaskELIMINAR.setEnabled(false);
         provin.buttonTaskMODIFICAR.setEnabled(false);
         provin.TABLA.setEnabled(true);
         provin.buttonTaskCERRAR.setEnabled(true);
      }else  if(ELI_PROVINC!=0){
         provin.buttonTaskAGREGAR.setEnabled(false);
         provin.buttonTaskELIMINAR.setEnabled(false);
         provin.buttonTaskMODIFICAR.setEnabled(false);
         provin.TABLA.setEnabled(true);
         provin.buttonTaskCERRAR.setEnabled(true);
      }else {
         provin.buttonTaskAGREGAR.setEnabled(false);
         provin.buttonTaskELIMINAR.setEnabled(false);
         provin.buttonTaskMODIFICAR.setEnabled(false);
         provin.TABLA.setEnabled(false);
         provin.buttonTaskCERRAR.setEnabled(true);
      }
        provin.show();
    }

public void NiveldeAcsesos(int rol){
   int ES_PROVINC=0;
   AltaProvincia p=new AltaProvincia(new javax.swing.JFrame(), true);
   try
      {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE idrol="+rol;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {                                              
              ES_PROVINC=rs.getInt("ESC_PROVINCIA");                        
            }                              
        }catch (SQLException ex)
          {
            JOptionPane.showMessageDialog(null, ex);
          }
   
   if(ES_PROVINC!=0){
      p.buttonActionGUARDAR.setEnabled(true);
      p.nom.setEnabled(true);
   }else{
      p.buttonActionGUARDAR.setEnabled(false);
      p.nom.setEnabled(false);
   }
}

int idProvincia;
private void BuscarUltimo() {
         try {             
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(id) AS id FROM provincia");
                     
            while (rs.next()) {
               idProvincia=rs.getInt("id");
            }
            rs.close();
            
        } catch (SQLException ex) {
            ex.getMessage();
        } 
    }
}
