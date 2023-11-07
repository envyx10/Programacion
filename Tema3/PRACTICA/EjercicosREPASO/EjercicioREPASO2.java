import java.util.Scanner;

public class EjercicioREPASO2 {
    
    /*
    
        Preguntar nombre al usuario , edad , año 
        como resultado decirle hola + nombre ahora tienes tantos + años y en el + año tendrás tantos
    
    */   

    public static void main(String[] args) {
        
        final int ANYO_ACTUAL = 2023; 

        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        int anyo;
        int resultado;
    
        System.out.println("Cual es tu nombre : ");
        nombre = entrada.nextLine();

        System.out.println("Cual es tu edad : ");
        edad = entrada.nextInt();

        System.out.println("Cual es tu año de nacimiento : ");
        anyo = entrada.nextInt();

        resultado = (anyo - ANYO_ACTUAL) + edad;
        System.out.printf("hola tu nombre es %s y tienes una edad de %d y en el año %d tendras una edada de %d" , nombre, edad, anyo, resultado);









        
    }







    
}
