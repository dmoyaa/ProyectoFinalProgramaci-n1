package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import co.edu.unbosque.model.DetallesVentaDTO;
import co.edu.unbosque.model.GestionDeClientesDTO;
import co.edu.unbosque.model.GestionDeProductosDTO;
import co.edu.unbosque.model.GestionDeProveedoresDTO;
import co.edu.unbosque.model.GestionVentasDTO;
import co.edu.unbosque.model.Modulo1DTO;


public class ArchivosBinarios {

    private String rutaConfiguracion = "./data/config.properties.out";
    private String rutaVentas = "./data/ventas.out";
    private String rutaDetalleVentas = "./data/detalle ventas.out";
    private Modulo1DTO arreglomodulo1[];
    private GestionVentasDTO gestiondto;
    private ArrayList<GestionVentasDTO> ventas;
    private ArrayList<DetallesVentaDTO> detalleVentas;
    private File rutaClientes;
    private File rutaProductos;
    private File rutaProveedores;
    private ArrayList<GestionDeClientesDTO> clientes;
    private ArrayList<GestionDeProveedoresDTO> proveedores;
    private ArrayList<GestionDeProductosDTO> productos;


    public ArchivosBinarios() {

        arreglomodulo1 = new Modulo1DTO[1];
        ventas = new ArrayList<GestionVentasDTO>();
        detalleVentas = new ArrayList<DetallesVentaDTO>();
        gestiondto = new GestionVentasDTO(0, 0, 0, 0, 0);
        clientes = new ArrayList<GestionDeClientesDTO>();
        proveedores = new ArrayList<GestionDeProveedoresDTO>();
        productos = new ArrayList<GestionDeProductosDTO>();

        rutaClientes = new File("data/clientes.out");
        rutaProductos = new File("data/productos.out");
        rutaProveedores = new File("data/proveedores.out");

        if (!rutaClientes.exists()) {
            try {
                rutaClientes.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!rutaProductos.exists()) {
            try {
                rutaProductos.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!rutaProveedores.exists()) {
            try {
                rutaProveedores.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String escribirModulo1(Modulo1DTO[] escribirmodulo1) {
        String respuesta = "Se han agregado exitosamente los datos de la tienda.";
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaConfiguracion));
            out.writeObject(arreglomodulo1);
            out.close();
        } catch (IOException e) {
            respuesta = "Error de IO";
        }
        System.out.println(respuesta);
        return respuesta;
    }

    public Modulo1DTO[] leermodulo1() {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaConfiguracion));
            arreglomodulo1 = (Modulo1DTO[]) in.readObject();
            in.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No pude leer.");
        }
        return arreglomodulo1;
    }

    public String escribirVentas(ArrayList<GestionVentasDTO> gestion) {

        String respuesta = "Se han guardado exitosamente los datos de la venta.";
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaVentas));
            out.writeObject(gestion);
            out.close();

        } catch (IOException e) {
            respuesta = "ERROR DE IO";
        }
        System.out.println(respuesta);
        return respuesta;

    }

    public ArrayList<GestionVentasDTO> leerVentas() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaVentas));
            ventas = (ArrayList<GestionVentasDTO>) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return ventas;

    }

    public String escribirDetallesVenta(ArrayList<DetallesVentaDTO> detalles) {
        String respuesta = "";
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaDetalleVentas));
            out.writeObject(detalles);
            out.close();
            respuesta = "Transacción confirmada y exitosa.";
        } catch (IOException e) {
            respuesta = "ERROR  DE IO";
        }
        System.out.println(respuesta);
        return respuesta;

    }

    public ArrayList<DetallesVentaDTO> leerDetalleVentas() {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaDetalleVentas));
            detalleVentas = (ArrayList<DetallesVentaDTO>) in.readObject();
            in.close();

        } catch (IOException | ClassNotFoundException e) {
        }

        return detalleVentas;
    }

    public String crearCliente(ArrayList<GestionDeClientesDTO> cliente) {
        String respuesta = "Se ha creado exitosamente el cliente.";
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaClientes));
            out.writeObject(cliente);
            out.close();
        } catch (IOException e) {
            respuesta = "Error de IO";
        }
        System.out.println(respuesta);
        return respuesta;
    }

    public ArrayList<GestionDeClientesDTO> leerCliente() {
        if (rutaClientes.length() != 0) {

            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaClientes));
                clientes = (ArrayList<GestionDeClientesDTO>) in.readObject();
                in.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return clientes;
    }

    public String crearProveedor(ArrayList<GestionDeProveedoresDTO> proveedor) {
        String respuesta = "Se ha creado exitosamente el proveedor.";
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaProveedores));
            out.writeObject(proveedor);
            out.close();
        } catch (IOException e) {
            respuesta = "Error de IO";
        }
        System.out.println(respuesta);
        return respuesta;
    }

    public ArrayList<GestionDeProveedoresDTO> leerProveedor() {
        if (rutaProveedores.length() != 0) {
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaProveedores));
                proveedores = (ArrayList<GestionDeProveedoresDTO>) in.readObject();
                in.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return proveedores;
    }

    public String crearProducto(ArrayList<GestionDeProductosDTO> producto) {
        String respuesta = "Se ha creado exitosamente el producto.";
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaProductos));
            out.writeObject(producto);
            out.close();
        } catch (IOException e) {
            respuesta = "Error de IO";
        }
        System.out.println(respuesta);
        return respuesta;
    }

    public ArrayList<GestionDeProductosDTO> leerProducto() {
        if (rutaProductos.length() != 0) {
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaProductos));
                productos = (ArrayList<GestionDeProductosDTO>) in.readObject();
                in.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return productos;
    }

    public String getRutaConfiguracion() {
        return rutaConfiguracion;
    }

    public void setRutaConfiguracion(String rutaConfiguracion) {
        this.rutaConfiguracion = rutaConfiguracion;
    }

    public String getRutaVentas() {
        return rutaVentas;
    }

    public void setRutaVentas(String rutaVentas) {
        this.rutaVentas = rutaVentas;
    }

    public String getRutaDetalleVentas() {
        return rutaDetalleVentas;
    }

    public void setRutaDetalleVentas(String rutaDetalleVentas) {
        this.rutaDetalleVentas = rutaDetalleVentas;
    }

    public Modulo1DTO[] getArreglomodulo1() {
        return arreglomodulo1;
    }

    public void setArreglomodulo1(Modulo1DTO[] arreglomodulo1) {
        this.arreglomodulo1 = arreglomodulo1;
    }

    public GestionVentasDTO getGestiondto() {
        return gestiondto;
    }

    public void setGestiondto(GestionVentasDTO gestiondto) {
        this.gestiondto = gestiondto;
    }

    public ArrayList<GestionVentasDTO> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<GestionVentasDTO> ventas) {
        this.ventas = ventas;
    }

    public ArrayList<DetallesVentaDTO> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(ArrayList<DetallesVentaDTO> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }

    public File getRutaClientes() {
        return rutaClientes;
    }

    public void setRutaClientes(File rutaClientes) {
        this.rutaClientes = rutaClientes;
    }

    public File getRutaProductos() {
        return rutaProductos;
    }

    public void setRutaProductos(File rutaProductos) {
        this.rutaProductos = rutaProductos;
    }

    public File getRutaProveedores() {
        return rutaProveedores;
    }

    public void setRutaProveedores(File rutaProveedores) {
        this.rutaProveedores = rutaProveedores;
    }

    public ArrayList<GestionDeClientesDTO> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<GestionDeClientesDTO> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<GestionDeProveedoresDTO> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<GestionDeProveedoresDTO> proveedores) {
        this.proveedores = proveedores;
    }

    public ArrayList<GestionDeProductosDTO> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<GestionDeProductosDTO> productos) {
        this.productos = productos;
    }

}


