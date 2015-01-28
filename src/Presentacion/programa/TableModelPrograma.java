package Presentacion.programa;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import Negocio.programa.TransferPrograma;
import Negocio.programa.TransferProgramaAlquiler;
import Negocio.programa.TransferProgramaPago;

public class TableModelPrograma extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<TransferPrograma> content; //para mantener una copia de la memoria

	String[] columnNames = { "ID", "Nombre", "Precio"};

	public TableModelPrograma() {
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
		TransferPrograma programa = content.get(rowIndex);
        Object value = programa.getID();//SIEMPRE DEVOLVEMOS EL CAMPO DE ID
        switch (columnIndex) {
            case 0:
                value = programa.getID();
                break;
            case 1:
                value = programa.getNombre();
                break;
            case 2:
            	if(TransferProgramaPago.class.equals(programa.getClass())) {
            		value = ((TransferProgramaPago)programa).getPrecioFinal();
            	} else {
            		value = ((TransferProgramaAlquiler)programa).getPrecioHora();
            	}
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
	
	public void modify(TransferPrograma datos){
		for(int i=0; i < content.size(); i++){
			if(content.get(i).getID().equals(datos.getID()))
				content.set(i, datos);
		}
		
		fireTableDataChanged();
	}
}