package Clases;

import evidencia_7.interfaz;

/**
 *
 * @author ivanr
 */
public class Desarrollador implements interfaz{
    private String nombre;
    private String lineasDeCodigo;

    public Desarrollador(String nombre, String lineasDeCodigo) {
        this.nombre = nombre;
        this.lineasDeCodigo = lineasDeCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLineasDeCodigo() {
        return lineasDeCodigo;
    }

    public void setLineasDeCodigo(String lineasDeCodigo) {
        this.lineasDeCodigo = lineasDeCodigo;
    }

    @Override
    public void encenderObjeto() {
        System.out.println("Soy el Desarrollador "+getNombre()+", encedi mi computadora");
    }

    @Override
    public void mostrarObjeto() {
        System.out.println("“Soy el Desarrollador "+getNombre()+", y llevo mas de " +
                            getLineasDeCodigo()+" lineas codificadas");
    }

    @Override
    public void apagarObjeto() {
        System.out.println("Soy el Desarrollador "+getNombre()+", apague mi computadora");
    }
    
    
}
