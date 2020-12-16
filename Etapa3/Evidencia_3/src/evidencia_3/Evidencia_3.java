package evidencia_3;

//Librearias utilizadas
import java.util.Scanner;

/**
 *
 * @author ivanr
 */

public class Evidencia_3 {
    public static void main(String[] args) {
        boolean next = true;
        String name, estCivil, gen, ageString, ans;
        int avgAge = 0, cont = 0, avgMale = 0, avgFem = 0, avgCasados = 0,
                avgSolteros = 0;
        double resAge, resMale, resFem, resCas, resSol;
        String[][] info = new String[1000][4];
        Scanner reader = new Scanner(System.in);
        
        while(next){
            //Recopilar todos los datos de una persona
            System.out.println("Persona Num. "+ (cont+1));
            System.out.print("Ingresa el Nombre: ");
            name = reader.nextLine();
            System.out.print("Ingresa la Edad: ");
            ageString = reader.nextLine();
            System.out.print("Ingresa el Estado Civil: ");
            estCivil = reader.nextLine();
            System.out.print("Ingresa el Genero: ");
            gen = reader.nextLine();
            
            //Guardar los datos en los arreglos binarios
            info[cont][0] = name;
            info[cont][1] = ageString;
            info[cont][2] = estCivil;
            info[cont][3] = gen;            
            cont++;
            
            //Preguntar si quiere añadir a otra persona
            System.out.println("Desea agregar otra persona? ");
            System.out.println("Si/No");
            ans = reader.nextLine();
            if(ans.equals("No")){
                next = false;
            }
        }
        
        //Procesar los datos
        for (int i = 0; i < cont; i++) {
            for(int j=0; j < 4;j++){
                if(j == 1){
                    avgAge = avgAge + Integer.parseInt(info[i][j]);
                }
                if(info[i][j].equals("Hombre")){
                    avgMale+=1;
                }
                if(info[i][j].equals("Mujer")){
                    avgFem+=1;
                }
                if(info[i][j].equals("Casado")||info[i][j].equals("Casada")){
                    avgCasados+=1;
                }
            }
        }
        
        resAge = (double) avgAge/cont;
        resMale = ((double) avgMale/cont)*100;
        resFem = ((double) avgFem/cont)*100;
        avgSolteros = cont - avgCasados;
        resSol = ((double) avgSolteros/cont)*100;
        resCas = ((double) avgCasados/cont)*100;
        
        //Exponer datos
        System.out.println("Total de Personas capturadas: " + cont);
        System.out.println("Promedio de edad de las personas: " + resAge);
        System.out.println("Porcentaje de Hombres registrados: " + resMale + "%");
        System.out.println("Porcentaje de Mujeres registradas: " + resFem + "%");
        System.out.println("Porcentaje de Hombres y Mujeres Casad@s: " + resCas + "%");
        System.out.println("Porcentaje de Hombres y Mujeres Solter@s: " + resSol + "%");
    }
}
