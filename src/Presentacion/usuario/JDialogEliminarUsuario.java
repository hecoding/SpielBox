package Presentacion.usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import Negocio.usuario.TransferUsuario;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogEliminarUsuario extends JDialog {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JDialogEliminarUsuario() {
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub

		JLabel jLabelEliminar = new javax.swing.JLabel();
		JButton jButtonEliminar = new javax.swing.JButton();
		JButton jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar usuario");

        jLabelEliminar.setText("Esta seguro que desea eliminar al usuario?");

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
				TransferUsuario delUsuario = (TransferUsuario) JPanelUsuarios.getTableModel().getItem(JPanelUsuarios.getTableUsuario().getSelectedRow());
				
				ControladorAplicacion.getInstance().accionCommand(Eventos.ELIMINAR_USUARIO, delUsuario);
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
