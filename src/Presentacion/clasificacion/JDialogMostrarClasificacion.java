package Presentacion.clasificacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Negocio.clasificacion.TransferClasificacion;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogMostrarClasificacion extends JDialog {
	private static final long serialVersionUID = 1L;

	public JDialogMostrarClasificacion(){
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
        JLabel jLabelID = new javax.swing.JLabel();
        JLabel jLabelDificultad = new javax.swing.JLabel();
        JTextField jTextFieldID = new javax.swing.JTextField();
        JTextField jTextFieldDificultad = new JTextField();
        JButton jButtonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mostrar Clasificación");

        jButtonAceptar.setText("Aceptar");
        ///MOSTRAR /// 
        Negocio.clasificacion.TransferClasificacion clasificacion = JPanelClasificacion.getModelo().getItem(JPanelClasificacion.getTableClasificacion().getSelectedRow());
        ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_VIDEOJUEGO, clasificacion);
        ////////
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDificultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jTextFieldDificultad))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDificultad)
                    .addComponent(jTextFieldDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
        );
        
        /////////////////ACTION LISTENER /////////////////////
              
        jButtonAceptar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TransferClasificacion mostrarClasificacion = new TransferClasificacion();
				ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_CLASIFICACION, mostrarClasificacion);
				setVisible (false);
			}
        });
        
        //////////////////////////////////////////////////////
        setLocationRelativeTo(null);
        pack();
	}

}
