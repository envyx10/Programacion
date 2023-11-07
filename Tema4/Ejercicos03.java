import java.util.Scanner;

public class Ejercicos03 {
    public static void main(String[] args) {
        
        double areaCuadrado;
        double areaTriangulo;
        double areaRectagulo;

        double altura;
        double base;
        double lado;

        int menu;

        Scanner entrada = new Scanner (System.in);

        System.out.printf("MENU \n================\n");
        System.out.println("Pulse 1 para calcular el área de un cuadrado");
        System.out.println("Pulse 2 Calcular el área de un triangulo");
        System.out.println("Pulse 3 Calcular el área de un rectangulo\n");

        System.out.println("SELECCIONE ENTRE 1 Y 3 : ");

        menu = entrada.nextInt();

        switch (menu) {

            case 1:

                System.out.println("Introduzca el lado en cm");

                lado = entrada.nextDouble();

                areaCuadrado = (lado * lado);

                System.out.printf("El area de un cuadrado es %.0f cm\u00b2" , areaCuadrado);

            
            break;

            case 2: 

                System.out.println("Introduzca el base en cm");

                base = entrada.nextDouble();
                
                System.out.println("Introduzca la altura en cm");

                altura = entrada.nextDouble();

                areaTriangulo = (base * altura / 2 );

                System.out.printf("El area de un triangulo es %.0f cm\u00b2 " , areaTriangulo);

            break;

            case 3:

                System.out.println("Introduzca el base en cm");

                base = entrada.nextDouble();
                
                System.out.println("Introduzca la altura en cm");

                altura = entrada.nextDouble();

                areaRectagulo = (base * altura );

                System.out.printf("El area de un rectangulo es %.0f cm\u00b2 " , areaRectagulo);

            break;
        









            default:
                break;
        }












    }
}
