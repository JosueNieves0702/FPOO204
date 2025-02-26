public class conductor {
    private String nombre;
    private String ID;
    private String licencia;
    
   
    public conductor(String nombre, String iD, String licencia) {
        this.nombre = nombre;
        ID = iD;
        this.licencia = licencia;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public String getID() {
        return ID;
    }
    public String getLicencia() {
        return licencia;
    }

}
