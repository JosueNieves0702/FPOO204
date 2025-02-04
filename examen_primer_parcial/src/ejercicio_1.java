import java.util.*;

public class ejercicio_1 {
   //programa que solicite una palabra y que la descomponga en letras. ej. IVAN
   //resultado:letra 1: I etc.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese una palabra: ");
            String palabra = sc.nextLine();
            
            for (int i = 0; i < palabra.length(); i++) {
                System.out.print("letra " + (i + 1) + ": " + palabra.charAt(i)+"   ");
            }
            
            sc.close();
        }
    
}

