package Presentacion.usuario;

import javax.swing.JDialog;

import Negocio.usuario.TransferUsuario;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogMostrarUsuario extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JDialogMostrarUsuario(){
		
		initComponents();
	}

		private void initComponents() {

	        jLabelNombre = new javax.swing.JLabel();
	        jLabelApellidos = new javax.swing.JLabel();
	        jLabelEmail = new javax.swing.JLabel();
	        jLabelNick = new javax.swing.JLabel();
	        jLabelDescuento = new javax.swing.JLabel();
	        jLabelNombreUsuario = new javax.swing.JLabel();
	        jLabelApellidosUsuario = new javax.swing.JLabel();
	        jLabelEmailUsuario = new javax.swing.JLabel();
	        jLabelNickUsuario = new javax.swing.JLabel();
	        jLabelDescuentoUsuario = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

	        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabelNombre.setText("Nombre");

	        jLabelApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabelApellidos.setText("Apellidos");

	        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabelEmail.setText("Email");

	        jLabelNick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabelNick.setText("Nickname");

	        jLabelDescuento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabelDescuento.setText("Descuento");
	        
	        // Relleno de tabla
	        TransferUsuario showUsuario = (TransferUsuario) JPanelUsuarios.getTableModel().getItem(JPanelUsuarios.getTableUsuario().getSelectedRow());
	        
	        ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_USUARIO, showUsuario);
	        //
	        
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(45, 45, 45)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
	                        .addComponent(jLabelNick)
	                        .addGap(0, 0, Short.MAX_VALUE))
	                    .addComponent(jLabelApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jLabelApellidosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelEmailUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelNickUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelDescuentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(165, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(21, 21, 21)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jLabelApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabelApellidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabelEmail)
	                            .addComponent(jLabelEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addComponent(jLabelNick))
	                    .addComponent(jLabelNickUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jLabelDescuento)
	                    .addComponent(jLabelDescuentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(34, Short.MAX_VALUE))
	        );

	    
	        setLocationRelativeTo(null);
	        pack();

		}
		
	    private javax.swing.JLabel jLabelApellidos;
	    private javax.swing.JLabel jLabelApellidosUsuario;
	    private javax.swing.JLabel jLabelDescuento;
	    private javax.swing.JLabel jLabelDescuentoUsuario;
	    private javax.swing.JLabel jLabelEmail;
	    private javax.swing.JLabel jLabelEmailUsuario;
	    private javax.swing.JLabel jLabelNick;
	    private javax.swing.JLabel jLabelNickUsuario;
	    private javax.swing.JLabel jLabelNombre;
	    private javax.swing.JLabel jLabelNombreUsuario;
}
