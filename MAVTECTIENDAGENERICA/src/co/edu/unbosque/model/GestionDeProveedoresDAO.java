package co.edu.unbosque.model;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.ArchivosBinarios;

public class GestionDeProveedoresDAO implements Acciones, Serializable {

	private ArrayList<GestionDeProveedoresDTO> proveedores = new ArrayList<GestionDeProveedoresDTO>();
	private ArchivosBinarios ab;

	public GestionDeProveedoresDAO() {
		proveedores = new ArrayList<GestionDeProveedoresDTO>();
		ab = new ArchivosBinarios();
	}

	public String crearProveedor(GestionDeProveedoresDTO proveedor) {
		String mensaje;
		try {
			proveedores = ab.leerProveedor();
			proveedores.add(proveedor);
			mensaje = ab.crearProveedor(proveedores);

		} catch (Exception e) {
			mensaje = "No se pudo crear proveedor.";
			e.printStackTrace();
		}
		return mensaje;
	}

	@Override
	public String leer(int n) {

		String mensaje = "";
		proveedores = ab.leerProveedor();
		for (GestionDeProveedoresDTO proveedorDTO : proveedores) {
			if (proveedorDTO.getNIT() == n) {
				mensaje += proveedorDTO.getNIT() + " " + proveedorDTO.getNombreProveedor() + " "
						+ proveedorDTO.getDireccion() + "\n" + proveedorDTO.getTelefonoProveedor() + " "
						+ proveedorDTO.getCiudad();
				break;
			}
		}
		return mensaje;
	}

	public boolean actualizarDatosProveedor(ArrayList<GestionDeProveedoresDTO> arraylist, File file, int nit,
			String nombre, String direccion, double telefono, String ciudad) {
		GestionDeProveedoresDTO gprov = buscarProveedor(nit, arraylist);
		try {
			if (gprov != null) {
				borrarProveedor(arraylist, file, nit);
				gprov.setCiudad(ciudad);
				gprov.setDireccion(direccion);
				gprov.setNombreProveedor(nombre);
				gprov.setTelefonoProveedor(telefono);
				arraylist.add(gprov);
				file.delete();
				file.createNewFile();
				ab.crearProveedor(arraylist);
				return true;
			} else {
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean borrarProveedor(ArrayList<GestionDeProveedoresDTO> arraylist, File file, int nit) {
		try {
			GestionDeProveedoresDTO proveedor = buscarProveedor(nit, arraylist);
			if (proveedor == null) {
				return false;
			} else {
				arraylist.remove(proveedor);
				file.delete();
				file.createNewFile();
				ab.crearProveedor(arraylist);
				return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public GestionDeProveedoresDTO buscarProveedor(int nit, ArrayList<GestionDeProveedoresDTO> arraylist) {
		GestionDeProveedoresDTO existente = null;
		if (!arraylist.isEmpty()) {
			for (GestionDeProveedoresDTO proveedor : arraylist) {
				if (nit == proveedor.getNIT()) {
					existente = proveedor;
				}
			}
		}
		return existente;
	}

}
