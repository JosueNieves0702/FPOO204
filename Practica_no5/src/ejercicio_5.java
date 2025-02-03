import java.util.Scanner;

public class ejercicio_5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int saldo = 0;
    
            System.out.println("Escriba la bitácora de operaciones (línea vacía para finalizar):");
    
            while (true) {
                String linea = scanner.nextLine().trim();
    
                if (linea.isEmpty()) {
                    break;
                }
                String[] partes = linea.split(" ");
                if (partes.length == 2) {
                    String operacion = partes[0].toUpperCase();
                    String cantidadStr = partes[1];
    
                    
                    boolean esNumero = true;
                    for (char c : cantidadStr.toCharArray()) {
                        if (!Character.isDigit(c)) {
                            esNumero = false;
                            break;
                        }
                    }
    
                    if (esNumero) {
                        int cantidad = Integer.parseInt(cantidadStr);
    
                        if (operacion.equals("D")) {
                            saldo += cantidad; // Depósito
                        } else if (operacion.equals("R")) {
                            saldo -= cantidad; // Retiro
                        } else {
                            System.out.println("Operación no válida. Use 'D' para depositar o 'R' para retirar.");
                        }
                    } else {
                        System.out.println("Cantidad no válida. Ingrese un número entero.");
                    }
                } else {
                    System.out.println("Formato incorrecto. Use 'D cantidad' o 'R cantidad'.");
                }
            }
    
            System.out.println("\nSaldo final: " + saldo);
            scanner.close();
                scanner.close();
            }
    }

