package views;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class ViewHC5 extends javax.swing.JInternalFrame{

    //Aqui declaramos un objeto de tipo JscrollPane    
    private final JScrollPane barraDesplazamientoHC2;
        
    public ViewHC5() {
       
        initComponents();
        barraDesplazamientoHC2=new JScrollPane(contenedorPrincipal);
        getContentPane().add(barraDesplazamientoHC2, BorderLayout.CENTER);  
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        contenedorPrincipal.setBackground(new java.awt.Color(0, 153, 153));
        contenedorPrincipal.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PANEL 5");
        contenedorPrincipal.add(jLabel3, new java.awt.GridBagConstraints());

        getContentPane().add(contenedorPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables



}