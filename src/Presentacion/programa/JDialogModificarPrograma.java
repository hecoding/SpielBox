package Presentacion.programa;

import javax.swing.JDialog;
import Negocio.programa.TransferProgramaAlquiler;
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
    	
    	this.setVisible(true);
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
        jButtonModificar = new javax.swing.JButton();
        jComboBoxClasificacion = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNombre.setText("Nombre");

        jLabelVersion.setText("Version");

        jLabelRequisitos.setText("Requisitos");

        jLabelClasificacion.setText("Clasificacion");

        jLabelFuncionalidad.setText("Funcionalidad");

        jLabelPrecio.setText("Precio");
        
       
        
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jComboBoxClasificacion.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[]{}));

    	for(int i = 0; i < JPanelClasificacion.getModelo().getRowCount(); ++i) {
       		jComboBoxClasificacion.addItem(JPanelClasificacion.getModelo().getValueAt(i, 1).toString());
       	}
        

        jComboBoxClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClasificacionActionPerformed(evt);
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
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(23, 23, 23)
                        .addComponent(jButtonModificar)
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

        pack();
    }// </editor-fold>                        

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
    				
    	if(JPanelPrograma.getModelo().getItem(JPanelPrograma.getTablePrograma().getSelectedRow()).getClass().equals(TransferProgramaPago.class)) {
			TransferProgramaPago nuevoPrograma = new TransferProgramaPago();
			nuevoPrograma.setNombre(""+jTextFieldNombrePrograma.getText());
			nuevoPrograma.setVersion(Float.parseFloat(jTextFieldVersionPrograma.getText()));
			nuevoPrograma.setRequisitos(""+jTextFieldRequisitosPrograma.getText());
			nuevoPrograma.setFuncionalidad(""+jTextFieldFuncionalidadPrograma.getText());
			nuevoPrograma.setClasificacion(jComboBoxClasificacion.getSelectedItem().toString());
			((TransferProgramaPago)nuevoPrograma).setPrecioFinal(Float.parseFloat(jTextFieldPrecioPrograma.getText()));
			ControladorAplicacion.getInstance().accionCommand(Eventos.MODIFICAR_PROGRAMA, nuevoPrograma);
			setVisible(false);
		} else {
			TransferProgramaAlquiler nuevoPrograma = new TransferProgramaAlquiler();
			nuevoPrograma.setNombre(""+jTextFieldNombrePrograma.getText());
			nuevoPrograma.setVersion(Float.parseFloat(jTextFieldVersionPrograma.getText()));
			nuevoPrograma.setRequisitos(""+jTextFieldRequisitosPrograma.getText());
			nuevoPrograma.setFuncionalidad(""+jTextFieldFuncionalidadPrograma.getText());
			nuevoPrograma.setClasificacion(jComboBoxClasificacion.getSelectedItem().toString());
			((TransferProgramaAlquiler)nuevoPrograma).setPrecioHora(Float.parseFloat(jTextFieldPrecioPrograma.getText()));
			ControladorAplicacion.getInstance().accionCommand(Eventos.MODIFICAR_PROGRAMA, nuevoPrograma);
			setVisible(false);
		}
    }                                            

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {                                              
        setVisible(false);
    }                                             
    
    private void jComboBoxClasificacionActionPerformed(java.awt.event.ActionEvent evt) {                                                       
    	jTextFieldClasificacion.setText(jComboBoxClasificacion.getSelectedItem().toString());
    } 

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxClasificacion;
    private javax.swing.JLabel jLabelClasificacion;
    private javax.swing.JLabel jLabelFuncionalidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelRequisitos;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JTextField jTextFieldClasificacion;
    private javax.swing.JTextField jTextFieldFuncionalidadPrograma;
    private javax.swing.JTextField jTextFieldNombrePrograma;
    private javax.swing.JTextField jTextFieldPrecioPrograma;
    private javax.swing.JTextField jTextFieldRequisitosPrograma;
    private javax.swing.JTextField jTextFieldVersionPrograma;
    // End of variables declaration                   
}
