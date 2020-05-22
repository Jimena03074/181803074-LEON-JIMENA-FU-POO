
import java.util.Scanner;

public class Sueldo {
        public static void main (String args[]){
        
        Scanner leer=new  Scanner(System.in);
        double venta=0;
        double sueldo=0;         

        System.out.print("ingrese tu venta total: ");
        venta= leer.nextDouble();
        
            sueldo = 3000+(venta* 0.1);
            System.out.println("Su sueldo es de: " +"$" + sueldo + "  pesos");
    }   
}
