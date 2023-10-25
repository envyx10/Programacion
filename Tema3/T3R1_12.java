import java.util.Scanner;

public class T3R1_12 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        //  Primer examen 0,76 de media T_T


        double nota1;
        double nota2;
        double deseada;
        

        System.out.println("Introduzca la nota del primer examen: ");

        nota1=entrada.nextDouble();

        System.out.println("Qué nota quiere sacar en el trimestre? ");

        deseada=entrada.nextDouble();


        nota2= (deseada - nota1) / 0.6 ;

        System.out.println("Para obtener un " + deseada + " en el trimestre necesita sacar un " + nota2 + " en el segundo examen ");

        

        





    }




    
}
