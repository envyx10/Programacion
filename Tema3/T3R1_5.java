

// Area del rectangulo = largo x ancho

import java.util.Scanner;

public class T3R1_5 {
    public static void main(String[] args) {
        
        Scanner entrada =new Scanner(System.in);

        double largo;
        double ancho;
        double area;

        System.out.println("Área de un rectangulo");
        System.out.println("---------------------");

        System.out.println("Introduzca la longuitud de la base en (cm ): " );
        largo = entrada.nextDouble();   
        
        System.out.println("Introduzca el ancho de la base en (cm ): " );
        ancho = entrada.nextDouble();
        
        area = largo*ancho;
        System.out.printf("El área del este rectangulo es: %.3f" , area);





    }
    
}
