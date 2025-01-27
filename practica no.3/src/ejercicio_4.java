import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");

        String nombre = scanner.nextLine();

        String nombreMayusculas = nombre.toUpperCase();

        int numeroLetras = nombre.length();
        
        System.out.println(nombreMayusculas + " tiene " + numeroLetras + " letras.");
        scanner.close();
    }
}
