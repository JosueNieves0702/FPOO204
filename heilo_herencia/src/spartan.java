public class spartan extends soldado {
    private int escudo;
    public spartan (String nombre, int salud, String arma, int escudo){
        super(nombre, salud, arma);
        this.escudo = escudo;

    }

    
    public void recargarEscudo(){
        escudo = 100;
        System.out.println("El spartan "+nombre+" recargó su escudo al maximo.");
    }
    @Override
    public void recibirDaño(int daño){
        if (escudo >0){
            escudo -= daño;
            if (escudo < 0){
                salud += escudo;
                escudo = 0;
            }
            System.out.println("El spartan "+nombre+" recibio daño, Escudo: "+escudo+" salud: "+salud );

           
        }else{
            super.recibirDaño(daño);
        }
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Escudo: "+escudo);
    }   
}

