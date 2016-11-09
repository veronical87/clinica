package CLASES;

import Conexion.ConexionMySQL;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NOTEBOOK
 */
public class Clase_Roles {
   Connection cn;
   CallableStatement cmd;
    public Clase_Roles(){//constructor
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
     
    
    public void LlenarTablaTipo_Rol(DefaultTableModel tabla){
       try{
        String sql="SELECT nombre FROM roles ORDER BY nombre ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[1];
        while(rs.next()){//aca se lee el maximo de filas
           
           registro[0]=rs.getString("nombre");
           
           tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();
      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }
    
public int Agregar(String tipo){
     int encontrada=0;   
       String sql="call agregarRol(?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setString(1, tipo);
          cmd.registerOutParameter(2, java.sql.Types.VARCHAR);
          cmd.execute();
          encontrada=cmd.getInt(2);
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
        return encontrada;
    }
       
  public void Modificar(int id,String rol){
       String sql="call ModificarRol(?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1, id);
          cmd.setString(2,rol);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }
         
  public int Eliminar(int tipo) {
     int encontrado=0;   
     String sql="call EliminarTipoRol(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,tipo);
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
  
  public int BuscarCoincidencias(String nombre) {
        int encontrada=0;  
        String sql="call BuscarCoincidenciasxRol(?,?)";
        try{                
          cmd=cn.prepareCall(sql);
          cmd.setString(1,nombre);
          cmd.registerOutParameter(2, java.sql.Types.INTEGER);
          cmd.execute();
          encontrada=cmd.getInt(2); 
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       } 
        return encontrada;
    }
    
}
