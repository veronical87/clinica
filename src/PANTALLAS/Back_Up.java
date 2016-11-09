package PANTALLAS;
import Conexion.ConexionMySQL;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.edisoncor.gui.button.ButtonTask;
public class Back_Up extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    Pintando pintar = new Pintando();
    public Back_Up(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        buttonTaskAGREGAR = new org.edisoncor.gui.button.ButtonTask();
        buttonTaskCANCELAR = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRectTranslucido1.setPreferredSize(new java.awt.Dimension(393, 356));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BACK UP");

        barraProgreso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        barraProgreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonTaskAGREGAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskAGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/select_48.png"))); // NOI18N
        buttonTaskAGREGAR.setText("SELECCIONAR");
        buttonTaskAGREGAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskAGREGAR.setCategorySmallFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        buttonTaskAGREGAR.setDefaultCapable(false);
        buttonTaskAGREGAR.setDescription("..");
        buttonTaskAGREGAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskAGREGARActionPerformed(evt);
            }
        });

        buttonTaskCANCELAR.setForeground(new java.awt.Color(255, 255, 255));
        buttonTaskCANCELAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/rescindir-rojo-icono-6989-32.png"))); // NOI18N
        buttonTaskCANCELAR.setText("CANCELAR");
        buttonTaskCANCELAR.setCategoryFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonTaskCANCELAR.setCategorySmallFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        buttonTaskCANCELAR.setDefaultCapable(false);
        buttonTaskCANCELAR.setDescription("..");
        buttonTaskCANCELAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonTaskCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskCANCELARActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addContainerGap(314, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTaskCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTaskCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTaskAGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int idusuario;
    private void buttonTaskAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskAGREGARActionPerformed
        try { 
//            Pintando pintar = new Pintando();
            pintar.start(); 
            GenerarBackupMySQL("root", "", "consultorio");
             pintar.stop();
//            pintar.start();
//            pintar.run();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_buttonTaskAGREGARActionPerformed

    private void buttonTaskCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskCANCELARActionPerformed
        dispose();
    }//GEN-LAST:event_buttonTaskCANCELARActionPerformed

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
            java.util.logging.Logger.getLogger(Back_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Back_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Back_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Back_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Back_Up dialog = new Back_Up(new javax.swing.JFrame(), true);
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
    private javax.swing.JProgressBar barraProgreso;
    public org.edisoncor.gui.button.ButtonTask buttonTaskAGREGAR;
    public org.edisoncor.gui.button.ButtonTask buttonTaskCANCELAR;
    private javax.swing.JLabel jLabel1;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

public void GenerarBackupMySQL(String us,String pas, String db)
     {
        int resp;
        
        JFileChooser buscar_archivo = new JFileChooser(System.getProperty("user.dir"));
        resp=buscar_archivo.showSaveDialog(this);
       
        if (resp==JFileChooser.APPROVE_OPTION)
        {
//            direccion.setText(buscar_archivo.getSelectedFile().toString());
            
            try
            {
                                
                File dir_mysql1 = new File("C:\\xampp\\mysql\\bin\\mysqldump.exe");
                 
                String direccion_mysql_server="";
                if(dir_mysql1.exists())
                {
                    direccion_mysql_server="C:\\xampp\\mysql\\bin\\mysqldump";
                    Runtime runtime = Runtime.getRuntime();
                    
                    File backupFile = new File(String.valueOf(buscar_archivo.getSelectedFile().toString())+".sql");
                    FileWriter fw = new FileWriter(backupFile);
                    Process child = runtime.exec(direccion_mysql_server+" --opt --password="+pas+" --user="+us+" --databases "+db+"");
                    InputStreamReader irs = new InputStreamReader(child.getInputStream());
                    BufferedReader br = new BufferedReader(irs);
 
                    String line;
                    while( (line=br.readLine()) != null ) {
                        fw.write(line + "\n");
                    }
                    fw.close();
                    irs.close();
                    br.close();
                    JOptionPane.showMessageDialog(null, "Sr.Usuario:La Copia de Seguridad se ha realizado con éxito","Verificar",JOptionPane. INFORMATION_MESSAGE);
                   
                   dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Sr.Usuario:La Copia de Seguridad No se Pudo realizar","Verificar Direccion del Servidor",JOptionPane.ERROR_MESSAGE);
                }                               
             
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Sr.Usuario:No se Generó la Copia de Seguridad del Sistema por el Siguiente Motivo:"+e.getMessage(), "Verificar",JOptionPane.ERROR_MESSAGE);
            }
        } else if (resp==JFileChooser.CANCEL_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Ha sido cancelada la generacion del Backup","Información",JOptionPane.INFORMATION_MESSAGE);
        }
     }
   
    public static boolean band = false;
    private static int tiempo = 100;
    public class Pintando extends Thread {
        boolean bandera = false;
        
        @Override
        
        public void run() throws NoSuchMethodError {
            
            while (true) {
                int i = 1;
                int x = 0;
                //mientra el trabajo en paralelo no finalice el jProgressBar continuara su animacion una y otra vez
                while (x <= tiempo) {
                    try {
                        Thread.sleep(100);
                        i = (i > 100) ? 1 : i + 1;
                        barraProgreso.setValue(i);
                        barraProgreso.repaint();

                    } catch (InterruptedException e) {
                    }
                    x++;
                }
                bandera = true;

                if (bandera) {
                    barraProgreso.setValue(100);
//                    JOptionPane.showMessageDialog(null, "La Copia de Seguridad se ha realizado con éxito");
                    break;//rompe ciclo    
                    

                }
                else {
                        barraProgreso.setValue(100);
                        JOptionPane.showMessageDialog(null, "La Copia de Seguridad fallo.");
                        break;
                    }
            }
//                this.destroy();          
        }
    }
}
