package PANTALLAS;

import CLASES.ClaseFichasMedicas;
import CLASES.RendererSituacion;
import Conexion.ConexionMySQL;
import java.awt.Dimension;
//import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
//import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GestionDatosGrales extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    ClaseFichasMedicas ficha=new ClaseFichasMedicas();
    DefaultTableModel modelo,modelo2;
    private java.util.Date desde,hasta;
    GregorianCalendar hoy = new GregorianCalendar();
    public GestionDatosGrales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);       
        initComponents();
        setLocationRelativeTo(null);
        hoy.add(Calendar.DAY_OF_YEAR, 0);
        jDateChooser_Desde.setMaxSelectableDate(hoy.getTime());
        this.jDateChooser_Hasta.setMaxSelectableDate(hoy.getTime()); 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        buttonTaskAGREGAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskMODIFICAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskELIMINAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskCERRAR = new org.edisoncor.gui.button.ButtonTask();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        PANEL = new javax.swing.JPanel();
        JComboBoxCriterioSeleccionado = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCriterioBuscado = new javax.swing.JTextField();
        buttonTaskBUSCAR = new org.edisoncor.gui.button.ButtonTask();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser_Desde = new com.toedter.calendar.JDateChooser();
        jDateChooser_Hasta = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestion de Datos Grales.");

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRectTranslucido1.setPreferredSize(new java.awt.Dimension(566, 623));

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

        buttonTaskMODIFICAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskMODIFICAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/editar-lapiz-escribir-icono-4987-32.png"))); // NOI18N
        buttonTaskMODIFICAR.setText("EDITAR");
        buttonTaskMODIFICAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskMODIFICAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskMODIFICAR.setDefaultCapable(false);
        buttonTaskMODIFICAR.setDescription("..");
        buttonTaskMODIFICAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskMODIFICARActionPerformed(evt);
            }
        });

        buttonTaskELIMINAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskELIMINAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/gtk-eliminar-icono-8705-32.png"))); // NOI18N
        buttonTaskELIMINAR.setText("BORRAR");
        buttonTaskELIMINAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskELIMINAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskELIMINAR.setDefaultCapable(false);
        buttonTaskELIMINAR.setDescription("..");
        buttonTaskELIMINAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskELIMINARActionPerformed(evt);
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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "LISTA DE DATOS GENERALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro.", "Fecha", "Dueño", "Mascota", "Especie", "Historial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLA.setIntercellSpacing(new java.awt.Dimension(2, 1));
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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        PANEL.setBackground(new java.awt.Color(141, 141, 175));
        PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "BÚSQUEDAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        JComboBoxCriterioSeleccionado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JComboBoxCriterioSeleccionado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Criterio", "Apellido del Cliente", "Mascota", "Especie", "Estado Historial", "Todos" }));
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
        buttonTaskBUSCAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskBUSCARActionPerformed(evt);
            }
        });

        jLabel3.setText("Desde");

        jLabel4.setText("Hasta");

        jDateChooser_Desde.setFocusable(false);
        jDateChooser_Desde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_DesdeMouseClicked(evt);
            }
        });

        jDateChooser_Hasta.setFocusable(false);
        jDateChooser_Hasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_HastaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PANELLayout = new javax.swing.GroupLayout(PANEL);
        PANEL.setLayout(PANELLayout);
        PANELLayout.setHorizontalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANELLayout.createSequentialGroup()
                        .addComponent(jDateChooser_Desde, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(JComboBoxCriterioSeleccionado, 0, 186, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCriterioBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PANELLayout.setVerticalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANELLayout.createSequentialGroup()
                        .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JComboBoxCriterioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCriterioBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jDateChooser_Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))))
                    .addGroup(PANELLayout.createSequentialGroup()
                        .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTIÓN DE DATOS GENERALES");

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskCERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskCERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int IDROL,idusuario,filasel;
    private void buttonTaskAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARActionPerformed
        AltaFichaMedica ap = new AltaFichaMedica(new javax.swing.JFrame(), true);
        ap.IDROL=IDROL;
        ap.IDUSUARIO=idusuario;
        ap.bandera=true;
       
        dispose();
        ap.show();
    }//GEN-LAST:event_buttonTaskAGREGARActionPerformed

    private void buttonTaskMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskMODIFICARActionPerformed
       if (filasel != -1) {           
            ModificarFicha mp = new ModificarFicha(new javax.swing.JFrame(), true);
            mp.IDROL = IDROL;
            mp.IDUSUARIO= idusuario;
            mp.idpersona=idPersona;
            mp.situacionpeso=situacionpeso;
            
            mp.idPropietario=idPropietario;
            modelo2=(DefaultTableModel) mp.TABLA.getModel();
            ficha.LlenarTablaDatosMascotas(modelo2, idPropietario);
            mp.jTextField_Apellido.setText(apellido);
            mp.apellidoSelec=apellido;
            mp.jTextField_Nombre.setText(String.valueOf(nombre));
            mp.nombreSelec=nombre;
            mp.tipotelefonoSelec=tipotelefono;
            mp.nrotelSelec=numerotel;
            mp.correoSelec=correo;
            mp.domicilioSelec=domicilio;
            mp.banderaProvincia=false;
            mp.banderaLocalidad=false;
            mp.banderaRaza=false;
            mp.DNI=nroDNI;
            mp.TextFieldNroDocumento.setText(String.valueOf(nroDNI));
            mp.jComboBoxProvincias.getModel().setSelectedItem(provincia);
            mp.jComboBoxLocalidades.getModel().setSelectedItem(localidad);
            mp.jComboBoxTipotelefono.getModel().setSelectedItem(tipotelefono);
            mp.jTextFieldCodigoArea.setText(String.valueOf(codigo));
            mp.jTextFieldNroTelefono.setText(String.valueOf(numerotel));
            mp.jTextFieldDomicilio.setText(domicilio);
            mp.jTextFieldcorreo.setText(correo);
            mp.idFicha= idFicha;
//            BuscarUsuario(); 
//            mp.jLabelVETERINARIO.setText(usu);
            dispose();
            mp.show();
        } else {
            JOptionPane.showMessageDialog(null,"Debe Seleccionar un Ítem de la Lista","Información",JOptionPane.INFORMATION_MESSAGE);
        }      
    }//GEN-LAST:event_buttonTaskMODIFICARActionPerformed

    private void buttonTaskELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskELIMINARActionPerformed
     if(filasel != -1){
            if(JOptionPane.showConfirmDialog(null,"Al Borrar la Ficha de la Mascota"+" "+mascota+" "+"se Perderán los Datos de las Operaciones Involucradas \n¿Desea Realizar esta Operación?","Consulta",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                   ficha.BajaFicha(idFicha);   
                 
                    JOptionPane.showMessageDialog(null,"Se Borró la Ficha de la Mascota"+" "+mascota+" "+",Correctamente","Información", JOptionPane.INFORMATION_MESSAGE);
                    limpiarTabla(TABLA);
                    modelo = (DefaultTableModel) TABLA.getModel();
                    LlenarTablaFichas();
                    buttonTaskAGREGAR.setEnabled(true);
                    buttonTaskMODIFICAR.setEnabled(false);
                    buttonTaskELIMINAR.setEnabled(false);
                }else{
                    buttonTaskAGREGAR.setEnabled(true);
                    buttonTaskMODIFICAR.setEnabled(false);
                    buttonTaskELIMINAR.setEnabled(false);
                  }            
        }else{
            JOptionPane.showMessageDialog(null,"Debe Seleccionar un Ítem de la Lista","Información",JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_buttonTaskELIMINARActionPerformed

    private void buttonTaskCERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskCERRARActionPerformed
        dispose();
    }//GEN-LAST:event_buttonTaskCERRARActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        String id;
        filasel = TABLA.getSelectedRow();
        ENLACE(IDROL);
        modelo = (javax.swing.table.DefaultTableModel) TABLA.getModel();
        id = (String) modelo.getValueAt(filasel, 0);
        this.buttonTaskAGREGAR.setEnabled(false);
        this.buttonTaskMODIFICAR.setEnabled(true);
        this.buttonTaskELIMINAR.setEnabled(true);
        BuscarDatosSeleccionado(id); 
    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TABLAComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLAComponentMoved

    private void JComboBoxCriterioSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxCriterioSeleccionadoActionPerformed
        String criterio=this.JComboBoxCriterioSeleccionado.getSelectedItem().toString();
       
        if(criterio.equals("Todos")){
            jTextFieldCriterioBuscado.setVisible(false);
            jDateChooser_Desde.setEnabled(false);
            jDateChooser_Hasta.setEnabled(false);
            limpiarTabla(TABLA);
            modelo=(DefaultTableModel) TABLA.getModel();
            LlenarTablaFichas();
        }else{
            jDateChooser_Desde.setEnabled(true);
            jDateChooser_Hasta.setEnabled(true);
            jTextFieldCriterioBuscado.setVisible(true);
            jTextFieldCriterioBuscado.setText("");
            jTextFieldCriterioBuscado.requestFocus();}
    }//GEN-LAST:event_JComboBoxCriterioSeleccionadoActionPerformed

    private void JComboBoxCriterioSeleccionadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JComboBoxCriterioSeleccionadoKeyPressed

    }//GEN-LAST:event_JComboBoxCriterioSeleccionadoKeyPressed

    private void jTextFieldCriterioBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCriterioBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCriterioBuscadoActionPerformed

    private void jTextFieldCriterioBuscadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCriterioBuscadoKeyTyped
    String criterio = JComboBoxCriterioSeleccionado.getSelectedItem().toString();
    String buscar = this.jTextFieldCriterioBuscado.getText();
    
    if((jDateChooser_Desde.getDate()==null & jDateChooser_Hasta.getDate()==null)){
            if(criterio.equals("Seleccionar Criterio")) {
               JOptionPane.showMessageDialog(null,"Debe Seleccionar un Criterio de Búsqueda","Información",JOptionPane.INFORMATION_MESSAGE);
            }else if(criterio.equals("Mascota")) {
                MostrarDatosxMascota(buscar);
            } else if (criterio.equals("Especie")) {
                MostrarDatosxEspecie(buscar);
            }else if (criterio.equals("Estado Historial")) {
                MostrarDatosxSituacion(buscar);
            }else if (criterio.equals("Apellido del Cliente")) {
                MostrarDatosxDueño(buscar);
            }
    }else{
        String formato = "yyyy/MM/dd";
        desde=new Date( this.jDateChooser_Desde.getDate().getYear(), jDateChooser_Desde.getDate().getMonth(),jDateChooser_Desde.getDate().getDate() );
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String d = sdf.format(desde);

        hasta=new Date( jDateChooser_Hasta.getDate().getYear(), jDateChooser_Hasta.getDate().getMonth(),jDateChooser_Hasta.getDate().getDate() );
        String h = sdf.format(hasta);
           
        if(criterio.equals("Seleccionar Criterio")) {
            MostrarDatosxFechas(d,h);
        }else if(criterio.equals("Mascota")){
            MostrarDatosMascotaxFechas(d,h,buscar);
        }else if(criterio.equals("Especie")){
            MostrarDatosEspeciexFechas(d,h,buscar);
        }else if(criterio.equals("Situacion")){
            MostrarDatosSituacionxFechas(d,h,buscar);
        }else if(criterio.equals("Dueño")){
            MostrarDatosApellidoxFechas(d,h,buscar);
        }
    }
    }//GEN-LAST:event_jTextFieldCriterioBuscadoKeyTyped

    private void buttonTaskBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskBUSCARActionPerformed
    String criterio = JComboBoxCriterioSeleccionado.getSelectedItem().toString();
    String buscar = this.jTextFieldCriterioBuscado.getText();
    
    if((jDateChooser_Desde.getDate()==null & jDateChooser_Hasta.getDate()==null)){
            if(criterio.equals("Seleccionar Criterio")) {
               JOptionPane.showMessageDialog(null,"Debe Seleccionar un Criterio de Búsqueda","Información",JOptionPane.INFORMATION_MESSAGE);
            }else if(criterio.equals("Mascota")) {
                MostrarDatosxMascota(buscar);
            } else if (criterio.equals("Especie")) {
                MostrarDatosxEspecie(buscar);
            }else if (criterio.equals("Estado Historial")) {
                MostrarDatosxSituacion(buscar);
            }else if (criterio.equals("Apellido del Cliente")) {
                MostrarDatosxDueño(buscar);
            }
    }else{
        String formato = "yyyy/MM/dd";
        desde=new Date( this.jDateChooser_Desde.getDate().getYear(), jDateChooser_Desde.getDate().getMonth(),jDateChooser_Desde.getDate().getDate() );
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String d = sdf.format(desde);

        hasta=new Date( jDateChooser_Hasta.getDate().getYear(), jDateChooser_Hasta.getDate().getMonth(),jDateChooser_Hasta.getDate().getDate() );
        String h = sdf.format(hasta);
           
        if(criterio.equals("Seleccionar Criterio")) {
            MostrarDatosxFechas(d,h);
        }else if(criterio.equals("Mascota")){
            MostrarDatosMascotaxFechas(d,h,buscar);
        }else if(criterio.equals("Especie")){
            MostrarDatosEspeciexFechas(d,h,buscar);
        }else if(criterio.equals("Raza")){
            MostrarDatosSituacionxFechas(d,h,buscar);
        }else if(criterio.equals("Apellido")){
            MostrarDatosApellidoxFechas(d,h,buscar);
        }else if(criterio.equals("Estado Historial")){
            MostrarDatosApellidoxSituacion(d,h,buscar);
        }
    }
    }//GEN-LAST:event_buttonTaskBUSCARActionPerformed

    private void jDateChooser_DesdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_DesdeMouseClicked
        // TODO add your handling code here:
        GregorianCalendar dia = new GregorianCalendar();
        dia.setTime(desde);
        dia.add(Calendar.DAY_OF_YEAR, 1);
        jDateChooser_Desde.setDateFormatString("dd/MM/yyyy");
        jDateChooser_Desde.setMinSelectableDate(dia.getTime());
    }//GEN-LAST:event_jDateChooser_DesdeMouseClicked

    private void jDateChooser_HastaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_HastaMouseClicked
        GregorianCalendar dia = new GregorianCalendar();
        dia.setTime(hasta);
        dia.add(Calendar.DAY_OF_YEAR, 1);
        jDateChooser_Hasta.setMinSelectableDate(dia.getTime());
    }//GEN-LAST:event_jDateChooser_HastaMouseClicked

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
            java.util.logging.Logger.getLogger(GestionDatosGrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDatosGrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDatosGrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDatosGrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                GestionDatosGrales dialog = new GestionDatosGrales(new javax.swing.JFrame(), true);
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
    public org.edisoncor.gui.button.ButtonTask buttonTaskBUSCAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskCERRAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskELIMINAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskMODIFICAR;
    public com.toedter.calendar.JDateChooser jDateChooser_Desde;
    public com.toedter.calendar.JDateChooser jDateChooser_Hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField jTextFieldCriterioBuscado;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

    
private void limpiarTabla(JTable tab) {
         while(tab.getRowCount()>0){//se recorren todas las filas
         ((javax.swing.table.DefaultTableModel) tab.getModel()).removeRow(0);
       }
    }


String provincia,localidad,domicilio,tipotelefono,apellido,nombre,correo,mascota,situacionpeso;
int idFicha,idPropietario,idPersona,numerotel,codigo,nroDNI;java.sql.Date fechanac;
private void BuscarDatosSeleccionado(String id) {
        cn=cm.Conectar();                
        String sSQL = "SELECT fichamedica.id,mascota,situacionpeso,personas.id,fichamedica.idpropietario,provincia.nombre,localidades.nombre,codigo,domicilio,tipotelefono.nombre,numerotelefono,propietarios.apellido,dni,email,propietarios.nombre,coma FROM provincia INNER JOIN localidades ON provincia.id=localidades.idprovincia INNER JOIN personas ON localidades.id=personas.idlocalidad INNER JOIN tipotelefono ON tipotelefono.id=personas.idtipotelefono INNER JOIN propietarios ON personas.id=propietarios.idpersona INNER JOIN fichamedica ON propietarios.id=fichamedica.idpropietario WHERE fichamedica.id="+id;
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
                idFicha=rs.getInt("fichamedica.id");
                idPersona=rs.getInt("personas.id");
                mascota=rs.getString("mascota"); 
                idPropietario=rs.getInt("fichamedica.idpropietario");
                provincia=rs.getString("provincia.nombre");   
                localidad=rs.getString("localidades.nombre");
                codigo=rs.getInt("codigo");
                nroDNI=rs.getInt("dni");
                correo=rs.getString("email");
                domicilio=rs.getString("domicilio");
                tipotelefono=rs.getString("tipotelefono.nombre");
                numerotel=rs.getInt("numerotelefono"); 
                apellido=rs.getString("apellido");
                nombre=rs.getString("propietarios.nombre");
                situacionpeso=rs.getString("situacionpeso");
               }
            
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

private void ENLACE(int IDROL) {
int MOD=0,ELI=0;
  try
    {
    cn=cm.Conectar();
    String sql="SELECT * FROM permisos WHERE idrol="+IDROL;
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery(sql);

    while(rs.next()){
            MOD=rs.getInt("MOD_FICHAMEDICA");
            ELI=rs.getInt("ELIM_FICHAMEDICA");
        }                              
   }catch (SQLException ex){
          JOptionPane.showMessageDialog(null, ex);
        }
        
        if(MOD!=0 & ELI!=0){
          buttonTaskMODIFICAR.setEnabled(false);
          buttonTaskELIMINAR.setEnabled(false);
          buttonTaskAGREGAR.setEnabled(false);
          TABLA.setEnabled(true);
        }else if(MOD!=0){
          buttonTaskMODIFICAR.setEnabled(false);
          buttonTaskELIMINAR.setEnabled(false);
          buttonTaskAGREGAR.setEnabled(false);
          TABLA.setEnabled(true);
        }else if(ELI!=0){
          buttonTaskMODIFICAR.setEnabled(false);
          buttonTaskELIMINAR.setEnabled(false);
          buttonTaskAGREGAR.setEnabled(false);
          TABLA.setEnabled(true);
        }else {
          buttonTaskMODIFICAR.setEnabled(false);
          buttonTaskELIMINAR.setEnabled(false);
          TABLA.setEnabled(false);
        }   
    }

   public void LlenarTablaFichas(){
      String[] titulos = {"Nro.","Fecha","Dueño","Mascota","Especie","Historial"};
      modelo = new javax.swing.table.DefaultTableModel(null,titulos);
      cn=cm.Conectar();
      try{
        String sSQL="SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,fichamedica.id,CONCAT(propietarios.apellido,coma,propietarios.nombre) AS dueño,fichamedica.mascota,especies.nombre,razas.nombre,situacion FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON PELAJEXRAZA.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id WHERE fichamedica.idestado=1 ORDER BY fichamedica.id ASC";
        String registro[]=new String[6];
        RendererSituacion clase=new RendererSituacion(5);
        TABLA.setDefaultRenderer(Object.class, clase);
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("fichamedica.id"); 
            registro[1]=rs.getString("fecha");         
            registro[2]=rs.getString("dueño");
            registro[3]=rs.getString("mascota");
            registro[4]=rs.getString("especies.nombre");
            registro[5]=rs.getString("situacion");
            modelo.addRow(registro);
            limpiarTabla(TABLA);
        }
          TABLA.setModel(modelo);  
          FORMATO_TABLA(TABLA);
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }

    private void MostrarDatosxMascota(String buscar) {
        String[] titulos = {"Nro.","Fecha","Dueño","Mascota","Especie","Historial"};
        modelo = new javax.swing.table.DefaultTableModel(null,titulos);
        cn=cm.Conectar();
                
        String sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,fichamedica.id,CONCAT(propietarios.apellido,coma,propietarios.nombre) AS dueño,fichamedica.mascota,especies.nombre,razas.nombre,situacion FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON PELAJEXRAZA.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id  WHERE  fichamedica.idestado=1 AND fichamedica.mascota LIKE '"+buscar+"%' ORDER BY fichamedica.id ASC";
        String registro[]=new String[6];
        RendererSituacion clase=new RendererSituacion(5);
        TABLA.setDefaultRenderer(Object.class, clase);
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
                registro[0]=rs.getString("fichamedica.id"); 
                registro[1]=rs.getString("fecha");         
                registro[2]=rs.getString("dueño");
                registro[3]=rs.getString("mascota");
                registro[4]=rs.getString("especies.nombre");
                registro[5]=rs.getString("situacion");
               modelo.addRow(registro);
               limpiarTabla(TABLA);
               }            

             TABLA.setModel(modelo);  
             FORMATO_TABLA(TABLA);
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    
    private void MostrarDatosxEspecie(String buscar) {
        String[] titulos = {"Nro.","Fecha","Dueño","Mascota","Especie","Historial"};
        modelo = new javax.swing.table.DefaultTableModel(null,titulos);
        cn=cm.Conectar();
               
        String sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,fichamedica.id,CONCAT(propietarios.apellido,coma,propietarios.nombre) AS dueño,fichamedica.mascota,especies.nombre,razas.nombre,situacion FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON PELAJEXRAZA.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id  WHERE fichamedica.idestado=1 AND especies.nombre LIKE '"+buscar+"%' ORDER BY fichamedica.id ASC";
        String registro[]=new String[6];
        RendererSituacion clase=new RendererSituacion(5);
        TABLA.setDefaultRenderer(Object.class, clase);
        
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               { 
                registro[0]=rs.getString("fichamedica.id"); 
                registro[1]=rs.getString("fecha");         
                registro[2]=rs.getString("dueño");
                registro[3]=rs.getString("mascota");
                registro[4]=rs.getString("especies.nombre");
                registro[5]=rs.getString("situacion");
                modelo.addRow(registro);
               limpiarTabla(TABLA);
               }            

             TABLA.setModel(modelo);  
             FORMATO_TABLA(TABLA);
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void MostrarDatosxSituacion(String buscar) {
        String[] titulos = {"Nro.","Fecha","Dueño","Mascota","Especie","Historial"};
        modelo = new javax.swing.table.DefaultTableModel(null,titulos);
        cn=cm.Conectar();
              
        String sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,fichamedica.id,CONCAT(propietarios.apellido,coma,propietarios.nombre) AS dueño,fichamedica.mascota,especies.nombre,razas.nombre,situacion FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON PELAJEXRAZA.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id  WHERE fichamedica.idestado=1 AND situacion LIKE '"+buscar+"%' ORDER BY fichamedica.id ASC";
        String registro[]=new String[6];
        RendererSituacion clase=new RendererSituacion(5);
        TABLA.setDefaultRenderer(Object.class, clase);
        
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
                registro[0]=rs.getString("fichamedica.id"); 
                registro[1]=rs.getString("fecha");         
                registro[2]=rs.getString("dueño");
                registro[3]=rs.getString("mascota");
                registro[4]=rs.getString("especies.nombre");
                registro[5]=rs.getString("situacion");
                modelo.addRow(registro);
               limpiarTabla(TABLA);
               }            

             TABLA.setModel(modelo);  
             FORMATO_TABLA(TABLA);
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void MostrarDatosxDueño(String buscar) {
        String[] titulos = {"Nro.","Fecha","Dueño","Mascota","Especie","Historial"};
        modelo = new javax.swing.table.DefaultTableModel(null,titulos);
        cn=cm.Conectar();
             
        String sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,CONCAT(propietarios.apellido,coma,propietarios.nombre) AS dueño,fichamedica.mascota,fichamedica.id,especies.nombre,razas.nombre,situacion FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON PELAJEXRAZA.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id WHERE fichamedica.idestado=1 AND propietarios.apellido LIKE '"+buscar+"%' ORDER BY fichamedica.id ASC";
        String registro[]=new String[6];
        
        RendererSituacion clase=new RendererSituacion(5);
        TABLA.setDefaultRenderer(Object.class, clase);
        try
           {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
               {
                registro[0]=rs.getString("fichamedica.id"); 
                registro[1]=rs.getString("fecha");         
                registro[2]=rs.getString("dueño");
                registro[3]=rs.getString("mascota");
                registro[4]=rs.getString("especies.nombre");
                registro[5]=rs.getString("situacion");
                modelo.addRow(registro);
               limpiarTabla(TABLA);
               }            

             TABLA.setModel(modelo);  
             FORMATO_TABLA(TABLA);
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }
    
String usu;
private void BuscarUsuario(){
    cn=cm.Conectar();

    String sSQL = "SELECT usuario FROM usuarios WHERE id="+idusuario;
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

 private void MostrarDatosxFechas(String d, String h) {
   String[] titulos = {"Nro.","Fecha","Dueño","Mascota","Especie","Historial"};
    modelo = new javax.swing.table.DefaultTableModel(null,titulos);
    cn=cm.Conectar();

    String sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,fichamedica.id,CONCAT(propietarios.apellido,coma,propietarios.nombre) AS dueño,fichamedica.mascota,especies.nombre,razas.nombre,situacion FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON PELAJEXRAZA.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id WHERE fichamedica.idestado=1 AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%'  ORDER BY fichamedica.id ASC";
    String registro[]=new String[6];
    
    RendererSituacion clase=new RendererSituacion(5);
    TABLA.setDefaultRenderer(Object.class, clase);
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        while(rs.next())
               {
                registro[0]=rs.getString("fichamedica.id"); 
                registro[1]=rs.getString("fecha");         
                registro[2]=rs.getString("dueño");
                registro[3]=rs.getString("mascota");
                registro[4]=rs.getString("especies.nombre");
                registro[5]=rs.getString("situacion");
                modelo.addRow(registro);
               limpiarTabla(TABLA);
               }            

             TABLA.setModel(modelo);  
             FORMATO_TABLA(TABLA);
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void MostrarDatosMascotaxFechas(String d, String h, String buscar) {
    String[] titulos = {"Nro.","Fecha","Dueño","Mascota","Especie","Historial"};
    modelo = new javax.swing.table.DefaultTableModel(null,titulos);
    cn=cm.Conectar();

    String sSQL = "SELECT fichamedica.id,DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,CONCAT(propietarios.apellido,coma,propietarios.nombre) AS dueño,fichamedica.mascota,especies.nombre,razas.nombre,situacion FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON PELAJEXRAZA.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id WHERE fichamedica.idestado=1 AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND mascota LIKE '"+buscar+"%' ORDER BY fichamedica.id ASC";
    String registro[]=new String[6];
    
    RendererSituacion clase=new RendererSituacion(5);
    TABLA.setDefaultRenderer(Object.class, clase);
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        while(rs.next())
               {
                registro[0]=rs.getString("fichamedica.id"); 
                registro[1]=rs.getString("fecha");         
                registro[2]=rs.getString("dueño");
                registro[3]=rs.getString("mascota");
                registro[4]=rs.getString("especies.nombre");
                registro[5]=rs.getString("situacion");
                modelo.addRow(registro);
               limpiarTabla(TABLA);
               }            

             TABLA.setModel(modelo);  
             FORMATO_TABLA(TABLA);
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }    
    }

 private void MostrarDatosEspeciexFechas(String d, String h, String buscar) {
    String[] titulos = {"Nro.","Fecha","Dueño","Mascota","Especie","Historial"};
    modelo = new javax.swing.table.DefaultTableModel(null,titulos);
    cn=cm.Conectar();

    String sSQL = "SELECT fichamedica.id,DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,CONCAT(propietarios.apellido,coma,propietarios.nombre) AS dueño,fichamedica.mascota,especies.nombre,razas.nombre,situacion FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON PELAJEXRAZA.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id WHERE fichamedica.idestado=1 AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND especies.nombre LIKE '"+buscar+"%' ORDER BY fichamedica.id ASC";
    String registro[]=new String[6];
    
    RendererSituacion clase=new RendererSituacion(5);
    TABLA.setDefaultRenderer(Object.class, clase);
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        while(rs.next())
               {
                registro[0]=rs.getString("fichamedica.id"); 
                registro[1]=rs.getString("fecha");         
                registro[2]=rs.getString("dueño");
                registro[3]=rs.getString("mascota");
                registro[4]=rs.getString("especies.nombre");
                registro[5]=rs.getString("situacion");
                modelo.addRow(registro);
               limpiarTabla(TABLA);
               }            

             TABLA.setModel(modelo);  
             FORMATO_TABLA(TABLA);
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }  
    }

    private void MostrarDatosSituacionxFechas(String d, String h, String buscar) {
    String[] titulos = {"Nro.","Fecha","Dueño","Mascota","Especie","Historial"};
    modelo = new javax.swing.table.DefaultTableModel(null,titulos);
    cn=cm.Conectar();

    String sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,CONCAT(propietarios.apellido,coma,propietarios.nombre) AS dueño,fichamedica.mascota,especies.nombre,razas.nombre,situacion,fichamedica.id FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON PELAJEXRAZA.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id WHERE fichamedica.idestado=1 AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND situacion LIKE '"+buscar+"%' ORDER BY fichamedica.id ASC";
    String registro[]=new String[6];
    
    RendererSituacion clase=new RendererSituacion(5);
    TABLA.setDefaultRenderer(Object.class, clase);
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        while(rs.next())
               {
               registro[0]=rs.getString("fichamedica.id"); 
                registro[1]=rs.getString("fecha");         
                registro[2]=rs.getString("dueño");
                registro[3]=rs.getString("mascota");
                registro[4]=rs.getString("especies.nombre");
                registro[5]=rs.getString("situacion");
                modelo.addRow(registro);
               limpiarTabla(TABLA);
               }            

             TABLA.setModel(modelo);  
             FORMATO_TABLA(TABLA);
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }  
    }

 private void MostrarDatosApellidoxFechas(String d, String h, String buscar) {
    String[] titulos = {"Nro.","Fecha","Dueño","Mascota","Especie","Historial"};
    modelo = new javax.swing.table.DefaultTableModel(null,titulos);
    cn=cm.Conectar();

    String sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,fichamedica.id,CONCAT(propietarios.apellido,coma,propietarios.nombre) AS dueño,fichamedica.mascota,especies.nombre,razas.nombre,situacion FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON PELAJEXRAZA.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id WHERE fichamedica.idestado=1 AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND apellido LIKE '"+buscar+"%' OR propietarios.nombre LIKE '"+buscar+"%' ORDER BY fichamedica.id ASC";
    String registro[]=new String[6];
    RendererSituacion clase=new RendererSituacion(5);
    TABLA.setDefaultRenderer(Object.class, clase);
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        while(rs.next())
               {
                registro[0]=rs.getString("fichamedica.id"); 
                registro[1]=rs.getString("fecha");         
                registro[2]=rs.getString("dueño");
                registro[3]=rs.getString("mascota");
                registro[4]=rs.getString("especies.nombre");
                registro[5]=rs.getString("situacion");
                modelo.addRow(registro);
               limpiarTabla(TABLA);
               }            

             TABLA.setModel(modelo);  
             FORMATO_TABLA(TABLA);
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }  
    }
 
 private void MostrarDatosApellidoxSituacion(String d, String h, String buscar) {
    String[] titulos = {"Nro.","Fecha","Dueño","Mascota","Especie","Historial"};
    modelo = new javax.swing.table.DefaultTableModel(null,titulos);
    cn=cm.Conectar();

    String sSQL = "SELECT DATE_FORMAT(fecha,'%d/%m/%Y') AS fecha,fichamedica.id,CONCAT(propietarios.apellido,coma,propietarios.nombre) AS dueño,fichamedica.mascota,especies.nombre,razas.nombre,situacion FROM historialclinico INNER JOIN fichamedica ON historialclinico.idficha=fichamedica.id INNER JOIN propietarios ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON PELAJEXRAZA.idraza=razas.id INNER JOIN especies ON razas.idespecie=especies.id WHERE fichamedica.idestado=1 AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND historialclinico.situacion LIKE '"+buscar+"%' ORDER BY fichamedica.id ASC";
    String registro[]=new String[6];
    RendererSituacion clase=new RendererSituacion(5);
    TABLA.setDefaultRenderer(Object.class, clase);
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        while(rs.next())
               {
               registro[0]=rs.getString("fichamedica.id"); 
                registro[1]=rs.getString("fecha");         
                registro[2]=rs.getString("dueño");
                registro[3]=rs.getString("mascota");
                registro[4]=rs.getString("especies.nombre");
                registro[5]=rs.getString("situacion");
                modelo.addRow(registro);
               limpiarTabla(TABLA);
               }            

             TABLA.setModel(modelo);  
             FORMATO_TABLA(TABLA);
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }  
    }
 
 private void FORMATO_TABLA(JTable tab){
   tab.getColumnModel().getColumn(0).setPreferredWidth(3);
   tab.getColumnModel().getColumn(1).setPreferredWidth(30);
   tab.getColumnModel().getColumn(2).setPreferredWidth(130);
   tab.getColumnModel().getColumn(3).setPreferredWidth(20);
   tab.getColumnModel().getColumn(4).setPreferredWidth(20);     
   tab.getColumnModel().getColumn(5).setPreferredWidth(60); 
    }
}
