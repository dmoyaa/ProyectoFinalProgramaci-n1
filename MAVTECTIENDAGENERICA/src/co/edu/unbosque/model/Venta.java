package co.edu.unbosque.model;

public abstract class Venta {
	
	protected int codigoVenta;
	protected double costoTotal;
	
	public int getCodigoVenta() {
		return codigoVenta;
	}
	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}
	public double getCostoTotal() {
		return costoTotal;
	}
	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}

	@Override
	public String toString() {
		return "Venta{" +
				"codigoVenta=" + codigoVenta +
				", costoTotal=" + costoTotal +
				'}';
	}
}
