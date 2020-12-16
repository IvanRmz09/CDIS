package evidencia_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

/**
 *
 * @author ivanr
 */
public class Evidencia_6 {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("IRM.txt");
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println("Ivan Ramirez");
            
            pw.close();
        } catch (Exception e) {
            out.println("No se pudo abrir el archivo.");
        }
        
        try{
            FileReader fr = new FileReader("IRM.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
        }catch(Exception e){
            out.println("No se pudo abrir el archivo.");
        }
    }    
}
