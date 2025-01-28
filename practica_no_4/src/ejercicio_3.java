import java.util.Scanner;

public class ejercicio_3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bienvenido a Recorcholos :)\nPor favor, ingrese su edad:");
    int edad = sc.nextInt();
    if (edad<=4) {
        System.out.println("Adelante, su pase es GRATUITO.");
    
    } else if (edad > 4 && edad < 18) {
        
    }
else if (edad >= 18) {
    System.out.println("El precio de la entrada es $190.");
} else {
    System.out.println("El precio de la entrada es $110.");
}
}
}
