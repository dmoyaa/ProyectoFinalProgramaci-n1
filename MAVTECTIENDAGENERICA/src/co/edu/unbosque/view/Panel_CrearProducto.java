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

public class Panel_CrearProducto extends JPanel{

	private JLabel cPr;
	private JLabel nomPr;
	private JLabel niPpr;
	private JLabel pCompr;
	private JLabel pVenpr;
	private JTextField tcPr;
	private JTextField tnomPr;
	private JTextField tniPpr;
	private JTextField tpCompr;
	private JTextField tpVenpr;
	private JButton guPr;
	private JButton reCru;
	
	public Panel_CrearProducto (){
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.pink);
		setLayout(new GridLayout(6,2));
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " CREAR ");
		Font fuente = new Font("Tahoma", Font.BOLD, 10);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
    	setBackground(Color.pink);
		
    	cPr = new JLabel("Código de producto:");
		add(cPr);
		tcPr=new JTextField();
		add(tcPr);
		nomPr = new JLabel("Nombre del producto:");
		add(nomPr);
		tnomPr=new JTextField();
		add(tnomPr);
		niPpr = new JLabel("Nit del proveedor del producto:");
		add(niPpr);
		tniPpr=new JTextField();
		add(tniPpr);
		pCompr = new JLabel("Precio de compra del producto:");
		add(pCompr);
		tpCompr=new JTextField();
		add(tpCompr);
		pVenpr = new JLabel("Precio de venta del producto:");
		add(pVenpr);
		tpVenpr=new JTextField();
		add(tpVenpr);
		guPr = new JButton ("Guardar");
		guPr.setForeground(Color.white);
		guPr.setBackground(Color.black);
		add(guPr);
		guPr.setActionCommand("GUARDAR PRODUCTO");
		reCru = new JButton("Regresar");
		reCru.setForeground(Color.white);
		reCru.setBackground(Color.black);
		add(reCru);
		reCru.setActionCommand("CREAR-REGRESARPR");
		
	}

	public JLabel getcPr() {
		return cPr;
	}

	public void setcPr(JLabel cPr) {
		this.cPr = cPr;
	}

	public JLabel getNomPr() {
		return nomPr;
	}

	public void setNomPr(JLabel nomPr) {
		this.nomPr = nomPr;
	}

	public JLabel getNiPpr() {
		return niPpr;
	}

	public void setNiPpr(JLabel niPpr) {
		this.niPpr = niPpr;
	}

	public JLabel getpCompr() {
		return pCompr;
	}

	public void setpCompr(JLabel pCompr) {
		this.pCompr = pCompr;
	}

	public JLabel getpVenpr() {
		return pVenpr;
	}

	public void setpVenpr(JLabel pVenpr) {
		this.pVenpr = pVenpr;
	}

	public JTextField getTcPr() {
		return tcPr;
	}

	public void setTcPr(JTextField tcPr) {
		this.tcPr = tcPr;
	}

	public JTextField getTnomPr() {
		return tnomPr;
	}

	public void setTnomPr(JTextField tnomPr) {
		this.tnomPr = tnomPr;
	}

	public JTextField getTniPpr() {
		return tniPpr;
	}

	public void setTniPpr(JTextField tniPpr) {
		this.tniPpr = tniPpr;
	}

	public JTextField getTpCompr() {
		return tpCompr;
	}

	public void setTpCompr(JTextField tpCompr) {
		this.tpCompr = tpCompr;
	}

	public JTextField getTpVenpr() {
		return tpVenpr;
	}

	public void setTpVenpr(JTextField tpVenpr) {
		this.tpVenpr = tpVenpr;
	}

	public JButton getGuPr() {
		return guPr;
	}

	public void setGuPr(JButton guPr) {
		this.guPr = guPr;
	}

	public JButton getReCru() {
		return reCru;
	}

	public void setReCru(JButton reCru) {
		this.reCru = reCru;
	}

	

	
}
