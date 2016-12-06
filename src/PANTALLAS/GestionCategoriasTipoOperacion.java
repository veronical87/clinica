package PANTALLAS;

import CLASES.ClaseCategoriaTipoOperacion;
import CLASES.ClaseTipoOperaciones;
import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestionCategoriasTipoOperacion extends javax.swing.JDialog  {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    ClaseCategoriaTipoOperacion categoria=new ClaseCategoriaTipoOperacion();
    DefaultTableModel modelo;
    public GestionCategoriasTipoOperacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        buttonTaskAGREGAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskEDITAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskBORRAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskCERRAR = new org.edisoncor.gui.button.ButtonTask();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        PANEL = new javax.swing.JPanel();
        jComboBoxCriterioSeleccionado = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCriterioBuscado = new javax.swing.JTextField();
        buttonTaskBUSCAR = new org.edisoncor.gui.button.ButtonTask();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        buttonTaskAGREGAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskAGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/agregar-icono-5633-32.png"))); // NOI18N
        buttonTaskAGREGAR.setText("NUEVO");
        buttonTaskAGREGAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskAGREGAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskAGREGAR.setDefaultCapable(false);
        buttonTaskAGREGAR.setDescription("..");
        buttonTaskAGREGAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskAGREGARActionPerformed(evt);
            }
        });

        buttonTaskEDITAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskEDITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/editar-lapiz-escribir-icono-4987-32.png"))); // NOI18N
        buttonTaskEDITAR.setText("EDITAR");
        buttonTaskEDITAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskEDITAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskEDITAR.setDefaultCapable(false);
        buttonTaskEDITAR.setDescription("..");
        buttonTaskEDITAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskEDITARActionPerformed(evt);
            }
        });

        buttonTaskBORRAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskBORRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/gtk-eliminar-icono-8705-32.png"))); // NOI18N
        buttonTaskBORRAR.setText("BORRAR");
        buttonTaskBORRAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskBORRAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskBORRAR.setDefaultCapable(false);
        buttonTaskBORRAR.setDescription("..");
        buttonTaskBORRAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskBORRARActionPerformed(evt);
            }
        });

        buttonTaskCERRAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskCERRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/rescindir-rojo-icono-6989-32.png"))); // NOI18N
        buttonTaskCERRAR.setText("SALIR");
        buttonTaskCERRAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskCERRAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskCERRAR.setDefaultCapable(false);
        buttonTaskCERRAR.setDescription("..");
        buttonTaskCERRAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskCERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskCERRARActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(141, 141, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "LISTA DE CATEGORIAS DE TIPOS DE OPERACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria de Tipo de Operacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        PANEL.setBackground(new java.awt.Color(141, 141, 175));
        PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "BÚSQUEDAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jComboBoxCriterioSeleccionado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxCriterioSeleccionado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Categoria de Tipo de Operacion", "Todos" }));
        jComboBoxCriterioSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCriterioSeleccionadoActionPerformed(evt);
            }
        });
        jComboBoxCriterioSeleccionado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxCriterioSeleccionadoKeyPressed(evt);
            }
        });

        jLabel2.setText("Tipo de Búsqueda");

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
                .addGap(18, 18, 18)
                .addComponent(jComboBoxCriterioSeleccionado, 0, 1, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldCriterioBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PANELLayout.setVerticalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCriterioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCriterioBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTIÓN DE CATEGORIAS DE OPERACIONES");

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PANEL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskBORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonTaskCERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskBORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskCERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
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

    private void buttonTaskAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARActionPerformed
        dispose();
        AltaCategoriaTipoOperacion ap = new AltaCategoriaTipoOperacion(new javax.swing.JFrame(),true);
        ap.IDROL=rol;
        ap.show();
    }//GEN-LAST:event_buttonTaskAGREGARActionPerformed
int rol,filasel;
    private void buttonTaskEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskEDITARActionPerformed
        if (filasel != -1) {
            dispose();
            ModificarTipoOperacion mp= new ModificarTipoOperacion(new javax.swing.JFrame(),true);
            mp.IDROL=rol;
            mp.IDCategoria=IDCategoria;
            mp.nom.setText(nombre);
            mp.show();
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Ítem de la Lista", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskEDITARActionPerformed

    private void buttonTaskBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskBORRARActionPerformed
        if(filasel != -1){
            if(IDCategoria!=1 || IDCategoria!=2){
                int cantidad =categoria.EliminarCategoriaTipoOperacion(IDCategoria);
            if(cantidad != 0){
                JOptionPane.showMessageDialog(null,"La Categoria"+" "+nombre +" "+"Está siendo Utilizado,No Puede ser Eliminado", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                if(JOptionPane.showConfirmDialog(null,"¿Desea Eliminar la Categoria"+" "+ nombre+"?", "Consulta", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    JOptionPane.showMessageDialog(null,"La Categoria"+" "+nombre+" "+"Se Borró Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                    limpiarTabla(TABLA);
                    modelo = (DefaultTableModel) TABLA.getModel();
                    categoria.LlenarTabla(modelo);
                    this.buttonTaskAGREGAR.setEnabled(true);
                    this.buttonTaskBORRAR.setEnabled(false);
                    this.buttonTaskEDITAR.setEnabled(false);
                }else{
                    this.buttonTaskAGREGAR.setEnabled(true);
                    this.buttonTaskBORRAR.setEnabled(false);
                    this.buttonTaskEDITAR.setEnabled(false);
                }
            }
         }else{
            JOptionPane.showMessageDialog(null,"La Categoria Selecciona No Puede ser Borrada,Pertenece a las Operaciones mas Importantes", "Información", JOptionPane.INFORMATION_MESSAGE);
            }          
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Ítem de la Lista", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskBORRARActionPerformed

    private void buttonTaskCERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskCERRARActionPerformed
        dispose();
    }//GEN-LAST:event_buttonTaskCERRARActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        String id;
        filasel = TABLA.getSelectedRow();

        modelo = (javax.swing.table.DefaultTableModel) TABLA.getModel();
        id = (String) modelo.getValueAt(filasel, 0);
        ENLACE(rol);
        this.buttonTaskAGREGAR.setEnabled(false);
        buttonTaskEDITAR.setEnabled(true);
        buttonTaskBORRAR.setEnabled(true);
        BuscarDatosCategoria(id);
    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TABLAComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLAComponentMoved

    private void jComboBoxCriterioSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCriterioSeleccionadoActionPerformed
        String criterio = jComboBoxCriterioSeleccionado.getSelectedItem().toString();

        if(criterio.equals("Todos")){
            jTextFieldCriterioBuscado.setVisible(false);
            this.limpiarTabla(TABLA);
             modelo=(DefaultTableModel) TABLA.getModel();
            categoria.LlenarTabla(modelo);
        }else if(criterio.equals("Categoria de Tipo de Operacion")){
            jTextFieldCriterioBuscado.setVisible(true);
            this.jTextFieldCriterioBuscado.setText("");
            this.jTextFieldCriterioBuscado.requestFocus();
        }
    }//GEN-LAST:event_jComboBoxCriterioSeleccionadoActionPerformed

    private void jComboBoxCriterioSeleccionadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxCriterioSeleccionadoKeyPressed
//        String captura=this.jComboBoxCriterioSeleccionado.getSelectedItem().toString();
//        BuscarDatosxCATEGORIA(captura);
    }//GEN-LAST:event_jComboBoxCriterioSeleccionadoKeyPressed

    private void jTextFieldCriterioBuscadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCriterioBuscadoKeyTyped
        String buscar=this.jTextFieldCriterioBuscado.getText();
        BuscarDatosxCATEGORIA(buscar);
    }//GEN-LAST:event_jTextFieldCriterioBuscadoKeyTyped

    private void buttonTaskBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskBUSCARActionPerformed
        String criterio = jComboBoxCriterioSeleccionado.getSelectedItem().toString();
        String buscar=jTextFieldCriterioBuscado.getText();

        if(buscar.equals("")){
            JOptionPane.showMessageDialog(null,"Debe Ingresar el Dato a Buscar","Atención",JOptionPane.WARNING_MESSAGE);
        }else if(criterio.equals("Categoria de Tipo de Operacion")){
            BuscarDatosxCATEGORIA(buscar);
        }
    }//GEN-LAST:event_buttonTaskBUSCARActionPerformed

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
            java.util.logging.Logger.getLogger(GestionCategoriasTipoOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCategoriasTipoOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCategoriasTipoOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCategoriasTipoOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionCategoriasTipoOperacion dialog = new GestionCategoriasTipoOperacion(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PANEL;
    public javax.swing.JTable TABLA;
    public org.edisoncor.gui.button.ButtonTask buttonTaskAGREGAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskBORRAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskBUSCAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskCERRAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskEDITAR;
    public javax.swing.JComboBox jComboBoxCriterioSeleccionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField jTextFieldCriterioBuscado;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

int IDCategoria;String nombre;
private void BuscarDatosCategoria(String id) {
        cn=cm.Conectar();            
        String sSQL = "SELECT id,nombre FROM categoriatipo WHERE nombre LIKE '"+id+"%'";
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

             while(rs.next())
               {
                 IDCategoria=rs.getInt("id");
                 nombre=rs.getString("nombre");
               }
         
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void ENLACE(int idrol) {
       int MOD=0,ELI=0;
        try
        {
            cn=cm.Conectar();
            String sql="SELECT * FROM permisos WHERE idrol="+idrol;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next())
               {                                
                MOD=rs.getInt("MOD_CATEGORIATIPO");
                ELI=rs.getInt("ELIM_CATEGORIATIPO");               
               }                              
          }            
         catch (SQLException ex)
         {
            JOptionPane.showMessageDialog(null, ex);
        } 
        
        if(MOD!=0 & ELI!=0){
           buttonTaskEDITAR.setEnabled(true);
           buttonTaskBORRAR.setEnabled(true);
           buttonTaskAGREGAR.setEnabled(false);
        }else if(MOD!=0){
           buttonTaskEDITAR.setEnabled(true);
           buttonTaskBORRAR.setEnabled(false);
           buttonTaskAGREGAR.setEnabled(false);
        }else if(ELI!=0){
           buttonTaskEDITAR.setEnabled(false);
           buttonTaskBORRAR.setEnabled(true);
           buttonTaskAGREGAR.setEnabled(false);
        }else{
           buttonTaskEDITAR.setEnabled(false);
           buttonTaskBORRAR.setEnabled(false);
        }        
    }

    private void limpiarTabla(JTable tab) {
           while(tab.getRowCount()>0){//se recorren todas las filas
         ((javax.swing.table.DefaultTableModel) TABLA.getModel()).removeRow(0);
       }
    }

 private void BuscarDatosxCATEGORIA(String captura) {
    String[] titulos = {"Categoria de Tipo de Operacion"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    String sSQL = "";
    String[] registro = new String[1];
    sSQL = "SELECT nombre FROM categoriatipo WHERE nombre LIKE '"+captura+"%' ORDER BY nombre ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           registro[0]=rs.getString("nombre");
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
  
}