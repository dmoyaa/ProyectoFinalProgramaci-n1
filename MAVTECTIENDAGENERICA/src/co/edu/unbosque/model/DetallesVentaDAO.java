package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.ArchivosBinarios;

public class DetallesVentaDAO {
	
	private ArchivosBinarios ab;
	private ArrayList<DetallesVentaDTO> detallesVenta;
	
	public DetallesVentaDAO() {
		ab = new ArchivosBinarios();
		detallesVenta= new ArrayList<DetallesVentaDTO>();
	}
	
	public String AgregarDetallesVenta(DetallesVentaDTO detalles) {
		String mensaje = "";
		try {
			detallesVenta=ab.leerDetalleVentas();
			detallesVenta.add(detalles);
			mensaje=ab.escribirDetallesVenta(detallesVenta);
			
		}
		catch(Exception e) {
			mensaje="Error al agregar los detalles de la venta.";
		}
		return mensaje;
		
	}
	public String mostrarDetalles() {
		String mensaje = "";
		detallesVenta = ab.leerDetalleVentas();
		for (DetallesVentaDTO detallesdto : detallesVenta) {
			mensaje += detallesdto.getCantidad()+" "+detallesdto.getCodigoVenta()+" "+detallesdto.getCodProducto()+" "+detallesdto.getValorTotal()+" "+detallesdto.getValorUnidad()+ "\n";
		}
		return mensaje;
	}
	
	public double mostrarPreciosDetalles(int transaccion) {
		double cuenta=0;
		detallesVenta = ab.leerDetalleVentas();
		for (DetallesVentaDTO detallesdto : detallesVenta) {
			if (detallesdto.getCodigoVenta()==transaccion) {
			cuenta+=detallesdto.getValorTotal();	
			}
		}
		return cuenta;
		
	}

}
