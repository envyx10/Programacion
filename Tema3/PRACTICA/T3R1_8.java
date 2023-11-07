
public class T3R1_8 {
 

    public static void main(String[] args) {

        final int eurosHora = 12;

        int horas;
        int salario;
        
        String entrada;
        
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");

        entrada = System.console().readLine();
        horas = Integer.parseInt(entrada);
    
        salario = (horas * eurosHora);

        System.out.printf("Su salario semanal es de %d euros", salario);




    }



}
