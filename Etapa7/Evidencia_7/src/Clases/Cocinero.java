package Clases;

import evidencia_7.interfaz;

/**
 *
 * @author ivanr
 */
public class Cocinero implements interfaz{
    private String nombre;
    private String horasEnEstufa;

    public Cocinero(String nombre, String horasEnEstufa) {
        this.nombre = nombre;
        this.horasEnEstufa = horasEnEstufa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorasEnEstufa() {
        return horasEnEstufa;
    }

    public void setHorasEnEstufa(String horasEnEstufa) {
        this.horasEnEstufa = horasEnEstufa;
    }

    @Override
    public void encenderObjeto() {
        System.out.println("Soy el Cocinero "+getNombre()+", encendi mi estufa");
    }

    @Override
    public void mostrarObjeto() {
        System.out.println("Soy el Cocinero "+getNombre()+", llevo mas de "+
                            getHorasEnEstufa()+" horas en la estufa");
    }

    @Override
    public void apagarObjeto() {
        System.out.println("Sou¿y el Cocinero "+getNombre()+", apague mi estufa");
    }
    
    
}
