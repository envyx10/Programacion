import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class T3R1_9 {

// volumen es igual a pi por radio al cuadrado, por la altura entre tres

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int altura;
        double radio;
        double volumen;

        System.out.println("Volumen de un cono");
        System.out.println("------------------");
        System.out.println("Introduzca la altura: ");

        altura = entrada.nextInt();

        System.out.println("Introduzca el radio: ");

        radio = entrada.nextDouble();

        volumen = (3.14159265359 * (radio*radio) * ( altura / 3) );

        System.out.println("resultado: " + volumen + " cm³ ");
        







    }


    
}
