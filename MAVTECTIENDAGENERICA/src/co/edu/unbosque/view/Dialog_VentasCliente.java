package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Dialog_VentasCliente extends JDialog {

    private DefaultTableModel mod1;

    private JTable table;

    private JScrollPane scroll;

    public Dialog_VentasCliente() {
        setLayout(new GridLayout());
        inicializarComponentes();
        setVisible(false);
    }

    public void inicializarComponentes() {
        mod1 = new DefaultTableModel(new String[]{"#","Cédula", "Venta"}, 0);
        table = new JTable(mod1);
        table.setEnabled(false);
        table.getTableHeader().setResizingAllowed(true);
        table.getTableHeader().setReorderingAllowed(false);
        scroll = new JScrollPane(table);
        add(scroll);
    }

    public DefaultTableModel getMod1() {
        return mod1;
    }

    public void setMod1(DefaultTableModel mod1) {
        this.mod1 = mod1;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }
}
