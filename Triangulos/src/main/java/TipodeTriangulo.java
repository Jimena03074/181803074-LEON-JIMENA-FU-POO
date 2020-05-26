
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
        
        
        //Triangulo equilatero
        if( ladoA==ladoB && ladoA==ladoC){
         System.out.println("Es un triangulo EQUILATERO");
        
        //Angulo Isosceles
        }else if(ladoA==ladoB && ladoA!=ladoC  || ladoB==ladoC && ladoB!=ladoA){
        System.out.println("Es un triangulo ISOSCELES");
         
        //Triangulo Escaleno
        }else if (ladoA!=ladoB && ladoA!=ladoC){
        System.out.println("Es un triangulo ESCALENO");
    }
        
   }
}
