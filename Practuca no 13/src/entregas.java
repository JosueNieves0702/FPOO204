import javax.swing.JOptionPane;

public class entregas {
    private String estado;

    public entregas() {
        this.estado = "Pendiente";
    }

    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Estado no válido. Solo se permite 'En tránsito' o 'Entregado'.");
        }
    }
}
