import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String cadena_texto = sc.nextLine().toLowerCase();
        boolean esPalindromo = true;
        int longitud = cadena_texto.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (cadena_texto.charAt(i) != cadena_texto.charAt(longitud - i - 1)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es palíndroma.");
        } else {
            System.out.println("La palabra no es palíndroma.");
        }

        sc.close();
    }
}
