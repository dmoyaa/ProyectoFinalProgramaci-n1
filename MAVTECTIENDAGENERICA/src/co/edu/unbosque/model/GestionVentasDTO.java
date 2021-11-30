package co.edu.unbosque.model;

import java.io.Serializable;

public class GestionVentasDTO extends Venta implements Serializable{

	private double cedulaCliente;
	private double ventaSinIva;
	private double ivaCompra;

	public GestionVentasDTO(int codigo, double cedula, double sinIva, double iva, double conIva) {
		
		this.cedulaCliente=cedula;
		this.ivaCompra=iva;
		this.ventaSinIva=sinIva;
		this.codigoVenta=codigo;
		this.costoTotal=conIva;

	}

	public double getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(double cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public double getVentaSinIva() {
		return ventaSinIva;
	}

	public void setVentaSinIva(double ventaSinIva) {
		this.ventaSinIva = ventaSinIva;
	}

	public double getIvaCompra() {
		return ivaCompra;
	}

	public void setIvaCompra(double ivaCompra) {
		this.ivaCompra = ivaCompra;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCédula:" + cedulaCliente +
				"\nVenta: " + ventaSinIva;
	}
}

