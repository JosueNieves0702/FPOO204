//IMPORTACIONES
import java.util.*;
import java.beans.JavaBean;
//Clase principal
public class main1 {
    //Metodo principal
    public static void main(String[] args) throws Exception {
        /*2. cadenas de datos.
        System.out.println("Hello, World!");
        System.out.println("Mi nombre es Joaquin");
        String cadenas = "Joaquin " + "Josue " + "Moreno " + "Nieves";
        System.out.println(cadenas);
        System.out.println(cadenas.length());
        System.out.println(cadenas.substring(2, 5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0, 5));

        //3. manejo de variables
        int x= 5, x2;
        double y= 1.25;
        String z= "204", z1;
        //parceo
        x2 = Integer.parseInt(z);
        z1 = String.valueOf(y);
        
        //conversion int a double
        double asd = Double.valueOf(x);

        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);

        //conversion inplicita
        int num = 12;
        double numD = num;
        System.out.println("Conversion implicita: "+numD);

        //generamos numeros y los guardamos.
        Random rdn= new Random();
        int numeroAleatorio = rdn.nextInt();
        double numDouble = rdn.nextDouble();
        System.out.println("Aleatorio Entero: "+numeroAleatorio);
        System.out.println("Aleatoio double"+numDouble); */


        /* 
        //4. solicitud de datos
        Scanner sc = new  Scanner(System.in);

        System.out.println("Introduce cualquier dato :");
        String dato = sc.nextLine();

        System.out.println("Introduce un dato entero :");
        int datoentero = sc.nextInt();

        System.out.println("Inreoduce un dato en decimales : ");
        double datoDouble = sc.nextDouble();

        
        System.out.println("cualquier dato"+dato);

        System.out.println("Dato entero"+datoentero);
        
        System.out.println("Dato dato decimal"+datoDouble); */

        //5. Bolean, operadores logico y de comparacion.
        
        System.out.println(10>9); //true
        System.out.println(10==9); //false
        System.out.println(10<9); //false
        System.out.println(10>=9); //true
        System.out.println(10<=9); //false
        System.out.println(10!=9); //true

        int x= 3;
        System.out.println(x<5 && x>10); //AND
        System.out.println(x<5 || x>10); //OR
        System.out.println(!(x<5 && x>10)); //NOT




    }   
}
