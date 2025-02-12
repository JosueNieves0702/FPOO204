public class spartan {
    //atributos
    public  String nombre;
    int salud;
    int escudo;
    String arma_principal;

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
}