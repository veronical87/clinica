package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ClasePelaje {
    Connection cn;
    CallableStatement cmd;   
    
   public ClasePelaje(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }   
   
    public void LlenarTabla(DefaultTableModel tabla){
      try{
        String sql="SELECT pelajexraza.id,pelajexraza.nombre,razas.nombre FROM razas INNER JOIN pelajexraza ON pelajexraza.idraza=razas.id ORDER BY razas.nombre ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[3];
        while(rs.next()){//aca se lee el maximo de filas  
            registro[0]=rs.getString("pelajexraza.id");
            registro[1]=rs.getString("razas.nombre");
            registro[2]=rs.getString("pelajexraza.nombre");
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }
     
  public int EliminarPelaje(int idpelaje) {
     int encontrada=0;   
     String sql="call EliminarPelaje(?,?)";
        try{
           cmd=cn.prepareCall(sql);
          
           cmd.setInt(1,idpelaje);
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
     
  public int AgregarPelaje(String nombre,int idraza){
     int encontrada=0;   
     String sql="call AgregarPelaje(?,?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,nombre);
           cmd.setInt(2,idraza);
          
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
     
     public void ModificarPelaje(int id,String nombre,int idraza){
       String sql="call ModificarPelaje(?,?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setString(2,nombre);
          cmd.setInt(3,idraza);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    } 
 
}
