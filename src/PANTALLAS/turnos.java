package PANTALLAS;

import java.util.Calendar;
import javax.swing.JOptionPane;
public class turnos extends javax.swing.JDialog {
  Calendar Calendario = Calendar.getInstance();
    public turnos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fecha();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        buttonAction4 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 479));

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable2.setBackground(new java.awt.Color(0, 153, 153));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"     8:00"},
                {"     8:30"},
                {"     9:00"},
                {"     9:30"},
                {"    10:00"},
                {"    10:30"},
                {"    11:00"},
                {"    11:30"},
                {"    12:00"},
                {null},
                {"    16:00"},
                {"    16:30"},
                {"    17:00"},
                {"    17:30"},
                {"    18:00"},
                {"    18:30"},
                {"    19:00"},
                {"    19:30"},
                {"    20:00"},
                {"    20:30"},
                {"    21:00"}
            },
            new String [] {
                "    Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTable4.setBackground(new java.awt.Color(0, 153, 153));
        jTable4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGENDA DE TURNOS");

        buttonAction4.setBackground(new java.awt.Color(204, 204, 255));
        buttonAction4.setText("SALIR");

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(buttonAction4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAction4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
       public void run() {
                turnos dialog = new turnos(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonAction buttonAction4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

void fecha(){  
    Object fechaActual;
//    int año = Calendario.get(Calendar.YEAR);
    int mes = Calendario.get(Calendar.MONTH) + 1; 
    int dia = Calendario.get(Calendar.DAY_OF_MONTH);
    int diasemana =Calendario.get(Calendar.DAY_OF_WEEK);
    fechaActual=" "+dia+"/"+mes;
//    7 es el sabado
    if(diasemana==7){        
        Object fechaLUNES=dia+2+"/"+mes;
        this.jTable4.getModel().setValueAt(fechaLUNES,0,0);//lunes
        Object fechaMARTES=dia+3+"/"+mes;
        this.jTable4.getModel().setValueAt(fechaMARTES,0,1);// martes
        Object fechaMIERCOLES=dia+4+"/"+mes;
        this.jTable4.getModel().setValueAt(fechaMIERCOLES,0,2);// miercoles
        Object fechaJUEVES=dia+5+"/"+mes;
        this.jTable4.getModel().setValueAt(fechaJUEVES,0,3);// jueves
        Object fechaVIERNES=dia+6+"/"+mes;
        this.jTable4.getModel().setValueAt(fechaVIERNES,0,4);// viernes
        Object fechaSABADO=dia+7+"/"+mes;
        this.jTable4.getModel().setValueAt(fechaSABADO,0,5);// sabado
        
    }else{
    
    }

  
 }
}
