package co.edu.unbosque.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.ArchivosBinarios;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

    private View v;
    private SistemaModulos s;

    public Controller() {
        v = new View();
        v.setVisible(true);
        s = new SistemaModulos();
        asignarOyentes();
    }

    public void asignarOyentes() {

        // Parametros de la tienda
        v.getpMod1().getBotoncargarDatos().addActionListener(this);
        v.getpMod1().getBmenuPrincipal().addActionListener(this);
        // opciones modulos
        v.getpOpciones().getbClientes().addActionListener(this);
        v.getpOpciones().getbConsultas().addActionListener(this);
        v.getpOpciones().getbGVentas().addActionListener(this);
        v.getpOpciones().getbProductos().addActionListener(this);
        v.getpOpciones().getbProvedores().addActionListener(this);
        v.getpOpciones().getbRegresarOpciones().addActionListener(this);
        //crud clientes
        v.getCrudClientes().getBotonAc().addActionListener(this);
        v.getCrudClientes().getBotonCc().addActionListener(this);
        v.getCrudClientes().getBotonBc().addActionListener(this);
        v.getCrudClientes().getBotonLc().addActionListener(this);
        v.getCrudClientes().getrMen().addActionListener(this);
        //crear cliente
        v.getcClientes().getGuCli().addActionListener(this);
        v.getcClientes().getReCru().addActionListener(this);
        //actualizar cliente
        v.getaClientes().getAguCli().addActionListener(this);
        v.getaClientes().getAreCru().addActionListener(this);
        //borrar cliente
        v.getbClientes().getBo().addActionListener(this);
        v.getbClientes().getrC().addActionListener(this);
        //leer cliente
        v.getlClientes().getLe().addActionListener(this);
        v.getlClientes().getReC().addActionListener(this);
        //crud producto
        v.getCrudProductos().getBotonApr().addActionListener(this);
        v.getCrudProductos().getBotonBpr().addActionListener(this);
        v.getCrudProductos().getBotonCpr().addActionListener(this);
        v.getCrudProductos().getBotonLpr().addActionListener(this);
        v.getCrudProductos().getrMen().addActionListener(this);
        //crear producto
        v.getcProductos().getGuPr().addActionListener(this);
        v.getcProductos().getReCru().addActionListener(this);
        //actualizar producto
        v.getaProductos().getAguPr().addActionListener(this);
        v.getaProductos().getArePr().addActionListener(this);
        //borrar producto
        v.getbProductos().getbPr().addActionListener(this);
        v.getbProductos().getrC().addActionListener(this);
        //leer producto
        v.getlProductos().getLePr().addActionListener(this);
        v.getlProductos().getRePr().addActionListener(this);
        //crud proveedor
        v.getCrudProveedores().getBotonApv().addActionListener(this);
        v.getCrudProveedores().getBotonBpv().addActionListener(this);
        v.getCrudProveedores().getBotonCpv().addActionListener(this);
        v.getCrudProveedores().getBotonLpv().addActionListener(this);
        v.getCrudProveedores().getrMen().addActionListener(this);
        //crear proveedor
        v.getcProveedores().getGuPv().addActionListener(this);
        v.getcProveedores().getReCru().addActionListener(this);
        //actualizar proveedor
        v.getaProveedores().getAguPrv().addActionListener(this);
        v.getaProveedores().getArePrv().addActionListener(this);
        //borrar producto
        v.getbProveedores().getbPv().addActionListener(this);
        v.getbProveedores().getrC().addActionListener(this);
        //leer proveedor
        v.getlProveedores().getLePv().addActionListener(this);
        v.getlProveedores().getRePv().addActionListener(this);
        //gestionar ventas
        v.getpVentas().getbAgregarProd().addActionListener(this);
        v.getpVentas().getbCedula().addActionListener(this);
        v.getpVentas().getbFCompra().addActionListener(this);
        v.getpVentas().getBtotalizar().addActionListener(this);
        v.getpVentas().getbRegresarCom().addActionListener(this);
        //consultas
        v.getPanel_opcionesConsultas().getListadoClientes().addActionListener(this);
        v.getPanel_opcionesConsultas().getRegresar().addActionListener(this);
        v.getPanel_opcionesConsultas().getDetalleVentasCliente().addActionListener(this);
        v.getPanel_opcionesConsultas().getTotalComprasProveedor().addActionListener(this);
        v.getPanel_opcionesConsultas().getTotalVentasCliente().addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        // Botones módulo 1
        if (comando.equals("CARGAR")) {
            s.getModulo1dao().agregarModulo1(s.crearOModulo(v.getpMod1().getTnomt().getText(), v.getpMod1().getTtipc().getText(), v.getpMod1().getTciudt().getText(), v.getpMod1().getTnomg().getText(), Double.parseDouble(v.getpMod1().getTnit().getText()), Double.parseDouble(v.getpMod1().getTvalori().getText())));
            System.out.println(s.getModulo1dto().getCiudadtienda());
        } else if (comando.equals("MENU TIENDA")) {
            v.getContentPane().remove(v.getpMod1());
            v.getContentPane().add(v.getpOpciones());
            v.getpOpciones().setVisible(true);
        }
        // Botones Opciones

        else if (comando.equals("PROVEDORES")) {
            v.getContentPane().remove(v.getpOpciones());
            v.getContentPane().add(v.getCrudProveedores());
            v.getCrudProveedores().setVisible(true);
        } else if (comando.equals("PRODUCTOS")) {
            v.getContentPane().remove(v.getpOpciones());
            v.getContentPane().add(v.getCrudProductos());
            v.getCrudProductos().setVisible(true);
        } else if (comando.equals("CLIENTES")) {
            v.getContentPane().remove(v.getpOpciones());
            v.getContentPane().add(v.getCrudClientes());
            v.getCrudClientes().setVisible(true);
        } else if (comando.equals("GESTIONAR VENTAS")) {
            v.getContentPane().remove(v.getpOpciones());
            v.getContentPane().add(v.getpVentas());
            v.getpVentas().setVisible(true);
        } else if (comando.equals("CONSULTAS")) {

            v.getpOpciones().setVisible(false);
            v.getPanel_opcionesConsultas().setVisible(true);

        } else if (comando.equals("REGRESAR OPCIONES")) {
            v.getpOpciones().setVisible(false);
            v.getContentPane().remove(v.getpOpciones());
            v.getContentPane().add(v.getpMod1());
        }

        // crud clientes
        if (comando.equals("ACTUALIZARC")) {
            v.getCrudClientes().setVisible(false);
            v.getContentPane().remove(v.getCrudClientes());
            v.getContentPane().add(v.getaClientes());
            v.getaClientes().setVisible(true);
        } else if (comando.equals("BORRARC")) {
            v.getCrudClientes().setVisible(false);
            v.getContentPane().remove(v.getCrudClientes());
            v.getContentPane().add(v.getbClientes());
            v.getbClientes().setVisible(true);
        } else if (comando.equals("CREARC")) {
            v.getCrudClientes().setVisible(false);
            v.getContentPane().remove(v.getCrudClientes());
            v.getContentPane().add(v.getcClientes());
            v.getcClientes().setVisible(true);
        } else if (comando.equals("LEERC")) {
            v.getCrudClientes().setVisible(false);
            v.getContentPane().remove(v.getCrudClientes());
            v.getContentPane().add(v.getlClientes());
            v.getlClientes().setVisible(true);
        } else if (comando.equals("REGRESARMC")) {
            v.getCrudClientes().setVisible(false);
            v.getContentPane().remove(v.getCrudClientes());
            v.getContentPane().add(v.getpOpciones());

        }//crud productos
        else if (comando.equals("ACTUALIZARPR")) {
            v.getCrudProductos().setVisible(false);
            v.getContentPane().remove(v.getCrudProductos());
            v.getContentPane().add(v.getaProductos());
            v.getaProductos().setVisible(true);
        } else if (comando.equals("BORRARPR")) {
            v.getCrudProductos().setVisible(false);
            v.getContentPane().remove(v.getCrudProductos());
            v.getContentPane().add(v.getbProductos());
            v.getbProductos().setVisible(true);
        } else if (comando.equals("CREARPR")) {
            v.getCrudProductos().setVisible(false);
            v.getContentPane().remove(v.getCrudProductos());
            v.getContentPane().add(v.getcProductos());
            v.getcProductos().setVisible(true);
        } else if (comando.equals("LEERPR")) {
            v.getCrudProductos().setVisible(false);
            v.getContentPane().remove(v.getCrudProductos());
            v.getContentPane().add(v.getlProductos());
            v.getlProductos().setVisible(true);
        } else if (comando.equals("REGRESARMPR")) {
            v.getCrudProductos().setVisible(false);
            v.getContentPane().remove(v.getCrudProductos());
            v.getContentPane().add(v.getpOpciones());

        }//crud proveedores
        else if (comando.equals("ACTUALIZARPV")) {
            v.getCrudProveedores().setVisible(false);
            v.getContentPane().remove(v.getCrudProveedores());
            v.getContentPane().add(v.getaProveedores());
            v.getaProveedores().setVisible(true);
        } else if (comando.equals("BORRARPV")) {
            v.getCrudProveedores().setVisible(false);
            v.getContentPane().remove(v.getCrudProveedores());
            v.getContentPane().add(v.getbProveedores());
            v.getbProveedores().setVisible(true);
        } else if (comando.equals("CREARPV")) {
            v.getCrudProveedores().setVisible(false);
            v.getContentPane().remove(v.getCrudProveedores());
            v.getContentPane().add(v.getcProveedores());
            v.getcProveedores().setVisible(true);
        } else if (comando.equals("LEERPV")) {
            v.getCrudProveedores().setVisible(false);
            v.getContentPane().remove(v.getCrudProveedores());
            v.getContentPane().add(v.getlProveedores());
            v.getlProveedores().setVisible(true);
        } else if (comando.equals("REGRESARMPV")) {
            v.getCrudProveedores().setVisible(false);
            v.getContentPane().remove(v.getCrudProveedores());
            v.getContentPane().add(v.getpOpciones());
        }

        //funciones//

        //actualizar
        else if (comando.equals("ACTUALIZAR DATOS CLIENTE")) {
            double tel = Double.parseDouble(v.getaClientes().getAttel().getText());
            double ced = Double.parseDouble(v.getaClientes().getAtced().getText());
            String corr = v.getaClientes().getAtcEle().getText();
            String dire = v.getaClientes().getAtdir().getText();
            String nomc = v.getaClientes().getaNCo().getText();

            s.getAb().leerCliente();
            if (s.getgClientesDAO().actualizarDatosCliente(s.getAb().getClientes(), s.getAb().getRutaClientes(), nomc, corr, dire, tel, ced)) {
                v.MostrarMensaje("Se actualizaron los datos con éxito.");
            } else {
                v.MostrarMensaje("Error: no fue posible actualizar los datos, el cliente no existe.");
            }
        } else if (comando.equals("ACTUALIZAR-REGRESARC")) {
            v.getaClientes().setVisible(false);
            v.getContentPane().remove(v.getaClientes());
            v.getContentPane().add(v.getCrudClientes());
            v.getCrudClientes().setVisible(true);
        } else if (comando.equals("ACTUALIZAR DATOS PRODUCTO")) {
            int codP = Integer.parseInt(v.getaProductos().getTaCpr().getText());
            int nitPrp = Integer.parseInt(v.getaProductos().gettNipr().getText());
            double precC = Double.parseDouble(v.getaProductos().getTaCpr().getText());
            double precV = Double.parseDouble(v.getaProductos().gettPvpr().getText());
            String nompr = v.getaProductos().getTaNpr().getText();

            s.getAb().leerProducto();
            if (s.getgProductosDAO().actualizarDatosProductos(s.getAb().getProductos(), s.getAb().getRutaProductos(), nompr, codP, nitPrp, precC, precV)) {
                v.MostrarMensaje("Se actualizaron los datos con éxito.");
            } else {
                v.MostrarMensaje("Error: no fue posible actualizar los datos, el producto no existe.");
            }
        } else if (comando.equals("ACTUALIZAR-REGRESARPR")) {
            v.getaProductos().setVisible(false);
            v.getContentPane().remove(v.getaProductos());
            v.getContentPane().add(v.getCrudProductos());
            v.getCrudProductos().setVisible(true);
        } else if (comando.equals("ACTUALIZAR DATOS PROVEEDOR")) {
            int nit = Integer.parseInt(v.getaProveedores().getTaNit().getText());
            double tel = Double.parseDouble(v.getaProveedores().getTaTelP().getText());
            String nom = v.getaProveedores().getTaNp().getText();
            String dir = v.getaProveedores().getTaDi().getText();
            String ciu = v.getaProveedores().getTaCiu().getText();

            s.getAb().leerProveedor();
            if (s.getgProveedoresDAO().actualizarDatosProveedor(s.getAb().getProveedores(), s.getAb().getRutaProveedores(), nit, nom, dir, tel, ciu)) {
                v.MostrarMensaje("Se actualizaron los datos con éxito.");
            } else {
                v.MostrarMensaje("Error: no fue posible actualizar los datos, el proveedor no existe.");
            }
        } else if (comando.equals("ACTUALIZAR-REGRESARPV")) {
            v.getaProveedores().setVisible(false);
            v.getContentPane().remove(v.getaProveedores());
            v.getContentPane().add(v.getCrudProveedores());
            v.getCrudProveedores().setVisible(true);
        }//borrar
        else if (comando.equals("BORRAR CLIENTES")) {
            double cedula = Double.parseDouble(v.getbClientes().gettLe().getText());

            s.getAb().leerCliente();
            if (s.getgClientesDAO().borrarCliente(s.getAb().getClientes(), s.getAb().getRutaClientes(), cedula)) {
                v.MostrarMensaje("Se borraron los datos con éxito.");
            } else {
                v.MostrarMensaje("Error: no fue posible borrar los datos, el cliente no existe.");
            }
        } else if (comando.equals("BORRAR-REGRESARC")) {
            v.getbClientes().setVisible(false);
            v.getContentPane().remove(v.getbClientes());
            v.getContentPane().add(v.getCrudClientes());
            v.getCrudClientes().setVisible(true);
        } else if (comando.equals("BORRAR PRODUCTO")) {
            int codigo = Integer.parseInt(v.getbProductos().gettLe().getText());

            s.getAb().leerProducto();
            if (s.getgProductosDAO().borrarProducto(s.getAb().getProductos(), s.getAb().getRutaProductos(), codigo)) {
                v.MostrarMensaje("Se borraron los datos con éxito.");
            } else {
                v.MostrarMensaje("Error: no fue posible borrar los datos, el producto no existe.");
            }
        } else if (comando.equals("BORRAR-REGRESARPR")) {
            v.getbProductos().setVisible(false);
            v.getContentPane().remove(v.getbProductos());
            v.getContentPane().add(v.getCrudProductos());
            v.getCrudProductos().setVisible(true);
        } else if (comando.equals("BORRAR PROVEEDORES")) {
            int nit = Integer.parseInt(v.getbProveedores().gettLe().getText());

            s.getAb().leerProveedor();
            if (s.getgProveedoresDAO().borrarProveedor(s.getAb().getProveedores(), s.getAb().getRutaProveedores(), nit)) {
                v.MostrarMensaje("Se borraron los datos con éxito.");
            } else {
                v.MostrarMensaje("Error: no fue posible borrar los datos, el proveedor no existe.");
            }
        } else if (comando.equals("BORRAR-REGRESARPV")) {
            v.getbProveedores().setVisible(false);
            v.getContentPane().remove(v.getbProveedores());
            v.getContentPane().add(v.getCrudProveedores());
            v.getCrudProveedores().setVisible(true);
        }//crear
        else if (comando.equals("GUARDAR CLIENTE")) {
            double tel = Double.parseDouble(v.getcClientes().getTtel().getText());
            double ced = Double.parseDouble(v.getcClientes().getTced().getText());
            String corr = v.getcClientes().getTcEle().getText();
            String dire = v.getcClientes().getTdir().getText();
            String nomc = v.getcClientes().getTnCo().getText();

            v.MostrarMensaje(s.getgClientesDAO().crearCliente(s.crearOcliente(Double.parseDouble(v.getcClientes().getTced().getText()), nomc, dire, tel, corr)));
        } else if (comando.equals("CREAR-REGRESARC")) {
            v.getcClientes().setVisible(false);
            v.getContentPane().remove(v.getcClientes());
            v.getContentPane().add(v.getCrudClientes());
            v.getCrudClientes().setVisible(true);
        } else if (comando.equals("GUARDAR PRODUCTO")) {
            int codi = Integer.parseInt(v.getcProductos().getTcPr().getText());
            int nit = Integer.parseInt(v.getcProductos().getTniPpr().getText());
            double pcom = Double.parseDouble(v.getcProductos().getTpCompr().getText());
            double pven = Double.parseDouble(v.getcProductos().getTpVenpr().getText());
            String nom = v.getcProductos().getTnomPr().getText();
            v.MostrarMensaje(s.getgProductosDAO().crearProducto(new GestionDeProductosDTO(codi, nom, nit, pcom, pven)));
        } else if (comando.equals("CREAR-REGRESARPR")) {
            v.getcProductos().setVisible(false);
            v.getContentPane().remove(v.getcProductos());
            v.getContentPane().add(v.getCrudProductos());
            v.getCrudProductos().setVisible(true);

        } else if (comando.equals("GUARDAR PROVEEDOR")) {
            int nit = Integer.parseInt(v.getcProveedores().getTnitPv().getText());
            String nombre = v.getcProveedores().getTnomPv().getText();
            String dir = v.getcProveedores().getTdirPv().getText();
            String ciu = v.getcProveedores().getTciuPv().getText();
            String tel = v.getcProveedores().getTtelPv().getText();

            v.MostrarMensaje(s.getgProveedoresDAO().crearProveedor(new GestionDeProveedoresDTO(nit, nombre, dir, Double.parseDouble(tel), ciu)));
        } else if (comando.equals("CREAR-REGRESARPV")) {
            v.getcProveedores().setVisible(false);
            v.getContentPane().remove(v.getcProveedores());
            v.getContentPane().add(v.getCrudProveedores());
            v.getCrudProveedores().setVisible(true);
        }//leer
        else if (comando.equals("LEER CLIENTES")) {

            int cedula = Integer.parseInt(v.getlClientes().gettLe().getText());
            v.MostrarMensaje(s.getgClientesDAO().leer(cedula));

        } else if (comando.equals("LEER-REGRESARC")) {
            v.getlClientes().setVisible(false);
            v.getContentPane().remove(v.getlClientes());
            v.getContentPane().add(v.getCrudClientes());
            v.getCrudClientes().setVisible(true);
        } else if (comando.equals("LEER PRODUCTOS")) {
            int lcod = Integer.parseInt(v.getlProductos().getTlePr().getText());
            v.MostrarMensaje(s.getgProductosDAO().leer(lcod));
        } else if (comando.equals("LEER-REGRESARPR")) {
            v.getlProductos().setVisible(false);
            v.getContentPane().remove(v.getlProductos());
            v.getContentPane().add(v.getCrudProductos());
            v.getCrudProductos().setVisible(true);
        } else if (comando.equals("LEER PROVEEDORES")) {
            int lnit = Integer.parseInt(v.getlProveedores().getTlePv().getText());

            v.MostrarMensaje(s.getgProveedoresDAO().leer(lnit));
        } else if (comando.equals("LEER-REGRESARPV")) {
            v.getlProveedores().setVisible(false);
            v.getContentPane().remove(v.getlProveedores());
            v.getContentPane().add(v.getCrudProveedores());
            v.getCrudProveedores().setVisible(true);
        }
        //operaciones de gestiï¿½n de ventas
        else if (comando.equals("BUSCAR CEDULA")) {
            int cedula = Integer.parseInt(v.getpVentas().gettCedula().getText());
            v.getpVentas().gettCedula().setText(s.getgClientesDAO().leerNombre(cedula));

        } else if (comando.equals("AGREGAR A FACTURA")) {
            int codigo = Integer.parseInt(v.getpVentas().gettCodProd().getText());
            int cantidad = Integer.parseInt(v.getpVentas().gettCanProd().getText());
            double precio = s.getgProductosDAO().leerPrecio(codigo);
            v.getpVentas().gettProd().append(codigo + ": " + precio * cantidad + "\n");
            s.getDetallesdao().AgregarDetallesVenta(s.crearODetallesVentas(codigo, cantidad, precio, (precio * cantidad)));
            System.out.println(s.getDetallesdao().mostrarDetalles());
        } else if (comando.equals("TOTALIZAR")) {
            double siniva = s.getDetallesdao().mostrarPreciosDetalles(s.getVentasdao().definirNoCompra());
            System.out.println(s.getVentasdao().definirNoCompra());
            double coniva = siniva + (siniva * (s.getModulo1dao().mostrarIva() / 100));
            v.getpVentas().gettValorTotal().setText(String.valueOf(coniva));
        } else if (comando.equals("FINALIZAR COMPRA")) {
            double siniva = s.getDetallesdao().mostrarPreciosDetalles(s.getVentasdao().definirNoCompra());
            double coniva = siniva + (siniva * (s.getModulo1dao().mostrarIva() / 100));
            double iva = siniva * (s.getModulo1dao().mostrarIva() / 100);
            double cedula = s.getgClientesDAO().mostrarCedula(v.getpVentas().gettCedula().getText());
            s.getVentasdao().agregarVenta(s.crearOGestionVentas(cedula, siniva, iva, coniva));
            v.getpVentas().gettProd().append("Venta " + s.getVentasdao().definirNoCompra() + ": " + coniva);

        } else if (comando.equals("REGRESAR VENTAS")) {
            v.getpVentas().setVisible(false);
            v.getContentPane().remove(v.getpVentas());
            v.getContentPane().add(v.getpOpciones());
        } else if (comando.equals("CONSULTAS_LISTADO_CLIENTES")) {
            v.getPanel_listadoClientes().setVisible(true);
            v.getPanel_listadoClientes().setLocationRelativeTo(null);

            v.getPanel_listadoClientes().getMod1().setRowCount(0);
            s.getAb().leerCliente();
            for (GestionDeClientesDTO cliente : s.getAb().getClientes()) {
                double cedulaCliente = cliente.getCedulaCliente();
                String nombreCompleto = cliente.getNombreCompleto();
                String direccionCliente = cliente.getDireccionCliente();
                double telefonoCliente = cliente.getTelefonoCliente();
                String correoCliente = cliente.getCorreoCliente();


                v.getPanel_listadoClientes().getMod1().addRow(new String[]{String.valueOf(cedulaCliente), nombreCompleto, direccionCliente, String.valueOf(telefonoCliente), correoCliente});
            }
        } else if (comando.equals("CONSULTAS_TOTAL_VENTAS_CLIENTE")) {
            try {
                double cedula = Double.parseDouble(v.mostrarDatoString("Ingrese la cédula:"));

                s.getAb().leerCliente();
                if (s.getgClientesDAO().buscarCliente(cedula, s.getAb().getClientes()) != null) {
                    GestionDeClientesDTO cliente = s.getgClientesDAO().buscarCliente(cedula, s.getAb().getClientes());

                    s.getAb().leerVentas();
                    int contador = 0;
                    for (GestionVentasDTO venta : s.getAb().getVentas()) {
                        if (venta.getCedulaCliente() == cliente.getCedulaCliente()) {
                            contador++;
                        }
                    }

                    v.MostrarMensaje("El cliente " + cliente.getNombreCompleto() + " tiene un total de " + contador + " ventas.");
                } else {
                    v.MostrarMensaje("El cliente no existe.");
                }
            } catch (NumberFormatException ex) {
                v.MostrarMensaje("Recuerde que la cédula debe ir únicamente en números.");
            }
        } else if (comando.equals("CONSULTAS_DETALLE_VENTAS_CLIENTE")) {
            try {
                double cedula = Double.parseDouble(v.mostrarDatoString("Ingrese la cédula:"));

                s.getAb().leerCliente();
                if (s.getgClientesDAO().buscarCliente(cedula, s.getAb().getClientes()) != null) {
                    GestionDeClientesDTO cliente = s.getgClientesDAO().buscarCliente(cedula, s.getAb().getClientes());

                    s.getAb().leerVentas();
                    v.getDialog_ventasCliente().setVisible(true);
                    v.getDialog_ventasCliente().setLocationRelativeTo(null);

                    int contador = 1;
                    for (GestionVentasDTO venta : s.getAb().getVentas()) {
                        if (venta.getCedulaCliente() == cliente.getCedulaCliente()) {
                            v.getDialog_ventasCliente().getMod1().addRow(new String[]{String.valueOf(contador++), String.valueOf(cliente.getCedulaCliente()), String.valueOf(venta.getVentaSinIva())});
                        }
                    }
                } else {
                    v.MostrarMensaje("El cliente no existe.");
                }
            } catch (NumberFormatException ex) {
                v.MostrarMensaje("Recuerde que la cédula debe ir únicamente en números.");
            }
        } else if (comando.equals("CONSULTAS_REGRESAR")) {
            v.getpOpciones().setVisible(true);
            v.getPanel_opcionesConsultas().setVisible(false);

        } else if (comando.equals("CONSULTAS_TOTAL_COMPRAS_PROVEEDOR")) {
            try {
                int nit = Integer.parseInt(v.mostrarDatoString("Ingrese el NIT:"));

                s.getAb().leerProveedor();
                if (s.getgProveedoresDAO().buscarProveedor(nit, s.getAb().getProveedores()) != null) {
                    GestionDeProveedoresDTO proveedor = s.getgProveedoresDAO().buscarProveedor(nit, s.getAb().getProveedores());

                    s.getAb().leerVentas();

                    int contador = 0;
                    for (GestionDeProveedoresDTO compra : s.getAb().getProveedores()) {
                        if (compra.getNIT() == proveedor.getNIT()) {
                            contador++;
                        }
                    }

                    v.MostrarMensaje("El proveedor " + proveedor.getNombreProveedor() + " tiene un total de " + contador + " compras.");
                } else {
                    v.MostrarMensaje("El NIT no existe.");
                }
            } catch (NumberFormatException ex) {
                v.MostrarMensaje("Recuerde que el NIT debe ir únicamente en números.");
            }
        }
    }
}
