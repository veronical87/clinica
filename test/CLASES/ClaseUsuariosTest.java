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
public class ClaseUsuariosTest {
    
    public ClaseUsuariosTest() {
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
     * Test of LlenarTabla method, of class ClaseUsuarios.
     */
    @Test
    public void testLlenarTabla() {
        System.out.println("LlenarTabla");
        DefaultTableModel tabla = null;
        ClaseUsuarios instance = new ClaseUsuarios();
        instance.LlenarTabla(tabla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarCoincidencias method, of class ClaseUsuarios.
     */
    @Test
    public void testBuscarCoincidencias() {
        System.out.println("BuscarCoincidencias");
        String usuario = "";
        ClaseUsuarios instance = new ClaseUsuarios();
        int expResult = 0;
        int result = instance.BuscarCoincidencias(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExisteUsuario_Pantallas method, of class ClaseUsuarios.
     */
    @Test
    public void testExisteUsuario_Pantallas() {
        System.out.println("ExisteUsuario_Pantallas");
        int usuario = 0;
        ClaseUsuarios instance = new ClaseUsuarios();
        int expResult = 0;
        int result = instance.ExisteUsuario_Pantallas(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarUsuario method, of class ClaseUsuarios.
     */
    @Test
    public void testAgregarUsuario() {
        System.out.println("AgregarUsuario");
        String apellido = "";
        String nombre = "";
        String usuario = "";
        String pass = "";
        int persona = 0;
        int rol = 0;
        ClaseUsuarios instance = new ClaseUsuarios();
        int expResult = 0;
        int result = instance.AgregarUsuario(apellido, nombre, usuario, pass, persona, rol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar method, of class ClaseUsuarios.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        int id = 0;
        String apellido = "";
        String nombre = "";
        String usu = "";
        String con = "";
        int Tiporol = 0;
        ClaseUsuarios instance = new ClaseUsuarios();
        instance.Modificar(id, apellido, nombre, usu, con, Tiporol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeUsuario method, of class ClaseUsuarios.
     */
    @Test
    public void testExisteUsuario() {
        System.out.println("existeUsuario");
        String usuario = "";
        String pass = "";
        ClaseUsuarios instance = new ClaseUsuarios();
        int expResult = 0;
        int result = instance.existeUsuario(usuario, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}