package co.edu.unbosque.model.test;

import co.edu.unbosque.model.DetallesVentaDAO;
import co.edu.unbosque.model.DetallesVentaDTO;
import co.edu.unbosque.model.GestionDeClientesDAO;
import co.edu.unbosque.model.GestionDeClientesDTO;
import co.edu.unbosque.model.GestionDeProductosDAO;
import co.edu.unbosque.model.GestionDeProductosDTO;
import co.edu.unbosque.model.GestionDeProveedoresDAO;
import co.edu.unbosque.model.GestionDeProveedoresDTO;
import co.edu.unbosque.model.GestionVentasDAO;
import co.edu.unbosque.model.GestionVentasDTO;
import co.edu.unbosque.model.Modulo1DAO;
import co.edu.unbosque.model.Modulo1DTO;
import junit.framework.TestCase;

public class CrearTest extends TestCase {
	
	public void testCrearProducto() {
		GestionDeProductosDAO productos = new GestionDeProductosDAO();
		GestionDeProductosDTO prodto = new GestionDeProductosDTO(1, "Fresita", 1, 200, 400) ;
		assertEquals("Error creando Producto",productos.crearProducto(prodto),"Se ha creado exitosamente el producto.");
	}

	public void testCrearCliente() {
		GestionDeClientesDAO clientedao = new GestionDeClientesDAO();
		GestionDeClientesDTO clientedto = new GestionDeClientesDTO(1213, "david", "138", 6961901, "dmoyaa");
		assertEquals("Error creando Cliente", clientedao.crearCliente(clientedto), "Se ha creado exitosamente el cliente.");
	}
	
	public void testCrearModulo1() {
		Modulo1DAO m1dao = new Modulo1DAO();
		Modulo1DTO m1dto = new Modulo1DTO("MavTec", "Fruver", "Bogotá", "Laura", 1213, 19);
		assertEquals("Error creando Parametros",m1dao.agregarModulo1(m1dto),"Se han agregado exitosamente los datos de la tienda.");
	}
	
	public void testCrearDetallesVenta() {
		DetallesVentaDAO dvdao = new DetallesVentaDAO();
		DetallesVentaDTO dvdto = new DetallesVentaDTO(1, 12, 400, 12*400, 1);
		assertEquals("Error creando detalles de la venta",dvdao.AgregarDetallesVenta(dvdto),"Transacción confirmada y exitosa.");
	}
	
	public void testCrearVentas() {
		GestionVentasDAO vdao = new GestionVentasDAO();
		GestionVentasDTO vdto = new GestionVentasDTO(1, 1213, 1000, 19, 1019);
		assertEquals("Error creando la venta", vdao.agregarVenta(vdto),"Se han guardado exitosamente los datos de la venta.");
	}
	public void testCrearProvedor() {
		GestionDeProveedoresDAO pdao = new GestionDeProveedoresDAO();
		GestionDeProveedoresDTO pdto = new GestionDeProveedoresDTO(1213,"Carnes inc", "manzana 42", 321499876, "chia");
		assertEquals("Error Creando Provedor", pdao.crearProveedor(pdto), "Se ha creado exitosamente el proveedor.");
	}
}

