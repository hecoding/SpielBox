package Presentacion.programa;

import javax.swing.JDialog;
import Negocio.programa.TransferPrograma;
import Presentacion.programa.JPanelPrograma;
import Presentacion.controlador.ControladorAplicacion;
import Presentacion.controlador.Eventos;

public class JDialogMostrarPrograma extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JDialogMostrarPrograma(){
		
		initComponents();
	}

		private void initComponents() {

	        jLabelNombre = new javax.swing.JLabel();
	        jLabelVersion = new javax.swing.JLabel();
	        jLabelRequisitos = new javax.swing.JLabel();
	        jLabelFuncionalidad = new javax.swing.JLabel();
	        jLabelDescuento = new javax.swing.JLabel();
	        jLabelNombrePrograma = new javax.swing.JLabel();
	        jLabelVersionPrograma = new javax.swing.JLabel();
	        jLabelRequisitosPrograma = new javax.swing.JLabel();
	        jLabelFuncionalidadPrograma = new javax.swing.JLabel();
	        jLabelDescuentoPrograma = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

	        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabelNombre.setText("Nombre");

	        jLabelVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabelVersion.setText("Version");

	        jLabelRequisitos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabelRequisitos.setText("Requisitos");

	        jLabelFuncionalidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabelFuncionalidad.setText("Funcionalidadname");

	        jLabelDescuento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabelDescuento.setText("Descuento");
	        
	        // Relleno de tabla
	        TransferPrograma showPrograma = (TransferPrograma) JPanelPrograma.getTableModel().getItem(JPanelPrograma.getTablePrograma().getSelectedRow());
	        
	        ControladorAplicacion.getInstance().accionCommand(Eventos.MOSTRAR_PROGRAMA, showPrograma);
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
	                        .addComponent(jLabelFuncionalidad)
	                        .addGap(0, 0, Short.MAX_VALUE))
	                    .addComponent(jLabelVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelRequisitos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jLabelVersionPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelRequisitosPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelFuncionalidadPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelNombrePrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelDescuentoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(165, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(21, 21, 21)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jLabelNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jLabelVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabelVersionPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabelRequisitos)
	                            .addComponent(jLabelRequisitosPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addComponent(jLabelFuncionalidad))
	                    .addComponent(jLabelFuncionalidadPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jLabelDescuento)
	                    .addComponent(jLabelDescuentoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(34, Short.MAX_VALUE))
	        );

	        setLocationRelativeTo(null);
	        pack();
		}
		
	    private javax.swing.JLabel jLabelVersion;
	    private javax.swing.JLabel jLabelVersionPrograma;
	    private javax.swing.JLabel jLabelDescuento;
	    private javax.swing.JLabel jLabelDescuentoPrograma;
	    private javax.swing.JLabel jLabelRequisitos;
	    private javax.swing.JLabel jLabelRequisitosPrograma;
	    private javax.swing.JLabel jLabelFuncionalidad;
	    private javax.swing.JLabel jLabelFuncionalidadPrograma;
	    private javax.swing.JLabel jLabelNombre;
	    private javax.swing.JLabel jLabelNombrePrograma;
}
