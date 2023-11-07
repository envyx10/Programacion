import java.util.Scanner;


public class T3R1_10 {
    
    public static void main(String[] args) {
        
    // multiplica el valor de tamaño de datos por 1000
    

    Scanner entrada = new Scanner (System.in);


    double mb;
    double kb;

    System.out.println("Introduzca el número de mb deseado: ");

    mb = entrada.nextDouble();
    
    kb= mb*1024;

    System.out.println(mb + "mb " + " son " + kb + " kb ");










    }






}
