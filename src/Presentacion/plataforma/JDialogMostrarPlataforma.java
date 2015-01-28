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

public class JDialogMostrarPlataforma extends JDialog {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JDialogMostrarPlataforma(){
		initComponents();	
	}
	
	private void initComponents() {

        JButton jButtonAceptar = new javax.swing.JButton();
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        JTable jTableProgramaPlataforma = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mostrar Plataforma");

        jButtonAceptar.setText("Aceptar");
        jTableProgramaPlataforma.setModel(JPanelPlataforma.getModeloProgramaPlataforma());

        //////RELLENO DE TABLA///////
        TransferPlataforma mostrarPls = (TransferPlataforma) JPanelPlataforma.getModel().getItem(JPanelPlataforma.getTablePlataforma().getSelectedRow());
		
		ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_PLATAFORMA, mostrarPls);
        //////////////////////////
        jScrollPane1.setViewportView(jTableProgramaPlataforma);

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
                .addComponent(jButtonAceptar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        /////////////////ACTION LISTENER /////////////////////
        jButtonAceptar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
        });        
        //////////////////////////////////////////////////////
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
	}
}
