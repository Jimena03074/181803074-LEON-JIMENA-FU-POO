
import java.util.Scanner;


public class Area {
    
   public static void main(String[] args) {
        double area;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("ingrese el lado de cuadrado");
        double a=leer.nextDouble();         
        area=a*a;
        System.out.println(area);                
     }
}