package evidencia_2;

//Librerias utilizadas
import java.util.Scanner;

/**
 *
 * @author ivanr
 */


public class Evidencia_2 {
    public static void main(String[] args) {
        //Declaracion de variables primitivas y Scanner
        int radio;
        Scanner reader = new Scanner(System.in);
        
        //Obtener y guardar radio
        System.out.print("Ingresa el radio: ");
        radio = reader.nextInt();
        
        //Calcular y mostrar circunferencia
        System.out.println("Circunferencia: " + calcularCircunferencia(radio)
        + " unid");
        
        //Calcular y mostrar area
        System.out.println("Area: " + calcularArea(radio) + " unid^2");
    }
    
    //Funcion para calcular circunferencia
    static float calcularCircunferencia(int radio){
        float result;
        result = (float) (Math.PI * (radio*2));
        return result;
    }
    
    //Funcion para calcular area
    static float calcularArea(int radio){
        float result;
        result = (float) (Math.PI * (radio^2));
        return result;
    }
}

