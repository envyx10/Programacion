import java.util.Scanner;


public class Carretera {


    public static void main(String[] args) {

        // %c -- un caracter (char)
        // %d -- números enteros (int)
        // %f -- números reales (float, double)
        // %s -- cadenas de caracteres (String)
        // %% -- símbolo del porcentaje

        /**
         * Hacer un programa que pida el total de kilómetros recorridos, el precio de la 
         * gasolina (por litro), el dinero de gasolina gastado en el viaje y el tiempo que 
         * se ha tardado (en horas y minutos), y que calcule:
         * 
         * · Consumo de gasolina (en litros y pesetas) por cada 100 kms.
         * · Consumo de gasolina (en litros y pesetas) por kilómetro.
         * · Velocidad media (en km/h y en m/s).
         */

        Scanner entrada = new Scanner (System.in);

        // definiciones
        double km;
        double precio;
        double gas;
        double tiempo;

        // totales
        double totalcien;
        double totaluno;

        System.out.println("Total de km recorridos: ");

        km = entrada.nextDouble();

        System.out.println("Pecio de la gasolina por Litro: ");
        
        precio = entrada.nextDouble();

        System.out.println("Dinero total gastado en gasolina en euros: ");

        gas = entrada.nextDouble();

        System.out.println("Tiempo tardado: ") ;
        
        tiempo = entrada.nextDouble();

        totalcien = km / precio;

        System.out.printf("has consumido %.0f litros por cada 100km : ", totalcien);




    }

    



}