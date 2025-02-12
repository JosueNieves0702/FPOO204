public class heilo {
    public static void main(String[] args) {
        //instanciamos el objeto de clase spartan.
        spartan masterchief = new spartan();
        spartan reach = new spartan();

        //asignamos los atributos del objeto.
        masterchief.nombre = "John 117";
        masterchief.salud = 100;
        masterchief.escudo = 90;
        masterchief.arma_principal = "rifle de asalto";

        reach.nombre = "pedrito";
        reach.salud = 1;
        reach.escudo = 20;
        reach.arma_principal = "pala del chalan";

        //uso de metodos
        masterchief.mostarInfo();
        masterchief.atacar("paco casco");
        masterchief.recargarArma(109);
        masterchief.correr(true);

        reach.mostarInfo();
        reach.atacar("pozole elite");
        reach.recargarArma(69);
        reach.correr(false);


    }
}
