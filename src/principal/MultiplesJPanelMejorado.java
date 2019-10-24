package principal;

import views.PrincipalView;

/**
 *
 * @author JorgeLPR
 */
public class MultiplesJPanelMejorado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Cargamos Look And Feel para cambiar la apariencia de nuestra ventana JFrame*/
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                
        PrincipalView view = new PrincipalView();
        view.setVisible(true);
    }
    
}
