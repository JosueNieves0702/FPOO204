import javax.swing.*;

public class cuenta {
    public String numCuenta;
    public String titular;
    public int edad;
    public double saldo;

    
    public void consultarSaldo(String numCuentaConsulta) {
        if (this.numCuenta.equals(numCuentaConsulta)) {
            JOptionPane.showMessageDialog(null, "Saldo de la cuenta " + numCuentaConsulta + ": $" + saldo, "Consulta de saldo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Número de cuenta incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ingresarEfectivo(String numCuentaAbono, double monto) {
        if (this.numCuenta.equals(numCuentaAbono)) {
            if (monto > 0) {
                saldo += monto;
                JOptionPane.showMessageDialog(null, "Transacción exitosa: Ingresar Saldo\nSaldo actualizado: $" + saldo, "Ingresar Saldo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Monto inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de cuenta incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void retirarEfectivo(String numCuentaRetiro, double monto) {
        if (this.numCuenta.equals(numCuentaRetiro)) {
            if (monto > 0 && monto <= saldo) {
                saldo -= monto;
                JOptionPane.showMessageDialog(null, "Transacción exitosa: Retirar Efectivo\nSaldo actualizado: $" + saldo, "Retirar Efectivo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Monto inválido o saldo insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de cuenta incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public void depositarACuenta(String numCuentaOrigen, String numCuentaDestino, double monto, cuenta cuentaDestino) {
        if (this.numCuenta.equals(numCuentaOrigen)) {
            if (monto > 0 && monto <= saldo) {
                saldo -= monto;
                cuentaDestino.saldo += monto;
                JOptionPane.showMessageDialog(null, "Transacción exitosa: Depósito a otra cuenta\nSaldo actualizado en cuenta " + numCuentaOrigen + ": $" + saldo +
                        "\nSaldo actualizado en cuenta " + numCuentaDestino + ": $" + cuentaDestino.saldo, "Depositar a Cuenta", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Monto inválido o saldo insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de cuenta origen incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}