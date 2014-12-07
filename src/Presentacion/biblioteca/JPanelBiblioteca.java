package Presentacion.biblioteca;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JPanelBiblioteca extends JPanel{

	private JScrollPane jScrollPaneBiblioteca;
	private JTable jTableBiblioteca;
	private JComboBox jComboBoxUsuarios;
	private JButton jButtonCrearBibliotecaUsuario;
	private JButton jButtonModificarBibliotecaUsuario;
	private JButton jButtonEliminarBibliotecaUsuario;
	private JButton jButtonMostrarBibliotecaUsuario;
	private JLabel labelUsuarios;
	private JButton jButtonAnyadirVideojuegoBiblioteca;

	public JPanelBiblioteca(){
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
        jScrollPaneBiblioteca = new javax.swing.JScrollPane();
        jTableBiblioteca = new javax.swing.JTable();
        jComboBoxUsuarios = new javax.swing.JComboBox();
        jButtonCrearBibliotecaUsuario = new javax.swing.JButton();
        jButtonModificarBibliotecaUsuario = new javax.swing.JButton();
        jButtonEliminarBibliotecaUsuario = new javax.swing.JButton();
        jButtonMostrarBibliotecaUsuario = new javax.swing.JButton();
        labelUsuarios = new javax.swing.JLabel();
        jButtonAnyadirVideojuegoBiblioteca = new javax.swing.JButton();
        
        
        jTableBiblioteca.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null}
                },
                new String [] {
                    "ID", "Nombre"
                }
            ));
            jScrollPaneBiblioteca.setViewportView(jTableBiblioteca);

            jComboBoxUsuarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario 1", "Usuario 2", "Usuario 3", "Usuario 4" }));

            jButtonCrearBibliotecaUsuario.setText("Crear Biblioteca a usuario");

            jButtonModificarBibliotecaUsuario.setText("Modificar Biblioteca de usuario");

            jButtonEliminarBibliotecaUsuario.setText("Eliminar Biblioteca de usuario");

            jButtonMostrarBibliotecaUsuario.setText("Mostrar Biblioteca de usuario");

            labelUsuarios.setText("Usuarios:");

            jButtonAnyadirVideojuegoBiblioteca.setText("Añadir Videojuego a Biblioteca");

            javax.swing.GroupLayout jPanelBibliotecasLayout = new javax.swing.GroupLayout(this);
            this.setLayout(jPanelBibliotecasLayout);
            jPanelBibliotecasLayout.setHorizontalGroup(
                jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBibliotecasLayout.createSequentialGroup()
                    .addGroup(jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                            .addGroup(jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(jComboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(labelUsuarios)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                            .addGap(0, 27, Short.MAX_VALUE)
                            .addGroup(jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonMostrarBibliotecaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAnyadirVideojuegoBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonEliminarBibliotecaUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCrearBibliotecaUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonModificarBibliotecaUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(46, 46, 46)))
                    .addComponent(jScrollPaneBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanelBibliotecasLayout.setVerticalGroup(
                jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                    .addGroup(jPanelBibliotecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPaneBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelBibliotecasLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(labelUsuarios)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)
                            .addComponent(jButtonCrearBibliotecaUsuario)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonModificarBibliotecaUsuario)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonEliminarBibliotecaUsuario)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonMostrarBibliotecaUsuario)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonAnyadirVideojuegoBiblioteca)))
                    .addContainerGap(66, Short.MAX_VALUE))
            );
	}
}
