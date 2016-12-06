package PANTALLAS;

import CLASES.ClaseUsuarios;
import CLASES.JTextFieldToUpperCase;
import Conexion.ConexionMySQL;
import PANTALLAS.Alta_Usuario;
import PANTALLAS.Principal;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.edisoncor.gui.util.Avatar;

public class IngresoSistema extends javax.swing.JFrame {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    DefaultTableModel modelo;
    CallableStatement cmd;
    ClaseUsuarios clu=new ClaseUsuarios();
    Date f;
    Calendar Calendario = Calendar.getInstance();
    public IngresoSistema() {
        initComponents();
        setLocationRelativeTo(null);
        TextField_usuario.setDocument(new JTextFieldToUpperCase());  
        TextField_usuario.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextField_usuario = new javax.swing.JTextField();
        JPasswordcontraseña = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonTaskINGRESAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRectTranslucido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/60599-clinica-veterinaria-inca-banner-1.jpg"))); // NOI18N

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/banner01.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(141, 141, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DE INGRESO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("USUARIO (*)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("CONTRASEÑA(*)");

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

        JPasswordcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JPasswordcontraseñaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JPasswordcontraseñaKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Campos Obligatorios(*)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField_usuario)
                            .addComponent(JPasswordcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JPasswordcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGRESO AL SISTEMA");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonTaskINGRESAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskINGRESAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/tarjeta-de-informacion-del-usuario-icono-7370-48.png"))); // NOI18N
        buttonTaskINGRESAR.setText("INGRESAR");
        buttonTaskINGRESAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskINGRESAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskINGRESAR.setDescription(".");
        buttonTaskINGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskINGRESARActionPerformed(evt);
            }
        });

        buttonTask1.setForeground(new java.awt.Color(255, 255, 255));
        buttonTask1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/rescindir-rojo-icono-6989-32.png"))); // NOI18N
        buttonTask1.setText("CANCELAR");
        buttonTask1.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTask1.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTask1.setDescription(".");
        buttonTask1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask1ActionPerformed(evt);
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
                        .addGap(10, 10, 10)
                        .addComponent(buttonTaskINGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTaskINGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPasswordcontraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPasswordcontraseñaKeyTyped

    }//GEN-LAST:event_JPasswordcontraseñaKeyTyped

    private void JPasswordcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPasswordcontraseñaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(!TextField_usuario.getText().equals("") || !JPasswordcontraseña.getText().equals("")){
                String u =this.TextField_usuario.getText();
                String c = JPasswordcontraseña.getText();
                int encontrado = clu.existeUsuario(u,c);
                try{
                    if(encontrado==0){
                        JOptionPane.showMessageDialog(null, "Se le Informa que el Usuario o la Contraseña no Existe"+",Debe Registrarse", "Información", JOptionPane.INFORMATION_MESSAGE);
                        TextField_usuario.setText("");
                        TextField_usuario.requestFocus();
                        JPasswordcontraseña.setText("");
                    }else{
                        int estadoActual=estaActivo(u,c);
                        if(estadoActual==2){
                            JOptionPane.showMessageDialog(null,"El Usuario,"+" "+TextField_usuario.getText()+""+",Fue dado de Baja, Por Favor Ingrese con otro Usuario","Información",JOptionPane.INFORMATION_MESSAGE);
                            this.TextField_usuario.setText("");
                            JPasswordcontraseña.setText("");
                            this.TextField_usuario.requestFocus();
                        }else{
                            BuscarNivelAccesoxUsuario(u,c);
                            JOptionPane.showMessageDialog(null,"Bienvenido,"+ " " + u);
                            Principal pri = new Principal();
                            pri.ROL=IDROL;
                            pri.usuario=this.IDUSUARIO;
                            pri.setVisible(true);
                            pri.setLocationRelativeTo(null);
                            dispose();
                        }
                    }
                } catch (Exception ex) {
                    ex.getMessage();
                }
            }else{
                JOptionPane.showMessageDialog(null,"Debe Ingresar el Usuario y La Contraseña","Atención",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_JPasswordcontraseñaKeyPressed

    private void TextField_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_usuarioKeyTyped

    }//GEN-LAST:event_TextField_usuarioKeyTyped

    private void TextField_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_usuarioActionPerformed

    }//GEN-LAST:event_TextField_usuarioActionPerformed

    private void buttonTask1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonTask1ActionPerformed

    private void buttonTaskINGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskINGRESARActionPerformed
        if(!TextField_usuario.getText().equals("") || !JPasswordcontraseña.getText().equals("")){
            String u =this.TextField_usuario.getText();
            String c = JPasswordcontraseña.getText();
            int encontrado = clu.existeUsuario(u,c);
            try{
                if(encontrado==0){
                    JOptionPane.showMessageDialog(null,"Se le Informa que el Usuario o la Contraseña no Existe,Debe Registrarse", "Información", JOptionPane.INFORMATION_MESSAGE);
                    TextField_usuario.setText("");
                    TextField_usuario.requestFocus();
                    JPasswordcontraseña.setText("");
                }else{
                    int estadoActual=estaActivo(u,c);
                    if(estadoActual==2){
                        JOptionPane.showMessageDialog(null,"Se le Informa que el Usuario,"+" "+TextField_usuario.getText()+" "+",Fue dado de Baja","Información",JOptionPane.INFORMATION_MESSAGE);
                        this.TextField_usuario.setText("");
                        JPasswordcontraseña.setText("");
                        this.TextField_usuario.requestFocus();
                    }else{
                        BuscarNivelAccesoxUsuario(u,c);
                        JOptionPane.showMessageDialog(null,"Bienvenido, "+" "+ u.toUpperCase());
                        Principal pri = new Principal();
                        pri.ROL=IDROL;
                        pri.usuario=IDUSUARIO;
                        pri.setVisible(true);
                        pri.setLocationRelativeTo(null);
                        dispose();
                    }
                }
            } catch (Exception ex) {
                ex.getMessage();
            }
        }else{
            JOptionPane.showMessageDialog(null,"Debe Ingresar el Usuario y La Contraseña","Atención",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskINGRESARActionPerformed
int IDROL,IDUSUARIO;
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
            java.util.logging.Logger.getLogger(IngresoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoSistema().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPasswordcontraseña;
    private javax.swing.JTextField TextField_usuario;
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    private org.edisoncor.gui.button.ButtonTask buttonTaskINGRESAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

private void BuscarNivelAccesoxUsuario(String u,String c){
         try {           
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT usuarios.id,permisos.idrol FROM permisos INNER JOIN usuarios ON permisos.idrol=usuarios.idtiporol WHERE usuario LIKE '"+u+"%' AND contrasena LIKE '"+c+"%'");
            while (rs.next()) {               
               IDROL=rs.getInt("permisos.idrol");
               IDUSUARIO=rs.getInt("usuarios.id");
            }
            rs.close();            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

   
    private int estaActivo(String usuario,String pass) {
       int estadoActual=0;  
          try {           
            cn=cm.Conectar();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT idestado FROM personas INNER JOIN usuarios ON personas.id=usuarios.idpersona WHERE usuarios.usuario LIKE '"+usuario+"%' AND contrasena LIKE '"+pass+"%'");
                     
            while (rs.next()) {
               estadoActual=rs.getInt("idestado");
            }
            rs.close();
            
        } catch (SQLException ex) {
            ex.getMessage();
        } 
          return estadoActual;
    }

}
