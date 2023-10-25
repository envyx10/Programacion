import java.util.Scanner;

public class T3R1_2 {
    
    // Euro = 166,3860 pesetas
    /*public static void main(String[] args) {
        
        double euros;
        double pesetas ;
        String linea;

       
        System.out.println("Introduzca el valor que quiera convertir: ");

        linea = System.console().readLine();
        euros = Integer.parseInt(linea);
        pesetas = euros * 166.3860;

        System.out.println("la converion es: " + pesetas + " pesetas");
  
    }*/


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double euros;
        double pesetas;

        System.out.println("Introduzca el valor que quiera convertir en euros: ");

        euros = entrada.nextDouble();

        pesetas = euros * 166.3860;

        System.out.println("La conversión es: " + pesetas + " pesetas");






    }




}
