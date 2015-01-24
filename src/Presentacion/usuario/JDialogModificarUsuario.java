package Presentacion.usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import Negocio.usuario.TransferUsuario;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogModificarUsuario extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JDialogModificarUsuario(){
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
		
		jLabelNombre = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jButtonModificar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("Nombre");

        jLabelApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelApellidos.setText("Apellidos");

        jButtonModificar.setText("Modificar");

        jButtonCancel.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonCancel))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelApellidos)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        
        jButtonModificar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
			try {
				TransferUsuario modUsuario = (TransferUsuario) JPanelUsuarios.getTableModel().getItem(JPanelUsuarios.getTableUsuario().getSelectedRow());

				
				modUsuario.setNombre(jTextFieldNombre.getText()); //actualizo su nombre
				modUsuario.setApellidos(jTextFieldApellidos.getText()); //actualizo sus apellidos
				
				Pattern pat;
				Matcher mat;
				pat = Pattern.compile("[a-zA-z]{1,40}");
				mat = pat.matcher(modUsuario.getNombre());
				if(!mat.matches()) { throw new IllegalArgumentException(); }
				mat = pat.matcher(modUsuario.getApellidos());
				if(!mat.matches()) { throw new IllegalArgumentException(); }
				
				//mando nuevo transfer
				JPanelUsuarios.getTableModel().removeRow(modUsuario); // lo borro de la tabla
				ControladorAplicacion.getInstance().accionCommand(Eventos.MODIFICAR_USUARIO, modUsuario);
				setVisible(false);
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Datos introducidos en los campos no válidos");
			}
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
	
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldNombre;
}
