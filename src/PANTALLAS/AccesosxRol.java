package PANTALLAS;

import CLASES.ClasePERMISOS;
import Conexion.ConexionMySQL;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AccesosxRol extends javax.swing.JDialog {
    Connection cn;
    ConexionMySQL cm=new ConexionMySQL();
    DefaultTableModel modelo;
    CallableStatement cmd;
    ClasePERMISOS acceso=new ClasePERMISOS();
    public AccesosxRol(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); 
//        LLenarCombo();
//        jCheckBox1.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        RadioButtonL_FICHAMEDICA = new javax.swing.JRadioButton();
        RadioButtonESC_FICHAMEDICA = new javax.swing.JRadioButton();
        RadioButtonMOD_FICHAMEDICA = new javax.swing.JRadioButton();
        RadioButtonELIM_FICHAMEDICA = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        RadioButtonL_HORA = new javax.swing.JRadioButton();
        RadioButtonES_HORA = new javax.swing.JRadioButton();
        RadioButtonMOD_HORA = new javax.swing.JRadioButton();
        RadioButtonELIM_HORA = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        RadioButtonL_VETERINARIO = new javax.swing.JRadioButton();
        RadioButtonESC_VETERINARIO = new javax.swing.JRadioButton();
        RadioButtonMOD_VETERINARIO = new javax.swing.JRadioButton();
        RadioButtonELIM_VETERINARIO = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        RadioButtonL_MEDICAMENTO = new javax.swing.JRadioButton();
        RadioButtonESC_MEDICAMENTO = new javax.swing.JRadioButton();
        RadioButtonMOD_MEDICAMENTO = new javax.swing.JRadioButton();
        RadioButtonELIM_MEDICAMENTO = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        RadioButtonL_CATEGORIA = new javax.swing.JRadioButton();
        RadioButtonES_CATEGORIA = new javax.swing.JRadioButton();
        RadioButtonMOD_CATEGORIA = new javax.swing.JRadioButton();
        RadioButtonELI_CATEGORIA = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        RadioButtonL_CONSULTA = new javax.swing.JRadioButton();
        RadioButtonESC_CONSULTA = new javax.swing.JRadioButton();
        RadioButtonMOD_CONSULTA = new javax.swing.JRadioButton();
        RadioButtonELI_CONSULTA = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        RadioButtonL_RAZA = new javax.swing.JRadioButton();
        RadioButtonESC_RAZA = new javax.swing.JRadioButton();
        RadioButtonMOD_RAZA = new javax.swing.JRadioButton();
        RadioButtonELIM_RAZA = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        RadioButtonL_ESPECIE = new javax.swing.JRadioButton();
        RadioButtonESC_ESPECIE = new javax.swing.JRadioButton();
        RadioButtonMOD_ESPECIE = new javax.swing.JRadioButton();
        RadioButtonELIM_ESPECIE = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        RadioButtonL_U = new javax.swing.JRadioButton();
        RadioButtonES_U = new javax.swing.JRadioButton();
        RadioButtonMOD_U = new javax.swing.JRadioButton();
        RadioButtonELI_U = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        RadioButtonL_ROLES = new javax.swing.JRadioButton();
        RadioButtonES_ROLES = new javax.swing.JRadioButton();
        RadioButtonMOD_ROLES = new javax.swing.JRadioButton();
        RadioButtonELI_ROLES = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        RadioButtonL_CIRUGIA = new javax.swing.JRadioButton();
        RadioButtonESC_CIRUGIA = new javax.swing.JRadioButton();
        RadioButtonMOD_CIRUGIA = new javax.swing.JRadioButton();
        RadioButtonELI_CIRUGIA = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxRoles = new javax.swing.JComboBox();
        jPanel12 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        RadioButtonL_AUDITORIA = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        RadioButtonL_REPORTES = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        RadioButtonL_ACCESO = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        RadioButtonL_BACKUP = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        RadioButtonL_ESTADISTICA = new javax.swing.JRadioButton();
        jPanel27 = new javax.swing.JPanel();
        RadioButtonL_LOCALIDAD = new javax.swing.JRadioButton();
        RadioButtonES_LOCALIDAD = new javax.swing.JRadioButton();
        RadioButtonMOD_LOCALIDAD = new javax.swing.JRadioButton();
        RadioButtonELI_LOCALIDAD = new javax.swing.JRadioButton();
        jPanel28 = new javax.swing.JPanel();
        RadioButtonL_TELEFONO = new javax.swing.JRadioButton();
        RadioButtonES_TELEFONO = new javax.swing.JRadioButton();
        RadioButtonMOD_TELEFONO = new javax.swing.JRadioButton();
        RadioButtonELI_TELEFONO = new javax.swing.JRadioButton();
        jPanel33 = new javax.swing.JPanel();
        RadioButtonL_TIPOOPERACION = new javax.swing.JRadioButton();
        RadioButtonES_TIPOOPERACION = new javax.swing.JRadioButton();
        RadioButtonMOD_TIPOOPERACION = new javax.swing.JRadioButton();
        RadioButtonELI_TIPOOPERACION = new javax.swing.JRadioButton();
        jPanel36 = new javax.swing.JPanel();
        RadioButtonL_AFECCION = new javax.swing.JRadioButton();
        RadioButtonES_AFECCION = new javax.swing.JRadioButton();
        RadioButtonMOD_AFECCION = new javax.swing.JRadioButton();
        RadioButtonELI_AFECCION = new javax.swing.JRadioButton();
        jPanelLOGO = new javax.swing.JPanel();
        RadioButtonM_LOGO = new javax.swing.JRadioButton();
        jPanel40 = new javax.swing.JPanel();
        RadioButtonL_PELAJE = new javax.swing.JRadioButton();
        RadioButtonES_PELAJE = new javax.swing.JRadioButton();
        RadioButtonMOD_PELAJE = new javax.swing.JRadioButton();
        RadioButtonELI_PELAJE = new javax.swing.JRadioButton();
        jPanel26 = new javax.swing.JPanel();
        RadioButtonL_PROVINCIA = new javax.swing.JRadioButton();
        RadioButtonES_PROVINCIA = new javax.swing.JRadioButton();
        RadioButtonMOD_PROVINCIA = new javax.swing.JRadioButton();
        RadioButtonELI_PROVINCIA = new javax.swing.JRadioButton();
        jPanel35 = new javax.swing.JPanel();
        RadioButtonL_VACUNA = new javax.swing.JRadioButton();
        RadioButtonES_VACUNA = new javax.swing.JRadioButton();
        RadioButtonMOD_VACUNA = new javax.swing.JRadioButton();
        RadioButtonELI_VACUNA = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        RadioButtonL_LISTADO = new javax.swing.JRadioButton();
        RadioButtonELIM_LISTADO = new javax.swing.JRadioButton();
        jPanel34 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        buttonActionGUARDAR = new org.edisoncor.gui.button.ButtonAction();
        buttonActionCANCELAR = new org.edisoncor.gui.button.ButtonAction();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GESTIÓN DE PERMISOS POR ROL");

        jPanel1.setBackground(new java.awt.Color(141, 141, 175));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBackground(new java.awt.Color(141, 141, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN FICHA MEDICA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_FICHAMEDICA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_FICHAMEDICA.setText("L");
        RadioButtonL_FICHAMEDICA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonL_FICHAMEDICAActionPerformed(evt);
            }
        });

        RadioButtonESC_FICHAMEDICA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonESC_FICHAMEDICA.setText("E");

        RadioButtonMOD_FICHAMEDICA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_FICHAMEDICA.setText("M");

        RadioButtonELIM_FICHAMEDICA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELIM_FICHAMEDICA.setText("B");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_FICHAMEDICA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonESC_FICHAMEDICA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_FICHAMEDICA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELIM_FICHAMEDICA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_FICHAMEDICA)
                    .addComponent(RadioButtonESC_FICHAMEDICA)
                    .addComponent(RadioButtonMOD_FICHAMEDICA)
                    .addComponent(RadioButtonELIM_FICHAMEDICA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(141, 141, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN HORARIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_HORA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_HORA.setText("L");

        RadioButtonES_HORA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonES_HORA.setText("E");

        RadioButtonMOD_HORA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_HORA.setText("M");

        RadioButtonELIM_HORA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELIM_HORA.setText("B");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_HORA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonES_HORA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_HORA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELIM_HORA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_HORA)
                    .addComponent(RadioButtonES_HORA)
                    .addComponent(RadioButtonMOD_HORA)
                    .addComponent(RadioButtonELIM_HORA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(141, 141, 175));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN VETERINARIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_VETERINARIO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_VETERINARIO.setText("L");

        RadioButtonESC_VETERINARIO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonESC_VETERINARIO.setText("E");

        RadioButtonMOD_VETERINARIO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_VETERINARIO.setText("M");

        RadioButtonELIM_VETERINARIO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELIM_VETERINARIO.setText("B");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_VETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonESC_VETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_VETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELIM_VETERINARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_VETERINARIO)
                    .addComponent(RadioButtonESC_VETERINARIO)
                    .addComponent(RadioButtonMOD_VETERINARIO)
                    .addComponent(RadioButtonELIM_VETERINARIO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(141, 141, 175));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN MEDICAMENTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_MEDICAMENTO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_MEDICAMENTO.setText("L");

        RadioButtonESC_MEDICAMENTO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonESC_MEDICAMENTO.setText("E");

        RadioButtonMOD_MEDICAMENTO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_MEDICAMENTO.setText("M");

        RadioButtonELIM_MEDICAMENTO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELIM_MEDICAMENTO.setText("B");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_MEDICAMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonESC_MEDICAMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_MEDICAMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELIM_MEDICAMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_MEDICAMENTO)
                    .addComponent(RadioButtonESC_MEDICAMENTO)
                    .addComponent(RadioButtonMOD_MEDICAMENTO)
                    .addComponent(RadioButtonELIM_MEDICAMENTO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(141, 141, 175));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "CATEGORIAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_CATEGORIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_CATEGORIA.setText("L");

        RadioButtonES_CATEGORIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonES_CATEGORIA.setText("E");

        RadioButtonMOD_CATEGORIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_CATEGORIA.setText("M");

        RadioButtonELI_CATEGORIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_CATEGORIA.setText("B");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_CATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonES_CATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_CATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_CATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_CATEGORIA)
                    .addComponent(RadioButtonES_CATEGORIA)
                    .addComponent(RadioButtonMOD_CATEGORIA)
                    .addComponent(RadioButtonELI_CATEGORIA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(141, 141, 175));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN CONSULTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_CONSULTA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_CONSULTA.setText("L");

        RadioButtonESC_CONSULTA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonESC_CONSULTA.setText("E");

        RadioButtonMOD_CONSULTA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_CONSULTA.setText("M");

        RadioButtonELI_CONSULTA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_CONSULTA.setText("B");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_CONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonESC_CONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_CONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_CONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_CONSULTA)
                    .addComponent(RadioButtonESC_CONSULTA)
                    .addComponent(RadioButtonMOD_CONSULTA)
                    .addComponent(RadioButtonELI_CONSULTA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(141, 141, 175));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN RAZAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_RAZA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_RAZA.setText("L");

        RadioButtonESC_RAZA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonESC_RAZA.setText("E");

        RadioButtonMOD_RAZA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_RAZA.setText("M");

        RadioButtonELIM_RAZA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELIM_RAZA.setText("B");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_RAZA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonESC_RAZA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_RAZA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELIM_RAZA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_RAZA)
                    .addComponent(RadioButtonESC_RAZA)
                    .addComponent(RadioButtonMOD_RAZA)
                    .addComponent(RadioButtonELIM_RAZA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(141, 141, 175));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN ESPECIES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_ESPECIE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_ESPECIE.setText("L");

        RadioButtonESC_ESPECIE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonESC_ESPECIE.setText("E");

        RadioButtonMOD_ESPECIE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_ESPECIE.setText("M");

        RadioButtonELIM_ESPECIE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELIM_ESPECIE.setText("B");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_ESPECIE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonESC_ESPECIE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_ESPECIE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELIM_ESPECIE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_ESPECIE)
                    .addComponent(RadioButtonESC_ESPECIE)
                    .addComponent(RadioButtonMOD_ESPECIE)
                    .addComponent(RadioButtonELIM_ESPECIE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(141, 141, 175));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN USUARIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_U.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_U.setText("L");

        RadioButtonES_U.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonES_U.setText("E");

        RadioButtonMOD_U.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_U.setText("M");

        RadioButtonELI_U.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_U.setText("B");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_U, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonES_U, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_U, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_U, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_U)
                    .addComponent(RadioButtonES_U)
                    .addComponent(RadioButtonMOD_U)
                    .addComponent(RadioButtonELI_U))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(141, 141, 175));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN ROLES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_ROLES.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_ROLES.setText("L");

        RadioButtonES_ROLES.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonES_ROLES.setText("E");

        RadioButtonMOD_ROLES.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_ROLES.setText("M");

        RadioButtonELI_ROLES.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_ROLES.setText("B");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_ROLES, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonES_ROLES, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_ROLES, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_ROLES, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_ROLES)
                    .addComponent(RadioButtonES_ROLES)
                    .addComponent(RadioButtonMOD_ROLES)
                    .addComponent(RadioButtonELI_ROLES))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(141, 141, 175));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN CIRUGIAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_CIRUGIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_CIRUGIA.setText("L");

        RadioButtonESC_CIRUGIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonESC_CIRUGIA.setText("E");

        RadioButtonMOD_CIRUGIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_CIRUGIA.setText("M");

        RadioButtonELI_CIRUGIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_CIRUGIA.setText("B");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_CIRUGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonESC_CIRUGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_CIRUGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_CIRUGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_CIRUGIA)
                    .addComponent(RadioButtonESC_CIRUGIA)
                    .addComponent(RadioButtonMOD_CIRUGIA)
                    .addComponent(RadioButtonELI_CIRUGIA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seleccionar Rol(*)");

        jComboBoxRoles.setEditable(true);
        jComboBoxRoles.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxRoles.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxRolesPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRolesActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(141, 141, 175));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel16.setBackground(new java.awt.Color(141, 141, 175));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "AUDITORIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_AUDITORIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_AUDITORIA.setText("L");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_AUDITORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_AUDITORIA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(141, 141, 175));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "REPORTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_REPORTES.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_REPORTES.setText("L");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_REPORTES, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_REPORTES)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(141, 141, 175));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ACCESOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_ACCESO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_ACCESO.setText("M");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_ACCESO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RadioButtonL_ACCESO)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(141, 141, 175));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "BACKUP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_BACKUP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_BACKUP.setText("L");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_BACKUP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RadioButtonL_BACKUP)
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(141, 141, 175));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GRAFÍCOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_ESTADISTICA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_ESTADISTICA.setText("L");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_ESTADISTICA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_ESTADISTICA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(141, 141, 175));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN LOCALIDADES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_LOCALIDAD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_LOCALIDAD.setText("L");

        RadioButtonES_LOCALIDAD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonES_LOCALIDAD.setText("E");

        RadioButtonMOD_LOCALIDAD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_LOCALIDAD.setText("M");

        RadioButtonELI_LOCALIDAD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_LOCALIDAD.setText("B");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_LOCALIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonES_LOCALIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_LOCALIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_LOCALIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_LOCALIDAD)
                    .addComponent(RadioButtonES_LOCALIDAD)
                    .addComponent(RadioButtonMOD_LOCALIDAD)
                    .addComponent(RadioButtonELI_LOCALIDAD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(141, 141, 175));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN TIPO TELÉFONO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_TELEFONO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_TELEFONO.setText("L");

        RadioButtonES_TELEFONO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonES_TELEFONO.setText("E");

        RadioButtonMOD_TELEFONO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_TELEFONO.setText("M");

        RadioButtonELI_TELEFONO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_TELEFONO.setText("B");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonES_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_TELEFONO)
                    .addComponent(RadioButtonES_TELEFONO)
                    .addComponent(RadioButtonMOD_TELEFONO)
                    .addComponent(RadioButtonELI_TELEFONO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel33.setBackground(new java.awt.Color(141, 141, 175));
        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN TIPO OPERACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_TIPOOPERACION.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_TIPOOPERACION.setText("L");

        RadioButtonES_TIPOOPERACION.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonES_TIPOOPERACION.setText("E");

        RadioButtonMOD_TIPOOPERACION.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_TIPOOPERACION.setText("M");

        RadioButtonELI_TIPOOPERACION.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_TIPOOPERACION.setText("B");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_TIPOOPERACION, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonES_TIPOOPERACION, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_TIPOOPERACION, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_TIPOOPERACION, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_TIPOOPERACION)
                    .addComponent(RadioButtonES_TIPOOPERACION)
                    .addComponent(RadioButtonMOD_TIPOOPERACION)
                    .addComponent(RadioButtonELI_TIPOOPERACION))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel36.setBackground(new java.awt.Color(141, 141, 175));
        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN AFECCIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_AFECCION.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_AFECCION.setText("L");

        RadioButtonES_AFECCION.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonES_AFECCION.setText("E");

        RadioButtonMOD_AFECCION.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_AFECCION.setText("M");

        RadioButtonELI_AFECCION.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_AFECCION.setText("B");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_AFECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonES_AFECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_AFECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_AFECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_AFECCION)
                    .addComponent(RadioButtonES_AFECCION)
                    .addComponent(RadioButtonMOD_AFECCION)
                    .addComponent(RadioButtonELI_AFECCION))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLOGO.setBackground(new java.awt.Color(141, 141, 175));
        jPanelLOGO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "LOGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonM_LOGO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonM_LOGO.setText("M");

        javax.swing.GroupLayout jPanelLOGOLayout = new javax.swing.GroupLayout(jPanelLOGO);
        jPanelLOGO.setLayout(jPanelLOGOLayout);
        jPanelLOGOLayout.setHorizontalGroup(
            jPanelLOGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLOGOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonM_LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelLOGOLayout.setVerticalGroup(
            jPanelLOGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLOGOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RadioButtonM_LOGO)
                .addContainerGap())
        );

        jPanel40.setBackground(new java.awt.Color(141, 141, 175));
        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN TIPO PELAJE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_PELAJE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_PELAJE.setText("L");

        RadioButtonES_PELAJE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonES_PELAJE.setText("E");

        RadioButtonMOD_PELAJE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_PELAJE.setText("M");

        RadioButtonELI_PELAJE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_PELAJE.setText("B");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_PELAJE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonES_PELAJE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_PELAJE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_PELAJE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_PELAJE)
                    .addComponent(RadioButtonES_PELAJE)
                    .addComponent(RadioButtonMOD_PELAJE)
                    .addComponent(RadioButtonELI_PELAJE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(141, 141, 175));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN PROVINCIAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_PROVINCIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_PROVINCIA.setText("L");

        RadioButtonES_PROVINCIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonES_PROVINCIA.setText("E");

        RadioButtonMOD_PROVINCIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_PROVINCIA.setText("M");

        RadioButtonELI_PROVINCIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_PROVINCIA.setText("B");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_PROVINCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonES_PROVINCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_PROVINCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_PROVINCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_PROVINCIA)
                    .addComponent(RadioButtonES_PROVINCIA)
                    .addComponent(RadioButtonMOD_PROVINCIA)
                    .addComponent(RadioButtonELI_PROVINCIA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel35.setBackground(new java.awt.Color(141, 141, 175));
        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GESTIÓN VACUNAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_VACUNA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_VACUNA.setText("L");

        RadioButtonES_VACUNA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonES_VACUNA.setText("E");

        RadioButtonMOD_VACUNA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonMOD_VACUNA.setText("M");

        RadioButtonELI_VACUNA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELI_VACUNA.setText("B");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_VACUNA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonES_VACUNA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonMOD_VACUNA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELI_VACUNA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_VACUNA)
                    .addComponent(RadioButtonES_VACUNA)
                    .addComponent(RadioButtonMOD_VACUNA)
                    .addComponent(RadioButtonELI_VACUNA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(141, 141, 175));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ATENCIONES ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        RadioButtonL_LISTADO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonL_LISTADO.setText("L");
        RadioButtonL_LISTADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonL_LISTADOActionPerformed(evt);
            }
        });

        RadioButtonELIM_LISTADO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioButtonELIM_LISTADO.setText("B");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonL_LISTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonELIM_LISTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonL_LISTADO)
                    .addComponent(RadioButtonELIM_LISTADO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addComponent(jPanelLOGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelLOGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "REFERENCIAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("L-LECTURA");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("E-ESCRITURA");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("M-MODIFICAR");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("B-BORRAR");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addGap(24, 24, 24))
        );

        buttonActionGUARDAR.setText("GUARDAR");
        buttonActionGUARDAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionGUARDARActionPerformed(evt);
            }
        });

        buttonActionCANCELAR.setText("CANCELAR");
        buttonActionCANCELAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonActionCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionCANCELARActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("SELECCIONAR TODOS");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(409, 409, 409))
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(325, 325, 325)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(400, 411, Short.MAX_VALUE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2))
                            .addComponent(jComboBoxRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActionGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActionCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
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
int idrolSeleccionado,ROL;
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    if(jCheckBox1.isSelected()){         
            RadioButtonL_AUDITORIA.setSelected(true);
            RadioButtonL_BACKUP.setSelected(true);
            RadioButtonL_ESTADISTICA.setSelected(true);
            RadioButtonL_ACCESO.setSelected(true);
            RadioButtonL_REPORTES.setSelected(true);
            
            this.RadioButtonELIM_LISTADO.setSelected(true);
            this.RadioButtonL_LISTADO.setSelected(true);
            RadioButtonL_FICHAMEDICA.setSelected(true);
            RadioButtonESC_FICHAMEDICA.setSelected(true);
            RadioButtonMOD_FICHAMEDICA.setSelected(true);
            RadioButtonELIM_FICHAMEDICA.setSelected(true);
            
            RadioButtonL_HORA.setSelected(true);
            RadioButtonES_HORA.setSelected(true);
            RadioButtonMOD_HORA.setSelected(true);
            RadioButtonELIM_HORA.setSelected(true);
            
            RadioButtonL_PROVINCIA.setSelected(true);  
            RadioButtonES_PROVINCIA.setSelected(true);        
            RadioButtonMOD_PROVINCIA.setSelected(true);        
            RadioButtonELI_PROVINCIA.setSelected(true);  
            
            RadioButtonL_LOCALIDAD.setSelected(true); 
            RadioButtonES_LOCALIDAD.setSelected(true);     
            RadioButtonMOD_LOCALIDAD.setSelected(true);
            RadioButtonELI_LOCALIDAD.setSelected(true); 
            
            RadioButtonL_TELEFONO.setSelected(true);            
            RadioButtonES_TELEFONO.setSelected(true);           
            RadioButtonMOD_TELEFONO.setSelected(true);           
            RadioButtonELI_TELEFONO.setSelected(true);
            
                   
            RadioButtonL_ESPECIE.setSelected(true);
            RadioButtonESC_ESPECIE.setSelected(true);
            RadioButtonMOD_ESPECIE.setSelected(true);
            RadioButtonELIM_ESPECIE.setSelected(true);
            
            RadioButtonL_RAZA.setSelected(true);
            RadioButtonESC_RAZA.setSelected(true);
            RadioButtonMOD_RAZA.setSelected(true);
            RadioButtonELIM_RAZA.setSelected(true);
            
            RadioButtonL_CONSULTA.setSelected(true);          
            RadioButtonESC_CONSULTA.setSelected(true);           
            RadioButtonMOD_CONSULTA.setSelected(true);         
            RadioButtonELI_CONSULTA.setSelected(true);
            
            RadioButtonL_U.setSelected(true);            
            RadioButtonES_U.setSelected(true);          
            RadioButtonMOD_U.setSelected(true);           
            RadioButtonELI_U.setSelected(true);    
            
            RadioButtonL_ROLES.setSelected(true);            
            RadioButtonES_ROLES.setSelected(true);            
            RadioButtonMOD_ROLES.setSelected(true);           
            RadioButtonELI_ROLES.setSelected(true); 
            
            RadioButtonL_MEDICAMENTO.setSelected(true);
            RadioButtonESC_MEDICAMENTO.setSelected(true);
            RadioButtonMOD_MEDICAMENTO.setSelected(true);
            RadioButtonELIM_MEDICAMENTO.setSelected(true);
           
                        
            RadioButtonL_CATEGORIA.setSelected(true);
            RadioButtonES_CATEGORIA.setSelected(true);
            RadioButtonMOD_CATEGORIA.setSelected(true);
            RadioButtonELI_CATEGORIA.setSelected(true);
            
                     
            RadioButtonL_VETERINARIO.setSelected(true);
            RadioButtonESC_VETERINARIO.setSelected(true);
            RadioButtonMOD_VETERINARIO.setSelected(true);
            RadioButtonELIM_VETERINARIO.setSelected(true);
            
            RadioButtonL_CIRUGIA.setSelected(true);
            RadioButtonESC_CIRUGIA.setSelected(true);
            RadioButtonMOD_CIRUGIA.setSelected(true);
            RadioButtonELI_CIRUGIA.setSelected(true);
            
            RadioButtonL_VACUNA.setSelected(true);
            RadioButtonES_VACUNA.setSelected(true);
            RadioButtonMOD_VACUNA.setSelected(true);
            RadioButtonELI_VACUNA.setSelected(true);
            
            RadioButtonL_AFECCION.setSelected(true);
            RadioButtonES_AFECCION.setSelected(true);
            RadioButtonMOD_AFECCION.setSelected(true);
            RadioButtonELI_AFECCION.setSelected(true);
            
            RadioButtonM_LOGO.setSelected(true);
            
            RadioButtonL_PELAJE.setSelected(true);
            RadioButtonES_PELAJE.setSelected(true);
            RadioButtonMOD_PELAJE.setSelected(true);
            RadioButtonELI_PELAJE.setSelected(true);
         }else{           
            RadioButtonL_REPORTES.setSelected(false);
            RadioButtonL_AUDITORIA.setSelected(false);
            RadioButtonL_BACKUP.setSelected(false);
            RadioButtonL_ESTADISTICA.setSelected(false);
            RadioButtonL_ACCESO.setSelected(false);
            
            RadioButtonELIM_LISTADO.setSelected(false);
            RadioButtonL_LISTADO.setSelected(false);
            
            RadioButtonL_FICHAMEDICA.setSelected(false);
            RadioButtonESC_FICHAMEDICA.setSelected(false);
            RadioButtonMOD_FICHAMEDICA.setSelected(false);
            RadioButtonELIM_FICHAMEDICA.setSelected(false);
            
            RadioButtonL_HORA.setSelected(false);
            RadioButtonES_HORA.setSelected(false);
            RadioButtonMOD_HORA.setSelected(false);
            RadioButtonELIM_HORA.setSelected(false);
            
                      
            RadioButtonL_PROVINCIA.setSelected(false);  
            RadioButtonES_PROVINCIA.setSelected(false);        
            RadioButtonMOD_PROVINCIA.setSelected(false);        
            RadioButtonELI_PROVINCIA.setSelected(false); 
            
            RadioButtonL_LOCALIDAD.setSelected(false);  
            RadioButtonES_LOCALIDAD.setSelected(false);     
            RadioButtonMOD_LOCALIDAD.setSelected(false);
            RadioButtonELI_LOCALIDAD.setSelected(false);    
            
            RadioButtonL_TELEFONO.setSelected(false);            
            RadioButtonES_TELEFONO.setSelected(false);           
            RadioButtonMOD_TELEFONO.setSelected(false);           
            RadioButtonELI_TELEFONO.setSelected(false) ; 
            
                             
            RadioButtonL_ESPECIE.setSelected(false);
            RadioButtonESC_ESPECIE.setSelected(false);
            RadioButtonMOD_ESPECIE.setSelected(false);
            RadioButtonELIM_ESPECIE.setSelected(false);
            
            RadioButtonL_RAZA.setSelected(false);
            RadioButtonESC_RAZA.setSelected(false);
            RadioButtonMOD_RAZA.setSelected(false);
            RadioButtonELIM_RAZA.setSelected(false);
            
                     
            RadioButtonL_CONSULTA.setSelected(false);          
            RadioButtonESC_CONSULTA.setSelected(false);           
            RadioButtonMOD_CONSULTA.setSelected(false);         
            RadioButtonELI_CONSULTA.setSelected(false); 
            
            RadioButtonL_U.setSelected(false);            
            RadioButtonES_U.setSelected(false);          
            RadioButtonMOD_U.setSelected(false);           
            RadioButtonELI_U.setSelected(false);    
            
            RadioButtonL_ROLES.setSelected(false);            
            RadioButtonES_ROLES.setSelected(false);            
            RadioButtonMOD_ROLES.setSelected(false);           
            RadioButtonELI_ROLES.setSelected(false);                       
                    
             RadioButtonL_MEDICAMENTO.setSelected(false);
            RadioButtonESC_MEDICAMENTO.setSelected(false);
            RadioButtonMOD_MEDICAMENTO.setSelected(false);
            RadioButtonELIM_MEDICAMENTO.setSelected(false);
           
                        
            RadioButtonL_CATEGORIA.setSelected(false);
            RadioButtonES_CATEGORIA.setSelected(false);
            RadioButtonMOD_CATEGORIA.setSelected(false);
            RadioButtonELI_CATEGORIA.setSelected(false);
            
                        
            RadioButtonL_VETERINARIO.setSelected(false);
            RadioButtonESC_VETERINARIO.setSelected(false);
            RadioButtonMOD_VETERINARIO.setSelected(false);
            RadioButtonELIM_VETERINARIO.setSelected(false);
            
            RadioButtonL_CIRUGIA.setSelected(false);
            RadioButtonESC_CIRUGIA.setSelected(false);
            RadioButtonMOD_CIRUGIA.setSelected(false);
            RadioButtonELI_CIRUGIA.setSelected(false);
            
             RadioButtonL_VACUNA.setSelected(false);
            RadioButtonES_VACUNA.setSelected(false);
            RadioButtonMOD_VACUNA.setSelected(false);
            RadioButtonELI_VACUNA.setSelected(false);
            
            RadioButtonL_AFECCION.setSelected(false);
            RadioButtonES_AFECCION.setSelected(false);
            RadioButtonMOD_AFECCION.setSelected(false);
            RadioButtonELI_AFECCION.setSelected(false);
            
            RadioButtonM_LOGO.setSelected(false);
            
            RadioButtonL_PELAJE.setSelected(false);
            RadioButtonES_PELAJE.setSelected(false);
            RadioButtonMOD_PELAJE.setSelected(false);
            RadioButtonELI_PELAJE.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBoxRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRolesActionPerformed
    String captura=String.valueOf(jComboBoxRoles.getModel().getSelectedItem());
    int indice=this.jComboBoxRoles.getSelectedIndex();
    
    if(indice==-1){
       BuscarCoincidencias(captura);
        LimpiarOpciones();
    }else{        
        BuscarDatos(captura);    
    }
    }//GEN-LAST:event_jComboBoxRolesActionPerformed

    private void jComboBoxRolesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxRolesPopupMenuWillBecomeVisible
    LLenarCombo();
    }//GEN-LAST:event_jComboBoxRolesPopupMenuWillBecomeVisible

    private void buttonActionGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionGUARDARActionPerformed
 int audi=0,res=0,REPORTES=0,GRAFICOS=0,L_VETERINARIO=0,ESC_VETERINARIO=0,MOD_VETERINARIO=0,ELIM_VETERINARIO=0,L_VACUNA=0,ESC_VACUNA=0,MOD_VACUNA=0,ELIM_VACUNA=0,L_AFECCION=0,ESC_AFECCION=0,MOD_AFECCION=0,ELIM_AFECCION=0,L_ESPECIE=0,ESC_ESPECIE=0,MOD_ESPECIE=0,ELIM_ESPECIE=0,L_RAZA=0,ESC_RAZA=0,MOD_RAZA=0,ELIM_RAZA=0,L_FICHAMEDICA=0,ESC_FICHAMEDICA=0,MOD_FICHAMEDICA=0,ELI_FICHAMEDICA=0,L_CONSULTA=0,ESC_CONSULTA=0,MOD_CONSULTA=0,ELI_CONSULTA=0,L_CIRUGIA=0,ESC_CIRUGIA=0,MOD_CIRUGIA=0,ELI_CIRUGIA=0,L_MEDICAMENTO=0,ESC_MEDICAMENTO=0,MOD_MEDICAMENTO=0,ELI_MEDICAMENTO=0,L_HORA=0,ESC_HORA=0,MOD_HORA=0,ELIM_HORA=0,L_LOC=0,ES_LOC=0,MOD_LOC=0,ELI_LOC=0,L_PROVINC=0,ES_PROVINC=0,MOD_PROVINC=0,ELI_PROVINC=0,L_USU=0,ES_USU=0,MOD_USU=0,ELI_USU=0,L_ROL=0,ES_ROL=0,MOD_ROL=0,ELI_ROL=0,L_TIPOTEL=0,ESC_TIPOTEL=0,MOD_TIPOTEL=0,ELI_TIPOTEL=0,PERMISO=0,L_CATEGORIA=0,ESC_CATEGORIA=0,MOD_CATEGORIA=0,ELI_CATEGORIA=0,L_CATOPERACION=0,ESC_CATOPERACION=0,MOD_CATOPERACION=0,ELIM_CATOPERACION=0,L_OPERACION=0,ESC_OPERACION=0,MOD_OPERACION=0,ELIM_OPERACION=0,L_PELAJE=0,ESC_PELAJE=0,MOD_PELAJE=0,ELIM_PELAJE=0,LOGO=0,L_LISTADO=0,ELIM_LISTADO=0;
 String RolSeleccionado=String.valueOf(jComboBoxRoles.getModel().getSelectedItem());
  
        int existe = acceso.ExisteRol_Pantallas(idrolSeleccionado);
       
             
        if (RadioButtonL_FICHAMEDICA.isSelected()) {
            L_FICHAMEDICA = 1;
        }
        if (RadioButtonESC_FICHAMEDICA.isSelected()) {
            ESC_FICHAMEDICA = 2;
        }
        if (RadioButtonMOD_FICHAMEDICA.isSelected()) {
            MOD_FICHAMEDICA = 3;
        }
        if (RadioButtonELIM_FICHAMEDICA.isSelected()) {
            ELI_FICHAMEDICA = 4;
        }
        
        
       if (RadioButtonL_ESPECIE.isSelected()) {
            L_ESPECIE = 1;
        }
        if (RadioButtonESC_ESPECIE.isSelected()) {
            ESC_ESPECIE = 2;
        }
        if (RadioButtonMOD_ESPECIE.isSelected()) {
            MOD_ESPECIE = 3;
        }
        if (RadioButtonELIM_ESPECIE.isSelected()) {
            ELIM_ESPECIE = 4;
        }
        
        if (RadioButtonL_RAZA.isSelected()) {
            L_RAZA = 1;
        }
        if (RadioButtonESC_RAZA.isSelected()) {
            ESC_RAZA = 2;
        }
        if (RadioButtonMOD_RAZA.isSelected()) {
            MOD_RAZA = 3;
        }
        if (RadioButtonELIM_RAZA.isSelected()) {
            ELIM_RAZA = 4;
        }
        
        if (RadioButtonL_MEDICAMENTO.isSelected()) {
            L_MEDICAMENTO = 1;
        }
        if (RadioButtonESC_MEDICAMENTO.isSelected()) {
            ESC_MEDICAMENTO = 2;
        }
        if (RadioButtonMOD_MEDICAMENTO.isSelected()) {
            MOD_MEDICAMENTO = 3;
        }
        if (RadioButtonELIM_MEDICAMENTO.isSelected()) {
            ELI_MEDICAMENTO= 4;
        }        
        
       if (RadioButtonL_HORA.isSelected()) {
            L_HORA = 1;
        }
        if (RadioButtonES_HORA.isSelected()) {
            ESC_HORA= 2;
        }
        if (RadioButtonMOD_HORA.isSelected()) {
            MOD_HORA = 3;
        }
        if (RadioButtonELIM_HORA.isSelected()) {
            ELIM_HORA = 4;
        }
        
        if (RadioButtonL_LOCALIDAD.isSelected()) {
            L_LOC = 1;
        }
        if (RadioButtonES_LOCALIDAD.isSelected()) {
            ES_LOC = 2;
        }
        if (RadioButtonMOD_LOCALIDAD.isSelected()) {
            MOD_LOC = 3;
        }
        if (RadioButtonELI_LOCALIDAD.isSelected()) {
            ELI_LOC = 4;
        }
        if (RadioButtonL_PROVINCIA.isSelected()) {
            L_PROVINC = 1;
        }
        if (RadioButtonES_PROVINCIA.isSelected()) {
            ES_PROVINC = 2;
        }
        if (RadioButtonMOD_PROVINCIA.isSelected()) {
            MOD_PROVINC = 3;
        }
        if (RadioButtonELI_PROVINCIA.isSelected()) {
            ELI_PROVINC = 4;
        }
  
         if (RadioButtonL_TELEFONO.isSelected()) {
            L_TIPOTEL = 1;
        }
        if (RadioButtonES_TELEFONO.isSelected()) {
            ESC_TIPOTEL = 2;
        }
        if (RadioButtonMOD_TELEFONO.isSelected()) {
            MOD_TIPOTEL = 3;
        }
        if (RadioButtonELI_TELEFONO.isSelected()) {
            ELI_TIPOTEL = 4;
        }
        
         if (RadioButtonL_U.isSelected()) {
            L_USU = 1;
        }
        if (RadioButtonES_U.isSelected()) {
            ES_USU = 2;
        }
        if (RadioButtonMOD_U.isSelected()) {
            MOD_USU = 3;
        }
        if (RadioButtonELI_U.isSelected()) {
            ELI_USU = 4;
        }
        
         if (RadioButtonL_ROLES.isSelected()) {
            L_ROL = 1;
        }
        if (RadioButtonES_ROLES.isSelected()) {
            ES_ROL = 2;
        }
        if (RadioButtonMOD_ROLES.isSelected()) {
            MOD_ROL = 3;
        }
        if (RadioButtonELI_ROLES.isSelected()) {
            ELI_ROL = 4;
        }
       
        
        if (RadioButtonL_AUDITORIA.isSelected()) {
            audi = 1;
        }
        if (RadioButtonL_BACKUP.isSelected()) {
            res = 2;
        }         
         if (RadioButtonL_ACCESO.isSelected()) {
            PERMISO = 1;
        } 
         
        if( RadioButtonL_VETERINARIO.isSelected()){
          L_VETERINARIO=1;
       }
        if(RadioButtonESC_VETERINARIO.isSelected()){
           ESC_VETERINARIO=2;
        }
        if(RadioButtonMOD_VETERINARIO.isSelected()){
           MOD_VETERINARIO=3;
        }
        if(RadioButtonELIM_VETERINARIO.isSelected()){
           ELIM_VETERINARIO=4;
        }
        
        if (RadioButtonL_REPORTES.isSelected()) {
            REPORTES = 1;
        }
        if (RadioButtonL_ESTADISTICA.isSelected()) {
            GRAFICOS = 1;
        }
        
        if (RadioButtonL_CONSULTA.isSelected()) {
            L_CONSULTA = 1;
        }
        if (RadioButtonESC_CONSULTA.isSelected()) {
            ESC_CONSULTA = 2;
        }
        if (RadioButtonMOD_CONSULTA.isSelected()) {
            MOD_CONSULTA = 3;
        }
        if (RadioButtonELI_CONSULTA.isSelected()) {
            ELI_CONSULTA = 4;
        }           
           
        if (RadioButtonL_CATEGORIA.isSelected()) {
            L_CATEGORIA = 1;
        }
        if (RadioButtonES_CATEGORIA.isSelected()) {
            ESC_CATEGORIA = 2;
        }
        if (RadioButtonMOD_CATEGORIA.isSelected()) {
            MOD_CATEGORIA = 3;
        }
        if (RadioButtonELI_CATEGORIA.isSelected()) {
            ELI_CATEGORIA = 4;
        }
        
        if (RadioButtonL_CIRUGIA.isSelected()) {
            L_CIRUGIA = 1;
        }
        if (RadioButtonESC_CIRUGIA.isSelected()) {
            ESC_CIRUGIA = 2;
        }
        if (RadioButtonMOD_CIRUGIA.isSelected()) {
            MOD_CIRUGIA = 3;
        }
        if (RadioButtonELI_CIRUGIA.isSelected()) {
            ELI_CIRUGIA = 4;
        }
        
        
//        if (this.RadioButtonL_CATOPERACION.isSelected()) {
//            L_CATOPERACION = 1;
//        }
//        if (RadioButtonES_CATOPERACION.isSelected()) {
//            ESC_CATOPERACION = 2;
//        }
//        if (RadioButtonMOD_CATOPERACION.isSelected()) {
//            MOD_CATOPERACION = 3;
//        }
//        if (RadioButtonELI_CATOPERACION.isSelected()) {
//            ELIM_CATOPERACION = 4;
//        }
        
        
        if (this.RadioButtonL_TIPOOPERACION.isSelected()) {
             L_OPERACION = 1;
        }
        if (RadioButtonES_TIPOOPERACION.isSelected()) {
            ESC_OPERACION = 2;
        }
        if (RadioButtonMOD_TIPOOPERACION.isSelected()) {
            MOD_OPERACION = 3;
        }
        if (RadioButtonELI_TIPOOPERACION.isSelected()) {
            ELIM_OPERACION = 4;
        }  
        
        if (this.RadioButtonL_VACUNA.isSelected()) {
             L_VACUNA = 1;
        }
        if (RadioButtonES_VACUNA.isSelected()) {
            ESC_VACUNA = 2;
        }
        if (RadioButtonMOD_VACUNA.isSelected()) {
            MOD_VACUNA = 3;
        }
        if (RadioButtonELI_VACUNA.isSelected()) {
            ELIM_VACUNA = 4;
        }            
        
         if (this.RadioButtonL_AFECCION.isSelected()) {
             L_AFECCION = 1;
        }
        if (RadioButtonES_AFECCION.isSelected()) {
            ESC_AFECCION = 2;
        }
        if (RadioButtonMOD_AFECCION.isSelected()) {
            MOD_AFECCION = 3;
        }
        if (RadioButtonELI_AFECCION.isSelected()) {
            ELIM_AFECCION = 4;
        }
        
        if (RadioButtonM_LOGO.isSelected()) {
            LOGO = 3;
        }
        
        if (this.RadioButtonL_PELAJE.isSelected()) {
             L_PELAJE = 1;
        }
        if (RadioButtonES_PELAJE.isSelected()) {
            ESC_PELAJE = 2;
        }
        if (RadioButtonMOD_PELAJE.isSelected()) {
            MOD_PELAJE = 3;
        }
        if (RadioButtonELI_PELAJE.isSelected()) {
            ELIM_PELAJE = 4;
        }
        
        if (this.RadioButtonL_LISTADO.isSelected()) {
             L_LISTADO = 1;
        }
        
        if (this.RadioButtonELIM_LISTADO.isSelected()) {
             ELIM_LISTADO = 4;
        }
        
       if (existe == 0) {
            acceso.AsociarPermisos(idrolSeleccionado,L_FICHAMEDICA,ESC_FICHAMEDICA,MOD_FICHAMEDICA,ELI_FICHAMEDICA,L_ESPECIE,ESC_ESPECIE,MOD_ESPECIE,ELIM_ESPECIE,L_RAZA,ESC_RAZA,MOD_RAZA,ELIM_RAZA,L_MEDICAMENTO,ESC_MEDICAMENTO,MOD_MEDICAMENTO,ELI_MEDICAMENTO,L_HORA,ESC_HORA,MOD_HORA,ELIM_HORA,L_PROVINC,ES_PROVINC,MOD_PROVINC,ELI_PROVINC,L_LOC,ES_LOC,MOD_LOC,ELI_LOC,L_TIPOTEL,ESC_TIPOTEL,MOD_TIPOTEL,ELI_TIPOTEL,L_USU,ES_USU,MOD_USU,ELI_USU,L_ROL,ES_ROL,MOD_ROL,ELI_ROL,audi,res,PERMISO,L_VETERINARIO,ESC_VETERINARIO,MOD_VETERINARIO,ELIM_VETERINARIO,REPORTES,GRAFICOS, L_CONSULTA,ESC_CONSULTA,MOD_CONSULTA,ELI_CONSULTA,L_CATEGORIA,ESC_CATEGORIA,MOD_CATEGORIA,ELI_CATEGORIA,L_CIRUGIA,ESC_CIRUGIA,MOD_CIRUGIA,ELI_CIRUGIA,L_VACUNA,ESC_VACUNA,MOD_VACUNA,ELIM_VACUNA,L_AFECCION,ESC_AFECCION,MOD_AFECCION,ELIM_AFECCION, L_CATOPERACION,ESC_CATOPERACION,MOD_CATOPERACION,ELIM_CATOPERACION,L_OPERACION,ESC_OPERACION,MOD_OPERACION,ELIM_OPERACION,LOGO,L_PELAJE,ESC_PELAJE,MOD_PELAJE,ELIM_PELAJE,L_LISTADO,ELIM_LISTADO);
            JOptionPane.showMessageDialog(null,"Se Registró un Nuevo Nivel de Acceso para el Rol" + " " + RolSeleccionado, "Información", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            ENLACE();
        } else {
            acceso.ActualizarPermisos(idrolSeleccionado,L_FICHAMEDICA,ESC_FICHAMEDICA,MOD_FICHAMEDICA,ELI_FICHAMEDICA,L_ESPECIE,ESC_ESPECIE,MOD_ESPECIE,ELIM_ESPECIE,L_RAZA,ESC_RAZA,MOD_RAZA,ELIM_RAZA,L_MEDICAMENTO,ESC_MEDICAMENTO,MOD_MEDICAMENTO,ELI_MEDICAMENTO,L_HORA,ESC_HORA,MOD_HORA,ELIM_HORA,L_PROVINC,ES_PROVINC,MOD_PROVINC,ELI_PROVINC,L_LOC,ES_LOC,MOD_LOC,ELI_LOC,L_TIPOTEL,ESC_TIPOTEL,MOD_TIPOTEL,ELI_TIPOTEL,L_USU,ES_USU,MOD_USU,ELI_USU,L_ROL,ES_ROL,MOD_ROL,ELI_ROL,audi,res,PERMISO,L_VETERINARIO,ESC_VETERINARIO,MOD_VETERINARIO,ELIM_VETERINARIO,REPORTES,GRAFICOS, L_CONSULTA,ESC_CONSULTA,MOD_CONSULTA,ELI_CONSULTA,L_CATEGORIA,ESC_CATEGORIA,MOD_CATEGORIA,ELI_CATEGORIA,L_CIRUGIA,ESC_CIRUGIA,MOD_CIRUGIA,ELI_CIRUGIA,L_VACUNA,ESC_VACUNA,MOD_VACUNA,ELIM_VACUNA,L_AFECCION,ESC_AFECCION,MOD_AFECCION,ELIM_AFECCION,L_CATOPERACION,ESC_CATOPERACION,MOD_CATOPERACION,ELIM_CATOPERACION,L_OPERACION,ESC_OPERACION,MOD_OPERACION,ELIM_OPERACION,LOGO,L_PELAJE,ESC_PELAJE,MOD_PELAJE,ELIM_PELAJE,L_LISTADO,ELIM_LISTADO);
            JOptionPane.showMessageDialog(null,"Se Actualizó el Nivel de Acceso del Rol" + " " + RolSeleccionado, "Información", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            ENLACE();
        }
    }//GEN-LAST:event_buttonActionGUARDARActionPerformed

    private void RadioButtonL_FICHAMEDICAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonL_FICHAMEDICAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonL_FICHAMEDICAActionPerformed

    private void buttonActionCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionCANCELARActionPerformed
        dispose();
        ENLACE();
    }//GEN-LAST:event_buttonActionCANCELARActionPerformed

    private void RadioButtonL_LISTADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonL_LISTADOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonL_LISTADOActionPerformed
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
            java.util.logging.Logger.getLogger(AccesosxRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccesosxRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccesosxRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesosxRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AccesosxRol dialog = new AccesosxRol(new javax.swing.JFrame(), true);
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
    private javax.swing.JRadioButton RadioButtonELIM_ESPECIE;
    private javax.swing.JRadioButton RadioButtonELIM_FICHAMEDICA;
    private javax.swing.JRadioButton RadioButtonELIM_HORA;
    private javax.swing.JRadioButton RadioButtonELIM_LISTADO;
    private javax.swing.JRadioButton RadioButtonELIM_MEDICAMENTO;
    private javax.swing.JRadioButton RadioButtonELIM_RAZA;
    private javax.swing.JRadioButton RadioButtonELIM_VETERINARIO;
    private javax.swing.JRadioButton RadioButtonELI_AFECCION;
    private javax.swing.JRadioButton RadioButtonELI_CATEGORIA;
    private javax.swing.JRadioButton RadioButtonELI_CIRUGIA;
    private javax.swing.JRadioButton RadioButtonELI_CONSULTA;
    private javax.swing.JRadioButton RadioButtonELI_LOCALIDAD;
    private javax.swing.JRadioButton RadioButtonELI_PELAJE;
    private javax.swing.JRadioButton RadioButtonELI_PROVINCIA;
    private javax.swing.JRadioButton RadioButtonELI_ROLES;
    private javax.swing.JRadioButton RadioButtonELI_TELEFONO;
    private javax.swing.JRadioButton RadioButtonELI_TIPOOPERACION;
    private javax.swing.JRadioButton RadioButtonELI_U;
    private javax.swing.JRadioButton RadioButtonELI_VACUNA;
    private javax.swing.JRadioButton RadioButtonESC_CIRUGIA;
    private javax.swing.JRadioButton RadioButtonESC_CONSULTA;
    private javax.swing.JRadioButton RadioButtonESC_ESPECIE;
    private javax.swing.JRadioButton RadioButtonESC_FICHAMEDICA;
    private javax.swing.JRadioButton RadioButtonESC_MEDICAMENTO;
    private javax.swing.JRadioButton RadioButtonESC_RAZA;
    private javax.swing.JRadioButton RadioButtonESC_VETERINARIO;
    private javax.swing.JRadioButton RadioButtonES_AFECCION;
    private javax.swing.JRadioButton RadioButtonES_CATEGORIA;
    private javax.swing.JRadioButton RadioButtonES_HORA;
    private javax.swing.JRadioButton RadioButtonES_LOCALIDAD;
    private javax.swing.JRadioButton RadioButtonES_PELAJE;
    private javax.swing.JRadioButton RadioButtonES_PROVINCIA;
    private javax.swing.JRadioButton RadioButtonES_ROLES;
    private javax.swing.JRadioButton RadioButtonES_TELEFONO;
    private javax.swing.JRadioButton RadioButtonES_TIPOOPERACION;
    private javax.swing.JRadioButton RadioButtonES_U;
    private javax.swing.JRadioButton RadioButtonES_VACUNA;
    private javax.swing.JRadioButton RadioButtonL_ACCESO;
    private javax.swing.JRadioButton RadioButtonL_AFECCION;
    private javax.swing.JRadioButton RadioButtonL_AUDITORIA;
    private javax.swing.JRadioButton RadioButtonL_BACKUP;
    private javax.swing.JRadioButton RadioButtonL_CATEGORIA;
    private javax.swing.JRadioButton RadioButtonL_CIRUGIA;
    private javax.swing.JRadioButton RadioButtonL_CONSULTA;
    private javax.swing.JRadioButton RadioButtonL_ESPECIE;
    private javax.swing.JRadioButton RadioButtonL_ESTADISTICA;
    private javax.swing.JRadioButton RadioButtonL_FICHAMEDICA;
    private javax.swing.JRadioButton RadioButtonL_HORA;
    private javax.swing.JRadioButton RadioButtonL_LISTADO;
    private javax.swing.JRadioButton RadioButtonL_LOCALIDAD;
    private javax.swing.JRadioButton RadioButtonL_MEDICAMENTO;
    private javax.swing.JRadioButton RadioButtonL_PELAJE;
    private javax.swing.JRadioButton RadioButtonL_PROVINCIA;
    private javax.swing.JRadioButton RadioButtonL_RAZA;
    private javax.swing.JRadioButton RadioButtonL_REPORTES;
    private javax.swing.JRadioButton RadioButtonL_ROLES;
    private javax.swing.JRadioButton RadioButtonL_TELEFONO;
    private javax.swing.JRadioButton RadioButtonL_TIPOOPERACION;
    private javax.swing.JRadioButton RadioButtonL_U;
    private javax.swing.JRadioButton RadioButtonL_VACUNA;
    private javax.swing.JRadioButton RadioButtonL_VETERINARIO;
    private javax.swing.JRadioButton RadioButtonMOD_AFECCION;
    private javax.swing.JRadioButton RadioButtonMOD_CATEGORIA;
    private javax.swing.JRadioButton RadioButtonMOD_CIRUGIA;
    private javax.swing.JRadioButton RadioButtonMOD_CONSULTA;
    private javax.swing.JRadioButton RadioButtonMOD_ESPECIE;
    private javax.swing.JRadioButton RadioButtonMOD_FICHAMEDICA;
    private javax.swing.JRadioButton RadioButtonMOD_HORA;
    private javax.swing.JRadioButton RadioButtonMOD_LOCALIDAD;
    private javax.swing.JRadioButton RadioButtonMOD_MEDICAMENTO;
    private javax.swing.JRadioButton RadioButtonMOD_PELAJE;
    private javax.swing.JRadioButton RadioButtonMOD_PROVINCIA;
    private javax.swing.JRadioButton RadioButtonMOD_RAZA;
    private javax.swing.JRadioButton RadioButtonMOD_ROLES;
    private javax.swing.JRadioButton RadioButtonMOD_TELEFONO;
    private javax.swing.JRadioButton RadioButtonMOD_TIPOOPERACION;
    private javax.swing.JRadioButton RadioButtonMOD_U;
    private javax.swing.JRadioButton RadioButtonMOD_VACUNA;
    private javax.swing.JRadioButton RadioButtonMOD_VETERINARIO;
    private javax.swing.JRadioButton RadioButtonM_LOGO;
    private org.edisoncor.gui.button.ButtonAction buttonActionCANCELAR;
    public org.edisoncor.gui.button.ButtonAction buttonActionGUARDAR;
    private javax.swing.JCheckBox jCheckBox1;
    public javax.swing.JComboBox jComboBoxRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelLOGO;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    // End of variables declaration//GEN-END:variables

public void PantallasxRol(int idrol){
    int audi=0,res=0,REPORTES=0,GRAFICOS=0,L_VACUNA=0,ESC_VACUNA=0,MOD_VACUNA=0,ELIM_VACUNA=0,L_AFECCION=0,ESC_AFECCION=0,MOD_AFECCION=0,ELIM_AFECCION=0,L_CATOP=0,ESC_CATOP=0,MOD_CATOP=0,ELIM_CATOP=0,L_OPERACION=0,ESC_OPERACION=0,MOD_OPERACION=0,ELIM_OPERACION=0,L_PELAJE=0,ESC_PELAJE=0,MOD_PELAJE=0,ELIM_PELAJE=0,LOGO=0,L_ESPECIE=0,ESC_ESPECIE=0,MOD_ESPECIE=0,ELIM_ESPECIE=0,L_TIPORAZA=0,ESC_TIPORAZA=0,MOD_TIPORAZA=0,ELIM_TIPORAZA=0,ACTUALIZAR_PERMISOS=0,L_MEDICAMENTO=0,ESC_MEDICAMENTO=0,MOD_MEDICAMENTO=0,ELIM_MEDICAMENTO=0,L_CIRUGIA=0,ESC_CIRUGIA=0,MOD_CIRUGIA=0,ELI_CIRUGIA=0,L_CONSULTA=0,ESC_CONSULTA=0,MOD_CONSULTA=0,ELIM_CONSULTA=0,L_FICHAMEDICA=0,ESC_FICHAMEDICA=0,MOD_FICHAMEDICA=0,ELIM_FICHAMEDICA=0,L_CATEGORIA=0,ESC_CATEGORIA=0,MOD_CATEGORIA=0,ELIM_CATEGORIA=0,L_LOC=0,ESC_LOC=0,MOD_LOC=0,ELIM_LOC=0,L_PROVINC=0,ESC_PROVINC=0,MOD_PROVINC=0,ELIM_PROVINC=0,L_USU=0,ESC_USU=0,MOD_USU=0,ELIM_USU=0,L_ROL=0,ESC_ROL=0,MOD_ROL=0,ELIM_ROL=0,L_TIPOTEL=0,ESC_TIPOTEL=0,MOD_TIPOTEL=0,ELIM_TIPOTEL=0,L_VETERINARIO=0,ESC_VETERINARIO=0,MOD_VETERINARIO=0,ELIM_VETERINARIO=0,L_HORA=0,ESC_HORA=0,MOD_HORA=0,ELIM_HORA=0,L_LISTADO=0,ELIM_LISTADO=0;
       
    cn=cm.Conectar();
    String sql="SELECT * FROM permisos WHERE idrol="+idrol;
    try
        {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next())
            {
                
                L_FICHAMEDICA=rs.getInt("L_FICHAMEDICA");
                ESC_FICHAMEDICA=rs.getInt("ESC_FICHAMEDICA");
                MOD_FICHAMEDICA=rs.getInt("MOD_FICHAMEDICA");
                ELIM_FICHAMEDICA=rs.getInt("ELIM_FICHAMEDICA"); 
                
                L_ESPECIE=rs.getInt("L_ESPECIE");
                ESC_ESPECIE=rs.getInt("ESC_ESPECIE");
                MOD_ESPECIE=rs.getInt("MOD_ESPECIE");
                ELIM_ESPECIE=rs.getInt("ELIM_ESPECIE");
                
                L_TIPORAZA=rs.getInt("L_RAZA");
                ESC_TIPORAZA=rs.getInt("ESC_RAZA");
                MOD_TIPORAZA=rs.getInt("MOD_RAZA");
                ELIM_TIPORAZA=rs.getInt("ELIM_RAZA");
               
                L_MEDICAMENTO=rs.getInt("L_MEDICAMENTO");
                ESC_MEDICAMENTO=rs.getInt("ESC_MEDICAMENTO");
                MOD_MEDICAMENTO=rs.getInt("MOD_MEDICAMENTO");
                ELIM_MEDICAMENTO=rs.getInt("ELIM_MEDICAMENTO");
                
                L_HORA=rs.getInt("L_HORA");
                ESC_HORA=rs.getInt("ESC_HORA");
                MOD_HORA=rs.getInt("MOD_HORA");
                ELIM_HORA=rs.getInt("ELIM_HORA");
                
                L_PROVINC=rs.getInt("L_PROVINCIA");
                ESC_PROVINC=rs.getInt("ESC_PROVINCIA");
                MOD_PROVINC=rs.getInt("MOD_PROVINCIA");
                ELIM_PROVINC=rs.getInt("ELIM_PROVINCIA");
                
                L_LOC=rs.getInt("L_LOCALIDAD");
                ESC_LOC=rs.getInt("ESC_LOCALIDAD");
                MOD_LOC=rs.getInt("MOD_LOCALIDAD");
                ELIM_LOC=rs.getInt("ELIM_LOCALIDAD");
                
                L_TIPOTEL=rs.getInt("L_TIPOTELEFONO");
                ESC_TIPOTEL=rs.getInt("ESC_TIPOTELEFONO");
                MOD_TIPOTEL=rs.getInt("MOD_TIPOTELEFONO");
                ELIM_TIPOTEL=rs.getInt("ELIM_TIPOTELEFONO");                
              
                 L_USU=rs.getInt("L_USUARIO");
                ESC_USU=rs.getInt("ESC_USUARIO");
                MOD_USU=rs.getInt("MOD_USUARIO");
                ELIM_USU=rs.getInt("ELIM_USUARIO");                
              
                L_ROL=rs.getInt("L_TIPOROL");
                ESC_ROL=rs.getInt("ESC_TIPOROL");
                MOD_ROL=rs.getInt("MOD_TIPOROL");
                ELIM_ROL=rs.getInt("ELIM_TIPOROL");                
                
                audi=rs.getInt("AUDITORIA");
                res=rs.getInt("RESPALDO"); 
                ACTUALIZAR_PERMISOS=rs.getInt("ACTUALIZAR_PERMISOS");
                
                L_VETERINARIO=rs.getInt("L_VETERINARIO");
                ESC_VETERINARIO=rs.getInt("ESC_VETERINARIO");
                MOD_VETERINARIO=rs.getInt("MOD_VETERINARIO");
                ELIM_VETERINARIO=rs.getInt("ELIM_VETERINARIO");
                
                REPORTES=rs.getInt("REPORTES");
                GRAFICOS=rs.getInt("GRAFICOS");
                
                L_CONSULTA=rs.getInt("L_CONSULTA");
                ESC_CONSULTA=rs.getInt("ESC_CONSULTA");
                MOD_CONSULTA=rs.getInt("MOD_CONSULTA");
                ELIM_CONSULTA=rs.getInt("ELIM_CONSULTA");
                
                L_CATEGORIA=rs.getInt("L_CATEGORIA");
                ESC_CATEGORIA=rs.getInt("ESC_CATEGORIA");
                MOD_CATEGORIA=rs.getInt("MOD_CATEGORIA");
                ELIM_CATEGORIA=rs.getInt("ELIM_CATEGORIA");  
                
                L_CIRUGIA=rs.getInt("L_CIRUGIA");
                ESC_CIRUGIA=rs.getInt("ESC_CIRUGIA");
                MOD_CIRUGIA=rs.getInt("MOD_CIRUGIA");
                ELI_CIRUGIA=rs.getInt("ELIM_CIRUGIA");
                
                L_VACUNA=rs.getInt("L_VACUNA");
                ESC_VACUNA=rs.getInt("ESC_VACUNA");
                MOD_VACUNA=rs.getInt("MOD_VACUNA");
                ELIM_VACUNA=rs.getInt("ELIM_VACUNA");
                
                L_AFECCION=rs.getInt("L_AFECCION");
                ESC_AFECCION=rs.getInt("ESC_AFECCION");
                MOD_AFECCION=rs.getInt("MOD_AFECCION");
                ELIM_AFECCION=rs.getInt("ELIM_AFECCION");
                
                L_CATOP=rs.getInt("L_CATEGORIATIPO");
                ESC_CATOP=rs.getInt("ESC_CATEGORIATIPO");
                MOD_CATOP=rs.getInt("MOD_CATEGORIATIPO");
                ELIM_CATOP=rs.getInt("ELIM_CATEGORIATIPO");
                
                L_OPERACION=rs.getInt("L_TIPOOPERACION");
                ESC_OPERACION=rs.getInt("ESC_TIPOOPERACION");
                MOD_OPERACION=rs.getInt("MOD_TIPOOPERACION");
                ELIM_OPERACION=rs.getInt("ELIM_TIPOOPERACION");
                
                LOGO=rs.getInt("LOGO");
                
                L_PELAJE=rs.getInt("L_PELAJE");
                ESC_PELAJE=rs.getInt("ESC_PELAJE");
                MOD_PELAJE=rs.getInt("MOD_PELAJE");
                ELIM_PELAJE=rs.getInt("ELIM_PELAJE");
                
                L_LISTADO=rs.getInt("L_LISTADO");
                ELIM_LISTADO=rs.getInt("ELIM_LISTADO");
     }
            
            
            if(L_FICHAMEDICA!=0){
                RadioButtonL_FICHAMEDICA.setSelected(true);
            }
            if(ESC_FICHAMEDICA!=0){
                 RadioButtonESC_FICHAMEDICA.setSelected(true);
            }
             if(MOD_FICHAMEDICA!=0){
                  RadioButtonMOD_FICHAMEDICA.setSelected(true);
            }
              if(ELIM_FICHAMEDICA!=0){
                    RadioButtonELIM_FICHAMEDICA.setSelected(true);
            }
              
             if(L_ESPECIE!=0){             
             RadioButtonL_ESPECIE.setSelected(true);
             }
            if(ESC_ESPECIE!=0){
               RadioButtonESC_ESPECIE.setSelected(true);
            }
            if(MOD_ESPECIE!=0){
               RadioButtonMOD_ESPECIE.setSelected(true);
            }
            if(ELIM_ESPECIE!=0){
                RadioButtonELIM_ESPECIE.setSelected(true);
            } 
            
            if(L_TIPORAZA!=0){             
             RadioButtonL_RAZA.setSelected(true);
             }
            if(ESC_TIPORAZA!=0){
               RadioButtonESC_RAZA.setSelected(true);
            }
            if(MOD_TIPORAZA!=0){
               RadioButtonMOD_RAZA.setSelected(true);
            }
            if(ELIM_TIPORAZA!=0){
                RadioButtonELIM_RAZA.setSelected(true);
            }
            
            if(L_MEDICAMENTO!=0){
              RadioButtonL_MEDICAMENTO.setSelected(true);
            }
            if(ESC_MEDICAMENTO!=0){
             RadioButtonESC_MEDICAMENTO.setSelected(true);
            }
            if(MOD_MEDICAMENTO!=0){
             RadioButtonMOD_MEDICAMENTO.setSelected(true);
            }
            if(ELIM_MEDICAMENTO!=0){
            RadioButtonELIM_MEDICAMENTO.setSelected(true);
            } 
            
            
              if(L_HORA!=0){
                RadioButtonL_HORA.setSelected(true);
            }
            if(ESC_HORA!=0){
                 RadioButtonES_HORA.setSelected(true);
            }
             if(MOD_HORA!=0){
                  RadioButtonMOD_HORA.setSelected(true);
            }
              if(ELIM_HORA!=0){
                    RadioButtonELIM_HORA.setSelected(true);
            } 
            
              if(L_LOC!=0){
              RadioButtonL_LOCALIDAD.setSelected(true);        
            }
            if(ESC_LOC!=0){
            RadioButtonES_LOCALIDAD.setSelected(true);
            }
            if(MOD_LOC!=0){
            RadioButtonMOD_LOCALIDAD.setSelected(true);
            }
            if(ELIM_LOC!=0){
            RadioButtonELI_LOCALIDAD.setSelected(true);
            }  
            
            
            if(L_PROVINC!=0){
             RadioButtonL_PROVINCIA.setSelected(true);
             }
            if(ESC_PROVINC!=0){
             RadioButtonES_PROVINCIA.setSelected(true);
            }
            if(MOD_PROVINC!=0){
             RadioButtonMOD_PROVINCIA.setSelected(true);
            }
            if(ELIM_PROVINC!=0){
            RadioButtonELI_PROVINCIA.setSelected(true);             
            } 
            
            if(L_TIPOTEL!=0){
                RadioButtonL_TELEFONO.setSelected(true);
            }
            if(ESC_TIPOTEL!=0){
                this.RadioButtonES_TELEFONO.setSelected(true);
            }
            if(MOD_TIPOTEL!=0){
                this.RadioButtonMOD_TELEFONO.setSelected(true);
            }
            if(ELIM_TIPOTEL!=0){
                this.RadioButtonELI_TELEFONO.setSelected(true) ;
            }         
            
            if(idrol!=1){  
               RadioButtonL_U.setSelected(false);
               RadioButtonES_U.setSelected(false);           
               RadioButtonMOD_U.setSelected(false);           
               RadioButtonELI_U.setSelected(false);
               
               
               RadioButtonL_U.setEnabled(false);               
               RadioButtonES_U.setEnabled(false);           
               RadioButtonMOD_U.setEnabled(false);           
               RadioButtonELI_U.setEnabled(false);              
           
               RadioButtonL_ROLES.setSelected(false);         
               RadioButtonES_ROLES.setSelected(false);          
               RadioButtonMOD_ROLES.setSelected(false);          
               RadioButtonELI_ROLES.setSelected(false);          
               RadioButtonL_ACCESO.setSelected(false);
               
               RadioButtonL_ROLES.setEnabled(false);         
               RadioButtonES_ROLES.setEnabled(false);          
               RadioButtonMOD_ROLES.setEnabled(false);          
               RadioButtonELI_ROLES.setEnabled(false);          
               RadioButtonL_ACCESO.setEnabled(false);
           }else{   
               RadioButtonL_U.setEnabled(true);               
               RadioButtonES_U.setEnabled(true);           
               RadioButtonMOD_U.setEnabled(true);           
               RadioButtonELI_U.setEnabled(true);              
           
               RadioButtonL_ROLES.setEnabled(true);         
               RadioButtonES_ROLES.setEnabled(true);          
               RadioButtonMOD_ROLES.setEnabled(true);          
               RadioButtonELI_ROLES.setEnabled(true);          
               RadioButtonL_ACCESO.setEnabled(true);
               
                if(L_USU!=0){
                   RadioButtonL_U.setSelected(true);
                }
                if(ESC_USU!=0){
                 RadioButtonES_U.setSelected(true);
                }
                if(MOD_USU!=0){
                RadioButtonMOD_U.setSelected(true);
                }
                if(ELIM_USU!=0){
                 RadioButtonELI_U.setSelected(true);
                }
          
            
                if(L_ROL!=0){
                   RadioButtonL_ROLES.setSelected(true);
                }
                if(ESC_ROL!=0){
                    RadioButtonES_ROLES.setSelected(true);
                }
                if(MOD_ROL!=0){
                    RadioButtonMOD_ROLES.setSelected(true);
                }
                if(ELIM_ROL!=0){
                  RadioButtonELI_ROLES.setSelected(true);
                } 
            
                if(ACTUALIZAR_PERMISOS!=0){
                    RadioButtonL_ACCESO.setSelected(true);
                 }            
             }
            
            
            if(L_VETERINARIO!=0){
                RadioButtonL_VETERINARIO.setSelected(true);
            }
            if(ESC_VETERINARIO!=0){
                RadioButtonESC_VETERINARIO.setSelected(true);
            }
            if(MOD_VETERINARIO!=0){
                RadioButtonMOD_VETERINARIO.setSelected(true);
            }
            if(ELIM_VETERINARIO!=0){
                RadioButtonELIM_VETERINARIO.setSelected(true);
            }             
            
            if(audi!=0){
                 RadioButtonL_AUDITORIA.setSelected(true);
            }           
            if(res!=0){
                RadioButtonL_BACKUP.setSelected(true);
            }  
            
             if(GRAFICOS!=0){
                RadioButtonL_ESTADISTICA.setSelected(true);
            }          
                      
            if(REPORTES!=0){
               RadioButtonL_REPORTES.setSelected(true);
            }
            
             
            if(L_CONSULTA!=0){
                 RadioButtonL_CONSULTA.setSelected(true);
            }
            if(ESC_CONSULTA!=0){
             RadioButtonESC_CONSULTA.setSelected(true);
            }
            if(MOD_CONSULTA!=0){
             RadioButtonMOD_CONSULTA.setSelected(true);
            }
            if(ELIM_CONSULTA!=0){
            RadioButtonELI_CONSULTA.setSelected(true);
            }  
              
            if(L_CATEGORIA!=0){
                 RadioButtonL_CATEGORIA.setSelected(true);
            }
            if(ESC_CATEGORIA!=0){
             RadioButtonES_CATEGORIA.setSelected(true);
            }
            if(MOD_CATEGORIA!=0){
             RadioButtonMOD_CATEGORIA.setSelected(true);
            }
            if(ELIM_CATEGORIA!=0){
            RadioButtonELI_CATEGORIA.setSelected(true);
            }         
            
           if(L_CIRUGIA!=0){
              RadioButtonL_CIRUGIA.setSelected(true);
            }
            if(ESC_CIRUGIA!=0){
             RadioButtonESC_CIRUGIA.setSelected(true);
            }
            if(MOD_CIRUGIA!=0){
             RadioButtonMOD_CIRUGIA.setSelected(true);
            }
            if(ELI_CIRUGIA!=0){
            RadioButtonELI_CIRUGIA.setSelected(true);
            }            
             
            if(L_VACUNA!=0){
               RadioButtonL_VACUNA.setSelected(true);
            }
            if(ESC_VACUNA!=0){
                RadioButtonES_VACUNA.setSelected(true);
            }
            if(MOD_VACUNA!=0){
                RadioButtonMOD_VACUNA.setSelected(true);
            }
            if(ELIM_VACUNA!=0){
              RadioButtonELI_VACUNA.setSelected(true);
            }            
                       
             if(L_AFECCION!=0){
               RadioButtonL_AFECCION.setSelected(true);
            }
            if(ESC_AFECCION!=0){
                RadioButtonES_AFECCION.setSelected(true);
            }
            if(MOD_AFECCION!=0){
                RadioButtonMOD_AFECCION.setSelected(true);
            }
            if(ELIM_AFECCION!=0){
              RadioButtonELI_AFECCION.setSelected(true);
            }             
                    
//            if(L_CATOP!=0){
//               RadioButtonL_CATOPERACION.setSelected(true);
//            }
//            if(ESC_CATOP!=0){
//                RadioButtonES_CATOPERACION.setSelected(true);
//            }
//            if(MOD_CATOP!=0){
//                RadioButtonMOD_CATOPERACION.setSelected(true);
//            }
//            if(ELIM_CATOP!=0){
//              RadioButtonELI_CATOPERACION.setSelected(true);
//            }  
             
            if(L_OPERACION!=0){
               RadioButtonL_TIPOOPERACION.setSelected(true);
            }
            if(ESC_OPERACION!=0){
                RadioButtonES_TIPOOPERACION.setSelected(true);
            }
            if(MOD_OPERACION!=0){
                RadioButtonMOD_TIPOOPERACION.setSelected(true);
            }
            if(ELIM_OPERACION!=0){
              RadioButtonELI_TIPOOPERACION.setSelected(true);
            }  
            
            if(LOGO!=0){
              RadioButtonM_LOGO.setSelected(true);
            }
           
            if(L_PELAJE!=0){
               RadioButtonL_PELAJE.setSelected(true);
            }
            if(ESC_PELAJE!=0){
                RadioButtonES_PELAJE.setSelected(true);
            }
            if(MOD_PELAJE!=0){
                RadioButtonMOD_PELAJE.setSelected(true);
            }
            if(ELIM_PELAJE!=0){
              RadioButtonELI_PELAJE.setSelected(true);
            }
            
            if(L_LISTADO!=0){
               RadioButtonL_LISTADO.setSelected(true);
            }
            
            if(ELIM_LISTADO!=0){
               RadioButtonELIM_LISTADO.setSelected(true);
            }
        }catch (SQLException ex)
        {
          JOptionPane.showMessageDialog(null, ex);
        }   
}

public void ENLACE() {
  int ACTUALIZAR_PERMISOS=0;
  Gestión_Permisos_xRol usu=new Gestión_Permisos_xRol(new javax.swing.JFrame(), true);
  usu.IDROL=ROL; 
        try {
            cn = cm.Conectar();
            String sql = "SELECT * FROM permisos WHERE idrol="+ROL;
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                ACTUALIZAR_PERMISOS = rs.getInt("ACTUALIZAR_PERMISOS");               
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

         if (ACTUALIZAR_PERMISOS != 0) {
            usu.buttonTaskCERRAR.setEnabled(true);
            usu.TABLA.setEnabled(true);           
            usu.buttonTaskMODIFICAR.setEnabled(false);                      
        }else{
            usu.buttonTaskCERRAR.setEnabled(true);
            usu.TABLA.setEnabled(false);
            usu.buttonTaskMODIFICAR.setEnabled(false);          
        }       
        usu.show();
}

private void LLenarCombo(){
  try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM roles");                     
        while (rs.next()) {
            modeloCombo.addElement(rs.getString("nombre"));
            }
        rs.close();
        jComboBoxRoles.setModel(modeloCombo);  
        
  }catch(SQLException ex) {
            ex.getMessage();
        }
    }

private void BuscarCoincidencias(String captura) {
   try {            
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre FROM roles WHERE nombre LIKE '"+captura+"%'");                     
        while (rs.next()) {
            modeloCombo.addElement(rs.getString("nombre"));
            }
        rs.close();
        jComboBoxRoles.setModel(modeloCombo);            
        }catch(SQLException ex) {
            ex.getMessage();
        }
    }

private void BuscarDatos(String captura) {
   int id=0;
   try {       
        cn=cm.Conectar();
        Statement st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT id FROM roles WHERE nombre LIKE '"+captura+"%'");                     
        while (rs.next()) {
            id=rs.getInt("id");
            }
        rs.close();
                
        }catch(SQLException ex) {
            ex.getMessage();
        }
        idrolSeleccionado=id;
        LimpiarOpciones();
        PantallasxRol(id);
        jCheckBox1.setVisible(true);
    }

    private void LimpiarOpciones() {
         RadioButtonL_REPORTES.setSelected(false);
            RadioButtonL_AUDITORIA.setSelected(false);
            RadioButtonL_BACKUP.setSelected(false);
            RadioButtonL_ESTADISTICA.setSelected(false);
            RadioButtonL_ACCESO.setSelected(false);
            
            RadioButtonL_FICHAMEDICA.setSelected(false);
            RadioButtonESC_FICHAMEDICA.setSelected(false);
            RadioButtonMOD_FICHAMEDICA.setSelected(false);
            RadioButtonELIM_FICHAMEDICA.setSelected(false);
            RadioButtonELIM_LISTADO.setSelected(false);
            RadioButtonL_LISTADO.setSelected(false);
            RadioButtonL_HORA.setSelected(false);
            RadioButtonES_HORA.setSelected(false);
            RadioButtonMOD_HORA.setSelected(false);
            RadioButtonELIM_HORA.setSelected(false);
            
                     
            RadioButtonL_PROVINCIA.setSelected(false);  
            RadioButtonES_PROVINCIA.setSelected(false);        
            RadioButtonMOD_PROVINCIA.setSelected(false);        
            RadioButtonELI_PROVINCIA.setSelected(false); 
            
            RadioButtonL_LOCALIDAD.setSelected(false);  
            RadioButtonES_LOCALIDAD.setSelected(false);     
            RadioButtonMOD_LOCALIDAD.setSelected(false);
            RadioButtonELI_LOCALIDAD.setSelected(false);    
            
            RadioButtonL_TELEFONO.setSelected(false);            
            RadioButtonES_TELEFONO.setSelected(false);           
            RadioButtonMOD_TELEFONO.setSelected(false);           
            RadioButtonELI_TELEFONO.setSelected(false) ; 
            
                             
            RadioButtonL_ESPECIE.setSelected(false);
            RadioButtonESC_ESPECIE.setSelected(false);
            RadioButtonMOD_ESPECIE.setSelected(false);
            RadioButtonELIM_ESPECIE.setSelected(false);
            
            RadioButtonL_RAZA.setSelected(false);
            RadioButtonESC_RAZA.setSelected(false);
            RadioButtonMOD_RAZA.setSelected(false);
            RadioButtonELIM_RAZA.setSelected(false);
            
                     
            RadioButtonL_CONSULTA.setSelected(false);          
            RadioButtonESC_CONSULTA.setSelected(false);           
            RadioButtonMOD_CONSULTA.setSelected(false);         
            RadioButtonELI_CONSULTA.setSelected(false); 
            
            RadioButtonL_U.setSelected(false);            
            RadioButtonES_U.setSelected(false);          
            RadioButtonMOD_U.setSelected(false);           
            RadioButtonELI_U.setSelected(false);    
            
            RadioButtonL_ROLES.setSelected(false);            
            RadioButtonES_ROLES.setSelected(false);            
            RadioButtonMOD_ROLES.setSelected(false);           
            RadioButtonELI_ROLES.setSelected(false);                       
                    
             RadioButtonL_MEDICAMENTO.setSelected(false);
            RadioButtonESC_MEDICAMENTO.setSelected(false);
            RadioButtonMOD_MEDICAMENTO.setSelected(false);
            RadioButtonELIM_MEDICAMENTO.setSelected(false);           
                        
            RadioButtonL_CATEGORIA.setSelected(false);
            RadioButtonES_CATEGORIA.setSelected(false);
            RadioButtonMOD_CATEGORIA.setSelected(false);
            RadioButtonELI_CATEGORIA.setSelected(false);            
                    
            RadioButtonL_VETERINARIO.setSelected(false);
            RadioButtonESC_VETERINARIO.setSelected(false);
            RadioButtonMOD_VETERINARIO.setSelected(false);
            RadioButtonELIM_VETERINARIO.setSelected(false);
            
             RadioButtonL_CIRUGIA.setSelected(false);
            RadioButtonESC_CIRUGIA.setSelected(false);
            RadioButtonMOD_CIRUGIA.setSelected(false);
            RadioButtonELI_CIRUGIA.setSelected(false);
            
//            RadioButtonL_CATOPERACION.setSelected(false);
//            RadioButtonES_CATOPERACION.setSelected(false);
//            RadioButtonMOD_CATOPERACION.setSelected(false);
//            RadioButtonELI_CATOPERACION.setSelected(false); 
            
            RadioButtonL_TIPOOPERACION.setSelected(false);
            RadioButtonES_TIPOOPERACION.setSelected(false);
            RadioButtonMOD_TIPOOPERACION.setSelected(false);
            RadioButtonELI_TIPOOPERACION.setSelected(false);
            
             RadioButtonL_VACUNA.setSelected(false);
            RadioButtonES_VACUNA.setSelected(false);
            RadioButtonMOD_VACUNA.setSelected(false);
            RadioButtonELI_VACUNA.setSelected(false);
            
            RadioButtonL_AFECCION.setSelected(false);
            RadioButtonES_AFECCION.setSelected(false);
            RadioButtonMOD_AFECCION.setSelected(false);
            RadioButtonELI_AFECCION.setSelected(false);
            
            RadioButtonM_LOGO.setSelected(false);
            
            RadioButtonL_PELAJE.setSelected(false);
            RadioButtonES_PELAJE.setSelected(false);
            RadioButtonMOD_PELAJE.setSelected(false);
            RadioButtonELI_PELAJE.setSelected(false);
            
    }

}
