
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author proye
 */
public class MiActionListener implements ActionListener {

    private VentanaItems ventanaPostres;
    private VentanaMesa1 ventanaMesa1;
    private String nombreElemento;
    private Item item;

    public MiActionListener(VentanaItems ventanaPostre, VentanaMesa1 ventanaMesa1,String nombreElemento) {
        this.ventanaPostres = ventanaPostre;
        this.ventanaMesa1 = ventanaMesa1;
        this.nombreElemento = nombreElemento;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        item = this.ventanaMesa1.obtenerInfoItemsPorNombre(nombreElemento);
        System.out.println("espagguetttiisisi");
        if (item.getCantidad() >= 1) {
            this.ventanaMesa1.getMesa().aniadirItem(item);
        } else {
            item.setCantidad(item.getCantidad() + 1);
            this.ventanaMesa1.getMesa().getItems().add(item);
        }
        this.ventanaMesa1.getjTableItems().updateUI();
        this.ventanaMesa1.establecerTableModelItem();
        this.ventanaMesa1.getjTableItems().setModel(new ItemsTableModel(this.ventanaMesa1.getMesa().getItems()));
        this.ventanaPostres.getjPanel1().removeAll();
        this.ventanaPostres.dispose();
        this.ventanaMesa1.setVisible(true);
    }

}
