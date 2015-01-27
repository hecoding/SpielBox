/**
 * 
 */
package Presentacion.plataforma;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import Negocio.plataforma.TransferPlataforma;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TableModelPlataforma extends AbstractTableModel {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<TransferPlataforma> content;


	String[] columnNames = { "ID", "Tipo"};

	public TableModelPlataforma() {
		content = new ArrayList<TransferPlataforma>();
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
		TransferPlataforma plataforma = content.get(rowIndex);
        Object value = plataforma.getID();//SIEMPRE DEVOLVEMOS EL CAMPO DE ID
        switch (columnIndex) {
            case 0:
                value = plataforma.getID();
                break;
            case 1:
                value = plataforma.getTipo();
                break;
        }
        return value;
	}

	public boolean isCellEditable(int fila, int col) {
		return false;
	}
	/** Modifica la posicion de index (en content) para que tenga el valor nuevo y 
	 * avisa al JTable que el modelo ha sido modificado */
	public void setValue(ArrayList<TransferPlataforma> value){
		this.content = value;

		fireTableDataChanged();
	}
	/**Borra todos los elementos de content y avisa al JTable que el modelo ha sido modificado*/
	public void reset() {      
		content.clear();
		fireTableDataChanged();
	}
	
	
	public TransferPlataforma getItem(int rowIndex) {
		return content.get(rowIndex);
	}

	public void removeRow(TransferPlataforma datos) {
		content.remove(datos);
		fireTableDataChanged();
		
	}

	public void setValue(TransferPlataforma datos) {
		content.add(datos);
		
		fireTableDataChanged();
	}
	public void modify(TransferPlataforma datos){
		
		for(int i=0; i < content.size(); i++){
			if(content.get(i).getID().equals(datos.getID()))
				content.set(i, datos);
		}
		fireTableDataChanged();
	}

}