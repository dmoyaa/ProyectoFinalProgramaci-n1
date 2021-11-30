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

public class Panel_LeerProducto extends JPanel {

	private JButton lePr;
	private JButton rePr;
	private JTextField tlePr;
	private JLabel iCod;
	
	public Panel_LeerProducto (){
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
    	
    	
    	iCod = new JLabel("Ingrese el código del producto");
    	iCod.setBounds(180,25,300,50);
    	add(iCod); 
		tlePr = new JTextField();
		tlePr.setBounds(10,100,465,130);
		add(tlePr);
		lePr= new JButton("Leer Productos");
		lePr.setFont(fuente);
		lePr.setForeground(Color.white);
		lePr.setBackground(Color.black);
		lePr.setBounds(10, 250, 200, 100);
		lePr.setActionCommand("LEER PRODUCTOS");
		add(lePr);
		rePr= new JButton("Regresar");
		rePr.setFont(fuente);
		rePr.setForeground(Color.white);
		rePr.setBackground(Color.black);
		rePr.setBounds(275,250,200,100);
		rePr.setActionCommand("LEER-REGRESARPR");
		add(rePr);
		
	}

	public JButton getLePr() {
		return lePr;
	}

	public void setLePr(JButton lePr) {
		this.lePr = lePr;
	}

	public JButton getRePr() {
		return rePr;
	}

	public void setRePr(JButton rePr) {
		this.rePr = rePr;
	}

	public JTextField getTlePr() {
		return tlePr;
	}

	public void setTlePr(JTextField tlePr) {
		this.tlePr = tlePr;
	}

	public JLabel getiCod() {
		return iCod;
	}

	public void setiCod(JLabel iCod) {
		this.iCod = iCod;
	}


	
}
