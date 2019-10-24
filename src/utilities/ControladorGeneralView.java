package utilities;

import java.awt.GridBagConstraints;
import javax.swing.JComponent;

/**
* Clase ControladorGeneralView perteneciente al paquete utilities, contiene metodos generales que se pueden utilizar en todas las interfaces graficas. 
* @author Arca7 Technologies.
* @version 1.1
*/
public class ControladorGeneralView {

    /**
     * Metodo que permitira agregar un componente hijo a un componente padre por ejemplo agregar los respectivos formularios 
     * que se van a utilizar, utilizamos un layout de tipo GridBagLayout para agregar los respectivos componentes.
     * @param componentFather hace referencia al componente que contendra los componentes hijos que se agregaran.
     * @param componentSon hace referencia a los componentes  a agregar a un contenedor principal. 
     */
    public static void addComponentToContainer(JComponent componentFather, JComponent componentSon){
        
        GridBagConstraints config = new GridBagConstraints();

        config.gridx=0;
        config.gridy=0;
        config.gridwidth=1;
        config.gridheight=1;
        config.weightx=1.0;
        config.weighty=1.0;        
        config.anchor = GridBagConstraints.CENTER;
        config.fill = GridBagConstraints.BOTH;
        componentFather.add(componentSon, config);
        componentSon.setVisible(false);
        
    }

    /**
     * Metodo para cambiar el estado de visibilidad de un componente.
     * @param component hace referencia al componente que cambiara el estado de visibilidad.
     * @param state contendra el valor referente a la visibilidad true=estará visible false=se ocultara el componente.
     */
    public static void changeState(JComponent component, boolean state){
        
        if(!state){
            component.setVisible(true);            
        }else{
            component.setVisible(false);                        
        }
        
    }

    /**
     * Metodo que permitira habilitar o deshabilitar un componente.
     * @param component hace referencia al componente que se desea deshabilitar/habilitar.
     * @param state dependiendo el valor de la variable se habilitara o deshabilitara el componente. true=habilitado, false=deshabilitado.
     */
    public static void changeStateEnabledComponent(JComponent component, boolean state){
        component.setEnabled(state);
    }
    

}
