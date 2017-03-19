package CLASES;
import Conexion.ConexionMySQL;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import PANTALLAS.AltaFichaMedica;

public class ClaseFichasMedicas {
    Connection cn;
    CallableStatement cmd;   

   public ClaseFichasMedicas(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
     
 
   public void LlenarTablaDatosMascotas(DefaultTableModel tabla,int iddueño){
      try{
        String sql="SELECT fichamedica.mascota,sexo,especies.nombre,razas.nombre,situacionpeso FROM fichamedica INNER JOIN pelajexraza ON fichamedica.idpelaje=pelajexraza.id INNER JOIN razas ON  pelajexraza.idraza=razas.id INNER JOIN especies ON especies.id=razas.idespecie WHERE fichamedica.idestado=1 AND fichamedica.idpropietario='"+iddueño+"' ORDER BY mascota ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[5];
        while(rs.next()){//aca se lee el maximo de filas            
            registro[0]=rs.getString("mascota");
            registro[1]=rs.getString("sexo");
            registro[2]=rs.getString("especies.nombre");
            registro[3]=rs.getString("razas.nombre");
            registro[4]=rs.getString("situacionpeso");
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    } 
   
   
public int VerificarDNI(int dni) {
 int encontrada=0; 
 String sql="call VerificarDocumento(?,?)";
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,dni);
      cmd.registerOutParameter(2, java.sql.Types.INTEGER);
      cmd.execute();
      encontrada=cmd.getInt(2);
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
      return encontrada;
    }
   
  public int AgregarPropietario(String apellido,String nombre,int documento,int idpersona){
     int encontrada=0;   
     String sql="call AgregarPropietario(?,?,?,?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,apellido);           
           cmd.setString(2,nombre);
           cmd.setInt(3,documento);
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
     
 public void ModificarPropietario(int id,String apellido,String nombre){
   String sql="call ModificarPropietario(?,?,?)";
    try{
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,id);
      cmd.setString(2,apellido);
      cmd.setString(3,nombre);
      cmd.execute();
   }catch(Exception ex){
     System.out.println(ex.getMessage());
   }
} 
 
 public int VerificarMascota(int dueño,String mascota) {
 int encontrada=0; 
 String sql="call VerificarMascota(?,?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,dueño);
      cmd.setString(2,mascota);
      cmd.registerOutParameter(3, java.sql.Types.INTEGER);
      cmd.execute();
      encontrada=cmd.getInt(3);
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
      return encontrada;
    }

public void AgregarDatosMascota(int idPropietario,String fecha,String nombre,String fechaNacimiento,int idpelaje,String sexo,double kilaje,int edad,String tiemponac,String situacion,String datoImagen){
       String sql="INSERT INTO fichamedica(idpropietario,fecha,mascota,cumpleaños,idpelaje,sexo,kilaje,edad,tiemponac,situacionpeso,direimagen,imagen,idestado,idlogo)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         try {
              FileInputStream imagen;
              PreparedStatement pst=cn.prepareStatement(sql);
              pst.setInt(1,idPropietario);
              pst.setString(2,fecha);
              pst.setString(3,nombre);
              pst.setString(4,fechaNacimiento);
              pst.setInt(5,idpelaje);              
              pst.setString(6,sexo);             
              pst.setDouble(7,kilaje);
              pst.setInt(8,edad);
              pst.setString(9,tiemponac);
              pst.setString(10,situacion);
              pst.setString(11,datoImagen);
              imagen=new FileInputStream(datoImagen);
              pst.setBlob(12,imagen);
              pst.setInt(13,1);
              pst.setInt(14,1);
              pst.execute();
         }catch(SQLException | FileNotFoundException ex){
            System.out.println(ex.getMessage());
       }
     }

public void ActualizarFechaNac(int idficha,int edad,String tiemponac){
  String sql="UPDATE fichamedica SET edad=?,tiemponac=? WHERE id=?";
    try {
          PreparedStatement pst=cn.prepareStatement(sql);
          pst.setInt(1,idficha);
          pst.setInt(2,edad);
          pst.setString(3,tiemponac);
          pst.execute();
          
    }catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
}        

public void InsertarDatosAuditoria(String fechaActual, String hor, String usu, String tabla, String operacion, String anterior, String nuevo) {
String sql="call InsertarDatosAuditoria(?,?,?,?,?,?,?)";    
try{                
  cmd=cn.prepareCall(sql);
  cmd.setString(1,fechaActual);
  cmd.setString(2,hor);
  cmd.setString(3,usu);
  cmd.setString(4,tabla);
  cmd.setString(5,operacion);
  cmd.setString(6,anterior);
  cmd.setString(7,nuevo);
  cmd.execute();

}catch(Exception ex){
     System.out.println(ex.getMessage());
   }
}
    
 public void agregarHistorial(int idFicha, int nrohistorial, String opcionVacunas,String opcionParasitos, String parasitos, String opcionAlergias, String alergias, String opcionDesparasitado, String tiempodesparcombo, String opcionProbResp, String opcionPreñada,int cantPreñada,String opcionPreñadaMayora3,String opcionCastrado,String situacion) {
    String sql="call agregarHistorial(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,idFicha);
      cmd.setInt(2,nrohistorial);
      cmd.setString(3,opcionVacunas);     
      cmd.setString(4,opcionParasitos);
      cmd.setString(5,parasitos);
      cmd.setString(6,opcionAlergias);
      cmd.setString(7,alergias);
      cmd.setString(8,opcionDesparasitado);      
      cmd.setString(9,tiempodesparcombo);
      cmd.setString(10,opcionProbResp);
      cmd.setString(11,opcionPreñada);
      cmd.setInt(12,cantPreñada);
      cmd.setString(13,opcionPreñadaMayora3);
      cmd.setString(14,opcionCastrado);
  
      cmd.setString(15,situacion);
      cmd.execute();
      
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       }  
    }

public void ModificarDatosMascota(int idFicha, int idPropietario,String nombre,String fechaNacimiento,int idpelaje,String sexo,double kilaje,int edad,String tiemponac,String situacion,String datoImagen) {
        String sql="UPDATE fichamedica SET idpropietario=?,mascota=?,cumpleaños=?,idpelaje=?,sexo=?,kilaje=?,edad=?,tiemponac=?,situacionpeso=?,direimagen=?,imagen=?  WHERE fichamedica.id="+idFicha;
         try {             
              PreparedStatement pst=cn.prepareStatement(sql);              
              pst.setInt(1,idPropietario);              
              pst.setString(2,nombre);
              pst.setString(3,fechaNacimiento);
              pst.setInt(4,idpelaje);              
              pst.setString(5,sexo);              
              pst.setDouble(6,kilaje);
              pst.setInt(7,edad);
              pst.setString(8,tiemponac);              
              pst.setString(9,situacion);               
              pst.setString(10,datoImagen);
              FileInputStream imagen;
              imagen=new FileInputStream(datoImagen);
              pst.setBlob(11,imagen);
              
              pst.executeUpdate();
       }catch(SQLException | FileNotFoundException ex){
         System.out.println(ex.getMessage());
       }
    }

    public void ModificarHistorial(int nrohistorial, String opcionVacunas,String opcionParasitos, String parasitos, String opcionAlergias, String alergias, String opcionDesparasitado,String tiempodesparcombo, String opcionProbResp, String opcionPreñada,int cantPreñada,String opcionPreñadaMayora3,String opcionCastrado,String situacion) {
    String sql="call ModificarHistorial(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    
    try{                
      cmd=cn.prepareCall(sql);      
      cmd.setInt(1,nrohistorial);
      cmd.setString(2,opcionVacunas);      
      cmd.setString(3,opcionParasitos);
      cmd.setString(4,parasitos);
      cmd.setString(5,opcionAlergias);
      cmd.setString(6,alergias);
      cmd.setString(7,opcionDesparasitado);      
      cmd.setString(8,tiempodesparcombo);
      cmd.setString(9,opcionProbResp);
      cmd.setString(10,opcionPreñada);
      cmd.setInt(11,cantPreñada);
      cmd.setString(12,opcionPreñadaMayora3);
      cmd.setString(13,opcionCastrado);     
      cmd.setString(14,situacion);
      cmd.execute();      
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       } 
    }

 public int agregarVacunaxMascota(int idFicha, int IDVacuna,String d) {
   int encontrada=0; 
    String sql="call agregarVacunaxMascota(?,?,?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,idFicha);
      cmd.setInt(2,IDVacuna);
      cmd.setString(3,d);
      cmd.registerOutParameter(4, java.sql.Types.INTEGER);
      cmd.execute();
      encontrada=cmd.getInt(4);
      
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
     return encontrada;
 }

 public void QuitarVacunaxMascota(int idHistorial,int IDVACUNA) {
    String sql="call QuitarVacunaxMascota(?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,idHistorial);
      cmd.setInt(2,IDVACUNA);
      cmd.execute();
      
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       } 
    }
 
 public int agregarAfeccionxHC(int idHistorial, int IDAfeccion) {
   int encontrada=0;
   String sql="call agregarAfeccionxHC(?,?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,idHistorial);
      cmd.setInt(2,IDAfeccion);
      cmd.registerOutParameter(3, java.sql.Types.INTEGER);
      cmd.execute();
      encontrada=cmd.getInt(3);
      
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       } 
    return encontrada;
    }

  public void quitarAfeccionxHC(int idFicha, int IDAfeccion) {
   String sql="call quitarAfeccionxHC(?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,idFicha);
      cmd.setInt(2,IDAfeccion);
      cmd.execute();
      
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }

    public void LlenarTablaAFECCIONES(DefaultTableModel tabla, int idHistorial) {
       try{
        String sql="SELECT afecciones.nombre FROM afecciones INNER JOIN afeccionesxhistorialclinico  ON afecciones.id=afeccionesxhistorialclinico.idafeccion WHERE afeccionesxhistorialclinico.idhistorial='"+idHistorial+"' ORDER BY afecciones.nombre ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[1];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("afecciones.nombre");
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }

 public int contarFichasxPropietario(int idPropietario) {
   int cantidad=0;
   String sql="call contarFichasxPropietario(?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,idPropietario);
      
      cmd.registerOutParameter(2, java.sql.Types.INTEGER);
      cmd.execute();
      cantidad=cmd.getInt(2);
      
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       } 
    return cantidad;
    }

public int contarAfeccionesxHC(int idHistorial) {
   int cantidad=0;
   String sql="call contarAfeccionesxHC(?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,idHistorial);
      
      cmd.registerOutParameter(2, java.sql.Types.INTEGER);
      cmd.execute();
      cantidad=cmd.getInt(2);
      
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       } 
    return cantidad;
 }

public void BajaFicha(int idFicha) {
 String sql="call BajaFicha(?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,idFicha);      
      cmd.execute();
      
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       }     
    }
}
