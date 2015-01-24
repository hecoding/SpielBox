package Presentacion.videojuego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Negocio.biblioteca.TransferBiblioteca;
import Negocio.videojuego.TransferVideojuego;
import Presentacion.biblioteca.JPanelBiblioteca;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogMostrarVideojuego extends JDialog {
	public JDialogMostrarVideojuego(){
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
        JLabel jLabelNombre = new javax.swing.JLabel();
        JLabel jLabelCategoria = new javax.swing.JLabel();
        JLabel jLabelPrecio = new javax.swing.JLabel();
        JLabel jLabelCalificacion = new JLabel();
        JTextField jTextFieldNombre = new javax.swing.JTextField();
        JTextField jTextFieldCategoria = new JTextField();
        JTextField jTextFieldCalificacion = new JTextField();
        JTextField jTextFieldPrecio = new JTextField();
        JButton jButtonModificar = new javax.swing.JButton();
        JButton jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mostrar Videojuego");

        jButtonCancel.setText("Aceptar");
        ///MOSTRARR /// 
        TransferVideojuego juego = (TransferVideojuego) JPanelVideojuego.getModelo().getItem(JPanelVideojuego.getTableVideojuego().getSelectedRow());;
        ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_VIDEOJUEGO, juego);
        ////////
       /* 
        jLabelNombre.setText("Nombre: ");
        jTextFieldNombre.setText(juego.getNombre());
        jLabelCategoria.setText("Categoria :");
        jTextFieldCategoria.setText(juego.getCategoria());
        jLabelCalificacion.setText("Calificacion :");
        jTextFieldCalificacion.setText(Double.toString(juego.getCalificacion()));
        jLabelPrecio.setText("Precio :");
        jTextFieldPrecio.setText(Double.toString(juego.getPrecio()));*/
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCalificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jTextFieldCategoria)
                    .addComponent(jTextFieldCalificacion)
                    .addComponent(jTextFieldPrecio))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoria)
                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCalificacion)
                    .addComponent(jTextFieldCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        
        /////////////////ACTION LISTENER /////////////////////
              
        jButtonCancel.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
        });
        
        //////////////////////////////////////////////////////
        //this.setVisible(true);
        setLocationRelativeTo(null);
        pack();
	}

}
