import javax.swing.*;

public class Banco {
    public static void main(String[] args) {
        
        cuenta cuenta1 = new cuenta("123456789","Juan perez",18,1000);
        cuenta cuenta2 = new cuenta("987654321","Maria Lopez",25,1500);

        
        boolean salir = false;

        
        do {
            String menu = "Seleccione una opción:\n" +
                          "1. Consultar Saldo\n" +
                          "2. Ingresar Efectivo\n" +
                          "3. Retirar Efectivo\n" +
                          "4. Depositar a Otra Cuenta\n" +
                          "5. Salir";
            String opcion = JOptionPane.showInputDialog(null, menu, "Banco", JOptionPane.QUESTION_MESSAGE);

            
            if (opcion == null) {
                salir = true;
                JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio. ¡Hasta luego!");
            } else {
                switch (opcion) {
                    case "1":
                        
                        String numCuentaConsulta = JOptionPane.showInputDialog("Ingrese el número de cuenta para consultar el saldo:");
                        if (numCuentaConsulta != null) {
                            if (numCuentaConsulta.equals(cuenta1.getNumCuenta())) {
                                cuenta1.consultarSaldo(numCuentaConsulta);
                            } else if (numCuentaConsulta.equals(cuenta2.getNumCuenta())) {
                                cuenta2.consultarSaldo(numCuentaConsulta);
                            } else {
                                JOptionPane.showMessageDialog(null, "Número de cuenta no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        break;
                    case "2":
                        
                        String numCuentaAbono = JOptionPane.showInputDialog("Ingrese el número de cuenta a abonar:");
                        if (numCuentaAbono != null) {
                            String montoIngreso = JOptionPane.showInputDialog("Ingrese el monto a depositar:");
                            if (montoIngreso != null) {
                                try {
                                    double montoIngresoDouble = Double.parseDouble(montoIngreso);
                                    if (numCuentaAbono.equals(cuenta1.getNumCuenta())) {
                                        cuenta1.ingresarEfectivo(numCuentaAbono, montoIngresoDouble);
                                    } else if (numCuentaAbono.equals(cuenta2.getNumCuenta())) {
                                        cuenta2.ingresarEfectivo(numCuentaAbono, montoIngresoDouble);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Número de cuenta no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Monto inválido", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                        break;
                    case "3":
                        
                        String numCuentaRetiro = JOptionPane.showInputDialog("Ingrese el número de cuenta para retirar:");
                        if (numCuentaRetiro != null) {
                            String montoRetiro = JOptionPane.showInputDialog("Ingrese el monto a retirar:");
                            if (montoRetiro != null) {
                                try {
                                    double montoRetiroDouble = Double.parseDouble(montoRetiro);
                                    if (numCuentaRetiro.equals(cuenta1.getNumCuenta())) {
                                        cuenta1.retirarEfectivo(numCuentaRetiro, montoRetiroDouble);
                                    } else if (numCuentaRetiro.equals(cuenta2.getNumCuenta())) {
                                        cuenta2.retirarEfectivo(numCuentaRetiro, montoRetiroDouble);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Número de cuenta no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Monto inválido", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                        break;
                    case "4":
                        
                        String numCuentaOrigen = JOptionPane.showInputDialog("Ingrese el número de cuenta de origen:");
                        if (numCuentaOrigen != null) {
                            String numCuentaDestino = JOptionPane.showInputDialog("Ingrese el número de cuenta de destino:");
                            if (numCuentaDestino != null) {
                                String montoDeposito = JOptionPane.showInputDialog("Ingrese el monto a transferir:");
                                if (montoDeposito != null) {
                                    try {
                                        double montoDepositoDouble = Double.parseDouble(montoDeposito);
                                        if (numCuentaOrigen.equals(cuenta1.getNumCuenta()) && numCuentaDestino.equals(cuenta2.getNumCuenta())) {
                                            cuenta1.depositarACuenta(numCuentaOrigen, numCuentaDestino, montoDepositoDouble, cuenta2);
                                        } else if (numCuentaOrigen.equals(cuenta2.getNumCuenta()) && numCuentaDestino.equals(cuenta1.getNumCuenta())) {
                                            cuenta2.depositarACuenta(numCuentaOrigen, numCuentaDestino, montoDepositoDouble, cuenta1);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Números de cuenta no válidos", "Error", JOptionPane.ERROR_MESSAGE);
                                        }
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Monto inválido", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                        }
                        break;
                    case "5":
                        
                        salir = true;
                        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio. ¡Hasta luego!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } while (!salir); 
    }
}