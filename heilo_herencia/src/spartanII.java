public class spartanII extends spartan {
    public spartanII(String nombre, int salud, String arma, int escudo) {
        super(nombre, salud, arma, 150);
    }

    public void usarManejoAvanzado(){
        System.out.println("El spartan "+nombre+" tiene escudo extra y tacticas en combate avanzadas.");
    }
}
