package Presentacion.usuarios;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelUsuarios extends JPanel{
	
	private javax.swing.JTable jTableUsuarios;
	private javax.swing.JScrollPane jScrollPaneUsuarios;
	private JButton jButtonCrearUsuario;
	private JButton jButtonModificarUsuario;
	private JButton jButtonEliminarUsuario;
	private JButton jButtonMostrarUsuario;
	
	public JPanelUsuarios(){
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		jTableUsuarios = new javax.swing.JTable();
        jButtonCrearUsuario = new javax.swing.JButton();
        jButtonModificarUsuario = new javax.swing.JButton();
        jButtonEliminarUsuario = new javax.swing.JButton();
        jButtonMostrarUsuario = new javax.swing.JButton();
        jScrollPaneUsuarios = new javax.swing.JScrollPane();
        
        
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                },
                new String [] {
                    "Nombre", "Apellidos", "Nick"
                }
            ));
            jScrollPaneUsuarios.setViewportView(jTableUsuarios);

            jButtonCrearUsuario.setText("Crear");

            jButtonModificarUsuario.setText("Modificar");

            jButtonEliminarUsuario.setText("Eliminar");

            jButtonMostrarUsuario.setText("Mostrar");

            javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(this);
            this.setLayout(jPanelUsuariosLayout);
            jPanelUsuariosLayout.setHorizontalGroup(
                jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuariosLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                    .addComponent(jScrollPaneUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanelUsuariosLayout.setVerticalGroup(
                jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                    .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jButtonCrearUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonModificarUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonMostrarUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonEliminarUsuario))
                        .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPaneUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(79, Short.MAX_VALUE))
            );
	}
}
