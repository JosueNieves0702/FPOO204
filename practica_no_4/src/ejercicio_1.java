import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) throws Exception {
        String contra = "joselito123";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la contraseña: ");
        String userInput = scanner.nextLine();

        if (contra.equals(userInput)) {
            System.out.println("La contraseña es correcta.");
        } else {
            System.out.println("La contraseña es incorrecta.");
        }

        scanner.close();
    }
}