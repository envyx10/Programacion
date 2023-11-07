import java.util.Scanner;

public class Ejercicios01 {


    public static void main(String[] args) {

        
        int edad;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduza su edad: ");
        edad = entrada.nextInt();

        if (edad >= 18 && edad < 65 ) {
            System.out.print("Ustes es mayor de edad");
        }
        else if (edad >= 65) {
            System.out.print("usted esta jubilado");
        } 
        else {
             System.out.print(" Usted es menor de edad");
        }
     















    }




    
}
