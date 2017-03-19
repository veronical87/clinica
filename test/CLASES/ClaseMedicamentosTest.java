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
public class ClaseMedicamentosTest {
    
    public ClaseMedicamentosTest() {
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
     * Test of LlenarTablaPrincipal method, of class ClaseMedicamentos.
     */
    @Test
    public void testLlenarTablaPrincipal() {
        System.out.println("LlenarTablaPrincipal");
        DefaultTableModel tabla = null;
        ClaseMedicamentos instance = new ClaseMedicamentos();
        instance.LlenarTablaPrincipal(tabla);
    }

    /**
     * Test of AgregarMedicamento method, of class ClaseMedicamentos.
     */
    @Test
    public void testAgregarMedicamento() {
        System.out.println("AgregarMedicamento");
        String nombre = "CLORMADINONA LAMAR X 1000 COMP.";
        int categoria = 1;
        int actual = 8;
        int min = 3;
        String descripcion = "Hormona sintética de estructura y actividad similar a la progesterona";
        String composicion = "CLORMADINONA 2 mg comprimidos ";
        String accion = "Anticonceptivo e inhibidor del celo Para caninos y felinos ";
        ClaseMedicamentos instance = new ClaseMedicamentos();
        int expResult = 0;
        int result = instance.AgregarMedicamento(nombre, categoria, actual, min, descripcion, composicion, accion);
        assertEquals(expResult, result);
    }

    /**
     * Test of VerificarMedicamento method, of class ClaseMedicamentos.
     */
    @Test
    public void testVerificarMedicamento() {
        System.out.println("VerificarMedicamento");
        String nombre = "CLORMADINONA LAMAR X 1000 COMP.";
        ClaseMedicamentos instance = new ClaseMedicamentos();
        int expResult = 18;
        int result = instance.VerificarMedicamento(nombre);
        assertEquals(expResult, result);
    }

    /**
     * Test of VerificarMedicamentoxOperacion method, of class ClaseMedicamentos.
     */
    @Test
    public void testVerificarMedicamentoxOperacion() {
        System.out.println("VerificarMedicamentoxOperacion");
        int idMedicamento = 18;
        ClaseMedicamentos instance = new ClaseMedicamentos();
        int expResult = 0;
        int result = instance.VerificarMedicamentoxOperacion(idMedicamento);
        assertEquals(expResult, result);
    }

    /**
     * Test of AgregarMedxTipoOp method, of class ClaseMedicamentos.
     */
    @Test
    public void testAgregarMedxTipoOp() {
        System.out.println("AgregarMedxTipoOp");
        int idMed = 18;
        int idespecie = 1;
        int IDTipoOp = 1;
        ClaseMedicamentos instance = new ClaseMedicamentos();
        instance.AgregarMedxTipoOp(idMed, idespecie, IDTipoOp);
    }

    /**
     * Test of ModificarMedicamento method, of class ClaseMedicamentos.
     */
    @Test
    public void testModificarMedicamento() {
        System.out.println("ModificarMedicamento");
        int id = 18;
        String nombre = "CLORMADINONA LAMAR X 1000 COMP.";
        int categoria = 1;
        int actual = 8;
        int min = 3;
        String descripcion = "Hormona sintética de estructura y actividad similar a la progesterona";
        String composicion = "CLORMADINONA 2 mg comprimidos ";
        String accion = "Anticonceptivo e inhibidor del celo Para caninos y felinos ";
        ClaseMedicamentos instance = new ClaseMedicamentos();
        instance.ModificarMedicamento(id, nombre, categoria, actual, min, descripcion, composicion, accion);
       
    }

    /**
     * Test of EliminarMedicamento method, of class ClaseMedicamentos.
     */
    @Test
    public void testEliminarMedicamento() {
        System.out.println("EliminarMedicamento");
        int id = 18;
        ClaseMedicamentos instance = new ClaseMedicamentos();
        int expResult = 0;
        int result = instance.EliminarMedicamento(id);
        assertEquals(expResult, result);
    }
}