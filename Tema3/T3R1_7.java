

// multiplicar el precio sin IVA por 1,21

import java.util.Scanner;

public class T3R1_7 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float num;
        float base;
        float iva;
        double total;


        System.out.printf("Introduzca la base imponible:\t ");

        num = entrada.nextFloat();
        
        System.out.println("Base imponible \t" + num + " EU ");
    
        total = (num * 1.21) ;

        System.out.println("iva \t\t" + (total - num) + " EU ");

        System.out.println("-----------------------");

        System.out.println("Total: \t\t" + total + " EU ");

        
        // preguntar tema decimales.
    








    }








}
