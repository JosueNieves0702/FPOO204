import java.util.*;
public class ejercicio_7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        int i = 1;
        int j;

        System.out.print("Introduce la cantidad de * de la base: ");
        num = sc.nextInt();

        
        while (i <= num) {
            j = 1;
            
            while (j <= num - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            j = 1;
            
            while (j <= i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        
        i = 1;
        j = 1;

        while (i <= 2) {
            j = 1;
            
            while (j <= num - 1) {
                System.out.print(" ");
                j++;
            }
            
            System.out.println("*");
            i++;
        }

        sc.close();
    }
}
