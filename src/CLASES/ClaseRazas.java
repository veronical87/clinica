package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class ClaseRazas {
    Connection cn;
    CallableStatement cmd;
   
    
   public ClaseRazas(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
   
   
    public void LlenarTabla(DefaultTableModel tabla){
      try{
        String sql="SELECT especies.nombre,razas.nombre,tamano FROM razas inner join especies on razas.idespecie=especies.id ORDER BY especies.nombre ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[3];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("especies.nombre");
            registro[1]=rs.getString("razas.nombre");
            registro[2]=rs.getString("tamano");
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }
     
  public int EliminarRaza(int idraza) {
     int encontrada=0;   
     String sql="call EliminarRaza(?,?)";
        try{
           cmd=cn.prepareCall(sql);
          
           cmd.setInt(1,idraza);
           cmd.registerOutParameter(2, java.sql.Types.INTEGER);
           cmd.execute();
           encontrada=cmd.getInt(2);           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
           }      
        return encontrada;
      }
     
  public int AgregarRaza(String nombre,int idespecie,String tamaño,int pesominhembra,int pesomaxhembra,int pesominmacho,int pesomaxmacho){
     int encontrada=0;   
     String sql="call AgregarRaza(?,?,?,?,?,?,?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,nombre);
           cmd.setInt(2,idespecie);
           cmd.setString(3,tamaño);
           cmd.setInt(4,pesominhembra);
           cmd.setInt(5,pesomaxhembra);
           cmd.setInt(6,pesominmacho);
           cmd.setInt(7,pesomaxmacho);
           cmd.registerOutParameter(8, java.sql.Types.INTEGER);
           cmd.execute();
           encontrada=cmd.getInt(8);
           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
        return encontrada;
    }
     
     public void ModificarRaza(int id,String nombre,int idespecie,String tamaño,int pesominhembra,int pesomaxhembra,int pesominmacho,int pesomaxmacho){
       String sql="call ModificarRaza(?,?,?,?,?,?,?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setString(2,nombre);
          cmd.setInt(3,idespecie);
          cmd.setString(4,tamaño);
           cmd.setInt(5,pesominhembra);
           cmd.setInt(6,pesomaxhembra);
           cmd.setInt(7,pesominmacho);
           cmd.setInt(8,pesomaxmacho);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }           
    
  public int VerificarRaza(int idespecie,String nombre){
     int encontrada=0;   
     String sql="call VerificarRaza(?,?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,idespecie);
           cmd.setString(2,nombre);
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
  
 
}
