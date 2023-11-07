import java.util.Scanner;
import java.lang.Math;

/* Escribe un programa que reciba
 como entrada las longuitudes de los catetos a y b de un triangulo rectangulo, 
 y entregue como salida el largo de la hipotenusa c del triangulo,  */


public class EjercicioREPASO{

  public static void main(String[] args) {
    
    double a;
    double b;
    double c;
    double resultado;

    String entrada;


    System.out.println(" Inserte la cantidad del primer cateto: ");

    entrada = System.console().readLine();

    a = Double.parseDouble(entrada);

    System.out.println("Inserte el segundo cateto: ");

    entrada = System.console().readLine();

    b = Double.parseDouble(entrada) ;

    resultado = Math.hypot(a,b);
    
    System.out.printf("El resultado es:  %.2f" , resultado);

    

























  }

        





}

    
