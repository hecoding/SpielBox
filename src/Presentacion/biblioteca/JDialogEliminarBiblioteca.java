package Presentacion.biblioteca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Negocio.biblioteca.TransferBiblioteca;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogEliminarBiblioteca extends JDialog {


	public JDialogEliminarBiblioteca() {
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub

		JLabel jLabelEliminar = new javax.swing.JLabel();
		JButton jButtonEliminar = new javax.swing.JButton();
		JButton jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Biblioteca a usuario");

        jLabelEliminar.setText("Esta seguro que desea eliminar la biblioteca?");

        jButtonEliminar.setText("Eliminar");

        jButtonCancel.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEliminar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEliminar)
                    .addComponent(jButtonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        /////////////////ACTION LISTENER /////////////////////
        jButtonEliminar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//OBTENEMOS LA BIBLIO SELECCIONADA
				TransferBiblioteca delBiblioteca = (TransferBiblioteca) JPanelBiblioteca.getModelo().getItem(JPanelBiblioteca.getTableBiblioteca().getSelectedRow());
			
				ControladorAplicacion.getInstance().accionCommand(Eventos.ELIMINAR_BIBLIOTECA, delBiblioteca);
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
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
	}
}
