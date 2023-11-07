import java.util.Scanner;

public class practicaSwitch {
    
    public static void main(String[] args) {
        
        int dia;

        Scanner entrada = new Scanner (System.in);

         System.out.print("Introduce el día de la semana en número: ");
         
         dia = entrada.nextInt();

        // CUANDO HACES UN CONJUNTO DE VALORES QUE VALE LO MISMO 

        switch (dia) {
            case 1: 
            case 2: 
            case 3: 
            case 4:
            case 5: System.out.println("Es un dia entre semana");
                break;
            case 6: 
            case 7: System.out.println("Es finde semana");
                break;

            default : System.out.println("error");    
        }
         

   /*   // CUANDO TIENES QUE ELEGIR ALGO EN ESPECIFICO   
        
        switch (dia) {

            case 1: System.out.println("Lunes");
                break;
            case 2: System.out.println("Martes");
                break;
            case 3: System.out.println("Miercoles");
                break;
            case 4: System.out.println("Jueves");    
                break;
            case 5: System.out.println("Viernes");
                break;
            case 6: System.out.println("sabado");
                break;
            case 7: System.out.println("domingo");
                break;

            default : System.out.println("error");    
        }
          
    */
       










    }






}
