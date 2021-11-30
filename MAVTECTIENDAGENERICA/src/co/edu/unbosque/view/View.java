package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class View extends JFrame  {
	private Panel_Presentacion pPrest;
	//
	private Panel_Modulo1 pMod1;
	//
	private Panel_Opciones pOpciones;
	//
	private Panel_Ventas pVentas;
	//
	private Panel_CrearCliente cClientes;
	private Panel_LeerCliente  lClientes;
	private Panel_BorrarCliente bClientes;
	private Panel_ActualizarCliente aClientes;
	private Panel_CrudClientes crudClientes;
	//
	private Panel_CrearProducto cProductos;
	private Panel_LeerProducto lProductos;
	private Panel_BorrarProducto bProductos;
	private Panel_ActualizarProducto aProductos;
	private Panel_CrudProducto crudProductos;
	//
	private Panel_CrearProveedor cProveedores;
	private Panel_LeerProveedor lProveedores;
	private Panel_BorrarProveedor bProveedores;
	private Panel_ActualizarProveedor aProveedores;
	private Panel_CrudProveedor crudProveedores;
	//
	private Panel_OpcionesConsultas panel_opcionesConsultas;
	private Dialog_ListadoClientes dialog_listadoClientes;
	private Dialog_VentasCliente dialog_ventasCliente;
	
	public View() {

		setSize(500,400);
		setResizable(false);
		setTitle("Sistema de información de comercio"); //titulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);//qué debe hacer si cierra la ventana
		setVisible(true);
		setLocationRelativeTo(null);
		inicializarComponentes();

	}
	public void MostrarMensaje(String Mensaje) {
		JOptionPane.showMessageDialog(null, Mensaje);
	}

	public String mostrarDatoString(String mensaje) {
		return JOptionPane.showInputDialog(null, mensaje);
	}

	public void inicializarComponentes() {
		
		pPrest = new Panel_Presentacion();
		pPrest.setBounds(-7,-15,500,400);
		getContentPane().add(pPrest);
		
		pMod1 = new Panel_Modulo1();
		pMod1.setBounds(10,10,500,400);
		getContentPane().add(pMod1);

		pVentas = new Panel_Ventas();
		pVentas.setBounds(10,10,500,400);
		getContentPane().add(pVentas);

		cClientes = new Panel_CrearCliente();
		cClientes.setBounds(10,10,200,200);
		getContentPane().add(cClientes);

		lClientes = new Panel_LeerCliente();
		lClientes.setBounds(10,10,200,200);
		getContentPane().add(lClientes);

		bClientes = new Panel_BorrarCliente();
		bClientes.setBounds(10,10,200,200);
		getContentPane().add(bClientes);

		aClientes = new Panel_ActualizarCliente();
		aClientes.setBounds(10,10,200,200);
		getContentPane().add(aClientes);

		crudClientes = new Panel_CrudClientes();
		crudClientes.setBounds(10,10,500,500);
		getContentPane().add(crudClientes);
		//productos
		cProductos = new Panel_CrearProducto();
		cProductos.setBounds(10,10,200,200);
		getContentPane().add(cProductos);

		lProductos = new Panel_LeerProducto();
		lProductos.setBounds(10,10,200,200);
		getContentPane().add(lProductos);

		bProductos = new Panel_BorrarProducto();
		bProductos.setBounds(10,10,200,200);
		getContentPane().add(bProductos);

		aProductos = new Panel_ActualizarProducto();
		aProductos.setBounds(10,10,200,200);
		getContentPane().add(aProductos);

		crudProductos = new Panel_CrudProducto();
		crudProductos.setBounds(10,10,500,500);
		getContentPane().add(crudProductos);

		//proveedores
		cProveedores = new Panel_CrearProveedor();
		cProveedores.setBounds(10,10,200,200);
		getContentPane().add(cProveedores);

		lProveedores = new Panel_LeerProveedor();
		lProveedores.setBounds(10,10,200,200);
		getContentPane().add(lProveedores);

		bProveedores = new Panel_BorrarProveedor();
		bProveedores.setBounds(10,10,200,200);
		getContentPane().add(bProveedores);

		aProveedores = new Panel_ActualizarProveedor();
		aProveedores.setBounds(10,10,200,200);
		getContentPane().add(aProveedores);

		crudProveedores = new Panel_CrudProveedor();
		crudProveedores.setBounds(10,10,200,200);
		getContentPane().add(crudProveedores);

		//opciones 
		pOpciones = new Panel_Opciones();
		pOpciones.setBounds(0,0,200,200);
		getContentPane().add(pOpciones);

		panel_opcionesConsultas = new Panel_OpcionesConsultas();
		panel_opcionesConsultas.setBounds(0,0,500,400);
		getContentPane().add(panel_opcionesConsultas);

		dialog_listadoClientes = new Dialog_ListadoClientes();
		dialog_listadoClientes.setBounds(0,0,1000,700);

		dialog_ventasCliente = new Dialog_VentasCliente();
		dialog_ventasCliente.setBounds(0,0,1000,700);
	}
	
	
	public Panel_Presentacion getpPrest() {
		return pPrest;
	}
	public void setpPrest(Panel_Presentacion pPrest) {
		this.pPrest = pPrest;
	}
	public Dialog_ListadoClientes getDialog_listadoClientes() {
		return dialog_listadoClientes;
	}
	public void setDialog_listadoClientes(Dialog_ListadoClientes dialog_listadoClientes) {
		this.dialog_listadoClientes = dialog_listadoClientes;
	}
	public void setDialog_ventasCliente(Dialog_VentasCliente dialog_ventasCliente) {
		this.dialog_ventasCliente = dialog_ventasCliente;
	}
	public Panel_CrearCliente getcClientes() {
		return cClientes;
	}
	public void setcClientes(Panel_CrearCliente cClientes) {
		this.cClientes = cClientes;
	}
	public Panel_LeerCliente getlClientes() {
		return lClientes;
	}
	public void setlClientes(Panel_LeerCliente lClientes) {
		this.lClientes = lClientes;
	}
	public Panel_BorrarCliente getbClientes() {
		return bClientes;
	}
	public void setbClientes(Panel_BorrarCliente bClientes) {
		this.bClientes = bClientes;
	}
	public Panel_ActualizarCliente getaClientes() {
		return aClientes;
	}
	public void setaClientes(Panel_ActualizarCliente aClientes) {
		this.aClientes = aClientes;
	}
	public Panel_CrudClientes getCrudClientes() {
		return crudClientes;
	}
	public void setCrudClientes(Panel_CrudClientes crudClientes) {
		this.crudClientes = crudClientes;
	}
	public Panel_CrearProducto getcProductos() {
		return cProductos;
	}
	public void setcProductos(Panel_CrearProducto cProductos) {
		this.cProductos = cProductos;
	}
	public Panel_LeerProducto getlProductos() {
		return lProductos;
	}
	public void setlProductos(Panel_LeerProducto lProductos) {
		this.lProductos = lProductos;
	}
	public Panel_BorrarProducto getbProductos() {
		return bProductos;
	}
	public void setbProductos(Panel_BorrarProducto bProductos) {
		this.bProductos = bProductos;
	}
	public Panel_ActualizarProducto getaProductos() {
		return aProductos;
	}
	public void setaProductos(Panel_ActualizarProducto aProductos) {
		this.aProductos = aProductos;
	}
	public Panel_CrudProducto getCrudProductos() {
		return crudProductos;
	}
	public Panel_Opciones getpOpciones() {
		return pOpciones;
	}
	public void setpOpciones(Panel_Opciones pOpciones) {
		this.pOpciones = pOpciones;
	}
	public void setCrudProductos(Panel_CrudProducto crudProductos) {
		this.crudProductos = crudProductos;
	}
	public Panel_CrearProveedor getcProveedores() {
		return cProveedores;
	}
	public void setcProveedores(Panel_CrearProveedor cProveedores) {
		this.cProveedores = cProveedores;
	}
	public Panel_LeerProveedor getlProveedores() {
		return lProveedores;
	}
	public void setlProveedores(Panel_LeerProveedor lProveedores) {
		this.lProveedores = lProveedores;
	}
	public Panel_BorrarProveedor getbProveedores() {
		return bProveedores;
	}
	public void setbProveedores(Panel_BorrarProveedor bProveedores) {
		this.bProveedores = bProveedores;
	}
	public Panel_ActualizarProveedor getaProveedores() {
		return aProveedores;
	}
	public void setaProveedores(Panel_ActualizarProveedor aProveedores) {
		this.aProveedores = aProveedores;
	}
	public Panel_CrudProveedor getCrudProveedores() {
		return crudProveedores;
	}
	public void setCrudProveedores(Panel_CrudProveedor crudProveedores) {
		this.crudProveedores = crudProveedores;
	}
	public Panel_Modulo1 getpMod1() {
		return pMod1;
	}
	public void setpMod1(Panel_Modulo1 pMod1) {
		this.pMod1 = pMod1;
	}
	public Panel_Ventas getpVentas() {
		return pVentas;
	}
	public void setpVentas(Panel_Ventas pVentas) {
		this.pVentas = pVentas;
	}

	public Panel_OpcionesConsultas getPanel_opcionesConsultas() {
		return panel_opcionesConsultas;
	}

	public void setPanel_opcionesConsultas(Panel_OpcionesConsultas panel_opcionesConsultas) {
		this.panel_opcionesConsultas = panel_opcionesConsultas;
	}

	public Dialog_ListadoClientes getPanel_listadoClientes() {
		return dialog_listadoClientes;
	}

	public void setPanel_listadoClientes(Dialog_ListadoClientes dialog_listadoClientes) {
		this.dialog_listadoClientes = dialog_listadoClientes;
	}

	public Dialog_VentasCliente getDialog_ventasCliente() {
		return dialog_ventasCliente;
	}
}
