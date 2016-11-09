package PANTALLAS;

import CLASES.ClaseMedicamentos;
import Conexion.ConexionMySQL;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
public class ModificarMedicamento extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    Calendar Calendario = Calendar.getInstance();
    ClaseMedicamentos med=new  ClaseMedicamentos();
    public ModificarMedicamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonActionCANCELAR = new org.edisoncor.gui.button.ButtonAction();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextFieldACTUAL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMINIMO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDESCRIPCIN = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCOMPOSICION = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaACCION = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEDICAMENTOS");

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

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS MEDICAMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Medicamento(*)");

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
        jLabel4.setText("Categoria(*)");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextFieldACTUAL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldACTUALKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Cant.Actual(*)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Cant.Minimo(*)");

        jTextFieldMINIMO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMINIMOKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Descripcion(*)");

        jTextAreaDESCRIPCIN.setColumns(20);
        jTextAreaDESCRIPCIN.setRows(5);
        jTextAreaDESCRIPCIN.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTextAreaDESCRIPCINComponentAdded(evt);
            }
        });
        jTextAreaDESCRIPCIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaDESCRIPCINKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaDESCRIPCIN);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Composicion(*)");

        jTextAreaCOMPOSICION.setColumns(20);
        jTextAreaCOMPOSICION.setRows(5);
        jTextAreaCOMPOSICION.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaCOMPOSICIONKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAreaCOMPOSICION);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Accion(*)");

        jTextAreaACCION.setColumns(20);
        jTextAreaACCION.setRows(5);
        jTextAreaACCION.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaACCIONKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(jTextAreaACCION);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTextFieldACTUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldMINIMO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldACTUAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldMINIMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

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
                                .addComponent(jLabel1))
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int idusuario,idrol,idMedicamento,cantiminimoAnterior,cantiactualAnterior;String categoriaAnterior,medicamentoAnterior,descripcionAnterior,composicionAnterior,AccionAnterior;
    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
        if(jTextFieldACTUAL.getText().equals("")|| this.jTextFieldMINIMO.getText().equals("")|| this.JTextFieldNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe Completar Los Campos Obligatorios","Atención", JOptionPane.WARNING_MESSAGE);
        }else{
         BuscarUsuario();
         fecha();
         int cantiactual=Integer.parseInt(this.jTextFieldACTUAL.getText());
         int cantiminimo=Integer.parseInt(this.jTextFieldMINIMO.getText());
         String descripcion=this.jTextAreaDESCRIPCIN.getText();String composicion=this.jTextAreaCOMPOSICION.getText();String accion=this.jTextAreaACCION.getText();
         if(cantiminimo<cantiactual){
             String medicamento=JTextFieldNombre.getText();
             String categoria=String.valueOf(jComboBox1.getModel().getSelectedItem());
             if(idcategoria==0){
               BuscarIDCategoria(categoria);
             }            
             String anterior="Categoria"+""+categoriaAnterior+",Medicamento"+medicamentoAnterior+",Cant.Actual"+cantiactualAnterior+",Cant.Minimo"+cantiminimoAnterior;
             String nuevo="Categoria"+""+categoria+",Medicamento"+medicamento+",Cant.Actual"+cantiactual+",Cant.Minimo"+cantiminimo;

             med.ModificarMedicamento(idMedicamento,medicamento,idcategoria,cantiactual,cantiminimo,descripcion,composicion,accion);
             med.InsertarDatosAuditoria(fechaActual,hor, usu,"MEDICAMENTOS","MODIFICACION",anterior,nuevo);
             dispose();
             ENLACE();
         }else{             
             JOptionPane.showMessageDialog(null,"La Cant.Minima No puede ser Superior a la Cant.Actual","Atención", JOptionPane.WARNING_MESSAGE);
             jTextFieldACTUAL.setText("");
         }
       }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void JTextFieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextFieldNombreFocusLost

    }//GEN-LAST:event_JTextFieldNombreFocusLost

    private void JTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNombreActionPerformed

    }//GEN-LAST:event_JTextFieldNombreActionPerformed

    private void JTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNombreKeyTyped
        if(JTextFieldNombre.getText().length()==50){
            evt.consume();
        }
    }//GEN-LAST:event_JTextFieldNombreKeyTyped

    private void jTextFieldACTUALKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldACTUALKeyTyped
        char codigo=evt.getKeyChar();

        if(!Character.isDigit(codigo)){
            evt.consume();
        }else if(jTextFieldACTUAL.getText().length()==3){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldACTUALKeyTyped

    private void jTextFieldMINIMOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMINIMOKeyTyped
        char codigo=evt.getKeyChar();

        if(!Character.isDigit(codigo)){
            evt.consume();
        }else if(jTextFieldMINIMO.getText().length()==3){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMINIMOKeyTyped

    private void jTextAreaDESCRIPCINKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDESCRIPCINKeyTyped
    if(jTextAreaDESCRIPCIN.getText().length()==500){
            evt.consume();
        }
    }//GEN-LAST:event_jTextAreaDESCRIPCINKeyTyped

    private void jTextAreaCOMPOSICIONKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaCOMPOSICIONKeyTyped
      if(jTextAreaCOMPOSICION.getText().length()==500){
            evt.consume();
        }
    }//GEN-LAST:event_jTextAreaCOMPOSICIONKeyTyped

    private void jTextAreaACCIONKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaACCIONKeyTyped
       if(jTextAreaACCION.getText().length()==500){
            evt.consume();
        }
    }//GEN-LAST:event_jTextAreaACCIONKeyTyped

    private void buttonActionCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionCANCELARActionPerformed
        dispose();
       ENLACE();
    }//GEN-LAST:event_buttonActionCANCELARActionPerformed

    private void jTextAreaDESCRIPCINComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTextAreaDESCRIPCINComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaDESCRIPCINComponentAdded

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
            java.util.logging.Logger.getLogger(ModificarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarMedicamento dialog = new ModificarMedicamento(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonAction buttonActionCANCELAR;
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    public javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextArea jTextAreaACCION;
    public javax.swing.JTextArea jTextAreaCOMPOSICION;
    public javax.swing.JTextArea jTextAreaDESCRIPCIN;
    public javax.swing.JTextField jTextFieldACTUAL;
    public javax.swing.JTextField jTextFieldMINIMO;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

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

    
  int idcategoria;
  private void BuscarIDCategoria(String categoria) {
   String sSQL = "";        
    cn=cm.Conectar();
    sSQL = "SELECT id FROM categoriamedicamento WHERE nombre LIKE '"+categoria+"%'";
    try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
              {
                idcategoria=rs.getInt("id");
               }
             
             rs.close();
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }
  
  
  private void ENLACE() {
   int L_USU = 0, ES_USU = 0, MOD_USU = 0, ELI_USU = 0;
   GestionMedicamentos usu=new GestionMedicamentos(new javax.swing.JFrame(), true);
   usu.IDROL=idrol;
   try {
        cn = cm.Conectar();
        String sql = "SELECT * FROM permisos WHERE idrol="+idrol;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            L_USU = rs.getInt("L_MEDICAMENTO");
            ES_USU = rs.getInt("ESC_MEDICAMENTO");
            MOD_USU = rs.getInt("MOD_MEDICAMENTO");
            ELI_USU = rs.getInt("ELIM_MEDICAMENTO");
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }

        if(L_USU != 0 & ES_USU!=0 & MOD_USU!=0 & ELI_USU!=0){
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(true);           
            usu.buttonTaskEDITAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(true);            
        }else   if (L_USU != 0) {
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(false);           
            usu.buttonTaskEDITAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(false);            
        }else if (ES_USU != 0) {
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(false);            
            usu.buttonTaskEDITAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(true);            
        }else if (MOD_USU != 0) {
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(true);           
            usu.buttonTaskEDITAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(false);           
        }else if (ELI_USU != 0) {
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(true);           
            usu.buttonTaskEDITAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(false);           
        }else{
            usu.buttonTaskSALIR.setEnabled(true);
            usu.TABLA.setEnabled(false);
            usu.buttonTaskEDITAR.setEnabled(false);
            usu.buttonTaskBORRAR.setEnabled(false);
            usu.buttonTaskAGREGAR.setEnabled(false);           
        }
        usu.show();      
    }
    }

