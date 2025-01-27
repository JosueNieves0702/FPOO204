import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese un número entero: ");
        int num = sc.nextInt();
        
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma += i;
            System.out.println("Sumando " + i + ", suma actual: " + suma);
        }
        
        System.out.println("La suma de todos los enteros desde 1 hasta " + num + " es: " + suma);
        
        sc.close();
    }
}