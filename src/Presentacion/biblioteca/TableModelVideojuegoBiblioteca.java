package Presentacion.biblioteca;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import Negocio.videojuego.TransferVideojuego;
//TIENE TODOS LOS VIDEOJUEGOS DE UNA BIBLIOTECA
public class TableModelVideojuegoBiblioteca extends AbstractTableModel {
		private ArrayList<TransferVideojuego> content; //para mantener una copia de la memoria

		String[] columnNames = { "Nombre", "Categoria"};

		public TableModelVideojuegoBiblioteca() {
			content = new ArrayList<TransferVideojuego>(); 
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
			TransferVideojuego biblio = content.get(rowIndex);
	        Object value = null;//SIEMPRE DEVOLVEMOS EL CAMPO DE ID
	        switch (columnIndex) {
	            case 0:
	                value = biblio.getNombre();
	                break;
	            case 1:
	                value = biblio.getCategoria();
	                break;
	        }
	        return value;
		}
		
		public TransferVideojuego getItem(int rowIndex){
			return content.get(rowIndex);
		}

		public boolean isCellEditable(int fila, int col) {
			return false;
		}
		/** Modifica la posicion de index (en content) para que tenga el valor nuevo y 
		 * avisa al JTable que el modelo ha sido modificado */
		public void setValue(ArrayList<TransferVideojuego> value){
			this.content =value;
			fireTableDataChanged();
		}
		/**Borra todos los elementos de content y avisa al JTable que el modelo ha sido modificado*/
		public void reset() {      
			content.clear();
			fireTableDataChanged();
		}
		public void removeRow(TransferVideojuego del){
			content.remove(del);
			fireTableDataChanged();
		}

		public void setValue(TransferVideojuego datos) {
			// TODO Auto-generated method stub
			content.add(datos);
			fireTableDataChanged();
		}

	
	}