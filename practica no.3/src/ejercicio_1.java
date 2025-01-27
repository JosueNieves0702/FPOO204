import java.util.*;
public class ejercicio_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido:\nIngrese costo por hora:");
        double cost_h = sc.nextDouble();
        System.out.println("ingrese numero de horas trabajadas:");
        int horas= sc.nextInt();
        double nomina=cost_h*horas;
        System.out.println("Su nomina total es de: "+nomina+" MXN");

    }
}