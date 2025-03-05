import javax.swing.JOptionPane;

public class registro_envios {
    private String codigoEnvio;
    private String Destino;
    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    private double peso;

    public registro_envios(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        Destino = destino;
    }

    public registro_envios(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        Destino = destino;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static registro_envios crearEnvio() {
        String[] opciones = {"Código y Destino", "Código, Destino y Peso"};
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Crear Envío",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (opcion == 0) {
            String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código de envío:");
            String destino = JOptionPane.showInputDialog("Ingrese el destino:");
            return new registro_envios(codigoEnvio, destino);
        } else if (opcion == 1) {
            String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código de envío:");
            String destino = JOptionPane.showInputDialog("Ingrese el destino:");
            String pesoStr = JOptionPane.showInputDialog("Ingrese el peso:");
            double peso = Double.parseDouble(pesoStr);
            return new registro_envios(codigoEnvio, destino, peso);
        } else {
            JOptionPane.showMessageDialog(null, "Opción no válida.");
            return null;
        }
    }
}
