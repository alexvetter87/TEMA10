import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader in = null;
        try{
            /*¿porque me devuelve el error: Numeros.txt (El sistema no puede encontrar el archivo especificado)? */
            in = new BufferedReader(new FileReader("C:\\Users\\JAVA\\JAVA\\TEMA 10\\Ejercicio10_5\\src\\Numeros.txt"));
            Scanner s;
            double numero;
            double suma =0;
            String linea = in.readLine();
            while (linea!= null){
                s= new Scanner(linea).useLocale(Locale.US);
                if (s.hasNextDouble()) {
                    numero = s.nextDouble();
                    suma += numero;
                }
                linea = in.readLine();
                
            }
            System.out.println("suma:"+suma);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }finally{
            if (in != null){
                try{
                    in.close();

                }catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
