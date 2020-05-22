
import java.util.Scanner;

public class Final {
   
    public static void main (String args[]){
        
        Scanner leer =  new Scanner(System.in);
        double cuesti=0, pyt=0, ayp=0;
        double porcent = 0;         

        System.out.print("ingrese la calificacion del cuestionario: ");
        cuesti = leer.nextDouble();
        System.out.print("ingrese la calificacion de de practicas y tareas: ");
        pyt = leer.nextDouble();
        System.out.print("ingrese la calificacion de asistencia y participacion: ");
        ayp = leer.nextDouble();
     

        
            porcent = (cuesti*0.04 + pyt *0.04 + ayp *0.02)*10;
            System.out.println("el porcentaje de la calificacion es: " + porcent + "%" );
    }   
}

