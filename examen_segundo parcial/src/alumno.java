import javax.swing.JOptionPane;
import java.util.Random;

public class alumno {
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String ano_nacimineto;
    private String carrera;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido_p() {
        return apellido_p;
    }
    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }
    public String getApellido_m() {
        return apellido_m;
    }
    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }
    public String getAno_nacimineto() {
        return ano_nacimineto;
    }
    public void setAno_nacimineto(String ano_nacimineto) {
        this.ano_nacimineto = ano_nacimineto;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public alumno(String nombre, String apellido_p, String apellido_m, String ano_nacimineto, String carrera) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.ano_nacimineto = ano_nacimineto;
        this.carrera = carrera;
    }


    public void pedirDatos(){
        nombre = JOptionPane.showInputDialog("Ingrese Nombre:");
        setNombre(nombre);

        apellido_p = JOptionPane.showInputDialog("Ingrese Apellido Paterno:");
        setApellido_p(apellido_p);

        apellido_m = JOptionPane.showInputDialog("Ingrese Apellido Materno:");
        setApellido_m(apellido_m);

        ano_nacimineto = JOptionPane.showInputDialog("Ingrese Año de Nacimiento:");
        setAno_nacimineto(ano_nacimineto);

        carrera = JOptionPane.showInputDialog("Ingrese Carrera:");
        setCarrera(carrera);
    }

    public void generarMatricula() {
        Random random = new Random();
        String ano_en_curso = "2025";
            String matricula = ano_en_curso.substring(2,4) + ano_nacimineto.substring(2,4) + nombre.charAt(0) + apellido_p.charAt(0) + apellido_m.charAt(0) + random.nextInt(1000) + carrera.substring(0,3).toUpperCase();
        
        JOptionPane.showMessageDialog(null, "Matricula: " + matricula);
    }
}