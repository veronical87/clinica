package PANTALLAS;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.util.TableOrder;

public class ReporteGráficos extends javax.swing.JFrame {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    CallableStatement cmd;
    public ReporteGráficos() {
        initComponents();
        setLocationRelativeTo(null); 
        Deshabilitar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        buttonTaskCERRAR = new org.edisoncor.gui.button.ButtonTask();
        PANEL = new javax.swing.JPanel();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        jPanel1 = new javax.swing.JPanel();
        jCheckBoxBARRAS = new javax.swing.JCheckBox();
        jCheckBoxAREA = new javax.swing.JCheckBox();
        jCheckBoxTORTS = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jDateChooserDESDE = new com.toedter.calendar.JDateChooser();
        jDateChooserHASTA = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxFILTRO1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxFILTRO2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRectTranslucido1.setPreferredSize(new java.awt.Dimension(566, 623));

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

        PANEL.setBackground(new java.awt.Color(141, 141, 175));
        PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "BÚSQUEDAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        buttonAction1.setText("Generar");
        buttonAction1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tipo de Gráfico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        buttonGroup2.add(jCheckBoxBARRAS);
        jCheckBoxBARRAS.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jCheckBoxBARRAS.setText("BARRAS");
        jCheckBoxBARRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBARRASActionPerformed(evt);
            }
        });

        buttonGroup2.add(jCheckBoxAREA);
        jCheckBoxAREA.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jCheckBoxAREA.setText("ÁREA");

        buttonGroup2.add(jCheckBoxTORTS);
        jCheckBoxTORTS.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jCheckBoxTORTS.setText("TORTA");
        jCheckBoxTORTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTORTSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jCheckBoxTORTS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jCheckBoxBARRAS)
                .addGap(62, 62, 62)
                .addComponent(jCheckBoxAREA)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxBARRAS)
                    .addComponent(jCheckBoxAREA)
                    .addComponent(jCheckBoxTORTS))
                .addContainerGap())
        );

        jComboBox1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Propietarios", "Consultas", "Cirugías", "Todas las Atenciones" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Desde");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Hasta");

        jComboBoxFILTRO1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jComboBoxFILTRO1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Entre Fechas", "Medicamentos", "Veterinarios" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Seleccione el tipo de Búsqueda");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("con");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("con");

        jComboBoxFILTRO2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jComboBoxFILTRO2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fichas Médicas", "Atenciones" }));

        javax.swing.GroupLayout PANELLayout = new javax.swing.GroupLayout(PANEL);
        PANEL.setLayout(PANELLayout);
        PANELLayout.setHorizontalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANELLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PANELLayout.createSequentialGroup()
                                .addComponent(jComboBox1, 0, 247, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxFILTRO1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PANELLayout.createSequentialGroup()
                                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PANELLayout.createSequentialGroup()
                                        .addComponent(jDateChooserDESDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDateChooserHASTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBoxFILTRO2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PANELLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(buttonAction1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        PANELLayout.setVerticalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFILTRO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDateChooserHASTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooserDESDE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBoxFILTRO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REPORTES GRÁFICOS");

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
                .addComponent(PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonTaskCERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonTaskCERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTaskCERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskCERRARActionPerformed
        dispose();
    }//GEN-LAST:event_buttonTaskCERRARActionPerformed

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
 if(jCheckBoxAREA.isSelected() || this.jCheckBoxBARRAS.isSelected() || this.jCheckBoxTORTS.isSelected()){
    String seleccion=String.valueOf(this.jComboBox1.getModel().getSelectedItem());
    if(seleccion.equals("Tipos de Atenciones más Solicitadas por Cliente")){
        if(this.jCheckBoxTORTS.isSelected()){
         ReporteAtencionesGRAFICOTORTA();  
      }else if(this.jCheckBoxBARRAS.isSelected()){
          ReporteAtencionesGRAFICOBARRAS();  
      }else if(this.jCheckBoxAREA.isSelected()){
          ReporteAtencionesGRAFICOAREA();  
      }   
    }else if(seleccion.equals("Medicamentos más Utilizados por Tipo de Operación")){
        if(this.jCheckBoxTORTS.isSelected()){
         ReporteMedicamentosGRAFICOTORTA();  
      }else if(this.jCheckBoxBARRAS.isSelected()){
          ReporteMedicamentosGRAFICOBARRAS();  
      }else if(this.jCheckBoxAREA.isSelected()){
          ReporteMedicamentosGRAFICOAREA();  
      }   
    }else if(seleccion.equals("Tipo de Operaciones más Solicitadas")){
         if(this.jCheckBoxTORTS.isSelected()){
         ReporteOperacionesGRAFICOTORTA();  
      }else if(this.jCheckBoxBARRAS.isSelected()){
          ReporteOperacionesGRAFICOBARRAS();  
      }else if(this.jCheckBoxAREA.isSelected()){
          ReporteOperacionesGRAFICOAREA();  
      }   
    }  
 }else{
   JOptionPane.showMessageDialog(null,"No se Determinó el Tipo de Gráfico","Atención",JOptionPane.WARNING_MESSAGE);
 }
    }//GEN-LAST:event_buttonAction1ActionPerformed

    private void jCheckBoxTORTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTORTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxTORTSActionPerformed

    private void jCheckBoxBARRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBARRASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxBARRASActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    String seleccion=String.valueOf(this.jComboBox1.getModel().getSelectedItem());
    String seleccion1=String.valueOf(this.jComboBoxFILTRO1.getModel().getSelectedItem());
    String seleccion2=String.valueOf(this.jComboBoxFILTRO2.getModel().getSelectedItem());
       
//   if(seleccion.equals("Propietarios")){
//         this.jComboBoxFILTRO1.setEnabled(false);
//         this.jComboBoxFILTRO2.setEnabled(true);
//         this.jDateChooserDESDE.setEnabled(false);
//         this.jDateChooserHASTA.setEnabled(false);
//         if(seleccion2.equals("Fichas Médicas")){
//            // aca iria el tipo de reporte que se genera,....
//                ReporteGraficoPropietarioxFICHAS();
//          }else{
//             // aca iria el tipo de reporte que se genera,....
//                ReporteGraficoPropietarioxATENCIONES();
//         }         
//    }else if(seleccion.equals("Consultas")){
//         this.jComboBoxFILTRO1.setEnabled(true);
//         jComboBoxFILTRO2.setEnabled(false);
//         if(seleccion1.equals("Entre Fechas")){
//            this.jDateChooserDESDE.setEnabled(true);
//            this.jDateChooserHASTA.setEnabled(true);
//            ReporteGraficoConsultasxFECHAS();
//              // aca iria el tipo de reporte que se genera,....
//         }else if(seleccion1.equals("Medicamentos")){            
//             this.jDateChooserDESDE.setEnabled(false);
//             this.jDateChooserHASTA.setEnabled(false);
//             ReporteGraficoConsultasxMEDICAMENTOS();
//         }else if(seleccion1.equals("Veterinarios")){ 
//             this.jDateChooserDESDE.setEnabled(false);
//             this.jDateChooserHASTA.setEnabled(false);
//             ReporteGraficoConsultasxVETERINARIOS();
//         }        
//    }else if(seleccion.equals("Cirugías")){
//         this.jComboBoxFILTRO1.setEnabled(true);
//         jComboBoxFILTRO2.setEnabled(false);
//         if(seleccion1.equals("Entre Fechas")){
//            this.jDateChooserDESDE.setEnabled(true);
//            this.jDateChooserHASTA.setEnabled(true);
//            ReporteGraficoCirugiasxFECHAS();
//              // aca iria el tipo de reporte que se genera,....
//         }else if(seleccion1.equals("Medicamentos")){            
//             this.jDateChooserDESDE.setEnabled(false);
//             this.jDateChooserHASTA.setEnabled(false);
//             ReporteGraficoCirugiasxMEDICAMENTOS();
//         }else if(seleccion1.equals("Veterinarios")){ 
//             this.jDateChooserDESDE.setEnabled(false);
//             this.jDateChooserHASTA.setEnabled(false);
//             ReporteGraficoCirugiasxVETERINARIOS();
//         }    
//          // aca iria el tipo de reporte que se genera,....
//    }else if(seleccion.equals("Todas las Atenciones")){
//          this.jComboBoxFILTRO1.setEnabled(false);
//         this.jComboBoxFILTRO2.setEnabled(false);
//         this.jDateChooserDESDE.setEnabled(false);
//         this.jDateChooserHASTA.setEnabled(false);
//          // aca iria el tipo de reporte que se genera,....
//    }
java.util.Date desde,hasta;
String formato ="d/MM/yyyy";
    desde = new java.util.Date(this.jDateChooserDESDE.getDate().getYear(), jDateChooserDESDE.getDate().getMonth(), jDateChooserDESDE.getDate().getDate());
    SimpleDateFormat sdf = new SimpleDateFormat(formato);
    String d = sdf.format(desde);

    hasta = new java.util.Date(jDateChooserHASTA.getDate().getYear(), jDateChooserHASTA.getDate().getMonth(), jDateChooserHASTA.getDate().getDate());
    SimpleDateFormat sdf2 = new SimpleDateFormat(formato);
    String h = sdf2.format(hasta);
    
   if(this.jCheckBoxTORTS.isSelected()){ 
               try {
                    String consulta = "SELECT articulo,max(detalle_operacion.cantidad)AS cantidad,fecha FROM operacion INNER JOIN detalle_operacion ON operacion.idoperacion=detalle_operacion.idoperacion INNER JOIN articulos ON detalle_operacion.idarticulo=articulos.idarticulo WHERE fecha LIKE '"+d+"%'"+"or '"+h+"%' GROUP BY articulo";
                    JDBCCategoryDataset dataset = new JDBCCategoryDataset(cm.Conectar(), consulta);
                    JFreeChart chart = ChartFactory.createLineChart("Artículos más Comprados Por Fecha", "Artículo", "Cantidad", dataset, PlotOrientation.VERTICAL, false, true, true);

                    BarRenderer renderer = null;
                    CategoryPlot plot = null;
                    renderer = new BarRenderer();
                    ChartFrame frame = new ChartFrame("Artículo", chart);
                    frame.setVisible(true);
                    frame.setSize(400, 650);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
      }
//   if(RadioButtonBarras.isSelected()){
//               try {
//                    String consulta = "SELECT articulo,MAX(detalle_operacion.cantidad)AS cantidad,fecha FROM operacion INNER JOIN detalle_operacion ON operacion.idoperacion=detalle_operacion.idoperacion INNER JOIN articulos ON detalle_operacion.idarticulo=articulos.idarticulo WHERE fecha LIKE '"+d+"%'"+"or '"+h+"%' GROUP BY articulo";
//                    JDBCCategoryDataset dataset = new JDBCCategoryDataset(cm.Conectar(), consulta);
//                    JFreeChart chart = ChartFactory.createBarChart("Artículos más Comprados Por Fecha", "Artículo", "Cantidad", dataset, PlotOrientation.HORIZONTAL, false, true, true);
//
//                    BarRenderer renderer = null;
//                    CategoryPlot plot = null;
//                    renderer = new BarRenderer();
//                    ChartFrame frame = new ChartFrame("Artículo", chart);
//                    frame.setVisible(true);
//                    frame.setSize(400, 650);
//                } catch (Exception e) {
//                    JOptionPane.showMessageDialog(null, e);
//                }
//           
//           }else  if(RadioButtonPastel.isSelected()){
//               try {
//                    String consulta = "SELECT articulo,max(detalle_operacion.cantidad)AS cantidad,fecha FROM operacion INNER JOIN detalle_operacion ON operacion.idoperacion=detalle_operacion.idoperacion INNER JOIN articulos ON detalle_operacion.idarticulo=articulos.idarticulo WHERE fecha LIKE '"+d+"%'"+"or '"+h+"%' GROUP BY articulo";
//                    JDBCCategoryDataset dataset = new JDBCCategoryDataset(cm.Conectar(), consulta);
//                    JFreeChart chart = ChartFactory.createMultiplePieChart3D("Artículos más Comprados Por Fecha", dataset, TableOrder.BY_COLUMN,true,true,true);
//                    BarRenderer renderer = null;
//                    CategoryPlot plot = null;
//                    renderer = new BarRenderer();
//                    ChartFrame frame = new ChartFrame("Artículo", chart);
//                    frame.setVisible(true);
//                    frame.setSize(400, 650);
//                } catch (Exception e) {
//                    JOptionPane.showMessageDialog(null, e);
//                }
//               }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteGráficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteGráficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteGráficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteGráficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteGráficos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PANEL;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public org.edisoncor.gui.button.ButtonTask buttonTaskCERRAR;
    private javax.swing.JCheckBox jCheckBoxAREA;
    private javax.swing.JCheckBox jCheckBoxBARRAS;
    private javax.swing.JCheckBox jCheckBoxTORTS;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBoxFILTRO1;
    private javax.swing.JComboBox jComboBoxFILTRO2;
    private com.toedter.calendar.JDateChooser jDateChooserDESDE;
    private com.toedter.calendar.JDateChooser jDateChooserHASTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

private void ReporteAtencionesGRAFICOTORTA() {     
  try {           
        String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteAtenciones.jasper";
        JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   

//             Map parametro=new HashMap();
//             parametro.clear();
//             parametro.put("usuario",usuario);

         JasperPrint print=JasperFillManager.fillReport(reportes,null,cm.Conectar());             
         JasperViewer vista= new JasperViewer(print,false);
         vista.setVisible(true);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }              
}

private void ReporteAtencionesGRAFICOBARRAS() {
try {           
    String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteAtencionesGRAFICOBARRAS.jasper";
    JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   

//             Map parametro=new HashMap();
//             parametro.clear();
//             parametro.put("usuario",usuario);

     JasperPrint print=JasperFillManager.fillReport(reportes,null,cm.Conectar());             
     JasperViewer vista= new JasperViewer(print,false);
     vista.setVisible(true);
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
}
}

private void ReporteAtencionesGRAFICOAREA() {
 try {           
    String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteAtencionesGRAFICOAREA.jasper";
    JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   

//             Map parametro=new HashMap();
//             parametro.clear();
//             parametro.put("usuario",usuario);

     JasperPrint print=JasperFillManager.fillReport(reportes,null,cm.Conectar());             
     JasperViewer vista= new JasperViewer(print,false);
     vista.setVisible(true);
}catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage());

}
}   

    private void ReporteMedicamentosGRAFICOTORTA() {
      try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteMedicamentosGRAFICOTORTA.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
//             Map parametro=new HashMap();
//             parametro.clear();
//             parametro.put("usuario",usuario);
             
             JasperPrint print=JasperFillManager.fillReport(reportes,null,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    private void ReporteMedicamentosGRAFICOAREA() {
      try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteMedicamentosGRAFICOAREA.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
//             Map parametro=new HashMap();
//             parametro.clear();
//             parametro.put("usuario",usuario);
             
             JasperPrint print=JasperFillManager.fillReport(reportes,null,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    private void ReporteMedicamentosGRAFICOBARRAS() {
       try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteMedicamentosGRAFICOBARRAS.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
//             Map parametro=new HashMap();
//             parametro.clear();
//             parametro.put("usuario",usuario);
             
             JasperPrint print=JasperFillManager.fillReport(reportes,null,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

private void ReporteOperacionesGRAFICOTORTA() {
    try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteperacionesMasSolicitadasGRAFICOTORTA.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
//             Map parametro=new HashMap();
//             parametro.clear();
//             parametro.put("usuario",usuario);
             
             JasperPrint print=JasperFillManager.fillReport(reportes,null,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}

private void ReporteOperacionesGRAFICOBARRAS() {
   try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteGRAFICOOperacionesMasSolicitadas.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
//             Map parametro=new HashMap();
//             parametro.clear();
//             parametro.put("usuario",usuario);
             
             JasperPrint print=JasperFillManager.fillReport(reportes,null,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}

private void ReporteOperacionesGRAFICOAREA() {
  try {           
            String ubicacion=System.getProperty("user.dir")+"/src/REPORTES/ReporteOperacionesxClienteGRAFICOAREA.jasper";
            JasperReport reportes=(JasperReport) JRLoader.loadObject(ubicacion);   
           
//             Map parametro=new HashMap();
//             parametro.clear();
//             parametro.put("usuario",usuario);
             
             JasperPrint print=JasperFillManager.fillReport(reportes,null,cm.Conectar());             
             JasperViewer vista= new JasperViewer(print,false);
             vista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}

    private void Deshabilitar() {
     this.jComboBoxFILTRO1.setEnabled(false);
     this.jComboBoxFILTRO2.setEnabled(false);
     this.jDateChooserDESDE.setEnabled(false);
     this.jDateChooserHASTA.setEnabled(false);
    }
}
