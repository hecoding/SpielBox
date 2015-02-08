package Presentacion.plataforma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Negocio.biblioteca.TransferBiblioteca;
import Negocio.plataforma.TransferPlataforma;
import Negocio.programa.TransferPrograma;
import Negocio.videojuego.TransferVideojuego;
import Presentacion.biblioteca.JPanelBiblioteca;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogBorrarProgramaPlataforma extends JDialog {
	JTable jTableProgramaPlataforma = new javax.swing.JTable();
	
	
	public JDialogBorrarProgramaPlataforma(){
		initComponents();	
	}
	
	private void initComponents() {

		// TODO Auto-generated method stub

        JButton jButtonEliminar = new javax.swing.JButton();
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        JButton jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Programa de plataforma");

        jButtonEliminar.setText("Eliminar");

        //////RELLENO DE TABLA///////
        TransferPlataforma proPla = (TransferPlataforma) JPanelPlataforma.getModel().getItem(JPanelPlataforma.getTablePlataforma().getSelectedRow());
		
		ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_PLATAFORMA, proPla);
        //////////////////////////
		
		///AÑADO EL MODELO /////
		jTableProgramaPlataforma.setModel(JPanelPlataforma.getModeloProgramaPlataforma());
        jScrollPane1.setViewportView(jTableProgramaPlataforma);
        /////////////////////////////

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
				
				if(jTableProgramaPlataforma.getSelectedRow() != -1){
				TransferPlataforma delPlataforma = (TransferPlataforma) JPanelPlataforma.getModel().getItem(JPanelPlataforma.getTablePlataforma().getSelectedRow());
				TransferPrograma delPrograma = (TransferPrograma) JPanelPlataforma.getModeloProgramaPlataforma().getItem(jTableProgramaPlataforma.getSelectedRow());
				
				//Para poder pasar dos transfers creo un array que lo tratare en el determinado comando
				ArrayList<Object> transfers= new ArrayList<>();
				transfers.add(delPlataforma);
				transfers.add(delPrograma);
				ControladorAplicacion.getInstance().accionCommand(Eventos.BORRAR_PROGRAMA_PLATAFORMA, transfers);
				setVisible(false);
				}else
					JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna plataforma");
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
