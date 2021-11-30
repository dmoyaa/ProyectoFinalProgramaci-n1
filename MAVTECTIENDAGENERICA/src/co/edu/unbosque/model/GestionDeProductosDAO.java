package co.edu.unbosque.model;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.ArchivosBinarios;

public class GestionDeProductosDAO implements Acciones, Serializable {

	private ArrayList<GestionDeProductosDTO> productos;
	private ArchivosBinarios ab;

	public GestionDeProductosDAO() {
		productos = new ArrayList<GestionDeProductosDTO>();
		ab = new ArchivosBinarios();
	}

	public String crearProducto(GestionDeProductosDTO producto) {
		String mensaje;
		try {
			productos = ab.leerProducto();
			productos.add(producto);
			mensaje = ab.crearProducto(productos);

		} catch (Exception e) {
			mensaje = "No se pudo crear producto.";
			e.printStackTrace();
		}
		return mensaje;
	}

	@Override
	public String leer(int n) {
		String mensaje = "";
		productos = ab.leerProducto();
		for (GestionDeProductosDTO productosDTO : productos) {
			if (productosDTO.getCodigoProducto() == n) {
				mensaje += productosDTO.getCodigoProducto() + " " + productosDTO.getNombreProducto() + " "
						+ productosDTO.getNitProveedorProducto() + "\n" + productosDTO.getPrecioCompra() + " "
						+ productosDTO.getPrecioVenta();
				break;
			}
		}
		return mensaje;
	}
	
	public double leerPrecio(int n) {
		double precio=0;
		productos = ab.leerProducto();
		for (GestionDeProductosDTO productosDTO : productos) {
			if (productosDTO.getCodigoProducto() == n) {
				precio = productosDTO.getPrecioVenta();
				break;
			}
		}
		return precio;
	}

	public boolean actualizarDatosProductos(ArrayList<GestionDeProductosDTO> arraylist, File file, String nombreP,
			int codigoP, int nitPrp, double precioC, double precioV) {
		GestionDeProductosDTO gpro = buscarProducto(codigoP, arraylist);
		try {
			if (gpro != null) {
				borrarProducto(arraylist, file, codigoP);
				gpro.setNombreProducto(nombreP);
				gpro.setPrecioCompra(precioC);
				gpro.setPrecioVenta(precioV);
				arraylist.add(gpro);
				file.delete();
				file.createNewFile();
				ab.crearProducto(arraylist);
				return true;
			} else {
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean borrarProducto(ArrayList<GestionDeProductosDTO> arraylist, File file, int codigoP) {
		try {
			GestionDeProductosDTO producto = buscarProducto(codigoP, arraylist);
			if (producto == null) {
				return false;
			} else {
				arraylist.remove(producto);
				file.delete();
				file.createNewFile();
				ab.crearProducto(arraylist);
				return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public GestionDeProductosDTO buscarProducto(double codigoP, ArrayList<GestionDeProductosDTO> arraylist) {
		GestionDeProductosDTO existente = null;
		if (!arraylist.isEmpty()) {
			for (GestionDeProductosDTO producto : arraylist) {
				if (codigoP == producto.getCodigoProducto()) {
					existente = producto;
				}
			}
		}
		return existente;
	}
}
