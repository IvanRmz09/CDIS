package Classes;

/**
 *
 * @author ivanr
 */
public class Empleado {
    //Atributos
    private String name = "";
    private String cedula = "";
    private int edad = 0;
    private String estCivil = "";
    private double salario = 0;
    
    //Metodos
    //Constructor
    public Empleado(String name, String cedula, int edad, String estCivil, double salario) {
        this.name = name;
        this.cedula = cedula;
        this.edad = edad;
        this.estCivil = estCivil;
        this.salario = salario;
    }
    
    //Setterz
    public void setName(String name) {
        this.name = name;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public double getSalario() {
        return salario;
    }
    
    public void asignarClasificacion(){
        if(getEdad() <= 21){
            System.out.println("Clasificacion: Principante");
        }else if(getEdad() >= 22 && getEdad() <= 35){
            System.out.println("Clasificacion: Intermedio");
        }else if(getEdad() > 35){
            System.out.println("Clasificacion: Senior");
        }
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+getName()+
                "\nCedula: "+getCedula()+
                "\nEdad: "+getEdad()+
                "\nEstado Civil: "+getEstCivil()+
                "\nSalario: "+getSalario());
        asignarClasificacion();
    }
}
