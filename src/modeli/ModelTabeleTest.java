/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Test;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mina
 */
public class ModelTabeleTest extends AbstractTableModel{

    private List<Test> lista;
    private String[] kolone;

    public ModelTabeleTest(List<Test> lista) {
        this.lista = lista;        
        this.kolone = new String[]{"datum", "rezultat", "tip", "status"};
    }    
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Test t = lista.get(rowIndex);
        switch(columnIndex){
            case 0: return kontroler.Kontroler.getInstance().formatDatum(t.getDatum());
            case 1: return t.isPozitivan() ? "pozitivan" : "negativan";
            case 2: return t.getTip().toString();
            case 3: return t.getStatus().toString();
            default: return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    public void refresh(List<Test> lista){
        this.lista = lista;
        fireTableDataChanged();
    }
    
    
}
