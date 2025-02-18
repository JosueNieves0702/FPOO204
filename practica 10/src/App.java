import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String longitudInput = JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (dejar vacío para 8 caracteres):");
        int longitud = longitudInput.isEmpty() ? 8 : Integer.parseInt(longitudInput);

        boolean incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean incluirCaracteresEsp = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        GeneradorPassword generador = new GeneradorPassword(longitud, incluirMayusculas, incluirCaracteresEsp);
        String password = generador.generarPassword();

        JOptionPane.showMessageDialog(null, "Contraseña generada: " + password);
        String fortaleza = generador.comprobarFortaleza(password);
        JOptionPane.showMessageDialog(null, "Fortaleza de la contraseña: " + fortaleza);
    }

}

