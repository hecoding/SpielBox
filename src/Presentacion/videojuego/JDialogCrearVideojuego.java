package Presentacion.videojuego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Negocio.videojuego.TransferVideojuego;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogCrearVideojuego extends JDialog{
	/**
	 * 
	 */
	public JDialogCrearVideojuego() {
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
        JLabel jLabelNombre = new javax.swing.JLabel();
        JLabel jLabelCategoria = new javax.swing.JLabel();
        JLabel jLabelCalificacion = new javax.swing.JLabel();
        JLabel jLabelPrecio = new javax.swing.JLabel();
        final JTextField jTextFieldNombreVideojuego = new javax.swing.JTextField();
        final JTextField jTextFieldCategoria = new javax.swing.JTextField();
        final JTextField jTextFieldCalificacion = new javax.swing.JTextField();
        final JTextField jTextFieldPrecio = new javax.swing.JTextField();
        JButton jButtonCrear = new javax.swing.JButton();
        JButton jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Videojuego");

        jLabelNombre.setText("Nombre:");
        jLabelCategoria.setText("Categoria:");
        jLabelCalificacion.setText("Calificación:");
        jLabelPrecio.setText("Precio:");

        jButtonCrear.setText("Crear");

        jButtonCancel.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelCategoria)
                    .addComponent(jLabelCalificacion)
                    .addComponent(jLabelPrecio))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(jTextFieldCalificacion)))
                    .addComponent(jTextFieldNombreVideojuego, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonCrear))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCrear)
                    .addComponent(jLabelCategoria))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCalificacion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrecio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonCancel)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        
        
        /////////////////ACTION LISTENER /////////////////////
        jButtonCrear.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				TransferVideojuego nuevoVideojuego = new TransferVideojuego();
				if(esDouble(jTextFieldCalificacion.getText())&&esDouble(jTextFieldPrecio.getText())){
					nuevoVideojuego.setNombre(""+jTextFieldNombreVideojuego.getText());
					nuevoVideojuego.setCategoria(""+jTextFieldCategoria.getText());
					nuevoVideojuego.setCalificacion(Double.parseDouble(jTextFieldCalificacion.getText()));
					nuevoVideojuego.setPrecio(Double.parseDouble(jTextFieldPrecio.getText()));
				}
				else JOptionPane.showMessageDialog(null, "El/los input/s son incorrecto/s");
				ControladorAplicacion.getInstance().accionCommand(Eventos.CREAR_VIDEOJUEGO, nuevoVideojuego);
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
	public boolean esDouble(String s){
		 try {
	            Double.parseDouble(s);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	}
}
