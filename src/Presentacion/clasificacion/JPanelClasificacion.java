package Presentacion.clasificacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Negocio.clasificacion.TransferClasificacion;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JPanelClasificacion extends JPanel {
	private static final long serialVersionUID = 1L;
	private static TableModelClasificacion model;
	private static JTable jTableClasificacion;
	private JButton jButtonCrearClasificacion;
	private JButton jButtonModificarClasificacion;
	private JButton jButtonMostrarClasificacion;
	private JButton jButtonEliminarClasificacion;
	private JScrollPane jScrollPaneClasificacion;
	private JDialogCrearClasificacion jDialogCrearClasificacion;
	private JDialogModificarClasificacion jDialogModificarClasificacion;
	private JDialogMostrarClasificacion jDialogMostrarClasificacion;
	private JDialogEliminarClasificacion jDialogEliminarClasificacion;
	
	public JPanelClasificacion(){
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
	    jTableClasificacion = new javax.swing.JTable();
	    jButtonCrearClasificacion = new javax.swing.JButton();
	    jButtonModificarClasificacion = new javax.swing.JButton();
	    jButtonMostrarClasificacion = new javax.swing.JButton();
	    jButtonEliminarClasificacion = new javax.swing.JButton();
	    jScrollPaneClasificacion = new javax.swing.JScrollPane();
	    
	    model = new TableModelClasificacion();
        jTableClasificacion.setModel(model);
        ArrayList<TransferClasificacion> content = new ArrayList<TransferClasificacion>();
        ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_CLASIFICACIONES, content);        
        
        jScrollPaneClasificacion.setViewportView(jTableClasificacion);
        
        jButtonCrearClasificacion.setText("Crear Clasificacion");

        jButtonModificarClasificacion.setText("Modificar Clasificacion");

        jButtonEliminarClasificacion.setText("Eliminar Clasificacion");

        jButtonMostrarClasificacion.setText("Mostrar Clasificacion");
        
        jButtonEliminarClasificacion.setText("Eliminar Clasificacion");
	    
	    
            javax.swing.GroupLayout jPanelVideojuegoLayout = new javax.swing.GroupLayout(this);
            this.setLayout(jPanelVideojuegoLayout);
            jPanelVideojuegoLayout.setHorizontalGroup(
                jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonModificarClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCrearClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMostrarClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                    .addComponent(jScrollPaneClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanelVideojuegoLayout.setVerticalGroup(
                jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                    .addGroup(jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jButtonCrearClasificacion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonModificarClasificacion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonMostrarClasificacion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonEliminarClasificacion))
                        .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPaneClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(91, Short.MAX_VALUE))
            );
	    
            jButtonCrearClasificacion.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				// TODO Auto-generated method stub
    				jDialogCrearClasificacion  = new JDialogCrearClasificacion();
    			}
              });
               
               jButtonEliminarClasificacion.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				if(validar()){
    					jDialogEliminarClasificacion  = new JDialogEliminarClasificacion();
    				}
    			}
              });
               
               jButtonModificarClasificacion.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				if(validar()) {
    					jDialogModificarClasificacion = new JDialogModificarClasificacion();
    				}
    			}
              });
               
               jButtonMostrarClasificacion.addActionListener(new ActionListener() {			
    			@Override
    			public void actionPerformed(ActionEvent arg0) {
    				// TODO Auto-generated method stub
    				if(validar()){
    				jDialogMostrarClasificacion = new JDialogMostrarClasificacion();
    				}
    			}
              });               
             
	}
	
	public static TableModelClasificacion getTableModel(){
		return model;
	}

	public static JTable getTableClasificacion() {
		return jTableClasificacion;
	}
	private boolean validar(){
		boolean ret=false;
			if(JPanelClasificacion.getTableClasificacion().getSelectedRow() == -1)
				JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna clasificación");
			else
				ret =true;
		
		return ret;
	}
}
