package Presentacion.plataforma;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import Negocio.programa.TransferPrograma;

public class TableModelProgramaPlataforma extends AbstractTableModel {
	private ArrayList<TransferPrograma> content; //para mantener una copia de la memoria

	String[] columnNames = { "Nombre", "Version", "Requisitos"};

	public TableModelProgramaPlataforma() {
		content = new ArrayList<TransferPrograma>();
	}

	public int getRowCount() {
		return content.size();
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		TransferPrograma juego = content.get(rowIndex);
        Object value = juego.getID();//SIEMPRE DEVOLVEMOS EL CAMPO DE ID
        switch (columnIndex) {
            case 0:
                value = juego.getNombre();
                break;
            case 1:
                value = juego.getVersion();
                break;
            case 2:
                value = juego.getRequisitos();
                break;
        }
        return value;
	}

	public boolean isCellEditable(int fila, int col) {
		return false;
	}
	/** Modifica la posicion de index (en content) para que tenga el valor nuevo y 
	 * avisa al JTable que el modelo ha sido modificado */
	public void setValue(ArrayList<TransferPrograma> value){
		this.content = value;

		fireTableDataChanged();
	}
	/**Borra todos los elementos de content y avisa al JTable que el modelo ha sido modificado*/
	public void reset() {      
		content.clear();
		fireTableDataChanged();
	}
	
	
	public TransferPrograma getItem(int rowIndex) {
		return content.get(rowIndex);
	}

	public void removeRow(TransferPrograma datos) {
		content.remove(datos);
		fireTableDataChanged();
		
	}

	public void setValue(TransferPrograma datos) {
		content.add(datos);
		fireTableDataChanged();
	}
}
