import java.util.Scanner;

public class practica {


    public static void main(String[] args){

            Scanner entradaSC = new Scanner (System.in);

            final int NACIMIENTO = 1995;

            char uno =    'H';
            char dos =    'o';
            char tres =   'l';
            char cuatro = 'a';
      
            String hola = "" + uno + dos + tres + cuatro;
            String entrada;

            String hobby;
        

            int edad; 
            int total;

            System.out.println(hola);

            System.out.printf("Inserta tu nombre: ");

            entrada = System.console().readLine();

            System.out.printf ("Ahora tu edad: ");

            entrada = System.console().readLine();

            edad = Integer.parseInt(entrada);

            // edad = entradaSC.nextInt();

            total = edad + 20;

            System.out.printf("te llamas %s y tienes %d , naciste en el año %d y \033[1mdentro de 20 años tendrás %d \n" , entrada, edad, NACIMIENTO, total) ;
        
            System.out.print("Dime cual es tu hobby :");

            hobby = entradaSC.nextLine();
   

        

           
            





            
        











        }












}
