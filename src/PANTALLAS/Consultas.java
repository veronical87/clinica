package PANTALLAS;

import CLASES.ClaseOperaciones;
//import CLASES.JTextFieldToUpperCase;
import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
//import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
//import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.table.DefaultTableModel;

public class Consultas extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    DefaultTableModel modelo;
    Calendar Calendario = Calendar.getInstance();  
    private java.util.Date desde,hasta;
    GregorianCalendar hoy = new GregorianCalendar();
    ClaseOperaciones consulta=new ClaseOperaciones();
    public Consultas(java.awt.Frame parent, boolean modal) {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        JComboBoxCriterioSeleccionado = new javax.swing.JComboBox();
        jTextField_criteriodeBusqueda = new javax.swing.JTextField();
        buttonTaskBUSCAR = new org.edisoncor.gui.button.ButtonTask();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser_Desde = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser_Hasta = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        buttonTaskAGREGAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskMODIFICAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskELIMINAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskCERRAR = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTIÓN DE CONSULTAS");

        jPanel5.setBackground(new java.awt.Color(141, 141, 175));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "BÚSQUEDAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel8.setText("Tipo de Búsqueda");

        JComboBoxCriterioSeleccionado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JComboBoxCriterioSeleccionado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Criterio", "Dueño", "Mascota", "Veterinario", "Concepto", "Todos" }));
        JComboBoxCriterioSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxCriterioSeleccionadoActionPerformed(evt);
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
        buttonTaskBUSCAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskBUSCARActionPerformed(evt);
            }
        });

        jLabel3.setText("Desde");

        jDateChooser_Desde.setFocusable(false);
        jDateChooser_Desde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_DesdeMouseClicked(evt);
            }
        });

        jLabel4.setText("Hasta");

        jDateChooser_Hasta.setFocusable(false);
        jDateChooser_Hasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_HastaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JComboBoxCriterioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_Desde, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_criteriodeBusqueda))
                .addGap(40, 40, 40)
                .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(JComboBoxCriterioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_criteriodeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3))
                            .addComponent(jDateChooser_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(141, 141, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "LISTA DE CONSULTAS REALIZADAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro. ", "Fecha", "Concepto", "Veterinario", "Dueño", "Mascota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                            .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonTaskMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonTaskELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonTaskCERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskCERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int IDUSUARIO,IDROL; 
    private void buttonTaskBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskBUSCARActionPerformed
    String criterio = JComboBoxCriterioSeleccionado.getSelectedItem().toString();
    String buscar = jTextField_criteriodeBusqueda.getText();
    
    if((jDateChooser_Desde.getDate()==null & jDateChooser_Hasta.getDate()==null)){
        if(criterio.equals("Seleccionar Criterio")) {
           JOptionPane.showMessageDialog(null,"Debe Seleccionar un Criterio de Búsqueda","Información",JOptionPane.INFORMATION_MESSAGE);
        }else if(criterio.equals("Dueño")){
           MostrarConsultaxDueño(buscar);
        }else if(criterio.equals("Mascota")){
           MostrarConsultaxMascota(buscar);
        }else if(criterio.equals("Veterinario")){
           MostrarConsultaxVeterinario(buscar);
        }else if(criterio.equals("Concepto")){
           MostrarConsultaxConcepto(buscar);
        }
    }else{
        String formato = "dd/MM/yyyy";
        desde=new Date( this.jDateChooser_Desde.getDate().getYear(), jDateChooser_Desde.getDate().getMonth(),jDateChooser_Desde.getDate().getDate() );
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String d = sdf.format(desde);

        hasta=new Date( jDateChooser_Hasta.getDate().getYear(), jDateChooser_Hasta.getDate().getMonth(),jDateChooser_Hasta.getDate().getDate() );
        String h = sdf.format(hasta);
           
        if(criterio.equals("Seleccionar Criterio")) {
            MostrarDatosxFechas(d,h);
        }else if(criterio.equals("Mascota")){
            MostrarDatosMascotaxFechas(d,h,buscar);
        }else if(criterio.equals("Dueño")){
            MostrarDatosDueñoxFechas(d,h,buscar);
        }else if(criterio.equals("Veterinario")){
            MostrarDatosVeterinarioxFechas(d,h,buscar);
        }else if(criterio.equals("Concepto")){
            MostrarDatosConceptoxFechas(d,h,buscar);
        }
    }
    }//GEN-LAST:event_buttonTaskBUSCARActionPerformed
int filasel;
    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        String id;
        filasel = TABLA.getSelectedRow();
        modelo = (DefaultTableModel) TABLA.getModel();
        id = (String) modelo.getValueAt(filasel, 0);
        this.buttonTaskAGREGAR.setEnabled(false);
        this.buttonTaskMODIFICAR.setEnabled(true);
        this.buttonTaskELIMINAR.setEnabled(true);        
        ObtenerIDCONSULTA(id);        
    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TABLAComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLAComponentMoved

    private void buttonTaskAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARActionPerformed
        AltaConsulta ap = new AltaConsulta(new javax.swing.JFrame(), true);
        ap.idrol=IDROL;
        ap.idusuario=IDUSUARIO;      
        BuscarUsuario();        
        ap.jLabelVETERINARIO.setText(usuario); 
        
        dispose();
        ap.show();
    }//GEN-LAST:event_buttonTaskAGREGARActionPerformed

    private void buttonTaskMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskMODIFICARActionPerformed
       String proxdespar = null;
        if (filasel != -1) {            
            ModificarConsulta mp = new ModificarConsulta(new javax.swing.JFrame(), true);
            BuscarUsuario();
            this.fecha();
            mp.idrol = IDROL;
            mp.idusuario= IDUSUARIO;
            mp.DUEÑO=DUEÑO;
            mp.MASCOTA=nombremascota;
            mp.banderaDueño=false;
            mp.jLabelVETERINARIO.setText(usuario);
            mp.jLabelMASCOTA.setText(nombremascota);
            mp.IDOperacion=IDOPERACION;
            mp.OperacionRegistrada=false;               
            mp.jLabelDUEÑO.setText(DUEÑO);            
            mp.jLabelEdad.setText(String.valueOf(edad));           
            mp.jLabelEdad1.setText(tiemponac);
            mp.jLabelSEXO.setText(sexo);           
            mp.jLabelEspecie.setText(especie); 
            mp.jLabelRaza.setText(raza); 
            mp.IDHISTORIAL=IDHISTORIAL;
            mp.jLabelOpcionDespar.setText(opcionDESPAR);
            mp.jLabelPesoActual.setText(String.valueOf(pesoActual));
            mp.jLabelTiempoDespar.setText(tiempodespar);
            mp.jLabelSituacionPeso.setText(situacionpeso);
            mp.jComboBoxTIPOCONSULTA.getModel().setSelectedItem(TIPOOPERACION);
            mp.jTextAreaDIAGNOSTICO.setText(DIAGNOSTICO);
            mp.jDateChooserFECHATURNO.setDate(FECHATURNO); 
              if (opcionDESPAR.equals("No")||opcionDESPAR.equals("") ){ 
                  mp.jLabelOpcionDespar.setText("No");
                  mp.jLabelTiempoDespar.setText("Ninguna");

                  proxdespar=diaactual+3+"/"+mesactual+"/"+añoactual; 
              
           }else if(opcionDESPAR.equals("Si")){ 
                  int dia=Integer.parseInt(tiempodespar.substring(0,2)); 
                  int mes=Integer.parseInt(tiempodespar.substring(3,5)); 
                  int año=1+Integer.parseInt(tiempodespar.substring(6,10)); 
              
               
             if(mes==12){
                proxdespar=dia+"/"+06+"/"+añoactual+1;       
                              
             }else if(mes <6 || mes==6){
                 mes=mes+6;
                 proxdespar=dia+"/"+mes+"/"+añoactual;       
                
             }else if(mes>6 & mes<12){
                 if(mes==7) {
                     proxdespar=dia+"/"+01+"/"+año;       
                     
                 }else if(mes==8){
                     proxdespar=dia+"/"+02+"/"+año;       
                     
                 }else if(mes==9){
                     proxdespar=dia+"/"+03+"/"+año;       
                  
                 }else if(mes==10){
                     proxdespar=dia+"/"+04+"/"+año;       
                     
                 }else if(mes==11){
                     proxdespar=dia+"/"+05+"/"+año;       
                     
                 }
             }                  
              mp.jLabelOpcionDespar.setText("Si");
              mp.jLabelTiempoDespar.setText(tiempodespar);  
              mp.jLabelProximaDESPAR.setText(proxdespar);
           }           
              mp.jComboBoxHORA.getModel().setSelectedItem(HORATURNO);
              
              String formato = "dd/MM/yyyy";
              SimpleDateFormat sdf = new SimpleDateFormat(formato);
              String dia = sdf.format(FECHATURNO);
              
              mp.fechaTURNOAnterior=dia;
              
           switch (situacionpeso) {
               case "SOBREPESO":
                   mp.jLabelSituacionPeso.setForeground(new Color(204,0,0));
                   break;
               case "NORMAL":
                   mp.jLabelSituacionPeso.setForeground(new Color(0,97,51));
                   break;
               case "PESO BAJO":
                   mp.jLabelSituacionPeso.setForeground(new Color(255,77,0));
                   break;
            }       
           
           
           cantidad=consulta.CantVacunas(IDHISTORIAL);
           mp.LlenarTablaVacunas(IDHISTORIAL);
           if(cantidad==0){
             mp.BuscarVacunasPendientes(idespecie); 
           }else{
             if(tiemponac.equals("DIAS")& edad<100 & edad<40){
                 JOptionPane.showMessageDialog(null,"La Edad para Recomendar Vacunas,Debe ser Superior a 45 DIAS","Informacion",JOptionPane.INFORMATION_MESSAGE);
             }else{
                mp.LlenarTablaPENDIENTES(IDHISTORIAL);
                }             
           }           
           mp.LlenarTablaMedicamento(IDOPERACION);
           dispose();
           mp.show();
        } else {
            JOptionPane.showMessageDialog(null,"Debe Seleccionar un Ítem de la Lista","Información",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskMODIFICARActionPerformed

    private void buttonTaskELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskELIMINARActionPerformed
        if(filasel != -1){
            consulta.BajaOperacion(IDOPERACION);
            this.fecha();
            this.BuscarUsuario();
            consulta.InsertarDatosAuditoria(fechaActual,hor,usuario,"CONSULTAS","BAJA"," "," ");
           
            if(JOptionPane.showConfirmDialog(null, "¿Desea Borrar la Consulta" +" "+ TIPOOPERACION + " " + "?", "Consulta", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, "La Consulta"+" "+TIPOOPERACION+" "+"Se Borró Correctamente","Información", JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla(TABLA);
                modelo = (DefaultTableModel) TABLA.getModel();
                consulta.LlenarTablaCONSULTAS(modelo);
                buttonTaskAGREGAR.setEnabled(true);
                buttonTaskMODIFICAR.setEnabled(false);
                buttonTaskELIMINAR.setEnabled(false);
            }else{
                buttonTaskAGREGAR.setEnabled(true);
                buttonTaskMODIFICAR.setEnabled(false);
                buttonTaskELIMINAR.setEnabled(false);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un Ítem de la Lista", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskELIMINARActionPerformed

    private void buttonTaskCERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskCERRARActionPerformed
        dispose();
    }//GEN-LAST:event_buttonTaskCERRARActionPerformed

    private void jTextField_criteriodeBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_criteriodeBusquedaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_criteriodeBusquedaKeyReleased

    private void jTextField_criteriodeBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_criteriodeBusquedaKeyTyped
       String criterio = JComboBoxCriterioSeleccionado.getSelectedItem().toString();
       String buscar = this.jTextField_criteriodeBusqueda.getText();

         if(criterio.equals("Dueño")){
            MostrarConsultaxDueño(buscar);
        }else if(criterio.equals("Mascota")){
            MostrarConsultaxMascota(buscar);
        }else if(criterio.equals("Veterinario")){
            MostrarConsultaxVeterinario(buscar);
        }else if(criterio.equals("Concepto")){
            MostrarConsultaxConcepto(buscar);
        }else if(buscar.equals("")){
            jTextField_criteriodeBusqueda.requestFocus();
            JOptionPane.showMessageDialog(null,"Debe Ingresar el Dato a Buscar","Atencion",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextField_criteriodeBusquedaKeyTyped

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

    private void JComboBoxCriterioSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxCriterioSeleccionadoActionPerformed
        String criterio=this.JComboBoxCriterioSeleccionado.getSelectedItem().toString();
       
        if(criterio.equals("Todos")){
            jTextField_criteriodeBusqueda.setVisible(false);
            jDateChooser_Desde.setEnabled(false);
            jDateChooser_Hasta.setEnabled(false);
            limpiarTabla(TABLA);
            modelo=(DefaultTableModel) TABLA.getModel();
            consulta.LlenarTablaCONSULTAS(modelo);
        }else{
            jDateChooser_Desde.setEnabled(true);
            jDateChooser_Hasta.setEnabled(true);
            jTextField_criteriodeBusqueda.setVisible(true);
            jTextField_criteriodeBusqueda.setText("");
            jTextField_criteriodeBusqueda.requestFocus();}
    }//GEN-LAST:event_JComboBoxCriterioSeleccionadoActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Consultas dialog = new Consultas(new javax.swing.JFrame(), true);
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
    public javax.swing.JTable TABLA;
    public org.edisoncor.gui.button.ButtonTask buttonTaskAGREGAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskBUSCAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskCERRAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskELIMINAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskMODIFICAR;
    public com.toedter.calendar.JDateChooser jDateChooser_Desde;
    public com.toedter.calendar.JDateChooser jDateChooser_Hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField jTextField_criteriodeBusqueda;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

String usuario;
    private void BuscarUsuario() {
        String sSQL = "";       
        cn=cm.Conectar();
        sSQL = "SELECT apellido,nombre FROM usuarios WHERE id="+IDUSUARIO;
        try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while(rs.next())
            {
                usuario=rs.getString("apellido")+rs.getString("nombre");
            }

            }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
  
  String fechaActual,hor; int diaactual,a,min,mesactual,añoactual;
  void fecha(){             
    añoactual = Calendario.get(Calendar.YEAR);
    mesactual = Calendario.get(Calendar.MONTH) + 1;
    diaactual = Calendario.get(Calendar.DAY_OF_MONTH);
//    f=new Date(Calendario.get(Calendar.YEAR),Calendario.get(Calendar.MONTH) + 1,Calendario.get(Calendar.DAY_OF_MONTH));
    fechaActual=añoactual+"/"+mesactual+"/"+diaactual;
    int h=Calendario.get(Calendar.HOUR_OF_DAY);
    int minutos=Calendario.get(Calendar.MINUTE);        
    hor = String.valueOf(h+":"+minutos);  
  }   
 
  
  private void limpiarTabla(JTable tab) {
         while(tab.getRowCount()>0){//se recorren todas las filas
         ((javax.swing.table.DefaultTableModel) TABLA.getModel()).removeRow(0);
       }
    }

 private void MostrarConsultaxDueño(String buscar) {
    String[] titulos = {"Nro.","Fecha","Concepto","Veterinario","Dueño","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT operaciones.fecha,operaciones.id,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,mascota FROM tipooperacion INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON operaciones.idficha=fichamedica.id INNER JOIN propietarios ON fichamedica.idpropietario=propietarios.id  WHERE operaciones.idestado=1 AND operaciones.idcategoriaTipo=1 AND propietarios.apellido LIKE '"+buscar+"%' OR propietarios.nombre LIKE '"+buscar+"%' ORDER BY operaciones.id ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {           
           registro[0]=rs.getString("operaciones.id");
           registro[1]=rs.getString("operaciones.fecha");
           registro[2]=rs.getString("tipooperacion.nombre");
           registro[3]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[4]=rs.getString("dueño");
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(TABLA); 
           }          
          TABLA.setModel(modelo);  
          FORMATO_TABLA();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

  private void MostrarConsultaxMascota(String buscar) {
    String[] titulos = {"Nro.","Fecha","Concepto","Veterinario","Dueño","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT operaciones.fecha,operaciones.id,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,mascota FROM tipooperacion INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON operaciones.idficha=fichamedica.id INNER JOIN propietarios ON fichamedica.idpropietario=propietarios.id  WHERE operaciones.idestado=1 AND operaciones.idcategoriaTipo=1 AND mascota LIKE '"+buscar+"%' ORDER BY operaciones.id ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           registro[0]=rs.getString("operaciones.id");
           registro[1]=rs.getString("operaciones.fecha");
           registro[2]=rs.getString("tipooperacion.nombre");
           registro[3]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[4]=rs.getString("dueño");
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(TABLA); 
           }          
          TABLA.setModel(modelo);  
          FORMATO_TABLA();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

 private void MostrarConsultaxVeterinario(String buscar) {
    String[] titulos = {"Nro.","Fecha","Concepto","Veterinario","Dueño","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT operaciones.fecha,operaciones.id,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,mascota FROM tipooperacion INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON operaciones.idficha=fichamedica.id INNER JOIN propietarios ON fichamedica.idpropietario=propietarios.id  WHERE operaciones.idestado=1 AND operaciones.idcategoriaTipo=1 AND veterinarios.apellido LIKE '"+buscar+"%' OR veterinarios.nombre LIKE '"+buscar+"%' ORDER BY operaciones.id ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           registro[0]=rs.getString("operaciones.id");
           registro[1]=rs.getString("operaciones.fecha");
           registro[2]=rs.getString("tipooperacion.nombre");
           registro[3]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[4]=rs.getString("dueño");
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(TABLA); 
           }          
          TABLA.setModel(modelo); 
          FORMATO_TABLA();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }   
 
  private void MostrarDatosxFechas(String d, String h) {
    String[] titulos = {"Nro.","Fecha","Concepto","Veterinario","Dueño","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT operaciones.fecha,operaciones.id,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,mascota FROM tipooperacion INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON operaciones.idficha=fichamedica.id INNER JOIN propietarios ON fichamedica.idpropietario=propietarios.id  WHERE operaciones.idestado=1 AND operaciones.idcategoriaTipo=1 AND operaciones.fecha BETWEEN '"+d+"%' AND '"+h+"%' ORDER BY operaciones.id ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           registro[0]=rs.getString("operaciones.id");
           registro[1]=rs.getString("operaciones.fecha");
           registro[2]=rs.getString("tipooperacion.nombre");
           registro[3]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[4]=rs.getString("dueño");
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(TABLA); 
           }          
          TABLA.setModel(modelo);  
          FORMATO_TABLA();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void MostrarDatosMascotaxFechas(String d, String h, String buscar) {
    String[] titulos = {"Nro.","Fecha","Concepto","Veterinario","Dueño","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT operaciones.fecha,operaciones.id,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,mascota FROM tipooperacion INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON operaciones.idficha=fichamedica.id INNER JOIN propietarios ON fichamedica.idpropietario=propietarios.id  WHERE operaciones.idestado=1 AND operaciones.idcategoriaTipo=1 AND operaciones.fecha BETWEEN '"+d+"%' AND '"+h+"%' AND mascota LIKE '"+buscar+"%' ORDER BY operaciones.id ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           registro[0]=rs.getString("operaciones.id");
           registro[1]=rs.getString("operaciones.fecha");
           registro[2]=rs.getString("tipooperacion.nombre");
           registro[3]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[4]=rs.getString("dueño");
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(TABLA); 
           }          
          TABLA.setModel(modelo);  
          FORMATO_TABLA();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void MostrarDatosDueñoxFechas(String d, String h, String buscar) {
     String[] titulos = {"Nro.","Fecha","Concepto","Veterinario","Dueño","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT operaciones.fecha,operaciones.id,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,mascota FROM tipooperacion INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON operaciones.idficha=fichamedica.id INNER JOIN propietarios ON fichamedica.idpropietario=propietarios.id  WHERE operaciones.idestado=1 AND operaciones.fecha BETWEEN '"+d+"%' AND '"+h+"%' AND operaciones.idcategoriaTipo=1 AND propietarios.apellido LIKE '"+buscar+"%' OR  propietarios.nombre LIKE '"+buscar+"%' ORDER BY operaciones.id ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           registro[0]=rs.getString("operaciones.id");
           registro[1]=rs.getString("operaciones.fecha");
           registro[2]=rs.getString("tipooperacion.nombre");
           registro[3]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[4]=rs.getString("dueño");
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(TABLA); 
           }          
          TABLA.setModel(modelo);  
          FORMATO_TABLA();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void MostrarDatosVeterinarioxFechas(String d, String h, String buscar) {
    String[] titulos = {"Nro.","Fecha","Concepto","Veterinario","Dueño","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT operaciones.fecha,operaciones.id,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,mascota FROM tipooperacion INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON operaciones.idficha=fichamedica.id INNER JOIN propietarios ON fichamedica.idpropietario=propietarios.id  WHERE operaciones.idestado=1 AND operaciones.fecha BETWEEN '"+d+"%' AND '"+h+"%' AND operaciones.idcategoriaTipo=1 AND veterinarios.apellido LIKE '"+buscar+"%' OR veterinarios.nombre LIKE '"+buscar+"%' ORDER BY operaciones.id ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           registro[0]=rs.getString("operaciones.id");
           registro[1]=rs.getString("operaciones.fecha");
           registro[2]=rs.getString("tipooperacion.nombre");
           registro[3]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[4]=rs.getString("dueño");
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(TABLA); 
           }          
          TABLA.setModel(modelo);  
          FORMATO_TABLA();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void MostrarConsultaxConcepto(String buscar) {
    String[] titulos = {"Nro.","Fecha","Concepto","Veterinario","Dueño","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT operaciones.fecha,operaciones.id,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,mascota FROM tipooperacion INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON operaciones.idficha=fichamedica.id INNER JOIN propietarios ON fichamedica.idpropietario=propietarios.id  WHERE operaciones.idestado=1 AND operaciones.idcategoriaTipo=1 AND tipooperacion.nombre LIKE '"+buscar+"%' ORDER BY operaciones.id ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           registro[0]=rs.getString("operaciones.id");
           registro[1]=rs.getString("operaciones.fecha");
           registro[2]=rs.getString("tipooperacion.nombre");
           registro[3]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[4]=rs.getString("dueño");
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(TABLA); 
           }          
          TABLA.setModel(modelo);  
          FORMATO_TABLA();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           } 
    }

    private void MostrarDatosConceptoxFechas(String d, String h, String buscar) {
    String[] titulos = {"Nro.","Fecha","Concepto","Veterinario","Dueño","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT operaciones.fecha,operaciones.id,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,mascota FROM tipooperacion INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON operaciones.idficha=fichamedica.id INNER JOIN propietarios ON fichamedica.idpropietario=propietarios.id  WHERE operaciones.idestado=1 AND operaciones.fecha  BETWEEN '"+d+"%' AND '"+h+"%' AND operaciones.idcategoriaTipo=1 AND tipooperacion.nombre LIKE '"+buscar+"%' ORDER BY operaciones.id ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           registro[0]=rs.getString("operaciones.id");
           registro[1]=rs.getString("operaciones.fecha");
           registro[2]=rs.getString("tipooperacion.nombre");
           registro[3]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[4]=rs.getString("dueño");
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
//           limpiarTabla(TABLA); 
           }          
          TABLA.setModel(modelo); 
          FORMATO_TABLA();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }
    
  private void FORMATO_TABLA(){
   TABLA.getColumnModel().getColumn(0).setPreferredWidth(24);  
   TABLA.getColumnModel().getColumn(1).setPreferredWidth(11);
   TABLA.getColumnModel().getColumn(2).setPreferredWidth(85);
   TABLA.getColumnModel().getColumn(3).setPreferredWidth(90);
   TABLA.getColumnModel().getColumn(4).setPreferredWidth(90);
   TABLA.getColumnModel().getColumn(5).setPreferredWidth(50);
  }
  
  
String DUEÑO;int IDFICHA,IDOPERACION;
private void ObtenerIDCONSULTA(String id) {    
    String sSQL = "";       
    cn=cm.Conectar();
    sSQL = "SELECT operaciones.idficha,operaciones.id FROM operaciones WHERE id="+id;
    try
    {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        while(rs.next())
        {
          IDFICHA=rs.getInt("operaciones.idficha");
          IDOPERACION=rs.getInt("operaciones.id");
        }
        this.BuscarDatosMascota(IDFICHA);
        BuscarDatosHistorial(IDFICHA);
        BuscarDatosConsulta(IDOPERACION);
        BuscarFechaxOperacion(IDOPERACION);
        }
    
    catch (SQLException ex)
    {
    JOptionPane.showMessageDialog(null, ex);
    }    
}

String nombremascota = null,parasitos= null,alergias= null,tiempodespar,opcionDESPAR;int IDHISTORIAL;  
private void BuscarDatosHistorial(int idFicha) {
    try {
       cn=cm.Conectar();
       Statement st = (Statement) cn.createStatement(); 
       ResultSet rs = st.executeQuery("SELECT fichamedica.mascota,historialclinico.id,nrohistorial,parasitos,alergias,opciondesparasitado,DATE_FORMAT(fechadespar,'%d/%m/%Y') AS fecha,opcionproblemasresp,opcionpreñada,cantpre,opcionmasveces,opcionCastrado,situacion FROM fichamedica INNER JOIN historialclinico ON historialclinico.idficha=fichamedica.id WHERE historialclinico.idficha="+idFicha); 
            while (rs.next()) { 
              IDHISTORIAL=rs.getInt("historialclinico.id");
              nombremascota=rs.getString("fichamedica.mascota");             
              parasitos=rs.getString("parasitos");              
              alergias=rs.getString("alergias"); 
              opcionDESPAR=rs.getString("opciondesparasitado"); 
              tiempodespar=rs.getString("fecha");                
            }
            rs.close();          
          
        } catch (SQLException e) {
           System.out.print(e.getMessage());
        }       
    }

Double pesoActual;String especie="",cumpleaños="",tiemponac,raza,sexo,situacionpeso;int edad,idespecie,cantidad;
private void BuscarDatosMascota(int IDFICHA) {                   
   try {          
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT CONCAT(propietarios.apellido,coma,propietarios.nombre) AS DUEÑO,fichamedica.id,mascota,sexo,edad,tiemponac,situacionpeso,especies.id,especies.nombre,kilaje,razas.nombre,cumpleaños FROM propietarios INNER JOIN fichamedica ON propietarios.id=fichamedica.idpropietario INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON razas.id=pelajexraza.idraza INNER JOIN especies ON razas.idespecie=especies.id WHERE fichamedica.id="+IDFICHA);                     
        while (rs.next()) {   
            DUEÑO=rs.getString("DUEÑO");           
            situacionpeso=rs.getString("situacionpeso");
            especie=rs.getString("especies.nombre");
            edad=rs.getInt("edad");
            cumpleaños=rs.getString("cumpleaños");
            idespecie=rs.getInt("especies.id");
            tiemponac=rs.getString("tiemponac");
            pesoActual=rs.getDouble("kilaje");
            raza=rs.getString("razas.nombre");
            sexo=rs.getString("sexo");
           }
           rs.close();  
           
    } catch (SQLException ex) {
            System.out.print(ex);
    }  
}

String TIPOOPERACION,DIAGNOSTICO;
private void BuscarDatosConsulta(int IDOPERACION) {
   try {          
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT tipooperacion.nombre,diagnostico FROM OPERACIONES INNER JOIN tipooperacion ON operaciones.idtipooperacion=tipooperacion.id WHERE operaciones.id="+IDOPERACION);                     
        while (rs.next()) {   
            TIPOOPERACION=rs.getString("tipooperacion.nombre");           
            DIAGNOSTICO=rs.getString("diagnostico");          
           }
           rs.close();  
           
    } catch (SQLException ex) {
            System.out.print(ex);
    } 
}

String HORATURNO; java.sql.Date FECHATURNO;
private void BuscarFechaxOperacion(int IDOPERACION) {
   
  try {          
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT fechaturno,horaturno FROM fechasxoperacion WHERE fechasxoperacion.idoperacion="+IDOPERACION);                     
        while (rs.next()) {   
            FECHATURNO=rs.getDate("fechaturno");           
            HORATURNO=(String) rs.getObject("horaturno");          
           }
           rs.close();  
           
    } catch (SQLException ex) {
            System.out.print(ex);
    } 
}

}
