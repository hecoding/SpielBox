package Presentacion.programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import Negocio.programa.TransferPrograma;
import Presentacion.programa.JDialogCrearPrograma;
import Presentacion.programa.JDialogEliminarPrograma;
import Presentacion.programa.JDialogModificarPrograma;
import Presentacion.programa.JDialogMostrarPrograma;
import Presentacion.programa.JPanelPrograma;
import Presentacion.programa.JPanelPrograma.TableModelPrograma;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JPanelPrograma extends JPanel {
	private static final long serialVersionUID = 1L;
	private static TableModelPrograma model;
	private static JTable jTablePrograma;
	private JButton jButtonCrearPrograma;
	private JButton jButtonModificarPrograma;
	private JButton jButtonMostrarPrograma;
	private JButton jButtonEliminarPrograma;
	private JScrollPane jScrollPanePrograma;
	private JDialogCrearPrograma jDialogCrearPrograma;
	private JDialogModificarPrograma jDialogModificarPrograma;
	private JDialogMostrarPrograma jDialogMostrarPrograma;
	private JDialogEliminarPrograma jDialogEliminarPrograma;
	
	public JPanelPrograma(){
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
	    jTablePrograma = new javax.swing.JTable();
	    jButtonCrearPrograma = new javax.swing.JButton();
	    jButtonModificarPrograma = new javax.swing.JButton();
	    jButtonMostrarPrograma = new javax.swing.JButton();
	    jButtonEliminarPrograma = new javax.swing.JButton();
	    jScrollPanePrograma = new javax.swing.JScrollPane();
	    
	    model = new TableModelPrograma();
        jTablePrograma.setModel(model);
        ArrayList<TransferPrograma> content = new ArrayList<TransferPrograma>();
        ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_TODOS_VIDEOJUEGOS, content);        
        
        jScrollPanePrograma.setViewportView(jTablePrograma);
        
        jButtonCrearPrograma.setText("Crear Programa");

        jButtonModificarPrograma.setText("Modificar Programa");

        jButtonEliminarPrograma.setText("Eliminar Programa");

        jButtonMostrarPrograma.setText("Mostrar Programa");
        
        jButtonEliminarPrograma.setText("Eliminar Programa");
	    
	    
            javax.swing.GroupLayout jPanelVideojuegoLayout = new javax.swing.GroupLayout(this);
            this.setLayout(jPanelVideojuegoLayout);
            jPanelVideojuegoLayout.setHorizontalGroup(
                jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonModificarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCrearPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMostrarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                    .addComponent(jScrollPanePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanelVideojuegoLayout.setVerticalGroup(
                jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                    .addGroup(jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jButtonCrearPrograma)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonModificarPrograma)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonMostrarPrograma)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonEliminarPrograma))
                        .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPanePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(91, Short.MAX_VALUE))
            );
	    
            jButtonCrearPrograma.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				// TODO Auto-generated method stub
    				jDialogCrearPrograma  = new JDialogCrearPrograma();
    			}
              });
               
               jButtonEliminarPrograma.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				if(validar()){
    					jDialogEliminarPrograma  = new JDialogEliminarPrograma();
    				}
    			}
              });
               
               jButtonModificarPrograma.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				if(validar()) {
    					jDialogModificarPrograma = new JDialogModificarPrograma();
    				}
    			}
              });
               
               jButtonMostrarPrograma.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				// TODO Auto-generated method stub
    				if(validar()){
    				jDialogMostrarPrograma = new JDialogMostrarPrograma();
    				}
    			}
              });               
             
	}
	
	public class TableModelPrograma extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private ArrayList<TransferPrograma> content; //para mantener una copia de la memoria

		String[] columnNames = { "Nombre", "Precio"};

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
	            	value = programa.getPrecio();
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
	
	public static TableModelPrograma getTableModel(){
		return model;
	}

	public static JTable getTablePrograma() {
		return jTablePrograma;
	}

	public static TableModelPrograma getModelo() {
		return model;
	}
	
	public boolean validar(){
		boolean ret=false;
			if(JPanelPrograma.getTablePrograma().getSelectedRow() == -1)
				JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna Programa");
			else
				ret =true;
		
		return ret;
	}
}
