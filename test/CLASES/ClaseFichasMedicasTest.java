package CLASES;

import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vero
 */
public class ClaseFichasMedicasTest {
    
    public ClaseFichasMedicasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of AgregarPropietario method, of class ClaseFichasMedicas.
     */
    @Test
    public void testAgregarPropietario() {
        System.out.println("AgregarPropietario");
        String apellido = "RODRIGUEZ";
        String nombre = "GIMENA";
        int documento = 36985221;
        int idpersona = 16;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.AgregarPropietario(apellido, nombre, documento, idpersona);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of VerificarDNI method, of class ClaseFichasMedicas.
     */
    @Test
    public void testVerificarDNI() {
        System.out.println("VerificarDNI");
        int dni = 36985221;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.VerificarDNI(dni);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of LlenarTablaDatosMascotas method, of class ClaseFichasMedicas.
     */
    @Test
    public void testLlenarTablaDatosMascotas() {
        System.out.println("LlenarTablaDatosMascotas");
        DefaultTableModel tabla = null;
        int iddueño = 9;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.LlenarTablaDatosMascotas(tabla, iddueño);
    }

    /**
     * Test of ModificarPropietario method, of class ClaseFichasMedicas.
     */
    @Test
    public void testModificarPropietario() {
        System.out.println("ModificarPropietario");
        int id = 9;
        String apellido = "RODRIGUEZ";
        String nombre = "SABRINA";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.ModificarPropietario(id, apellido, nombre);
    }

    /**
     * Test of AgregarDatosMascota method, of class ClaseFichasMedicas.
     */
    @Test
    public void testAgregarDatosMascota() {
        System.out.println("AgregarDatosMascota");
        int idPropietario = 9;
        String fecha = "2017/02/28";
        String nombre = "SILVESTRE";
        String fechaNacimiento = "2013/04/11";
        int idpelaje =89;
        String sexo = "MACHO";
        double kilaje = 5.837;
        int edad = 4;
        String tiemponac = "AÑOS";
        String situacion = "NORMAL";
        String datoImagen = "C:\\Users\\Vero\\Documents\\NetBeansProjects\\ClinicaVet\\src\\ICONOS\\Imagenes-Razas\\gato-comun-blancoconnegro.jpg";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.AgregarDatosMascota(idPropietario, fecha, nombre, fechaNacimiento, idpelaje, sexo, kilaje, edad, tiemponac, situacion, datoImagen);
 }
    
    /**
     * Test of VerificarMascota method, of class ClaseFichasMedicas.
     */
    @Test
    public void testVerificarMascota() {
        System.out.println("VerificarMascota");
        int dueño = 9;
        String mascota = "";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.VerificarMascota(dueño, mascota);
        assertEquals(expResult, result);
    }

    /**
     * Test of ActualizarFechaNac method, of class ClaseFichasMedicas.
     */
    @Test
    public void testActualizarFechaNac() {
        System.out.println("ActualizarFechaNac");
        int idficha = 12;
        int edad = 4;
        String tiemponac = "AÑOS";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.ActualizarFechaNac(idficha, edad, tiemponac);
    }

//    /**
//     * Test of InsertarDatosAuditoria method, of class ClaseFichasMedicas.
//     */
//    @Test
    public void testInsertarDatosAuditoria() {
        System.out.println("InsertarDatosAuditoria");
        String fechaActual = "2017/02/28";
        String hor = "12:55";
        String usu = "PIRELLI,GIMENA";
        String tabla = "FICHAS MEDICAS";
        String operacion = "ALTA";
        String anterior = "";
        String nuevo = "Propietario:RODRIGUEZ,SABRINA;Mascota:SILVESTRE";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.InsertarDatosAuditoria(fechaActual, hor, usu, tabla, operacion, anterior, nuevo);
       
    }

    /**
     * Test of agregarHistorial method, of class ClaseFichasMedicas.
     */
    @Test
    public void testAgregarHistorial() {
        System.out.println("agregarHistorial");
        int idFicha = 12;
        int nrohistorial = 12;
        String opcionVacunas = "Si";
        String opcionParasitos = "Si";
        String parasitos = "gusanos redondos y pulgas";
        String opcionAlergias = "Si";
        String alergias = "pulguicidas";
        String opcionDesparasitado = "Si";
        String tiempodesparcombo = "";
        String opcionProbResp = "Si";
        String opcionPreñada = "No";
        int cantPreñada = 0;
        String opcionPreñadaMayora3 = "No";
        String opcionCastrado = "No";
        String situacion = "REALIZADO";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.agregarHistorial(idFicha, nrohistorial, opcionVacunas, opcionParasitos, parasitos, opcionAlergias, alergias, opcionDesparasitado, tiempodesparcombo, opcionProbResp, opcionPreñada, cantPreñada, opcionPreñadaMayora3, opcionCastrado, situacion);
     }

    /**
     * Test of ModificarDatosMascota method, of class ClaseFichasMedicas.
     */
    @Test
    public void testModificarDatosMascota() {
        System.out.println("ModificarDatosMascota");
        int idFicha = 12;
        int idPropietario = 9;       
        String nombre = "SILVESTRE";
        String fechaNacimiento = "2013/04/11";
        int idpelaje =89;
        String sexo = "MACHO";
        double kilaje = 5.837;
        int edad = 4;
        String tiemponac = "AÑOS";
        String situacion = "NORMAL";
        String datoImagen = "C:\\Users\\Vero\\Documents\\NetBeansProjects\\ClinicaVet\\src\\ICONOS\\Imagenes-Razas\\gato-comun-blancoconnegro.jpg";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.ModificarDatosMascota(idFicha, idPropietario, nombre, fechaNacimiento, idpelaje, sexo, kilaje, edad, tiemponac, situacion, datoImagen);
   }

    /**
     * Test of ModificarHistorial method, of class ClaseFichasMedicas.
     */
    @Test
    public void testModificarHistorial() {
        System.out.println("ModificarHistorial");
        int nrohistorial =12;
        String opcionVacunas = "Si";
        String opcionParasitos = "Si";
        String parasitos = "gusanos redondos y pulgas";
        String opcionAlergias = "Si";
        String alergias = "pulguicidas";
        String opcionDesparasitado = "Si";
        String tiempodesparcombo = "";
        String opcionProbResp = "Si";
        String opcionPreñada = "No";
        int cantPreñada = 0;
        String opcionPreñadaMayora3 = "No";
        String opcionCastrado = "No";
        String situacion = "REALIZADO";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.ModificarHistorial(nrohistorial, opcionVacunas, opcionParasitos, parasitos, opcionAlergias, alergias, opcionDesparasitado, tiempodesparcombo, opcionProbResp, opcionPreñada, cantPreñada, opcionPreñadaMayora3, opcionCastrado, situacion);
        
    }

    /**
     * Test of agregarVacunaxMascota method, of class ClaseFichasMedicas.
     */
    @Test
    public void testAgregarVacunaxMascota() {
        System.out.println("agregarVacunaxMascota");
        int idFicha = 12;
        int IDVacuna = 3;
        String d = "2016/12/1";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.agregarVacunaxMascota(idFicha, IDVacuna, d);
        assertEquals(expResult, result);
    }

    /**
     * Test of QuitarVacunaxMascota method, of class ClaseFichasMedicas.
     */
    @Test
    public void testQuitarVacunaxMascota() {
        System.out.println("QuitarVacunaxMascota");
        int id = 1;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.QuitarVacunaxMascota(id);
    }

    /**
     * Test of agregarAfeccionxHC method, of class ClaseFichasMedicas.
     */
    @Test
    public void testAgregarAfeccionxHC() {
        System.out.println("agregarAfeccionxHC");
        int idHistorial = 12;
        int IDAfeccion = 3;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.agregarAfeccionxHC(idHistorial, IDAfeccion);
        assertEquals(expResult, result);
    }

    /**
     * Test of quitarAfeccionxHC method, of class ClaseFichasMedicas.
     */
    @Test
    public void testQuitarAfeccionxHC() {
        System.out.println("quitarAfeccionxHC");
        int idFicha = 12;
        int IDAfeccion = 3;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.quitarAfeccionxHC(idFicha, IDAfeccion);
    }

    /**
     * Test of LlenarTablaAFECCIONES method, of class ClaseFichasMedicas.
     */
    @Test
    public void testLlenarTablaAFECCIONES() {
        System.out.println("LlenarTablaAFECCIONES");
        DefaultTableModel tabla = null;
        int idHistorial = 12;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.LlenarTablaAFECCIONES(tabla, idHistorial);
    }

    /**
     * Test of contarFichasxPropietario method, of class ClaseFichasMedicas.
     */
    @Test
    public void testContarFichasxPropietario() {
        System.out.println("contarFichasxPropietario");
        int idPropietario = 9;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.contarFichasxPropietario(idPropietario);
        assertEquals(expResult, result);
    }

    /**
     * Test of contarAfeccionesxHC method, of class ClaseFichasMedicas.
     */
    @Test
    public void testContarAfeccionesxHC() {
        System.out.println("contarAfeccionesxHC");
        int idHistorial = 12;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.contarAfeccionesxHC(idHistorial);
        assertEquals(expResult, result);
    }

    /**
     * Test of BajaFicha method, of class ClaseFichasMedicas.
     */
    @Test
    public void testBajaFicha() {
        System.out.println("BajaFicha");
        int idFicha = 12;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.BajaFicha(idFicha);
    }
}