package co.edu.unbosque.model;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.ArchivosBinarios;

public class GestionDeClientesDAO implements Acciones, Serializable {

	private ArrayList<GestionDeClientesDTO> clientes = new ArrayList<GestionDeClientesDTO>();
	private ArchivosBinarios ab;

	public GestionDeClientesDAO() {
		clientes = new ArrayList<GestionDeClientesDTO>();
		ab = new ArchivosBinarios();
	}

	public String crearCliente(GestionDeClientesDTO cliente) {
		String mensaje;
		try {
			clientes = ab.leerCliente();
			clientes.add(cliente);
			mensaje = ab.crearCliente(clientes);

		} catch (Exception e) {
			mensaje = "No se pudo crear cliente.";
			e.printStackTrace();
		}
		return mensaje;
	}

	@Override
	public String leer(int n) {
		String mensaje = "";
		clientes = ab.leerCliente();
		for (GestionDeClientesDTO clientesDTO : clientes) {
			if (clientesDTO.getCedulaCliente() == Double.valueOf(n)) {
				mensaje += clientesDTO.getCedulaCliente() + " " + clientesDTO.getNombreCompleto() + " "
						+ clientesDTO.getDireccionCliente() + "\n" + clientesDTO.getTelefonoCliente() + " "
						+ clientesDTO.getCorreoCliente();
				break;
			}
		}
		return mensaje;
	}
	
	public String leerNombre(int n) {
		String mensaje = "";
		clientes = ab.leerCliente();
		for (GestionDeClientesDTO clientesDTO : clientes) {
			if (clientesDTO.getCedulaCliente() == Double.valueOf(n)) {
				mensaje = clientesDTO.getNombreCompleto();
				break;
			}
		}
		return mensaje;
	}
	public double mostrarCedula(String nombre) {
		double cedula=0;
		clientes = ab.leerCliente();
		for (GestionDeClientesDTO clientesDTO : clientes) {
			if(clientesDTO.getNombreCompleto().equals(nombre)) {
				cedula = clientesDTO.getCedulaCliente();
			}
		}
		return cedula;
		
	}
	
	public boolean actualizarDatosCliente(ArrayList<GestionDeClientesDTO> arraylist, File file, String nombre,
			String correo, String direccion, double telefono, double cedula) {
		clientes = ab.leerCliente();
		GestionDeClientesDTO gcli = buscarCliente(cedula, arraylist);
		try {
			if (gcli != null) {
				borrarCliente(arraylist, file, cedula);
				gcli.setCorreoCliente(correo);
				gcli.setDireccionCliente(direccion);
				gcli.setNombreCompleto(nombre);
				gcli.setTelefonoCliente(telefono);
				arraylist.add(gcli);
				file.delete();
				file.createNewFile();
				ab.crearCliente(arraylist);
				return true;
			} else {
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean borrarCliente(ArrayList<GestionDeClientesDTO> arraylist, File file, double cedula) {
		clientes = ab.leerCliente();
		try {
			GestionDeClientesDTO cliente = buscarCliente(cedula, arraylist);
			if (cliente == null) {
				return false;
			} else {
				arraylist.remove(cliente);
				file.delete();
				file.createNewFile();
				ab.crearCliente(arraylist);
				return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public GestionDeClientesDTO buscarCliente(double cedula, ArrayList<GestionDeClientesDTO> arraylist) {
		GestionDeClientesDTO existente = null;
		if (!arraylist.isEmpty()) {
			for (GestionDeClientesDTO cliente : arraylist) {
				if (cedula == cliente.getCedulaCliente()) {
					existente = cliente;
				}
			}
		}
		return existente;
	}

}
