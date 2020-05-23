
import java.util.Scanner;


public class IVA {
            public static void main (String args[]){
        
        Scanner leer=new  Scanner(System.in);
        double producto=0;
        double iva=0;         

        System.out.print("ingrese el precio del producto: ");
        producto= leer.nextDouble();
        
            iva = producto*.16;
            System.out.println("el iva es: " + "$" + iva + "  pesos");
    }   
}
