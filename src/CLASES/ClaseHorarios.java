package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ClaseHorarios {
  Connection cn;
  CallableStatement cmd;   
    
   public ClaseHorarios(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    } 
   
   public void LlenarTabla(DefaultTableModel tabla){
      try{
        String sql="SELECT id,hora,minutos FROM horarios ORDER BY id ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[2];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("id");
            registro[1]=rs.getString("hora")+":"+rs.getString("minutos");
           
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }
     
  public int AgregarDatosHora(int hora,String minuto){
     int encontrada=0;   
     String sql="call AgregarDatosHora(?,?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,hora);
           cmd.setString(2,minuto);
           cmd.registerOutParameter(3, java.sql.Types.INTEGER);
           cmd.execute();
           encontrada=cmd.getInt(3);           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
        return encontrada;
    }
     
     public void ModificarDatosHora(int id,int hora,String minuto){
       String sql="call ModificarDatosHora(?,?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setInt(2,hora);
          cmd.setString(3,minuto);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }  
     

public int EliminarDatosHora(int id) {
     int encontrada=0;   
     String sql="call EliminarDatosHora(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,id);
           cmd.registerOutParameter(2,java.sql.Types.INTEGER);
           cmd.execute();
           encontrada=cmd.getInt(2);           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
           }      
        return encontrada;
      }

}
