
import java.util.ArrayList;
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
    private final String[] columnas = {"Item", "Precio", "Cantidad"};

    public ItemsTableModel(List<Item> listaItems) {
        this.listaItems = listaItems;
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

    public void setListaItems(List<Item> listaItems) {
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

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaItems.get(rowIndex).getNombre();
            case 1:
                return listaItems.get(rowIndex).getPrecio();
            case 2:
                return listaItems.get(rowIndex).getCantidad();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    public void add(Item item) {
        listaItems.add(item);
        fireTableRowsInserted(listaItems.size() - 1, listaItems.size() - 1);
    }

    public void remove(Item item) {
        int row = listaItems.indexOf(item);
        if (row >= 0) {
            listaItems.remove(item);
            fireTableRowsDeleted(row, row);
        }
    }

    public void update(Item item) {
        int row = listaItems.indexOf(item);
        if (row >= 0) {
            fireTableRowsUpdated(row, row);
        }
    }

    public void removeRow(int row) {
        // remove a row from your internal data structure
        fireTableRowsDeleted(row, row);
    }
}
