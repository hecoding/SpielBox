package Presentacion.plataforma;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Negocio.plataforma.TransferPlataforma;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JPanelPlataforma extends JPanel {
	private static final long serialVersionUID = 1L;
	private static TableModelPlataforma modeloPlataforma;
	private static TableModelProgramaPlataforma modeloProgramaPlataforma;

    // Variables declaration - do not modify                     
    private JButton jButtonAnadirProgramaPlataforma;
    private JButton jButtonBorrarProgramaPlataforma;
    private JButton jButtonCrearPlataforma;
    private JButton jButtonEliminarPlataforma;
    private JButton jButtonModificarPlataforma;
    private JButton jButtonMostrarPlataforma;
    private JScrollPane jScrollPane1;
    private static JTable jTablePlataforma;
    // End of variables declaration 

	private JDialogCrearPlataforma jdialogCrearPlataforma;
	private JDialogModificarPlataforma jdialogModificarPlataforma;
	private JDialogEliminarPlataforma jdialogEliminarPlataforma;
	private JDialogMostrarPlataforma jdialogMostrarPlataforma;
	private JDialogAnadirProgramaPlataforma jdialogAñadirProgramaPlataforma;
	private JDialogBorrarProgramaPlataforma jdialogEliminarProgramaPlataforma;


	public JPanelPlataforma(){
		initComponents();	
	}

    private void initComponents() {

        jButtonCrearPlataforma = new javax.swing.JButton();
        jButtonMostrarPlataforma = new javax.swing.JButton();
        jButtonModificarPlataforma = new javax.swing.JButton();
        jButtonEliminarPlataforma = new javax.swing.JButton();
        jButtonAnadirProgramaPlataforma = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePlataforma = new javax.swing.JTable();
        jButtonBorrarProgramaPlataforma = new javax.swing.JButton();
    
        modeloPlataforma = new TableModelPlataforma();
        modeloProgramaPlataforma = new TableModelProgramaPlataforma();

        jButtonCrearPlataforma.setText("Crear Plataforma");

        jButtonMostrarPlataforma.setText("Mostrar Plataforma");

        jButtonModificarPlataforma.setText("Modifcar Plataforma");
        
        jButtonEliminarPlataforma.setText("Eliminar Plataforma");

        jButtonAnadirProgramaPlataforma.setText("Add Programa Plataforma");        

        jButtonBorrarProgramaPlataforma.setText("Del Programa Plataforma");

        jTablePlataforma.setModel(modeloPlataforma);
        
        
        jScrollPane1.setViewportView(jTablePlataforma);

        
        jTablePlataforma.setModel(modeloPlataforma);
        ArrayList<TransferPlataforma> content = new ArrayList<TransferPlataforma>();
        ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_PLATAFORMAS, content); 
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonBorrarProgramaPlataforma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAnadirProgramaPlataforma,javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonEliminarPlataforma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonModificarPlataforma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMostrarPlataforma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButtonCrearPlataforma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(110, 110, 110)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButtonCrearPlataforma)
                        .addGap(8, 8, 8)
                        .addComponent(jButtonMostrarPlataforma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModificarPlataforma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminarPlataforma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAnadirProgramaPlataforma)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBorrarProgramaPlataforma))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    


		///////////////////////ACTION LISTENER /////////////////////////////////////
		jButtonCrearPlataforma.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				jdialogCrearPlataforma = new JDialogCrearPlataforma();
			}
		});
		jButtonEliminarPlataforma.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(validar())
					jdialogEliminarPlataforma = new JDialogEliminarPlataforma();				

			}
		});

		jButtonModificarPlataforma.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(validar())
					jdialogModificarPlataforma = new JDialogModificarPlataforma();
			}
		});
		
		jButtonMostrarPlataforma.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(validar())
					jdialogMostrarPlataforma = new JDialogMostrarPlataforma();
			}
		});


		jButtonAnadirProgramaPlataforma.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(validar())
					jdialogAñadirProgramaPlataforma = new JDialogAnadirProgramaPlataforma();
			}
		});

		jButtonBorrarProgramaPlataforma.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(validar())
					jdialogEliminarProgramaPlataforma = new JDialogBorrarProgramaPlataforma();
			}
		});


		////////////////////////////////////////////////////////////////////////////////////   

	}
    public static JTable getTablePlataforma(){
    	return jTablePlataforma;
    }

	public static TableModelPlataforma getModel(){
		return modeloPlataforma;
	}
	public static TableModelProgramaPlataforma getModeloProgramaPlataforma(){
		return modeloProgramaPlataforma;
	}

	public boolean validar(){
		boolean ret=false;
		if(jTablePlataforma.getSelectedRow() == -1)
			JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna plataforma");
		else
			ret=true;

		return ret;
	}

}
