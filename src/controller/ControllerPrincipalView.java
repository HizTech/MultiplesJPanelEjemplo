package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.ControladorGeneralView;
import views.PrincipalView;
import views.ViewHC1;
import views.ViewHC2;
import views.ViewHC3;
import views.ViewHC4;
import views.ViewHC5;

/**
 *
 * @author JorgeLPR
 */
public class ControllerPrincipalView implements ActionListener{
            
    //Creamos un objeto de la clase PrincipalView (vista principal o JFrame)
    private final PrincipalView view;

    //Creamos los objetos de las vistas(JInternalFrame) que estaran contenidos en el JFrame
    private final ViewHC1 viewHC1;
    private final ViewHC2 viewHC2;
    private final ViewHC3 viewHC3;
    private final ViewHC4 viewHC4;
    private final ViewHC5 viewHC5;
    
    public final void events(){
        view.btnAnterior.addActionListener(this);
        view.btnSiguiente.addActionListener(this);
    }
    
    /**
     * Metodo constructor por defecto parametrizado
     * @param view Hace referencia a la vista principal(PrincipalView)
     */
    public ControllerPrincipalView(PrincipalView view){
        
        this.view=view;

        /*Inicializamos clases que heredan de JInternalFrame*/
        viewHC1 = new ViewHC1();
        viewHC2 = new ViewHC2();
        viewHC3 = new ViewHC3();
        viewHC4 = new ViewHC4();
        viewHC5 = new ViewHC5();
    
        /*Agregamos los respectivos contenedores al contenedor principal (JFRAME)*/
        ControladorGeneralView.addComponentToContainer(this.view.contenedorViewJpanel, viewHC1);                                
        ControladorGeneralView.addComponentToContainer(this.view.contenedorViewJpanel, viewHC2);                                
        ControladorGeneralView.addComponentToContainer(this.view.contenedorViewJpanel, viewHC3);                                
        ControladorGeneralView.addComponentToContainer(this.view.contenedorViewJpanel, viewHC4);                                
        ControladorGeneralView.addComponentToContainer(this.view.contenedorViewJpanel, viewHC5);                       

        viewHC1.setVisible(true);                        
        view.contenedorViewJpanel.validate();                               
        disableButton();
        
        events();
        
    }
    

    private void disableButton(){
        if (viewHC1.isVisible()) {
            view.btnAnterior.setEnabled(false);
            view.btnSiguiente.setEnabled(true);
        }else if(viewHC5.isVisible()){
            view.btnAnterior.setEnabled(true);
            view.btnSiguiente.setEnabled(false);
        }else{
            view.btnAnterior.setEnabled(true);
            view.btnSiguiente.setEnabled(true);            
        }
    }
    
    
    /**
     * metodo para mostrar o ocultar las vistas del HC dependiendo el primer ITEM de la lista (listHC) deshabilitamos y habilitamos botones segun correspondan.
     */    
    private void chageViewHC(int btn){
        
        if(viewHC1.isVisible()){
            
            viewHC2.setVisible(true);
            viewHC1.setVisible(false);                        
            viewHC3.setVisible(false);
            viewHC4.setVisible(false);
            viewHC5.setVisible(false);
            
        }else if(viewHC2.isVisible()){

            viewHC1.setVisible((btn == 1));
            viewHC3.setVisible(btn == 2);            
            viewHC2.setVisible(false);
            viewHC4.setVisible(false);
            viewHC5.setVisible(false);                            
            
        }else if(viewHC3.isVisible()){

            viewHC2.setVisible((btn == 1));            
            viewHC4.setVisible(btn == 2);
            viewHC1.setVisible(false);                        
            viewHC3.setVisible(false);
            viewHC5.setVisible(false);                
            
        }else if(viewHC4.isVisible()){

            viewHC3.setVisible((btn == 1));            
            viewHC5.setVisible(btn == 2);                            
            viewHC1.setVisible(false);                        
            viewHC2.setVisible(false);
            viewHC4.setVisible(false);

        }else if(viewHC5.isVisible()){
            
            viewHC4.setVisible(true);
            viewHC2.setVisible(false);
            viewHC1.setVisible(false);                        
            viewHC3.setVisible(false);
            viewHC5.setVisible(false);                        
        
        }
            
        view.contenedorViewJpanel.validate();                       
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        Object evt = ae.getSource();
        
        if(evt.equals(view.btnAnterior)){
            
            chageViewHC(1);
            disableButton();
            
        }else if(evt.equals(view.btnSiguiente)){
            
            chageViewHC(2);
            disableButton();
        
        }        
        
    }
    
    
    
}
