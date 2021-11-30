package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Panel_CrudProducto extends JPanel{
	
	private JButton botonApr;
	private JButton botonBpr;
	private JButton botonCpr;
	private JButton botonLpr;
	private JButton rMen;
	
	public Panel_CrudProducto() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
		
	}
	
	public void inicializarComponentes() {
		setBackground(Color.magenta);
		setLayout(new GridLayout(2,2));
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~MODULO: PRODUCTOS~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		botonApr = new JButton("Actualizar Producto");
		botonApr.setFont(fuente);
		botonApr.setBackground(Color.black);
		botonApr.setForeground(Color.white);
		botonApr.setActionCommand("ACTUALIZARPR");
		add(botonApr);
		botonBpr= new JButton("Borrar Producto");
		botonBpr.setFont(fuente);
		botonBpr.setForeground(Color.white);
		botonBpr.setBackground(Color.black);
		botonBpr.setActionCommand("BORRARPR");
		add(botonBpr);
		botonCpr = new JButton("Crear Producto");
		botonCpr.setFont(fuente);
		botonCpr.setForeground(Color.white);
		botonCpr.setBackground(Color.black);
		botonCpr.setActionCommand("CREARPR");
		add(botonCpr);
		botonLpr = new JButton("Leer Producto");
		botonLpr.setFont(fuente);
		botonLpr.setForeground(Color.white);
		botonLpr.setBackground(Color.black);
		botonLpr.setActionCommand("LEERPR");
		add(botonLpr);
		rMen = new JButton("Regresar Menú");
		rMen.setActionCommand("REGRESARMPR");
		add(rMen);
	}

	public JButton getBotonApr() {
		return botonApr;
	}

	public void setBotonApr(JButton botonApr) {
		this.botonApr = botonApr;
	}

	public JButton getBotonBpr() {
		return botonBpr;
	}

	public void setBotonBpr(JButton botonBpr) {
		this.botonBpr = botonBpr;
	}

	public JButton getBotonCpr() {
		return botonCpr;
	}

	public void setBotonCpr(JButton botonCpr) {
		this.botonCpr = botonCpr;
	}

	public JButton getBotonLpr() {
		return botonLpr;
	}

	public void setBotonLpr(JButton botonLpr) {
		this.botonLpr = botonLpr;
	}

	public JButton getrMen() {
		return rMen;
	}

	public void setrMen(JButton rMen) {
		this.rMen = rMen;
	}

		

}

