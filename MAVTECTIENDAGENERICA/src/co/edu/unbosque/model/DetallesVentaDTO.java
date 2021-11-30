package co.edu.unbosque.model;

import java.io.Serializable;

public class DetallesVentaDTO implements Serializable{
	
	private int codProducto;
	private int cantidad;
	private double valorUnidad;
	private double valorTotal;
	private int codigoVenta;
	
	public DetallesVentaDTO(int codP, int can, double vu, double vt, int codV) {
		
		this.cantidad=can;
		this.codigoVenta=codV;
		this.codProducto=codP;
		this.valorTotal=vt;
		this.valorUnidad=vu;
		
	}

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public int getCantidad() {
		return cantidad;
	}


	public double getValorUnidad() {
		return valorUnidad;
	}

	public void setValorUnidad(double valorUnidad) {
		this.valorUnidad = valorUnidad;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}
	
	

}
