public class App {
    public static void main(String[] args) throws Exception {
        spartanII spII = new spartanII("Panfilo", 100, "varilla de acero",0);
        spII.mostrarInfo();
        spII.usarManejoAvanzado();
        spII.atacar("peña nieto");
        spII.recibirDaño(50);
        spII.recargarEscudo();

        spartanIII spIII = new spartanIII("AMLOGOD", 100, "abrazos",100);
        spIII.mostrarInfo();
        spIII.camuflajeActivo();
        spIII.recibirDaño(100);
        spIII.atacar("Claudia Sheinbaun");
        spIII.recibirDaño(88);

        spartanIV spIV = new spartanIV("PussyDestroyer", 50, "picahielo",45);
        spIV.mostrarInfo();
        spIV.usarPropulsores(); 
        spIV.atacar("Ricardo Arjona");
        spIV.recibirDaño(34);
        spIV.recargarEscudo();
    }
}
