package PANTALLAS;
import CLASES.ClaseOperaciones;
import CLASES.JTextFieldToUpperCase;
import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SeccionesCirugia extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    DefaultTableModel modelo;
    CallableStatement cmd;   
    ClaseOperaciones seccion=new ClaseOperaciones();
    public SeccionesCirugia(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.jTextFieldZONA.setDocument(new JTextFieldToUpperCase());  
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextFieldZONA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        buttonTaskAGREGAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskQUITAR = new org.edisoncor.gui.button.ButtonTask();
        jPanel1 = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jRadioButtonATRAS = new javax.swing.JRadioButton();
        jRadioButtonCABEZAPERRO = new javax.swing.JRadioButton();
        jRadioButtonTRONCO = new javax.swing.JRadioButton();
        jRadioButtonCUELLOPERRO = new javax.swing.JRadioButton();
        jRadioButtonPATASDELANTERAS = new javax.swing.JRadioButton();
        jRadioButtonCABEZAGATO = new javax.swing.JRadioButton();
        jRadioButtonPATASDELANTERASGATO = new javax.swing.JRadioButton();
        jRadioButtonCUELLOGATO = new javax.swing.JRadioButton();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonActionCANCELAR = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DETALLE CIRUGIA\n");

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Seccion a Operar", " " }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextFieldZONA.setEditable(false);
        jTextFieldZONA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldZONA.setForeground(new java.awt.Color(153, 0, 0));
        jTextFieldZONA.setText("jTextField1");
        jTextFieldZONA.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldZONACaretUpdate(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Zona");

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "LISTADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ZONAS", "SECCION"
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

        buttonTaskAGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/agregar-icono-5633-32.png"))); // NOI18N
        buttonTaskAGREGAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonTaskAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskAGREGARActionPerformed(evt);
            }
        });

        buttonTaskQUITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/eliminar-icono-6226-32.png"))); // NOI18N
        buttonTaskQUITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskQUITARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskQUITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTaskQUITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(141, 141, 175));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DETERMINA ZONA A OPERAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup1.add(jRadioButtonATRAS);
        jRadioButtonATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonATRASActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonCABEZAPERRO);
        jRadioButtonCABEZAPERRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCABEZAPERROActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonTRONCO);
        jRadioButtonTRONCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTRONCOActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonCUELLOPERRO);
        jRadioButtonCUELLOPERRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCUELLOPERROActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonPATASDELANTERAS);
        jRadioButtonPATASDELANTERAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPATASDELANTERASActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonCABEZAGATO);
        jRadioButtonCABEZAGATO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCABEZAGATOActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonPATASDELANTERASGATO);
        jRadioButtonPATASDELANTERASGATO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPATASDELANTERASGATOActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonCUELLOGATO);
        jRadioButtonCUELLOGATO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCUELLOGATOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jRadioButtonATRAS, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonPATASDELANTERAS, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jRadioButtonTRONCO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)))
                .addComponent(jRadioButtonCUELLOGATO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonCABEZAGATO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jRadioButtonCUELLOPERRO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonCABEZAPERRO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonPATASDELANTERASGATO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jRadioButtonCABEZAPERRO)
                .addGap(33, 33, 33)
                .addComponent(jRadioButtonCUELLOPERRO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonTRONCO)
                                .addGap(5, 5, 5)
                                .addComponent(jRadioButtonPATASDELANTERAS)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelImage1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jRadioButtonCUELLOGATO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jRadioButtonPATASDELANTERASGATO)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonATRAS)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonCABEZAGATO)
                        .addGap(131, 131, 131))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        buttonActionGUARDAR.setText("GUARDAR");
        buttonActionGUARDAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionGUARDAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonActionGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionGUARDARActionPerformed(evt);
            }
        });

        buttonActionCANCELAR.setText("CANCELAR");
        buttonActionCANCELAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionCANCELAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldZONA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int IDOperacion,idespecie,ATRAS,CABEZA,CUELLO,PATASDELANTERAS,TRONCO;String mascota;
    private void jRadioButtonATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonATRASActionPerformed
        if(this.jRadioButtonATRAS.isSelected()){
           ATRAS=1;
          this.jTextFieldZONA.setText("EXTREMIDADES POSTERIORES Y COLA"); 
        }else{
          ATRAS=0;
        }     
    }//GEN-LAST:event_jRadioButtonATRASActionPerformed

    private void jRadioButtonPATASDELANTERASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPATASDELANTERASActionPerformed
       if(jRadioButtonPATASDELANTERAS.isSelected()){
          this.jTextFieldZONA.setText("EXTREMIDADES DELANTERAS");
          PATASDELANTERAS=1;
       }else{
         PATASDELANTERAS=0;
       }        
    }//GEN-LAST:event_jRadioButtonPATASDELANTERASActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked

    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TABLAComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLAComponentMoved

    private void buttonTaskAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARActionPerformed
      if(IDSECCION==0){
            JOptionPane.showMessageDialog(null,"Debe Determinar la Seccion de la Zona Seleccionada","Informacion",JOptionPane.INFORMATION_MESSAGE);
        }else{
            seccion.agregarSeccionxOperacion(IDOperacion,IDSECCION);
            limpiarTabla(TABLA);
            modelo = (DefaultTableModel) TABLA.getModel();
            seccion.LlenarTablaSecciones(modelo,IDOperacion);
                        
        }
    }//GEN-LAST:event_buttonTaskAGREGARActionPerformed

    private void buttonTaskQUITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskQUITARActionPerformed
        if(IDSECCION!=0){             
            seccion.quitarseccionxOperacion(IDOperacion,IDSECCION);
            
            limpiarTabla(TABLA);
            modelo = (DefaultTableModel) TABLA.getModel();
            seccion.LlenarTablaSecciones(modelo,IDOperacion);
        }else{
            JOptionPane.showMessageDialog(null,"Debe Seleccionar un Ítem de la Lista","Información",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonTaskQUITARActionPerformed

    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
     AltaCirugia ac= new AltaCirugia(new javax.swing.JFrame(),true);
     ac.BuscarDatosMascota(mascota);
       if(idespecie==1){  /////PERRO
            if(ATRAS!=0){                 
                ac.jButton1.setIcon(new ImageIcon(getClass().getResource("/seccion-colayPataTrasera.png")));
            }else if(PATASDELANTERAS!=0){
                ac.jButton1.setIcon(new ImageIcon(getClass().getResource("/siluetadeperro-PATASDELANTERAS.png")));
            }if(CABEZA!=0){
                ac.jButton1.setIcon(new ImageIcon(getClass().getResource("/siluetadeperro-ROSTRO.png")));
            }if(TRONCO!=0){
                ac.jButton1.setIcon(new ImageIcon(getClass().getResource("/siluetadeperro-TRONCO.png")));
            }if(CUELLO!=0){
                ac.jButton1.setIcon(new ImageIcon(getClass().getResource("/siluetadeperro-CUELLO.png")));
            }
        }else if (idespecie==2){       
          if(ATRAS!=0){
              ac.jButton1.setIcon(new ImageIcon(getClass().getResource("/silueta de gato2-ATRAS.png")));
            }else if(PATASDELANTERAS!=0){
              ac.jButton1.setIcon(new ImageIcon(getClass().getResource("/silueta de gato2-PATASDELANTERAS.png")));
            }if(CABEZA!=0){
              ac.jButton1.setIcon(new ImageIcon(getClass().getResource("/silueta de gato2-CABEZA.png")));
            }if(TRONCO!=0){
              ac.jButton1.setIcon(new ImageIcon(getClass().getResource("/silueta de gato2-TRONCO.png")));
            }if(CUELLO!=0){
              ac.jButton1.setIcon(new ImageIcon(getClass().getResource("/silueta de gato2-CUELLO.png")));
            }
       }
        
        this.dispose();
        ac.show();
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void buttonActionCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionCANCELARActionPerformed
        AltaCirugia ac= new AltaCirugia(new javax.swing.JFrame(),true);//      
//       
        this.dispose();
        ac.show();
    }//GEN-LAST:event_buttonActionCANCELARActionPerformed

    private void jTextFieldZONACaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldZONACaretUpdate
    
    }//GEN-LAST:event_jTextFieldZONACaretUpdate

    private void jRadioButtonTRONCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTRONCOActionPerformed
     if(jRadioButtonTRONCO.isSelected()){
        this.jTextFieldZONA.setText("TRONCO");
          TRONCO=1;
       }else{
           TRONCO=0;
     } 
    }//GEN-LAST:event_jRadioButtonTRONCOActionPerformed

    private void jRadioButtonCUELLOPERROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCUELLOPERROActionPerformed
      if(jRadioButtonPATASDELANTERAS.isSelected()){
          jTextFieldZONA.setText("CUELLO");
          CUELLO=1;
       }else{
          CUELLO=0;
      } 
    }//GEN-LAST:event_jRadioButtonCUELLOPERROActionPerformed

    private void jRadioButtonCABEZAPERROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCABEZAPERROActionPerformed
      if(jRadioButtonPATASDELANTERASGATO.isSelected()){
      this.jTextFieldZONA.setText("CABEZA");
      this.CABEZA=1;
      }else{
         CABEZA=0;
      }      
    }//GEN-LAST:event_jRadioButtonCABEZAPERROActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     String zona = this.jTextFieldZONA.getText();
     int indice = jComboBox1.getSelectedIndex();

        if (indice == -1) {
            BuscarCoincidenciasxSeccion(zona);
        }else{
            BuscarIDSeccion(zona);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButtonCABEZAGATOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCABEZAGATOActionPerformed
       if(this.jRadioButtonCABEZAGATO.isSelected()){
          this.jTextFieldZONA.setText("CABEZA");
          CABEZA=1;
       }else{
          CABEZA=0;
       }
    }//GEN-LAST:event_jRadioButtonCABEZAGATOActionPerformed

    private void jRadioButtonPATASDELANTERASGATOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPATASDELANTERASGATOActionPerformed
     if(jRadioButtonPATASDELANTERAS.isSelected()){
          this.jTextFieldZONA.setText("EXTREMIDADES DELANTERAS");
          PATASDELANTERAS=1;
       }else{
          PATASDELANTERAS=0;
     }
    }//GEN-LAST:event_jRadioButtonPATASDELANTERASGATOActionPerformed

    private void jRadioButtonCUELLOGATOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCUELLOGATOActionPerformed
     if(jRadioButtonPATASDELANTERAS.isSelected()){
          this.jTextFieldZONA.setText("CUELLO");
          CUELLO=1;
       }else{
          CUELLO=1;
     }
    }//GEN-LAST:event_jRadioButtonCUELLOGATOActionPerformed

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
      String zona = this.jTextFieldZONA.getText();
      LlenarComboSeccionesxZona(zona);
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible

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
            java.util.logging.Logger.getLogger(SeccionesCirugia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeccionesCirugia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeccionesCirugia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeccionesCirugia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SeccionesCirugia dialog = new SeccionesCirugia(new javax.swing.JFrame(), true);
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
    public javax.swing.JTable TABLA;
    private org.edisoncor.gui.button.ButtonAction buttonActionCANCELAR;
    private org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    private javax.swing.ButtonGroup buttonGroup1;
    private org.edisoncor.gui.button.ButtonTask buttonTaskAGREGAR;
    private org.edisoncor.gui.button.ButtonTask buttonTaskQUITAR;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JRadioButton jRadioButtonATRAS;
    public javax.swing.JRadioButton jRadioButtonCABEZAGATO;
    public javax.swing.JRadioButton jRadioButtonCABEZAPERRO;
    public javax.swing.JRadioButton jRadioButtonCUELLOGATO;
    public javax.swing.JRadioButton jRadioButtonCUELLOPERRO;
    public javax.swing.JRadioButton jRadioButtonPATASDELANTERAS;
    public javax.swing.JRadioButton jRadioButtonPATASDELANTERASGATO;
    public javax.swing.JRadioButton jRadioButtonTRONCO;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldZONA;
    public org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

 private void limpiarTabla(JTable tab) {
     while(tab.getRowCount()>0){//se recorren todas las filas
     ((javax.swing.table.DefaultTableModel) tab.getModel()).removeRow(0);
   }
    }

private void BuscarCoincidenciasxSeccion(String seccionSelec) {
   try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM secciones WHERE nombre LIKE '"+seccionSelec+"%'");                    
        while (rs.next()) {
           modeloCombo.addElement(rs.getString("nombre"));
        }
        rs.close();
        jComboBox1.setModel(modeloCombo);            
      }catch (SQLException ex) {
        ex.getMessage();
       }   
}

int IDSECCION;
private void BuscarIDSeccion(String seccionSelec) {
  try {       
    cn=cm.Conectar();
    Statement st = (Statement) cn.createStatement();
    ResultSet rs = st.executeQuery("SELECT id FROM secciones WHERE nombre LIKE '"+seccionSelec+"%'");

    while (rs.next()) {
       IDSECCION=rs.getInt("id");           
    }
    rs.close();         
           
    } catch (SQLException ex) {
        ex.getMessage();  
   }     
}

    private void LlenarComboSeccionesxZona(String zona) {
         try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT secciones.nombre FROM secciones INNER JOIN zonas ON secciones.idzona=zonas.id WHERE zonas.nombre LIKE '"+zona+"%' ORDER BY nombre ASC");

        while (rs.next()) {
           modeloCombo.addElement(rs.getString("secciones.nombre"));
        }
        rs.close();
        jComboBox1.setModel(modeloCombo);
    } catch (SQLException ex) {
        ex.getMessage();
    }
    }
}
