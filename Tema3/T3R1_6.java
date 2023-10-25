import java.util.Scanner;


// Area de un triangulo - base por altura / 2
public class T3R1_6 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double resultado;
        
        System.out.println("Área de un triángulo");
        System.out.println("--------------------");

        System.out.println("Introduzca la longuitud de la base ( cm ): ");

        base = entrada.nextDouble();

        System.out.println("Introduzca la longuitud de la altura ( cm ): ");

        altura = entrada.nextDouble();

        resultado = (base*altura/2);

        System.out.printf("El área de un triangulo es de : %.3f" , resultado );
        








    }







}
