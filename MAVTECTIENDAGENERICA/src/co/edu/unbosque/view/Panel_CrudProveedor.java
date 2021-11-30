package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Panel_CrudProveedor extends JPanel{
	
	private JButton botonApv;
	private JButton botonBpv;
	private JButton botonCpv;
	private JButton botonLpv;
	private JButton rMen;
	
	public Panel_CrudProveedor() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
		
	}
	
	public void inicializarComponentes() {
		setBackground(Color.magenta);
		setLayout(new GridLayout(2,2));
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~MODULO: PROVEEDORES~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		botonApv = new JButton("Actualizar Proveedor");
		botonApv.setFont(fuente);
		botonApv.setBackground(Color.black);
		botonApv.setForeground(Color.white);
		botonApv.setActionCommand("ACTUALIZARPV");
		add(botonApv);
		botonBpv= new JButton("Borrar Proveedor");
		botonBpv.setFont(fuente);
		botonBpv.setForeground(Color.white);
		botonBpv.setBackground(Color.black);
		botonBpv.setActionCommand("BORRARPV");
		add(botonBpv);
		botonCpv = new JButton("Crear Proveedor");
		botonCpv.setFont(fuente);
		botonCpv.setForeground(Color.white);
		botonCpv.setBackground(Color.black);
		botonCpv.setActionCommand("CREARPV");
		add(botonCpv);
		botonLpv = new JButton("Leer Proveedor");
		botonLpv.setFont(fuente);
		botonLpv.setForeground(Color.white);
		botonLpv.setBackground(Color.black);
		botonLpv.setActionCommand("LEERPV");
		add(botonLpv);
		rMen = new JButton("Regresar Menú");
		rMen.setActionCommand("REGRESARMPV");
		add(rMen);
	}

	public JButton getBotonApv() {
		return botonApv;
	}

	public void setBotonApv(JButton botonApv) {
		this.botonApv = botonApv;
	}

	public JButton getBotonBpv() {
		return botonBpv;
	}

	public void setBotonBpv(JButton botonBpv) {
		this.botonBpv = botonBpv;
	}

	public JButton getBotonCpv() {
		return botonCpv;
	}

	public void setBotonCpv(JButton botonCpv) {
		this.botonCpv = botonCpv;
	}

	public JButton getBotonLpv() {
		return botonLpv;
	}

	public void setBotonLpv(JButton botonLpv) {
		this.botonLpv = botonLpv;
	}

	public JButton getrMen() {
		return rMen;
	}

	public void setrMen(JButton rMen) {
		this.rMen = rMen;
	}

	

}

