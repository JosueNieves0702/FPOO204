import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
       
       int num;
       Scanner sc = new Scanner(System.in);
       System.out.println("ingrese el numero de la tabla a imprimir:");
       num= sc.nextInt();
        System.out.println("tabla de multiplicar del numero "+num);
        for (int i = 1; i <= num; i++) {
            int t= num*i;
            System.out.println(num+" x "+i+" = "+t);
        }
    }
}
