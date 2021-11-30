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

public class Panel_BorrarProducto extends JPanel {

	private JButton bPr;
	private JButton rC;
	private JLabel iN;
	private JTextField tLe;
	
	public Panel_BorrarProducto (){
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.pink);
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " BORRAR ");
		Font fuente = new Font("Tahoma", Font.BOLD, 10);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
    	setBackground(Color.pink);
    	
    	
    	iN = new JLabel("Ingrese el código del producto");
    	iN.setBounds(180,25,300,50);
    	add(iN); 	
		tLe = new JTextField();
		tLe.setBounds(10,100,465,130);
		add(tLe);
		bPr= new JButton("Borrar Producto");
		bPr.setFont(fuente);
		bPr.setForeground(Color.white);
		bPr.setBackground(Color.black);
		bPr.setBounds(10, 250, 200, 100);
		bPr.setActionCommand("BORRAR PRODUCTO");
		add(bPr);
		rC= new JButton("Regresar");
		rC.setFont(fuente);
		rC.setForeground(Color.white);
		rC.setBackground(Color.black);
		rC.setActionCommand("BORRAR-REGRESARPR");
		rC.setBounds(275,250,200,100);
		add(rC);
		
	}

	public JButton getbPr() {
		return bPr;
	}

	public void setbPr(JButton bPr) {
		this.bPr = bPr;
	}

	public JButton getrC() {
		return rC;
	}

	public void setrC(JButton rC) {
		this.rC = rC;
	}

	public JLabel getiN() {
		return iN;
	}

	public void setiN(JLabel iN) {
		this.iN = iN;
	}

	public JTextField gettLe() {
		return tLe;
	}

	public void settLe(JTextField tLe) {
		this.tLe = tLe;
	}

	

	
	
}
