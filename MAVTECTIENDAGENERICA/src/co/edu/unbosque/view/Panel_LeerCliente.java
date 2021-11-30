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

public class Panel_LeerCliente extends JPanel {

	private JLabel iC;
	private JButton le;
	private JButton reC;
	private JTextField tLe;
	
	public Panel_LeerCliente (){
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
    	
    	iC = new JLabel("Ingrese la cédula del cliente");
    	iC.setBounds(180,25,300,50);
    	add(iC); 	
		tLe = new JTextField();
		tLe.setBounds(10,100,465,130);
		add(tLe);
		le= new JButton("Leer Clientes");
		le.setFont(fuente);
		le.setForeground(Color.white);
		le.setBackground(Color.black);
		le.setBounds(10, 250, 200, 100);
		le.setActionCommand("LEER CLIENTES");
		add(le);
		reC= new JButton("Regresar");
		reC.setFont(fuente);
		reC.setForeground(Color.white);
		reC.setBackground(Color.black);
		reC.setBounds(275,250,200,100);
		reC.setActionCommand("LEER-REGRESARC");
		add(reC);
		
	}

	public JButton getLe() {
		return le;
	}

	public void setLe(JButton le) {
		this.le = le;
	}

	public JButton getReC() {
		return reC;
	}

	public void setReC(JButton reC) {
		this.reC = reC;
	}

	public JTextField gettLe() {
		return tLe;
	}

	public void settLe(JTextField tLe) {
		this.tLe = tLe;
	}

	public JLabel getiC() {
		return iC;
	}

	public void setiC(JLabel iC) {
		this.iC = iC;
	}

	
	
}
