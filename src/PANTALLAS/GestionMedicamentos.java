
package PANTALLAS;
import CLASES.ClaseMedicamentos;
import Conexion.ConexionMySQL;
import CLASES.ClaseFichasMedicas;
import java.sql.*;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestionMedicamentos extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    Calendar Calendario = Calendar.getInstance(); 
    DefaultTableModel modelo;
    ClaseMedicamentos med=new  ClaseMedicamentos();
    public GestionMedicamentos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        PANEL_BUSQUEDA = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_CriterioSeleccionado = new javax.swing.JComboBox();
        jTextField_criteriodeBusqueda = new javax.swing.JTextField();
        buttonTaskBUSCAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskAGREGAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskEDITAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskBORRAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskSALIR = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTIÓN DE MEDICAMENTOS");

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "LISTA DE MEDICAMENTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro.", "Categoria", "Medicamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TABLAMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(TABLA);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        PANEL_BUSQUEDA.setBackground(new java.awt.Color(141, 141, 175));
        PANEL_BUSQUEDA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "BÚSQUEDAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel5.setText("Tipo de Búsqueda");

        jComboBox_CriterioSeleccionado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox_CriterioSeleccionado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Categoria", "Medicamento", "Todos" }));
        jComboBox_CriterioSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_CriterioSeleccionadoActionPerformed(evt);
            }
        });

        jTextField_criteriodeBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_criteriodeBusquedaActionPerformed(evt);
            }
        });
        jTextField_criteriodeBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_criteriodeBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_criteriodeBusquedaKeyTyped(evt);
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

        javax.swing.GroupLayout PANEL_BUSQUEDALayout = new javax.swing.GroupLayout(PANEL_BUSQUEDA);
        PANEL_BUSQUEDA.setLayout(PANEL_BUSQUEDALayout);
        PANEL_BUSQUEDALayout.setHorizontalGroup(
            PANEL_BUSQUEDALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_BUSQUEDALayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jComboBox_CriterioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_criteriodeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PANEL_BUSQUEDALayout.setVerticalGroup(
            PANEL_BUSQUEDALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_BUSQUEDALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(jComboBox_CriterioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField_criteriodeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
        buttonTaskBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskBORRARActionPerformed(evt);
            }
        });

        buttonTaskSALIR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskSALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/rescindir-rojo-icono-6989-32.png"))); // NOI18N
        buttonTaskSALIR.setText("SALIR");
        buttonTaskSALIR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskSALIR.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskSALIR.setDefaultCapable(false);
        buttonTaskSALIR.setDescription("..");
        buttonTaskSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskSALIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PANEL_BUSQUEDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskBORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PANEL_BUSQUEDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskBORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int IDUSUARIO,IDROL;
    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        String id;
        filasel = TABLA.getSelectedRow();
        modelo=(DefaultTableModel) TABLA.getModel();
        id = (String) modelo.getValueAt(filasel,0);
        BuscarDatosMedicamento(id);
        ENLACE(IDROL);
    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLAMouseEntered

    private void jComboBox_CriterioSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_CriterioSeleccionadoActionPerformed
        String valor=this.jComboBox_CriterioSeleccionado.getSelectedItem().toString();

        if(valor.equals("Todos")){
            jTextField_criteriodeBusqueda.setVisible(false);
            limpiarTabla(TABLA);
            modelo = (DefaultTableModel) TABLA.getModel();
            med.LlenarTablaPrincipal(modelo);
        }else{
            jTextField_criteriodeBusqueda.setVisible(true);
            jTextField_criteriodeBusqueda.requestFocus();
        }
    }//GEN-LAST:event_jComboBox_CriterioSeleccionadoActionPerformed

    private void jTextField_criteriodeBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_criteriodeBusquedaActionPerformed
        //     String valor=this.jComboBox_CriterioSeleccionado.getSelectedItem().toString();
        //       String captura=this.jTextField_criteriodeBusqueda.getText();
        //
        //       if(valor.equals("Seleccione")){
            //          JOptionPane.showMessageDialog(null,"Debe Seleccionar un Criterio","Atención",JOptionPane.WARNING_MESSAGE);
            //       }else{
            //          if(valor.equals("Usuario")){
                //              BuscarxCriterio1(captura);
                //         }else if(valor.equals("Rol")){
                //             Buscarol(captura);
                //        }
            //       }
    }//GEN-LAST:event_jTextField_criteriodeBusquedaActionPerformed

    private void jTextField_criteriodeBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_criteriodeBusquedaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_criteriodeBusquedaKeyReleased

    private void jTextField_criteriodeBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_criteriodeBusquedaKeyTyped
        String valor=this.jComboBox_CriterioSeleccionado.getSelectedItem().toString();
        String captura=this.jTextField_criteriodeBusqueda.getText();

        if(valor.equals("Medicamento")){
            BuscarDatosxMEDICAMENTO(captura);
        }else if(valor.equals("Categoria")){
            BuscarDatosxCATEGORIA(captura);
        }
    }//GEN-LAST:event_jTextField_criteriodeBusquedaKeyTyped

    private void buttonTaskBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskBUSCARActionPerformed
        String valor=this.jComboBox_CriterioSeleccionado.getSelectedItem().toString();
        String captura=this.jTextField_criteriodeBusqueda.getText();

        if(captura.equals("")){
            jTextField_criteriodeBusqueda.requestFocus();
            JOptionPane.showMessageDialog(null,"Debe Ingresar el Dato a Buscar","Atención",JOptionPane.WARNING_MESSAGE);
        }else{
            if(valor.equals("Medicamento")){
              BuscarDatosxMEDICAMENTO(captura);
           }else if(valor.equals("Categoria")){
              BuscarDatosxCATEGORIA(captura);
           }
        }
    }//GEN-LAST:event_buttonTaskBUSCARActionPerformed

    private void buttonTaskAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARActionPerformed
        dispose();
        AltaMedicamento au = new AltaMedicamento(new javax.swing.JFrame(), true);
        au.IDROL = IDROL;
        au.IDUSUARIO= IDUSUARIO;
        au.show();
    }//GEN-LAST:event_buttonTaskAGREGARActionPerformed
int filasel;
    private void buttonTaskEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskEDITARActionPerformed
        if (filasel != -1) {
            dispose();
            ModificarMedicamento mu = new ModificarMedicamento(new javax.swing.JFrame(), true);
            mu.idusuario = IDUSUARIO;
            mu.idrol = IDROL;
            mu.idMedicamento=idMedicamento;      
            mu.categoriaAnterior=categoria;
            mu.medicamentoAnterior=medicamento;
            mu.cantiactualAnterior=cantactual;
            mu.cantiminimoAnterior=cantminimo;
            mu.banderacategoria=false;
            mu.jComboBoxCATEGORIA.getModel().setSelectedItem(categoria);
            
            mu.jComboBoxTipoOperacion.getModel().setSelectedItem(tipoOperacion);
            
            mu.JTextFieldNombre.setText(medicamento);
            mu.jTextAreaACCION.setText(accion);
            mu.jTextAreaCOMPOSICION.setText(composicion);
            mu.jTextAreaDESCRIPCIN.setText(descripcion);
            mu.jTextFieldACTUAL.setText(String.valueOf(cantactual));
            mu.jTextFieldMINIMO.setText(String.valueOf(cantminimo));
            
            if(cantidad==2){
              mu.jRadioButtonAMBOS.getModel().setSelected(true);
              mu.jRadioButtonEspecieCANINA.getModel().setSelected(false);
              mu.jRadioButtonEspecieFELINA.getModel().setSelected(false);
            }else if(IDEspecie==1){
              mu.jRadioButtonEspecieCANINA.getModel().setSelected(true);
              mu.jRadioButtonAMBOS.getModel().setSelected(false);
              mu.jRadioButtonEspecieFELINA.getModel().setSelected(false);
            }else if(IDEspecie==2){
                mu.jRadioButtonEspecieFELINA.getModel().setSelected(true);
                mu.jRadioButtonEspecieCANINA.getModel().setSelected(false);
                mu.jRadioButtonAMBOS.getModel().setSelected(false); 
            }
            mu.show();
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Ítem de la Lista", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskEDITARActionPerformed

    private void buttonTaskBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskBORRARActionPerformed
        BuscarUsuario();
        fecha();
        if(filasel!=-1){            
            int resultado=med.VerificarMedicamentoxOperacion(idMedicamento);        
            if(resultado !=0){
                
                int salida=med.EliminarMedicamento(idMedicamento);
                med.InsertarDatosAuditoria(fechaActual,hor,usu,"MEDICAMENTOS","BAJA"," "," ");
                JOptionPane.showMessageDialog(null,"El Medicamento Solicitado esta Siendo Utilizado, No Puede ser Borrado","Información",JOptionPane.INFORMATION_MESSAGE);
                this.buttonTaskAGREGAR.setEnabled(true);
                this.buttonTaskEDITAR.setEnabled(false);
                this.buttonTaskBORRAR.setEnabled(false);
            }else{
                if(JOptionPane.showConfirmDialog(null,"¿Desea Dar de Baja al Medicamento"+" "+medicamento+" "+"?","Consulta",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

                    JOptionPane.showMessageDialog(null,"El Medicamento"+" "+medicamento+" "+"Se Borró Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
                    limpiarTabla(TABLA);
                    modelo = (DefaultTableModel) TABLA.getModel();
                    med.LlenarTablaPrincipal(modelo);
                    this.buttonTaskAGREGAR.setEnabled(true);
                    this.buttonTaskEDITAR.setEnabled(false);
                    this.buttonTaskBORRAR.setEnabled(false);
                }else{
                    this.buttonTaskAGREGAR.setEnabled(true);
                    this.buttonTaskEDITAR.setEnabled(false);
                    this.buttonTaskBORRAR.setEnabled(false);
                }

            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Ítem de la Lista", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskBORRARActionPerformed

    private void buttonTaskSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskSALIRActionPerformed
        dispose();
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
            java.util.logging.Logger.getLogger(GestionMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
               GestionMedicamentos dialog = new GestionMedicamentos(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PANEL_BUSQUEDA;
    public javax.swing.JTable TABLA;
    public org.edisoncor.gui.button.ButtonTask buttonTaskAGREGAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskBORRAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskBUSCAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskEDITAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskSALIR;
    public javax.swing.JComboBox jComboBox_CriterioSeleccionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField_criteriodeBusqueda;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

   private void limpiarTabla(JTable TABLA) {
          while(TABLA.getRowCount()>0){//se recorren todas las filas
         ((DefaultTableModel) TABLA.getModel()).removeRow(0);
       }
    }
  
    String medicamento,categoria,composicion,accion,descripcion,tipoOperacion;int cantidad,IDEspecie,idMedicamento,cantminimo,cantactual;   
    private void BuscarDatosMedicamento(String id) {
        String sSQL = "";        
        cn=cm.Conectar();
        sSQL = "SELECT COUNT(medicamentoxespecieyoperacion.idmedicamento) AS cantidad,medicamentos.id,medicamentoxespecieyoperacion.idespecie,tipooperacion.nombre,categoriamedicamento.nombre,medicamentos.nombre,descripcion,composicion,accion,cantminima,cantactual FROM especies INNER JOIN medicamentoxespecieyoperacion ON especies.id=medicamentoxespecieyoperacion.idespecie INNER JOIN tipooperacion ON tipooperacion.id=medicamentoxespecieyoperacion.idtipoOp INNER JOIN  medicamentos ON medicamentoxespecieyoperacion.idmedicamento=medicamentos.id INNER JOIN categoriamedicamento ON categoriamedicamento.id=medicamentos.idcategoria WHERE medicamentos.id  LIKE '"+id+"%'";
        
         try
            {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while(rs.next())
            {
                cantidad=rs.getInt("cantidad");
                IDEspecie=rs.getInt("medicamentoxespecieyoperacion.idespecie"); 
                idMedicamento=rs.getInt("medicamentos.id"); 
                tipoOperacion=rs.getString("tipooperacion.nombre");
                medicamento=rs.getString("medicamentos.nombre");
                categoria=rs.getString("categoriamedicamento.nombre"); 
                descripcion=rs.getString("descripcion"); 
                accion=rs.getString("accion"); 
                composicion=rs.getString("composicion"); 
                cantactual=rs.getInt("cantactual");  
                cantminimo=rs.getInt("cantminima"); 
                
               }        
            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

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
        sSQL = "SELECT id,usuario FROM usuarios WHERE id="+IDUSUARIO;
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

 private void ENLACE(int IDROL) {
   int MOD_MEDICAMENTO = 0, ELI_MEDICAMENTO = 0;         
   try {
        cn = cm.Conectar();
        String sql = "SELECT * FROM permisos WHERE idrol="+IDROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            MOD_MEDICAMENTO = rs.getInt("MOD_MEDICAMENTO");
            ELI_MEDICAMENTO = rs.getInt("ELIM_MEDICAMENTO");
        }

     }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
       }               

        if (MOD_MEDICAMENTO != 0 & ELI_MEDICAMENTO != 0) {
             buttonTaskEDITAR.setEnabled(true);  
             buttonTaskBORRAR.setEnabled(true);  
             buttonTaskAGREGAR.setEnabled(false);
        }else if (ELI_MEDICAMENTO != 0) {
            buttonTaskBORRAR.setEnabled(true); 
            buttonTaskEDITAR.setEnabled(false);  
        }else if(MOD_MEDICAMENTO != 0){
            buttonTaskBORRAR.setEnabled(false);
            buttonTaskEDITAR.setEnabled(true);           
        }else{
            buttonTaskBORRAR.setEnabled(false);
            buttonTaskEDITAR.setEnabled(false);
        }        
    }

 private void BuscarDatosxMEDICAMENTO(String captura) {
    String[] titulos = {"Nro.","Categoria","Medicamento"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    String sSQL = "";
    String[] registro = new String[3];
    sSQL = "SELECT medicamentos.id,categoriamedicamento.nombre,medicamentos.nombre FROM medicamentos INNER JOIN categoriamedicamento ON categoriamedicamento.id=medicamentos.idcategoria WHERE medicamentos.nombre LIKE '"+captura+"%'";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           registro[0]=rs.getString("medicamentos.id");
           registro[1]=rs.getString("categoriamedicamento.nombre");
           registro[2]=rs.getString("medicamentos.nombre");
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

 private void BuscarDatosxCATEGORIA(String captura) {
    String[] titulos = {"Nro.","Categoria","Medicamento"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    String sSQL = "";
    String[] registro = new String[3];
    sSQL = "SELECT medicamentos.id,categoriamedicamento.nombre,medicamentos.nombre FROM medicamentos INNER JOIN categoriamedicamento ON categoriamedicamento.id=medicamentos.idcategoria WHERE categoriamedicamento.nombre LIKE '"+captura+"%'";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           registro[0]=rs.getString("medicamentos.id");
           registro[1]=rs.getString("categoriamedicamento.nombre");
           registro[2]=rs.getString("medicamentos.nombre");
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
