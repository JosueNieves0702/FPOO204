import java.util.Random;

public class GeneradorPassword {
    private int longitud;
    private boolean incluirMayusculas;
    private boolean incluirCaracteresEsp;

    

    public void setIncluirCaracteresEsp(boolean incluirCaracteresEsp) {
        this.incluirCaracteresEsp = incluirCaracteresEsp;
    }

    public GeneradorPassword(int longitud, boolean incluirMayusculas, boolean incluirCaracteresEsp) {
        this.longitud = longitud;
        this.incluirMayusculas = incluirMayusculas;
        this.incluirCaracteresEsp = incluirCaracteresEsp;
    }

    public String generarPassword() {
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        if (incluirMayusculas) {
            caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (incluirCaracteresEsp) {
            caracteres += "!@#$%^&*()_+";
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(index));
        }

        return password.toString();
    }

    public String comprobarFortaleza(String password) {
        int fortaleza = 0;

        if (password.length() >= 8) {
            fortaleza++;
        }
        if (password.matches(".*[A-Z].*")) {
            fortaleza++;
        }
        if (password.matches(".*[!@#$%^&*()_+].*")) {
            fortaleza++;
        }

        if (password.length() < 8) {
            return "Débil";
        } else if (password.length() == 8) {
            return "Media";
        } else {
            return "Fuerte";
        }
    }
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isIncluirMayusculas() {
        return incluirMayusculas;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public boolean isIncluirCaracteresEsp() {
        return incluirCaracteresEsp;
    }
}