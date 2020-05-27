
import java.util.Scanner;

public class TipodeTriangulo {
    public static void main (String args[]){
        
        Scanner leer = new Scanner(System.in);
        int ladoA =0;
        int ladoB =0;
        int ladoC =0;
        
        System.out.println("ingresa tu lado a: ");
        ladoA = leer.nextInt();
        System.out.println("ingresa tu lado b: ");
        ladoB = leer.nextInt();
        System.out.println("ingresa tu lado c: ");
        ladoC = leer.nextInt();
        
       // TRIANGULO EQUILATERO SUS LADOS SON IGUALES
        if( ladoA==ladoB && ladoA==ladoC){
         System.out.println("Es un triangulo EQUILATERO");
        
       // TRIANGULO ISOSCELES  DOS DE SUS LADOS SON IGUALES
        }else if(ladoA==ladoB && ladoA!=ladoC  || ladoB==ladoC && ladoB!=ladoA){
        System.out.println("Es un triangulo ISOSCELES");
         
        //TRIANGULO ESCALENO TODOS SUS LADOS SON DIFERENTES
        }else if (ladoA!=ladoB && ladoA!=ladoC){
        System.out.println("Es un triangulo ESCALENO");
    }
        
   }
}
