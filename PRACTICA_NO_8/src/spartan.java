public class spartan {
    //atributos
    private  String nombre;
    private int salud;
    private int escudo;
    private String arma_principal;

    

    public spartan(String nombre, int salud, int escudo, String arma_principal) {
        this.nombre = nombre;
        this.salud = salud;
        this.escudo = escudo;
        this.arma_principal = arma_principal;
    }

    //metodos
    public void mostarInfo(){
        System.out.println("-----------información del spartan--------------\nNombre: "+nombre+"\nArma principal: "+arma_principal+"\nSalud: "+salud+
        "\nEscudo: "+escudo+"\n------------------------------------------------\n");
    }

    public void atacar(String enemigo){
        System.out.println(nombre+" ataca a "+enemigo+" con "+arma_principal+".");
    }

    public void recargarArma(int municiones){
        int restante= 10;
        int total = restante+municiones;
        System.out.println("el arma "+arma_principal+" tiene "+total+" balas.");
    }

    public void correr(boolean status ){
        if(status){
            System.out.println("el spartan: "+nombre+" está corriendo.");
        }else{
            System.out.println("el spartan: "+nombre+" se detuvo.");
        }
    }
    
    private void consultaCortana(){
        System.out.println("Conversacion privada ......");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArma_principal() {
        return arma_principal;
    }

    public void setArma_principal(String arma_principal) {
        this.arma_principal = arma_principal;
    }

    
}