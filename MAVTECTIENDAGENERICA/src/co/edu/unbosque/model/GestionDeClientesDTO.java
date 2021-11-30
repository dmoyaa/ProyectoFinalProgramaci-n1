package co.edu.unbosque.model;

import java.io.Serializable;

public class GestionDeClientesDTO implements Serializable {

	private double cedulaCliente;
	private String nombreCompleto;
	private String direccionCliente;
	private double telefonoCliente;
	private String correoCliente;
	
	public GestionDeClientesDTO (double cedulaCliente, String nombreCompleto,String direccionCliente, double telefonoCliente,String correoCliente) {
		this.cedulaCliente=cedulaCliente;
		this.nombreCompleto=nombreCompleto;
		this.direccionCliente=direccionCliente;
		this.telefonoCliente=telefonoCliente;
		this.correoCliente=correoCliente;
	}

	public double getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(double cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public double getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(double telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	
	
	
}
