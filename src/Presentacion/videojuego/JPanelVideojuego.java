package Presentacion.videojuego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import Negocio.biblioteca.TransferBiblioteca;
import Negocio.videojuego.TransferVideojuego;
import Presentacion.biblioteca.JDialogAñadirVideojuegoBiblioteca;
import Presentacion.biblioteca.JDialogCrearBiblioteca;
import Presentacion.biblioteca.JDialogEliminarBiblioteca;
import Presentacion.biblioteca.JDialogEliminarVideojuegoBiblioteca;
import Presentacion.biblioteca.JDialogModificarBiblioteca;
import Presentacion.biblioteca.JDialogMostrarBiblioteca;
import Presentacion.biblioteca.JPanelBiblioteca;
import Presentacion.biblioteca.JPanelBiblioteca.TableModelBiblioteca;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JPanelVideojuego extends JPanel{

	public static TableModelVideojuego model;
	private static JTable jTableVideojuego;
	private JButton jButtonCrearVideojuego;
	private JButton jButtonModificarVideojuego;
	private JButton jButtonMostrarVideojuego;
	private JButton jButtonEliminarVideojuego;
	private JScrollPane jScrollPaneVideojuego;
	private JDialogCrearVideojuego jDialogCrearVideojuego;
	private JDialogModificarVideojuego jDialogModificarVideojuego;
	private JDialogMostrarVideojuego jDialogMostrarVideojuego;
	private JDialogEliminarVideojuego jDialogEliminarVideojuego;
	
	public JPanelVideojuego(){
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
	    jTableVideojuego = new javax.swing.JTable();
	    jButtonCrearVideojuego = new javax.swing.JButton();
	    jButtonModificarVideojuego = new javax.swing.JButton();
	    jButtonMostrarVideojuego = new javax.swing.JButton();
	    jButtonEliminarVideojuego = new javax.swing.JButton();
	    jScrollPaneVideojuego = new javax.swing.JScrollPane();
	    
	    model = new TableModelVideojuego();
        jTableVideojuego.setModel(model);
        ArrayList<TransferVideojuego> content = new ArrayList<TransferVideojuego>();
        ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_TODOS_VIDEOJUEGOS, content);
        
        
        
        jScrollPaneVideojuego.setViewportView(jTableVideojuego);
        jButtonCrearVideojuego.setText("Crear Videojuego");

        jButtonModificarVideojuego.setText("Modificar Videojuego");

        jButtonEliminarVideojuego.setText("Eliminar Videojuego");

        jButtonMostrarVideojuego.setText("Mostrar Videojuego");
        
        jButtonEliminarVideojuego.setText("Eliminar Videojuego");
	    
	    
            javax.swing.GroupLayout jPanelVideojuegoLayout = new javax.swing.GroupLayout(this);
            this.setLayout(jPanelVideojuegoLayout);
            jPanelVideojuegoLayout.setHorizontalGroup(
                jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonModificarVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCrearVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMostrarVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                    .addComponent(jScrollPaneVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanelVideojuegoLayout.setVerticalGroup(
                jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                    .addGroup(jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jButtonCrearVideojuego)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonModificarVideojuego)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonMostrarVideojuego)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonEliminarVideojuego))
                        .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPaneVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(91, Short.MAX_VALUE))
            );
	    
            jButtonCrearVideojuego.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				// TODO Auto-generated method stub
    				jDialogCrearVideojuego  = new JDialogCrearVideojuego();
    			}
              });
               
               jButtonEliminarVideojuego.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				if(validar()){
    				jDialogEliminarVideojuego  = new JDialogEliminarVideojuego();
    				}
    			}
              });
               
               jButtonModificarVideojuego.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				if(validar()) {
    					jDialogModificarVideojuego = new JDialogModificarVideojuego();
    				}
    			}
              });
               
               jButtonMostrarVideojuego.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				// TODO Auto-generated method stub
    				if(validar()){
    				jDialogMostrarVideojuego = new JDialogMostrarVideojuego();
    				}
    			}
              });               
             
	}
	
	public class TableModelVideojuego extends AbstractTableModel {
		private ArrayList<TransferVideojuego> content; //para mantener una copia de la memoria

		String[] columnNames = { "Nombre", "Categoria"};

		public TableModelVideojuego() {
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
			TransferVideojuego juego = content.get(rowIndex);
	        Object value = juego.getID();//SIEMPRE DEVOLVEMOS EL CAMPO DE ID
	        switch (columnIndex) {
	            case 0:
	                value = juego.getID();
	                break;
	            case 1:
	                value = juego.getNombre();
	                break;
	        }
	        return value;
		}

		public boolean isCellEditable(int fila, int col) {
			return false;
		}
		/** Modifica la posicion de index (en content) para que tenga el valor nuevo y 
		 * avisa al JTable que el modelo ha sido modificado */
		public void setValue(ArrayList<TransferVideojuego> value){
			this.content = value;

			fireTableDataChanged();
		}
		/**Borra todos los elementos de content y avisa al JTable que el modelo ha sido modificado*/
		public void reset() {      
			content.clear();
			fireTableDataChanged();
		}
		
		
		public TransferVideojuego getItem(int rowIndex) {
			return content.get(rowIndex);
		}

		public void removeRow(TransferVideojuego datos) {
			content.remove(datos);
			fireTableDataChanged();
			
		}

		public void setValue(TransferVideojuego datos) {
			content.add(datos);
			fireTableDataChanged();
		}
	}
	
	public static TableModelVideojuego getTableModel(){
		return model;
	}

	public static JTable getTableVideojuego() {
		return jTableVideojuego;
	}

	public static TableModelVideojuego getModelo() {
		return model;
	}
	
	public boolean validar(){
		boolean ret=false;
			if(JPanelVideojuego.getTableVideojuego().getSelectedRow() == -1)
				JOptionPane.showMessageDialog(null, "No ha seleccionado ningun videojuego");
			else
				ret =true;
		
		return ret;
	}
}
