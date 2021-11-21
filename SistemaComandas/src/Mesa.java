
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsantosc04
 */
public class Mesa {

    private int numMesa;
    private List<Item> items;

    public Mesa() {
        this.numMesa = numMesa;
        this.items = new ArrayList<>();
    }

    public Mesa(int numMesa) {
        this.numMesa = numMesa;
        this.items = new ArrayList<>();
    }

    //Añadir y eliminar Item
    //Metodo para comprobar que existe un item
    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numMesa=" + numMesa + ", items=" + items + '}';
    }

    public void aniadirItem(Item itemAniadir) {
        for (Item item : items) {
            if (item.getNombre().contains(itemAniadir.getNombre())) {
                item.setCantidad(item.getCantidad() + 1);
                item.setPrecio(item.getPrecio() * item.getCantidad());
            }
        }
    }
    
    public int cantidadItem(String nombreItem){
        for (Item item : items) {
            if (item.getNombre().contains(nombreItem)) {
                return item.getCantidad();
            }
        }
        return 0;
    }

}
