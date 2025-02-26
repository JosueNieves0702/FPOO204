public class vehiculo {
    private String placa;
    private String modelo;
    private double capacidad;
    private conductor conductor;

    public vehiculo(String placa, String modelo, double capacidad) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public vehiculo(String placa, String modelo, double capacidad, conductor conductor) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.conductor = conductor;
    }
    public conductor getConductor() {
        return conductor;
    }

    public void setConductor(conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
        } else {
            throw new UnsupportedOperationException("El conductor ya ha sido asignado y no puede ser modificado.");
        }
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

}
