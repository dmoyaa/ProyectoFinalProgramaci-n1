package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class Panel_OpcionesConsultas extends JPanel {
    private JButton listadoClientes;

    private JButton totalVentasCliente;

    private JButton detalleVentasCliente;

    private JButton totalComprasProveedor;

    private JButton regresar;

    public Panel_OpcionesConsultas() {
        setLayout(new GridLayout(2,6));
        inicializarComponentes();
        setVisible(false);
    }

    public void inicializarComponentes() {
        listadoClientes = new JButton("Listado de Clientes");
        listadoClientes.setActionCommand("CONSULTAS_LISTADO_CLIENTES");
        add(listadoClientes);

        totalVentasCliente = new JButton("Total Ventas Cliente");
        totalVentasCliente.setActionCommand("CONSULTAS_TOTAL_VENTAS_CLIENTE");
        add(totalVentasCliente);

        detalleVentasCliente = new JButton("Detalle Ventas Cliente");
        detalleVentasCliente.setActionCommand("CONSULTAS_DETALLE_VENTAS_CLIENTE");
        add(detalleVentasCliente);

        totalComprasProveedor = new JButton("Total Compras Proveedor");
        totalComprasProveedor.setActionCommand("CONSULTAS_TOTAL_COMPRAS_PROVEEDOR");
        add(totalComprasProveedor);

        regresar = new JButton("Regresar");
        regresar.setActionCommand("CONSULTAS_REGRESAR");
        add(regresar);
    }

    public JButton getListadoClientes() {
        return listadoClientes;
    }

    public void setListadoClientes(JButton listadoClientes) {
        this.listadoClientes = listadoClientes;
    }

    public JButton getTotalVentasCliente() {
        return totalVentasCliente;
    }

    public void setTotalVentasCliente(JButton totalVentasCliente) {
        this.totalVentasCliente = totalVentasCliente;
    }

    public JButton getDetalleVentasCliente() {
        return detalleVentasCliente;
    }

    public void setDetalleVentasCliente(JButton detalleVentasCliente) {
        this.detalleVentasCliente = detalleVentasCliente;
    }

    public JButton getTotalComprasProveedor() {
        return totalComprasProveedor;
    }

    public void setTotalComprasProveedor(JButton totalComprasProveedor) {
        this.totalComprasProveedor = totalComprasProveedor;
    }

    public JButton getRegresar() {
        return regresar;
    }

    public void setRegresar(JButton regresar) {
        this.regresar = regresar;
    }
}
