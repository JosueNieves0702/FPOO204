import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Introduce la altura del triángulo (entero positivo): ");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i += 2) { 
            for (int j = i; j > 0; j -= 2) {  
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
        
        scanner.close();
    }
}
