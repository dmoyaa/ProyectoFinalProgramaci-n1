package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Panel_CrudClientes extends JPanel{
	
	private JButton botonAc;
	private JButton botonBc;
	private JButton botonCc;
	private JButton botonLc;
	private JButton rMen;
	
	public Panel_CrudClientes() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
		
	}
	
	public void inicializarComponentes() {
		setBackground(Color.magenta);
		setLayout(new GridLayout(2,2));
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~MODULO: CLIENTES~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		botonAc = new JButton("Actualizar Cliente");
		botonAc.setFont(fuente);
		botonAc.setBackground(Color.black);
		botonAc.setForeground(Color.white);
		botonAc.setActionCommand("ACTUALIZARC");
		add(botonAc);
		botonBc= new JButton("Borrar Cliente");
		botonBc.setFont(fuente);
		botonBc.setForeground(Color.white);
		botonBc.setBackground(Color.black);
		botonBc.setActionCommand("BORRARC");
		add(botonBc);
		botonCc = new JButton("Crear Cliente");
		botonCc.setFont(fuente);
		botonCc.setForeground(Color.white);
		botonCc.setBackground(Color.black);
		botonCc.setActionCommand("CREARC");
		add(botonCc);
		botonLc = new JButton("Leer Cliente");
		botonLc.setFont(fuente);
		botonLc.setForeground(Color.white);
		botonLc.setBackground(Color.black);
		botonLc.setActionCommand("LEERC");
		add(botonLc);
		rMen = new JButton("Regresar Menú");
		rMen.setActionCommand("REGRESARMC");
		add(rMen);
	}

	public JButton getBotonAc() {
		return botonAc;
	}

	public void setBotonAc(JButton botonAc) {
		this.botonAc = botonAc;
	}

	public JButton getBotonBc() {
		return botonBc;
	}

	public void setBotonBc(JButton botonBc) {
		this.botonBc = botonBc;
	}

	public JButton getBotonCc() {
		return botonCc;
	}

	public void setBotonCc(JButton botonCc) {
		this.botonCc = botonCc;
	}

	public JButton getBotonLc() {
		return botonLc;
	}

	public void setBotonLc(JButton botonLc) {
		this.botonLc = botonLc;
	}

	public JButton getrMen() {
		return rMen;
	}

	public void setrMen(JButton rMen) {
		this.rMen = rMen;
	}

}

