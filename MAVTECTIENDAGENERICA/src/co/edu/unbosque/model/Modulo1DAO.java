package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.unbosque.model.persistence.ArchivosBinarios;

public class Modulo1DAO {
	
	private ArchivosBinarios md;
	private Modulo1DTO[] modulo1a;
	
	public Modulo1DAO() {
		md = new ArchivosBinarios();
		modulo1a = new Modulo1DTO[1];

}
	
	public String agregarModulo1(Modulo1DTO modulo1) {
		String mensaje;
		try {
		modulo1a = md.leermodulo1();
		modulo1a[0] = modulo1;
		mensaje = md.escribirModulo1(modulo1a);
		md.leermodulo1();
		}
		catch(Exception e){
		mensaje = "No se pudo crear la tienda.";
		e.printStackTrace();
		}
		return mensaje;
	}
	
public String mostrarModulo1() {
		String mensaje = "";
		modulo1a = md.leermodulo1();
		for (Modulo1DTO Modulo1DTO : modulo1a) {
			mensaje += Modulo1DTO.getNombret()+": "+Modulo1DTO.getTipocomercio()+", "+Modulo1DTO.getNit()+", "+Modulo1DTO.getCiudadtienda()+", "+Modulo1DTO.getIva()+", "+Modulo1DTO.getNombregerente()+", "+"\n";
		}
		return mensaje;
	}

public double mostrarIva() {
	double iva=0;
	modulo1a = md.leermodulo1();
	for (Modulo1DTO Modulo1DTO : modulo1a) {
		iva=Modulo1DTO.getIva();
	}
	return iva;
}
	
}