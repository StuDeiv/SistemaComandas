
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsantosc04
 */
public class LogicaItems {

    private List<Item> listaItems;
    private VentanaPrincipal ventanaPrincipal;
    private VentanaMesa1 ventanaMesa1;

    public VentanaMesa1 getVentanaMesa1() {
        return ventanaMesa1;
    }

    public void setVentanaMesa1(VentanaMesa1 ventanaMesa1) {
        this.ventanaMesa1 = ventanaMesa1;
    }

    public LogicaItems(VentanaPrincipal ventanaPrincipal) {
        this.listaItems = new ArrayList<>();
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public void aniadirItem(Item itemAniadir) {
        for (Item item : listaItems) {
            if (item.getNombre().contains(itemAniadir.getNombre())) {
                item.setCantidad(item.getCantidad()+1);
            }
        }
        this.listaItems.add(itemAniadir);
    }

    public List<Item> getListaItems() {
        return listaItems;
    }


}
