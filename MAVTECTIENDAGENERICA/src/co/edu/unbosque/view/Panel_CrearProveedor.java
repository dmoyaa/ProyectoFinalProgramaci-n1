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

public class Panel_CrearProveedor extends JPanel{

	private JLabel nitPv;
	private JLabel nomPv;
	private JLabel dirPv;
	private JLabel telPv;
	private JLabel ciuPv;
	private JTextField tnitPv;
	private JTextField tnomPv;
	private JTextField tdirPv;
	private JTextField ttelPv;
	private JTextField tciuPv;
	private JButton guPv;
	private JButton reCru;
	
	public Panel_CrearProveedor (){
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
		
    	nitPv = new JLabel("NIT:");
		add(nitPv);
		tnitPv=new JTextField();
		add(tnitPv);
		nomPv = new JLabel("Nombre Proveedor:");
		add(nomPv);
		tnomPv=new JTextField();
		add(tnomPv);
		dirPv = new JLabel("Dirección:");
		add(dirPv);
		tdirPv=new JTextField();
		add(tdirPv);
		telPv = new JLabel("Teléfono:");
		add(telPv);
		ttelPv=new JTextField();
		add(ttelPv);
		ciuPv = new JLabel("Ciudad:");
		add(ciuPv);
		tciuPv=new JTextField();
		add(tciuPv);
		guPv = new JButton ("Guardar");
		guPv.setForeground(Color.white);
		guPv.setBackground(Color.black);
		add(guPv);
		guPv.setActionCommand("GUARDAR PROVEEDOR");
		reCru = new JButton("Regresar");
		reCru.setForeground(Color.white);
		reCru.setBackground(Color.black);
		add(reCru);
		reCru.setActionCommand("CREAR-REGRESARPV");
		
	}

	public JLabel getNitPv() {
		return nitPv;
	}

	public void setNitPv(JLabel nitPv) {
		this.nitPv = nitPv;
	}

	public JLabel getNomPv() {
		return nomPv;
	}

	public void setNomPv(JLabel nomPv) {
		this.nomPv = nomPv;
	}

	public JLabel getDirPv() {
		return dirPv;
	}

	public void setDirPv(JLabel dirPv) {
		this.dirPv = dirPv;
	}

	public JLabel getTelPv() {
		return telPv;
	}

	public void setTelPv(JLabel telPv) {
		this.telPv = telPv;
	}

	public JLabel getCiuPv() {
		return ciuPv;
	}

	public void setCiuPv(JLabel ciuPv) {
		this.ciuPv = ciuPv;
	}

	public JTextField getTnitPv() {
		return tnitPv;
	}

	public void setTnitPv(JTextField tnitPv) {
		this.tnitPv = tnitPv;
	}

	public JTextField getTnomPv() {
		return tnomPv;
	}

	public void setTnomPv(JTextField tnomPv) {
		this.tnomPv = tnomPv;
	}

	public JTextField getTdirPv() {
		return tdirPv;
	}

	public void setTdirPv(JTextField tdirPv) {
		this.tdirPv = tdirPv;
	}

	public JTextField getTtelPv() {
		return ttelPv;
	}

	public void setTtelPv(JTextField ttelPv) {
		this.ttelPv = ttelPv;
	}

	public JTextField getTciuPv() {
		return tciuPv;
	}

	public void setTciuPv(JTextField tciuPv) {
		this.tciuPv = tciuPv;
	}

	public JButton getGuPv() {
		return guPv;
	}

	public void setGuPv(JButton guPv) {
		this.guPv = guPv;
	}

	public JButton getReCru() {
		return reCru;
	}

	public void setReCru(JButton reCru) {
		this.reCru = reCru;
	}
	
	

	
}
