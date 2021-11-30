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

public class Panel_ActualizarCliente extends JPanel{

	private JLabel aCed;
	private JLabel aNCo;
	private JLabel aDir;
	private JLabel aTel;
	private JLabel aCEle;
	private JTextField atced;
	private JTextField atnCo;
	private JTextField atdir;
	private JTextField attel;
	private JTextField atcEle;
	private JButton aguCli;
	private JButton areCru;
	
	public Panel_ActualizarCliente (){
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
		
    	aCed = new JLabel("Cédula:");
		add(aCed);
		atced=new JTextField();
		add(atced);
		aNCo = new JLabel("Nombre Completo:");
		add(aNCo);
		atnCo=new JTextField();
		add(atnCo);
		aDir = new JLabel("Dirección:");
		add(aDir);
		atdir=new JTextField();
		add(atdir);
		aTel = new JLabel("Teléfono:");
		add(aTel);
		attel=new JTextField();
		add(attel);
		aCEle = new JLabel("Correo electrónico:");
		add(aCEle);
		atcEle=new JTextField();
		add(atcEle);
		aguCli = new JButton ("Actualizar Datos");
		aguCli.setForeground(Color.white);
		aguCli.setBackground(Color.black);
		add(aguCli);
		aguCli.setActionCommand("ACTUALIZAR DATOS CLIENTE");
		areCru = new JButton("Regresar");
		areCru.setForeground(Color.white);
		areCru.setBackground(Color.black);
		add(areCru);
		areCru.setActionCommand("ACTUALIZAR-REGRESARC");
		
	}

	public JLabel getaCed() {
		return aCed;
	}

	public void setaCed(JLabel aCed) {
		this.aCed = aCed;
	}

	public JLabel getaNCo() {
		return aNCo;
	}

	public void setaNCo(JLabel aNCo) {
		this.aNCo = aNCo;
	}

	public JLabel getaDir() {
		return aDir;
	}

	public void setaDir(JLabel aDir) {
		this.aDir = aDir;
	}

	public JLabel getaTel() {
		return aTel;
	}

	public void setaTel(JLabel aTel) {
		this.aTel = aTel;
	}

	public JLabel getaCEle() {
		return aCEle;
	}

	public void setaCEle(JLabel aCEle) {
		this.aCEle = aCEle;
	}

	public JTextField getAtced() {
		return atced;
	}

	public void setAtced(JTextField atced) {
		this.atced = atced;
	}

	public JTextField getAtnCo() {
		return atnCo;
	}

	public void setAtnCo(JTextField atnCo) {
		this.atnCo = atnCo;
	}

	public JTextField getAtdir() {
		return atdir;
	}

	public void setAtdir(JTextField atdir) {
		this.atdir = atdir;
	}

	public JTextField getAttel() {
		return attel;
	}

	public void setAttel(JTextField attel) {
		this.attel = attel;
	}

	public JTextField getAtcEle() {
		return atcEle;
	}

	public void setAtcEle(JTextField atcEle) {
		this.atcEle = atcEle;
	}

	public JButton getAguCli() {
		return aguCli;
	}

	public void setAguCli(JButton aguCli) {
		this.aguCli = aguCli;
	}

	public JButton getAreCru() {
		return areCru;
	}

	public void setAreCru(JButton areCru) {
		this.areCru = areCru;
	}

	
}
