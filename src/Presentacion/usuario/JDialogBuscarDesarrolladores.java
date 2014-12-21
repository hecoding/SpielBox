package Presentacion.usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogBuscarDesarrolladores extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JDialogBuscarDesarrolladores() {
		// TODO Auto-generated constructor stub
		initComponents();
	}
	
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabelDescuento;
    private javax.swing.JTextField jTextFieldDescuentoUsuario;
	
	private void initComponents() {
        jLabelDescuento = new javax.swing.JLabel();
        jTextFieldDescuentoUsuario = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelDescuento.setText("Descuento");

        jButtonBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextFieldDescuentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButtonBuscar)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescuentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscar)
                .addContainerGap(53, Short.MAX_VALUE))
        );
	    
        jButtonBuscar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!esInt(jTextFieldDescuentoUsuario.getText())) JOptionPane.showMessageDialog(null, "El input debe ser un numero entero");
				else
				ControladorAplicacion.getInstance().accionCommand(Eventos.QUERY_DESARROLLADOR, Integer.parseInt(jTextFieldDescuentoUsuario.getText()));
				
				setVisible(false);
			}
        });
	    
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
