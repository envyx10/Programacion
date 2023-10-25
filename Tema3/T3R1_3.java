import java.util.Scanner;

public class T3R1_3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double pesetas;
        double cantidad;

        System.out.println("Inserte la cantidad de pesetas que quiere convertir en euros: ");

        pesetas = entrada.nextDouble();

        cantidad = pesetas / 166.386;

        System.out.println("La conversion es un total de: " + cantidad + " euros");

        





    
    }




}
