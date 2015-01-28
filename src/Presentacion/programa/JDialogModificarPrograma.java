package Presentacion.programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import Negocio.clasificacion.TransferClasificacion;
import Negocio.programa.TransferPrograma;
import Negocio.programa.TransferProgramaPago;
import Presentacion.clasificacion.JPanelClasificacion;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogModificarPrograma extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JDialogModificarPrograma() {
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		jLabelNombre = new javax.swing.JLabel();
        jLabelVersion = new javax.swing.JLabel();
        jLabelRequisitos = new javax.swing.JLabel();
        jLabelFuncionalidad = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelClasificacion = new javax.swing.JLabel();
        jTextFieldNombrePrograma = new javax.swing.JTextField();
        jTextFieldVersionPrograma = new javax.swing.JTextField();
        jTextFieldRequisitosPrograma = new javax.swing.JTextField();
        jTextFieldFuncionalidadPrograma = new javax.swing.JTextField();
        jTextFieldPrecioPrograma = new javax.swing.JTextField();
        jTextFieldClasificacion = new javax.swing.JTextField();
        jButtonModificar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Programa");

        // Hasta aquí
        
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("Nombre");

        jLabelVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVersion.setText("Version");

        jLabelRequisitos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRequisitos.setText("Requisitos");

        jLabelFuncionalidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFuncionalidad.setText("Funcionalidad");

        jLabelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecio.setText("Precio");
        
        jLabelClasificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClasificacion.setText("Clasificacion");

        jButtonModificar.setText("Modificar");

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
                            .addComponent(jLabelPrecio)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelVersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelRequisitos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelFuncionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelClasificacion, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVersionPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrecioPrograma)
                            .addComponent(jTextFieldRequisitosPrograma)
                            .addComponent(jTextFieldFuncionalidadPrograma)
                            .addComponent(jTextFieldClasificacion))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelVersion)
                            .addComponent(jTextFieldVersionPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRequisitos)
                            .addComponent(jTextFieldRequisitosPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClasificacion)
                            .addComponent(jTextFieldClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFuncionalidad)
                    .addComponent(jTextFieldFuncionalidadPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio)
                    .addComponent(jTextFieldPrecioPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        
        jButtonModificar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			try {
					TransferPrograma nuevoPrograma = (TransferPrograma) JPanelPrograma.getModelo().getItem(JPanelPrograma.getTablePrograma().getSelectedRow());
					nuevoPrograma.setNombre(""+jTextFieldNombrePrograma.getText());
					nuevoPrograma.setVersion(Float.parseFloat(jTextFieldVersionPrograma.getText()));
					nuevoPrograma.setRequisitos(""+jTextFieldRequisitosPrograma.getText());
					nuevoPrograma.setFuncionalidad(""+jTextFieldFuncionalidadPrograma.getText());
					nuevoPrograma.setPrecio(Float.parseFloat(jTextFieldPrecioPrograma.getText()));
					nuevoPrograma.setClasificacion(""+jTextFieldClasificacion.getText());
					ControladorAplicacion.getInstance().accionCommand(Eventos.MODIFICAR_PROGRAMA, nuevoPrograma);
					setVisible(false);
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
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelRequisitos;
    private javax.swing.JLabel jLabelFuncionalidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelClasificacion;
    private javax.swing.JTextField jTextFieldVersionPrograma;
    private javax.swing.JTextField jTextFieldPrecioPrograma;
    private javax.swing.JTextField jTextFieldRequisitosPrograma;
    private javax.swing.JTextField jTextFieldFuncionalidadPrograma;
    private javax.swing.JTextField jTextFieldNombrePrograma;
    private javax.swing.JTextField jTextFieldClasificacion;
}
