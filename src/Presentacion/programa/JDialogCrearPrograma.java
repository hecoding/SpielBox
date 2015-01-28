/**
 * 
 */
package Presentacion.programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Negocio.programa.TransferProgramaPago;
import Negocio.programa.TransferProgramaAlquiler;
import Negocio.programa.TransferPrograma;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class JDialogCrearPrograma extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JDialogCrearPrograma() {
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
        jRadioButtonPago = new javax.swing.JRadioButton();
        jRadioButtonAlquiler = new javax.swing.JRadioButton();
        jTextFieldNombrePrograma = new javax.swing.JTextField();
        jTextFieldVersionPrograma = new javax.swing.JTextField();
        jTextFieldRequisitosPrograma = new javax.swing.JTextField();
        jTextFieldFuncionalidadPrograma = new javax.swing.JTextField();
        jTextFieldPrecioPrograma = new javax.swing.JTextField();
        jTextFieldClasificacion = new javax.swing.JTextField();
        jButtonCrear = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Programa");

        // Código propio
        jLabelPrecio.setVisible(true);
        jTextFieldPrecioPrograma.setVisible(true);
        // Hasta aquí
        
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("Nombre");

        jLabelVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVersion.setText("Version");

        jLabelRequisitos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRequisitos.setText("Requisitos");

        jLabelFuncionalidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFuncionalidad.setText("Funcionalidad");

        jLabelClasificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClasificacion.setText("Clasificacion");

        jLabelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecio.setText("Precio");
        
        jRadioButtonPago.setText("Pago");

        jRadioButtonAlquiler.setText("Alquiler");

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
                            .addComponent(jButtonCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonAlquiler)
                            .addComponent(jRadioButtonPago))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jRadioButtonPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonAlquiler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addComponent(jButtonCrear)
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
        
        jRadioButtonPago.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				jRadioButtonAlquiler.setSelected(false);
				jLabelPrecio.setText("Precio de Pago");
			}
        });
        jRadioButtonAlquiler.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				jRadioButtonPago.setSelected(false);
				jLabelPrecio.setText("Precio de Alquiler");
			}
        });
        jButtonCrear.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			try {
				TransferPrograma nuevoPrograma = null;
				if(!jRadioButtonPago.isSelected() && !jRadioButtonAlquiler.isSelected()) {
					JOptionPane.showMessageDialog(new JPanel(),"No se puede crear el Programa sin seleccionar Pago o Alquiler");
				} else {
					if(jRadioButtonPago.isSelected()) {
						nuevoPrograma = new TransferProgramaPago();
						nuevoPrograma.setNombre(""+jTextFieldNombrePrograma.getText());
						nuevoPrograma.setVersion(Float.parseFloat(jTextFieldVersionPrograma.getText()));
						nuevoPrograma.setRequisitos(""+jTextFieldRequisitosPrograma.getText());
						nuevoPrograma.setFuncionalidad(""+jTextFieldFuncionalidadPrograma.getText());
						nuevoPrograma.setClasificacion(""+jTextFieldClasificacion.getText());
						((TransferProgramaPago)nuevoPrograma).setPrecioFinal(Float.parseFloat(jTextFieldPrecioPrograma.getText()));
					} else {
						nuevoPrograma = new TransferProgramaAlquiler();
						nuevoPrograma.setNombre(""+jTextFieldNombrePrograma.getText());
						nuevoPrograma.setVersion(Float.parseFloat(jTextFieldVersionPrograma.getText()));
						nuevoPrograma.setRequisitos(""+jTextFieldRequisitosPrograma.getText());
						nuevoPrograma.setFuncionalidad(""+jTextFieldFuncionalidadPrograma.getText());
						nuevoPrograma.setClasificacion(""+jTextFieldClasificacion.getText());
						((TransferProgramaAlquiler)nuevoPrograma).setPrecioHora(Float.parseFloat(jTextFieldPrecioPrograma.getText()));
					}
					
					ControladorAplicacion.getInstance().accionCommand(Eventos.CREAR_PROGRAMA, nuevoPrograma);
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
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelRequisitos;
    private javax.swing.JLabel jLabelFuncionalidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelClasificacion;
    private javax.swing.JRadioButton jRadioButtonPago;
    private javax.swing.JRadioButton jRadioButtonAlquiler;
    private javax.swing.JTextField jTextFieldVersionPrograma;
    private javax.swing.JTextField jTextFieldPrecioPrograma;
    private javax.swing.JTextField jTextFieldRequisitosPrograma;
    private javax.swing.JTextField jTextFieldFuncionalidadPrograma;
    private javax.swing.JTextField jTextFieldNombrePrograma;
    private javax.swing.JTextField jTextFieldClasificacion;
}