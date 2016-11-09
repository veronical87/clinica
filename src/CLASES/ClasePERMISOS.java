package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ClasePERMISOS {
    Connection cn;
    CallableStatement cmd;
    public ClasePERMISOS(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }  
    //**PERMISOS**//
 public void AsociarPermisos(int idrol,int L_FICHAMEDICA,int ESC_FICHAMEDICA,int MOD_FICHAMEDICA,int ELI_FICHAMEDICA,int L_ESPECIE,int ESC_ESPECIE,int MOD_ESPECIE,int ELIM_ESPECIE,int L_RAZA,int ESC_RAZA,int MOD_RAZA,int ELIM_RAZA,int L_MEDICAMENTO,int ESC_MEDICAMENTO,int MOD_MEDICAMENTO,int ELIM_MEDICAMENTO,int L_HORA,int ESC_HORA,int MOD_HORA,int ELIM_HORA,int L_PROVINC,int ES_PROVINC,int  MOD_PROVINC,int ELI_PROVINC,int L_LOC,int ES_LOC,int  MOD_LOC,int  ELI_LOC,int L_TIPOTEL,int ESC_TIPOTEL,int MOD_TIPOTEL,int ELI_TIPOTEL,int L_USU,int ES_USU,int MOD_USU,int ELI_USU,int L_ROL,int ES_ROL,int MOD_ROL,int ELI_ROL,int audi,int res,int PERMISO,int L_VETERINARIO,int ESC_VETERINARIO,int MOD_VETERINARIO,int ELIM_VETERINARIO,int REPORTES,int GRAFICOS,int L_CONSULTA,int ESC_CONSULTA,int MOD_CONSULTA,int ELI_CONSULTA,int L_CATEGORIA,int ESC_CATEGORIA,int MOD_CATEGORIA,int ELI_CATEGORIA,int L_CIRUGIA,int ESC_CIRUGIA,int MOD_CIRUGIA,int ELI_CIRUGIA){
   String sql="call AsociarPermisos(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
          cmd=cn.prepareCall(sql);                   
          cmd.setInt(1,idrol);
          cmd.setInt(2,L_FICHAMEDICA);
          cmd.setInt(3,ESC_FICHAMEDICA);
          cmd.setInt(4,MOD_FICHAMEDICA);
          cmd.setInt(5,ELI_FICHAMEDICA);          
          cmd.setInt(6,L_ESPECIE);
          cmd.setInt(7,ESC_ESPECIE);
          cmd.setInt(8,MOD_ESPECIE);
          cmd.setInt(9,ELIM_ESPECIE);          
          cmd.setInt(10,L_RAZA);
          cmd.setInt(11,ESC_RAZA);
          cmd.setInt(12,MOD_RAZA);
          cmd.setInt(13,ELIM_RAZA);          
          cmd.setInt(14,L_MEDICAMENTO);
          cmd.setInt(15,ESC_MEDICAMENTO);
          cmd.setInt(16,MOD_MEDICAMENTO);
          cmd.setInt(17,ELIM_MEDICAMENTO);          
          cmd.setInt(18,L_HORA);
          cmd.setInt(19,ESC_HORA);
          cmd.setInt(20,MOD_HORA);
          cmd.setInt(21,ELIM_HORA);          
          cmd.setInt(22,L_PROVINC);
          cmd.setInt(23,ES_PROVINC);
          cmd.setInt(24,MOD_PROVINC);
          cmd.setInt(25,ELI_PROVINC);
          cmd.setInt(26,L_LOC);
          cmd.setInt(27,ES_LOC);
          cmd.setInt(28,MOD_LOC);
          cmd.setInt(29,ELI_LOC);          
          cmd.setInt(30,L_TIPOTEL);
          cmd.setInt(31,ESC_TIPOTEL);
          cmd.setInt(32,MOD_TIPOTEL);
          cmd.setInt(33,ELI_TIPOTEL);
          cmd.setInt(34,L_USU);
          cmd.setInt(35,ES_USU);
          cmd.setInt(36,MOD_USU);
          cmd.setInt(37,ELI_USU);        
          cmd.setInt(38,L_ROL);
          cmd.setInt(39,ES_ROL);
          cmd.setInt(40,MOD_ROL);
          cmd.setInt(41,ELI_ROL);      
          cmd.setInt(42,audi);
          cmd.setInt(43,res);
          cmd.setInt(44,PERMISO);
          cmd.setInt(45,L_VETERINARIO);
          cmd.setInt(46,ESC_VETERINARIO);
          cmd.setInt(47,MOD_VETERINARIO);
          cmd.setInt(48,ELIM_VETERINARIO);  
          cmd.setInt(49,REPORTES);
          cmd.setInt(50,GRAFICOS);          
          cmd.setInt(51,L_CONSULTA);
          cmd.setInt(52,ESC_CONSULTA);
          cmd.setInt(53,MOD_CONSULTA);
          cmd.setInt(54,ELI_CONSULTA);
          cmd.setInt(55,L_CATEGORIA);
          cmd.setInt(56,ESC_CATEGORIA);
          cmd.setInt(57,MOD_CATEGORIA);
          cmd.setInt(58,ELI_CATEGORIA);
          cmd.setInt(59,L_CIRUGIA);
          cmd.setInt(60,ESC_CIRUGIA);
          cmd.setInt(61,MOD_CIRUGIA);
          cmd.setInt(62,ELI_CIRUGIA);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }
    
 public void ActualizarPermisos(int idrol,int L_FICHAMEDICA,int ESC_FICHAMEDICA,int MOD_FICHAMEDICA,int ELI_FICHAMEDICA,int L_ESPECIE,int ESC_ESPECIE,int MOD_ESPECIE,int ELIM_ESPECIE,int L_RAZA,int ESC_RAZA,int MOD_RAZA,int ELIM_RAZA,int L_MEDICAMENTO,int ESC_MEDICAMENTO,int MOD_MEDICAMENTO,int ELIM_MEDICAMENTO,int L_HORA,int ESC_HORA,int MOD_HORA,int ELIM_HORA,int L_PROVINC,int ES_PROVINC,int  MOD_PROVINC,int ELI_PROVINC,int L_LOC,int ES_LOC,int  MOD_LOC,int  ELI_LOC,int L_TIPOTEL,int ESC_TIPOTEL,int MOD_TIPOTEL,int ELI_TIPOTEL,int L_USU,int ES_USU,int MOD_USU,int ELI_USU,int L_ROL,int ES_ROL,int MOD_ROL,int ELI_ROL,int audi,int res,int PERMISO,int L_VETERINARIO,int ESC_VETERINARIO,int MOD_VETERINARIO,int ELIM_VETERINARIO,int REPORTES,int GRAFICOS,int L_CONSULTA,int ESC_CONSULTA,int MOD_CONSULTA,int ELI_CONSULTA,int L_CATEGORIA,int ESC_CATEGORIA,int MOD_CATEGORIA,int ELI_CATEGORIA,int L_CIRUGIA,int ESC_CIRUGIA,int MOD_CIRUGIA,int ELI_CIRUGIA){
   String sql="call ActualizarPermisos(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
          cmd=cn.prepareCall(sql);          
           cmd.setInt(1,idrol);
          cmd.setInt(2,L_FICHAMEDICA);
          cmd.setInt(3,ESC_FICHAMEDICA);
          cmd.setInt(4,MOD_FICHAMEDICA);
          cmd.setInt(5,ELI_FICHAMEDICA);          
          cmd.setInt(6,L_ESPECIE);
          cmd.setInt(7,ESC_ESPECIE);
          cmd.setInt(8,MOD_ESPECIE);
          cmd.setInt(9,ELIM_ESPECIE);          
          cmd.setInt(10,L_RAZA);
          cmd.setInt(11,ESC_RAZA);
          cmd.setInt(12,MOD_RAZA);
          cmd.setInt(13,ELIM_RAZA);          
          cmd.setInt(14,L_MEDICAMENTO);
          cmd.setInt(15,ESC_MEDICAMENTO);
          cmd.setInt(16,MOD_MEDICAMENTO);
          cmd.setInt(17,ELIM_MEDICAMENTO);          
          cmd.setInt(18,L_HORA);
          cmd.setInt(19,ESC_HORA);
          cmd.setInt(20,MOD_HORA);
          cmd.setInt(21,ELIM_HORA);          
          cmd.setInt(22,L_PROVINC);
          cmd.setInt(23,ES_PROVINC);
          cmd.setInt(24,MOD_PROVINC);
          cmd.setInt(25,ELI_PROVINC);
          cmd.setInt(26,L_LOC);
          cmd.setInt(27,ES_LOC);
          cmd.setInt(28,MOD_LOC);
          cmd.setInt(29,ELI_LOC);          
          cmd.setInt(30,L_TIPOTEL);
          cmd.setInt(31,ESC_TIPOTEL);
          cmd.setInt(32,MOD_TIPOTEL);
          cmd.setInt(33,ELI_TIPOTEL);
          cmd.setInt(34,L_USU);
          cmd.setInt(35,ES_USU);
          cmd.setInt(36,MOD_USU);
          cmd.setInt(37,ELI_USU);        
          cmd.setInt(38,L_ROL);
          cmd.setInt(39,ES_ROL);
          cmd.setInt(40,MOD_ROL);
          cmd.setInt(41,ELI_ROL);      
          cmd.setInt(42,audi);
          cmd.setInt(43,res);
          cmd.setInt(44,PERMISO);
          cmd.setInt(45,L_VETERINARIO);
          cmd.setInt(46,ESC_VETERINARIO);
          cmd.setInt(47,MOD_VETERINARIO);
          cmd.setInt(48,ELIM_VETERINARIO);  
          cmd.setInt(49,REPORTES);
          cmd.setInt(50,GRAFICOS);          
          cmd.setInt(51,L_CONSULTA);
          cmd.setInt(52,ESC_CONSULTA);
          cmd.setInt(53,MOD_CONSULTA);
          cmd.setInt(54,ELI_CONSULTA);
          cmd.setInt(55,L_CATEGORIA);
          cmd.setInt(56,ESC_CATEGORIA);
          cmd.setInt(57,MOD_CATEGORIA);
          cmd.setInt(58,ELI_CATEGORIA);
          cmd.setInt(59,L_CIRUGIA);
          cmd.setInt(60,ESC_CIRUGIA);
          cmd.setInt(61,MOD_CIRUGIA);
          cmd.setInt(62,ELI_CIRUGIA);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }
     
        
    
public int  ExisteRol_Pantallas(int rol) {
  int encontrado=0;   
  String sql="call ExisteRol_Pantallas(?,?)";
     try{
        cmd=cn.prepareCall(sql);
        cmd.setInt(1,rol);
        cmd.registerOutParameter(2, java.sql.Types.INTEGER);
        cmd.execute();
        encontrado=cmd.getInt(2);

//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
        return encontrado;                       
    }
}
