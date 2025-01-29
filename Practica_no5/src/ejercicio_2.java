import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();
        
        for (int i = numero; i >= 0; i--) {
            if (i != 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        scanner.close();
    }
}
