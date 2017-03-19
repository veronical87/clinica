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
    }

    /**
     * Test of AgregarVacuna method, of class ClaseVacunas.
     */
    @Test
    public void testAgregarVacuna() {
        System.out.println("AgregarVacuna");
        String nombre = "RINOTRAQUEITIS VÍRICA";
        int especie = 2;
        String condicion = "OBLIGATORIO";
        ClaseVacunas instance = new ClaseVacunas();
        int expResult = 0;
        int result = instance.AgregarVacuna(nombre, especie, condicion);
        assertEquals(expResult, result);
    }

    /**
     * Test of ModificarVacuna method, of class ClaseVacunas.
     */
    @Test
    public void testModificarVacuna() {
        System.out.println("ModificarVacuna");
        int id = 6;
        String nombre = "RINOTRAQUEITIS VÍRICA";
        int especie = 2;
        String condicion = "OPCIONAL";
        ClaseVacunas instance = new ClaseVacunas();
        instance.ModificarVacuna(id, nombre, especie, condicion);
    }

    /**
     * Test of CargarVacunasPendientesxHistorial method, of class ClaseVacunas.
     */
    @Test
    public void testCargarVacunasPendientesxHistorial() {
        System.out.println("CargarVacunasPendientesxHistorial");
        int nrohistorial = 12;
        int especie = 2;
        ClaseVacunas instance = new ClaseVacunas();
        instance.CargarVacunasPendientesxHistorial(nrohistorial, especie);
    }

    /**
     * Test of ActualizarVacunaPendiente method, of class ClaseVacunas.
     */
    @Test
    public void testActualizarVacunaPendiente() {
        System.out.println("ActualizarVacunaPendiente");
        int historial = 12;
        int vacuna = 6;
        String situacion = "COLOCADO";
        ClaseVacunas instance = new ClaseVacunas();
        instance.ActualizarVacunaPendiente(historial, vacuna, situacion);
    }

    /**
     * Test of EliminarVacuna method, of class ClaseVacunas.
     */
    @Test
    public void testEliminarVacuna() {
        System.out.println("EliminarVacuna");
        int idvacuna = 6;
        ClaseVacunas instance = new ClaseVacunas();
        int expResult = 0;
        int result = instance.EliminarVacuna(idvacuna);
        assertEquals(expResult, result);
    }
}