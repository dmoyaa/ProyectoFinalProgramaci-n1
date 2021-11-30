package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Panel_Opciones extends JPanel{
	
	private JButton bProvedores;
	private JButton bProductos;
	private JButton bClientes;
	private JButton bGVentas;
	private JButton bConsultas;
	private JButton bRegresarOpciones;
	
	public Panel_Opciones() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
		
	}
	
	public void inicializarComponentes() {
		setLayout(new GridLayout(2,3));
		setBackground(Color.pink);
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~DATOS~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		bProvedores = new JButton("PROVEDORES");
		bProvedores.setBackground(Color.black);
		bProvedores.setForeground(Color.white);
		bProvedores.setFont(fuente);
		bProvedores.setActionCommand("PROVEDORES");
		add(bProvedores);
		bProductos=new JButton("PRODUCTOS");
		bProductos.setFont(fuente);
		bProductos.setBackground(Color.black);
		bProductos.setForeground(Color.white);
		bProductos.setActionCommand("PRODUCTOS");
		add(bProductos);
		bClientes= new JButton("CLIENTES");
		bClientes.setFont(fuente);
		bClientes.setBackground(Color.black);
		bClientes.setForeground(Color.white);
		bClientes.setActionCommand("CLIENTES");
		add(bClientes);
		bGVentas= new JButton("GESTIONAR VENTAS");
		bGVentas.setFont(fuente);
		bGVentas.setBackground(Color.black);
		bGVentas.setForeground(Color.white);
		bGVentas.setActionCommand("GESTIONAR VENTAS");
		add(bGVentas);
		bConsultas= new JButton("CONSULTAS");
		bConsultas.setFont(fuente);
		bConsultas.setBackground(Color.black);
		bConsultas.setForeground(Color.white);
		bConsultas.setActionCommand("CONSULTAS");
		add(bConsultas);
		bRegresarOpciones=new JButton("REGRESAR");
		bRegresarOpciones.setFont(fuente);
		bRegresarOpciones.setBackground(Color.black);
		bRegresarOpciones.setForeground(Color.white);
		bRegresarOpciones.setActionCommand("REGRESAR OPCIONES");
		add(bRegresarOpciones);
	}

	public JButton getbProvedores() {
		return bProvedores;
	}

	public void setbProvedores(JButton bProvedores) {
		this.bProvedores = bProvedores;
	}

	public JButton getbProductos() {
		return bProductos;
	}

	public void setbProductos(JButton bProductos) {
		this.bProductos = bProductos;
	}

	public JButton getbClientes() {
		return bClientes;
	}

	public void setbClientes(JButton bClientes) {
		this.bClientes = bClientes;
	}

	public JButton getbGVentas() {
		return bGVentas;
	}

	public void setbGVentas(JButton bGVentas) {
		this.bGVentas = bGVentas;
	}

	public JButton getbConsultas() {
		return bConsultas;
	}

	public void setbConsultas(JButton bConsultas) {
		this.bConsultas = bConsultas;
	}

	public JButton getbRegresarOpciones() {
		return bRegresarOpciones;
	}

	public void setbRegresarOpciones(JButton bRegresarOpciones) {
		this.bRegresarOpciones = bRegresarOpciones;
	}

}
