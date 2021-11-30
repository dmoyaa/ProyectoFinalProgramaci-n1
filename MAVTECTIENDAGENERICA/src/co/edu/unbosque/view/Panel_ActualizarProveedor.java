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

public class Panel_ActualizarProveedor extends JPanel{

	private JLabel aNit;
	private JLabel aNp;
	private JLabel aDi;
	private JLabel aTelP;
	private JLabel aCiu;
	private JTextField taNit;
	private JTextField taNp;
	private JTextField taDi;
	private JTextField taTelP;
	private JTextField taCiu;
	private JButton aguPrv;
	private JButton arePrv;
	
	public Panel_ActualizarProveedor (){
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
		
    	aNit = new JLabel("Nit:");
		add(aNit);
		taNit=new JTextField();
		add(taNit);
		aNp = new JLabel("Nombre Proveedor:");
		add(aNp);
		taNp=new JTextField();
		add(taNp);
		aDi = new JLabel("Dirección:");
		add(aDi);
		taDi=new JTextField();
		add(taDi);
		aTelP = new JLabel("Teléfono:");
		add(aTelP);
		taTelP=new JTextField();
		add(taTelP);
		aCiu = new JLabel("Ciudad:");
		add(aCiu);
		taCiu=new JTextField();
		add(taCiu);
		aguPrv = new JButton ("Actualizar Datos");
		aguPrv.setForeground(Color.white);
		aguPrv.setBackground(Color.black);
		add(aguPrv);
		aguPrv.setActionCommand("ACTUALIZAR DATOS PROVEEDOR");
		arePrv = new JButton("Regresar");
		arePrv.setForeground(Color.white);
		arePrv.setBackground(Color.black);
		add(arePrv);
		arePrv.setActionCommand("ACTUALIZAR-REGRESARPV");
		
	}

	public JLabel getaNit() {
		return aNit;
	}

	public void setaNit(JLabel aNit) {
		this.aNit = aNit;
	}

	public JLabel getaNp() {
		return aNp;
	}

	public void setaNp(JLabel aNp) {
		this.aNp = aNp;
	}

	public JLabel getaDi() {
		return aDi;
	}

	public void setaDi(JLabel aDi) {
		this.aDi = aDi;
	}

	public JLabel getaTelP() {
		return aTelP;
	}

	public void setaTelP(JLabel aTelP) {
		this.aTelP = aTelP;
	}

	public JLabel getaCiu() {
		return aCiu;
	}

	public void setaCiu(JLabel aCiu) {
		this.aCiu = aCiu;
	}

	public JTextField getTaNit() {
		return taNit;
	}

	public void setTaNit(JTextField taNit) {
		this.taNit = taNit;
	}

	public JTextField getTaNp() {
		return taNp;
	}

	public void setTaNp(JTextField taNp) {
		this.taNp = taNp;
	}

	public JTextField getTaDi() {
		return taDi;
	}

	public void setTaDi(JTextField taDi) {
		this.taDi = taDi;
	}

	public JTextField getTaTelP() {
		return taTelP;
	}

	public void setTaTelP(JTextField taTelP) {
		this.taTelP = taTelP;
	}

	public JTextField getTaCiu() {
		return taCiu;
	}

	public void setTaCiu(JTextField taCiu) {
		this.taCiu = taCiu;
	}

	public JButton getAguPrv() {
		return aguPrv;
	}

	public void setAguPrv(JButton aguPrv) {
		this.aguPrv = aguPrv;
	}

	public JButton getArePrv() {
		return arePrv;
	}

	public void setArePrv(JButton arePrv) {
		this.arePrv = arePrv;
	}

}
