package co.edu.unbosque.model;

import java.io.Serializable;

public class GestionDeProveedoresDTO implements Serializable{

	private int NIT;
	private String nombreProveedor;
	private String direccion;
	private double telefonoProveedor;
	private String ciudad;

	public GestionDeProveedoresDTO(int nIT, String nombreProveedor, String direccion, double telefonoProveedor,String ciudad) {
		this.NIT = nIT;
		this.nombreProveedor = nombreProveedor;
		this.direccion = direccion;
		this.telefonoProveedor = telefonoProveedor;
		this.ciudad = ciudad;
	}

	public int getNIT() {
		return NIT;
	}

	public void setNIT(int nIT) {
		NIT = nIT;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getTelefonoProveedor() {
		return telefonoProveedor;
	}

	public void setTelefonoProveedor(double telefonoProveedor) {
		this.telefonoProveedor = telefonoProveedor;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
}
