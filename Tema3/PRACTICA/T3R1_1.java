

import java.util.Scanner;

public class T3R1_1{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        int num1;
        int num2;

        int total;

        String nombre;
     

        System.out.println(" Inserte su nombre y apellidos: ");

        nombre = System.console().readLine();


        System.out.println("Este programa multiplica dos números enteros.\n");
        System.out.println("Por favor introduzca el primer número: ");

        num1 = entrada.nextInt();

        System.out.println("Introduzca el segundo número: ");
        
        num2 = entrada.nextInt();

        total = (num1 * num2);

        System.out.printf("%d x %d = %d " , num1, num2, total);







        



        










    }








}