import java.util.Scanner; 
 
public class Practica1 { 
   
    public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in); 
 
    double nota; 
 
    System.out.print("Introduce tu nota: "); 
    nota=scan.nextDouble(); 
 
    if ((nota >= 5) && (nota <=10)) { 
        System.out.println("Has aprobado."); 
    }
    else if ((nota >= 0) && (nota <5)) { 
        System.out.println("Has suspendido :(."); 
    }else { 
        System.out.println("Has introducido un valor inválido."); 
    }   
    scan.close();    

    } 
}

