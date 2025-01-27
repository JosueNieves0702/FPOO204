import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese sus nombres:");
        String nombres = sc.nextLine();
        System.out.println("ingrese apellido paterno: ");
        String apellido_p = sc.nextLine();
        System.out.println("Ingrese sus apellido materno: ");
        String apellido_m = sc.nextLine();
        
        String nombreCompleto = nombres + " " + apellido_p+" "+apellido_m;
        
        
        String minusculas = nombreCompleto.toLowerCase();
        System.out.println(minusculas);
        
        
        String mayusculas = nombreCompleto.toUpperCase();
        System.out.println(mayusculas);
        
        
        String[] palabras = nombreCompleto.split(" ");
        String iniciales = "";
        for (String palabra : palabras) {
            if (palabra.length() > 0) {
            iniciales += Character.toUpperCase(palabra.charAt(0)) + ".";
            }
        }
        System.out.println(iniciales);
        
        sc.close();
    }
}