package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Panel_Ventas extends JPanel {
	
	private JLabel lCedula;
	private JTextField tCedula;
	private JButton bCedula;
	private JLabel lCodProd;
	private JTextField tCodProd;
	private JLabel lCanProd;
	private JTextField tCanProd;
	private JButton bAgregarProd;
	private JTextArea tProd;
	private JButton btotalizar;
	private JTextField tValorTotal;
	private JButton bFCompra;
	private JButton bRegresarCom;
	
	public Panel_Ventas() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~Gestión de Ventas~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 10);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
    	setBackground(Color.pink);
    	lCedula = new JLabel(" Ingrese Cédula del cliente:");
    	lCedula.setForeground(Color.black);
    	lCedula.setBounds(10,5,170,50);
    	add(lCedula);
    	tCedula = new JTextField();
    	tCedula.setBounds(175,15,160,30);
    	add(tCedula);
    	bCedula=new JButton("BUSCAR");
    	bCedula.setBounds(355,15,100,30);
    	bCedula.setBackground(Color.black);
    	bCedula.setForeground(Color.white);
    	bCedula.setFont(fuente);
    	bCedula.setActionCommand("BUSCAR CEDULA");
    	add(bCedula);
    	lCodProd= new JLabel(" Código del producto:");
    	lCodProd.setBounds(65,40,150,70);
    	lCodProd.setForeground(Color.black);
    	add(lCodProd);
    	tCodProd= new JTextField();
    	tCodProd.setBounds(210,60,100,30);
    	add(tCodProd);
    	lCanProd=new JLabel(" Cantidad:");
    	lCanProd.setBounds(130,80,150,70);
    	lCanProd.setForeground(Color.black);
    	add(lCanProd);
    	tCanProd=new JTextField();
    	tCanProd.setBounds(210,100,100,30);
    	add(tCanProd);
    	bAgregarProd = new JButton("AGREGAR");
    	bAgregarProd.setBackground(Color.black);
    	bAgregarProd.setForeground(Color.white);
    	bAgregarProd.setBounds(350,100,100,30);
    	bAgregarProd.setFont(fuente);
    	bAgregarProd.setActionCommand("AGREGAR A FACTURA");
    	add(bAgregarProd);
    	tProd=new JTextArea("Factura:"+"\n");
    	tProd.setBounds(10,150,300,200);
    	add(tProd);
    	btotalizar = new JButton("TOTALIZAR");
    	btotalizar.setFont(fuente);
    	btotalizar.setBackground(Color.black);
    	btotalizar.setForeground(Color.white);
    	btotalizar.setBounds(350,160,100,30);
    	btotalizar.setActionCommand("TOTALIZAR");
    	add(btotalizar);
    	tValorTotal = new JTextField("Total con IVA:");	
    	tValorTotal.setFont(fuente);
    	tValorTotal.setBounds(320
    			,210,150,30);
    	add(tValorTotal);
    	bFCompra = new JButton("FINALIZAR COMPRA");
    	bFCompra.setFont(fuente);
    	bFCompra.setBackground(Color.black);
    	bFCompra.setForeground(Color.white);
    	bFCompra.setActionCommand("FINALIZAR COMPRA");
    	bFCompra.setBounds(320,260,150,30);
    	add(bFCompra);
    	bRegresarCom= new JButton("REGRESAR A MENÚ");
    	bRegresarCom.setFont(fuente);
    	bRegresarCom.setBackground(Color.black);
    	bRegresarCom.setForeground(Color.white);
    	bRegresarCom.setBounds(320,310,150,30);
    	bRegresarCom.setActionCommand("REGRESAR VENTAS");
    	add(bRegresarCom);
	}

	public JLabel getlCedula() {
		return lCedula;
	}

	public void setlCedula(JLabel lCedula) {
		this.lCedula = lCedula;
	}

	public JTextField gettCedula() {
		return tCedula;
	}

	public void settCedula(JTextField tCedula) {
		this.tCedula = tCedula;
	}

	public JButton getbCedula() {
		return bCedula;
	}

	public void setbCedula(JButton bCedula) {
		this.bCedula = bCedula;
	}

	public JLabel getlCodProd() {
		return lCodProd;
	}

	public void setlCodProd(JLabel lCodProd) {
		this.lCodProd = lCodProd;
	}

	public JTextField gettCodProd() {
		return tCodProd;
	}

	public void settCodProd(JTextField tCodProd) {
		this.tCodProd = tCodProd;
	}

	public JLabel getlCanProd() {
		return lCanProd;
	}

	public void setlCanProd(JLabel lCanProd) {
		this.lCanProd = lCanProd;
	}

	public JTextField gettCanProd() {
		return tCanProd;
	}

	public void settCanProd(JTextField tCanProd) {
		this.tCanProd = tCanProd;
	}

	public JTextArea gettProd() {
		return tProd;
	}

	public void settProd(JTextArea tProd) {
		this.tProd = tProd;
	}

	public JButton getbRegresarCom() {
		return bRegresarCom;
	}

	public void setbRegresarCom(JButton bRegresarCom) {
		this.bRegresarCom = bRegresarCom;
	}

	public JButton getbAgregarProd() {
		return bAgregarProd;
	}

	public void setbAgregarProd(JButton bAgregarProd) {
		this.bAgregarProd = bAgregarProd;
	}

	public JButton getBtotalizar() {
		return btotalizar;
	}

	public void setBtotalizar(JButton btotalizar) {
		this.btotalizar = btotalizar;
	}

	public JTextField gettValorTotal() {
		return tValorTotal;
	}

	public void settValorTotal(JTextField tValorTotal) {
		this.tValorTotal = tValorTotal;
	}

	public JButton getbFCompra() {
		return bFCompra;
	}

	public void setbFCompra(JButton bFCompra) {
		this.bFCompra = bFCompra;
	}

}
