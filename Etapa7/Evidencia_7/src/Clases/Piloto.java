package Clases;

import evidencia_7.interfaz;

/**
 *
 * @author ivanr
 */
public class Piloto implements interfaz{
    private String nombre;
    private String aniosVolando;
    
    public Piloto(String nombre, String aniosVolando){
        this.nombre = nombre;
        this.aniosVolando = aniosVolando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAniosVolando() {
        return aniosVolando;
    }

    public void setAniosVolando(String aniosVolando) {
        this.aniosVolando = aniosVolando;
    }

    @Override
    public void encenderObjeto() {
        System.out.println("Soy el Piloto "+getNombre()+", encedi mi nave");
    }

    @Override
    public void mostrarObjeto() {
        System.out.println("Soy el Piloto "+getNombre()+", y llevo mas de "+
                            getAniosVolando()+" años volando");
    }

    @Override
    public void apagarObjeto() {
        System.out.println("Soy el Piloto "+getNombre()+", apague mi nave");
    }
    
    
}
