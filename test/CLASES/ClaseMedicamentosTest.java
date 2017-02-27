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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarMedicamento method, of class ClaseMedicamentos.
     */
    @Test
    public void testAgregarMedicamento() {
        System.out.println("AgregarMedicamento");
        String nombre = "";
        int categoria = 0;
        int actual = 0;
        int min = 0;
        String descripcion = "";
        String composicion = "";
        String accion = "";
        ClaseMedicamentos instance = new ClaseMedicamentos();
        int expResult = 0;
        int result = instance.AgregarMedicamento(nombre, categoria, actual, min, descripcion, composicion, accion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarMedicamento method, of class ClaseMedicamentos.
     */
    @Test
    public void testModificarMedicamento() {
        System.out.println("ModificarMedicamento");
        int id = 0;
        String nombre = "";
        int categoria = 0;
        int actual = 0;
        int min = 0;
        String descripcion = "";
        String composicion = "";
        String accion = "";
        ClaseMedicamentos instance = new ClaseMedicamentos();
        instance.ModificarMedicamento(id, nombre, categoria, actual, min, descripcion, composicion, accion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarMedicamento method, of class ClaseMedicamentos.
     */
    @Test
    public void testEliminarMedicamento() {
        System.out.println("EliminarMedicamento");
        int id = 0;
        ClaseMedicamentos instance = new ClaseMedicamentos();
        int expResult = 0;
        int result = instance.EliminarMedicamento(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerificarMedicamento method, of class ClaseMedicamentos.
     */
    @Test
    public void testVerificarMedicamento() {
        System.out.println("VerificarMedicamento");
        String nombre = "";
        ClaseMedicamentos instance = new ClaseMedicamentos();
        String expResult = "";
        String result = instance.VerificarMedicamento(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InsertarDatosAuditoria method, of class ClaseMedicamentos.
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
        ClaseMedicamentos instance = new ClaseMedicamentos();
        instance.InsertarDatosAuditoria(fechaActual, hor, usu, tabla, operacion, anterior, nuevo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerificarMedicamentoxOperacion method, of class ClaseMedicamentos.
     */
    @Test
    public void testVerificarMedicamentoxOperacion() {
        System.out.println("VerificarMedicamentoxOperacion");
        int idMedicamento = 0;
        ClaseMedicamentos instance = new ClaseMedicamentos();
        int expResult = 0;
        int result = instance.VerificarMedicamentoxOperacion(idMedicamento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarMedxTipoOp method, of class ClaseMedicamentos.
     */
    @Test
    public void testAgregarMedxTipoOp() {
        System.out.println("AgregarMedxTipoOp");
        int idMed = 0;
        int idespecie = 0;
        int IDTipoOp = 0;
        ClaseMedicamentos instance = new ClaseMedicamentos();
        instance.AgregarMedxTipoOp(idMed, idespecie, IDTipoOp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}