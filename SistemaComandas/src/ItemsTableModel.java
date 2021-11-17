
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proye
 */
public class ItemsTableModel extends AbstractTableModel {
    
    private List<Item> listaItems;

    public ItemsTableModel(List<Item> listaItems) {
        this.listaItems = listaItems;
    }

    @Override
    public int getRowCount() {
        return listaItems.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
/*FALTA CONFIGURAR
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaMesas.get(rowIndex).getNumMesa();
        }
        return null;
    }
*/

    @Override
    public String getColumnName(int i) {
        return "Número de mesa";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
