import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
       int pesoPayaso = 112;
        int pesoMuneca = 75;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numero de payasos:");
        int numPayasos = sc.nextInt(); 
        
        System.out.println("ingrese numero de muñecas:");
        int numMunecas = sc.nextInt(); 

        int pesoTotal = (pesoPayaso * numPayasos) + (pesoMuneca * numMunecas);

        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos");
    }
}
