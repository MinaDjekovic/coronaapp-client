/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Korisnik;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mina
 */
public class ModelTabeleKorisnik extends AbstractTableModel{

    private List<Korisnik> lista;
    private final String[] kolone;

    public ModelTabeleKorisnik(List<Korisnik> lista) {
        this.lista = lista;
        this.kolone = new String[] {"ime", "prezime", "email", "stanje"};
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
        Korisnik k = lista.get(rowIndex);
        switch(columnIndex){
            case 0: return k.getIme();
            case 1: return k.getPrezime();
            case 2: return k.getEmail();
            case 3: return k.getStanje().toString();
            default: return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    public void refresh(List<Korisnik> lista){
        this.lista = lista;
        fireTableDataChanged();
    }   
    
    
    
}
