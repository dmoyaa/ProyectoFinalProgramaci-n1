package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.ArchivosBinarios;

public class GestionVentasDAO {
	
	private ArchivosBinarios ab;
	private ArrayList<GestionVentasDTO> ventas;
	private int noCompra=1;
	
	public GestionVentasDAO() {
		
		ab = new ArchivosBinarios();
		ventas = new ArrayList<GestionVentasDTO>();
		
	}
	
	public String agregarVenta(GestionVentasDTO venta) {
		String mensaje="";
		try {
			ventas = ab.leerVentas();
			ventas.add(venta);
			mensaje=ab.escribirVentas(ventas);
			
		}
		catch(Exception e){
			
			mensaje = "Error al agregar la venta."; 
			e.printStackTrace();
			
		}
		
		return mensaje;
		
	}

	public GestionVentasDTO buscarVenta(double cedula, ArrayList<GestionVentasDTO> arraylist) {
		GestionVentasDTO existente = null;
		if (!arraylist.isEmpty()) {
			for (GestionVentasDTO venta : arraylist) {
				if (cedula == venta.getCedulaCliente()) {
					existente = venta;
				}
			}
		}
		return existente;
	}

	public int definirNoCompra() {
		noCompra=1;
		ventas=ab.leerVentas();
		for (GestionVentasDTO vdto : ventas) {
			noCompra++;
		}
		return noCompra;
		
	}

	public ArrayList<GestionVentasDTO> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<GestionVentasDTO> ventas) {
		this.ventas = ventas;
	}

	public int getNoCompra() {
		return noCompra;
	}

	public void setNoCompra(int noCompra) {
		this.noCompra = noCompra;
	}
	
	 

}
