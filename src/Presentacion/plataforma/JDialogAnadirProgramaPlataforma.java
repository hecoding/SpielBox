package Presentacion.plataforma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Negocio.plataforma.TransferPlataforma;
import Presentacion.biblioteca.JPanelBiblioteca;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogAnadirProgramaPlataforma extends JDialog {

	
	public JDialogAnadirProgramaPlataforma(){
		initComponents();	
	}
	
	private void initComponents() {


		// TODO Auto-generated method stub

        JButton jButtonAñadir = new javax.swing.JButton();
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        final JTable jTablePlataforma = new javax.swing.JTable();
        JButton jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir Programa de plataforma");

        jButtonAñadir.setText("Añadir");

        //////RELLENO DE TABLA///////
        TransferPlataforma proPla = (TransferPlataforma) JPanelPlataforma.getModelo().getItem(JPanelPlataforma.getTablePlataforma().getSelectedRow());
		
		ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_PLATAFORMA, proPla);
        //////////////////////////
		
		///AÑADO EL MODELO /////
        jTablePlataforma.setModel(JPanelBiblioteca.getModeloVideojuegoBiblioteca());
        jScrollPane1.setViewportView(jTablePlataforma);
        /////////////////////////////
        jScrollPane1.setViewportView(jTablePlataforma);

        jButtonCancel.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAñadir)
                .addGap(7, 7, 7)
                .addComponent(jButtonCancel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAñadir)
                    .addComponent(jButtonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        /////////////////ACTION LISTENER /////////////////////
        jButtonAñadir.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
				
				/*
				// TODO Auto-generated method stub
				TransferVideojuego delVideo = (TransferVideojuego) JPanelBiblioteca.getModeloVideojuegoBiblioteca().getItem(jTableVideojuegos.getSelectedRow());
				TransferBiblioteca modBiblioteca = (TransferBiblioteca) JPanelBiblioteca.getModelo().getItem(JPanelBiblioteca.getTableBiblioteca().getSelectedRow());
				//Para poder pasar dos transfers creo un array que lo tratare en el determinado comando
				ArrayList<Object> transferVideojuego_biblioteca= new ArrayList<>();
				transferVideojuego_biblioteca.add(delVideo);
				transferVideojuego_biblioteca.add(modBiblioteca);
				ControladorAplicacion.getInstance().accionCommand(Eventos.ELIMINAR_VIDEOJUEGO_BIBLIOTECA, transferVideojuego_biblioteca);
				setVisible(false);*/
			}
        });
        
        jButtonCancel.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
        });
        
        //////////////////////////////////////////////////////
        
        this.setVisible(true);
        setLocationRelativeTo(null);
        pack();
	}
}
