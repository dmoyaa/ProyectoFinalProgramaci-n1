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

public class Panel_CrearCliente extends JPanel{

	private JLabel ced;
	private JLabel nCo;
	private JLabel dir;
	private JLabel tel;
	private JLabel cEle;
	private JTextField tced;
	private JTextField tnCo;
	private JTextField tdir;
	private JTextField ttel;
	private JTextField tcEle;
	private JButton guCli;
	private JButton reCru;
	
	public Panel_CrearCliente (){
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
		
    	ced = new JLabel("Cédula:");
		add(ced);
		tced=new JTextField();
		add(tced);
		nCo = new JLabel("Nombre Completo:");
		add(nCo);
		tnCo=new JTextField();
		add(tnCo);
		dir = new JLabel("Dirección:");
		add(dir);
		tdir=new JTextField();
		add(tdir);
		tel = new JLabel("Teléfono:");
		add(tel);
		ttel=new JTextField();
		add(ttel);
		cEle = new JLabel("Correo electrónico:");
		add(cEle);
		tcEle=new JTextField();
		add(tcEle);
		guCli = new JButton ("Guardar");
		guCli.setForeground(Color.white);
		guCli.setBackground(Color.black);
		add(guCli);
		guCli.setActionCommand("GUARDAR CLIENTE");
		reCru = new JButton("Regresar");
		reCru.setForeground(Color.white);
		reCru.setBackground(Color.black);
		add(reCru);
		reCru.setActionCommand("CREAR-REGRESARC");
		
	}

	public JLabel getCed() {
		return ced;
	}

	public void setCed(JLabel ced) {
		this.ced = ced;
	}

	public JLabel getnCo() {
		return nCo;
	}

	public void setnCo(JLabel nCo) {
		this.nCo = nCo;
	}

	public JLabel getDir() {
		return dir;
	}

	public void setDir(JLabel dir) {
		this.dir = dir;
	}

	public JLabel getTel() {
		return tel;
	}

	public void setTel(JLabel tel) {
		this.tel = tel;
	}

	public JLabel getcEle() {
		return cEle;
	}

	public void setcEle(JLabel cEle) {
		this.cEle = cEle;
	}

	public JTextField getTced() {
		return tced;
	}

	public void setTced(JTextField tced) {
		this.tced = tced;
	}

	public JTextField getTnCo() {
		return tnCo;
	}

	public void setTnCo(JTextField tnCo) {
		this.tnCo = tnCo;
	}

	public JTextField getTdir() {
		return tdir;
	}

	public void setTdir(JTextField tdir) {
		this.tdir = tdir;
	}

	public JTextField getTtel() {
		return ttel;
	}

	public void setTtel(JTextField ttel) {
		this.ttel = ttel;
	}

	public JTextField getTcEle() {
		return tcEle;
	}

	public void setTcEle(JTextField tcEle) {
		this.tcEle = tcEle;
	}

	public JButton getGuCli() {
		return guCli;
	}

	public void setGuCli(JButton guCli) {
		this.guCli = guCli;
	}

	public JButton getReCru() {
		return reCru;
	}

	public void setReCru(JButton reCru) {
		this.reCru = reCru;
	}
}
