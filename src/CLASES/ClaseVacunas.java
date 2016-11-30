package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ClaseVacunas {
    Connection cn;
    CallableStatement cmd;   
    
   public ClaseVacunas(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }   
   
    public void LlenarTabla(DefaultTableModel tabla){
      try{
        String sql="SELECT controlvacunas.nombre,especies.nombre,condicion FROM controlvacunas INNER JOIN especies ON controlvacunas.idespecie=especies.id ORDER BY controlvacunas.nombre ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[3];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("controlvacunas.nombre");            
            registro[1]=rs.getString("especies.nombre");
            registro[2]=rs.getString("condicion");
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }     
 
     
  public int AgregarVacuna(String nombre,int especie,String condicion){
     int encontrada=0;   
     String sql="call AgregarVacuna(?,?,?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,nombre);
           cmd.setInt(2,especie);
           cmd.setString(3,condicion);
           cmd.registerOutParameter(4, java.sql.Types.INTEGER);
           cmd.execute();
           encontrada=cmd.getInt(4);
           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
        return encontrada;
    }
     
     public void ModificarVacuna(int id,String nombre,int especie,String condicion){
       String sql="call ModificarVacuna(?,?,?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setString(2,nombre);
          cmd.setInt(3,especie);
          cmd.setString(4,condicion);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }  
     

public int EliminarVacuna(int idvacuna) {
     int encontrada=0;   
     String sql="call EliminarVacuna(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,idvacuna);
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
    
  public String VerificarVacuna(String nombre){
     String encontrada=null;   
     String sql="call VerificarVacuna(?,?)";
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
    
  public void CargarVacunasPendientesxHistorial(int nrohistorial,int especie){      
     String sql="call CargarVacunasPendientesxHistorial(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,nrohistorial);
           cmd.setInt(2, especie);
           cmd.execute();                  
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }         
    }
  
   public void ActualizarVacunaPendiente(int historial,int vacuna,String situacion){      
     String sql="call ActualizarVacunaPendiente(?,?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,historial);   
           cmd.setInt(2,vacuna); 
           cmd.setString(3,situacion);
           cmd.execute();                  
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
       
    }

}
