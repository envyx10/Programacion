import java.util.Scanner;

public class T3R1_1{

    /*public static void main(String[] args) {

        int num1 ;  // definimos la variable num1, esto es, le decimos a java que la variable se llama num1 y es de tipo int
        int num2 ;
        int resultado;
        String linea;

        System.out.println("Introduzca un número: ");
        
        linea = System.console().readLine();
       
        num1 = Integer.parseInt(linea);  

        System.out.println("Introduzca otro número: ");
        
        linea = System.console().readLine();

        num2 = Integer.parseInt(linea);

        resultado = num1 * num2;

        System.out.println("Su resultado es: " + resultado);

    }*/

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int resultado;

        System.out.println("Introduzca un número: ");

        num1 = entrada.nextInt();

        System.out.println("Introduzca otro número: ");

        num2 = entrada.nextInt();

        resultado = num1 * num2;

        System.out.println("Su resultado es: " + resultado);

        

        





    }

    
}
