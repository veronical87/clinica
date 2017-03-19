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
    }

    /**
     * Test of insertarDatosOperaciones method, of class ClaseOperaciones.
     */
    @Test
    public void testInsertarDatosOperaciones() {
        System.out.println("insertarDatosOperaciones");
        int ficha = 12;
        String fechaActual = "2017/02/28";
        int idveterinario = 1;
        int IDLOCALIDAD = 1;
        int tipoOperacion = 1;
        String diagnostico = "aaaaaaaaa hombros duelen";
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.insertarDatosOperaciones(ficha, fechaActual, idveterinario, IDLOCALIDAD, tipoOperacion, diagnostico);
     }

    /**
     * Test of modificarDatosOperaciones method, of class ClaseOperaciones.
     */
    @Test
    public void testModificarDatosOperaciones() {
        System.out.println("modificarDatosOperaciones");
        int ficha = 12;
        String fechaActual = "2017/02/28";
        int idveterinario = 1;
        int IDLOCALIDAD = 1;
        int tipoOperacion = 1;
        String diagnostico = "aaaaaaaaaa";
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.modificarDatosOperaciones(ficha, fechaActual, idveterinario, IDLOCALIDAD, tipoOperacion, diagnostico);
      
    }

    /**
     * Test of InsertarDatosAuditoria method, of class ClaseOperaciones.
     */
    @Test
    public void testInsertarDatosAuditoria() {
        System.out.println("InsertarDatosAuditoria");
        String fechaActual = "2017/02/28";
        String hor = "22:30";
        String usu = "GIMENA";
        String tabla = "FICHAS MEDICAS";
        String operacion = "MODIFICACION";
        String anterior = "";
        String nuevo = "";
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.InsertarDatosAuditoria(fechaActual, hor, usu, tabla, operacion, anterior, nuevo);
       
    }

    /**
     * Test of CantVacunas method, of class ClaseOperaciones.
     */
    @Test
    public void testCantVacunas() {
        System.out.println("CantVacunas");
        int IDFICHA = 12;
        ClaseOperaciones instance = new ClaseOperaciones();
        int expResult = 0;
        int result = instance.CantVacunas(IDFICHA);
        assertEquals(expResult, result);
    }

    /**
     * Test of CantSeccionesxOp method, of class ClaseOperaciones.
     */
    @Test
    public void testCantSeccionesxOp() {
        System.out.println("CantSeccionesxOp");
        int IdOp = 1;
        ClaseOperaciones instance = new ClaseOperaciones();
        int expResult = 0;
        int result = instance.CantSeccionesxOp(IdOp);
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarMedicamentoxOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testAgregarMedicamentoxOperacion() {
        System.out.println("agregarMedicamentoxOperacion");
        int IDOPERACION = 1;
        int IDMEDICAMENTO = 5;
        int c = 1;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.agregarMedicamentoxOperacion(IDOPERACION, IDMEDICAMENTO, c);
    }

    /**
     * Test of actualizarStockMedicamento method, of class ClaseOperaciones.
     */
    @Test
    public void testActualizarStockMedicamento() {
        System.out.println("actualizarStockMedicamento");
        int IDMEDICAMENTO = 5;
        int c = 1;
        int indicador = 0;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.actualizarStockMedicamento(IDMEDICAMENTO, c, indicador);
    }

    /**
     * Test of VerificarfechaxConsulta method, of class ClaseOperaciones.
     */
    @Test
    public void testVerificarfechaxConsulta() {
        System.out.println("VerificarfechaxConsulta");
        int nro = 1;
        int idusuario = 1;
        int idoperacion = 1;
        String dia = "2017/03/01";
        String hora = "08:30";
        ClaseOperaciones instance = new ClaseOperaciones();
        int expResult = 0;
        int result = instance.VerificarfechaxConsulta(nro, idusuario, idoperacion, dia, hora);
        assertEquals(expResult, result);
    }

    /**
     * Test of quitarMedicamentoxOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testQuitarMedicamentoxOperacion() {
        System.out.println("quitarMedicamentoxOperacion");
        int IDMEDICAMENTO = 5;
        int IDOPERACION = 1;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.quitarMedicamentoxOperacion(IDMEDICAMENTO, IDOPERACION);       
    }

    /**
     * Test of InsertarFechaxOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testInsertarFechaxOperacion() {
        System.out.println("InsertarFechaxOperacion");
        int idusuario = 1;
        int operacion = 1;
        String dia = "2017/03/01";
        String hora = "08:30";
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.InsertarFechaxOperacion(idusuario, operacion, dia, hora);
    }

    /**
     * Test of ActualizarDiagnostico method, of class ClaseOperaciones.
     */
    @Test
    public void testActualizarDiagnostico() {
        System.out.println("ActualizarDiagnostico");
        int IDTipoOperacion = 1;
        String diagnostico = "KSJSKSJS";
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.ActualizarDiagnostico(IDTipoOperacion, diagnostico);
    }

    /**
     * Test of agregarSeccionxOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testAgregarSeccionxOperacion() {
        System.out.println("agregarSeccionxOperacion");
        int IDOperacion = 1;
        int IDSECCION = 1;
        ClaseOperaciones instance = new ClaseOperaciones();
        int expResult = 0;
        int result = instance.agregarSeccionxOperacion(IDOperacion, IDSECCION);
        assertEquals(expResult, result);
    }

    /**
     * Test of quitarseccionxOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testQuitarseccionxOperacion() {
        System.out.println("quitarseccionxOperacion");
        int IDOperacion = 1;
        int IDSECCION = 1;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.quitarseccionxOperacion(IDOperacion, IDSECCION);
    }

    /**
     * Test of modificarDiagnostico method, of class ClaseOperaciones.
     */
    @Test
    public void testModificarDiagnostico() {
        System.out.println("modificarDiagnostico");
        int IDFICHA = 1;
        String diagnostico = "OTRO";
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.modificarDiagnostico(IDFICHA, diagnostico);
    }

    /**
     * Test of CancelarVisita method, of class ClaseOperaciones.
     */
    @Test
    public void testCancelarVisita() {
        System.out.println("CancelarVisita");
        int NroOperacion = 1;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.CancelarVisita(NroOperacion);
    }

    /**
     * Test of eliminarSeccionesxOp method, of class ClaseOperaciones.
     */
    @Test
    public void testEliminarSeccionesxOp() {
        System.out.println("eliminarSeccionesxOp");
        int IDOperacion = 1;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.eliminarSeccionesxOp(IDOperacion);
    }

    /**
     * Test of BajaOperacion method, of class ClaseOperaciones.
     */
    @Test
    public void testBajaOperacion() {
        System.out.println("BajaOperacion");
        int id = 1;
        ClaseOperaciones instance = new ClaseOperaciones();
        instance.BajaOperacion(id);
    }
}