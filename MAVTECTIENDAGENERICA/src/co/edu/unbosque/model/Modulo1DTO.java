package co.edu.unbosque.model;

import java.io.Serializable;

public class Modulo1DTO implements Serializable{
	
	private String nombret;
	private String tipocomercio;
	private String ciudadtienda;
	private String nombregerente;
	private double nit;
	private double iva;


	
	public Modulo1DTO(String nombret, String tipocomercio,String ciudadtienda,String nombregerente, double nit, double iva) {
		this.nombret = nombret;
		this.tipocomercio = tipocomercio;
		this.ciudadtienda = ciudadtienda;
		this.nombregerente = nombregerente;
		this.nit=nit;
		this.iva=iva;
	}



	public String getNombret() {
		return nombret;
	}



	public void setNombret(String nombret) {
		this.nombret = nombret;
	}



	public String getTipocomercio() {
		return tipocomercio;
	}



	public void setTipocomercio(String tipocomercio) {
		this.tipocomercio = tipocomercio;
	}



	public String getCiudadtienda() {
		return ciudadtienda;
	}



	public void setCiudadtienda(String ciudadtienda) {
		this.ciudadtienda = ciudadtienda;
	}



	public String getNombregerente() {
		return nombregerente;
	}



	public void setNombregerente(String nombregerente) {
		this.nombregerente = nombregerente;
	}



	public double getNit() {
		return nit;
	}



	public void setNit(double nit) {
		this.nit = nit;
	}



	public double getIva() {
		return iva;
	}



	public void setIva(double iva) {
		this.iva = iva;
	}
	
	

}
