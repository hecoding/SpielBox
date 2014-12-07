package Presentacion;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

import Presentacion.biblioteca.JPanelBiblioteca;
import Presentacion.usuarios.JPanelUsuarios;
import Presentacion.videojuego.JPanelVideojuego;

/**
 *
 * @author usuario_local
 */
public class MainWindow extends javax.swing.JFrame {
    private javax.swing.JPanel jPanel4;
    private JPanelBiblioteca jPanelBibliotecas;
    private JPanelUsuarios jPanelUsuarios;
    private JPanelVideojuego jPanelVideojuego;
    private JTabbedPane panelCambiante;

    // End of variables declaration
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        panelCambiante = new javax.swing.JTabbedPane();
        jPanelVideojuego = new JPanelVideojuego();
        jPanelUsuarios = new JPanelUsuarios();
        jPanelBibliotecas = new JPanelBiblioteca();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SpielBox");

        jPanel4.setBackground(new java.awt.Color(34, 88, 154));

        panelCambiante.setBackground(new java.awt.Color(255, 255, 255));

        jPanelVideojuego.setBackground(new java.awt.Color(255, 255, 255));

        panelCambiante.addTab("Videojuegos", jPanelVideojuego);

        jPanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        panelCambiante.addTab("Usuarios", jPanelUsuarios);

        jPanelBibliotecas.setBackground(new java.awt.Color(255, 255, 255));

        panelCambiante.addTab("Bibliotecas", jPanelBibliotecas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCambiante)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCambiante)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        //Configuramos el primer tabbed, el primer par�metro indica el �ndice.
        panelCambiante.setTitleAt(0, "Videojuego");
        panelCambiante.setIconAt(0, createImageIcon("images/videojuego.png"));
        panelCambiante.setToolTipTextAt(0, "Gesti�n Videojuego");
        //Configuramos el segundo tabbed, el primer par�metro indica el �ndice.
        panelCambiante.setTitleAt(1, "Usuarios");
        panelCambiante.setIconAt(1, createImageIcon("images/usuarios.png"));
        panelCambiante.setToolTipTextAt(1, "Gesti�n Usuarios");

        
        //Configuramos el tercer tabbed, el primer par�metro indica el �ndice.
        panelCambiante.setTitleAt(2, "Biblioteca");
        panelCambiante.setIconAt(2, createImageIcon("images/biblioteca.png"));
        panelCambiante.setToolTipTextAt(2, "Gesti�n Biblioteca"); 
        this.setLocationRelativeTo(null);
    
    }// </editor-fold>                                                                          

    //M�todo que nos permitir� cargar una imagen como icono pas�ndole una url
    private static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = MainWindow.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Archivo no encontrado: " + path);
            return null;
        }
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new MainWindow().setVisible(true);
            }
        });
    }

                   

    
}
