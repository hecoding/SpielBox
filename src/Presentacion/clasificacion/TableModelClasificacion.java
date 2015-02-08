/**
 * 
 */
package Presentacion.clasificacion;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import Negocio.clasificacion.TransferClasificacion;
import Negocio.plataforma.TransferPlataforma;

public class TableModelClasificacion extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<TransferClasificacion> content; //para mantener una copia de la memoria

	String[] columnNames = { "ID", "Dificultad"};

	public TableModelClasificacion() {
		content = new ArrayList<TransferClasificacion>();
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
		TransferClasificacion clasificacion = content.get(rowIndex);
        Object value = clasificacion.getID();//SIEMPRE DEVOLVEMOS EL CAMPO DE ID
        switch (columnIndex) {
            case 0:
            	value = clasificacion.getID();
            break;
            case 1:
            	value = clasificacion.getDificultad();
            break;
        }
        return value;
	}

	public boolean isCellEditable(int fila, int col) {
		return false;
	}
	/** Modifica la posicion de index (en content) para que tenga el valor nuevo y 
	 * avisa al JTable que el modelo ha sido modificado */
	public void setValue(ArrayList<TransferClasificacion> value){
		this.content = value;

		fireTableDataChanged();
	}
	/**Borra todos los elementos de content y avisa al JTable que el modelo ha sido modificado*/
	public void reset() {      
		content.clear();
		fireTableDataChanged();
	}
	
	
	public TransferClasificacion getItem(int rowIndex) {
		return content.get(rowIndex);
	}

	public void removeRow(TransferClasificacion datos) {
		content.remove(datos);
		fireTableDataChanged();
		
	}

	public void setValue(TransferClasificacion datos) {
		content.add(datos);
		fireTableDataChanged();
	}
	
	public void modify(TransferClasificacion datos){
		for(int i=0; i < content.size(); i++){
			if(content.get(i).getID().equals(datos.getID()))
				content.set(i, datos);
		}
		
		fireTableDataChanged();
	}
}