package co.edu.unbosque.model;

import java.io.Serializable;

public class GestionDeProductosDTO implements Serializable{

	private int codigoProducto;
	private String nombreProducto;
	private int nitProveedorProducto;
	private double precioCompra;
	private double precioVenta;
	
	public GestionDeProductosDTO(int codigoProducto, String nombreProducto, int nitProveedorProducto,double precioCompra, double precioVenta) {
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.nitProveedorProducto = nitProveedorProducto;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getNitProveedorProducto() {
		return nitProveedorProducto;
	}

	public void setNitProveedorProducto(int nitProveedorProducto) {
		this.nitProveedorProducto = nitProveedorProducto;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
}
