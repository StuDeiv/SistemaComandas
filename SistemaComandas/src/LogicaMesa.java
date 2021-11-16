
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
public class LogicaMesa {

    private List<Mesa> listaMesas;
    private VentanaPrincipal ventanaPrincipal;

    public LogicaMesa(VentanaPrincipal ventanaPrincipal) {
        this.listaMesas = new ArrayList<>();
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public void aniadirMesa(Mesa mesa) {
        //Comprobamos antes que no existe esa mesa

        if (comprobarExisteMesa(mesa)) {
            JOptionPane.showMessageDialog(ventanaPrincipal, "Esta mesa ya existe", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            listaMesas.add(mesa);
            JOptionPane.showMessageDialog(ventanaPrincipal, "Se ha añadido correctamente la mesa");
        }

    }

    public List<Mesa> getListaMesas() {
        return listaMesas;
    }

    public boolean comprobarExisteMesa(Mesa mesa) {
        for (Mesa listaMesa : listaMesas) {
            if (listaMesa.getNumMesa() == mesa.getNumMesa()) {
                return true;
            }
        }
        return false;
    }

}
