package CLASES;

import Conexion.ConexionMySQL;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClaseVeterinarios {
     Connection cn;
     CallableStatement cmd;
    public ClaseVeterinarios(){//constructor
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
    public void LlenarTabla(DefaultTableModel tabla){   
      try{
        String sql="SELECT CONCAT(apellido,veterinarios.nombre) AS vet,tipotelefono.nombre,localidades.codigo,numerotelefono,email FROM localidades INNER JOIN personas ON localidades.id=personas.idlocalidad INNER JOIN veterinarios ON veterinarios.idpersona=personas.id INNER JOIN tipopersona ON tipopersona.id=personas.idtipopersona INNER JOIN tipotelefono ON tipotelefono.id=personas.idtipotelefono WHERE personas.idtipopersona=2 AND personas.idestado=1 ORDER BY CONCAT(apellido,veterinarios.nombre) ASC";
        CallableStatement cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[4];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("vet");            
            registro[1]=rs.getString("Tipotelefono.nombre");
            registro[2]=rs.getString("localidades.codigo")+"-"+rs.getString("numerotelefono");
            registro[3]=rs.getString("email");
            tabla.addRow(registro); 
        }      
      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }
    }

public int agregarVeterinario(String ape,String nom,int matricula,int idpersona) {
     int encontrada=0;   
     String sql="call agregarVeterinario(?,?,?,?,?)";
        try{           
           cmd=cn.prepareCall(sql);
           
           cmd.setString(1,ape);
           cmd.setString(2,nom);
           cmd.setInt(3,matricula);
           cmd.setInt(4,idpersona);
           cmd.registerOutParameter(5, java.sql.Types.INTEGER);
           cmd.execute();
           encontrada=cmd.getInt(5);
           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
           }      
        return encontrada;                       
    }

public int EliminarVeterinario(int idveterinario){
   int encontrada=0;   
     String sql="call EliminarVeterinario(?,?)";
        try{           
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,idveterinario);
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

public void ModificarVeterinario(int idvet,String ape,String nom,int matricula){
       String sql="call ModificarVeterinario(?,?,?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,idvet);        
          cmd.setString(2,ape);
          cmd.setString(3,nom);
          cmd.setInt(4,matricula);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }

public int BuscarCoincidenciasxVeterinario(int matricula){
   int encontrada=0;   
     String sql="call BuscarCoincidenciasxVeterinario(?,?)";
        try{           
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,matricula);
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


