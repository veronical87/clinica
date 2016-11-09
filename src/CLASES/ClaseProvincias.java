package CLASES;
import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NOTEBOOK
 */
public class ClaseProvincias {
    Connection cn;
    CallableStatement cmd;
   
    
   public ClaseProvincias(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
   
   
 public void LlenarTablaProvincia(DefaultTableModel tabla){
      try{
        String sql="SELECT nombre FROM provincia ORDER BY nombre ASC";
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
     
public String AgregarProvincia(String prov){
     String encontrada=null;   
     String sql="call agregarProvincia(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,prov);
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
     
     public void ModificarProvincia(int id,String prov){
       String sql="call ModificarProvincia(?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setString(2,prov);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }     
        
    public int EliminarProvincia(int num){
       int encontrada=0;
       String sql="call EliminarProvincia(?,?)";
        try{                
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,num);
          cmd.registerOutParameter(2, java.sql.Types.INTEGER);
          cmd.execute();
          encontrada=cmd.getInt(2);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
        return encontrada;
    }

    public int BuscarCoincidencias(String nombre) {
        int encontrada=0;  
        String sql="call BuscarCoincidencias(?,?)";
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
