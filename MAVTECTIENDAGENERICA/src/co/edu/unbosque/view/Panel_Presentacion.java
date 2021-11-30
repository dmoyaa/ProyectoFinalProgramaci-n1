package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class Panel_Presentacion extends JLabel {
	
	private JTextArea present;
	private JButton bempezar;
	
	
	public Panel_Presentacion() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {

		setBackground(Color.pink);
		setLayout(new GridLayout(2, 2));
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~INICIAL~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		
		present = new JTextArea("Bienvenido a su sistema operativo, en el encontrará diferentes modulos que le \n permitirán tener un buen manejo de sus finanzas y clientes \n "
				+ "es un sistema totalmente perzonalizado . Por favor para iniciar de \n click al siguiente botón.");
		present.setFont(fuente);
		present.setForeground(Color.black);
		present.setBackground(Color.pink);
	    add(present);
		
		
		bempezar = new JButton("Empezar");
		bempezar.setFont(fuente);
		bempezar.setForeground(Color.black);
		bempezar.setBackground(Color.white);
		bempezar.setActionCommand("INICIAR");
		add(bempezar);
}

	

	public JTextArea getPresent() {
		return present;
	}

	public void setPresent(JTextArea present) {
		this.present = present;
	}

	public JButton getBempezar() {
		return bempezar;
	}

	public void setBempezar(JButton bempezar) {
		this.bempezar = bempezar;
	}

}
