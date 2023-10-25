import java.util.Scanner;

public class T3R1_11 {
  
    public static void main(String[] args) {
        
    // multiplica el valor de tamaño de datos por 1000
    

    Scanner entrada = new Scanner (System.in);


    double mb;
    double kb;

    System.out.println("Introduzca el número de kb deseado: ");

    kb = entrada.nextDouble();
    
    mb= kb/1024;

    System.out.println(kb + "kb " + " son " + mb + " mb ");










    }






}

