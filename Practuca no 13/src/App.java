import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<vehiculo> vehiculos = new ArrayList<>();
        List<conductor> conductores = new ArrayList<>();
        List<registro_envios> envios = new ArrayList<>();
        entregas entrega = new entregas();

        while (true) {
            String[] options = {"Crear Conductor", "Crear Vehículo", "Crear Envío", "Actualizar Estado de Entrega", "Ver Conductor", "Ver Vehículo", "Ver Envío", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú de Gestión",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (opcion) {
                case 0:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                    String id = JOptionPane.showInputDialog("Ingrese el ID del conductor:");
                    String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
                    conductor nuevoConductor = new conductor(nombre, id, licencia);
                    conductores.add(nuevoConductor);
                    JOptionPane.showMessageDialog(null, "Conductor creado exitosamente.");
                    break;
                case 1:
                    if (conductores.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Primero debe crear un conductor.");
                        break;
                    }
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    String capacidadStr = JOptionPane.showInputDialog("Ingrese la capacidad del vehículo:");
                    double capacidad = Double.parseDouble(capacidadStr);
                    String conductorId = JOptionPane.showInputDialog("Ingrese el ID del conductor asignado:");
                    conductor conductorAsignado = conductores.stream()
                            .filter(c -> c.getID().equals(conductorId))
                            .findFirst()
                            .orElse(null);
                    if (conductorAsignado == null) {
                        JOptionPane.showMessageDialog(null, "Conductor no encontrado.");
                        break;
                    }
                    vehiculo nuevoVehiculo = new vehiculo(placa, modelo, capacidad, conductorAsignado);
                    vehiculos.add(nuevoVehiculo);
                    JOptionPane.showMessageDialog(null, "Vehículo creado exitosamente.");
                    break;
                case 2:
                    registro_envios nuevoEnvio = registro_envios.crearEnvio();
                    if (nuevoEnvio != null) {
                        envios.add(nuevoEnvio);
                        JOptionPane.showMessageDialog(null, "Envío creado exitosamente.");
                    }
                    break;
                case 3:
                    if (entrega == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe crear una entrega.");
                        break;
                    }
                    String[] estados = {"En tránsito", "Entregado"};
                    int estadoOpcion = JOptionPane.showOptionDialog(null, "Seleccione el nuevo estado:", "Actualizar Estado de Entrega",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, estados, estados[0]);
                    if (estadoOpcion >= 0 && estadoOpcion < estados.length) {
                        entrega.actualizarEstado(estados[estadoOpcion]);
                        JOptionPane.showMessageDialog(null, "Estado de entrega actualizado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                    }
                    break;
                case 4:
                    if (conductores.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay conductores creados.");
                    } else {
                        String[] opcionesConductor = {"Ver Conductor por ID", "Ver Todos los Conductores"};
                        int opcionConductor = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Ver Conductor",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesConductor, opcionesConductor[0]);
                        if (opcionConductor == 0) {
                            String idConductor = JOptionPane.showInputDialog("Ingrese el ID del conductor:");
                            conductor conductorEncontrado = conductores.stream()
                                    .filter(c -> c.getID().equals(idConductor))
                                    .findFirst()
                                    .orElse(null);
                            if (conductorEncontrado == null) {
                                JOptionPane.showMessageDialog(null, "Conductor no encontrado.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Conductor:\nNombre: " + conductorEncontrado.getNombre() + "\nID: " + conductorEncontrado.getID() + "\nLicencia: " + conductorEncontrado.getLicencia());
                            }
                        } else if (opcionConductor == 1) {
                            StringBuilder todosConductores = new StringBuilder("Conductores:\n");
                            for (conductor c : conductores) {
                                todosConductores.append("Nombre: ").append(c.getNombre()).append(", ID: ").append(c.getID()).append(", Licencia: ").append(c.getLicencia()).append("\n");
                            }
                            JOptionPane.showMessageDialog(null, todosConductores.toString());
                        }
                    }
                    break;
                case 5:
                    if (vehiculos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay vehículos creados.");
                    } else {
                        String[] opcionesVehiculo = {"Ver Vehículo por Placa", "Ver Todos los Vehículos"};
                        int opcionVehiculo = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Ver Vehículo",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesVehiculo, opcionesVehiculo[0]);
                        if (opcionVehiculo == 0) {
                            String placaVehiculo = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                            vehiculo vehiculoEncontrado = vehiculos.stream()
                                    .filter(v -> v.getPlaca().equals(placaVehiculo))
                                    .findFirst()
                                    .orElse(null);
                            if (vehiculoEncontrado == null) {
                                JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Vehículo:\nPlaca: " + vehiculoEncontrado.getPlaca() + "\nModelo: " + vehiculoEncontrado.getModelo() + "\nCapacidad: " + vehiculoEncontrado.getCapacidad() + "\nConductor: " + vehiculoEncontrado.getConductor().getNombre());
                            }
                        } else if (opcionVehiculo == 1) {
                            StringBuilder todosVehiculos = new StringBuilder("Vehículos:\n");
                            for (vehiculo v : vehiculos) {
                                todosVehiculos.append("Placa: ").append(v.getPlaca()).append(", Modelo: ").append(v.getModelo()).append(", Capacidad: ").append(v.getCapacidad()).append(", Conductor: ").append(v.getConductor().getNombre()).append("\n");
                            }
                            JOptionPane.showMessageDialog(null, todosVehiculos.toString());
                        }
                    }
                    break;
                case 6:
                    if (envios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay envíos creados.");
                    } else {
                        String[] opcionesEnvio = {"Ver Envío por Código", "Ver Todos los Envíos"};
                        int opcionEnvio = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Ver Envío",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesEnvio, opcionesEnvio[0]);
                        if (opcionEnvio == 0) {
                            String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código del envío:");
                            registro_envios envioEncontrado = envios.stream()
                                    .filter(e -> e.getCodigoEnvio().equals(codigoEnvio))
                                    .findFirst()
                                    .orElse(null);
                            if (envioEncontrado == null) {
                                JOptionPane.showMessageDialog(null, "Envío no encontrado.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Envío:\nCódigo: " + envioEncontrado.getCodigoEnvio() + "\nDestino: " + envioEncontrado.getDestino() + "\nPeso: " + envioEncontrado.getPeso());
                            }
                        } else if (opcionEnvio == 1) {
                            StringBuilder todosEnvios = new StringBuilder("Envíos:\n");
                            for (registro_envios e : envios) {
                                todosEnvios.append("Código: ").append(e.getCodigoEnvio()).append(", Destino: ").append(e.getDestino()).append(", Peso: ").append(e.getPeso()).append("\n");
                            }
                            JOptionPane.showMessageDialog(null, todosEnvios.toString());
                        }
                    }
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }
}