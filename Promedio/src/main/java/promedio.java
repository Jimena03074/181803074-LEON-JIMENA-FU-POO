
import java.util.Scanner;


public class promedio {
    public static void main (String args[]){
        
        Scanner leer =  new Scanner(System.in);
        int calif1, calif2, calif3, calif4;
        int suma = 0;
        int prom = 0;         

        System.out.print("ingrese la primera calificacion");
        calif1 = leer.nextInt();
        System.out.print("ingrese la segunda calificacion");
        calif2 = leer.nextInt();
        System.out.print("ingrese la tercera calificacion");
        calif3 = leer.nextInt();
        System.out.print("ingrese la cuarta calificacion");
        calif4 = leer.nextInt();
       
        prom= (calif1+calif2+calif3+calif4)/4;
        System.out.println("promedio de las notas:"+prom );
    } 
}
