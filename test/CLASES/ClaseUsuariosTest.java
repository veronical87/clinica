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
    }

    /**
     * Test of BuscarCoincidencias method, of class ClaseUsuarios.
     */
    @Test
    public void testBuscarCoincidencias() {
        System.out.println("BuscarCoincidencias");
        String usuario = "GIMENA";
        ClaseUsuarios instance = new ClaseUsuarios();
        int expResult = 2;
        int result = instance.BuscarCoincidencias(usuario);
        assertEquals(expResult, result);
    }

    /**
     * Test of AgregarUsuario method, of class ClaseUsuarios.
     */
    @Test
    public void testAgregarUsuario() {
        System.out.println("AgregarUsuario");
        String apellido = "MORENATE";
        String nombre = "MARCELA";
        String usuario = "MARCE";
        String pass = "123";
        int persona = 17;
        int rol = 2;
        ClaseUsuarios instance = new ClaseUsuarios();
        int expResult = 0;
        int result = instance.AgregarUsuario(apellido, nombre, usuario, pass, persona, rol);
        assertEquals(expResult, result);
    }

    /**
     * Test of Modificar method, of class ClaseUsuarios.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        int id = 8;
        String apellido = "MORENATE";
        String nombre = "MARCELA";
        String usu = "MARCE";
        String con = "123";        
        int Tiporol = 2;       
        ClaseUsuarios instance = new ClaseUsuarios();
        instance.Modificar(id, apellido, nombre, usu, con, Tiporol);
    }

    /**
     * Test of existeUsuario method, of class ClaseUsuarios.
     */
    @Test
    public void testExisteUsuario() {
        System.out.println("existeUsuario");
        String usuario = "MARCE";
        String pass = "123";
        ClaseUsuarios instance = new ClaseUsuarios();
        int expResult = 8;
        int result = instance.existeUsuario(usuario, pass);
        assertEquals(expResult, result);
    }
}