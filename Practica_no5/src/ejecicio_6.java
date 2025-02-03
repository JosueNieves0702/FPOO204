import java.util.Scanner;

public class ejecicio_6 {

    public static void main(String[] args) {

        String operacion;
        int monto;
        int saldo = 0;
        String bitacora = "";
        boolean fin = false;
        Scanner sc = new Scanner(System.in);


        while (!fin) {
            System.out.print("Introduce la operacion (D para depósito, R para retiro, fin para salir): ");
            operacion = sc.next();
            
            if (operacion.equalsIgnoreCase("fin")) {  
                fin = true;
            } else {
                System.out.print("Introduce el monto: ");
                monto = sc.nextInt();
                
                if (operacion.equalsIgnoreCase("D")) {
                    saldo += monto;
                } else if (operacion.equalsIgnoreCase("R")) {
                    saldo -= monto;
                } else {
                    System.out.println("Operación no válida.");
                    continue;
                }
                
                bitacora += operacion + " " + monto + "\n";
                System.out.println("Saldo actual: " + saldo);
            }
        }
        
        System.out.println("\nBitacora de operaciones:");
        System.out.println(bitacora);
        System.out.println("Saldo final: " + saldo);

        sc.close();
    }
}

