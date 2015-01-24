package Presentacion.biblioteca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Negocio.biblioteca.TransferBiblioteca;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogModificarBiblioteca extends JDialog{
	private JTextField jTextFieldNombre ;
	public JDialogModificarBiblioteca(){
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
        JLabel jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        JButton jButtonModificar = new javax.swing.JButton();
        JButton jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Biblioteca a usuario");
        
        ////RELLENO DE CAMPOS /////
		TransferBiblioteca rellenaDatos = (TransferBiblioteca) JPanelBiblioteca.getModelo().getItem(JPanelBiblioteca.getTableBiblioteca().getSelectedRow());
		jTextFieldNombre.setText(rellenaDatos.getNombre());
        ///////////////////
		
     
        jLabelNombre.setText("Nombre:");
        jButtonModificar.setText("Modificar");
        jButtonCancel.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        /////////////////ACTION LISTENER /////////////////////
        jButtonModificar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//OBTENEMOS LA BIBLIO SELECCIONADA
				TransferBiblioteca modBiblioteca = (TransferBiblioteca) JPanelBiblioteca.getModelo().getItem(JPanelBiblioteca.getTableBiblioteca().getSelectedRow());
				JPanelBiblioteca.getModelo().removeRow(modBiblioteca); // lo borro de la tabla
				
				modBiblioteca.setNombre(jTextFieldNombre.getText()); //actualizo su nombre
				//mando nuevo transfer
				ControladorAplicacion.getInstance().accionCommand(Eventos.MODIFICAR_BIBLIOTECA, modBiblioteca);
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
