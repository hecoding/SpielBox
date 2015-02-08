/**
 * 
 */
package Presentacion.programa;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Negocio.programa.TransferProgramaPago;
import Negocio.programa.TransferProgramaAlquiler;
import Negocio.programa.TransferPrograma;
import Presentacion.clasificacion.JPanelClasificacion;
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
    	
    	this.setVisible(true);
        jRadioButtonPago = new javax.swing.JRadioButton();
        jRadioButtonAlquiler = new javax.swing.JRadioButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelVersion = new javax.swing.JLabel();
        jLabelRequisitos = new javax.swing.JLabel();
        jLabelClasificacion = new javax.swing.JLabel();
        jLabelFuncionalidad = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldNombrePrograma = new javax.swing.JTextField();
        jTextFieldVersionPrograma = new javax.swing.JTextField();
        jTextFieldRequisitosPrograma = new javax.swing.JTextField();
        jTextFieldClasificacion = new javax.swing.JTextField();
        jTextFieldFuncionalidadPrograma = new javax.swing.JTextField();
        jTextFieldPrecioPrograma = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jComboBoxClasificacion = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jRadioButtonPago.setText("Pago");
        jRadioButtonPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAlquiler.setSelected(false);
            	jLabelPrecio.setText("Precio de Pago");	
            }
        });

        jRadioButtonAlquiler.setText("Alquiler");
        jRadioButtonAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPago.setSelected(false);
                jLabelPrecio.setText("Precio de Alquiler");
            }
        });

        jLabelNombre.setText("Nombre");

        jLabelVersion.setText("Version");

        jLabelRequisitos.setText("Requisitos");

        jLabelClasificacion.setText("Clasificacion");

        jLabelFuncionalidad.setText("Funcionalidad");

        jLabelPrecio.setText("Precio");
        
       
        
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 setVisible(false);
            }
        });

        jButtonCrear.setText("Crear");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
    				TransferPrograma nuevoPrograma = null;
    				if(!jRadioButtonPago.isSelected() && !jRadioButtonAlquiler.isSelected()) {
    					JOptionPane.showMessageDialog(new JPanel(),"No se puede crear el Programa sin seleccionar Pago o Alquiler");
    				} else {
    					if (jComboBoxClasificacion.getSelectedItem() == null)
    						throw new IllegalArgumentException();
    					
    					if(jRadioButtonPago.isSelected()) {
    						nuevoPrograma = new TransferProgramaPago();
    						nuevoPrograma.setNombre(""+jTextFieldNombrePrograma.getText());
    						nuevoPrograma.setVersion(Float.parseFloat(jTextFieldVersionPrograma.getText()));
    						nuevoPrograma.setRequisitos(""+jTextFieldRequisitosPrograma.getText());
    						nuevoPrograma.setFuncionalidad(""+jTextFieldFuncionalidadPrograma.getText());
    						nuevoPrograma.setClasificacion(jComboBoxClasificacion.getSelectedItem().toString());
    						((TransferProgramaPago)nuevoPrograma).setPrecioFinal(Float.parseFloat(jTextFieldPrecioPrograma.getText()));
    					} else {
    						nuevoPrograma = new TransferProgramaAlquiler();
    						nuevoPrograma.setNombre(""+jTextFieldNombrePrograma.getText());
    						nuevoPrograma.setVersion(Float.parseFloat(jTextFieldVersionPrograma.getText()));
    						nuevoPrograma.setRequisitos(""+jTextFieldRequisitosPrograma.getText());
    						nuevoPrograma.setFuncionalidad(""+jTextFieldFuncionalidadPrograma.getText());
    						nuevoPrograma.setClasificacion(jComboBoxClasificacion.getSelectedItem().toString());
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

        jComboBoxClasificacion.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[]{}));

    	for(int i = 0; i < JPanelClasificacion.getTableModel().getRowCount(); ++i) {
       		jComboBoxClasificacion.addItem(JPanelClasificacion.getTableModel().getValueAt(i, 1).toString());
       	}
        

        jComboBoxClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jTextFieldClasificacion.setText(jComboBoxClasificacion.getSelectedItem().toString());
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonAlquiler)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonPago)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRequisitos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelClasificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFuncionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVersionPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRequisitosPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFuncionalidadPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrecioPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jRadioButtonPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonAlquiler))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButtonCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVersionPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRequisitos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRequisitosPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFuncionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFuncionalidadPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrecioPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        this.setVisible(true);
        setLocationRelativeTo(null);
        pack();
 
        
    }// </editor-fold>                        
                                                                                        
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JComboBox<String> jComboBoxClasificacion;
    private javax.swing.JLabel jLabelClasificacion;
    private javax.swing.JLabel jLabelFuncionalidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelRequisitos;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JRadioButton jRadioButtonAlquiler;
    private javax.swing.JRadioButton jRadioButtonPago;
    private javax.swing.JTextField jTextFieldClasificacion;
    private javax.swing.JTextField jTextFieldFuncionalidadPrograma;
    private javax.swing.JTextField jTextFieldNombrePrograma;
    private javax.swing.JTextField jTextFieldPrecioPrograma;
    private javax.swing.JTextField jTextFieldRequisitosPrograma;
    private javax.swing.JTextField jTextFieldVersionPrograma;
    // End of variables declaration                   
}