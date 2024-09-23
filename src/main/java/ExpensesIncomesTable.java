/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tymurnabokov
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;



public class ExpensesIncomesTable extends AbstractTableModel{
    private final List<ExpensesIncomesEntry>entries;
    private final String[] columnNames ={"Date", "Description", "Amount", "Type"};
    public ExpensesIncomesTable(){
        entries = new ArrayList<>();
    }


public void addEntry(ExpensesIncomesEntry entry){
    entries.add(entry);
    fireTableRowsInserted(entries.size()-1, entries.size()-1);
}

    @Override
    public int getRowCount() {
        return entries.size();
    }
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    @Override
    public String getColumnName(int column) {
        return columnNames[column] ;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ExpensesIncomesEntry entry = entries.get(rowIndex);
        switch(columnIndex){
            case 0:
            return entry.getDate();
            case 1:
            return entry.getDescription();
            case 2:
            return entry.getAmount();
            case 3:
            return entry.getType();
            default:
            return null;
        }
    }
}

