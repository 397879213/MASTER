/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel.Administration;

import BO.Administration.BOOPDConsultant;
import BO.Administration.BOpatientUpdateHistory;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sibtain
 */
public class patientUpdateHistoryTableModel extends AbstractTableModel {

    private final String[] columnNames = 
                {"Sr.","Name","Contact No","DOB","Client","Updtd By","Updtd Date","Updtd Termi."};

    private Object[][] data;

    public patientUpdateHistoryTableModel(List<BOpatientUpdateHistory> li) {
        data = new Object[li.size()][columnNames.length];
        for (int i = 0; i < li.size(); i++) {
            BOpatientUpdateHistory dS = li.get(i);
            data[i][0] = (i+1);
            data[i][1] = dS.getFullName();
            data[i][2] = dS.getContactNo();
            data[i][3] = dS.getDOB();
            data[i][4] = dS.getClientName();
            data[i][5] = dS.getUserName();
            data[i][6] = dS.getUpdtDate();
            data[i][7] = dS.getUpdtTerminal();
            
        }
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    /*
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  If we didn't implement this method,
     * then the last column would contain text ("true"/"false"),
     * rather than a check box.
     */
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        return false;
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    private boolean DEBUG = false;

    public void setValueAt(Object value, int row, int col) {
        if (DEBUG) {
            System.out.println("Setting value at " + row + "," + col
                    + " to " + value
                    + " (an instance of "
                    + value.getClass() + ")");
        }

        data[row][col] = value;
        fireTableCellUpdated(row, col);

        if (DEBUG) {
            System.out.println("New value of data:");
            printDebugData();
        }
    }

    private void printDebugData() {
        int numRows = getRowCount();
        int numCols = getColumnCount();

        for (int i = 0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j = 0; j < numCols; j++) {
                System.out.print("  " + data[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
}
