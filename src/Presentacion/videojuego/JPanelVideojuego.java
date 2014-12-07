package Presentacion.videojuego;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

public class JPanelVideojuego extends JPanel{


	private JTable jTableVideojuegos;
	private JButton jButtonCrearVideojuego;
	private JButton jButtonModificarVideojuego;
	private JButton jButtonMostrarVideojuego;
	private JButton jButtonEliminarVideojuego;
	private javax.swing.JScrollPane jScrollPaneVideojuego;
	
	public JPanelVideojuego(){
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
	    jTableVideojuegos = new javax.swing.JTable();
	    jButtonCrearVideojuego = new javax.swing.JButton();
	    jButtonModificarVideojuego = new javax.swing.JButton();
	    jButtonMostrarVideojuego = new javax.swing.JButton();
	    jButtonEliminarVideojuego = new javax.swing.JButton();
	    jScrollPaneVideojuego = new javax.swing.JScrollPane();
	    
	    
        jTableVideojuegos.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null}
                },
                new String [] {
                    "Nombre", "Categoria"
                }
            ));
            jTableVideojuegos.setGridColor(new java.awt.Color(198, 201, 248));
            jTableVideojuegos.setPreferredSize(new java.awt.Dimension(225, 64));
            jTableVideojuegos.setSelectionBackground(new java.awt.Color(0, 0, 0));
            jScrollPaneVideojuego.setViewportView(jTableVideojuegos);
            


            jButtonCrearVideojuego.setText("Crear ");
            jButtonCrearVideojuego.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //jButtonCrearVideojuegoActionPerformed(evt);
                }
            });

            jButtonModificarVideojuego.setText("Modificar ");

            jButtonMostrarVideojuego.setText("Mostrar ");

            jButtonEliminarVideojuego.setText("Eliminar");

            javax.swing.GroupLayout jPanelVideojuegoLayout = new javax.swing.GroupLayout(this);
            this.setLayout(jPanelVideojuegoLayout);
            jPanelVideojuegoLayout.setHorizontalGroup(
                jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonModificarVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCrearVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMostrarVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                    .addComponent(jScrollPaneVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanelVideojuegoLayout.setVerticalGroup(
                jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                    .addGroup(jPanelVideojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jButtonCrearVideojuego)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonModificarVideojuego)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonMostrarVideojuego)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonEliminarVideojuego))
                        .addGroup(jPanelVideojuegoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPaneVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(91, Short.MAX_VALUE))
            );
	    
	}
}
