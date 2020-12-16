/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author ivanr
 */
public class Programador extends Empleado{
    private int lineasHora;
    private String lenguaje;
    
    //Constructor
    public Programador(String name, String cedula, int edad, String estCivil,
            double salario, int lineasHora, String lenguaje) {
        super(name, cedula, edad, estCivil, salario);
        this.lineasHora = lineasHora;
        this.lenguaje = lenguaje;
    }
    
    //Getters
    public int getLineasHora() {
        return lineasHora;
    }

    public String getLenguaje() {
        return lenguaje;
    }
    
    //Setters
    public void setLineasHora(int lineasHora) {
        this.lineasHora = lineasHora;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    //Polimorfismo de la funcion imprimir de empleado
    @Override
    public void imprimir(){
        System.out.println("Nombre: "+getName()+
                "\nCedula: "+getCedula()+
                "\nEdad: "+getEdad()+
                "\nEstado Civil: "+getEstCivil()+
                "\nSalario: "+getSalario()+
                "\nLineas de Codigo por Hora: "+getLineasHora()+
                "\nLenguaje de Programacion Dominante: "+getLenguaje());
        asignarClasificacion();
    }
}
