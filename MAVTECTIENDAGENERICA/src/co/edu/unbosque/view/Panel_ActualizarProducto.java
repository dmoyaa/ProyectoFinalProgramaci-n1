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

public class Panel_ActualizarProducto extends JPanel{

	private JLabel aCpr;
	private JLabel aNpr;
	private JLabel aNipr;
	private JLabel aPcpr;
	private JLabel aPvpr;
	private JTextField taCpr;
	private JTextField taNpr;
	private JTextField tNipr;
	private JTextField tPcpr;
	private JTextField tPvpr;
	private JButton aguPr;
	private JButton arePr;
	
	public Panel_ActualizarProducto (){
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.pink);
		setLayout(new GridLayout(6,2));
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ACTUALIZAR ");
		Font fuente = new Font("Tahoma", Font.BOLD, 10);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
    	setBackground(Color.pink);
		
    	aCpr = new JLabel("Código del producto:");
		add(aCpr);
		taCpr=new JTextField();
		add(taCpr);
		aNpr = new JLabel("Nombre Producto:");
		add(aNpr);
		taNpr=new JTextField();
		add(taNpr);
		aNipr = new JLabel("Nit de proveedor del producto:");
		add(aNipr);
		tNipr=new JTextField();
		add(tNipr);
		aPcpr = new JLabel("Precio de compra del producto:");
		add(aPcpr);
		tPcpr=new JTextField();
		add(tPcpr);
		aPvpr = new JLabel("Precio de venta del producto:");
		add(aPvpr);
		tPvpr=new JTextField();
		add(tPvpr);
		aguPr = new JButton ("Actualizar Datos");
		aguPr.setForeground(Color.white);
		aguPr.setBackground(Color.black);
		add(aguPr);
		aguPr.setActionCommand("ACTUALIZAR DATOS PRODUCTO");
		arePr = new JButton("Regresar");
		arePr.setForeground(Color.white);
		arePr.setBackground(Color.black);
		add(arePr);
		arePr.setActionCommand("ACTUALIZAR-REGRESARPR");
		
	}

	public JLabel getaCpr() {
		return aCpr;
	}

	public void setaCpr(JLabel aCpr) {
		this.aCpr = aCpr;
	}

	public JLabel getaNpr() {
		return aNpr;
	}

	public void setaNpr(JLabel aNpr) {
		this.aNpr = aNpr;
	}

	public JLabel getaNipr() {
		return aNipr;
	}

	public void setaNipr(JLabel aNipr) {
		this.aNipr = aNipr;
	}

	public JLabel getaPcpr() {
		return aPcpr;
	}

	public void setaPcpr(JLabel aPcpr) {
		this.aPcpr = aPcpr;
	}

	public JLabel getaPvpr() {
		return aPvpr;
	}

	public void setaPvpr(JLabel aPvpr) {
		this.aPvpr = aPvpr;
	}

	public JTextField getTaCpr() {
		return taCpr;
	}

	public void setTaCpr(JTextField taCpr) {
		this.taCpr = taCpr;
	}

	public JTextField getTaNpr() {
		return taNpr;
	}

	public void setTaNpr(JTextField taNpr) {
		this.taNpr = taNpr;
	}

	public JTextField gettNipr() {
		return tNipr;
	}

	public void settNipr(JTextField tNipr) {
		this.tNipr = tNipr;
	}

	public JTextField gettPcpr() {
		return tPcpr;
	}

	public void settPcpr(JTextField tPcpr) {
		this.tPcpr = tPcpr;
	}

	public JTextField gettPvpr() {
		return tPvpr;
	}

	public void settPvpr(JTextField tPvpr) {
		this.tPvpr = tPvpr;
	}

	public JButton getAguPr() {
		return aguPr;
	}

	public void setAguPr(JButton aguPr) {
		this.aguPr = aguPr;
	}

	public JButton getArePr() {
		return arePr;
	}

	public void setArePr(JButton arePr) {
		this.arePr = arePr;
	}

	

}
