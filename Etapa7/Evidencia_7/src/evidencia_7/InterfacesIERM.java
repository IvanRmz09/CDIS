package evidencia_7;

import Clases.Cocinero;
import Clases.Desarrollador;
import Clases.Piloto;

/**
 *
 * @author ivanr
 */
public class InterfacesIERM {
    public static void main(String[] args) {
        Piloto p = new Piloto("Rodolfo", "350");
        Desarrollador d = new Desarrollador("Ivan", "400");
        Cocinero c = new Cocinero("Miguel", "500");
        
        System.out.println("Metodo Encender Objeto:");
        p.encenderObjeto();
        d.encenderObjeto();
        c.encenderObjeto();
        System.out.println("");
        
        System.out.println("Metodo Mostrar Objeto:");
        p.mostrarObjeto();
        d.mostrarObjeto();
        c.mostrarObjeto();
        System.out.println("");
        
        System.out.println("Metodo Apagar Objeto:");
        p.apagarObjeto();
        d.apagarObjeto();
        c.apagarObjeto();
        
    }
}
