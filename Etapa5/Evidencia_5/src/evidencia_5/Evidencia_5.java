package evidencia_5;

import Classes.Empleado;
import Classes.Programador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ivanr
 */
public class Evidencia_5 {
    public static void main(String[] args) throws IOException, FormatException{
        ArrayList<Empleado> empList = new ArrayList();
        ArrayList<Programador> progList = new ArrayList();
        boolean next = true;
        String cedula, estCivil, resp, name, lenguaje;
        int edad, lineasHora;
        double salario;
        Scanner reader = new Scanner(System.in);
        
        do{
            System.out.println("");
            System.out.println("Desea agregar un empleado o un programador? ");
            System.out.println("E / P");
            resp = reader.nextLine();
            
            System.out.println("");
            System.out.println("Ingresa nombre y apellido: ");
            try{
                name = reader.nextLine();
                //Validación de que ingresó nombre y apellido
            
                while(!name.contains(" ")){
                    System.out.println("Debe ingresar nombre y apellido separados.");
                    System.out.println("Intente de nuevo: ");
                    name = reader.nextLine();
                }
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Por favor ingrese un numero");
            }
            
            
            System.out.println("");
            System.out.println("Ingresa la cedula: ");
            cedula = reader.nextLine();
            
            System.out.println("");
            System.out.println("Ingresa la edad: ");
            edad = reader.nextInt();
            //Validación de que ingresó la edad dentro del rango de 18 y 45
            while(edad<18 || edad>45){
                System.out.println("La edad es invalida.");
                System.out.println("Intente de nuevo:");
                edad = reader.nextInt();
            }
            
            System.out.println("");
            System.out.println("Ingresa estado civil:");
            estCivil = reader.nextLine();
            
            System.out.println("");
            System.out.println("Ingresa el salario:");
            salario = reader.nextDouble();
            
            if(resp.equals("P")){
                System.out.println("");
                System.out.println("Ingresa el numero de lineas de codigo por hora: ");
                lineasHora = reader.nextInt();
                System.out.println("");
                System.out.println("Ingresa el lenguaje de programacion dominante: ");
                lenguaje = reader.nextLine();
                
                //Creacion del objeto y añadirlo al ArrayList
                Programador p = new Programador(name, cedula, edad, estCivil, salario, lineasHora, lenguaje);
                progList.add(p);
            } if(resp.equals("E")){
                //Creacion del objeto y añadirlo al ArrayList
                Empleado e = new Empleado(name, cedula, edad, estCivil, salario);
                empList.add(e);
            }
            
            //Preguntar si se añade objeto nuevo
            System.out.println("");
            System.out.println("Agregar uno nuevo?"+"\nY/N");
            resp = reader.nextLine();
            if(resp.equals("N")||resp.equals("n")){
                next = false;
            }
        }while(next);
        
        //Mostrar Info Empleados
        System.out.println("----Empleados----");
        for(int i = 0; i < empList.size(); i++){
            empList.get(i).imprimir();
        }
        System.out.println(""+"\n");
        
        //Mostrar Info Programadores
        System.out.println("----Programadores----");
        for(int i = 0; i < progList.size(); i++){
            progList.get(i).imprimir();
        }
    }
}
