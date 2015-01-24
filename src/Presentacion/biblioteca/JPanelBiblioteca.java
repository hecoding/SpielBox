package Presentacion.biblioteca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.TreeMap;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import Negocio.biblioteca.TransferBiblioteca;
import Negocio.usuario.TransferUsuario;
import Negocio.videojuego.TransferVideojuego;

public class JPanelBiblioteca extends JPanel{

	private JScrollPane jScrollPaneBiblioteca;
	private static JTable jTableBiblioteca;
	private static TableModelBiblioteca modeloBiblioteca;
	private static TableModelVideojuegoBiblioteca modeloVideojuegoBiblioteca;
	
	private static JComboBox jComboBoxUsuarios;
	private JButton jButtonCrearBibliotecaUsuario;
	private JButton jButtonModificarBibliotecaUsuario;
	private JButton jButtonEliminarBibliotecaUsuario;
	private JButton jButtonMostrarBibliotecaUsuario;
	private JButton jButtonAñadirVideojuegoBiblioteca;
	private JButton jButtonEliminarVideojuegoBiblioteca;
	private JButton jButtonQueryBiblioteca;
	private JLabel labelUsuarios;
	private JDialogCrearBiblioteca jdialogCrearBiblioteca;
	private JDialogModificarBiblioteca jdialogModificarBiblioteca;
	private JDialogEliminarBiblioteca jdialogEliminarrBiblioteca;
	private JDialogMostrarBiblioteca jdialogMostrarBiblioteca;
	private JDialogAñadirVideojuegoBiblioteca jdialogAñadirVideojuegoBiblioteca;
	private JDialogEliminarVideojuegoBiblioteca jdialogEliminarVideojuegoBiblioteca;
	private JDialogQueryBiblioteca jdialogQueryBiblioteca;

	public JPanelBiblioteca(){
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
        jScrollPaneBiblioteca = new javax.swing.JScrollPane();
        jTableBiblioteca = new javax.swing.JTable();
        jComboBoxUsuarios = new javax.swing.JComboBox();
        
        jButtonCrearBibliotecaUsuario = new javax.swing.JButton();
        jButtonModificarBibliotecaUsuario = new javax.swing.JButton();
        jButtonEliminarBibliotecaUsuario = new javax.swing.JButton();
        jButtonMostrarBibliotecaUsuario = new javax.swing.JButton();
        jButtonAñadirVideojuegoBiblioteca = new javax.swing.JButton();
        jButtonEliminarVideojuegoBiblioteca = new javax.swing.JButton();
        jButtonQueryBiblioteca = new JButton();
        
        labelUsuarios = new javax.swing.JLabel();
        modeloBiblioteca = new TableModelBiblioteca();
        modeloVideojuegoBiblioteca = new TableModelVideojuegoBiblioteca();
        jTableBiblioteca.setModel(modeloBiblioteca);
        
            jScrollPaneBiblioteca.setViewportView(jTableBiblioteca);

            //jComboBoxUsuarios.setModel(new javax.swing.DefaultComboBoxModel( { "-- Seleccionar --", "Usuario 2", "Usuario 3", "Usuario 4" }));
            
            
            
            
            
            jButtonCrearBibliotecaUsuario.setText("Crear Biblioteca a usuario");

            jButtonModificarBibliotecaUsuario.setText("Modificar Biblioteca de usuario");

            jButtonEliminarBibliotecaUsuario.setText("Eliminar Biblioteca de usuario");

            jButtonMostrarBibliotecaUsuario.setText("Mostrar Biblioteca de usuario");

            jButtonAñadirVideojuegoBiblioteca.setText("Añadir Videojuego a Biblioteca");
            
            jButtonEliminarVideojuegoBiblioteca.setText("Eliminar Videojuego de Biblioteca");
            
            jButtonQueryBiblioteca.setText("Buscar Bibliotecas con N videojuegos");
            
            labelUsuarios.setText("Usuarios:");

            javax.swing.GroupLayout jPanelBibliotecasLayout = new javax.swing.GroupLayout(this);
            this.setLayout(jPanelBibliotecasLayout);
            jPanelBibliotecasLayout.setHorizontalGroup(
                jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBibliotecasLayout.createSequentialGroup()
                    .addGroup(jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                            .addGroup(jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(jComboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(labelUsuarios)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                            .addGap(0, 27, Short.MAX_VALUE)
                            .addGroup(jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonMostrarBibliotecaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAñadirVideojuegoBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEliminarVideojuegoBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonQueryBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonEliminarBibliotecaUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCrearBibliotecaUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonModificarBibliotecaUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonQueryBiblioteca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(46, 46, 46)))
                    .addComponent(jScrollPaneBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanelBibliotecasLayout.setVerticalGroup(
                jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                    .addGroup(jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPaneBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(labelUsuarios)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)
                            .addComponent(jButtonCrearBibliotecaUsuario)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonModificarBibliotecaUsuario)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonEliminarBibliotecaUsuario)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonMostrarBibliotecaUsuario)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonAñadirVideojuegoBiblioteca)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonEliminarVideojuegoBiblioteca)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonQueryBiblioteca)))
                    .addContainerGap(66, Short.MAX_VALUE))
            );
           
           ///////////////////////ACTION LISTENER /////////////////////////////////////
           jButtonCrearBibliotecaUsuario.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(jComboBoxUsuarios.getSelectedIndex() == -1 || jComboBoxUsuarios.getSelectedIndex() == 0)
					JOptionPane.showMessageDialog(null, "No ha seleccionado ningun usuario");
				else
					jdialogCrearBiblioteca = new JDialogCrearBiblioteca();
			}
          });
           jButtonEliminarBibliotecaUsuario.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(validar())
					jdialogEliminarrBiblioteca = new JDialogEliminarBiblioteca();					
				
			}
          });
           
           jButtonModificarBibliotecaUsuario.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(validar())
					jdialogModificarBiblioteca = new JDialogModificarBiblioteca();
			}
          });
           
           jButtonMostrarBibliotecaUsuario.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(validar())
					jdialogMostrarBiblioteca = new JDialogMostrarBiblioteca();
			}
          });
           
           jButtonAñadirVideojuegoBiblioteca.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(validar())
					jdialogAñadirVideojuegoBiblioteca = new JDialogAñadirVideojuegoBiblioteca();
			}
          });
            
           jButtonEliminarVideojuegoBiblioteca.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(validar())
					jdialogEliminarVideojuegoBiblioteca = new JDialogEliminarVideojuegoBiblioteca();
			}
          });
           
           jButtonQueryBiblioteca.addActionListener(new ActionListener() {			
   			@Override
   			public void actionPerformed(ActionEvent arg0) {
   				// TODO Auto-generated method stub
   				jdialogQueryBiblioteca = new JDialogQueryBiblioteca();
   				}
             });
           
           
           jComboBoxUsuarios.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object selection = jComboBoxUsuarios.getSelectedItem();
				JOptionPane.showMessageDialog(jComboBoxUsuarios,selection);
			}
		});
         ////////////////////////////////////////////////////////////////////////////////////   
            
	}
	
	//MODELO  
	public class TableModelBiblioteca extends AbstractTableModel {
		private ArrayList<TransferBiblioteca> content; //para mantener una copia de la memoria

		String[] columnNames = { "ID", "Nombre"};

		public TableModelBiblioteca() {
			content = new ArrayList<TransferBiblioteca>(); 
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
			TransferBiblioteca biblio = content.get(rowIndex);
	        Object value = biblio.getID();//SIEMPRE DEVOLVEMOS EL CAMPO DE ID
	        switch (columnIndex) {
	            case 0:
	                value = biblio.getID();
	                break;
	            case 1:
	                value = biblio.getNombre();
	                break;
	        }
	        return value;
		}
		
		public TransferBiblioteca getItem(int rowIndex){
			return content.get(rowIndex);
		}

		public boolean isCellEditable(int fila, int col) {
			return false;
		}
		/** Modifica la posicion de index (en content) para que tenga el valor nuevo y 
		 * avisa al JTable que el modelo ha sido modificado */
		public void setValue(ArrayList<TransferBiblioteca> value){
			this.content =value;
			fireTableDataChanged();
		}
		/**Borra todos los elementos de content y avisa al JTable que el modelo ha sido modificado*/
		public void reset() {      
			content.clear();
			fireTableDataChanged();
		}
		public void removeRow(TransferBiblioteca modBiblioteca){
			content.remove(modBiblioteca);
			fireTableDataChanged();
		}

		public void setValue(TransferBiblioteca datos) {
			// TODO Auto-generated method stub
		
			content.add(datos);
			fireTableDataChanged();
		}

	
	}
	
	public static JTable getTableBiblioteca(){
		return jTableBiblioteca;
	}
	public static TableModelBiblioteca getModelo(){
		return modeloBiblioteca;
	}
	public static TableModelVideojuegoBiblioteca getModeloVideojuegoBiblioteca(){
		return modeloVideojuegoBiblioteca;
	}
	
	public static Object getSeleccionUsuarios(){
		return jComboBoxUsuarios.getSelectedItem();
	}
	public boolean validar(){
		boolean ret=false;
		if(jComboBoxUsuarios.getSelectedIndex() == -1 || jComboBoxUsuarios.getSelectedIndex() == 0)
			JOptionPane.showMessageDialog(null, "No ha seleccionado ningun usuario");
		else
			if(JPanelBiblioteca.getTableBiblioteca().getSelectedRow() == -1)
				JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna biblioteca");
			else
				ret =true;
		
		return ret;
	}
	
}
