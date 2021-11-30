package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class Panel_Modulo1 extends JPanel {

	private JLabel nomt;
	private JLabel tipc;
	private JLabel nit;
	private JLabel ciudt;
	private JLabel valori;
	private JLabel nomg;

	// cambiar nombre boton regresar
	private JButton bmenuPrincipal;
	private JButton botoncargarDatos;

	private JTextField tnomt;
	private JTextField ttipc;
	private JTextField tnit;
	private JTextField tciudt;
	private JTextField tvalori;
	private JTextField tnomg;

	public Panel_Modulo1() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {

		setBackground(Color.pink);
		setLayout(new GridLayout(7, 2));
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~DATOS~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		nomt = new JLabel(" Nombre tienda:");
		add(nomt);
		tnomt = new JTextField();
		add(tnomt);
		tipc = new JLabel(" Tipo de comercio:");
		add(tipc);
		ttipc = new JTextField();
		add(ttipc);
		nit = new JLabel(" Ingrese el NIT de la tienda:");
		add(nit);
		tnit = new JTextField();
		add(tnit);
		ciudt = new JLabel(" Nombre de la ciudad en la que está la tienda: ");
		add(ciudt);
		tciudt = new JTextField();
		add(tciudt);
		valori = new JLabel(" Ingrese el valor del IVA:");
		add(valori);
		tvalori = new JTextField();
		add(tvalori);
		nomg = new JLabel(" Ingrese el nombre del gerente: ");
		add(nomg);
		tnomg = new JTextField();
		add(tnomg);

		botoncargarDatos = new JButton("Guardar Datos");
		botoncargarDatos.setFont(fuente);
		botoncargarDatos.setForeground(Color.white);
		botoncargarDatos.setBackground(Color.black);
		botoncargarDatos.setActionCommand("CARGAR");
		add(botoncargarDatos);

		bmenuPrincipal = new JButton("Menú Tienda");
		bmenuPrincipal.setFont(fuente);
		bmenuPrincipal.setForeground(Color.white);
		bmenuPrincipal.setBackground(Color.black);
		bmenuPrincipal.setActionCommand("MENU TIENDA");
		add(bmenuPrincipal);
	}

	public JLabel getNomt() {
		return nomt;
	}

	public void setNomt(JLabel nomt) {
		this.nomt = nomt;
	}

	public JLabel getTipc() {
		return tipc;
	}

	public void setTipc(JLabel tipc) {
		this.tipc = tipc;
	}

	public JLabel getNit() {
		return nit;
	}

	public void setNit(JLabel nit) {
		this.nit = nit;
	}

	public JLabel getCiudt() {
		return ciudt;
	}

	public void setCiudt(JLabel ciudt) {
		this.ciudt = ciudt;
	}

	public JLabel getValori() {
		return valori;
	}

	public void setValori(JLabel valori) {
		this.valori = valori;
	}

	public JLabel getNomg() {
		return nomg;
	}

	public void setNomg(JLabel nomg) {
		this.nomg = nomg;
	}

	public JTextField getTnomt() {
		return tnomt;
	}

	public void setTnomt(JTextField tnomt) {
		this.tnomt = tnomt;
	}

	public JTextField getTtipc() {
		return ttipc;
	}

	public void setTtipc(JTextField ttipc) {
		this.ttipc = ttipc;
	}

	public JTextField getTnit() {
		return tnit;
	}

	public void setTnit(JTextField tnit) {
		this.tnit = tnit;
	}

	public JTextField getTciudt() {
		return tciudt;
	}

	public void setTciudt(JTextField tciudt) {
		this.tciudt = tciudt;
	}

	public JTextField getTvalori() {
		return tvalori;
	}

	public void setTvalori(JTextField tvalori) {
		this.tvalori = tvalori;
	}

	public JTextField getTnomg() {
		return tnomg;
	}

	public void setTnomg(JTextField tnomg) {
		this.tnomg = tnomg;
	}


	public JButton getBmenuPrincipal() {
		return bmenuPrincipal;
	}

	public void setBmenuPrincipal(JButton bmenuPrincipal) {
		this.bmenuPrincipal = bmenuPrincipal;
	}

	public JButton getBotoncargarDatos() {
		return botoncargarDatos;
	}

	public void setBotoncargarDatos(JButton botoncargarDatos) {
		this.botoncargarDatos = botoncargarDatos;
	}

}
