package Presentacion.biblioteca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Negocio.biblioteca.TransferBiblioteca;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogQueryBiblioteca extends JDialog {
	
	public JDialogQueryBiblioteca() {
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
        JLabel jLabelNombre = new javax.swing.JLabel();
        final JTextField jTextFieldN = new javax.swing.JTextField();
        JButton jButtonCrear = new javax.swing.JButton();
        JButton jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar bibliotecas con N videojuegos o más");

        jLabelNombre.setText("Numero de Videojuegos:");

        jButtonCrear.setText("Crear");

        jButtonCancel.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                		.addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jTextFieldN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        /////////////////ACTION LISTENER /////////////////////
        jButtonCrear.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!esInt(jTextFieldN.getText())) JOptionPane.showMessageDialog(null, "El input debe ser un numero entero");
				else
				ControladorAplicacion.getInstance().accionCommand(Eventos.QUERY_BIBLIOTECA, Integer.parseInt(jTextFieldN.getText()));
				
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
	
	public boolean esInt(String s){
		 try {
	            Integer.parseInt(s);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	}

}
