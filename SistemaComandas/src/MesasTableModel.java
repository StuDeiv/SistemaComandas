
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsantosc04
 */
public class MesasTableModel extends AbstractTableModel {

    private List<Mesa> listaMesas;

    public MesasTableModel(List<Mesa> listaMesas) {
        this.listaMesas = listaMesas;
    }

    @Override
    public int getRowCount() {
        return listaMesas.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaMesas.get(rowIndex).getNumMesa();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int i) {
        return "Número de mesa";
    }

}
