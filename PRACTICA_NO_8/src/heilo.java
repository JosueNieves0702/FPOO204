public class heilo {
    public static void main(String[] args) {
        //instanciamos el objeto de clase spartan.
        spartan masterchief = new spartan("paco", 100, 100, "rifle de asalto");
        spartan reach = new spartan("pedrito sola", 30, 100, "machete oxidado");

        //uso de metodos
        masterchief.mostarInfo();
        masterchief.atacar("paco casco");
        masterchief.recargarArma(109);
        masterchief.correr(true);

        reach.mostarInfo();
        reach.atacar("pozole elite");
        reach.recargarArma(69);
        reach.correr(false);
        System.out.println();

        //modificar el valor de master chief.
        masterchief.setNombre("pirata de culiacan");
        masterchief.mostarInfo();
        System.out.println();
        System.out.println("el nombre del spartan es: "+masterchief.getNombre());
        System.out.println();

        
    }
}
