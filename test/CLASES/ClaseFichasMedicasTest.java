/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
     * Test of LlenarTablaDatosMascotas method, of class ClaseFichasMedicas.
     */
    @Test
    public void testLlenarTablaDatosMascotas() {
        System.out.println("LlenarTablaDatosMascotas");
        DefaultTableModel tabla = null;
        int iddueño = 0;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.LlenarTablaDatosMascotas(tabla, iddueño);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarPropietario method, of class ClaseFichasMedicas.
     */
    @Test
    public void testAgregarPropietario() {
        System.out.println("AgregarPropietario");
        String apellido = "";
        String nombre = "";
        int documento = 0;
        int idpersona = 0;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.AgregarPropietario(apellido, nombre, documento, idpersona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarPropietario method, of class ClaseFichasMedicas.
     */
    @Test
    public void testModificarPropietario() {
        System.out.println("ModificarPropietario");
        int id = 0;
        String apellido = "";
        String nombre = "";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.ModificarPropietario(id, apellido, nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarFechaNac method, of class ClaseFichasMedicas.
     */
    @Test
    public void testActualizarFechaNac() {
        System.out.println("ActualizarFechaNac");
        int idficha = 0;
        int edad = 0;
        String tiemponac = "";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.ActualizarFechaNac(idficha, edad, tiemponac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarDatosMascota method, of class ClaseFichasMedicas.
     */
    @Test
    public void testAgregarDatosMascota() {
        System.out.println("AgregarDatosMascota");
        int idPropietario = 0;
        String fecha = "";
        String nombre = "";
        String fechaNacimiento = "";
        int idpelaje = 0;
        String sexo = "";
        double kilaje = 0.0;
        int edad = 0;
        String tiemponac = "";
        String situacion = "";
        String datoImagen = "";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.AgregarDatosMascota(idPropietario, fecha, nombre, fechaNacimiento, idpelaje, sexo, kilaje, edad, tiemponac, situacion, datoImagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerificarDNI method, of class ClaseFichasMedicas.
     */
    @Test
    public void testVerificarDNI() {
        System.out.println("VerificarDNI");
        int dni = 0;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.VerificarDNI(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BajaFicha method, of class ClaseFichasMedicas.
     */
    @Test
    public void testBajaFicha() {
        System.out.println("BajaFicha");
        int idFicha = 0;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.BajaFicha(idFicha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InsertarDatosAuditoria method, of class ClaseFichasMedicas.
     */
    @Test
    public void testInsertarDatosAuditoria() {
        System.out.println("InsertarDatosAuditoria");
        String fechaActual = "";
        String hor = "";
        String usu = "";
        String tabla = "";
        String operacion = "";
        String anterior = "";
        String nuevo = "";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.InsertarDatosAuditoria(fechaActual, hor, usu, tabla, operacion, anterior, nuevo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerificarMascota method, of class ClaseFichasMedicas.
     */
    @Test
    public void testVerificarMascota() {
        System.out.println("VerificarMascota");
        int dueño = 0;
        String mascota = "";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.VerificarMascota(dueño, mascota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarHistorial method, of class ClaseFichasMedicas.
     */
    @Test
    public void testAgregarHistorial() {
        System.out.println("agregarHistorial");
        int idFicha = 0;
        int nrohistorial = 0;
        String opcionVacunas = "";
        String opcionParasitos = "";
        String parasitos = "";
        String opcionAlergias = "";
        String alergias = "";
        String opcionDesparasitado = "";
        String tiempodesparcombo = "";
        String opcionProbResp = "";
        String opcionPreñada = "";
        int cantPreñada = 0;
        String opcionPreñadaMayora3 = "";
        String opcionCastrado = "";
        String situacion = "";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.agregarHistorial(idFicha, nrohistorial, opcionVacunas, opcionParasitos, parasitos, opcionAlergias, alergias, opcionDesparasitado, tiempodesparcombo, opcionProbResp, opcionPreñada, cantPreñada, opcionPreñadaMayora3, opcionCastrado, situacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarDatosMascota method, of class ClaseFichasMedicas.
     */
    @Test
    public void testModificarDatosMascota() {
        System.out.println("ModificarDatosMascota");
        int idFicha = 0;
        int idPropietario = 0;
        String nombre = "";
        String fechaNacimiento = "";
        int idpelaje = 0;
        String sexo = "";
        double kilaje = 0.0;
        int edad = 0;
        String tiemponac = "";
        String situacion = "";
        String datoImagen = "";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.ModificarDatosMascota(idFicha, idPropietario, nombre, fechaNacimiento, idpelaje, sexo, kilaje, edad, tiemponac, situacion, datoImagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarHistorial method, of class ClaseFichasMedicas.
     */
    @Test
    public void testModificarHistorial() {
        System.out.println("ModificarHistorial");
        int nrohistorial = 0;
        String opcionVacunas = "";
        String opcionParasitos = "";
        String parasitos = "";
        String opcionAlergias = "";
        String alergias = "";
        String opcionDesparasitado = "";
        String tiempodesparcombo = "";
        String opcionProbResp = "";
        String opcionPreñada = "";
        int cantPreñada = 0;
        String opcionPreñadaMayora3 = "";
        String opcionCastrado = "";
        String situacion = "";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.ModificarHistorial(nrohistorial, opcionVacunas, opcionParasitos, parasitos, opcionAlergias, alergias, opcionDesparasitado, tiempodesparcombo, opcionProbResp, opcionPreñada, cantPreñada, opcionPreñadaMayora3, opcionCastrado, situacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarVacunaxMascota method, of class ClaseFichasMedicas.
     */
    @Test
    public void testAgregarVacunaxMascota() {
        System.out.println("agregarVacunaxMascota");
        int idFicha = 0;
        int IDVacuna = 0;
        String d = "";
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.agregarVacunaxMascota(idFicha, IDVacuna, d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of QuitarVacunaxMascota method, of class ClaseFichasMedicas.
     */
    @Test
    public void testQuitarVacunaxMascota() {
        System.out.println("QuitarVacunaxMascota");
        int id = 0;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.QuitarVacunaxMascota(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarAfeccionxHC method, of class ClaseFichasMedicas.
     */
    @Test
    public void testAgregarAfeccionxHC() {
        System.out.println("agregarAfeccionxHC");
        int idHistorial = 0;
        int IDAfeccion = 0;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.agregarAfeccionxHC(idHistorial, IDAfeccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitarAfeccionxHC method, of class ClaseFichasMedicas.
     */
    @Test
    public void testQuitarAfeccionxHC() {
        System.out.println("quitarAfeccionxHC");
        int idFicha = 0;
        int IDAfeccion = 0;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.quitarAfeccionxHC(idFicha, IDAfeccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LlenarTablaAFECCIONES method, of class ClaseFichasMedicas.
     */
    @Test
    public void testLlenarTablaAFECCIONES() {
        System.out.println("LlenarTablaAFECCIONES");
        DefaultTableModel tabla = null;
        int idHistorial = 0;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        instance.LlenarTablaAFECCIONES(tabla, idHistorial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarFichasxPropietario method, of class ClaseFichasMedicas.
     */
    @Test
    public void testContarFichasxPropietario() {
        System.out.println("contarFichasxPropietario");
        int idPropietario = 0;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.contarFichasxPropietario(idPropietario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarAfeccionesxHC method, of class ClaseFichasMedicas.
     */
    @Test
    public void testContarAfeccionesxHC() {
        System.out.println("contarAfeccionesxHC");
        int idHistorial = 0;
        ClaseFichasMedicas instance = new ClaseFichasMedicas();
        int expResult = 0;
        int result = instance.contarAfeccionesxHC(idHistorial);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}