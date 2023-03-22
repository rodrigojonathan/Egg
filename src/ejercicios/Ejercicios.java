
package ejercicios;

import java.util.Scanner;

public class Ejercicios{
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        System.out.println("Hola, Ingrese una frase por teclado");
        String frase = entrada.nextLine ();
        if (frase.equals("Eureka")) {
            System.out.println("La frase es correcta");
            
        } else {
            System.out.println("La frase es incorrecta");
        }
    }
    
}
