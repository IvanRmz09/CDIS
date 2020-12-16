package evidencia_1;

//librerias utilizadas
import java.util.Scanner;

/**
 *
 * @author ivanr
 */

public class Evidencia_1 {
    public static void main(String[] args) {
        //Declaracion de variables primitivas y Scanner
        String name;
        int num;
        double num2, result;
        Scanner reader = new Scanner(System.in);
        
        //Guardar nombre
        System.out.println("Ingresa tu nombre:");
        name = reader.nextLine();
        
        //Guardar numero entero
        System.out.println("Ingresa un numero entero:");
        num = reader.nextInt();
        
        //Guardar numero decimal
        System.out.println("Ingresa un numero decimal:");
        num2 = reader.nextDouble();
        
        //Suma entero y decimal
        result = num + num2;
        
        //Mostrar resultado
        System.out.println("Hola "+name+", el resultado de la suma entre "+num+
        " y "+num2+" es "+result+".");
    }
}
