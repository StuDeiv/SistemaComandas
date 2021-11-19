
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
    private List<Item> items = new ArrayList<Item>();

    public Mesa(int numMesa) {
        this.numMesa = numMesa;
    }
    

    //Añadir y eliminar Item
    //Metodo para comprobar que existe un item

    public int getNumMesa() {
        return numMesa;
    }

    public List<Item> getItems() {
        return items;
    }
}
