package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ClaseCategoriaTipoOperacion {
    Connection cn;
    CallableStatement cmd;   
    
   public ClaseCategoriaTipoOperacion(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    } 
   
    public void LlenarTabla(DefaultTableModel tabla){
      try{
        String sql="SELECT categoriatipo.nombre FROM categoriatipo ORDER BY categoriatipo.nombre ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[1];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("categoriatipo.nombre");            
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }
     
  public int AgregarCategoriaTipoOperacion(String nombre){
     int encontrada=0;   
     String sql="call AgregarCategoriaTipoOperacion(?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,nombre);
           cmd.execute();                      
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
        return encontrada;
    }
     
     public void ModificarCategoriaTipoOperacion(int id,String nombre){
       String sql="call ModificarCategoriaTipoOperacion(?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setString(2,nombre);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }     

  public int EliminarCategoriaTipoOperacion(int idcategoria) {
     int encontrada=0;   
     String sql="call EliminarCategoriaTipoOperacion(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,idcategoria);
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
}
