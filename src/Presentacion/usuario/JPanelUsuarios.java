package Presentacion.usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import Negocio.usuario.TransferUsuario;
import Negocio.videojuego.TransferVideojuego;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;
import Presentacion.usuario.JDialogCrearUsuario;
import Presentacion.usuario.JDialogEliminarUsuario;
import Presentacion.usuario.JDialogModificarUsuario;
import Presentacion.usuario.JDialogMostrarUsuario;

public class JPanelUsuarios extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static TableModelUsuario model;
	private static JTable jTableUsuario;
	private JButton jButtonCrearUsuario;
	private JButton jButtonModificarUsuario;
	private JButton jButtonMostrarUsuario;
	private JButton jButtonEliminarUsuario;
	private JButton jButtonBuscarDesarrolladores;
	private JScrollPane jScrollPaneUsuario;
	public JPanelUsuarios(){
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
	    jTableUsuario = new javax.swing.JTable();
	    jButtonCrearUsuario = new javax.swing.JButton();
	    jButtonModificarUsuario = new javax.swing.JButton();
	    jButtonMostrarUsuario = new javax.swing.JButton();
	    jButtonEliminarUsuario = new javax.swing.JButton();
	    jButtonBuscarDesarrolladores = new javax.swing.JButton();
	    jScrollPaneUsuario = new javax.swing.JScrollPane();
	    
	    model = new TableModelUsuario();
        jTableUsuario.setModel(model);
        ArrayList<TransferVideojuego> content = new ArrayList<TransferVideojuego>();
        ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_TODOS_USUARIOS, content);
        
        jScrollPaneUsuario.setViewportView(jTableUsuario);
        jButtonCrearUsuario.setText("Crear Usuario");

        jButtonModificarUsuario.setText("Modificar Usuario");

        jButtonEliminarUsuario.setText("Eliminar Usuario");

        jButtonMostrarUsuario.setText("Mostrar Usuario");
        
        jButtonEliminarUsuario.setText("Eliminar Usuario");
	    
        // Botón Desarrolladores
        jButtonBuscarDesarrolladores.setText("Buscar Desarrollador");
        this.add(jButtonBuscarDesarrolladores);
        jButtonBuscarDesarrolladores.setVisible(true);
        //
	    
            javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(this);
            this.setLayout(jPanelUsuarioLayout);
            jPanelUsuarioLayout.setHorizontalGroup(
                jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscarDesarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                    .addComponent(jScrollPaneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanelUsuarioLayout.setVerticalGroup(
                jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                    .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jButtonCrearUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonModificarUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonMostrarUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonEliminarUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonBuscarDesarrolladores))
                        .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPaneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(91, Short.MAX_VALUE))
            );
	    
            jButtonCrearUsuario.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				new JDialogCrearUsuario();
    			}
              });
               
               jButtonEliminarUsuario.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				if(validar()) {
    					new JDialogEliminarUsuario();
    				}
    			}
              });
               
               jButtonModificarUsuario.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				if(validar()) {
    					new JDialogModificarUsuario();
    				}
    			}
              });
               
               jButtonMostrarUsuario.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				if(validar()) {
    					new JDialogMostrarUsuario();
    				}
    			}
              });
               jButtonBuscarDesarrolladores.addActionListener(new ActionListener() {			
       			@Override
       			public void actionPerformed(ActionEvent arg0) {
       				new JDialogBuscarDesarrolladores();
       			}
                 }); 
             
	}
	
	public class TableModelUsuario extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private ArrayList<TransferUsuario> content; //para mantener una copia de la memoria

		String[] columnNames = { "Nombre", "Email", "Nick"};

		public TableModelUsuario() {
			content = new ArrayList<TransferUsuario>(); 
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

			TransferUsuario usuario = content.get(rowIndex);
	        Object value = usuario.getID();//SIEMPRE DEVOLVEMOS EL CAMPO DE ID
	        switch (columnIndex) {
	            case 0:
	                value = usuario.getNombre();
	                break;
	            case 1:
	                value = usuario.getEmail();
	                break;
	            case 2:
	            	value = usuario.getNick();
	            	break;
	        }
	        return value;
		}
		
		public TransferUsuario getItem(int rowIndex){
			return content.get(rowIndex);
		}

		public boolean isCellEditable(int fila, int col) {
			return false;
		}
		/** Modifica la posicion de index (en content) para que tenga el valor nuevo y 
		 * avisa al JTable que el modelo ha sido modificado */
		public void setValue(ArrayList<TransferUsuario> value){
			this.content = value;
			fireTableDataChanged();
		}
		public void removeRow(TransferUsuario del){
			content.remove(del);
			fireTableDataChanged();
		}
		/**Borra todos los elementos de content y avisa al JTable que el modelo ha sido modificado*/
		public void reset() {      
			content.clear();
			fireTableDataChanged();
		}
		public void setValue(TransferUsuario datos) {
			// TODO Auto-generated method stub
		
			content.add(datos);
			fireTableDataChanged();
		}
	}
	public static JTable getTableUsuario(){
		return jTableUsuario;
	}
	public static TableModelUsuario getTableModel(){
		return model;
	}
	
	public boolean validar(){
		boolean ret=false;
		if(JPanelUsuarios.getTableUsuario().getSelectedRow() == -1)
			JOptionPane.showMessageDialog(null, "No ha seleccionado ningún usuario");
		else
			ret =true;
		
		return ret;
	}
}
