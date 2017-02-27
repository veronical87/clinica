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
public class ClaseOperacionesTest {
    
    public ClaseOperacionesTest() {
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
     * Test of LlenarTablaCONSULTAS method, of class ClaseOperaciones.
     */
    @Test
    public void testLlenarTablaCONSULTAS() {
        System.out.println("LlenarTablaCONSULTAS");
        DefaultTableModel tabla = null;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.LlenarTablaCONSULTAS(tabla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LlenarTablaCIRUGIAS method, of class ClaseOperaciones.
     */
    @Test
    public void testLlenarTablaCIRUGIAS() {
        System.out.println("LlenarTablaCIRUGIAS");
        DefaultTableModel tabla = null;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.LlenarTablaCIRUGIAS(tabla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarDatosOperaciones method, of class ClaseOperaciones.
     */
    @Test
    public void testInsertarDatosOperaciones() {
        System.out.println("insertarDatosOperaciones");
        int ficha = 0;
        String fechaActual = "";
        int idveterinario = 0;
        int IDLOCALIDAD = 0;
        int tipoOperacion = 0;
        String diagnostico = "";
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.insertarDatosOperaciones(ficha, fechaActual, idveterinario, IDLOCALIDAD, tipoOperacion, diagnostico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarDatosOperaciones method, of class ClaseOperaciones.
     */
    @Test
    public void testModificarDatosOperaciones() {
        System.out.println("modificarDatosOperaciones");
        int ficha = 0;
        String fechaActual = "";
        int idveterinario = 0;
        int IDLOCALIDAD = 0;
        int tipoOperacion = 0;
        String diagnostico = "";
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.modificarDatosOperaciones(ficha, fechaActual, idveterinario, IDLOCALIDAD, tipoOperacion, diagnostico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BajaOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testBajaOperacion() {
        System.out.println("BajaOperacion");
        int id = 0;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.BajaOperacion(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InsertarDatosAuditoria method, of class ClaseOperaciones.
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
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.InsertarDatosAuditoria(fechaActual, hor, usu, tabla, operacion, anterior, nuevo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CantVacunas method, of class ClaseOperaciones.
     */
    @Test
    public void testCantVacunas() {
        System.out.println("CantVacunas");
        int IDFICHA = 0;
        ClaseOperaciones instance = new ClaseOperaciones();
        int expResult = 0;
        int result = instance.CantVacunas(IDFICHA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CantSeccionesxOp method, of class ClaseOperaciones.
     */
    @Test
    public void testCantSeccionesxOp() {
        System.out.println("CantSeccionesxOp");
        int IdOp = 0;
        ClaseOperaciones instance = new ClaseOperaciones();
        int expResult = 0;
        int result = instance.CantSeccionesxOp(IdOp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarMedicamentoxOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testAgregarMedicamentoxOperacion() {
        System.out.println("agregarMedicamentoxOperacion");
        int IDOPERACION = 0;
        int IDMEDICAMENTO = 0;
        int c = 0;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.agregarMedicamentoxOperacion(IDOPERACION, IDMEDICAMENTO, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarStockMedicamento method, of class ClaseOperaciones.
     */
    @Test
    public void testActualizarStockMedicamento() {
        System.out.println("actualizarStockMedicamento");
        int IDMEDICAMENTO = 0;
        int c = 0;
        int indicador = 0;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.actualizarStockMedicamento(IDMEDICAMENTO, c, indicador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerificarfechaxConsulta method, of class ClaseOperaciones.
     */
    @Test
    public void testVerificarfechaxConsulta() {
        System.out.println("VerificarfechaxConsulta");
        int nro = 0;
        int idusuario = 0;
        int idoperacion = 0;
        String dia = "";
        String hora = "";
        ClaseOperaciones instance = new ClaseOperaciones();
        int expResult = 0;
        int result = instance.VerificarfechaxConsulta(nro, idusuario, idoperacion, dia, hora);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitarMedicamentoxOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testQuitarMedicamentoxOperacion() {
        System.out.println("quitarMedicamentoxOperacion");
        int IDMEDICAMENTO = 0;
        int IDOPERACION = 0;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.quitarMedicamentoxOperacion(IDMEDICAMENTO, IDOPERACION);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InsertarFechaxOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testInsertarFechaxOperacion() {
        System.out.println("InsertarFechaxOperacion");
        int idusuario = 0;
        int operacion = 0;
        String dia = "";
        String hora = "";
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.InsertarFechaxOperacion(idusuario, operacion, dia, hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarDiagnostico method, of class ClaseOperaciones.
     */
    @Test
    public void testActualizarDiagnostico() {
        System.out.println("ActualizarDiagnostico");
        int IDTipoOperacion = 0;
        String diagnostico = "";
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.ActualizarDiagnostico(IDTipoOperacion, diagnostico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarSeccionxOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testAgregarSeccionxOperacion() {
        System.out.println("agregarSeccionxOperacion");
        int IDOperacion = 0;
        int IDSECCION = 0;
        ClaseOperaciones instance = new ClaseOperaciones();
        int expResult = 0;
        int result = instance.agregarSeccionxOperacion(IDOperacion, IDSECCION);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitarseccionxOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testQuitarseccionxOperacion() {
        System.out.println("quitarseccionxOperacion");
        int IDOperacion = 0;
        int IDSECCION = 0;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.quitarseccionxOperacion(IDOperacion, IDSECCION);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarDiagnostico method, of class ClaseOperaciones.
     */
    @Test
    public void testModificarDiagnostico() {
        System.out.println("modificarDiagnostico");
        int IDFICHA = 0;
        String diagnostico = "";
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.modificarDiagnostico(IDFICHA, diagnostico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CancelarVisita method, of class ClaseOperaciones.
     */
    @Test
    public void testCancelarVisita() {
        System.out.println("CancelarVisita");
        int NroOperacion = 0;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.CancelarVisita(NroOperacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarSeccionesxOp method, of class ClaseOperaciones.
     */
    @Test
    public void testEliminarSeccionesxOp() {
        System.out.println("eliminarSeccionesxOp");
        int IDOperacion = 0;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.eliminarSeccionesxOp(IDOperacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}