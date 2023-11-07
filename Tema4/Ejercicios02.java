import java.util.Scanner;

public class Ejercicios02 {


    public static void main(String[] args) {
        
    int mes;
    Scanner entrada = new Scanner(System.in);


    System.out.print("Introduzca el número de un mes: ");
    mes = entrada.nextInt();

    switch (mes) {

        case 1: System.out.print("Enero");
            break;
        case 2: System.out.print("Febrero");
            break;
        case 3: System.out.print("Marzo");
            break;
        case 4: System.out.print("Abril");
            break;
        case 5: System.out.print("Mayo");
            break;
        default: System.out.print("error");
            break;
    }
    }
}
