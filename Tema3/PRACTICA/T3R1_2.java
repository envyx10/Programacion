import java.util.Scanner;

public class T3R1_2{

    public static void main(String[] args) {
        

        Scanner entrada = new Scanner (System.in);

        
        int num;
        int total;

        System.out.println("Introduzca la cantidad de euros que quiere convertir: ");

        num = entrada.nextInt();

        total = (int)(num * 166.38);

        System.out.printf("%d pesetas son %d euros: " , num , total );

        












    }





}