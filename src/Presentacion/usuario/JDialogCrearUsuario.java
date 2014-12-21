package Presentacion.usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Negocio.usuario.TransferCliente;
import Negocio.usuario.TransferDesarrollador;
import Negocio.usuario.TransferUsuario;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogCrearUsuario extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JDialogCrearUsuario() {
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		jLabelNombre = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelNick = new javax.swing.JLabel();
        jLabelDescuento = new javax.swing.JLabel();
        jRadioButtonCliente = new javax.swing.JRadioButton();
        jRadioButtonDesarrollador = new javax.swing.JRadioButton();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jTextFieldApellidosUsuario = new javax.swing.JTextField();
        jTextFieldEmailUsuario = new javax.swing.JTextField();
        jTextFieldNickUsuario = new javax.swing.JTextField();
        jTextFieldDescuentoUsuario = new javax.swing.JTextField();
        jButtonCrear = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear usuario");

        // Código propio
        jLabelDescuento.setVisible(false);
        jTextFieldDescuentoUsuario.setVisible(false);
        // Hasta aquí
        
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

        jRadioButtonCliente.setText("Cliente");

        jRadioButtonDesarrollador.setText("Desarrollador");

        jButtonCrear.setText("Crear");

        jButtonCancel.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDescuento)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNick, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldApellidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDescuentoUsuario)
                            .addComponent(jTextFieldEmailUsuario)
                            .addComponent(jTextFieldNickUsuario))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonDesarrollador)
                            .addComponent(jRadioButtonCliente))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jRadioButtonCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonDesarrollador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelApellidos)
                            .addComponent(jTextFieldApellidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNick)
                    .addComponent(jTextFieldNickUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescuento)
                    .addComponent(jTextFieldDescuentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        
        jRadioButtonCliente.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				jRadioButtonDesarrollador.setSelected(false);
				jLabelDescuento.setVisible(false);
				jTextFieldDescuentoUsuario.setVisible(false);
			}
        });
        jRadioButtonDesarrollador.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				jRadioButtonCliente.setSelected(false);
				jLabelDescuento.setVisible(true);
				jTextFieldDescuentoUsuario.setVisible(true);
			}
        });
        jButtonCrear.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			try {
				TransferUsuario nuevoUsuario = null;
				if(!jRadioButtonCliente.isSelected() && !jRadioButtonDesarrollador.isSelected()) {
					JOptionPane.showMessageDialog(new JPanel(),"No se puede crear el usuario sin seleccionar Cliente o Desarrollador");
				} else {
					if(jRadioButtonCliente.isSelected()) {
						nuevoUsuario = new TransferCliente();
						nuevoUsuario.setNombre(""+jTextFieldNombreUsuario.getText());
						nuevoUsuario.setApellidos(""+jTextFieldApellidosUsuario.getText());
						nuevoUsuario.setEmail(""+jTextFieldEmailUsuario.getText());
						nuevoUsuario.setNick(""+jTextFieldNickUsuario.getText());
					} else {
						nuevoUsuario = new TransferDesarrollador();
						nuevoUsuario.setNombre(""+jTextFieldNombreUsuario.getText());
						nuevoUsuario.setApellidos(""+jTextFieldApellidosUsuario.getText());
						nuevoUsuario.setEmail(""+jTextFieldEmailUsuario.getText());
						nuevoUsuario.setNick(""+jTextFieldNickUsuario.getText());
						((TransferDesarrollador) nuevoUsuario).setDescuento(""+jTextFieldDescuentoUsuario.getText());
					}
	
					Pattern pat;
					Matcher mat;
					pat = Pattern.compile("[a-zA-z]{1,40}");
					mat = pat.matcher(nuevoUsuario.getNombre());
					if(!mat.matches()) { throw new IllegalArgumentException(); }
					mat = pat.matcher(nuevoUsuario.getApellidos());
					if(!mat.matches()) { throw new IllegalArgumentException(); }
					pat = Pattern.compile("[a-zA-z1-9]{1,40}");
					mat = pat.matcher(nuevoUsuario.getNick());
					if(!mat.matches()) { throw new IllegalArgumentException(); }
					pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
					mat = pat.matcher(nuevoUsuario.getEmail());
					if(!mat.matches()) { throw new IllegalArgumentException(); }
					
					nuevoUsuario.setID(12);
					ControladorAplicacion.getInstance().accionCommand(Eventos.CREAR_USUARIO, nuevoUsuario);
					setVisible(false);
				}
			} catch(IllegalArgumentException e) {
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
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelDescuento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNick;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JRadioButton jRadioButtonCliente;
    private javax.swing.JRadioButton jRadioButtonDesarrollador;
    private javax.swing.JTextField jTextFieldApellidosUsuario;
    private javax.swing.JTextField jTextFieldDescuentoUsuario;
    private javax.swing.JTextField jTextFieldEmailUsuario;
    private javax.swing.JTextField jTextFieldNickUsuario;
    private javax.swing.JTextField jTextFieldNombreUsuario;
}
