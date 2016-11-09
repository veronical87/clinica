package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vero
 */
public class ClaseEspecies {    
    Connection cn;
    CallableStatement cmd;
   
    
   public ClaseEspecies(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }   
   
    public void LlenarTabla(DefaultTableModel tabla){
      try{
        String sql="SELECT nombre FROM especies ORDER BY nombre ASC";
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
     
 
     
  public int AgregarEspecie(String nombre){
     int encontrada=0;   
     String sql="call AgregarEspecie(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,nombre);
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
     
     public void ModificarEspecie(int id,String nombre){
       String sql="call ModificarEspecie(?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setString(2,nombre);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }  
     

public int EliminarEspecie(int idespecie) {
     int encontrada=0;   
     String sql="call EliminarEspecie(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,idespecie);
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
    
  public String VerificarEspecie(String nombre){
     String encontrada=null;   
     String sql="call VerificarEspecie(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,nombre);
           cmd.registerOutParameter(2, java.sql.Types.VARCHAR);
           cmd.execute();
           encontrada=cmd.getString(2);
           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
        return encontrada;
    }
}
