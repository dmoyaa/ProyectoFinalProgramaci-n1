package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Panel_LeerProveedor extends JPanel {

	private JButton lePv;
	private JButton rePv;
	private JTextField tlePv;
	private JLabel iNit;
	
	public Panel_LeerProveedor (){
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.pink);
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " LEER ");
		Font fuente = new Font("Tahoma", Font.BOLD, 10);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
    	setBackground(Color.pink);
    	
    	
    	iNit = new JLabel("Ingrese el código del producto:");
    	iNit.setBounds(10,10,465,130);
    	add(iNit); 
		tlePv = new JTextField();
		tlePv.setBounds(10,100,465,130);
		add(tlePv);
		lePv= new JButton("Leer Proveedores");
		lePv.setFont(fuente);
		lePv.setForeground(Color.white);
		lePv.setBackground(Color.black);
		lePv.setBounds(10, 250, 200, 100);
		lePv.setActionCommand("LEER PROVEEDORES");
		add(lePv);
		rePv= new JButton("Regresar");
		rePv.setFont(fuente);
		rePv.setForeground(Color.white);
		rePv.setBackground(Color.black);
		rePv.setBounds(275,250,200,100);
		rePv.setActionCommand("LEER-REGRESARPV");
		add(rePv);
		
	}

	public JButton getLePv() {
		return lePv;
	}

	public void setLePv(JButton lePv) {
		this.lePv = lePv;
	}

	public JButton getRePv() {
		return rePv;
	}

	public JTextField getTlePv() {
		return tlePv;
	}

	public void setTlePv(JTextField tlePv) {
		this.tlePv = tlePv;
	}

	public JLabel getiNit() {
		return iNit;
	}

	public void setiNit(JLabel iNit) {
		this.iNit = iNit;
	}

	public void setRePv(JButton rePv) {
		this.rePv = rePv;
	}

	
	
	
}
