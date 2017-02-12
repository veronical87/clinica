package PANTALLAS;

import CLASES.ClaseOperaciones;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;
import Conexion.ConexionMySQL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

public class LISTADO extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    private java.util.Date desde,hasta;
    Calendar Calendario = Calendar.getInstance();  
    DefaultTableModel modelo;    
    GregorianCalendar hoy = new GregorianCalendar(); 
    ClaseOperaciones c=new ClaseOperaciones();
    public LISTADO(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); 
        jDateChooser_Desde.setMaxSelectableDate(hoy.getTime());
        jDateChooser_Hasta.setMaxSelectableDate(hoy.getTime());
        buttonAction1.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableVISITAS = new javax.swing.JTable();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        buttonActionGenerarREPORTE = new org.edisoncor.gui.button.ButtonAction();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        JComboBoxCriterioSeleccionado = new javax.swing.JComboBox();
        jTextField_criteriodeBusqueda = new javax.swing.JTextField();
        buttonTaskBUSCAR = new org.edisoncor.gui.button.ButtonTask();
        jLabel15 = new javax.swing.JLabel();
        jDateChooser_Desde = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jDateChooser_Hasta = new com.toedter.calendar.JDateChooser();
        buttonActionGenerarREPORTE1 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ListadoAtenciones");

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTADO DE ATENCIONES");

        jPanel14.setBackground(new java.awt.Color(141, 141, 175));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "LISTADO DE ATENCIONES PROGRAMADAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTableVISITAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro.", "Veterinario", "Fecha", "Hora", "Tipo de Operación", "Mascota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVISITAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVISITASMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableVISITAS);

        buttonAction1.setText("Cancelar");
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        buttonActionGenerarREPORTE.setText("GENERAR LISTADO ");
        buttonActionGenerarREPORTE.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionGenerarREPORTE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonActionGenerarREPORTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionGenerarREPORTEActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(141, 141, 175));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "BÚSQUEDAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel11.setText("Tipo de Búsqueda");

        JComboBoxCriterioSeleccionado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JComboBoxCriterioSeleccionado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Veterinario", "Concepto", "Mascota", "Todos" }));
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

        jLabel15.setText("Desde");

        jDateChooser_Desde.setFocusable(false);
        jDateChooser_Desde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_DesdeMouseClicked(evt);
            }
        });

        jLabel18.setText("Hasta");

        jDateChooser_Hasta.setFocusable(false);
        jDateChooser_Hasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_HastaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(JComboBoxCriterioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_criteriodeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooser_Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel18)
                .addGap(6, 6, 6)
                .addComponent(jDateChooser_Hasta, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTaskBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JComboBoxCriterioSeleccionado, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField_criteriodeBusqueda, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooser_Desde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser_Hasta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonActionGenerarREPORTE1.setText("CANCELAR");
        buttonActionGenerarREPORTE1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionGenerarREPORTE1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonActionGenerarREPORTE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionGenerarREPORTE1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonActionGenerarREPORTE, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(buttonActionGenerarREPORTE1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGenerarREPORTE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActionGenerarREPORTE1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int idrol;
    private void JComboBoxCriterioSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxCriterioSeleccionadoActionPerformed
        String criterio=this.JComboBoxCriterioSeleccionado.getSelectedItem().toString();

        if(criterio.equals("Todos")){
            jTextField_criteriodeBusqueda.setVisible(false);
            jDateChooser_Desde.setEnabled(false);
            jDateChooser_Hasta.setEnabled(false);
            limpiarTabla(jTableVISITAS);
            LlenarTablaVISITAS();
        }else{
            jDateChooser_Desde.setEnabled(true);
            jDateChooser_Hasta.setEnabled(true);
            jTextField_criteriodeBusqueda.setVisible(true);
            jTextField_criteriodeBusqueda.setText("");
            jTextField_criteriodeBusqueda.requestFocus();}
    }//GEN-LAST:event_JComboBoxCriterioSeleccionadoActionPerformed

    private void jTextField_criteriodeBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_criteriodeBusquedaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_criteriodeBusquedaKeyReleased

    private void jTextField_criteriodeBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_criteriodeBusquedaKeyTyped
        String criterio = JComboBoxCriterioSeleccionado.getSelectedItem().toString();
        String buscar = jTextField_criteriodeBusqueda.getText();
        this.fecha();
        if((jDateChooser_Desde.getDate()==null & jDateChooser_Hasta.getDate()==null)){
            if(criterio.equals("Seleccionar Criterio")) {
                JOptionPane.showMessageDialog(null,"Debe Seleccionar un Criterio de Búsqueda","Información",JOptionPane.INFORMATION_MESSAGE);
            }else if(criterio.equals("Veterinario")){
                MostrarVisitasxVeterinario(buscar);
            }else if(criterio.equals("Concepto")){
                MostrarVisitasxConcepto(buscar);
            }else if(criterio.equals("Mascota")){
                MostrarVisitasxMascota(buscar);
            }
        }else{
            String formato = "yyyy/MM/dd";
            desde=new Date( this.jDateChooser_Desde.getDate().getYear(), jDateChooser_Desde.getDate().getMonth(),jDateChooser_Desde.getDate().getDate() );
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String d = sdf.format(desde);

            hasta=new Date( jDateChooser_Hasta.getDate().getYear(), jDateChooser_Hasta.getDate().getMonth(),jDateChooser_Hasta.getDate().getDate() );
            String h = sdf.format(hasta);

            if(criterio.equals("Seleccionar Criterio")) {
                MostrarVisitasxFechas(d,h);
            }else if(criterio.equals("Veterinario")){
                MostrarVisitasVeterinarioxFechas(d,h,buscar);
            }else if(criterio.equals("Concepto")){
                MostrarVisitasConceptoxFechas(d,h,buscar);
            }else if(criterio.equals("Mascota")){
                MostrarVisitasMascotaxFechas(d,h,buscar);
            }
        }
    }//GEN-LAST:event_jTextField_criteriodeBusquedaKeyTyped

    private void buttonTaskBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskBUSCARActionPerformed
        String criterio = JComboBoxCriterioSeleccionado.getSelectedItem().toString();
        String buscar = jTextField_criteriodeBusqueda.getText();

        if((jDateChooser_Desde.getDate()==null & jDateChooser_Hasta.getDate()==null)){
            if(criterio.equals("Seleccionar Criterio")) {
                JOptionPane.showMessageDialog(null,"Debe Seleccionar un Criterio de Búsqueda","Información",JOptionPane.INFORMATION_MESSAGE);
            }else if(criterio.equals("Veterinario")){
                MostrarVisitasxVeterinario(buscar);
            }else if(criterio.equals("Concepto")){
                MostrarVisitasxConcepto(buscar);
            }else if(criterio.equals("Mascota")){
                MostrarVisitasxMascota(buscar);
            }
        }else{
            String formato = "yyyy/MM/dd";
            desde=new Date( this.jDateChooser_Desde.getDate().getYear(), jDateChooser_Desde.getDate().getMonth(),jDateChooser_Desde.getDate().getDate() );
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String d = sdf.format(desde);

            hasta=new Date( jDateChooser_Hasta.getDate().getYear(), jDateChooser_Hasta.getDate().getMonth(),jDateChooser_Hasta.getDate().getDate() );
            String h = sdf.format(hasta);

            if(criterio.equals("Seleccionar Criterio")) {
                MostrarVisitasxFechas(d,h);
            }else if(criterio.equals("Veterinario")){
                MostrarVisitasVeterinarioxFechas(d,h,buscar);
            }else if(criterio.equals("Concepto")){
                MostrarVisitasConceptoxFechas(d,h,buscar);
            }else if(criterio.equals("Mascota")){
                MostrarVisitasMascotaxFechas(d,h,buscar);
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

    private void buttonActionGenerarREPORTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGenerarREPORTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonActionGenerarREPORTEActionPerformed

    private void buttonActionGenerarREPORTE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGenerarREPORTE1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_buttonActionGenerarREPORTE1ActionPerformed

    private void jTableVISITASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVISITASMouseClicked
     buttonAction1.setVisible(true);
     int filasel = jTableVISITAS.getSelectedRow();
     modelo = (DefaultTableModel) jTableVISITAS.getModel();
     String id = (String) modelo.getValueAt(filasel, 0);
     BuscarDatosVisita(id);
    }//GEN-LAST:event_jTableVISITASMouseClicked

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
    c.CancelarVisita(NroOperacion);
    limpiarTabla(jTableVISITAS);
    LlenarTablaVISITAS();
    this.buttonAction1.setVisible(false);
    }//GEN-LAST:event_buttonAction1ActionPerformed

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
            java.util.logging.Logger.getLogger(LISTADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LISTADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LISTADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LISTADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LISTADO dialog = new LISTADO(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.button.ButtonAction buttonActionGenerarREPORTE;
    private org.edisoncor.gui.button.ButtonAction buttonActionGenerarREPORTE1;
    public org.edisoncor.gui.button.ButtonTask buttonTaskBUSCAR;
    public com.toedter.calendar.JDateChooser jDateChooser_Desde;
    public com.toedter.calendar.JDateChooser jDateChooser_Hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableVISITAS;
    public javax.swing.JTextField jTextField_criteriodeBusqueda;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

private void MostrarVisitasxFechas(String d, String h) {
    String[] titulos = {"Nro.","Veterinario","Fecha","Hora","Tipo de Consulta","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT nro,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,mascota,DATE_FORMAT(fechaturno,'%d/%m/%Y') AS fecha,horaturno FROM categoriatipo INNER JOIN tipooperacion ON categoriatipo.id=tipooperacion.idcategoria INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON fichamedica.id=operaciones.idficha INNER JOIN fechasxoperacion ON operaciones.id=fechasxoperacion.idoperacion WHERE tipooperacion.idcategoria=1 AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' ORDER BY fecha ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {            
           registro[0]=rs.getString("nro"); 
           registro[1]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[2]=rs.getString("fecha");
           registro[3]=rs.getString("hora");
           registro[4]=rs.getString("tipooperacion.nombre");          
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(jTableVISITAS); 
           }          
          jTableVISITAS.setModel(modelo); 
          this.FORMATO_TABLA2();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

private void MostrarVisitasVeterinarioxFechas(String d, String h, String buscar) {
    String[] titulos = {"Nro.","Veterinario","Fecha","Hora","Tipo de Consulta","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT nro,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,mascota,DATE_FORMAT(fechaturno,'%d/%m/%Y') AS fecha,horaturno FROM categoriatipo INNER JOIN tipooperacion ON categoriatipo.id=tipooperacion.idcategoria INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON fichamedica.id=operaciones.idficha INNER JOIN fechasxoperacion ON operaciones.id=fechasxoperacion.idoperacion WHERE tipooperacion.idcategoria=1 AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND veterinarios.apellido LIKE '"+buscar+"%' OR veterinarios.nombre LIKE '"+buscar+"%' ORDER BY fecha ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {           
           registro[0]=rs.getString("nro"); 
           registro[1]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[2]=rs.getString("fecha");
           registro[3]=rs.getString("horaturno");
           registro[4]=rs.getString("tipooperacion.nombre");          
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(jTableVISITAS); 
           }          
          jTableVISITAS.setModel(modelo);  
          FORMATO_TABLA2();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }    
    }

    private void MostrarVisitasConceptoxFechas(String d, String h, String buscar) {
    String[] titulos = {"Nro.","Veterinario","Fecha","Hora","Tipo de Consulta","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT nro,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,mascota,DATE_FORMAT(fechaturno,'%d/%m/%Y') AS fecha,horaturno FROM categoriatipo INNER JOIN tipooperacion ON categoriatipo.id=tipooperacion.idcategoria INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON fichamedica.id=operaciones.idficha INNER JOIN fechasxoperacion ON operaciones.id=fechasxoperacion.idoperacion WHERE tipooperacion.idcategoria=1 AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND tipooperacion.nombre LIKE '"+buscar+"%' ORDER BY fecha ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {           
           registro[0]=rs.getString("nro"); 
           registro[1]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[2]=rs.getString("fecha");
           registro[3]=rs.getString("horaturno");
           registro[4]=rs.getString("tipooperacion.nombre");          
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(jTableVISITAS); 
           }          
          jTableVISITAS.setModel(modelo);  
          FORMATO_TABLA2();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }   
    }

    private void MostrarVisitasxVeterinario(String buscar) {
    String[] titulos = {"Nro.","Veterinario","Fecha","Hora","Tipo de Consulta","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT nro,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,mascota,DATE_FORMAT(fechaturno,'%d/%m/%Y') AS fecha,horaturno FROM categoriatipo INNER JOIN tipooperacion ON categoriatipo.id=tipooperacion.idcategoria INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON fichamedica.id=operaciones.idficha INNER JOIN fechasxoperacion ON operaciones.id=fechasxoperacion.idoperacion WHERE DATE_FORMAT(fechaturno,'%Y/%m/%d') LIKE '"+fechaActual+"%' AND veterinarios.apellido LIKE '"+buscar+"%' OR veterinarios.nombre LIKE '"+buscar+"%' ORDER BY fecha ASC";

    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {           
           registro[0]=rs.getString("nro"); 
           registro[1]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[2]=rs.getString("fecha");
           registro[3]=rs.getString("horaturno");
           registro[4]=rs.getString("tipooperacion.nombre");          
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(jTableVISITAS); 
           }          
          jTableVISITAS.setModel(modelo);  
          FORMATO_TABLA2();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

    private void MostrarVisitasxConcepto(String buscar) {
    String[] titulos = {"Nro.","Veterinario","Fecha","Hora","Tipo de Consulta","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT nro,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,mascota,DATE_FORMAT(fechaturno,'%d/%m/%Y') AS fecha,horaturno FROM categoriatipo INNER JOIN tipooperacion ON categoriatipo.id=tipooperacion.idcategoria INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON fichamedica.id=operaciones.idficha INNER JOIN fechasxoperacion ON operaciones.id=fechasxoperacion.idoperacion WHERE DATE_FORMAT(fechaturno,'%Y/%m/%d') LIKE '"+fechaActual+"%' AND tipooperacion.idcategoria=1 AND tipooperacion.nombre LIKE '"+buscar+"%' ORDER BY fecha ASC";

    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {           
           registro[0]=rs.getString("nro"); 
           registro[1]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[2]=rs.getString("fecha");
           registro[3]=rs.getString("horaturno");
           registro[4]=rs.getString("tipooperacion.nombre");          
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(jTableVISITAS); 
           }          
          jTableVISITAS.setModel(modelo); 
          FORMATO_TABLA2();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

  private void MostrarVisitasxMascota(String buscar) {
    String[] titulos = {"Nro.","Veterinario","Fecha","Hora","Tipo de Consulta","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT nro,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,mascota,DATE_FORMAT(fechaturno,'%d/%m/%Y') AS fecha,horaturno FROM categoriatipo INNER JOIN tipooperacion ON categoriatipo.id=tipooperacion.idcategoria INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON fichamedica.id=operaciones.idficha INNER JOIN fechasxoperacion ON operaciones.id=fechasxoperacion.idoperacion WHERE DATE_FORMAT(fechaturno,'%Y/%m/%d') LIKE '"+fechaActual+"%' AND tipooperacion.idcategoria=1 AND mascota LIKE '"+buscar+"%' ORDER BY fecha ASC";

    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {           
           registro[0]=rs.getString("nro"); 
           registro[1]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[2]=rs.getString("fecha");
           registro[3]=rs.getString("horaturno");
           registro[4]=rs.getString("tipooperacion.nombre");          
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(jTableVISITAS); 
           }          
          jTableVISITAS.setModel(modelo);  
          FORMATO_TABLA2();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

 private void MostrarVisitasMascotaxFechas(String d, String h, String buscar) {
  String[] titulos = {"Nro.","Veterinario","Fecha","Hora","Tipo de Consulta","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT nro,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,mascota,DATE_FORMAT(fechaturno,'%d/%m/%Y') AS fecha,horaturno FROM categoriatipo INNER JOIN tipooperacion ON categoriatipo.id=tipooperacion.idcategoria INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON fichamedica.id=operaciones.idficha INNER JOIN fechasxoperacion ON operaciones.id=fechasxoperacion.idoperacion WHERE tipooperacion.idcategoria=1 AND DATE_FORMAT(fecha,'%Y/%m/%d') BETWEEN '"+d+"%' AND '"+h+"%' AND mascota LIKE '"+buscar+"%' ORDER BY fecha ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {           
           registro[0]=rs.getString("nro"); 
           registro[1]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[2]=rs.getString("fecha");
           registro[3]=rs.getString("horaturno");
           registro[4]=rs.getString("tipooperacion.nombre");          
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(jTableVISITAS); 
           }          
          jTableVISITAS.setModel(modelo);  
          FORMATO_TABLA2();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }      
    }
 
 private void FORMATO_TABLA2(){
  jTableVISITAS.getColumnModel().getColumn(0).setPreferredWidth(130);
  jTableVISITAS.getColumnModel().getColumn(3).setPreferredWidth(80);
  jTableVISITAS.getColumnModel().getColumn(4).setPreferredWidth(50);
    }
  private void LlenarTablaVISITAS() {
    String[] titulos = {"Nro.","Veterinario","Fecha","Hora","Tipo de Consulta","Mascota"};
    modelo = new DefaultTableModel(null,titulos);
    cn=cm.Conectar();
    
    String[] registro = new String[6];
    String sSQL = "SELECT nro,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,mascota,DATE_FORMAT(fechaturno,'%d/%m/%Y') AS fecha,horaturno FROM categoriatipo INNER JOIN tipooperacion ON categoriatipo.id=tipooperacion.idcategoria INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON fichamedica.id=operaciones.idficha INNER JOIN fechasxoperacion ON operaciones.id=fechasxoperacion.idoperacion WHERE DATE_FORMAT(fechaturno,'%Y/%m/%d') LIKE '"+fechaActual+"%' ORDER BY fecha ASC";
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {   
           registro[0]=rs.getString("nro"); 
           registro[1]=rs.getString("veterinarios.apellido")+rs.getString("veterinarios.nombre");
           registro[2]=rs.getString("fecha");
           registro[3]=rs.getString("horaturno");
           registro[4]=rs.getString("tipooperacion.nombre");          
           registro[5]=rs.getString("mascota");
           modelo.addRow(registro);
           limpiarTabla(jTableVISITAS); 
           }          
          jTableVISITAS.setModel(modelo);  
          FORMATO_TABLA2();
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }      
    }
  
   
 private void limpiarTabla(JTable tab) {
         while(tab.getRowCount()>0){//se recorren todas las filas
         ((javax.swing.table.DefaultTableModel) tab.getModel()).removeRow(0);
       }
    }

int NroOperacion;
private void BuscarDatosVisita(String id) {
  cn=cm.Conectar();       
  String sSQL = "SELECT nro,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,mascota,DATE_FORMAT(fechaturno,'%d/%m/%Y') AS fecha,horaturno FROM categoriatipo INNER JOIN tipooperacion ON categoriatipo.id=tipooperacion.idcategoria INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON fichamedica.id=operaciones.idficha INNER JOIN fechasxoperacion ON operaciones.id=fechasxoperacion.idoperacion  WHERE nro="+id;
    try
       {
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
//         
         while(rs.next())
           {
           NroOperacion=rs.getInt("nro");
                              
           }          
            
            }
        catch (SQLException ex)
           {
            JOptionPane.showMessageDialog(null, ex);
           }
    }

String fechaActual,hor; int min,añoactual,mesactual,diaactual; 
void fecha(){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    añoactual = Calendario.get(Calendar.YEAR);
    mesactual = Calendario.get(Calendar.MONTH) + 1;
    diaactual = Calendario.get(Calendar.DAY_OF_MONTH);
    
    fechaActual=diaactual+"/"+mesactual+"/"+añoactual;    
 
//    f=new Date(Calendario.get(Calendar.YEAR),Calendario.get(Calendar.MONTH) + 1,Calendario.get(Calendar.DAY_OF_MONTH));
    int h=Calendario.get(Calendar.HOUR_OF_DAY);
    int minutos=Calendario.get(Calendar.MINUTE);        
    hor = String.valueOf(h+":"+minutos);
}

}
