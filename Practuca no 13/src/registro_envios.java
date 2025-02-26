import javax.swing.JOptionPane;

public class registro_envios {
  private String codigoEnvio;
  private String Destino;
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
    String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código de envío:");
    String destino = JOptionPane.showInputDialog("Ingrese el destino:");
    String pesoStr = JOptionPane.showInputDialog("Ingrese el peso:");
    double peso = Double.parseDouble(pesoStr);
    return new registro_envios(codigoEnvio, destino, peso);
}
  
  
}
