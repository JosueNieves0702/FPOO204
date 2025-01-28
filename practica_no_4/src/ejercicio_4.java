import java.util.*;

    public class ejercicio_4 {
        public static void main (String[]args) {
        
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce una palabra: ");
        
        String cadena_texto = sc.nextLine().toLowerCase();
        
        
        for (int i=0 ; i<cadena_texto.length() ; i++ ) {
            
            for (int j = cadena_texto.length() ; j>0 ; j--) {
                
                if (cadena_texto.charAt(i) == cadena_texto.charAt(j)) {
                    
                    System.out.println("La palabra es palindroma");
                    
                }
                
                else { System.out.println("La palabra no es palindroma");
                    
                }
                
            }
            
        }
    }
}