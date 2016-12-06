package PANTALLAS;

import CLASES.Clase_Personas;
import CLASES.ClaseUsuarios;
import Conexion.ConexionMySQL;
import java.sql.*;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestionUsuarios extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    Calendar Calendario = Calendar.getInstance();  
    ClaseUsuarios claseusu=new ClaseUsuarios();
    Clase_Personas persona=new Clase_Personas();
    DefaultTableModel modelo;
    
    public GestionUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        buttonTaskMODIFICAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskAGREGAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskBORRAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskSALIR = new org.edisoncor.gui.button.ButtonTask();
        PANEL = new javax.swing.JPanel();
        JComboBoxCriterioSeleccionado = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCriterioBuscado = new javax.swing.JTextField();
        buttonTaskBUSCAR = new org.edisoncor.gui.button.ButtonTask();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        buttonTaskMODIFICAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskMODIFICAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/editar-lapiz-escribir-icono-4987-32.png"))); // NOI18N
        buttonTaskMODIFICAR.setText("EDITAR");
        buttonTaskMODIFICAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskMODIFICAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        buttonTaskMODIFICAR.setDescription("..");
        buttonTaskMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskMODIFICARActionPerformed(evt);
            }
        });

        buttonTaskAGREGAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskAGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/agregar-icono-5633-32.png"))); // NOI18N
        buttonTaskAGREGAR.setText("NUEVO");
        buttonTaskAGREGAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskAGREGAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        buttonTaskAGREGAR.setDescription("..");
        buttonTaskAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskAGREGARActionPerformed(evt);
            }
        });

        buttonTaskBORRAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskBORRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/gtk-eliminar-icono-8705-32.png"))); // NOI18N
        buttonTaskBORRAR.setText("BORRAR");
        buttonTaskBORRAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskBORRAR.setDescription("..");
        buttonTaskBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskBORRARActionPerformed(evt);
            }
        });

        buttonTaskSALIR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskSALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/rescindir-rojo-icono-6989-32.png"))); // NOI18N
        buttonTaskSALIR.setText("SALIR");
        buttonTaskSALIR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskSALIR.setDescription("..");
        buttonTaskSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskSALIRActionPerformed(evt);
            }
        });

        PANEL.setBackground(new java.awt.Color(141, 141, 175));
        PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "BÚSQUEDAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        JComboBoxCriterioSeleccionado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JComboBoxCriterioSeleccionado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario", "Tipo de Rol", "Todos" }));
        JComboBoxCriterioSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxCriterioSeleccionadoActionPerformed(evt);
            }
        });
        JComboBoxCriterioSeleccionado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JComboBoxCriterioSeleccionadoKeyPressed(evt);
            }
        });

        jLabel2.setText("Tipo de Búsqueda");

        jTextFieldCriterioBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCriterioBuscadoActionPerformed(evt);
            }
        });
        jTextFieldCriterioBuscado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCriterioBuscadoKeyTyped(evt);
            }
        });

        buttonTaskBUSCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/busqueda-icono-8260-32.png"))); // NOI18N
        buttonTaskBUSCAR.setText("e");
        buttonTaskBUSCAR.setCategoryFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        buttonTaskBUSCAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskBUSCARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANELLayout = new javax.swing.GroupLayout(PANEL);
        PANEL.setLayout(PANELLayout);
        PANELLayout.setHorizontalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(JComboBoxCriterioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jTextFieldCriterioBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PANELLayout.setVerticalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboBoxCriterioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCriterioBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(141, 141, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "LISTA DE USUARIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Rol", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAMouseClicked(evt);
            }
        });
        TABLA.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                TABLAComponentMoved(evt);
            }
        });
        jScrollPane3.setViewportView(TABLA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTIÓN DE USUARIOS");

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskBORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonTaskMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonTaskBORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonTaskSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int IDROL,idusuario;
    private void JComboBoxCriterioSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxCriterioSeleccionadoActionPerformed
        String criterio=this.JComboBoxCriterioSeleccionado.getSelectedItem().toString();
        String buscar=this.jTextFieldCriterioBuscado.getText();
        
        if(criterio.equals("Usuario")) {
            MostrarDatosxUsuario(buscar);
        }else if(criterio.equals("Tipo de Rol")) {
            MostrarDatosxRol(buscar);
        }else if(criterio.equals("Todos")){
            jTextFieldCriterioBuscado.setVisible(false);
            limpiarTabla(TABLA);
            modelo=(DefaultTableModel) TABLA.getModel();
            claseusu.LlenarTabla(modelo);
        }else{
            jTextFieldCriterioBuscado.setVisible(true);
            jTextFieldCriterioBuscado.setText("");
            jTextFieldCriterioBuscado.requestFocus();
        }
    }//GEN-LAST:event_JComboBoxCriterioSeleccionadoActionPerformed

    private void JComboBoxCriterioSeleccionadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JComboBoxCriterioSeleccionadoKeyPressed

    }//GEN-LAST:event_JComboBoxCriterioSeleccionadoKeyPressed

    private void jTextFieldCriterioBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCriterioBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCriterioBuscadoActionPerformed

    private void jTextFieldCriterioBuscadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCriterioBuscadoKeyTyped
        String criterio = JComboBoxCriterioSeleccionado.getSelectedItem().toString();
        String buscar = this.jTextFieldCriterioBuscado.getText();

        if(criterio.equals("Usuario")) {
            MostrarDatosxUsuario(buscar);
        }else if(criterio.equals("Tipo de Rol")) {
            MostrarDatosxRol(buscar);
        }else if (criterio.equals("Todos")) {
            limpiarTabla(TABLA);
            modelo=(DefaultTableModel) TABLA.getModel();
            claseusu.LlenarTabla(modelo);
        }
    }//GEN-LAST:event_jTextFieldCriterioBuscadoKeyTyped

    private void buttonTaskBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskBUSCARActionPerformed
        String criterio = JComboBoxCriterioSeleccionado.getSelectedItem().toString();
        String buscar = this.jTextFieldCriterioBuscado.getText();

        if(buscar.equals("")){
            jTextFieldCriterioBuscado.requestFocus();
            JOptionPane.showMessageDialog(null,"Debe Ingresar el Dato a Buscar","Atencion",JOptionPane.WARNING_MESSAGE);
        }else if(criterio.equals("Usuario")) {
            MostrarDatosxUsuario(buscar);
        }else if(criterio.equals("Tipo de Rol")) {
            MostrarDatosxRol(buscar);
        }
    }//GEN-LAST:event_buttonTaskBUSCARActionPerformed
int filasel;
    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        String id;
        filasel = TABLA.getSelectedRow();
        ENLACE();
        modelo = (javax.swing.table.DefaultTableModel) TABLA.getModel();
        id = (String) modelo.getValueAt(filasel, 1);
        this.buttonTaskAGREGAR.setEnabled(false);
        this.buttonTaskMODIFICAR.setEnabled(true);
        this.buttonTaskBORRAR.setEnabled(true);
        BuscarUsuario(id);
    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TABLAComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLAComponentMoved

    private void buttonTaskMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskMODIFICARActionPerformed
          if (filasel != -1) {
            dispose();
            ModificarUsuario mu = new ModificarUsuario(new javax.swing.JFrame(), true);
            mu.idPersona = idpersona;
            mu.idusuario = idusuario;
            mu.idusu = idusu;  //id del usuario seleccionado
            mu.ROL = IDROL;
            mu.idtipo = idrol;
            mu.usuario = u;
            mu.banderaLocalidad = true;
            mu.banderaProvincia= true;
            mu.contraseña = c;
            mu.APELLIDO = ape;
            mu.NOMBRE = nom;
            mu.DIRECCION = d;
            mu.EMAIL = e;
            mu.LOCALIDAD = localidadSelec;
            mu.CODAREA = t;
            mu.ROLSELEC = tipo;
            mu.comboTipoUsu.getModel().setSelectedItem(tipo);
            mu.jComboBoxProvincias.getModel().setSelectedItem(provincia);
            mu.TextField_usuario.setText(u);
            mu.apellido.setText(ape);
            mu.TextField_nom.setText(nom);
            mu.jComboBox_Localidades.getModel().setSelectedItem(localidadSelec);
            mu.ID_LOCALIDAD=idLocalidadSelec;
            mu.TextField_direccion.setText(d);
            mu.jComboBox_TELEFONOS.getModel().setSelectedItem(tipoTelefono);
            mu.TextFieldcodigo.setText(String.valueOf(t));
            mu.TextFieldnumero.setText(String.valueOf(num));
            mu.JTextFieldCorreo.setText(e);
            mu.TextField_contraseña.setText(c);
            mu.IDTIPOTELEFONO=IDTipoTelefonoSelec;
            mu.show();
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Ítem de la Lista", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskMODIFICARActionPerformed

    private void buttonTaskAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARActionPerformed
        dispose();
        Alta_Usuario ap = new Alta_Usuario(new javax.swing.JFrame(), true);
        ap.ROL=IDROL;
        ap.idusuario=idusuario;
        ap.show();
    }//GEN-LAST:event_buttonTaskAGREGARActionPerformed

    private void buttonTaskBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskBORRARActionPerformed
       BuscarUsuario();
       fecha();
        if(filasel != -1){
               if(JOptionPane.showConfirmDialog(null,"¿Desea Borrar el Usuario"+" "+u+ " " + "?", "Consulta", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    persona.BajaPersona(idpersona,fechaActual,hor,usu," ");
                    JOptionPane.showMessageDialog(null, "El Usuario"+" "+u+" "+"Se Borró Correctamente","Informacion", JOptionPane.INFORMATION_MESSAGE);
                    limpiarTabla(TABLA);
                    modelo = (DefaultTableModel) TABLA.getModel();
                    claseusu.LlenarTabla(modelo);
                    buttonTaskAGREGAR.setEnabled(true);
                    buttonTaskMODIFICAR.setEnabled(false);
                    buttonTaskBORRAR.setEnabled(false);
                }else{
                    buttonTaskAGREGAR.setEnabled(true);
                    buttonTaskMODIFICAR.setEnabled(false);
                    buttonTaskBORRAR.setEnabled(false);
                }
            
        }else{
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Ítem de la Lista", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskBORRARActionPerformed

    private void buttonTaskSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskSALIRActionPerformed
     this.dispose();
    }//GEN-LAST:event_buttonTaskSALIRActionPerformed

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
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionUsuarios dialog = new GestionUsuarios(new javax.swing.JFrame(), true);
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
    public javax.swing.JComboBox JComboBoxCriterioSeleccionado;
    private javax.swing.JPanel PANEL;
    public javax.swing.JTable TABLA;
    public org.edisoncor.gui.button.ButtonTask buttonTaskAGREGAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskBORRAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskBUSCAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskMODIFICAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskSALIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField jTextFieldCriterioBuscado;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

private void limpiarTabla(JTable TABLA) {
          while(TABLA.getRowCount()>0){//se recorren todas las filas
         ((DefaultTableModel) TABLA.getModel()).removeRow(0);
       }
    }
    
    int idusu,idrol,idpersona,IDTipoTelefonoSelec,idLocalidadSelec;
    String u,tipo;   
    String c="",ape = "",nom = "",d = "",t = "",e = "",localidadSelec,provincia,tipoTelefono;int num=0;   
      
   private void BuscarUsuario(String id) {
        String sSQL;        
        cn=cm.Conectar();
        sSQL = "SELECT personas.id,usuarios.id,usuario,contrasena,apellido,usuarios.nombre,provincia.nombre,localidades.id,localidades.nombre,domicilio,localidades.codigo,personas.numerotelefono,email,roles.nombre,roles.id,tipotelefono.nombre,tipotelefono.id FROM  localidades INNER JOIN provincia  ON provincia.id=localidades.idprovincia INNER JOIN personas ON localidades.id=personas.idlocalidad INNER JOIN tipotelefono ON tipotelefono.id=personas.idtipotelefono INNER JOIN usuarios ON personas.id=usuarios.idpersona INNER JOIN roles ON roles.id=usuarios.idtiporol WHERE usuario LIKE '"+id+"%'";
        
         try
            {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while(rs.next())
            {
                idpersona=rs.getInt("personas.id");
                idusu=rs.getInt("usuarios.id");
                u=rs.getString("usuario");
                c=rs.getString("contrasena");
                ape=rs.getString("apellido");
                nom= rs.getString("usuarios.nombre");
                d=rs.getString("domicilio");
                t=rs.getString("codigo");
                num=rs.getInt("personas.numerotelefono");
                e=rs.getString("email");
                tipo=rs.getString("roles.nombre");
                idrol=rs.getInt("roles.id");    
                localidadSelec=rs.getString("localidades.nombre");
                idLocalidadSelec=rs.getInt("localidades.id");
                provincia=rs.getString("provincia.nombre");      
                tipoTelefono=rs.getString("tipotelefono.nombre");
                IDTipoTelefonoSelec=rs.getInt("tipotelefono.id");
               }        
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void MostrarDatosxUsuario(String valor) {
        String[] titulos = {"Tipo de Rol","Usuario"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[2];
        
        sSQL = "SELECT usuario,roles.nombre FROM  usuarios INNER JOIN roles ON roles.id=usuarios.idtiporol  WHERE usuario LIKE '%"+valor+"%' ORDER BY usuario ASC";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
         
            while(rs.next())
              {              
                registro[0]=rs.getString("roles.nombre");        
                registro[1]=rs.getString("usuario");
                modelo.addRow(registro);
                limpiarTabla(TABLA); 
              }           
              TABLA.setModel(modelo);  
              }
        catch (SQLException ex)
        {
         JOptionPane.showMessageDialog(null, ex);
        }
    }
 
    
     private void MostrarDatosxRol(String buscar) {
        String[] titulos = {"Tipo de Rol","Usuario"};
        modelo = new DefaultTableModel(null,titulos);
        cn=cm.Conectar();
        String sSQL = "";
        String[] registro = new String[2];
        
        sSQL = "SELECT usuario,roles.nombre FROM  usuarios INNER JOIN roles ON roles.id=usuarios.idtiporol  WHERE roles.nombre LIKE '%"+buscar+"%' ORDER BY roles.nombre ASC";
          try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

             while(rs.next())
              {
                registro[0]=rs.getString("roles.nombre");        
                registro[1]=rs.getString("usuario");
               modelo.addRow(registro);
               limpiarTabla(TABLA); 
              }          
            TABLA.setModel(modelo);  
           }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

//     private void Buscarol(String valor) {
//        String[] titulos = {"Rol","Usuario","Teléfono","E-mail"};
//        modelo = new DefaultTableModel(null,titulos);
//        cn=cm.Conectar();
//        String sSQL = "";
//        String[] registro = new String[4];
//        int estado=1;
//        sSQL = "SELECT usuario,personas.domicilio,codigoarea.codigo,personas.numerotelefono,personas.email,roles.nombre FROM codigoarea INNER JOIN codigoareaxlocalidades ON codigoarea.id=codigoareaxlocalidades.idcodigoarea INNER JOIN localidades ON localidades.id=codigoareaxlocalidades.idlocalidad INNER JOIN personas ON codigoareaxlocalidades.idlocalidad=personas.idlocalidad INNER JOIN usuarios ON personas.id=usuarios.idpersona INNER JOIN roles ON usuarios.idtipoRol=roles.id  WHERE roles.nombre LIKE '"+valor+"%' AND idestado='"+estado+"' ORDER BY usuario ASC";
//        try
//        {
//            Statement st = (Statement) cn.createStatement();
//            ResultSet rs = st.executeQuery(sSQL);
//         
//            while(rs.next())
//               {               
//               registro[0]=rs.getString("roles.nombre");        
//               registro[1]=rs.getString("usuario");
//               registro[2]=rs.getString("codigoarea.codigo")+"-"+rs.getString("numerotelefono");
//               registro[3]=rs.getString("email");
//               modelo.addRow(registro);
//               limpiarTabla(TABLA); 
//            }             
//            
//          TABLA.setModel(modelo); 
//        }
//        catch (SQLException ex)
//        {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//    }

      
String fechaActual,hor; int min;
                                                                                                                                
void fecha(){                                                                                                                               
    int año = Calendario.get(Calendar.YEAR);
    int mes = Calendario.get(Calendar.MONTH) + 1;
    int dia = Calendario.get(Calendar.DAY_OF_MONTH);
    fechaActual=dia+"/"+mes+"/"+año;
//    f=new Date(Calendario.get(Calendar.YEAR),Calendario.get(Calendar.MONTH) + 1,Calendario.get(Calendar.DAY_OF_MONTH));
    int h=Calendario.get(Calendar.HOUR_OF_DAY);
    int minutos=Calendario.get(Calendar.MINUTE);        
    hor = String.valueOf(h+":"+minutos);
}
      
  String usu;int IDUsuarioActual;
  private void BuscarUsuario() {
        String sSQL = "";
       
        cn=cm.Conectar();
        sSQL = "SELECT id,usuario FROM usuarios WHERE id="+idusuario;
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
            {
               usu=rs.getString("usuario");
               IDUsuarioActual=rs.getInt("id");
            }
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void FORMATO_TABLA(){
       TABLA.getColumnModel().getColumn(0).setPreferredWidth(20);
       TABLA.getColumnModel().getColumn(1).setPreferredWidth(80);
    }
    

 public void ENLACE() {
   int MOD_USU = 0, ELI_USU = 0;         
   try {
        cn = cm.Conectar();
        String sql = "SELECT * FROM permisos WHERE idrol="+IDROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            MOD_USU = rs.getInt("MOD_USUARIO");
            ELI_USU = rs.getInt("ELIM_USUARIO");
        }

     }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
       }                

        if (MOD_USU != 0 & ELI_USU != 0) {
             buttonTaskMODIFICAR.setEnabled(true);  
             buttonTaskBORRAR.setEnabled(true);  
             buttonTaskAGREGAR.setEnabled(false);
        }else if (ELI_USU != 0) {
            buttonTaskBORRAR.setEnabled(true); 
            buttonTaskMODIFICAR.setEnabled(false);  
        }else if(MOD_USU != 0){
            buttonTaskBORRAR.setEnabled(false);
            buttonTaskMODIFICAR.setEnabled(true);           
        }else{
            buttonTaskBORRAR.setEnabled(false);
            buttonTaskMODIFICAR.setEnabled(false);
        }        
         
    }

}
