package PANTALLAS;

import Conexion.ConexionMySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    DefaultTableModel modelo;
    CallableStatement cmd;     
    public int usuario,ROL;
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        
        TURNOS.setToolTipText("<html><h4>TURNOS<br>Registrar,Editar,Borrar y Consultar los Datos de Turnos"+"<img src=\""+getClass().getResource("/ICONOS/Info.png")+"\"><br></h4></html>");
        PACIENTES.setToolTipText("<html><h4>PACIENTES<br>Registrar,Editar,Borrar y Consultar los Datos de las Mascotas Atendidas"+"<img src=\""+getClass().getResource("/ICONOS/Info.png")+"\"><br></h4></html>");
        CONFIG.setToolTipText("<html><h4>CONFIGURACIÓN<br>Permite Configurar los Parámetros tales como Provincias, Localidades, Tipo de Telefono,Raza,Especie al igual que Operaciones de Seguridad"+"<img src=\""+getClass().getResource("/ICONOS/Info.png")+"\"><br></h4></html>");
        AYUDA.setToolTipText("<html><h4>AYUDA<br>Manual del Usuario,explica el manejo del sistema"+"<img src=\""+getClass().getResource("/ICONOS/Info.png")+"\"><br></h4></html>");
        CERRAR_SESION.setToolTipText("<html><h4>CAMBIAR USUARIO<br>Cambia de Cuenta de Usuario para Ingresar al Sistema"+"<img src=\""+getClass().getResource("/ICONOS/Info.png")+"\"><br></h4></html>");
        SALIR.setToolTipText("<html><h4>SALIR<br>Salir del Sistema"+"<img src=\""+getClass().getResource("/ICONOS/Info.png")+"\"><br></h4></html>");
        GRAFICOS.setToolTipText("<html><h4>Gráficos Estadísticos<br>Genera Gráficos Estadísticos y Reportes"+"<img src=\""+getClass().getResource("/ICONOS/Info.png")+"\"><br></h4></html>");       
         
//        VERIFICARSITUACIONDEUDAPACIENTES();//CUANDO SE INICIA
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        jMenuBar1 = new javax.swing.JMenuBar();
        PACIENTES = new javax.swing.JMenu();
        jMenuItemFICHA = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemCIRUGIAS = new javax.swing.JMenuItem();
        LISTADOS = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemMEDICAMENTOS = new javax.swing.JMenuItem();
        jMenuItemESPECIES = new javax.swing.JMenuItem();
        jMenuItemRAZAS = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItemAFECCIONES = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemCATOPERACIONES = new javax.swing.JMenuItem();
        jMenuItemOPERACIONES = new javax.swing.JMenuItem();
        jMenuItemTIPOPELAJE = new javax.swing.JMenuItem();
        TURNOS = new javax.swing.JMenu();
        jMenuItemVETERINARIOS = new javax.swing.JMenuItem();
        GRAFICOS = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        CONFIG = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItemCATEGORIAS = new javax.swing.JMenuItem();
        jMenuSEGURIDAD = new javax.swing.JMenu();
        jMenuItemAUDITORIA = new javax.swing.JMenuItem();
        jMenuItemBACKUP = new javax.swing.JMenuItem();
        jMenuItemUSUARIOS = new javax.swing.JMenuItem();
        jMenuROLES = new javax.swing.JMenu();
        jMenuItemROLES = new javax.swing.JMenuItem();
        jMenuItemPERMISOS = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        AYUDA = new javax.swing.JMenu();
        CERRAR_SESION = new javax.swing.JMenu();
        SALIR = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pantalla Principal");

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/banner01.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1361, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        buttonAction1.setText("buttonAction1");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        PACIENTES.setBackground(new java.awt.Color(255, 255, 255));
        PACIENTES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/petdiary.png"))); // NOI18N
        PACIENTES.setText("MASCOTAS");
        PACIENTES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PACIENTES.setOpaque(true);

        jMenuItemFICHA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFICHA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemFICHA.setText("GESTIÓN DE FICHAS MEDICAS");
        jMenuItemFICHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFICHAActionPerformed(evt);
            }
        });
        PACIENTES.add(jMenuItemFICHA);

        jMenu4.setText("GESTIÓN DE ATENCIONES CLINICAS");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setText("CONSULTAS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItemCIRUGIAS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCIRUGIAS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemCIRUGIAS.setText("CIRUGIAS");
        jMenuItemCIRUGIAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCIRUGIASActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemCIRUGIAS);

        LISTADOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        LISTADOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LISTADOS.setText("LISTADOS DE ATENCIONES");
        LISTADOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTADOSActionPerformed(evt);
            }
        });
        jMenu4.add(LISTADOS);

        PACIENTES.add(jMenu4);

        jMenu2.setText("PARAMETROS");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItemMEDICAMENTOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMEDICAMENTOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemMEDICAMENTOS.setText("MEDICAMENTOS");
        jMenuItemMEDICAMENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMEDICAMENTOSActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemMEDICAMENTOS);

        jMenuItemESPECIES.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemESPECIES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemESPECIES.setLabel("ESPECIES");
        jMenuItemESPECIES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemESPECIESActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemESPECIES);

        jMenuItemRAZAS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemRAZAS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemRAZAS.setLabel("RAZAS");
        jMenuItemRAZAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRAZASActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemRAZAS);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem4.setText("VACUNAS POR ESPECIE Y EDAD");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItemAFECCIONES.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAFECCIONES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemAFECCIONES.setText("AFECCIONES");
        jMenuItemAFECCIONES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAFECCIONESActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAFECCIONES);

        jMenu3.setText("OPERACIONES");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItemCATOPERACIONES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemCATOPERACIONES.setText("CATEGORIAS");
        jMenuItemCATOPERACIONES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCATOPERACIONESActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCATOPERACIONES);

        jMenuItemOPERACIONES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemOPERACIONES.setText("TIPO DE OPERACIONES");
        jMenuItemOPERACIONES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOPERACIONESActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemOPERACIONES);

        jMenu2.add(jMenu3);

        jMenuItemTIPOPELAJE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemTIPOPELAJE.setText("TIPO PELAJE");
        jMenuItemTIPOPELAJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTIPOPELAJEActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemTIPOPELAJE);

        PACIENTES.add(jMenu2);

        jMenuBar1.add(PACIENTES);

        TURNOS.setBackground(new java.awt.Color(255, 255, 255));
        TURNOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/veterinarios.png"))); // NOI18N
        TURNOS.setText("VETERINARIOS");
        TURNOS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TURNOS.setOpaque(true);

        jMenuItemVETERINARIOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemVETERINARIOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemVETERINARIOS.setText("GESTIÓN DE VETERINARIOS");
        jMenuItemVETERINARIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVETERINARIOSActionPerformed(evt);
            }
        });
        TURNOS.add(jMenuItemVETERINARIOS);

        jMenuBar1.add(TURNOS);

        GRAFICOS.setBackground(new java.awt.Color(255, 255, 255));
        GRAFICOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/graficotorta.png"))); // NOI18N
        GRAFICOS.setText("REPORTES Y ESTADISTICAS");
        GRAFICOS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GRAFICOS.setOpaque(true);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem14.setText("REPORTES");
        GRAFICOS.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem15.setText("GRÁFICOS ESTADÍSTICOS\n");
        GRAFICOS.add(jMenuItem15);

        jMenuBar1.add(GRAFICOS);

        CONFIG.setBackground(new java.awt.Color(255, 255, 255));
        CONFIG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/configuracion.png"))); // NOI18N
        CONFIG.setText("CONFIGURACION");
        CONFIG.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CONFIG.setOpaque(true);
        CONFIG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFIGActionPerformed(evt);
            }
        });

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem3.setText("GESTIÓN PROVINCIAS");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        CONFIG.add(jMenuItem3);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem2.setText("GESTIÓN DE LOCALIDADES");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        CONFIG.add(jMenuItem2);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem16.setText("GESTIÓN TIPO TELÉFONO");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        CONFIG.add(jMenuItem16);

        jMenuItemCATEGORIAS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemCATEGORIAS.setText("GESTIÓN DE CATEGORIAS");
        jMenuItemCATEGORIAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCATEGORIASActionPerformed(evt);
            }
        });
        CONFIG.add(jMenuItemCATEGORIAS);

        jMenuSEGURIDAD.setText("GESTIÓN DE SEGURIDAD");
        jMenuSEGURIDAD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItemAUDITORIA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAUDITORIA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemAUDITORIA.setText("AUDITORIA");
        jMenuItemAUDITORIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAUDITORIAActionPerformed(evt);
            }
        });
        jMenuSEGURIDAD.add(jMenuItemAUDITORIA);

        jMenuItemBACKUP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemBACKUP.setText("BACK UP");
        jMenuItemBACKUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBACKUPActionPerformed(evt);
            }
        });
        jMenuSEGURIDAD.add(jMenuItemBACKUP);

        jMenuItemUSUARIOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemUSUARIOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemUSUARIOS.setText("GESTIÓN DE USUARIOS");
        jMenuItemUSUARIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUSUARIOSActionPerformed(evt);
            }
        });
        jMenuSEGURIDAD.add(jMenuItemUSUARIOS);

        jMenuROLES.setText("ROLES");
        jMenuROLES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItemROLES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemROLES.setText("GESTIÓN DE TIPOS DE ROL");
        jMenuItemROLES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemROLESActionPerformed(evt);
            }
        });
        jMenuROLES.add(jMenuItemROLES);

        jMenuItemPERMISOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemPERMISOS.setText("GESTIÓN DE PERMISOS DE ACCESO");
        jMenuItemPERMISOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPERMISOSActionPerformed(evt);
            }
        });
        jMenuROLES.add(jMenuItemPERMISOS);

        jMenuSEGURIDAD.add(jMenuROLES);

        CONFIG.add(jMenuSEGURIDAD);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem5.setText("LOGO DE CLINICA");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        CONFIG.add(jMenuItem5);

        jMenuBar1.add(CONFIG);

        AYUDA.setBackground(new java.awt.Color(255, 255, 255));
        AYUDA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/InfoIcon.png"))); // NOI18N
        AYUDA.setText("AYUDA");
        AYUDA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AYUDA.setOpaque(true);
        AYUDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AYUDAMouseClicked(evt);
            }
        });
        AYUDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AYUDAActionPerformed(evt);
            }
        });
        jMenuBar1.add(AYUDA);

        CERRAR_SESION.setBackground(new java.awt.Color(255, 255, 255));
        CERRAR_SESION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/refrescar.png"))); // NOI18N
        CERRAR_SESION.setText("CERRAR SESION");
        CERRAR_SESION.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CERRAR_SESION.setOpaque(true);
        CERRAR_SESION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CERRAR_SESIONMouseClicked(evt);
            }
        });
        jMenuBar1.add(CERRAR_SESION);

        SALIR.setBackground(new java.awt.Color(255, 255, 255));
        SALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/cierre-icono-5903-64.png"))); // NOI18N
        SALIR.setText("SALIR");
        SALIR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SALIR.setOpaque(true);
        SALIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALIRMouseClicked(evt);
            }
        });
        jMenuBar1.add(SALIR);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFICHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFICHAActionPerformed
        int LEC=0,ESCR=0,MOD=0,ELIM=0;
        GestionFichas ge=new GestionFichas (new javax.swing.JFrame(), true);
        ge.IDROL=ROL;
        ge.idusuario=usuario;
        try {
            cn = cm.Conectar();
            String sql = "SELECT * FROM permisos WHERE idrol="+ROL;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                LEC=rs.getInt("L_FICHAMEDICA");
                ESCR = rs.getInt("ESC_FICHAMEDICA");
                MOD=rs.getInt("MOD_FICHAMEDICA");
                ELIM=rs.getInt("ELIM_FICHAMEDICA");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);            
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }     
        ge.show(); 
    }//GEN-LAST:event_jMenuItemFICHAActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    int LEC=0,ESCR=0,MOD=0,ELIM=0;

    Gestión_Provincias ge=new Gestión_Provincias(new javax.swing.JFrame(), true);
    ge.IDROL=ROL;

      try
        {
            cn=cm.Conectar();
            String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next())
            {                                
                LEC=rs.getInt("L_PROVINCIA");
                ESCR=rs.getInt("ESC_PROVINCIA");
                MOD=rs.getInt("MOD_PROVINCIA");
                ELIM=rs.getInt("ELIM_PROVINCIA");               
            }
                              
        }
            
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }    
          
      if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show(); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
    int LEC=0,ESCR=0,MOD=0,ELIM=0;
    Gestión_de_Tipo_Telefono ge=new Gestión_de_Tipo_Telefono(new javax.swing.JFrame(), true);
    
    ge.rol=ROL;
    try{
        cn = cm.Conectar();
        String sql = "SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            LEC=rs.getInt("L_TIPOTELEFONO");
            ESCR = rs.getInt("ESC_TIPOTELEFONO");
            MOD=rs.getInt("MOD_TIPOTELEFONO");
            ELIM=rs.getInt("ELIM_TIPOTELEFONO");
            }
        }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, ex);
        }
        
         if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
         ge.show();  
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItemUSUARIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUSUARIOSActionPerformed
  int LEC = 0, ESCR = 0, MOD = 0, ELIM = 0;
    GestionUsuarios ge=new GestionUsuarios(new javax.swing.JFrame(), true);
    ge.idusuario=usuario;
    ge.IDROL=ROL;
           
        try {
            cn = cm.Conectar();
            String sql = "SELECT * FROM permisos WHERE idrol="+ROL;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                LEC = rs.getInt("L_USUARIO");
                ESCR = rs.getInt("ESC_USUARIO");
                MOD = rs.getInt("MOD_USUARIO");
                ELIM = rs.getInt("ELIM_USUARIO");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

       if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);  
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);         
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();    
    }//GEN-LAST:event_jMenuItemUSUARIOSActionPerformed

    private void jMenuItemROLESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemROLESActionPerformed
  int LEC = 0, ESCR = 0, MOD = 0, ELIM = 0;
    Gestión_de_Tipos_Roles ge=new Gestión_de_Tipos_Roles(new javax.swing.JFrame(), true);
    ge.idusuario=usuario;
    ge.IDROL=ROL;
           
        try {
            cn = cm.Conectar();
            String sql = "SELECT * FROM permisos WHERE idrol="+ROL;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                LEC = rs.getInt("L_TIPOROL");
                ESCR = rs.getInt("ESC_TIPOROL");
                MOD = rs.getInt("MOD_TIPOROL");
                ELIM = rs.getInt("ELIM_TIPOROL");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);          
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show(); 
    }//GEN-LAST:event_jMenuItemROLESActionPerformed

    private void jMenuItemPERMISOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPERMISOSActionPerformed
    Gestión_Permisos_xRol ac=new Gestión_Permisos_xRol(new javax.swing.JFrame(), true);
       ac.IDROL=ROL;
       int ACTUALIZACION=0;
       try
        {
            cn=cm.Conectar();
            String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next())
            {                                
                ACTUALIZACION=rs.getInt("ACTUALIZAR_PERMISOS");            
            }                              
        }catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
       
        if(ACTUALIZACION!=0){
          ac.buttonTaskMODIFICAR.setEnabled(true);
       }else{
          ac.buttonTaskMODIFICAR.setEnabled(false);
       }
       
       ac.show();
    }//GEN-LAST:event_jMenuItemPERMISOSActionPerformed

    private void jMenuItemBACKUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBACKUPActionPerformed
    Back_Up bk=new Back_Up(new javax.swing.JFrame(), true);
      int LECTURA=0;
       try
        {
            cn=cm.Conectar();
            String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next())
            {                                
                LECTURA=rs.getInt("BACKUP");            
            }
                              
        }
            
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
       
       if(LECTURA!=0){
          bk.buttonTaskAGREGAR.setEnabled(true);
       }else{
          bk.buttonTaskCANCELAR.setEnabled(false);
       }
      bk.show();
    }//GEN-LAST:event_jMenuItemBACKUPActionPerformed

    private void jMenuItemAUDITORIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAUDITORIAActionPerformed
  Auditoria audi=new Auditoria(new javax.swing.JFrame(), true); 
      int LEC=0;
         try {
            cn = cm.Conectar();
            String sql = "SELECT * FROM permisos WHERE idrol="+ROL;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                LEC= rs.getInt("AUDITORIA");
            }

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
         
         if(LEC!=0){
            audi.ComboBoxOperaciones.setEnabled(true);
            audi.ComboBoxTablas.setEnabled(true);
            audi.ComboBoxUsuarios.setEnabled(true);
            audi.jDateChooser_Desde.setEnabled(true);
            audi.jDateChooser_Hasta.setEnabled(true);
            audi.jCheckBox1.setEnabled(true);
            audi.buttonTaskFILTRARDatos.setEnabled(true);
         }else{
            audi.buttonTaskFILTRARDatos.setEnabled(false);
            audi.ComboBoxOperaciones.setEnabled(false);
            audi.ComboBoxTablas.setEnabled(false);
            audi.ComboBoxUsuarios.setEnabled(false);
            audi.jDateChooser_Desde.setEnabled(false);
            audi.jDateChooser_Hasta.setEnabled(false);
            audi.jCheckBox1.setEnabled(false);
         }            
      audi.show();  
    }//GEN-LAST:event_jMenuItemAUDITORIAActionPerformed

    private void SALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALIRMouseClicked
     System.exit(0);
    }//GEN-LAST:event_SALIRMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     int LEC=0,ESCR=0,MOD=0,ELIM=0;
     Gestión_Localidades ge=new Gestión_Localidades(new javax.swing.JFrame(), true);       
     ge.IDROL=ROL;
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_LOCALIDAD");
            ESCR=rs.getInt("ESC_LOCALIDAD");
            MOD=rs.getInt("MOD_LOCALIDAD");
            ELIM=rs.getInt("ELIM_LOCALIDAD");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
    if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);    
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void CERRAR_SESIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CERRAR_SESIONMouseClicked
     IngresoSistema is=new IngresoSistema();
      is.IDROL=ROL;
      this.dispose();
      is.show();
    }//GEN-LAST:event_CERRAR_SESIONMouseClicked

    private void jMenuItemMEDICAMENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMEDICAMENTOSActionPerformed
    int LEC=0,ESCR=0,MOD=0,ELIM=0;
     
     GestionMedicamentos ge=new GestionMedicamentos(new javax.swing.JFrame(), true);       
     ge.IDROL=ROL;
     ge.IDUSUARIO=usuario;
     
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_MEDICAMENTO");
            ESCR=rs.getInt("ESC_MEDICAMENTO");
            MOD=rs.getInt("MOD_MEDICAMENTO");
            ELIM=rs.getInt("ELIM_MEDICAMENTO");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
      if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);   
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBox_CriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);         
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBox_CriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItemMEDICAMENTOSActionPerformed

    private void jMenuItemESPECIESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemESPECIESActionPerformed
    int LEC=0,ESCR=0,MOD=0,ELIM=0;
     
     GestionEspecies ge=new GestionEspecies(new javax.swing.JFrame(), true);       
     ge.IDROL=ROL;
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_ESPECIE");
            ESCR=rs.getInt("ESC_ESPECIE");
            MOD=rs.getInt("MOD_ESPECIE");
            ELIM=rs.getInt("ELIM_ESPECIE");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
        if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);        
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItemESPECIESActionPerformed

    private void jMenuItemRAZASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRAZASActionPerformed
     int LEC=0,ESCR=0,MOD=0,ELIM=0;
     
     GestionRazas ge=new GestionRazas(new javax.swing.JFrame(), true);       
     ge.IDROL=ROL;
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_RAZA");
            ESCR=rs.getInt("ESC_RAZA");
            MOD=rs.getInt("MOD_RAZA");
            ELIM=rs.getInt("ELIM_RAZA");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
        if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);  
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItemRAZASActionPerformed

    private void jMenuItemVETERINARIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVETERINARIOSActionPerformed
    int LEC=0,ESCR=0,MOD=0,ELIM=0;
     
     GestionVeterinarios ge=new GestionVeterinarios(new javax.swing.JFrame(), true);       
     ge.IDROL=ROL;
     ge.idusuario=usuario;
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_VETERINARIO");
            ESCR=rs.getInt("ESC_VETERINARIO");
            MOD=rs.getInt("MOD_VETERINARIO");
            ELIM=rs.getInt("ELIM_VETERINARIO");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
        if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);   
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBox_CriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);         
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBox_CriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItemVETERINARIOSActionPerformed

    private void jMenuItemCATEGORIASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCATEGORIASActionPerformed
     int LEC=0,ESCR=0,MOD=0,ELIM=0;
     
     GestionCategorias ge=new GestionCategorias(new javax.swing.JFrame(), true);       
     ge.idrol=ROL;
     
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_CATEGORIA");
            ESCR=rs.getInt("ESC_CATEGORIA");
            MOD=rs.getInt("MOD_CATEGORIA");
            ELIM=rs.getInt("ELIM_CATEGORIA");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
       if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);    
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBox_CriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);         
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBox_CriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBox_CriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItemCATEGORIASActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    int LEC=0,ESCR=0,MOD=0,ELIM=0;
     
     Consultas ge=new Consultas(new javax.swing.JFrame(), true);       
     ge.IDROL=ROL;
     ge.IDUSUARIO=usuario;
     
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_CONSULTA");
            ESCR=rs.getInt("ESC_CONSULTA");
            MOD=rs.getInt("MOD_CONSULTA");
            ELIM=rs.getInt("ELIM_CONSULTA");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
    if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);  
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     int LEC=0,ESCR=0,MOD=0,ELIM=0;
     
     GestionVacunas ge=new GestionVacunas(new javax.swing.JFrame(), true);       
     ge.IDROL=ROL;
    
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_VACUNA");
            ESCR=rs.getInt("ESC_VACUNA");
            MOD=rs.getInt("MOD_VACUNA");
            ELIM=rs.getInt("ELIM_VACUNA");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
    if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true); 
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItemAFECCIONESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAFECCIONESActionPerformed
    int LEC=0,ESCR=0,MOD=0,ELIM=0;
     
     GestionAfeccion ge=new GestionAfeccion(new javax.swing.JFrame(), true);       
     ge.IDROL=ROL;
    
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_AFECCION");
            ESCR=rs.getInt("ESC_AFECCION");
            MOD=rs.getInt("MOD_AFECCION");
            ELIM=rs.getInt("ELIM_AFECCION");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
    if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);  
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItemAFECCIONESActionPerformed

    private void jMenuItemCIRUGIASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCIRUGIASActionPerformed
     int LEC=0,ESCR=0,MOD=0,ELIM=0;
     
     GestionCirugia ge=new GestionCirugia(new javax.swing.JFrame(), true);       
     ge.IDROL=ROL;
    
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_CIRUGIA");
            ESCR=rs.getInt("ESC_CIRUGIA");
            MOD=rs.getInt("MOD_CIRUGIA");
            ELIM=rs.getInt("ELIM_CIRUGIA");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
    if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true); 
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItemCIRUGIASActionPerformed

    private void jMenuItemCATOPERACIONESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCATOPERACIONESActionPerformed
    int LEC=0,ESCR=0,MOD=0,ELIM=0;
     
    GestionCategoriasTipoOperacion ge=new GestionCategoriasTipoOperacion(new javax.swing.JFrame(), true);       
    ge.rol=ROL;
    
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_CATEGORIATIPO");
            ESCR=rs.getInt("ESC_CATEGORIATIPO");
            MOD=rs.getInt("MOD_CATEGORIATIPO");
            ELIM=rs.getInt("ELIM_CATEGORIATIPO");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
    if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true); 
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);         
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.jComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextFieldCriterioBuscado.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.jComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextFieldCriterioBuscado.setEnabled(true);
         ge.buttonTaskBORRAR.setEnabled(false);
         ge.buttonTaskEDITAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItemCATOPERACIONESActionPerformed

    private void jMenuItemOPERACIONESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOPERACIONESActionPerformed
       int LEC=0,ESCR=0,MOD=0,ELIM=0;
     
     GestionCirugia ge=new GestionCirugia(new javax.swing.JFrame(), true);       
     ge.IDROL=ROL;
    
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_CIRUGIA");
            ESCR=rs.getInt("ESC_CIRUGIA");
            MOD=rs.getInt("MOD_CIRUGIA");
            ELIM=rs.getInt("ELIM_CIRUGIA");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
    if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true); 
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItemOPERACIONESActionPerformed

    private void CONFIGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONFIGActionPerformed
           
    }//GEN-LAST:event_CONFIGActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
LogoVet lv=new LogoVet(new javax.swing.JFrame(), true);
      int ACTUALIZACION=0;
       try
        {   cn=cm.Conectar();
            String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next())
            {                                
                ACTUALIZACION=rs.getInt("LOGO");            
            }                              
        }            
        catch (SQLException ex)
        {
         JOptionPane.showMessageDialog(null, ex);
        }       
       if(ACTUALIZACION!=0){
          lv.buttonActionACTUALIZAR.setEnabled(true);
       }else{
          lv.buttonActionACTUALIZAR.setEnabled(false);
       }
      lv.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItemTIPOPELAJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTIPOPELAJEActionPerformed
     int LEC=0,ESCR=0,MOD=0,ELIM=0;     
     GestionPelajesxRaza ge=new GestionPelajesxRaza(new javax.swing.JFrame(), true);       
     ge.IDROL=ROL;
    
     try
        {
        cn=cm.Conectar();
        String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
          {                                
            LEC=rs.getInt("L_CIRUGIA");
            ESCR=rs.getInt("ESC_CIRUGIA");
            MOD=rs.getInt("MOD_CIRUGIA");
            ELIM=rs.getInt("ELIM_CIRUGIA");              
            }                              
        }            
        catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, ex);
        }
      
    if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD!=0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR==0 & MOD==0 & ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC!=0 & ESCR!=0 & MOD!=0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true); 
        }else if(LEC==0 & ESCR!=0 & MOD!=0 || ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
        }else if(LEC==0 & ESCR==0 & MOD==0 & ELIM==0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(LEC!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
        }else if(ESCR!=0){
         ge.buttonTaskAGREGAR.setEnabled(true);         
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(false);
         ge.JComboBoxCriterioSeleccionado.setEnabled(false);
         ge.jTextField_criteriodeBusqueda.setEnabled(false);
        }else if(MOD!=0){
          ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }else if(ELIM!=0){
         ge.buttonTaskAGREGAR.setEnabled(false);
         ge.buttonTaskBUSCAR.setEnabled(true);
         ge.JComboBoxCriterioSeleccionado.setEnabled(true);
         ge.jTextField_criteriodeBusqueda.setEnabled(true);
         ge.buttonTaskELIMINAR.setEnabled(false);
         ge.buttonTaskMODIFICAR.setEnabled(false);
         ge.TABLA.setEnabled(true);
        }
        ge.show();
    }//GEN-LAST:event_jMenuItemTIPOPELAJEActionPerformed

    private void AYUDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AYUDAActionPerformed
 
    }//GEN-LAST:event_AYUDAActionPerformed

    private void AYUDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AYUDAMouseClicked
      try {
              Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "src\\MANUAL DE USUARIO\\MANUAL DE USUARIO.pdf");
         }catch (Exception e){
             JOptionPane.showMessageDialog(rootPane, "Error al Abrir el Archivo", "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
    }//GEN-LAST:event_AYUDAMouseClicked

    private void LISTADOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTADOSActionPerformed
    LISTADO lv=new LISTADO(new javax.swing.JFrame(), true);
    lv.idrol=ROL;
    int ACTUALIZACION=0;
    
       try
        {   cn=cm.Conectar();
            String sql="SELECT * FROM permisos WHERE  idrol="+ROL;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next())
            {                                
                ACTUALIZACION=rs.getInt("LOGO");            
            }                              
        }            
        catch (SQLException ex)
        {
         JOptionPane.showMessageDialog(null, ex);
        }       
       if(ACTUALIZACION!=0){
          lv.buttonActionACTUALIZAR.setEnabled(true);
       }else{
          lv.buttonActionACTUALIZAR.setEnabled(false);
       }
      lv.show();
    }//GEN-LAST:event_LISTADOSActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AYUDA;
    private javax.swing.JMenu CERRAR_SESION;
    private javax.swing.JMenu CONFIG;
    private javax.swing.JMenu GRAFICOS;
    private javax.swing.JMenuItem LISTADOS;
    private javax.swing.JMenu PACIENTES;
    private javax.swing.JMenu SALIR;
    private javax.swing.JMenu TURNOS;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemAFECCIONES;
    private javax.swing.JMenuItem jMenuItemAUDITORIA;
    private javax.swing.JMenuItem jMenuItemBACKUP;
    private javax.swing.JMenuItem jMenuItemCATEGORIAS;
    private javax.swing.JMenuItem jMenuItemCATOPERACIONES;
    private javax.swing.JMenuItem jMenuItemCIRUGIAS;
    private javax.swing.JMenuItem jMenuItemESPECIES;
    private javax.swing.JMenuItem jMenuItemFICHA;
    private javax.swing.JMenuItem jMenuItemMEDICAMENTOS;
    private javax.swing.JMenuItem jMenuItemOPERACIONES;
    private javax.swing.JMenuItem jMenuItemPERMISOS;
    private javax.swing.JMenuItem jMenuItemRAZAS;
    private javax.swing.JMenuItem jMenuItemROLES;
    private javax.swing.JMenuItem jMenuItemTIPOPELAJE;
    private javax.swing.JMenuItem jMenuItemUSUARIOS;
    private javax.swing.JMenuItem jMenuItemVETERINARIOS;
    private javax.swing.JMenu jMenuROLES;
    private javax.swing.JMenu jMenuSEGURIDAD;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
