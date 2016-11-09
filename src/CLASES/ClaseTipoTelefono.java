package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class ClaseTipoTelefono {
    Connection cn;
    CallableStatement cmd;
  public ClaseTipoTelefono(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }   
 
  
  public void LlenarTabla_TipoTelefono(DefaultTableModel tabla){   
      try{
        String sql="SELECT nombre FROM tipotelefono ORDER BY nombre ASC";
        CallableStatement cmd=cn.prepareCall(sql);
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
    
  
  public int agregarTipoTelefono(String tipo) {
     int encontrado=0;   
     String sql="call agregarTipoTelefono(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,tipo);
           cmd.registerOutParameter(2, java.sql.Types.INTEGER);
           cmd.execute();
           encontrado=cmd.getInt(2);
        }catch(Exception ex){
          System.out.println(ex.getMessage());
           }      
        return encontrado;                       
    }
    
 public void ModificarTipoTelefono(int id,String nombre){
       String sql="call ModificarTipoTelefono(?,?)";
        try{
            cmd=cn.prepareCall(sql);
            cmd.setInt(1, id);
            cmd.setString(2,nombre);
            cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }
    
    public int EliminarTipoTelefono(int id){
       int encontrada=0; 
       String sql="call EliminarTipoTelefono(?,?)";
        try{
            cmd=cn.prepareCall(sql);
            cmd.setInt(1,id);
            cmd.registerOutParameter(2, java.sql.Types.INTEGER);
           cmd.execute();
           encontrada=cmd.getInt(2);
            
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
       return encontrada; 
    } 
    
    public String BuscarCoincidencias(String nombre){
       String encontrada=null; 
       String sql="call BuscarCoincidenciasTipoTelefono(?)";
        try{
            cmd=cn.prepareCall(sql);
            cmd.setString(1,nombre);
            cmd.registerOutParameter(2, java.sql.Types.VARCHAR);
           cmd.execute();
           encontrada=cmd.getString(2);
            
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
       return encontrada; 
    }   
    
}
