package Presentacion.biblioteca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Negocio.biblioteca.TransferBiblioteca;
import Negocio.videojuego.TransferVideojuego;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

@SuppressWarnings("serial")
public class JDialogEliminarVideojuegoBiblioteca extends JDialog {

	public JDialogEliminarVideojuegoBiblioteca(){
		
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub

        JButton jButtonEliminar = new javax.swing.JButton();
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        final JTable jTableVideojuegos = new javax.swing.JTable();
        JButton jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Videojuego de biblioteca");

        jButtonEliminar.setText("Eliminar");

        //////RELLENO DE TABLA///////
        TransferBiblioteca showBiblioteca = (TransferBiblioteca) JPanelBiblioteca.getModelo().getItem(JPanelBiblioteca.getTableBiblioteca().getSelectedRow());
		
		ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_BIBLIOTECA, showBiblioteca);
        //////////////////////////
		
		///AÑADO EL MODELO /////
        jTableVideojuegos.setModel(JPanelBiblioteca.getModeloVideojuegoBiblioteca());
        jScrollPane1.setViewportView(jTableVideojuegos);
        /////////////////////////////
        jScrollPane1.setViewportView(jTableVideojuegos);

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
                .addComponent(jButtonEliminar)
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
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        /////////////////ACTION LISTENER /////////////////////
        jButtonEliminar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				TransferVideojuego delVideo = (TransferVideojuego) JPanelBiblioteca.getModeloVideojuegoBiblioteca().getItem(jTableVideojuegos.getSelectedRow());
				TransferBiblioteca modBiblioteca = (TransferBiblioteca) JPanelBiblioteca.getModelo().getItem(JPanelBiblioteca.getTableBiblioteca().getSelectedRow());
				//Para poder pasar dos transfers creo un array que lo tratare en el determinado comando
				ArrayList<Object> transferVideojuego_biblioteca= new ArrayList<>();
				transferVideojuego_biblioteca.add(delVideo);
				transferVideojuego_biblioteca.add(modBiblioteca);
				ControladorAplicacion.getInstance().accionCommand(Eventos.ELIMINAR_VIDEOJUEGO_BIBLIOTECA, transferVideojuego_biblioteca);
				setVisible(false);
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
