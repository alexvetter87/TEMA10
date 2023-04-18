import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
        public static void main(String []args) throws Exception{

        
            Integer resultado;
            while (true)
            try{
                System.out.print("Introducir entero:");
                resultado= new Scanner(System.in).nextInt();
                break;

            } catch (InputMismatchException ex) {
                System.out.println("Tipo erróneo");
            }
        }
        
    }

