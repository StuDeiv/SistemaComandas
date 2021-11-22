
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        obtenerItemsFichero();
    }

    public void aniadirItem(Item itemAniadir) {
        for (Item item : listaItems) {
            if (item.getNombre().contains(itemAniadir.getNombre())) {
                item.setCantidad(item.getCantidad()+1);
                item.setPrecio(item.getPrecio()*item.getCantidad());
            }
        }
    }
    
        public Item obtenerDatosItem(String nombreItem) {
        for (Item item : listaItems) {
            if (item.getNombre().contains(nombreItem)) {
                return item;
            }
        }
        return null;
    }
   
    
    
    public void obtenerItemsFichero(){
        try {
            //REGEX: String nombre, String tipo,int cantidad, String icono, double precio)
            FileReader fr = new FileReader(new File("listado-items.txt"));
            BufferedReader br = new BufferedReader(fr);
            String[] detallesItem = new String[4];
            Item item = new Item("", "", 0, "", 0);
            String linea;
            while ((linea = br.readLine()) != null) { 
                detallesItem = linea.split(":");
                item.setNombre(detallesItem[0]);
                item.setTipo(detallesItem[1]);
                item.setCantidad(Integer.parseInt(detallesItem[2]));
                item.setIcono(detallesItem[3]);
                item.setPrecio(Double.parseDouble(detallesItem[4]));
                this.listaItems.add(item);
                item = new Item("", "", 0, "", 0);
            }
                       
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } catch (ArrayIndexOutOfBoundsException e) {
        }
       
        
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

    public void setListaItems(List<Item> listaItems) {
        this.listaItems = listaItems;
    }

}
