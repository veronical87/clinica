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
public class ClaseVacunasTest {
    
    public ClaseVacunasTest() {
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
     * Test of LlenarTabla method, of class ClaseVacunas.
     */
    @Test
    public void testLlenarTabla() {
        System.out.println("LlenarTabla");
        DefaultTableModel tabla = null;
        ClaseVacunas instance = new ClaseVacunas();
        instance.LlenarTabla(tabla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarVacuna method, of class ClaseVacunas.
     */
    @Test
    public void testAgregarVacuna() {
        System.out.println("AgregarVacuna");
        String nombre = "";
        int especie = 0;
        String condicion = "";
        ClaseVacunas instance = new ClaseVacunas();
        int expResult = 0;
        int result = instance.AgregarVacuna(nombre, especie, condicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarVacuna method, of class ClaseVacunas.
     */
    @Test
    public void testModificarVacuna() {
        System.out.println("ModificarVacuna");
        int id = 0;
        String nombre = "";
        int especie = 0;
        String condicion = "";
        ClaseVacunas instance = new ClaseVacunas();
        instance.ModificarVacuna(id, nombre, especie, condicion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarVacuna method, of class ClaseVacunas.
     */
    @Test
    public void testEliminarVacuna() {
        System.out.println("EliminarVacuna");
        int idvacuna = 0;
        ClaseVacunas instance = new ClaseVacunas();
        int expResult = 0;
        int result = instance.EliminarVacuna(idvacuna);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerificarVacuna method, of class ClaseVacunas.
     */
    @Test
    public void testVerificarVacuna() {
        System.out.println("VerificarVacuna");
        String nombre = "";
        ClaseVacunas instance = new ClaseVacunas();
        String expResult = "";
        String result = instance.VerificarVacuna(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CargarVacunasPendientesxHistorial method, of class ClaseVacunas.
     */
    @Test
    public void testCargarVacunasPendientesxHistorial() {
        System.out.println("CargarVacunasPendientesxHistorial");
        int nrohistorial = 0;
        int especie = 0;
        ClaseVacunas instance = new ClaseVacunas();
        instance.CargarVacunasPendientesxHistorial(nrohistorial, especie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarVacunaPendiente method, of class ClaseVacunas.
     */
    @Test
    public void testActualizarVacunaPendiente() {
        System.out.println("ActualizarVacunaPendiente");
        int historial = 0;
        int vacuna = 0;
        String situacion = "";
        ClaseVacunas instance = new ClaseVacunas();
        instance.ActualizarVacunaPendiente(historial, vacuna, situacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}